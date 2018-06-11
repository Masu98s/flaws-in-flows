package edfdtosimplegraph

import graph.GraphPackage
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
import eDFDFlowTracking.NamedEntity
import traceability.EDFDGraphTrace
import graph.Node
import graph.Identifiable
import traceability.GraphEndToEndTrace
import graph.GraphAsset
import eDFDFlowTracking.Value
import graph.Edge
import eDFDFlowTracking.Flow
import javax.lang.model.element.Element
import eDFDFlowTracking.Asset
import graph.NodeResponsibility
import eDFDFlowTracking.AttackerProfile

abstract class graphToEndToEndTransformation {
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
    val EDFDToGraph edfd2graph
        
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
 
      val buildFirstSubgraphRule = createRule.precondition(EDFDAssetMatcher.querySpecification).action[
    	val eDFD = it.edfd
    	val eDFDAsset = it.a
    	
    	//find the node in the whole graph
    	val node = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFD as NamedEntity).filter(Subgraphs).head
    	
    	//create a subgraph for each asset in the new graph instance
    	val subgraph = edfd2graph.endtoendgraph.createChild(graph_Subgraphs, subgraphs) as Subgraphs => [
    	]subgraph.ID = eDFDAsset.name.concat(' End-to-end')
    	
    	//create a new trace for endtoend
    	edfd2graph.createChild(EDFDToGraph_GraphEndToEndTrace, graphEndToEndTrace) => [
    		addTo(graphEndToEndTrace_GraphElements, node)
    		addTo(graphEndToEndTrace_EndtoendGraphElements, subgraph)
    	]
    	
