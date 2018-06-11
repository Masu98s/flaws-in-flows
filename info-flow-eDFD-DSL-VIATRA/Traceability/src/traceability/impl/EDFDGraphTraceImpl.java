/**
 */
package traceability.impl;

import eDFDFlowTracking.NamedEntity;

import graph.Identifiable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import traceability.EDFDGraphTrace;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDFD Graph Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceability.impl.EDFDGraphTraceImpl#getEdfdElements <em>Edfd Elements</em>}</li>
 *   <li>{@link traceability.impl.EDFDGraphTraceImpl#getGraphElements <em>Graph Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDFDGraphTraceImpl extends MinimalEObjectImpl.Container implements EDFDGraphTrace {
	/**
	 * The cached value of the '{@link #getEdfdElements() <em>Edfd Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdfdElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedEntity> edfdElements;

	/**
	 * The cached value of the '{@link #getGraphElements() <em>Graph Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> graphElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDGraphTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.EDFD_GRAPH_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedEntity> getEdfdElements() {
		if (edfdElements == null) {
			edfdElements = new EObjectResolvingEList<NamedEntity>(NamedEntity.class, this, TraceabilityPackage.EDFD_GRAPH_TRACE__EDFD_ELEMENTS);
		}
		return edfdElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getGraphElements() {
		if (graphElements == null) {
			graphElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TraceabilityPackage.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS);
		}
		return graphElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_GRAPH_TRACE__EDFD_ELEMENTS:
				return getEdfdElements();
			case TraceabilityPackage.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS:
				return getGraphElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_GRAPH_TRACE__EDFD_ELEMENTS:
				getEdfdElements().clear();
				getEdfdElements().addAll((Collection<? extends NamedEntity>)newValue);
				return;
			case TraceabilityPackage.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS:
				getGraphElements().clear();
				getGraphElements().addAll((Collection<? extends Identifiable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_GRAPH_TRACE__EDFD_ELEMENTS:
				getEdfdElements().clear();
				return;
			case TraceabilityPackage.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS:
				getGraphElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_GRAPH_TRACE__EDFD_ELEMENTS:
				return edfdElements != null && !edfdElements.isEmpty();
			case TraceabilityPackage.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS:
				return graphElements != null && !graphElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EDFDGraphTraceImpl
