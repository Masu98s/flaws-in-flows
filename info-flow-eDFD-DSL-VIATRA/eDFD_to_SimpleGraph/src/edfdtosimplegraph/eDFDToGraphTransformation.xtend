package edfdtosimplegraph


import edfdtosimplegraph.EDFD
import org.secdfd.model.Asset
import org.secdfd.model.AttackerProfile
import org.secdfd.model.Element
import org.secdfd.model.Flow
import org.secdfd.model.NamedEntity
import org.secdfd.model.Responsibility
import org.secdfd.model.Value
import graph.Edge
import graph.GraphAsset
import graph.GraphPackage
import graph.Identifiable
import graph.Node
import graph.NodeResponsibility
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import traceability.EDFDToGraph
import traceability.TraceabilityPackage
import graph.Subgraphs
import java.util.Collections

class eDFDToGraphTransformation {
	/** VIATRA Query Pattern group **/
	val extension EDFDXformM2M edfdxformm2m = EDFDXformM2M.instance

	/** EMF metamodels **/
	val extension TraceabilityPackage trPackage = TraceabilityPackage.eINSTANCE
	val extension GraphPackage graphPackage = GraphPackage.eINSTANCE
	
    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    protected Resource resource
    //protected BatchTransformationRule<?,?> exampleRule
    var EDFDToGraph edfd2graph
        
    new(EDFDToGraph edfd2graph, ViatraQueryEngine engine){
    	this.edfd2graph = edfd2graph
    	resource = edfd2graph.graphs.eResource
    	this.engine = engine
    	prepare(engine)
    	createTransformation
    }
	

    private def createTransformation() {
        //Create VIATRA model manipulations
        this.manipulation = new SimpleModelManipulations(engine)
        //Create VIATRA Batch transformation
        transformation = BatchTransformation.forEngine(engine)
        .build
        //Initialize batch transformation statements
        statements = transformation.transformationStatements
    }

/*
 * user defined transformation rules
 */
 
     val buildFirstSubgraphRule = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
    	val eDFD = it.edfd
    	
