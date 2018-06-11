/**
 */
package traceability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see traceability.TraceabilityPackage
 * @generated
 */
public interface TraceabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityFactory eINSTANCE = traceability.impl.TraceabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDFD To Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDFD To Graph</em>'.
	 * @generated
	 */
	EDFDToGraph createEDFDToGraph();

	/**
	 * Returns a new object of class '<em>EDFD Graph Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDFD Graph Trace</em>'.
	 * @generated
	 */
	EDFDGraphTrace createEDFDGraphTrace();

	/**
	 * Returns a new object of class '<em>Graph End To End Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph End To End Trace</em>'.
	 * @generated
	 */
	GraphEndToEndTrace createGraphEndToEndTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraceabilityPackage getTraceabilityPackage();

} //TraceabilityFactory