    	//find the asset in the whole graph
    	val gasset = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAsset as NamedEntity).filter(GraphAsset).head

		//create a new copy for the endtoend
		val graph_asset = subgraph.createChild(subgraphs_Assets, graphAsset) as GraphAsset => [
			set(graphAsset_Label, gasset.label)
    	]
    	graph_asset.ID = gasset.ID

		//create a new trace for the endtoend asset
    	edfd2graph.createChild(EDFDToGraph_GraphEndToEndTrace, graphEndToEndTrace) => [
    		addTo(graphEndToEndTrace_GraphElements, gasset)
    		addTo(graphEndToEndTrace_EndtoendGraphElements, graph_asset)
    	]
    	//finally set asset as the only asset in current subgraph
    	subgraph.assets.add(graph_asset)
    	
    ].build
    
     val NodeElementRule = createRule.precondition(NodeElementsAssetsMatcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDAsset = it.a

    	//find the node in the whole graph
    	val n = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
    	println('''Mapping Graph Node: «n.name»''')

    	//find asset in the target model
    	var asset = engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset).get(0)
    	for (GraphAsset ga : engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset)){
    		if(ga.ID == eDFDAsset.name){
    			asset = ga
    		}
    	}
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer
    
    	//create a copy node in target model and append to subgraph
    	val graphNode = subgraph.createChild(subgraphs_Nodes, node) => [
    		set(node_Name, n.name)
    		//copy attacker observation of whole graph
    		set(node_AttackerObservation, n.attackerObservation)
    		//set(node_Visited, n.visited)
    		set(node_Attacker, n.attacker)
    	]

		//create a new trace for the endtoend asset
    	edfd2graph.createChild(EDFDToGraph_GraphEndToEndTrace, graphEndToEndTrace) => [
    		addTo(graphEndToEndTrace_GraphElements, n)
    		addTo(graphEndToEndTrace_EndtoendGraphElements, graphNode)
    	]
    ].build
    
    val OutFlowRule = createRule.precondition(NodeElementsAssetsMatcher.querySpecification).action[
    	val eDFDElement = it.el
    	val eDFDAsset = it.a
    	
    	//find the node in the whole graph
    	val n = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
    	println('''Mapping OutEdges to Graph Node: «n.name»''')
    	
    	//find asset in the target model
    	var asset = engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset).get(0)
    	for (GraphAsset ga : engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset)){
    		if(ga.ID == eDFDAsset.name){
    			asset = ga
    		}
    	}
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
    	//find the correct node in target model    	
    	var locate_correct_graph_node = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, n as Node).filter(Node).head
    	for (Node i : subgraph.nodes){
    		if (i.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = i
    		}
    	}
    	val correct_graph_node = locate_correct_graph_node
    	
    	for (Edge e : n.outedges){
	    	val targets = newArrayList()
	    	for(Node target : e.target){
	    		targets.add(engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, target).head)
	    	}
	    	val newgraphassets = newArrayList()
	    	for(GraphAsset ga : e.graphassets){
	    		newgraphassets.add(engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, ga).head)
	    	}

    		val new_edge = correct_graph_node.createChild(node_Outedges, edge) as Identifiable => [
    			set(edge_Source, correct_graph_node)
    			addTo(edge_Target, targets)
    			addTo(edge_Graphassets, newgraphassets)
    			set(edge_EdgeLabel, e.edgeLabel)
    		]new_edge.ID = e.ID.concat('_')+eDFDAsset.name
    			    	
			//create a new trace for the endtoend asset
	    	edfd2graph.createChild(EDFDToGraph_GraphEndToEndTrace, graphEndToEndTrace) => [
	    		addTo(graphEndToEndTrace_GraphElements, e)
	    		addTo(graphEndToEndTrace_EndtoendGraphElements, new_edge)
	    	]
    	}
    	
    ].build
    
    val InFlowRule = createRule.precondition(NodeElementsAssetsMatcher.querySpecification).action[
    	if (it.el.inflows.size>0){
	       	val eDFDElement = it.el
	       	val eDFDAsset = it.a
	    	
	    	//find the node in the whole graph
	    	val n = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDElement as NamedEntity).filter(Node).head
	    	println('''Mapping InEdges to Graph Node: «n.name»''')
	    	
	    	//find asset in the target model
	    	var asset = engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset).get(0)
	    	for (GraphAsset ga : engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset)){
	    		if(ga.ID == eDFDAsset.name){
	    			asset = ga
	    		}
	    	}
	    	
	    	//find subgraph in target model
	    	val subgraph = asset.eContainer as Subgraphs
	    	//find the correct node in target model    	
	    	var locate_correct_graph_node = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, n as Node).filter(Node).head
	    	for (Node i : subgraph.nodes){
	    		if (i.name == locate_correct_graph_node.name){
	    			locate_correct_graph_node = i
	    		}
	    	}
	    	val correct_graph_node = locate_correct_graph_node
	    
	    	for (Edge e : n.inedges){
	    		//find existing edge intarget model
	    		val existingEdge = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, e as Edge).filter(Edge).head
	    		correct_graph_node.inedges.add(existingEdge)
	    	}
	    	  		
    	}

    ].build
    
    val ProcessResponsibilitiesRule = createRule.precondition(ProcessElementsAssetsMatcher.querySpecification).action[
		val eDFDProcess = it.p
    	val eDFDAsset = it.a
    	
    	//find the node in the whole graph
    	val n = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDProcess as NamedEntity).filter(Node).head
    	println('''Mapping InEdges to Graph Node: «n.name»''')
    	
    	//find asset in the target model
    	var asset = engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset).get(0)
    	for (GraphAsset ga : engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset)){
    		if(ga.ID == eDFDAsset.name){
    			asset = ga
    		}
    	}
    	
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
    	//find the correct node in target model    	
    	var locate_correct_graph_node = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, n as Node).filter(Node).head
    	for (Node i : subgraph.nodes){
    		if (i.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = i
    		}
    	}
    	val correct_graph_node = locate_correct_graph_node
    	
    	for (NodeResponsibility nr : n.responsibility){
    		println('''Mapping Node Responsibility: «nr»''')
    		
    		val newincomingassets  = newArrayList()
    		for (GraphAsset ga : nr.incomingassets){
    			newincomingassets.add(engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, ga as GraphAsset).head)
    		}
    		val newoutgoingassets = newArrayList()
    		for (GraphAsset ga : nr.outgoingassets){
    			newoutgoingassets.add(engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, ga as GraphAsset).head)
    		}
    		
	    	//create new child of that node (node contains responsibilities)
	    	val new_responsibility = correct_graph_node.createChild(node_Responsibility, nodeResponsibility) as Identifiable => [
	    		//set incoming assets
	    		addTo(nodeResponsibility_Incomingassets, newincomingassets)
	    		//set outgoing assets
				addTo(nodeResponsibility_Outgoingassets, newoutgoingassets)
	    		//set operations
	    		addTo(nodeResponsibility_Operation, nr.operation)
	    	]new_responsibility.ID = eDFDProcess.name.concat(nr.operation.toString.concat('_')+eDFDAsset.name)

			//create a new trace for the endtoend asset
	    	edfd2graph.createChild(EDFDToGraph_GraphEndToEndTrace, graphEndToEndTrace) => [
	    		addTo(graphEndToEndTrace_GraphElements, nr)
	    		addTo(graphEndToEndTrace_EndtoendGraphElements, new_responsibility)
	    	]
    	}
    	
    	
 	
    ].build


    val ModifyAsset = createRule.precondition(EDFDAssetMatcher.querySpecification).action[
    	val eDFDAsset = it.a
    	val eDFDAssetSource = eDFDAsset.source //reference to one element
    	val eDFDAssetTargets = eDFDAsset.targets //list of references to elements
    	
    	println('''Setting asset source and targets : «eDFDAsset.name»''')
    	//find asset in the target model
    	var asset = engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset).get(0)
    	for (GraphAsset ga : engine.graph2EndToEnd.allValuesOfendtoendElements.filter(GraphAsset)){
    		if(ga.ID == eDFDAsset.name){
    			asset = ga
    		}
    	}
    	//find subgraph in target model
    	val subgraph = asset.eContainer as Subgraphs
    
		//find the node of source in the whole graph
    	val n = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, eDFDAssetSource as NamedEntity).filter(Node).head
    	//find the correct node in target model    	
    	var locate_correct_graph_node = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, n as Node).filter(Node).head
    	for (Node i : subgraph.nodes){
    		if (i.name == locate_correct_graph_node.name){
    			locate_correct_graph_node = i
    		}
    	}
    	val correct_graph_node = locate_correct_graph_node	
    	asset.source = correct_graph_node 

	   	
	   	//find and add the target graph nodes
    	for (NamedEntity e : eDFDAssetTargets){
			//find the node in the whole graph
	    	val m = engine.edfd2simplegraph.getAllValuesOfgraphElements(null, null, e as NamedEntity).filter(Node).head
	    	//find the correct node in target model    	
	    	var locate_correct_node = engine.graph2EndToEnd.getAllValuesOfendtoendElements(null, null, m as Node).filter(Node).head	    	
	    	for (Node i : subgraph.nodes){
	    		if (i.name == locate_correct_node.name){
	    			locate_correct_node = i
	    		}
	    	}
	    	val correct_node = locate_correct_node	
	    	asset.targets.add(correct_node)
    	} 
    ].build
 

    public def execute() {

    	println('''Executing transformation from graph to end-to-end graph: «edfd2graph.edfds.name»''')
		edfd2graph.endtoendgraph.subgraphs.clear
		edfd2graph.graphEndToEndTrace.clear
		
		buildFirstSubgraphRule.fireAllCurrent
		NodeElementRule.fireAllCurrent
		OutFlowRule.fireAllCurrent
		InFlowRule.fireAllCurrent
		ProcessResponsibilitiesRule.fireAllCurrent
		//not necessary, because I already copy that when copying Nodes
		//TBRule.fireAllCurrent	
		
		ModifyAsset.fireAllCurrent
		
    }
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
}
