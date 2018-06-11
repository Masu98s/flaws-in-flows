/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgraphs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Subgraphs#getNodes <em>Nodes</em>}</li>
 *   <li>{@link graph.Subgraphs#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getSubgraphs()
 * @model
 * @generated
 */
public interface Subgraphs extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see graph.GraphPackage#getSubgraphs_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link graph.GraphAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see graph.GraphPackage#getSubgraphs_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphAsset> getAssets();

} // Subgraphs
