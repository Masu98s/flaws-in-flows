/**
 */
package graph.util;

import graph.*;

import java.util.Map;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Copier Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__COPIER_SEMANTIC_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Verifier Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__VERIFIER_SEMANTIC_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Business Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__BUSINESS_SEMANTIC_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encrypt Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__ENCRYPT_SEMANTIC_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Joiner Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__JOINER_SEMANTIC_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Decrypt Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DECRYPT_SEMANTIC_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Store Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__STORE_SEMANTIC_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Comparator Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__COMPARATOR_SEMANTIC_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Discarder Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__DISCARDER_SEMANTIC_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attacker Observation Violation' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__ATTACKER_OBSERVATION_VIOLATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Splitter Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__SPLITTER_SEMANTIC_CONSTRAINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Forward Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__FORWARD_SEMANTIC_CONSTRAINT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authenticator Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__AUTHENTICATOR_SEMANTIC_CONSTRAINT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Semantic Constraint' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__USER_SEMANTIC_CONSTRAINT = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

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
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GraphPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case GraphPackage.IDENTIFIABLE:
				return validateIdentifiable((Identifiable)value, diagnostics, context);
			case GraphPackage.GRAPH_ASSET:
				return validateGraphAsset((GraphAsset)value, diagnostics, context);
			case GraphPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case GraphPackage.SUBGRAPHS:
				return validateSubgraphs((Subgraphs)value, diagnostics, context);
			case GraphPackage.NODE_RESPONSIBILITY:
				return validateNodeResponsibility((NodeResponsibility)value, diagnostics, context);
			case GraphPackage.GRAPH:
				return validateGraph((Graph)value, diagnostics, context);
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
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAsset(GraphAsset graphAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UserSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_CopierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_VerifierSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_BusinessSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_EncryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_JoinerSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DecryptSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StoreSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ComparatorSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_DiscarderSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_AttackerObservationViolation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_SplitterSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ForwardSemanticConstraint(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_AuthenticatorSemanticConstraint(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AttackerObservationViolation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AttackerObservationViolation(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.AttackerObservationViolation(diagnostics, context);
	}

	/**
	 * Validates the EncryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_EncryptSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.EncryptSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DecryptSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DecryptSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DecryptSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the StoreSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StoreSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.StoreSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the BusinessSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_BusinessSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.BusinessSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ComparatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ComparatorSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ComparatorSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the JoinerSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_JoinerSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.JoinerSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the DiscarderSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_DiscarderSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.DiscarderSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the CopierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_CopierSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.CopierSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the ForwardSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ForwardSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.ForwardSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the SplitterSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_SplitterSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.SplitterSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the UserSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UserSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.UserSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the VerifierSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_VerifierSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.VerifierSemanticConstraint(diagnostics, context);
	}

	/**
	 * Validates the AuthenticatorSemanticConstraint constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_AuthenticatorSemanticConstraint(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.AuthenticatorSemanticConstraint(diagnostics, context);
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
	public boolean validateNodeResponsibility(NodeResponsibility nodeResponsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
