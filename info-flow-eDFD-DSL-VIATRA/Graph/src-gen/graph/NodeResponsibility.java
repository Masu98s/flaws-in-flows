/**
 */
package graph;

import eDFDFlowTracking.ResponsibilityType;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.NodeResponsibility#getOperation <em>Operation</em>}</li>
 *   <li>{@link graph.NodeResponsibility#getOutgoingassets <em>Outgoingassets</em>}</li>
 *   <li>{@link graph.NodeResponsibility#getIncomingassets <em>Incomingassets</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNodeResponsibility()
 * @model
 * @generated
 */
public interface NodeResponsibility extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute list.
	 * The list contents are of type {@link eDFDFlowTracking.ResponsibilityType}.
	 * The literals are from the enumeration {@link eDFDFlowTracking.ResponsibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute list.
	 * @see eDFDFlowTracking.ResponsibilityType
	 * @see graph.GraphPackage#getNodeResponsibility_Operation()
	 * @model default="Store"
	 * @generated
	 */
	EList<ResponsibilityType> getOperation();

	/**
	 * Returns the value of the '<em><b>Outgoingassets</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingassets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingassets</em>' reference list.
	 * @see graph.GraphPackage#getNodeResponsibility_Outgoingassets()
	 * @model
	 * @generated
	 */
	EList<GraphAsset> getOutgoingassets();

	/**
	 * Returns the value of the '<em><b>Incomingassets</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomingassets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingassets</em>' reference list.
	 * @see graph.GraphPackage#getNodeResponsibility_Incomingassets()
	 * @model
	 * @generated
	 */
	EList<GraphAsset> getIncomingassets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.incomingassets-&gt;collect(a | a.Label)-&gt;asSequence()-&gt;last()'"
	 * @generated
	 */
	BigInteger findMostRestrictiveLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.incomingassets-&gt;collect(a | a.Label)-&gt;asSequence()-&gt;first()'"
	 * @generated
	 */
	BigInteger findLeastRestrictiveLabel();

} // NodeResponsibility