 		val graph = edfd2graph.graphs.createChild(graph_Subgraphs, subgraphs) => [
 			//set all graph nodes later once they are transformed
 			//set all graph assets later
 		]
 		
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFD)
    		addTo(EDFDGraphTrace_GraphElements, graph)
    	]
    	
    ].build

    val eDFDNodeElementRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDElementName = eDFDElement.name
    	val eDFD = eDFDElement.eContainer

    	println('''Mapping eDFD Node element with Graph Nodes: «eDFDElementName»''')
    	
    	//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
    
    	val graphNode = subgraph.createChild(subgraphs_Nodes, node) => [
    		set(node_Name, eDFDElementName)
    		//set default attacker observation to -1 -> has not been set
    		set(node_AttackerObservation, -1)
    		//set if the node is malicious
    		//set(node_Attacker, eDFDElement.attacker)
    	]
    	
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDElement)
    		addTo(EDFDGraphTrace_GraphElements, graphNode)
    	]
    ].build
    
    val eDFDNodeAttackerZoneRule = createRule.precondition(Boundaries.Matcher.querySpecification).action[
    	val eDFDBoundary = it.tb
    	
		//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.edfd as NamedEntity).filter(Subgraphs).head
    	
    	for (Element el : eDFDBoundary.elements){
    		//find this node in target graph
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, el as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
    		
    		//set that it can be malicious
    		correct_graph_node.attacker = true
    	}
    	
    ].build
    
    val eDFDOutFlowRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDElementName = eDFDElement.name
    	val eDFDOutgoingFlows = eDFDElement.outflows //list of flows

    	println('''Adding outgoing flows to node: «eDFDElementName»''')
  	
    	//find subgraph in target model (the only one)
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
    	
    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}
    	val correct_graph_node = locate_correct_graph_node
    	
      	//create outgoing flows and link them to the nodes
    	for (Flow fl : eDFDOutgoingFlows){
	    	val targets = newArrayList()
	    	for(Element target : fl.target){
	    		val t = target as NamedEntity
	    		targets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(Node).head)
	    	}
	
    		//find assets in target model
	    	val graphassets = newArrayList()
	    	for(Asset edfdasset : fl.assets){
	    		graphassets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, edfdasset as NamedEntity).filter(GraphAsset).head)
	    	}
	  		
			//create new child of that node
	    	val graphEdge = correct_graph_node.createChild(node_Outedges, edge) as Identifiable => [
	    		//set the source as this node
	    		set(edge_Source, correct_graph_node)
	    		//set the target as the list of found references to other nodes
	    		addTo(edge_Target, targets)
	    		//add reference to all the assets
	    		addTo(edge_Graphassets, graphassets)
	    	]
	    	//concat the asset name to differentiate between subgraph elements
	    	graphEdge.ID = fl.name	    		
	    	//set the number of flow
	    	graphEdge.number = fl.number
	    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
	    		addTo(EDFDGraphTrace_EdfdElements, fl)
	    		addTo(EDFDGraphTrace_GraphElements, graphEdge)
	    	]
    	} 
    	
    ].build
    
    
    val eDFDInFlowRule = createRule.precondition(NodeElements.Matcher.querySpecification).action[
    	if (it.el.inflows.size>0){
	       	val eDFDElement = it.el
	    	val eDFDElementName = eDFDElement.name
	    	val eDFDIncomingFlows = eDFDElement.inflows //list of references
	    	
	    	println('''Adding ref to incoming edges to node: «eDFDElementName»''')
	  	
	    	//find subgraph in target model (the only one)
	    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	    	
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
	    
	    	
	    	for(Flow fl : eDFDIncomingFlows){
	    		//find existing edge
	    		val existingEdge = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, fl).filter(Edge).head
	    		
	    		//add it to the incoming edges 
	    		correct_graph_node.inedges.add(existingEdge)
	    	}    		
    	}

    ].build
 
    
    val eDFDAssetRule = createRule.precondition(Assets.Matcher.querySpecification).action[
    	val eDFDAsset = it.a
    	val eDFDAssetValues = eDFDAsset.value
    	val eDFD = eDFDAsset.eContainer
		
		println('''Mapping eDFD Asset with GraphAsset: «eDFDAsset.name»''')
		
    	//find subgraph in target model
    	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
    	
		val gA = subgraph.createChild(subgraphs_Assets, graphAsset) as GraphAsset => [
	    	var confidential = false
	    	for (Value av : eDFDAssetValues){
	    		//if there is any confidentiality values then the label is secret
	    		if (av.objective.toString == 'Confidentiality'){
	    			confidential = true
	    		}//otherwise its public
	    	}
	    	//set label
	    	if (confidential==true){
	    		// 1 means secret
	    		set(graphAsset_Label, 1)
	    	}else{
	    		// 0 means public
	    		set(graphAsset_Label, 0)
	    	}
    	]
    	gA.ID = eDFDAsset.name

    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDAsset)
    		addTo(EDFDGraphTrace_GraphElements, gA)
    	]
		
    ].build 
   
   
    val eDFDProcessResponsibilitiesRule = createRule.precondition(Responsibilities.Matcher.querySpecification).action[
    	val eDFDResponsibility = it.r
    	val eDFDResponsibilityProcess = eDFDResponsibility.process as NamedEntity
    	val eDFDIncomingAssets = eDFDResponsibility.incomeassets
    	val eDFDOutgoingAssets = eDFDResponsibility.outcomeassets
    	val eDFDResponsibilityActions = eDFDResponsibility.action
    	
    	println('''Mapping eDFD Responsibility with Graph NodeResponsibility: «eDFDResponsibilityProcess.name»''')
    	
    	//find target process node (in graph)
    	val node_of_process = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDResponsibilityProcess).filter(Node).head
    	
   		//find incoming assets (in graph)
   		val incomingassets_of_process  = newArrayList()
   		for (Asset s : eDFDIncomingAssets){
   			val o = s as NamedEntity
   			incomingassets_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(GraphAsset).head)
   		}
   		//find outgoing assets (in graph)
   		val outgoingassets_of_process  = newArrayList()
   		for (Asset s : eDFDOutgoingAssets){
   			val o = s as NamedEntity
   			outgoingassets_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(GraphAsset).head)
   		}

    	//create new child of that node (node contains responsibilities)
    	val graphResponsibility = node_of_process.createChild(node_Responsibility, nodeResponsibility) as Identifiable => [
    		//set incoming assets
    		addTo(nodeResponsibility_Incomingassets, incomingassets_of_process)
    		//set outgoing assets
			addTo(nodeResponsibility_Outgoingassets, outgoingassets_of_process)
    		//set operations
    		addTo(nodeResponsibility_Operation, eDFDResponsibilityActions)
    	]
    	graphResponsibility.ID = eDFDResponsibilityProcess.name.concat(eDFDResponsibilityActions.toString).concat(eDFDResponsibility.incomeassets.toString)
    	
    	edfd2graph.createChild(EDFDToGraph_EdfdGraphTraces, EDFDGraphTrace) => [
    		addTo(EDFDGraphTrace_EdfdElements, eDFDResponsibility)
    		addTo(EDFDGraphTrace_GraphElements, graphResponsibility)
    	] 
    	
    ].build
     
 
    val eDFDProcessRule = createRule.precondition(ProcessElements.Matcher.querySpecification).action[
    	val eDFDProcess = it.p
    	val eDFDProcessOutgoingFlows = eDFDProcess.outflows
    	val eDFDProcessName = eDFDProcess.name
    	val eDFDProcessResponsibilities = eDFDProcess.responsibility
    	    	
    	println('''Mapping Process properties with Graph Node: «eDFDProcessName»''')
    	
    	//find target process node (in graph)
   		val node_of_process = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDProcess).filter(Node).head
   		//find target outgoing edges (in graph)
   		val outgoingflows = newArrayList()
    	for(Flow f : eDFDProcessOutgoingFlows){
    		val o = f as NamedEntity
    		outgoingflows.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(Edge).head)
    	}

   		//connect them in the graph
   		node_of_process.outedges.addAll(outgoingflows)
   		
   		//find target process responsibilities (in graph)
   		val responsibilities_of_process  = newArrayList()
   		for (Responsibility r : eDFDProcessResponsibilities){
   			val o = r as NamedEntity
   			responsibilities_of_process.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, o).filter(NodeResponsibility).head)
   		}
   		
   		//set the responsibilities in the graph
   		node_of_process.responsibility.addAll(responsibilities_of_process) 
    	 
    ].build
    

    val eDFDTBRule = createRule.precondition(BoundariesAssets.Matcher.querySpecification).action[
	    /*
		 * attacker profile from eDFD to graph -> attacker profiles are related to trust zones/subzones which are related to a group of elements. 
		 * if the attacker profile has skill level: -1 (default; not set), 0 (she can neither read/modify info here), 1 (she can intercept/read info here), 2 (she can tamper with it), ...
		 * attacker observation in graph is an attribute of Node
		 */
    	val eDFDTB  = it.tb
    	val eDFDAsset = it.a
    	val eDFDElementsInBoundary = eDFDTB.elements
    	val eDFDAttackerProfilesForBoundary = eDFDTB.attackerprofile
    	
    	println('''Setting attacker observations to Graph Node: «eDFDTB.name»''')
    	
    	//find asset in target model
    	val asset = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAsset as NamedEntity).filter(GraphAsset).head
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
	    	   	
    	for (Element e : eDFDElementsInBoundary){
	    	var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, e as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
	   		
	   		for (AttackerProfile ap : eDFDAttackerProfilesForBoundary){
	   			val attacker_observation_skill = ap.observation
	   			if(attacker_observation_skill> correct_graph_node.attackerObservation){
	   				//the attacker is more powerful -> always take the max observation power
	   				correct_graph_node.attackerObservation = attacker_observation_skill
	   			}
	   		}
	   		
    	}
   		
    ].build
    
    val eDFDModifyAsset = createRule.precondition(edfdtosimplegraph.EDFDAsset.Matcher.querySpecification).action[
    	val eDFDAsset = it.a
    	val eDFDAssetSource = eDFDAsset.source //reference to one element
    	val eDFDAssetTargets = eDFDAsset.targets //list of references to elements
    	
    	println('''Setting asset source and targets : «eDFDAsset.name»''')
    	
    	//find asset in target model
    	val asset = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAsset as NamedEntity).filter(GraphAsset).head
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
	    
	    //find and add the source graph node
		var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAssetSource as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}	
    	asset.source = locate_correct_graph_node
	   
	   	//find and add the target graph nodes
    	for (Element e : eDFDAssetTargets){
	    	locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, e as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}
	    	asset.targets.add(locate_correct_graph_node)
    	}
    ].build
    
    
 	val eDFDToOneGraphRule = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
 		val eDFD = it.edfd
 		val eDFDAllElements = eDFD.elements
 		val eDFDAllAssets = eDFD.asset
 		
 		//find subgraph in target model
 		val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
 		
 		//find graph nodes in target model
 		val graph_nodes = newArrayList()
    	for(Element el : eDFDAllElements){
    		val t = el as NamedEntity
    		graph_nodes.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(Node).head)
    	}
  		//find graph assets in target model
 		val graph_assets = newArrayList()
    	for(Asset a : eDFDAllAssets){
    		val t = a as NamedEntity
    		graph_assets.add(engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, t).filter(GraphAsset).head)
    	}
 		
 		subgraph.nodes.addAll(graph_nodes)
 		subgraph.assets.addAll(graph_assets)

 	].build
 	
 	
    val initLabels = createRule.precondition(edfdtosimplegraph.EEandDSElement.Matcher.querySpecification).action[
    	print('''Inferring labels for: «it.el.name»''')
    	
    	//find subgraph in target model
      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
       	// get the node of EE or DS
		var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.el as NamedEntity).filter(Node).head
    	for (Node n : subgraph.nodes){
    		if (n.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = n
    		}
    	}
  	
    	// set the nodes of the outgoing flows only
    	for (Edge e : locate_correct_graph_node.outedges){
    	// for each set label according to the most restrictive asset on the flow
    		e.visited = true
    		var setlabel = -1 // not set
    		for (GraphAsset gs: e.graphassets){
    			if (gs.label > setlabel)
    				setlabel = gs.label
    		}
    		e.edgeLabel = setlabel
    		print(''' to «e.edgeLabel»''')
    		println()
    	}

    ].build
    
    def Boolean recursiveDFS (Node node){ 
    	//exit when all nodes have been visited
		if (node.visited == false){
			//mark node
			node.visited = true
			val neighbor_nodes  = newArrayList()
			for (Edge outgoing : node.outedges){
				outgoing.visited = true
				//println(outgoing.ID)
				for (GraphAsset ga : outgoing.graphassets){
				//for each asset, collect what kind of responsibility they are part of in the node
					var r = newArrayList()
					for (NodeResponsibility noder : node.responsibility){
						if (noder.outgoingassets.contains(ga)) r.add(noder)
					}
					//go through these responsibilities
					for (NodeResponsibility nr : r){
						switch(nr.operation.toString){
							case "[EncryptOrHash]":{
								//set low output
								outgoing.edgeLabel = 0
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for ecrypting asset:«ga.ID»''')
								println()
							}
							case "[Decrypt]": {
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								//set high output if the most sensitive asset being decrypted was high before
								if (most_restrictive ==	1){
									outgoing.edgeLabel = 1
								}else{
									//if sth low is decrypted it remains low
									outgoing.edgeLabel = 0
								}
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for decrypting asset:«ga.ID»''')
								println()
							}
							//Comparator, Joiner, User => the same propagation
							case "[Comparator]":{
								//join labels (most restrictive input to node responsibility)
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for comparing asset:«ga.ID»''')
								println()
							}
							case "[Joiner]":{
								//join labels (most restrictive input to node responsibility
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for joining asset:«ga.ID»''')
								println()
							}
							//splitter should be included (substring), to remain conservative
							case "[Splitter]":{
								//join labels (most restrictive input to node responsibility)
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for spliting asset:«ga.ID»''')
								println()
							}
							case "[User]":{
								//join labels (most restrictive input to node responsibility
								var most_restrictive = -1
								for (GraphAsset i : nr.incomingassets){
									if	(i.label > most_restrictive) most_restrictive = i.label
								}
								outgoing.edgeLabel = most_restrictive
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for using asset:«ga.ID»''')
								println()
							}	
							//Copier and Forward => the same								
							case "[Copier]":{
								//copy labels (add semantic constraint - all assets in one copy responsibility must have the same label)
								outgoing.edgeLabel = nr.incomingassets.get(0).label			
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for copying asset:«ga.ID»''')
								println()		
							}
							case "[Forward]":{
								//copy labels (add semantic constraint - all assets in one forward responsibility must have the same label)
								outgoing.edgeLabel = nr.incomingassets.get(0).label	
								print('''Label propagation of edge «outgoing.ID»''')
								print(''' is «outgoing.edgeLabel»''')
								print(''' for forwarding asset:«ga.ID»''')
								println()
							} 
							//case "[Discarder]":
							//case "[Verifier]":					
							//case "[Authenticator]":
							//case "[Authoriser]":
							//case "[Store]":
							default :{
								print(nr.operation.toString)
								print("Does not effect confidentiality label propagation.")
								println()		
							}
						}
					}
				}
				//if the outgoing flow was not labeled by now 
					// -> the default action is to copy the label of the incoming flow that contains the asset(s) on the outgoing flows
				if (outgoing.edgeLabel == -1){
					//var setlabel = -1 // not set
					var edgecontainingassets = node.inedges.get(0)
					for (Edge e : node.inedges){
						if (e.graphassets.containsAll(outgoing.graphassets))
							edgecontainingassets = e
					}
					
		    		/*for (GraphAsset gs: outgoing.graphassets){
		    			if (gs.label > setlabel)
		    				setlabel = gs.label	
		    		}*/
		    		outgoing.edgeLabel = edgecontainingassets.edgeLabel
					print('''Label inferred for edge «outgoing.ID»''')
					print(''' to «outgoing.edgeLabel»''')
					print(''' since no label propagation rules apply to this edge.''')
					println()
				}
    			//collect target nodes				
    			neighbor_nodes.addAll(outgoing.target)
			}

    		
    		for (Node neighbor : neighbor_nodes){
    			//recursive call for other edges of the same node
    			println('''...Next target: «neighbor.name»''')
    		    recursiveDFS(neighbor)	
    		}
    		return true
		}
		return true 
    }
    
    val propagateLabelsDS = createRule.precondition(edfdtosimplegraph.DSElements.Matcher.querySpecification).action[
    	//TODO new pattern for finding EE/DS with at least one outgoing flow in VIATRA
    	//- currently will only work correctly for 1 EE(or DS)
    	if (it.ds.outflows.length > 0){	
	    	//find subgraph in target model
	      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	       	// get the node of EE
			var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.ds as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}	    	
	    	println()
	    	println('''Starting propagation at: «it.ds.name»''')  
	    	recursiveDFS(locate_correct_graph_node) 
    	}
    ].build 
    
    val propagateLabelsEE = createRule.precondition(edfdtosimplegraph.EEElements.Matcher.querySpecification).action[
    	//TODO new pattern for finding EE/DS with at least one outgoing flow in VIATRA
    	//- currently will only work correctly for 1 EE(or DS)
    	if (it.ee.outflows.length > 0){	
	    	//find subgraph in target model
	      	val subgraph = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, null).filter(Subgraphs).head
	       	// get the node of EE
			var locate_correct_graph_node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, it.ee as NamedEntity).filter(Node).head
	    	for (Node n : subgraph.nodes){
	    		if (n.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = n
	    		}
	    	}	    	
	    	println()
	    	println('''Starting propagation at: «it.ee.name»''')  
	    	recursiveDFS(locate_correct_graph_node) 
    	}
    ].build 
    
    val propagateLabelsInOrder = createRule.precondition(edfdtosimplegraph.EDFD.Matcher.querySpecification).action[
    	val all_elements = it.edfd.elements
			
    	//print(all_elements)
    	val all_flows = newArrayList()
    	for (Element e : all_elements){
			all_flows.addAll(e.outflows)
    	}
		Collections.sort(all_flows) [ a, b |
		  a.number - b.number
		]
    	for (Element f : all_flows){
    		var outgoing = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, f as NamedEntity).filter(Edge).head
			var node = outgoing.source
			outgoing.visited = true
			for (GraphAsset ga : outgoing.graphassets){
			//for each asset, collect what kind of responsibility they are part of in the node
				var r = newArrayList()
				for (NodeResponsibility noder : node.responsibility){
					if (noder.outgoingassets.contains(ga)) r.add(noder)
				}
				//go through responsibilities
				for (NodeResponsibility nr : r){
					switch(nr.operation.toString){
						case "[EncryptOrHash]":{
							//set low output
//							outgoing.edgeLabel = 0
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for ecrypting asset:«ga.ID»''')
//							println()
						}
						case "[Decrypt]": {
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							
							/*
							//set high output if the most sensitive asset being decrypted was high before
							if (most_restrictive ==	1){
								outgoing.edgeLabel = 1
							}else{
								//if sth low is decrypted it remains low
								outgoing.edgeLabel = 0
							} */
							
							outgoing.edgeLabel = 1
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for decrypting asset:«ga.ID»''')
//							println()
						}
						//Comparator, Joiner, User => the same propagation
						case "[Comparator]":{
							//join labels (most restrictive input to node responsibility)
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for comparing asset:«ga.ID»''')
//							println()
						}
						case "[Joiner]":{
							//join labels (most restrictive input to node responsibility
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for joining asset:«ga.ID»''')
//							println()
						}
						//splitter should be included (substring), to remain conservative
						case "[Splitter]":{
							//join labels (most restrictive input to node responsibility
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for spliting asset:«ga.ID»''')
//							println()
						}
						case "[User]":{
							//join labels (most restrictive input to node responsibility)
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for using asset:«ga.ID»''')
//							println()
						}	
						//Copier and Forward => the same								
						case "[Copier]":{
							//copy labels (add semantic constraint - all assets in one copy responsibility must have the same label)
							outgoing.edgeLabel = nr.incomingassets.get(0).label			
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for copying asset:«ga.ID»''')
//							println()		
						}
						case "[Forward]":{
							//copy labels (add semantic constraint - all assets in one forward responsibility must have the same label)
							outgoing.edgeLabel = nr.incomingassets.get(0).label	
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for forwarding asset:«ga.ID»''')
//							println()
						}
						case "[Store]":{
							//most restrictive stored asset
							var most_restrictive = -1
							for (GraphAsset i : nr.incomingassets){
								if	(i.label > most_restrictive) most_restrictive = i.label
							}
							outgoing.edgeLabel = most_restrictive
//							print('''Label propagation of edge «outgoing.ID», «outgoing.number»''')
//							print(''' is «outgoing.edgeLabel»''')
//							print(''' for using asset:«ga.ID»''')
//							println()
						}
						//case "[Discarder]":
						//case "[Verifier]":					
						//case "[Authenticator]":
						//case "[Authoriser]":
						default :{
							print(nr.operation.toString)
							print("Does not effect confidentiality label propagation.")
							println()		
						}
					}
				}
				
				//if the flow has no connected responsibility, inferr the label from the most restrictive asset
				if (outgoing.edgeLabel == -1){
					var most_restrictive = -1
						for (GraphAsset i : outgoing.graphassets){
							if	(i.label > most_restrictive) most_restrictive = i.label
						}
					outgoing.edgeLabel = most_restrictive
					print('''Label inferred for edge «outgoing.ID»''')
					print(''' to «outgoing.edgeLabel»''')
					print(''' since no label propagation rules apply to this edge.''')
					println()
				}
				
				print(f.number)
				print(''': ''')
				print(outgoing.edgeLabel)
				println()
			}
    	}
    	
    	
    ].build
 

    public def execute() {

    	println('''Executing transformation on entire eDFD: «edfd2graph.edfds.name»''')
		edfd2graph.graphs.subgraphs.clear
		edfd2graph.edfdGraphTraces.clear
		edfd2graph.graphEndToEndTrace.clear
		
		buildFirstSubgraphRule.fireAllCurrent
		//fire the rules for assets
		eDFDAssetRule.fireAllCurrent
		//fire the rules for nodes and edges
		eDFDNodeElementRule.fireAllCurrent
		eDFDNodeAttackerZoneRule.fireAllCurrent
		eDFDOutFlowRule.fireAllCurrent
		eDFDInFlowRule.fireAllCurrent

		//fire the rules for responsibilities
		eDFDProcessResponsibilitiesRule.fireAllCurrent
		//fire the rules for processes
		eDFDProcessRule.fireAllCurrent
		//attacker observation
		eDFDTBRule.fireAllCurrent
		
		//add asset source and targets (as in end-to-end)
		eDFDModifyAsset.fireAllCurrent

		//execute to create one graph
		eDFDToOneGraphRule.fireAllCurrent
		
		
		//initialize labels
		initLabels.fireAllCurrent
		//propagate on the entire graph
		
		//propagateLabelsDS.fireAllCurrent 
		propagateLabelsInOrder.fireAllCurrent
		
    }
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
}
