/**
 */
package traceability;

import graph.Identifiable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph End To End Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceability.GraphEndToEndTrace#getEndtoendGraphElements <em>Endtoend Graph Elements</em>}</li>
 *   <li>{@link traceability.GraphEndToEndTrace#getGraphElements <em>Graph Elements</em>}</li>
 * </ul>
 *
 * @see traceability.TraceabilityPackage#getGraphEndToEndTrace()
 * @model
 * @generated
 */
public interface GraphEndToEndTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Endtoend Graph Elements</b></em>' reference list.
	 * The list contents are of type {@link graph.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endtoend Graph Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endtoend Graph Elements</em>' reference list.
	 * @see traceability.TraceabilityPackage#getGraphEndToEndTrace_EndtoendGraphElements()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getEndtoendGraphElements();

	/**
	 * Returns the value of the '<em><b>Graph Elements</b></em>' reference list.
	 * The list contents are of type {@link graph.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Elements</em>' reference list.
	 * @see traceability.TraceabilityPackage#getGraphEndToEndTrace_GraphElements()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getGraphElements();

} // GraphEndToEndTrace
