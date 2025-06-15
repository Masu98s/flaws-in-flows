/**
 */
package graph;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Node#getOutedges <em>Outedges</em>}</li>
 *   <li>{@link graph.Node#getName <em>Name</em>}</li>
 *   <li>{@link graph.Node#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link graph.Node#getAttackerObservation <em>Attacker Observation</em>}</li>
 *   <li>{@link graph.Node#isVisited <em>Visited</em>}</li>
 *   <li>{@link graph.Node#getInedges <em>Inedges</em>}</li>
 *   <li>{@link graph.Node#isAttacker <em>Attacker</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UserSemanticConstraint'"
 * @generated
 */
public interface Node extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Outedges</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outedges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outedges</em>' containment reference list.
	 * @see graph.GraphPackage#getNode_Outedges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getOutedges();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph.GraphPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' containment reference list.
	 * The list contents are of type {@link graph.NodeResponsibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' containment reference list.
	 * @see graph.GraphPackage#getNode_Responsibility()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeResponsibility> getResponsibility();

	/**
	 * Returns the value of the '<em><b>Attacker Observation</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Observation</em>' attribute.
	 * @see #setAttackerObservation(int)
	 * @see graph.GraphPackage#getNode_AttackerObservation()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getAttackerObservation();

	/**
	 * Sets the value of the '{@link graph.Node#getAttackerObservation <em>Attacker Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Observation</em>' attribute.
	 * @see #getAttackerObservation()
	 * @generated
	 */
	void setAttackerObservation(int value);

	/**
	 * Returns the value of the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited</em>' attribute.
	 * @see #setVisited(boolean)
	 * @see graph.GraphPackage#getNode_Visited()
	 * @model required="true"
	 * @generated
	 */
	boolean isVisited();

	/**
	 * Sets the value of the '{@link graph.Node#isVisited <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited</em>' attribute.
	 * @see #isVisited()
	 * @generated
	 */
	void setVisited(boolean value);

	/**
	 * Returns the value of the '<em><b>Inedges</b></em>' reference list.
	 * The list contents are of type {@link graph.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inedges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inedges</em>' reference list.
	 * @see graph.GraphPackage#getNode_Inedges()
	 * @model
	 * @generated
	 */
	EList<Edge> getInedges();

	/**
	 * Returns the value of the '<em><b>Attacker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker</em>' attribute.
	 * @see #setAttacker(boolean)
	 * @see graph.GraphPackage#getNode_Attacker()
	 * @model required="true"
	 * @generated
	 */
	boolean isAttacker();

	/**
	 * Sets the value of the '{@link graph.Node#isAttacker <em>Attacker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker</em>' attribute.
	 * @see #isAttacker()
	 * @generated
	 */
	void setAttacker(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Copier.*$\'))\n\t\t\t\t-&gt;forAll(r | \n\t\t\t\t\t-- there has to be at least 1 incoming and 1 outgoing asset, and there has to be a responsibility on this node that stores the incoming assets locally\n\t\t\t\t\tr.outgoingassets-&gt;size() &gt; 0 and r.incomingassets-&gt;size() &gt; 0 and \n\t\t\t\t\t\tself.responsibility-&gt;select(r1 | r1.ID.matches(\'^.*Store.*$\'))\n\t\t\t\t\t\t\t-&gt;select(r2 | r2.incomingassets-&gt;select(asset | r.incomingassets-&gt;includes(asset))-&gt;size()&gt;0 or  \n\t\t\t\t\t\t\t\t\t\t  r2.outgoingassets-&gt;select(asset | r.incomingassets-&gt;includes(asset))-&gt;size()&gt;0\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean CopierSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Verifier.*$\'))\n\t\t\t\t-&gt;forAll(r |  \n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0\t\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean VerifierSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Business.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t--same as store\n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0 or r.outgoingassets-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean BusinessSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*EncryptOrHash.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t--there has to be something incoming and something outgoing\n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0 and r.outgoingassets-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean EncryptSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Joiner.*$\'))\n\t\t\t\t-&gt;forAll(r | \n\t\t\t\t\t-- needs at least 2 on the input, at least one on the output and the number of outputs &lt; number of inputs\n\t\t\t\t\tr.incomingassets-&gt;size() &gt;= 2 and r.outgoingassets-&gt;size() &gt;= 1 and r.outgoingassets-&gt;size() &lt; r.incomingassets-&gt;size()\t\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean JoinerSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Descrypt.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t--same as encrypt\n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0 and r.outgoingassets-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean DecryptSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Store.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t--there has to either be sth on the input or output\n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0 or r.outgoingassets-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean StoreSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Comparator.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t-- comparator needs at least 2 on input and at least 1 on output\n\t\t\t\t\tr.incomingassets-&gt;size() &gt;= 2 and r.outgoingassets-&gt;size() &gt;= 1\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean ComparatorSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t-- after it is discarded is should not appear on output \n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Discarder.*$\'))\n\t\t\t\t-&gt;forAll(r | \n\t\t\t\t\t-- what ever is on the input, it should not appear on the output anymore\n\t\t\t\t\tr.incomingassets-&gt;forAll(a | r.outgoingassets-&gt;excludes(a))\n\t\t\t\t\t-- discarded assets are not considered a risk, so the attacker observation can violate the asset labels\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean DiscarderSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t-- if a node is malicious then there is a violation if any of the outgoing or incoming edges are private!\n\t\t\tif self.Attacker = true\n\t\t\tthen\n\t\t\t\tself.outedges-&gt;forAll(e |\n\t\t\t\t\te.EdgeLabel &lt; 1\n\t\t\t\t) \n\t\t\t\tand\n\t\t\t\tself.inedges-&gt;forAll(e |\n\t\t\t\t\te.EdgeLabel &lt; 1\n\t\t\t\t)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t'"
	 * @generated
	 */
	boolean AttackerObservationViolation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Splitter.*$\'))\n\t\t\t\t-&gt;forAll(r | \n\t\t\t\t\t-- negated join operation\n\t\t\t\t\tr.outgoingassets-&gt;size() &gt;= 2 and r.incomingassets-&gt;size() &gt;= 1 and r.incomingassets-&gt;size() &lt; r.outgoingassets-&gt;size()\t\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean SplitterSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Forward.*$\'))\n\t\t\t\t-&gt;forAll(r | \n\t\t\t\t\tr.outgoingassets-&gt;size() &gt; 0 and r.incomingassets-&gt;size() &gt; 0\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean ForwardSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*Authenticator.*$\'))\n\t\t\t\t-&gt;forAll(r |\n\t\t\t\t\t-- same as comparator!\n\t\t\t\t\tr.incomingassets-&gt;size() &gt;= 2 and r.outgoingassets-&gt;size() &gt;= 1\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean AuthenticatorSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.responsibility-&gt;select(r | r.ID.matches(\'^.*User.*$\'))\n\t\t\t\t-&gt;forAll(r |  \n\t\t\t\t\tr.incomingassets-&gt;size() &gt; 0\t\n\t\t\t\t)\n\t\t'"
	 * @generated
	 */
	boolean UserSemanticConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Node
