/**
 */
package traceability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import traceability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityFactoryImpl extends EFactoryImpl implements TraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityFactory init() {
		try {
			TraceabilityFactory theTraceabilityFactory = (TraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(TraceabilityPackage.eNS_URI);
			if (theTraceabilityFactory != null) {
				return theTraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraceabilityPackage.EDFD_TO_GRAPH: return createEDFDToGraph();
			case TraceabilityPackage.EDFD_GRAPH_TRACE: return createEDFDGraphTrace();
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE: return createGraphEndToEndTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDToGraph createEDFDToGraph() {
		EDFDToGraphImpl edfdToGraph = new EDFDToGraphImpl();
		return edfdToGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDGraphTrace createEDFDGraphTrace() {
		EDFDGraphTraceImpl edfdGraphTrace = new EDFDGraphTraceImpl();
		return edfdGraphTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEndToEndTrace createGraphEndToEndTrace() {
		GraphEndToEndTraceImpl graphEndToEndTrace = new GraphEndToEndTraceImpl();
		return graphEndToEndTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityPackage getTraceabilityPackage() {
		return (TraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityPackage getPackage() {
		return TraceabilityPackage.eINSTANCE;
	}

} //TraceabilityFactoryImpl
