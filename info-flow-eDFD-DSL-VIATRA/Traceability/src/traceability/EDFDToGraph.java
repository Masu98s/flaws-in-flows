/**
 */
package traceability;

import eDFDFlowTracking.EDFD;

import graph.Graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDFD To Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceability.EDFDToGraph#getEdfdGraphTraces <em>Edfd Graph Traces</em>}</li>
 *   <li>{@link traceability.EDFDToGraph#getEdfds <em>Edfds</em>}</li>
 *   <li>{@link traceability.EDFDToGraph#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link traceability.EDFDToGraph#getEndtoendgraph <em>Endtoendgraph</em>}</li>
 *   <li>{@link traceability.EDFDToGraph#getGraphEndToEndTrace <em>Graph End To End Trace</em>}</li>
 * </ul>
 *
 * @see traceability.TraceabilityPackage#getEDFDToGraph()
 * @model
 * @generated
 */
public interface EDFDToGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Edfd Graph Traces</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.EDFDGraphTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edfd Graph Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edfd Graph Traces</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getEDFDToGraph_EdfdGraphTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDFDGraphTrace> getEdfdGraphTraces();

	/**
	 * Returns the value of the '<em><b>Edfds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edfds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edfds</em>' reference.
	 * @see #setEdfds(EDFD)
	 * @see traceability.TraceabilityPackage#getEDFDToGraph_Edfds()
	 * @model
	 * @generated
	 */
	EDFD getEdfds();

	/**
	 * Sets the value of the '{@link traceability.EDFDToGraph#getEdfds <em>Edfds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edfds</em>' reference.
	 * @see #getEdfds()
	 * @generated
	 */
	void setEdfds(EDFD value);

	/**
	 * Returns the value of the '<em><b>Graphs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphs</em>' reference.
	 * @see #setGraphs(Graph)
	 * @see traceability.TraceabilityPackage#getEDFDToGraph_Graphs()
	 * @model
	 * @generated
	 */
	Graph getGraphs();

	/**
	 * Sets the value of the '{@link traceability.EDFDToGraph#getGraphs <em>Graphs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphs</em>' reference.
	 * @see #getGraphs()
	 * @generated
	 */
	void setGraphs(Graph value);

	/**
	 * Returns the value of the '<em><b>Endtoendgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endtoendgraph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endtoendgraph</em>' reference.
	 * @see #setEndtoendgraph(Graph)
	 * @see traceability.TraceabilityPackage#getEDFDToGraph_Endtoendgraph()
	 * @model
	 * @generated
	 */
	Graph getEndtoendgraph();

	/**
	 * Sets the value of the '{@link traceability.EDFDToGraph#getEndtoendgraph <em>Endtoendgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endtoendgraph</em>' reference.
	 * @see #getEndtoendgraph()
	 * @generated
	 */
	void setEndtoendgraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Graph End To End Trace</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.GraphEndToEndTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph End To End Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph End To End Trace</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getEDFDToGraph_GraphEndToEndTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphEndToEndTrace> getGraphEndToEndTrace();

} // EDFDToGraph
