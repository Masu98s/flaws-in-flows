/**
 */
package traceability;

import org.secdfd.model.NamedEntity;

import graph.Identifiable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDFD Graph Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceability.EDFDGraphTrace#getEdfdElements <em>Edfd Elements</em>}</li>
 *   <li>{@link traceability.EDFDGraphTrace#getGraphElements <em>Graph Elements</em>}</li>
 * </ul>
 *
 * @see traceability.TraceabilityPackage#getEDFDGraphTrace()
 * @model
 * @generated
 */
public interface EDFDGraphTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Edfd Elements</b></em>' reference list.
	 * The list contents are of type {@link org.secdfd.model.NamedEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edfd Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edfd Elements</em>' reference list.
	 * @see traceability.TraceabilityPackage#getEDFDGraphTrace_EdfdElements()
	 * @model
	 * @generated
	 */
	EList<NamedEntity> getEdfdElements();

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
	 * @see traceability.TraceabilityPackage#getEDFDGraphTrace_GraphElements()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getGraphElements();

} // EDFDGraphTrace
