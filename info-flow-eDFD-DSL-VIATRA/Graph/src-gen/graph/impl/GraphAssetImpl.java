/**
 */
package graph.impl;

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
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.GraphAssetImpl#getID <em>ID</em>}</li>
 *   <li>{@link graph.impl.GraphAssetImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link graph.impl.GraphAssetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link graph.impl.GraphAssetImpl#getSource <em>Source</em>}</li>
 *   <li>{@link graph.impl.GraphAssetImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link graph.impl.GraphAssetImpl#isEncrypted <em>Encrypted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphAssetImpl extends MinimalEObjectImpl.Container implements GraphAsset {
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
	protected static final int NUMBER_EDEFAULT = -1;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final int LABEL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected int label = LABEL_EDEFAULT;

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
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> targets;

	/**
	 * The default value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypted() <em>Encrypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypted = ENCRYPTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GRAPH_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ASSET__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ASSET__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(int newLabel) {
		int oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ASSET__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Node) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GRAPH_ASSET__SOURCE,
							oldSource, source));
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
	@Override
	public void setSource(Node newSource) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ASSET__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Node>(Node.class, this, GraphPackage.GRAPH_ASSET__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEncrypted() {
		return encrypted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncrypted(boolean newEncrypted) {
		boolean oldEncrypted = encrypted;
		encrypted = newEncrypted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ASSET__ENCRYPTED, oldEncrypted,
					encrypted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.GRAPH_ASSET__ID:
			return getID();
		case GraphPackage.GRAPH_ASSET__NUMBER:
			return getNumber();
		case GraphPackage.GRAPH_ASSET__LABEL:
			return getLabel();
		case GraphPackage.GRAPH_ASSET__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GraphPackage.GRAPH_ASSET__TARGETS:
			return getTargets();
		case GraphPackage.GRAPH_ASSET__ENCRYPTED:
			return isEncrypted();
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
		case GraphPackage.GRAPH_ASSET__ID:
			setID((String) newValue);
			return;
		case GraphPackage.GRAPH_ASSET__NUMBER:
			setNumber((Integer) newValue);
			return;
		case GraphPackage.GRAPH_ASSET__LABEL:
			setLabel((Integer) newValue);
			return;
		case GraphPackage.GRAPH_ASSET__SOURCE:
			setSource((Node) newValue);
			return;
		case GraphPackage.GRAPH_ASSET__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends Node>) newValue);
			return;
		case GraphPackage.GRAPH_ASSET__ENCRYPTED:
			setEncrypted((Boolean) newValue);
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
		case GraphPackage.GRAPH_ASSET__ID:
			setID(ID_EDEFAULT);
			return;
		case GraphPackage.GRAPH_ASSET__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case GraphPackage.GRAPH_ASSET__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case GraphPackage.GRAPH_ASSET__SOURCE:
			setSource((Node) null);
			return;
		case GraphPackage.GRAPH_ASSET__TARGETS:
			getTargets().clear();
			return;
		case GraphPackage.GRAPH_ASSET__ENCRYPTED:
			setEncrypted(ENCRYPTED_EDEFAULT);
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
		case GraphPackage.GRAPH_ASSET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphPackage.GRAPH_ASSET__NUMBER:
			return number != NUMBER_EDEFAULT;
		case GraphPackage.GRAPH_ASSET__LABEL:
			return label != LABEL_EDEFAULT;
		case GraphPackage.GRAPH_ASSET__SOURCE:
			return source != null;
		case GraphPackage.GRAPH_ASSET__TARGETS:
			return targets != null && !targets.isEmpty();
		case GraphPackage.GRAPH_ASSET__ENCRYPTED:
			return encrypted != ENCRYPTED_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", number: ");
		result.append(number);
		result.append(", Label: ");
		result.append(label);
		result.append(", Encrypted: ");
		result.append(encrypted);
		result.append(')');
		return result.toString();
	}

} //GraphAssetImpl
