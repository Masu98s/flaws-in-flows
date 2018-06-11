/**
 */
package traceability.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import traceability.EDFDToGraph;
import traceability.TraceabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EDFD To Graph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDFDToGraphTest extends TestCase {

	/**
	 * The fixture for this EDFD To Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDToGraph fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EDFDToGraphTest.class);
	}

	/**
	 * Constructs a new EDFD To Graph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDToGraphTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EDFD To Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EDFDToGraph fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EDFD To Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDToGraph getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceabilityFactory.eINSTANCE.createEDFDToGraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EDFDToGraphTest
