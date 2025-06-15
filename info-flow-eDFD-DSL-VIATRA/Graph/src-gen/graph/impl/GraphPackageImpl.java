/**
 */
package graph.impl;

import org.secdfd.model.ModelPackage;

import org.secdfd.model.impl.ModelPackageImpl;

import graph.Edge;
import graph.Graph;
import graph.GraphAsset;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Identifiable;
import graph.Node;
import graph.NodeResponsibility;
import graph.Subgraphs;

import graph.util.GraphValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphPackageImpl extends EPackageImpl implements GraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeResponsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see graph.GraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphPackageImpl() {
		super(eNS_URI, GraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphPackage init() {
		if (isInited)
			return (GraphPackage) EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphPackageImpl theGraphPackage = registeredGraphPackage instanceof GraphPackageImpl
				? (GraphPackageImpl) registeredGraphPackage
				: new GraphPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theEDFDFlowTrackingPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
				? registeredPackage
				: ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphPackage.createPackageContents();
		theEDFDFlowTrackingPackage.createPackageContents();

		// Initialize created meta-data
		theGraphPackage.initializePackageContents();
		theEDFDFlowTrackingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theGraphPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return GraphValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theGraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphPackage.eNS_URI, theGraphPackage);
		return theGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Target() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Source() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_EdgeLabel() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Graphassets() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Visited() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiable_ID() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiable_Number() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphAsset() {
		return graphAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphAsset_Label() {
		return (EAttribute) graphAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphAsset_Source() {
		return (EReference) graphAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphAsset_Targets() {
		return (EReference) graphAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphAsset_Encrypted() {
		return (EAttribute) graphAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Outedges() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Responsibility() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_AttackerObservation() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Visited() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Inedges() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Attacker() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CopierSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__VerifierSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__BusinessSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__EncryptSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__JoinerSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__DecryptSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__StoreSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__ComparatorSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__DiscarderSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AttackerObservationViolation__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__SplitterSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__ForwardSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AuthenticatorSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__UserSemanticConstraint__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubgraphs() {
		return subgraphsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphs_Nodes() {
		return (EReference) subgraphsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphs_Assets() {
		return (EReference) subgraphsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeResponsibility() {
		return nodeResponsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeResponsibility_Operation() {
		return (EAttribute) nodeResponsibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeResponsibility_Outgoingassets() {
		return (EReference) nodeResponsibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeResponsibility_Incomingassets() {
		return (EReference) nodeResponsibilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNodeResponsibility__FindMostRestrictiveLabel() {
		return nodeResponsibilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNodeResponsibility__FindLeastRestrictiveLabel() {
		return nodeResponsibilityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Subgraphs() {
		return (EReference) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphFactory getGraphFactory() {
		return (GraphFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__TARGET);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEAttribute(edgeEClass, EDGE__EDGE_LABEL);
		createEReference(edgeEClass, EDGE__GRAPHASSETS);
		createEAttribute(edgeEClass, EDGE__VISITED);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__NUMBER);

		graphAssetEClass = createEClass(GRAPH_ASSET);
		createEAttribute(graphAssetEClass, GRAPH_ASSET__LABEL);
		createEReference(graphAssetEClass, GRAPH_ASSET__SOURCE);
		createEReference(graphAssetEClass, GRAPH_ASSET__TARGETS);
		createEAttribute(graphAssetEClass, GRAPH_ASSET__ENCRYPTED);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTEDGES);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__RESPONSIBILITY);
		createEAttribute(nodeEClass, NODE__ATTACKER_OBSERVATION);
		createEAttribute(nodeEClass, NODE__VISITED);
		createEReference(nodeEClass, NODE__INEDGES);
		createEAttribute(nodeEClass, NODE__ATTACKER);
		createEOperation(nodeEClass, NODE___COPIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___VERIFIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___BUSINESS_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___ENCRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___JOINER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___DECRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___STORE_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___COMPARATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___DISCARDER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___ATTACKER_OBSERVATION_VIOLATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___SPLITTER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___FORWARD_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___AUTHENTICATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(nodeEClass, NODE___USER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		subgraphsEClass = createEClass(SUBGRAPHS);
		createEReference(subgraphsEClass, SUBGRAPHS__NODES);
		createEReference(subgraphsEClass, SUBGRAPHS__ASSETS);

		nodeResponsibilityEClass = createEClass(NODE_RESPONSIBILITY);
		createEAttribute(nodeResponsibilityEClass, NODE_RESPONSIBILITY__OPERATION);
		createEReference(nodeResponsibilityEClass, NODE_RESPONSIBILITY__OUTGOINGASSETS);
		createEReference(nodeResponsibilityEClass, NODE_RESPONSIBILITY__INCOMINGASSETS);
		createEOperation(nodeResponsibilityEClass, NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL);
		createEOperation(nodeResponsibilityEClass, NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__SUBGRAPHS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theEDFDFlowTrackingPackage = (ModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edgeEClass.getESuperTypes().add(this.getIdentifiable());
		graphAssetEClass.getESuperTypes().add(this.getIdentifiable());
		nodeEClass.getESuperTypes().add(this.getIdentifiable());
		subgraphsEClass.getESuperTypes().add(this.getIdentifiable());
		nodeResponsibilityEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Target(), this.getNode(), null, "target", null, 0, -1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEdge_Source(), this.getNode(), null, "source", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEdge_EdgeLabel(), ecorePackage.getEInt(), "EdgeLabel", "-1", 1, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Graphassets(), this.getGraphAsset(), null, "graphassets", null, 0, -1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Visited(), ecorePackage.getEBoolean(), "visited", null, 1, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Number(), ecorePackage.getEInt(), "number", "-1", 1, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphAssetEClass, GraphAsset.class, "GraphAsset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphAsset_Label(), ecorePackage.getEInt(), "Label", "-1", 1, 1, GraphAsset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphAsset_Source(), this.getNode(), null, "source", null, 1, 1, GraphAsset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphAsset_Targets(), this.getNode(), null, "targets", null, 1, -1, GraphAsset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphAsset_Encrypted(), ecorePackage.getEBoolean(), "Encrypted", null, 1, 1, GraphAsset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Outedges(), this.getEdge(), null, "outedges", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Responsibility(), this.getNodeResponsibility(), null, "responsibility", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_AttackerObservation(), ecorePackage.getEInt(), "AttackerObservation", "-1", 1, 1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNode_Visited(), ecorePackage.getEBoolean(), "visited", null, 1, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Inedges(), this.getEdge(), null, "inedges", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNode_Attacker(), ecorePackage.getEBoolean(), "Attacker", null, 1, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNode__CopierSemanticConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CopierSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__VerifierSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VerifierSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__BusinessSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"BusinessSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__EncryptSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"EncryptSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__JoinerSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"JoinerSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__DecryptSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"DecryptSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__StoreSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"StoreSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__ComparatorSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ComparatorSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__DiscarderSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"DiscarderSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AttackerObservationViolation__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"AttackerObservationViolation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__SplitterSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"SplitterSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__ForwardSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ForwardSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AuthenticatorSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"AuthenticatorSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__UserSemanticConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UserSemanticConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subgraphsEClass, Subgraphs.class, "Subgraphs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubgraphs_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Subgraphs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSubgraphs_Assets(), this.getGraphAsset(), null, "assets", null, 0, -1, Subgraphs.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeResponsibilityEClass, NodeResponsibility.class, "NodeResponsibility", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeResponsibility_Operation(), theEDFDFlowTrackingPackage.getResponsibilityType(),
				"operation", "Store", 0, -1, NodeResponsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeResponsibility_Outgoingassets(), this.getGraphAsset(), null, "outgoingassets", null, 0,
				-1, NodeResponsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeResponsibility_Incomingassets(), this.getGraphAsset(), null, "incomingassets", null, 0,
				-1, NodeResponsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNodeResponsibility__FindMostRestrictiveLabel(), ecorePackage.getEBigInteger(),
				"findMostRestrictiveLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNodeResponsibility__FindLeastRestrictiveLabel(), ecorePackage.getEBigInteger(),
				"findLeastRestrictiveLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Subgraphs(), this.getSubgraphs(), null, "subgraphs", null, 0, -1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(nodeEClass, source, new String[] { "constraints", "UserSemanticConstraint" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getNode__CopierSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Copier.*$\'))\n\t\t\t\t->forAll(r | \n\t\t\t\t\t-- there has to be at least 1 incoming and 1 outgoing asset, and there has to be a responsibility on this node that stores the incoming assets locally\n\t\t\t\t\tr.outgoingassets->size() > 0 and r.incomingassets->size() > 0 and \n\t\t\t\t\t\tself.responsibility->select(r1 | r1.ID.matches(\'^.*Store.*$\'))\n\t\t\t\t\t\t\t->select(r2 | r2.incomingassets->select(asset | r.incomingassets->includes(asset))->size()>0 or  \n\t\t\t\t\t\t\t\t\t\t  r2.outgoingassets->select(asset | r.incomingassets->includes(asset))->size()>0\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__VerifierSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Verifier.*$\'))\n\t\t\t\t->forAll(r |  \n\t\t\t\t\tr.incomingassets->size() > 0\t\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__BusinessSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Business.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t--same as store\n\t\t\t\t\tr.incomingassets->size() > 0 or r.outgoingassets->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__EncryptSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*EncryptOrHash.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t--there has to be something incoming and something outgoing\n\t\t\t\t\tr.incomingassets->size() > 0 and r.outgoingassets->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__JoinerSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Joiner.*$\'))\n\t\t\t\t->forAll(r | \n\t\t\t\t\t-- needs at least 2 on the input, at least one on the output and the number of outputs < number of inputs\n\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1 and r.outgoingassets->size() < r.incomingassets->size()\t\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__DecryptSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Descrypt.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t--same as encrypt\n\t\t\t\t\tr.incomingassets->size() > 0 and r.outgoingassets->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__StoreSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Store.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t--there has to either be sth on the input or output\n\t\t\t\t\tr.incomingassets->size() > 0 or r.outgoingassets->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__ComparatorSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Comparator.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t-- comparator needs at least 2 on input and at least 1 on output\n\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__DiscarderSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t-- after it is discarded is should not appear on output \n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Discarder.*$\'))\n\t\t\t\t->forAll(r | \n\t\t\t\t\t-- what ever is on the input, it should not appear on the output anymore\n\t\t\t\t\tr.incomingassets->forAll(a | r.outgoingassets->excludes(a))\n\t\t\t\t\t-- discarded assets are not considered a risk, so the attacker observation can violate the asset labels\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__AttackerObservationViolation__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t-- if a node is malicious then there is a violation if any of the outgoing or incoming edges are private!\n\t\t\tif self.Attacker = true\n\t\t\tthen\n\t\t\t\tself.outedges->forAll(e |\n\t\t\t\t\te.EdgeLabel < 1\n\t\t\t\t) \n\t\t\t\tand\n\t\t\t\tself.inedges->forAll(e |\n\t\t\t\t\te.EdgeLabel < 1\n\t\t\t\t)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t" });
		addAnnotation(getNode__SplitterSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Splitter.*$\'))\n\t\t\t\t->forAll(r | \n\t\t\t\t\t-- negated join operation\n\t\t\t\t\tr.outgoingassets->size() >= 2 and r.incomingassets->size() >= 1 and r.incomingassets->size() < r.outgoingassets->size()\t\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__ForwardSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Forward.*$\'))\n\t\t\t\t->forAll(r | \n\t\t\t\t\tr.outgoingassets->size() > 0 and r.incomingassets->size() > 0\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__AuthenticatorSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*Authenticator.*$\'))\n\t\t\t\t->forAll(r |\n\t\t\t\t\t-- same as comparator!\n\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNode__UserSemanticConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.responsibility->select(r | r.ID.matches(\'^.*User.*$\'))\n\t\t\t\t->forAll(r |  \n\t\t\t\t\tr.incomingassets->size() > 0\t\n\t\t\t\t)\n\t\t" });
		addAnnotation(getNodeResponsibility__FindMostRestrictiveLabel(), source,
				new String[] { "body", "self.incomingassets->collect(a | a.Label)->asSequence()->last()" });
		addAnnotation(getNodeResponsibility__FindLeastRestrictiveLabel(), source,
				new String[] { "body", "self.incomingassets->collect(a | a.Label)->asSequence()->first()" });
	}

} //GraphPackageImpl
