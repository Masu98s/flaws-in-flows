/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GraphAsset#getLabel <em>Label</em>}</li>
 *   <li>{@link graph.GraphAsset#getSource <em>Source</em>}</li>
 *   <li>{@link graph.GraphAsset#getTargets <em>Targets</em>}</li>
 *   <li>{@link graph.GraphAsset#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGraphAsset()
 * @model
 * @generated
 */
public interface GraphAsset extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(int)
	 * @see graph.GraphPackage#getGraphAsset_Label()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getLabel();

	/**
	 * Sets the value of the '{@link graph.GraphAsset#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see graph.GraphPackage#getGraphAsset_Source()
	 * @model required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link graph.GraphAsset#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see graph.GraphPackage#getGraphAsset_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getTargets();

	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' attribute.
	 * @see #setEncrypted(boolean)
	 * @see graph.GraphPackage#getGraphAsset_Encrypted()
	 * @model required="true"
	 * @generated
	 */
	boolean isEncrypted();

	/**
	 * Sets the value of the '{@link graph.GraphAsset#isEncrypted <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' attribute.
	 * @see #isEncrypted()
	 * @generated
	 */
	void setEncrypted(boolean value);

} // GraphAsset
