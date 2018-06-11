/**
 */
package traceability;

import org.eclipse.emf.ecore.EClass;
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
 * @see traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link traceability.impl.EDFDToGraphImpl <em>EDFD To Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.EDFDToGraphImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getEDFDToGraph()
	 * @generated
	 */
	int EDFD_TO_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Edfd Graph Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH__EDFD_GRAPH_TRACES = 0;

	/**
	 * The feature id for the '<em><b>Edfds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH__EDFDS = 1;

	/**
	 * The feature id for the '<em><b>Graphs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH__GRAPHS = 2;

	/**
	 * The feature id for the '<em><b>Endtoendgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH__ENDTOENDGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Graph End To End Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE = 4;

	/**
	 * The number of structural features of the '<em>EDFD To Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EDFD To Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_TO_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traceability.impl.EDFDGraphTraceImpl <em>EDFD Graph Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.EDFDGraphTraceImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getEDFDGraphTrace()
	 * @generated
	 */
	int EDFD_GRAPH_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Edfd Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_GRAPH_TRACE__EDFD_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_GRAPH_TRACE__GRAPH_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>EDFD Graph Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_GRAPH_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDFD Graph Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDFD_GRAPH_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traceability.impl.GraphEndToEndTraceImpl <em>Graph End To End Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.GraphEndToEndTraceImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getGraphEndToEndTrace()
	 * @generated
	 */
	int GRAPH_END_TO_END_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Endtoend Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Graph End To End Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_END_TO_END_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph End To End Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_END_TO_END_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link traceability.EDFDToGraph <em>EDFD To Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDFD To Graph</em>'.
	 * @see traceability.EDFDToGraph
	 * @generated
	 */
	EClass getEDFDToGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.EDFDToGraph#getEdfdGraphTraces <em>Edfd Graph Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edfd Graph Traces</em>'.
	 * @see traceability.EDFDToGraph#getEdfdGraphTraces()
	 * @see #getEDFDToGraph()
	 * @generated
	 */
	EReference getEDFDToGraph_EdfdGraphTraces();

	/**
	 * Returns the meta object for the reference '{@link traceability.EDFDToGraph#getEdfds <em>Edfds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edfds</em>'.
	 * @see traceability.EDFDToGraph#getEdfds()
	 * @see #getEDFDToGraph()
	 * @generated
	 */
	EReference getEDFDToGraph_Edfds();

	/**
	 * Returns the meta object for the reference '{@link traceability.EDFDToGraph#getGraphs <em>Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graphs</em>'.
	 * @see traceability.EDFDToGraph#getGraphs()
	 * @see #getEDFDToGraph()
	 * @generated
	 */
	EReference getEDFDToGraph_Graphs();

	/**
	 * Returns the meta object for the reference '{@link traceability.EDFDToGraph#getEndtoendgraph <em>Endtoendgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endtoendgraph</em>'.
	 * @see traceability.EDFDToGraph#getEndtoendgraph()
	 * @see #getEDFDToGraph()
	 * @generated
	 */
	EReference getEDFDToGraph_Endtoendgraph();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.EDFDToGraph#getGraphEndToEndTrace <em>Graph End To End Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph End To End Trace</em>'.
	 * @see traceability.EDFDToGraph#getGraphEndToEndTrace()
	 * @see #getEDFDToGraph()
	 * @generated
	 */
	EReference getEDFDToGraph_GraphEndToEndTrace();

	/**
	 * Returns the meta object for class '{@link traceability.EDFDGraphTrace <em>EDFD Graph Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDFD Graph Trace</em>'.
	 * @see traceability.EDFDGraphTrace
	 * @generated
	 */
	EClass getEDFDGraphTrace();

	/**
	 * Returns the meta object for the reference list '{@link traceability.EDFDGraphTrace#getEdfdElements <em>Edfd Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edfd Elements</em>'.
	 * @see traceability.EDFDGraphTrace#getEdfdElements()
	 * @see #getEDFDGraphTrace()
	 * @generated
	 */
	EReference getEDFDGraphTrace_EdfdElements();

	/**
	 * Returns the meta object for the reference list '{@link traceability.EDFDGraphTrace#getGraphElements <em>Graph Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graph Elements</em>'.
	 * @see traceability.EDFDGraphTrace#getGraphElements()
	 * @see #getEDFDGraphTrace()
	 * @generated
	 */
	EReference getEDFDGraphTrace_GraphElements();

	/**
	 * Returns the meta object for class '{@link traceability.GraphEndToEndTrace <em>Graph End To End Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph End To End Trace</em>'.
	 * @see traceability.GraphEndToEndTrace
	 * @generated
	 */
	EClass getGraphEndToEndTrace();

	/**
	 * Returns the meta object for the reference list '{@link traceability.GraphEndToEndTrace#getEndtoendGraphElements <em>Endtoend Graph Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Endtoend Graph Elements</em>'.
	 * @see traceability.GraphEndToEndTrace#getEndtoendGraphElements()
	 * @see #getGraphEndToEndTrace()
	 * @generated
	 */
	EReference getGraphEndToEndTrace_EndtoendGraphElements();

	/**
	 * Returns the meta object for the reference list '{@link traceability.GraphEndToEndTrace#getGraphElements <em>Graph Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graph Elements</em>'.
	 * @see traceability.GraphEndToEndTrace#getGraphElements()
	 * @see #getGraphEndToEndTrace()
	 * @generated
	 */
	EReference getGraphEndToEndTrace_GraphElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link traceability.impl.EDFDToGraphImpl <em>EDFD To Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.EDFDToGraphImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getEDFDToGraph()
		 * @generated
		 */
		EClass EDFD_TO_GRAPH = eINSTANCE.getEDFDToGraph();

		/**
		 * The meta object literal for the '<em><b>Edfd Graph Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_GRAPH__EDFD_GRAPH_TRACES = eINSTANCE.getEDFDToGraph_EdfdGraphTraces();

		/**
		 * The meta object literal for the '<em><b>Edfds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_GRAPH__EDFDS = eINSTANCE.getEDFDToGraph_Edfds();

		/**
		 * The meta object literal for the '<em><b>Graphs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_GRAPH__GRAPHS = eINSTANCE.getEDFDToGraph_Graphs();

		/**
		 * The meta object literal for the '<em><b>Endtoendgraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_GRAPH__ENDTOENDGRAPH = eINSTANCE.getEDFDToGraph_Endtoendgraph();

		/**
		 * The meta object literal for the '<em><b>Graph End To End Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE = eINSTANCE.getEDFDToGraph_GraphEndToEndTrace();

		/**
		 * The meta object literal for the '{@link traceability.impl.EDFDGraphTraceImpl <em>EDFD Graph Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.EDFDGraphTraceImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getEDFDGraphTrace()
		 * @generated
		 */
		EClass EDFD_GRAPH_TRACE = eINSTANCE.getEDFDGraphTrace();

		/**
		 * The meta object literal for the '<em><b>Edfd Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_GRAPH_TRACE__EDFD_ELEMENTS = eINSTANCE.getEDFDGraphTrace_EdfdElements();

		/**
		 * The meta object literal for the '<em><b>Graph Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDFD_GRAPH_TRACE__GRAPH_ELEMENTS = eINSTANCE.getEDFDGraphTrace_GraphElements();

		/**
		 * The meta object literal for the '{@link traceability.impl.GraphEndToEndTraceImpl <em>Graph End To End Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.GraphEndToEndTraceImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getGraphEndToEndTrace()
		 * @generated
		 */
		EClass GRAPH_END_TO_END_TRACE = eINSTANCE.getGraphEndToEndTrace();

		/**
		 * The meta object literal for the '<em><b>Endtoend Graph Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS = eINSTANCE.getGraphEndToEndTrace_EndtoendGraphElements();

		/**
		 * The meta object literal for the '<em><b>Graph Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS = eINSTANCE.getGraphEndToEndTrace_GraphElements();

	}

} //TraceabilityPackage
