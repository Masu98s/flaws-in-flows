/**
 */
package graph.impl;

import graph.Edge;
import graph.GraphPackage;
import graph.Node;
import graph.NodeResponsibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.NodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getOutedges <em>Outedges</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getAttackerObservation <em>Attacker Observation</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#isVisited <em>Visited</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getInedges <em>Inedges</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#isAttacker <em>Attacker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The cached value of the '{@link #getOutedges() <em>Outedges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutedges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outedges;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeResponsibility> responsibility;

	/**
	 * The default value of the '{@link #getAttackerObservation() <em>Attacker Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerObservation()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_OBSERVATION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getAttackerObservation() <em>Attacker Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerObservation()
	 * @generated
	 * @ordered
	 */
	protected int attackerObservation = ATTACKER_OBSERVATION_EDEFAULT;

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
	 * The cached value of the '{@link #getInedges() <em>Inedges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInedges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> inedges;

	/**
	 * The default value of the '{@link #isAttacker() <em>Attacker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttacker()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTACKER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttacker() <em>Attacker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttacker()
	 * @generated
	 * @ordered
	 */
	protected boolean attacker = ATTACKER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutedges() {
		if (outedges == null) {
			outedges = new EObjectContainmentEList<Edge>(Edge.class, this, GraphPackage.NODE__OUTEDGES);
		}
		return outedges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeResponsibility> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectContainmentEList<NodeResponsibility>(NodeResponsibility.class, this,
					GraphPackage.NODE__RESPONSIBILITY);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerObservation() {
		return attackerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerObservation(int newAttackerObservation) {
		int oldAttackerObservation = attackerObservation;
		attackerObservation = newAttackerObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__ATTACKER_OBSERVATION,
					oldAttackerObservation, attackerObservation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__VISITED, oldVisited, visited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getInedges() {
		if (inedges == null) {
			inedges = new EObjectResolvingEList<Edge>(Edge.class, this, GraphPackage.NODE__INEDGES);
		}
		return inedges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttacker() {
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttacker(boolean newAttacker) {
		boolean oldAttacker = attacker;
		attacker = newAttacker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__ATTACKER, oldAttacker, attacker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.NODE__OUTEDGES:
			return ((InternalEList<?>) getOutedges()).basicRemove(otherEnd, msgs);
		case GraphPackage.NODE__RESPONSIBILITY:
			return ((InternalEList<?>) getResponsibility()).basicRemove(otherEnd, msgs);
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
		case GraphPackage.NODE__ID:
			return getID();
		case GraphPackage.NODE__NUMBER:
			return getNumber();
		case GraphPackage.NODE__OUTEDGES:
			return getOutedges();
		case GraphPackage.NODE__NAME:
			return getName();
		case GraphPackage.NODE__RESPONSIBILITY:
			return getResponsibility();
		case GraphPackage.NODE__ATTACKER_OBSERVATION:
			return getAttackerObservation();
		case GraphPackage.NODE__VISITED:
			return isVisited();
		case GraphPackage.NODE__INEDGES:
			return getInedges();
		case GraphPackage.NODE__ATTACKER:
			return isAttacker();
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
		case GraphPackage.NODE__ID:
			setID((String) newValue);
			return;
		case GraphPackage.NODE__NUMBER:
			setNumber((Integer) newValue);
			return;
		case GraphPackage.NODE__OUTEDGES:
			getOutedges().clear();
			getOutedges().addAll((Collection<? extends Edge>) newValue);
			return;
		case GraphPackage.NODE__NAME:
			setName((String) newValue);
			return;
		case GraphPackage.NODE__RESPONSIBILITY:
			getResponsibility().clear();
			getResponsibility().addAll((Collection<? extends NodeResponsibility>) newValue);
			return;
		case GraphPackage.NODE__ATTACKER_OBSERVATION:
			setAttackerObservation((Integer) newValue);
			return;
		case GraphPackage.NODE__VISITED:
			setVisited((Boolean) newValue);
			return;
		case GraphPackage.NODE__INEDGES:
			getInedges().clear();
			getInedges().addAll((Collection<? extends Edge>) newValue);
			return;
		case GraphPackage.NODE__ATTACKER:
			setAttacker((Boolean) newValue);
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
		case GraphPackage.NODE__ID:
			setID(ID_EDEFAULT);
			return;
		case GraphPackage.NODE__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case GraphPackage.NODE__OUTEDGES:
			getOutedges().clear();
			return;
		case GraphPackage.NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GraphPackage.NODE__RESPONSIBILITY:
			getResponsibility().clear();
			return;
		case GraphPackage.NODE__ATTACKER_OBSERVATION:
			setAttackerObservation(ATTACKER_OBSERVATION_EDEFAULT);
			return;
		case GraphPackage.NODE__VISITED:
			setVisited(VISITED_EDEFAULT);
			return;
		case GraphPackage.NODE__INEDGES:
			getInedges().clear();
			return;
		case GraphPackage.NODE__ATTACKER:
			setAttacker(ATTACKER_EDEFAULT);
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
		case GraphPackage.NODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphPackage.NODE__NUMBER:
			return number != NUMBER_EDEFAULT;
		case GraphPackage.NODE__OUTEDGES:
			return outedges != null && !outedges.isEmpty();
		case GraphPackage.NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GraphPackage.NODE__RESPONSIBILITY:
			return responsibility != null && !responsibility.isEmpty();
		case GraphPackage.NODE__ATTACKER_OBSERVATION:
			return attackerObservation != ATTACKER_OBSERVATION_EDEFAULT;
		case GraphPackage.NODE__VISITED:
			return visited != VISITED_EDEFAULT;
		case GraphPackage.NODE__INEDGES:
			return inedges != null && !inedges.isEmpty();
		case GraphPackage.NODE__ATTACKER:
			return attacker != ATTACKER_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", AttackerObservation: ");
		result.append(attackerObservation);
		result.append(", visited: ");
		result.append(visited);
		result.append(", Attacker: ");
		result.append(attacker);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
