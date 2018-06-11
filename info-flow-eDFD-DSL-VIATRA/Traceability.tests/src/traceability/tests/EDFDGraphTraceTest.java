/**
 */
package traceability.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import traceability.EDFDGraphTrace;
import traceability.TraceabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EDFD Graph Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDFDGraphTraceTest extends TestCase {

	/**
	 * The fixture for this EDFD Graph Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDGraphTrace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EDFDGraphTraceTest.class);
	}

	/**
	 * Constructs a new EDFD Graph Trace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDGraphTraceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EDFD Graph Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EDFDGraphTrace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EDFD Graph Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDGraphTrace getFixture() {
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
		setFixture(TraceabilityFactory.eINSTANCE.createEDFDGraphTrace());
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

} //EDFDGraphTraceTest
