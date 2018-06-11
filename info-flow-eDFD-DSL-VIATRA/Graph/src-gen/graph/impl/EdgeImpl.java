/**
 */
package graph.impl;

import graph.Edge;
import graph.GraphAsset;
import graph.GraphPackage;
import graph.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.EdgeImpl#getID <em>ID</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#getEdgeLabel <em>Edge Label</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#getGraphassets <em>Graphassets</em>}</li>
 *   <li>{@link graph.impl.EdgeImpl#isVisited <em>Visited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The default value of the '{@link #getEdgeLabel() <em>Edge Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected static final int EDGE_LABEL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getEdgeLabel() <em>Edge Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected int edgeLabel = EDGE_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraphassets() <em>Graphassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphassets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphAsset> graphassets;

	/**
	 * The default value of the '{@link #isVisited() <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisited() <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisited()
	 * @generated
	 * @ordered
	 */
	protected boolean visited = VISITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Node>(Node.class, this, GraphPackage.EDGE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Node) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.EDGE__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Node newSource) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdgeLabel() {
		return edgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeLabel(int newEdgeLabel) {
		int oldEdgeLabel = edgeLabel;
		edgeLabel = newEdgeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__EDGE_LABEL, oldEdgeLabel,
					edgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphAsset> getGraphassets() {
		if (graphassets == null) {
			graphassets = new EObjectResolvingEList<GraphAsset>(GraphAsset.class, this, GraphPackage.EDGE__GRAPHASSETS);
		}
		return graphassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisited(boolean newVisited) {
		boolean oldVisited = visited;
		visited = newVisited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__VISITED, oldVisited, visited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.EDGE__ID:
			return getID();
		case GraphPackage.EDGE__NUMBER:
			return getNumber();
		case GraphPackage.EDGE__TARGET:
			return getTarget();
		case GraphPackage.EDGE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GraphPackage.EDGE__EDGE_LABEL:
			return getEdgeLabel();
		case GraphPackage.EDGE__GRAPHASSETS:
			return getGraphassets();
		case GraphPackage.EDGE__VISITED:
			return isVisited();
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
		case GraphPackage.EDGE__ID:
			setID((String) newValue);
			return;
		case GraphPackage.EDGE__NUMBER:
			setNumber((Integer) newValue);
			return;
		case GraphPackage.EDGE__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends Node>) newValue);
			return;
		case GraphPackage.EDGE__SOURCE:
			setSource((Node) newValue);
			return;
		case GraphPackage.EDGE__EDGE_LABEL:
			setEdgeLabel((Integer) newValue);
			return;
		case GraphPackage.EDGE__GRAPHASSETS:
			getGraphassets().clear();
			getGraphassets().addAll((Collection<? extends GraphAsset>) newValue);
			return;
		case GraphPackage.EDGE__VISITED:
			setVisited((Boolean) newValue);
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
		case GraphPackage.EDGE__ID:
			setID(ID_EDEFAULT);
			return;
		case GraphPackage.EDGE__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case GraphPackage.EDGE__TARGET:
			getTarget().clear();
			return;
		case GraphPackage.EDGE__SOURCE:
			setSource((Node) null);
			return;
		case GraphPackage.EDGE__EDGE_LABEL:
			setEdgeLabel(EDGE_LABEL_EDEFAULT);
			return;
		case GraphPackage.EDGE__GRAPHASSETS:
			getGraphassets().clear();
			return;
		case GraphPackage.EDGE__VISITED:
			setVisited(VISITED_EDEFAULT);
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
		case GraphPackage.EDGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphPackage.EDGE__NUMBER:
			return number != NUMBER_EDEFAULT;
		case GraphPackage.EDGE__TARGET:
			return target != null && !target.isEmpty();
		case GraphPackage.EDGE__SOURCE:
			return source != null;
		case GraphPackage.EDGE__EDGE_LABEL:
			return edgeLabel != EDGE_LABEL_EDEFAULT;
		case GraphPackage.EDGE__GRAPHASSETS:
			return graphassets != null && !graphassets.isEmpty();
		case GraphPackage.EDGE__VISITED:
			return visited != VISITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", number: ");
		result.append(number);
		result.append(", EdgeLabel: ");
		result.append(edgeLabel);
		result.append(", visited: ");
		result.append(visited);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
