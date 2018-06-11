/**
 */
package graph.util;

import graph.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see graph.GraphPackage
 * @generated
 */
public class GraphValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraphValidator INSTANCE = new GraphValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "graph";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return GraphPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GraphPackage.EDGE:
			return validateEdge((Edge) value, diagnostics, context);
		case GraphPackage.IDENTIFIABLE:
			return validateIdentifiable((Identifiable) value, diagnostics, context);
		case GraphPackage.GRAPH_ASSET:
			return validateGraphAsset((GraphAsset) value, diagnostics, context);
		case GraphPackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case GraphPackage.SUBGRAPHS:
			return validateSubgraphs((Subgraphs) value, diagnostics, context);
		case GraphPackage.NODE_RESPONSIBILITY:
			return validateNodeResponsibility((NodeResponsibility) value, diagnostics, context);
		case GraphPackage.GRAPH:
			return validateGraph((Graph) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAsset(GraphAsset graphAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graphAsset, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGraphAsset_AttackerObservationViolationSource(graphAsset, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGraphAsset_AttackerObservationViolationTagret(graphAsset, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttackerObservationViolationSource constraint of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_ASSET__ATTACKER_OBSERVATION_VIOLATION_SOURCE__EEXPRESSION = "\n"
			+ "\t\tif self.Label = 0\n" + "\t\tthen\n" + "\t\t\tself.source.AttackerObservation < 5\n" + "\t\telse\n"
			+ "\t\t\tself.source.AttackerObservation < 1\n" + "\t\tendif\n" + "\t\t";

	/**
	 * Validates the AttackerObservationViolationSource constraint of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAsset_AttackerObservationViolationSource(GraphAsset graphAsset,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GraphPackage.Literals.GRAPH_ASSET, graphAsset, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AttackerObservationViolationSource",
				GRAPH_ASSET__ATTACKER_OBSERVATION_VIOLATION_SOURCE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the AttackerObservationViolationTagret constraint of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_ASSET__ATTACKER_OBSERVATION_VIOLATION_TAGRET__EEXPRESSION = "\n"
			+ "\t\tself.targets->forAll(t | \n" + "\t\t\tif self.Label = 0\n" + "\t\t\tthen\n"
			+ "\t\t\t\tt.AttackerObservation < 5\n" + "\t\t\telse\n" + "\t\t\t\tt.AttackerObservation < 1\n"
			+ "\t\t\tendif\n" + "\t\t)\n" + "\t\t";

	/**
	 * Validates the AttackerObservationViolationTagret constraint of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAsset_AttackerObservationViolationTagret(GraphAsset graphAsset,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GraphPackage.Literals.GRAPH_ASSET, graphAsset, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AttackerObservationViolationTagret",
				GRAPH_ASSET__ATTACKER_OBSERVATION_VIOLATION_TAGRET__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_AttackerObservationViolation(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_EncryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_DecryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_StoreSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_BusinessSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_ComparatorSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_JoinerSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_DiscarderSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_CopierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_ForwardSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_SplitterSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_UserSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_VerifierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_AuthenticatorSemanticConstraint(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttackerObservationViolation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__ATTACKER_OBSERVATION_VIOLATION__EEXPRESSION = "\n"
			+ "\t\t-- if a node is malicious then there is a violation if any of the outgoing edges are private!\n"
			+ "\t\t\tif self.Attacker = true\n" + "\t\t\tthen\n" + "\t\t\t\tself.outedges->forAll(e |\n"
			+ "\t\t\t\t\te.EdgeLabel < 1\n" + "\t\t\t\t)\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "\t\t";

	/**
	 * Validates the AttackerObservationViolation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AttackerObservationViolation(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AttackerObservationViolation",
				NODE__ATTACKER_OBSERVATION_VIOLATION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the EncryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__ENCRYPT_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*EncryptOrHash.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t--there has to be something incoming and something outgoing\n"
			+ "\t\t\t\t\tr.incomingassets->size() > 0 and r.outgoingassets->size() > 0\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the EncryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_EncryptSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "EncryptSemanticConstraint",
				NODE__ENCRYPT_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DecryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__DECRYPT_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Descrypt.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t--same as encrypt\n"
			+ "\t\t\t\t\tr.incomingassets->size() > 0 and r.outgoingassets->size() > 0\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the DecryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DecryptSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DecryptSemanticConstraint",
				NODE__DECRYPT_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StoreSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__STORE_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Store.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t--there has to either be sth on the input or output\n"
			+ "\t\t\t\t\tr.incomingassets->size() > 0 or r.outgoingassets->size() > 0\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the StoreSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StoreSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StoreSemanticConstraint",
				NODE__STORE_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the BusinessSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__BUSINESS_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Business.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t--same as store\n" + "\t\t\t\t\tr.incomingassets->size() > 0 or r.outgoingassets->size() > 0\n"
			+ "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the BusinessSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_BusinessSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "BusinessSemanticConstraint",
				NODE__BUSINESS_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ComparatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__COMPARATOR_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Comparator.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t-- comparator needs at least 2 on input and at least 1 on output\n"
			+ "\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the ComparatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ComparatorSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ComparatorSemanticConstraint",
				NODE__COMPARATOR_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the JoinerSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__JOINER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Joiner.*$'))\n" + "\t\t\t\t->forAll(r | \n"
			+ "\t\t\t\t\t-- needs at least 2 on the input, at least one on the output and the number of outputs < number of inputs\n"
			+ "\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1 and r.outgoingassets->size() < r.incomingassets->size()\t\n"
			+ "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the JoinerSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_JoinerSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "JoinerSemanticConstraint",
				NODE__JOINER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DiscarderSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__DISCARDER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t-- after it is discarded is should not appear on output \n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Discarder.*$'))\n" + "\t\t\t\t->forAll(r | \n"
			+ "\t\t\t\t\t-- what ever is on the input, it should not appear on the output anymore\n"
			+ "\t\t\t\t\tr.incomingassets->forAll(a | r.outgoingassets->excludes(a))\n"
			+ "\t\t\t\t\t-- discarded assets are not considered a risk, so the attacker observation can violate the asset labels\n"
			+ "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the DiscarderSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DiscarderSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DiscarderSemanticConstraint",
				NODE__DISCARDER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CopierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__COPIER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Copier.*$'))\n" + "\t\t\t\t->forAll(r | \n"
			+ "\t\t\t\t\t-- there has to be at least 1 incoming and 1 outgoing asset, and there has to be a responsibility on this node that stores the incoming assets locally\n"
			+ "\t\t\t\t\tr.outgoingassets->size() > 0 and r.incomingassets->size() > 0 and \n"
			+ "\t\t\t\t\t\tself.responsibility->select(r1 | r1.ID.matches('^.*Store.*$'))\n"
			+ "\t\t\t\t\t\t\t->select(r2 | r2.incomingassets->select(asset | r.incomingassets->includes(asset))->size()>0 or  \n"
			+ "\t\t\t\t\t\t\t\t\t\t  r2.outgoingassets->select(asset | r.incomingassets->includes(asset))->size()>0\n"
			+ "\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\t\t\t->size() > 0\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the CopierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_CopierSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CopierSemanticConstraint",
				NODE__COPIER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ForwardSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__FORWARD_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Forward.*$'))\n" + "\t\t\t\t->forAll(r | \n"
			+ "\t\t\t\t\tr.outgoingassets->size() > 0 and r.incomingassets->size() > 0\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the ForwardSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ForwardSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ForwardSemanticConstraint",
				NODE__FORWARD_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SplitterSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__SPLITTER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Splitter.*$'))\n" + "\t\t\t\t->forAll(r | \n"
			+ "\t\t\t\t\t-- negated join operation\n"
			+ "\t\t\t\t\tr.outgoingassets->size() >= 2 and r.incomingassets->size() >= 1 and r.incomingassets->size() < r.outgoingassets->size()\t\n"
			+ "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the SplitterSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_SplitterSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SplitterSemanticConstraint",
				NODE__SPLITTER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UserSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__USER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*User.*$'))\n" + "\t\t\t\t->forAll(r |  \n"
			+ "\t\t\t\t\tr.incomingassets->size() > 0\t\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the UserSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UserSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UserSemanticConstraint",
				NODE__USER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the VerifierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__VERIFIER_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Verifier.*$'))\n" + "\t\t\t\t->forAll(r |  \n"
			+ "\t\t\t\t\tr.incomingassets->size() > 0\t\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the VerifierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_VerifierSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "VerifierSemanticConstraint",
				NODE__VERIFIER_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AuthenticatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__AUTHENTICATOR_SEMANTIC_CONSTRAINT__EEXPRESSION = "\n"
			+ "\t\t\tself.responsibility->select(r | r.ID.matches('^.*Authenticator.*$'))\n" + "\t\t\t\t->forAll(r |\n"
			+ "\t\t\t\t\t-- same as comparator!\n"
			+ "\t\t\t\t\tr.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1\n" + "\t\t\t\t)\n" + "\t\t";

	/**
	 * Validates the AuthenticatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AuthenticatorSemanticConstraint(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GraphPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AuthenticatorSemanticConstraint",
				NODE__AUTHENTICATOR_SEMANTIC_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubgraphs(Subgraphs subgraphs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subgraphs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeResponsibility(NodeResponsibility nodeResponsibility, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeResponsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraph(Graph graph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graph, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GraphValidator
