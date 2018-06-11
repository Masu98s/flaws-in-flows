/**
 */
package traceability.impl;

import graph.Identifiable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import traceability.GraphEndToEndTrace;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph End To End Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceability.impl.GraphEndToEndTraceImpl#getEndtoendGraphElements <em>Endtoend Graph Elements</em>}</li>
 *   <li>{@link traceability.impl.GraphEndToEndTraceImpl#getGraphElements <em>Graph Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphEndToEndTraceImpl extends MinimalEObjectImpl.Container implements GraphEndToEndTrace {
	/**
	 * The cached value of the '{@link #getEndtoendGraphElements() <em>Endtoend Graph Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtoendGraphElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> endtoendGraphElements;

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
	protected GraphEndToEndTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.GRAPH_END_TO_END_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getEndtoendGraphElements() {
		if (endtoendGraphElements == null) {
			endtoendGraphElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TraceabilityPackage.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS);
		}
		return endtoendGraphElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getGraphElements() {
		if (graphElements == null) {
			graphElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TraceabilityPackage.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS);
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
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS:
				return getEndtoendGraphElements();
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS:
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
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS:
				getEndtoendGraphElements().clear();
				getEndtoendGraphElements().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS:
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
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS:
				getEndtoendGraphElements().clear();
				return;
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS:
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
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS:
				return endtoendGraphElements != null && !endtoendGraphElements.isEmpty();
			case TraceabilityPackage.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS:
				return graphElements != null && !graphElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphEndToEndTraceImpl
