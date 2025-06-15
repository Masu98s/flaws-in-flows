/**
 */
package traceability.impl;

import org.secdfd.model.EDFD;

import graph.Graph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.EDFDGraphTrace;
import traceability.EDFDToGraph;
import traceability.GraphEndToEndTrace;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDFD To Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceability.impl.EDFDToGraphImpl#getEdfdGraphTraces <em>Edfd Graph Traces</em>}</li>
 *   <li>{@link traceability.impl.EDFDToGraphImpl#getEdfds <em>Edfds</em>}</li>
 *   <li>{@link traceability.impl.EDFDToGraphImpl#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link traceability.impl.EDFDToGraphImpl#getEndtoendgraph <em>Endtoendgraph</em>}</li>
 *   <li>{@link traceability.impl.EDFDToGraphImpl#getGraphEndToEndTrace <em>Graph End To End Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDFDToGraphImpl extends MinimalEObjectImpl.Container implements EDFDToGraph {
	/**
	 * The cached value of the '{@link #getEdfdGraphTraces() <em>Edfd Graph Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdfdGraphTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<EDFDGraphTrace> edfdGraphTraces;

	/**
	 * The cached value of the '{@link #getEdfds() <em>Edfds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdfds()
	 * @generated
	 * @ordered
	 */
	protected EDFD edfds;

	/**
	 * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected Graph graphs;

	/**
	 * The cached value of the '{@link #getEndtoendgraph() <em>Endtoendgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtoendgraph()
	 * @generated
	 * @ordered
	 */
	protected Graph endtoendgraph;

	/**
	 * The cached value of the '{@link #getGraphEndToEndTrace() <em>Graph End To End Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphEndToEndTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEndToEndTrace> graphEndToEndTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDToGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.EDFD_TO_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EDFDGraphTrace> getEdfdGraphTraces() {
		if (edfdGraphTraces == null) {
			edfdGraphTraces = new EObjectContainmentEList<EDFDGraphTrace>(EDFDGraphTrace.class, this, TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES);
		}
		return edfdGraphTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDFD getEdfds() {
		if (edfds != null && edfds.eIsProxy()) {
			InternalEObject oldEdfds = (InternalEObject)edfds;
			edfds = (EDFD)eResolveProxy(oldEdfds);
			if (edfds != oldEdfds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.EDFD_TO_GRAPH__EDFDS, oldEdfds, edfds));
			}
		}
		return edfds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFD basicGetEdfds() {
		return edfds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdfds(EDFD newEdfds) {
		EDFD oldEdfds = edfds;
		edfds = newEdfds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.EDFD_TO_GRAPH__EDFDS, oldEdfds, edfds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraphs() {
		if (graphs != null && graphs.eIsProxy()) {
			InternalEObject oldGraphs = (InternalEObject)graphs;
			graphs = (Graph)eResolveProxy(oldGraphs);
			if (graphs != oldGraphs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS, oldGraphs, graphs));
			}
		}
		return graphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraphs() {
		return graphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphs(Graph newGraphs) {
		Graph oldGraphs = graphs;
		graphs = newGraphs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS, oldGraphs, graphs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getEndtoendgraph() {
		if (endtoendgraph != null && endtoendgraph.eIsProxy()) {
			InternalEObject oldEndtoendgraph = (InternalEObject)endtoendgraph;
			endtoendgraph = (Graph)eResolveProxy(oldEndtoendgraph);
			if (endtoendgraph != oldEndtoendgraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH, oldEndtoendgraph, endtoendgraph));
			}
		}
		return endtoendgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetEndtoendgraph() {
		return endtoendgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndtoendgraph(Graph newEndtoendgraph) {
		Graph oldEndtoendgraph = endtoendgraph;
		endtoendgraph = newEndtoendgraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH, oldEndtoendgraph, endtoendgraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphEndToEndTrace> getGraphEndToEndTrace() {
		if (graphEndToEndTrace == null) {
			graphEndToEndTrace = new EObjectContainmentEList<GraphEndToEndTrace>(GraphEndToEndTrace.class, this, TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE);
		}
		return graphEndToEndTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES:
				return ((InternalEList<?>)getEdfdGraphTraces()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE:
				return ((InternalEList<?>)getGraphEndToEndTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES:
				return getEdfdGraphTraces();
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFDS:
				if (resolve) return getEdfds();
				return basicGetEdfds();
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS:
				if (resolve) return getGraphs();
				return basicGetGraphs();
			case TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH:
				if (resolve) return getEndtoendgraph();
				return basicGetEndtoendgraph();
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE:
				return getGraphEndToEndTrace();
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
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES:
				getEdfdGraphTraces().clear();
				getEdfdGraphTraces().addAll((Collection<? extends EDFDGraphTrace>)newValue);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFDS:
				setEdfds((EDFD)newValue);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS:
				setGraphs((Graph)newValue);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH:
				setEndtoendgraph((Graph)newValue);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE:
				getGraphEndToEndTrace().clear();
				getGraphEndToEndTrace().addAll((Collection<? extends GraphEndToEndTrace>)newValue);
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
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES:
				getEdfdGraphTraces().clear();
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFDS:
				setEdfds((EDFD)null);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS:
				setGraphs((Graph)null);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH:
				setEndtoendgraph((Graph)null);
				return;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE:
				getGraphEndToEndTrace().clear();
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
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES:
				return edfdGraphTraces != null && !edfdGraphTraces.isEmpty();
			case TraceabilityPackage.EDFD_TO_GRAPH__EDFDS:
				return edfds != null;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPHS:
				return graphs != null;
			case TraceabilityPackage.EDFD_TO_GRAPH__ENDTOENDGRAPH:
				return endtoendgraph != null;
			case TraceabilityPackage.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE:
				return graphEndToEndTrace != null && !graphEndToEndTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EDFDToGraphImpl
