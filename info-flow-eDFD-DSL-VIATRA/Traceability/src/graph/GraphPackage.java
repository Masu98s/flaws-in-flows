/**
 */
package graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graph.GraphFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import eDFDFlowTracking='../../eDFDFlowTracking1/model/eDFDFlowTracking1.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link graph.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.Identifiable
	 * @see graph.impl.GraphPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.EdgeImpl
	 * @see graph.impl.GraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edge Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE_LABEL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graphassets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__GRAPHASSETS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VISITED = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.GraphAssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.GraphAssetImpl
	 * @see graph.impl.GraphPackageImpl#getGraphAsset()
	 * @generated
	 */
	int GRAPH_ASSET = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET__LABEL = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET__SOURCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET__TARGETS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ASSET_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.NodeImpl
	 * @see graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Outedges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTEDGES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESPONSIBILITY = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attacker Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTACKER_OBSERVATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISITED = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inedges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INEDGES = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTACKER = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.SubgraphsImpl <em>Subgraphs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.SubgraphsImpl
	 * @see graph.impl.GraphPackageImpl#getSubgraphs()
	 * @generated
	 */
	int SUBGRAPHS = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS__NODES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS__ASSETS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subgraphs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subgraphs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPHS_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.NodeResponsibilityImpl <em>Node Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.NodeResponsibilityImpl
	 * @see graph.impl.GraphPackageImpl#getNodeResponsibility()
	 * @generated
	 */
	int NODE_RESPONSIBILITY = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY__NUMBER = IDENTIFIABLE__NUMBER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY__OPERATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoingassets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY__OUTGOINGASSETS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incomingassets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY__INCOMINGASSETS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Find Most Restrictive Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Least Restrictive Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESPONSIBILITY_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.GraphImpl
	 * @see graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 6;

	/**
	 * The feature id for the '<em><b>Subgraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SUBGRAPHS = 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link graph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see graph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference list '{@link graph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see graph.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link graph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see graph.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the attribute '{@link graph.Edge#getEdgeLabel <em>Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Label</em>'.
	 * @see graph.Edge#getEdgeLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_EdgeLabel();

	/**
	 * Returns the meta object for the reference list '{@link graph.Edge#getGraphassets <em>Graphassets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graphassets</em>'.
	 * @see graph.Edge#getGraphassets()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Graphassets();

	/**
	 * Returns the meta object for the attribute '{@link graph.Edge#isVisited <em>Visited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited</em>'.
	 * @see graph.Edge#isVisited()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Visited();

	/**
	 * Returns the meta object for class '{@link graph.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see graph.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link graph.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see graph.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for the attribute '{@link graph.Identifiable#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see graph.Identifiable#getNumber()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Number();

	/**
	 * Returns the meta object for class '{@link graph.GraphAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see graph.GraphAsset
	 * @generated
	 */
	EClass getGraphAsset();

	/**
	 * Returns the meta object for the attribute '{@link graph.GraphAsset#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see graph.GraphAsset#getLabel()
	 * @see #getGraphAsset()
	 * @generated
	 */
	EAttribute getGraphAsset_Label();

	/**
	 * Returns the meta object for the reference '{@link graph.GraphAsset#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see graph.GraphAsset#getSource()
	 * @see #getGraphAsset()
	 * @generated
	 */
	EReference getGraphAsset_Source();

	/**
	 * Returns the meta object for the reference list '{@link graph.GraphAsset#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see graph.GraphAsset#getTargets()
	 * @see #getGraphAsset()
	 * @generated
	 */
	EReference getGraphAsset_Targets();

	/**
	 * Returns the meta object for class '{@link graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Node#getOutedges <em>Outedges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outedges</em>'.
	 * @see graph.Node#getOutedges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outedges();

	/**
	 * Returns the meta object for the attribute '{@link graph.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Node#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsibility</em>'.
	 * @see graph.Node#getResponsibility()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Responsibility();

	/**
	 * Returns the meta object for the attribute '{@link graph.Node#getAttackerObservation <em>Attacker Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Observation</em>'.
	 * @see graph.Node#getAttackerObservation()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_AttackerObservation();

	/**
	 * Returns the meta object for the attribute '{@link graph.Node#isVisited <em>Visited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited</em>'.
	 * @see graph.Node#isVisited()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Visited();

	/**
	 * Returns the meta object for the reference list '{@link graph.Node#getInedges <em>Inedges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inedges</em>'.
	 * @see graph.Node#getInedges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Inedges();

	/**
	 * Returns the meta object for the attribute '{@link graph.Node#isAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker</em>'.
	 * @see graph.Node#isAttacker()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Attacker();

	/**
	 * Returns the meta object for class '{@link graph.Subgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgraphs</em>'.
	 * @see graph.Subgraphs
	 * @generated
	 */
	EClass getSubgraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Subgraphs#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see graph.Subgraphs#getNodes()
	 * @see #getSubgraphs()
	 * @generated
	 */
	EReference getSubgraphs_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Subgraphs#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see graph.Subgraphs#getAssets()
	 * @see #getSubgraphs()
	 * @generated
	 */
	EReference getSubgraphs_Assets();

	/**
	 * Returns the meta object for class '{@link graph.NodeResponsibility <em>Node Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Responsibility</em>'.
	 * @see graph.NodeResponsibility
	 * @generated
	 */
	EClass getNodeResponsibility();

	/**
	 * Returns the meta object for the attribute list '{@link graph.NodeResponsibility#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operation</em>'.
	 * @see graph.NodeResponsibility#getOperation()
	 * @see #getNodeResponsibility()
	 * @generated
	 */
	EAttribute getNodeResponsibility_Operation();

	/**
	 * Returns the meta object for the reference list '{@link graph.NodeResponsibility#getOutgoingassets <em>Outgoingassets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingassets</em>'.
	 * @see graph.NodeResponsibility#getOutgoingassets()
	 * @see #getNodeResponsibility()
	 * @generated
	 */
	EReference getNodeResponsibility_Outgoingassets();

	/**
	 * Returns the meta object for the reference list '{@link graph.NodeResponsibility#getIncomingassets <em>Incomingassets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomingassets</em>'.
	 * @see graph.NodeResponsibility#getIncomingassets()
	 * @see #getNodeResponsibility()
	 * @generated
	 */
	EReference getNodeResponsibility_Incomingassets();

	/**
	 * Returns the meta object for the '{@link graph.NodeResponsibility#findMostRestrictiveLabel() <em>Find Most Restrictive Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Most Restrictive Label</em>' operation.
	 * @see graph.NodeResponsibility#findMostRestrictiveLabel()
	 * @generated
	 */
	EOperation getNodeResponsibility__FindMostRestrictiveLabel();

	/**
	 * Returns the meta object for the '{@link graph.NodeResponsibility#findLeastRestrictiveLabel() <em>Find Least Restrictive Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Least Restrictive Label</em>' operation.
	 * @see graph.NodeResponsibility#findLeastRestrictiveLabel()
	 * @generated
	 */
	EOperation getNodeResponsibility__FindLeastRestrictiveLabel();

	/**
	 * Returns the meta object for class '{@link graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Graph#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraphs</em>'.
	 * @see graph.Graph#getSubgraphs()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Subgraphs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graph.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.EdgeImpl
		 * @see graph.impl.GraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Edge Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__EDGE_LABEL = eINSTANCE.getEdge_EdgeLabel();

		/**
		 * The meta object literal for the '<em><b>Graphassets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__GRAPHASSETS = eINSTANCE.getEdge_Graphassets();

		/**
		 * The meta object literal for the '<em><b>Visited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__VISITED = eINSTANCE.getEdge_Visited();

		/**
		 * The meta object literal for the '{@link graph.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.Identifiable
		 * @see graph.impl.GraphPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_ID();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NUMBER = eINSTANCE.getIdentifiable_Number();

		/**
		 * The meta object literal for the '{@link graph.impl.GraphAssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.GraphAssetImpl
		 * @see graph.impl.GraphPackageImpl#getGraphAsset()
		 * @generated
		 */
		EClass GRAPH_ASSET = eINSTANCE.getGraphAsset();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ASSET__LABEL = eINSTANCE.getGraphAsset_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ASSET__SOURCE = eINSTANCE.getGraphAsset_Source();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ASSET__TARGETS = eINSTANCE.getGraphAsset_Targets();

		/**
		 * The meta object literal for the '{@link graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.NodeImpl
		 * @see graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outedges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTEDGES = eINSTANCE.getNode_Outedges();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__RESPONSIBILITY = eINSTANCE.getNode_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Attacker Observation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ATTACKER_OBSERVATION = eINSTANCE.getNode_AttackerObservation();

		/**
		 * The meta object literal for the '<em><b>Visited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VISITED = eINSTANCE.getNode_Visited();

		/**
		 * The meta object literal for the '<em><b>Inedges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INEDGES = eINSTANCE.getNode_Inedges();

		/**
		 * The meta object literal for the '<em><b>Attacker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ATTACKER = eINSTANCE.getNode_Attacker();

		/**
		 * The meta object literal for the '{@link graph.impl.SubgraphsImpl <em>Subgraphs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.SubgraphsImpl
		 * @see graph.impl.GraphPackageImpl#getSubgraphs()
		 * @generated
		 */
		EClass SUBGRAPHS = eINSTANCE.getSubgraphs();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPHS__NODES = eINSTANCE.getSubgraphs_Nodes();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPHS__ASSETS = eINSTANCE.getSubgraphs_Assets();

		/**
		 * The meta object literal for the '{@link graph.impl.NodeResponsibilityImpl <em>Node Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.NodeResponsibilityImpl
		 * @see graph.impl.GraphPackageImpl#getNodeResponsibility()
		 * @generated
		 */
		EClass NODE_RESPONSIBILITY = eINSTANCE.getNodeResponsibility();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESPONSIBILITY__OPERATION = eINSTANCE.getNodeResponsibility_Operation();

		/**
		 * The meta object literal for the '<em><b>Outgoingassets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESPONSIBILITY__OUTGOINGASSETS = eINSTANCE.getNodeResponsibility_Outgoingassets();

		/**
		 * The meta object literal for the '<em><b>Incomingassets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESPONSIBILITY__INCOMINGASSETS = eINSTANCE.getNodeResponsibility_Incomingassets();

		/**
		 * The meta object literal for the '<em><b>Find Most Restrictive Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL = eINSTANCE.getNodeResponsibility__FindMostRestrictiveLabel();

		/**
		 * The meta object literal for the '<em><b>Find Least Restrictive Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL = eINSTANCE.getNodeResponsibility__FindLeastRestrictiveLabel();

		/**
		 * The meta object literal for the '{@link graph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.GraphImpl
		 * @see graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Subgraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__SUBGRAPHS = eINSTANCE.getGraph_Subgraphs();

	}

} //GraphPackage
