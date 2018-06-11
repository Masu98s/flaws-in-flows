/**
 */
package traceability.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import traceability.GraphEndToEndTrace;
import traceability.TraceabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graph End To End Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphEndToEndTraceTest extends TestCase {

	/**
	 * The fixture for this Graph End To End Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphEndToEndTrace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphEndToEndTraceTest.class);
	}

	/**
	 * Constructs a new Graph End To End Trace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEndToEndTraceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Graph End To End Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GraphEndToEndTrace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Graph End To End Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphEndToEndTrace getFixture() {
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
		setFixture(TraceabilityFactory.eINSTANCE.createGraphEndToEndTrace());
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

} //GraphEndToEndTraceTest
