/**
 */
package graph.impl;

import graph.Edge;
import graph.GraphAsset;
import graph.GraphPackage;
import graph.GraphTables;
import graph.Node;
import graph.NodeResponsibility;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public int getAttackerObservation() {
		return attackerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isVisited() {
		return visited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public boolean isAttacker() {
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public boolean CopierSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::CopierSemanticConstraint";
		try {
			/**
			 *
			 * inv CopierSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Copier.*$'))
			 *         ->forAll(r |
			 *           r.outgoingassets->size() > 0 and
			 *           r.incomingassets->size() > 0 and
			 *           self.responsibility->select(r1 |
			 *             r1.ID.matches('^.*Store.*$'))
			 *           ->select(r2 |
			 *             (
			 *               r2.incomingassets->select(asset |
			 *                 r.incomingassets->includes(asset))
			 *               ->size() > 0 or
			 *               r2.outgoingassets->select(asset |
			 *                 r.incomingassets->includes(asset))
			 *               ->size() > 0
			 *             ))
			 *           ->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___COPIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Copier.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Copier_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 *
						 * r.outgoingassets->size() > 0 and
						 * r.incomingassets->size() > 0 and
						 * self.responsibility->select(r1 | r1.ID.matches('^.*Store.*$'))
						 * ->select(r2 |
						 *   (
						 *     r2.incomingassets->select(asset |
						 *       r.incomingassets->includes(asset))
						 *     ->size() > 0 or
						 *     r2.outgoingassets->select(asset |
						 *       r.incomingassets->includes(asset))
						 *     ->size() > 0
						 *   ))
						 * ->size() > 0
						 */
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size, GraphTables.INT_0).booleanValue();
							final /*@NonInvalid*/ Boolean and;
							if (!gt) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
										.evaluate(BOXED_incomingassets);
								final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
								if (!gt_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_gt_3;
								try {
									/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createOrderedSetAccumulatorValue(
											GraphTables.ORD_CLSSid_NodeResponsibility);
									Iterator<Object> ITERATOR_r1 = BOXED_responsibility.iterator();
									/*@Thrown*/ OrderedSetValue select_1;
									while (true) {
										if (!ITERATOR_r1.hasNext()) {
											select_1 = accumulator_1;
											break;
										}
										/*@NonInvalid*/ NodeResponsibility r1 = (NodeResponsibility) ITERATOR_r1.next();
										/**
										 * r1.ID.matches('^.*Store.*$')
										 */
										final /*@NonInvalid*/ String ID_0 = r1.getID();
										if (ID_0 == null) {
											throw new InvalidValueException(
													"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
										}
										final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE
												.evaluate(executor, TypeId.BOOLEAN, ID_0,
														GraphTables.STR__94__a_Store_a_$)
												.booleanValue();
										//
										if (matches_0 == ValueUtil.TRUE_VALUE) {
											accumulator_1.add(r1);
										}
									}
									/*@Thrown*/ Accumulator accumulator_2 = ValueUtil.createOrderedSetAccumulatorValue(
											GraphTables.ORD_CLSSid_NodeResponsibility);
									Iterator<Object> ITERATOR_r2 = select_1.iterator();
									/*@Thrown*/ OrderedSetValue select_0;
									while (true) {
										if (!ITERATOR_r2.hasNext()) {
											select_0 = accumulator_2;
											break;
										}
										/*@NonInvalid*/ NodeResponsibility r2 = (NodeResponsibility) ITERATOR_r2.next();
										/**
										 *
										 * r2.incomingassets->select(asset | r.incomingassets->includes(asset))
										 * ->size() > 0 or
										 * r2.outgoingassets->select(asset | r.incomingassets->includes(asset))
										 * ->size() > 0
										 */
										final /*@NonInvalid*/ List<GraphAsset> incomingassets_0 = r2
												.getIncomingassets();
										final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets_0 = idResolver
												.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset,
														incomingassets_0);
										/*@Thrown*/ Accumulator accumulator_3 = ValueUtil
												.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_GraphAsset);
										Iterator<Object> ITERATOR_asset = BOXED_incomingassets_0.iterator();
										/*@NonInvalid*/ OrderedSetValue select_2;
										while (true) {
											if (!ITERATOR_asset.hasNext()) {
												select_2 = accumulator_3;
												break;
											}
											/*@NonInvalid*/ GraphAsset asset = (GraphAsset) ITERATOR_asset.next();
											/**
											 * r.incomingassets->includes(asset)
											 */
											final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
													.evaluate(BOXED_incomingassets, asset).booleanValue();
											//
											if (includes) {
												accumulator_3.add(asset);
											}
										}
										final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
												.evaluate(select_2);
										final /*@NonInvalid*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE
												.evaluate(executor, size_1, GraphTables.INT_0).booleanValue();
										final /*@NonInvalid*/ Boolean or;
										if (gt_1) {
											or = ValueUtil.TRUE_VALUE;
										} else {
											final /*@NonInvalid*/ List<GraphAsset> outgoingassets_0 = r2
													.getOutgoingassets();
											final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets_0 = idResolver
													.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset,
															outgoingassets_0);
											/*@Thrown*/ Accumulator accumulator_4 = ValueUtil
													.createOrderedSetAccumulatorValue(
															GraphTables.ORD_CLSSid_GraphAsset);
											Iterator<Object> ITERATOR_asset_0 = BOXED_outgoingassets_0.iterator();
											/*@NonInvalid*/ OrderedSetValue select_3;
											while (true) {
												if (!ITERATOR_asset_0.hasNext()) {
													select_3 = accumulator_4;
													break;
												}
												/*@NonInvalid*/ GraphAsset asset_0 = (GraphAsset) ITERATOR_asset_0
														.next();
												/**
												 * r.incomingassets->includes(asset)
												 */
												final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
														.evaluate(BOXED_incomingassets, asset_0).booleanValue();
												//
												if (includes_0) {
													accumulator_4.add(asset_0);
												}
											}
											final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE
													.evaluate(select_3);
											final /*@NonInvalid*/ boolean gt_2 = OclComparableGreaterThanOperation.INSTANCE
													.evaluate(executor, size_2, GraphTables.INT_0).booleanValue();
											if (gt_2) {
												or = ValueUtil.TRUE_VALUE;
											} else {
												or = ValueUtil.FALSE_VALUE;
											}
										}
										if (or == null) {
											throw new InvalidValueException(
													"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
										}
										//
										if (or == ValueUtil.TRUE_VALUE) {
											accumulator_2.add(r2);
										}
									}
									final /*@Thrown*/ IntegerValue size_3 = CollectionSizeOperation.INSTANCE
											.evaluate(select_0);
									final /*@Thrown*/ boolean gt_3 = OclComparableGreaterThanOperation.INSTANCE
											.evaluate(executor, size_3, GraphTables.INT_0).booleanValue();
									CAUGHT_gt_3 = gt_3;
								} catch (Exception e) {
									CAUGHT_gt_3 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_gt_3 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_gt_3 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_gt_3;
									}
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_and_0; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VerifierSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::VerifierSemanticConstraint";
		try {
			/**
			 *
			 * inv VerifierSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Verifier.*$'))
			 *         ->forAll(r | r.incomingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___VERIFIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Verifier.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Verifier_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						//
						if (!gt) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (gt) { // Normal successful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean BusinessSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::BusinessSemanticConstraint";
		try {
			/**
			 *
			 * inv BusinessSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Business.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() > 0 or
			 *           r.outgoingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___BUSINESS_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Business.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Business_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0 or r.outgoingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean or;
						if (gt) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
							if (gt_0) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						//
						if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (or == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EncryptSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::EncryptSemanticConstraint";
		try {
			/**
			 *
			 * inv EncryptSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*EncryptOrHash.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() > 0 and
			 *           r.outgoingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___ENCRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*EncryptOrHash.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_EncryptOrHash_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0 and r.outgoingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!gt) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
							if (!gt_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean JoinerSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::JoinerSemanticConstraint";
		try {
			/**
			 *
			 * inv JoinerSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Joiner.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() >= 2 and
			 *           r.outgoingassets->size() >= 1 and
			 *           r.outgoingassets->size() <
			 *           r.incomingassets->size())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___JOINER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Joiner.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Joiner_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 *
						 * r.incomingassets->size() >= 2 and
						 * r.outgoingassets->size() >= 1 and
						 * r.outgoingassets->size() <
						 * r.incomingassets->size()
						 */
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<GraphAsset> incomingassets_0 = r_0.getIncomingassets();
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets_0 = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets_0 = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets_0);
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets_0 = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets_0);
							final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_incomingassets_0);
							final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets_0);
							final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, size_2, GraphTables.INT_2).booleanValue();
							final /*@NonInvalid*/ Boolean and;
							if (!ge) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
										.evaluate(executor, size_1, GraphTables.INT_1).booleanValue();
								if (!ge_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, size_1, size_2).booleanValue();
								if (!lt) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_and_0; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean DecryptSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::DecryptSemanticConstraint";
		try {
			/**
			 *
			 * inv DecryptSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Descrypt.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() > 0 and
			 *           r.outgoingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___DECRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Descrypt.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Descrypt_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0 and r.outgoingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!gt) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
							if (!gt_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean StoreSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::StoreSemanticConstraint";
		try {
			/**
			 *
			 * inv StoreSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Store.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() > 0 or
			 *           r.outgoingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___STORE_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Store.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Store_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0 or r.outgoingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean or;
						if (gt) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
							if (gt_0) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						//
						if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (or == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ComparatorSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::ComparatorSemanticConstraint";
		try {
			/**
			 *
			 * inv ComparatorSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Comparator.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() >= 2 and
			 *           r.outgoingassets->size() >= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___COMPARATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Comparator.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Comparator_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_2).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_1).booleanValue();
							if (!ge_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean DiscarderSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::DiscarderSemanticConstraint";
		try {
			/**
			 *
			 * inv DiscarderSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Discarder.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->forAll(a | r.outgoingassets->excludes(a)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___DISCARDER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Discarder.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Discarder_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 *
						 * r.incomingassets->forAll(a | r.outgoingassets->excludes(a))
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_a = BOXED_incomingassets.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_a.hasNext()) {
								if (accumulator_1 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_1;
								}
								break;
							}
							/*@NonInvalid*/ GraphAsset a = (GraphAsset) ITERATOR_a.next();
							/**
							 * r.outgoingassets->excludes(a)
							 */
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ boolean excludes = CollectionExcludesOperation.INSTANCE
									.evaluate(BOXED_outgoingassets, a).booleanValue();
							//
							if (!excludes) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (excludes) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						//
						if (forAll == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (forAll == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (forAll == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AttackerObservationViolation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::AttackerObservationViolation";
		try {
			/**
			 *
			 * inv AttackerObservationViolation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.Attacker = true
			 *         then
			 *           self.outedges->forAll(e | e.EdgeLabel < 1) and
			 *           self.inedges->forAll(e | e.EdgeLabel < 1)
			 *         else true
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___ATTACKER_OBSERVATION_VIOLATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean Attacker = this.isAttacker();
					/*@Thrown*/ Boolean result;
					if (Attacker) {
						final /*@NonInvalid*/ List<Edge> outedges = this.getOutedges();
						final /*@NonInvalid*/ OrderedSetValue BOXED_outedges = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_Edge, outedges);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_e_0 = BOXED_outedges.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_e_0.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Edge e_0 = (Edge) ITERATOR_e_0.next();
							/**
							 * e.EdgeLabel < 1
							 */
							final /*@NonInvalid*/ int EdgeLabel = e_0.getEdgeLabel();
							final /*@NonInvalid*/ IntegerValue BOXED_EdgeLabel = ValueUtil.integerValueOf(EdgeLabel);
							final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, BOXED_EdgeLabel, GraphTables.INT_1).booleanValue();
							//
							if (!lt) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (lt) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						final /*@Thrown*/ Boolean and;
						if (forAll == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<Edge> inedges = this.getInedges();
							final /*@NonInvalid*/ OrderedSetValue BOXED_inedges = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_Edge, inedges);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_e_1 = BOXED_inedges.iterator();
							/*@NonInvalid*/ Boolean forAll_0;
							while (true) {
								if (!ITERATOR_e_1.hasNext()) {
									if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										forAll_0 = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ Edge e_1 = (Edge) ITERATOR_e_1.next();
								/**
								 * e.EdgeLabel < 1
								 */
								final /*@NonInvalid*/ int EdgeLabel_0 = e_1.getEdgeLabel();
								final /*@NonInvalid*/ IntegerValue BOXED_EdgeLabel_0 = ValueUtil
										.integerValueOf(EdgeLabel_0);
								final /*@NonInvalid*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, BOXED_EdgeLabel_0, GraphTables.INT_1).booleanValue();
								//
								if (!lt_0) { // Normal unsuccessful body evaluation result
									forAll_0 = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (lt_0) { // Normal successful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							if (forAll_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if ((forAll == null) || (forAll_0 == null)) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						result = and;
					} else {
						result = ValueUtil.TRUE_VALUE;
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SplitterSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::SplitterSemanticConstraint";
		try {
			/**
			 *
			 * inv SplitterSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Splitter.*$'))
			 *         ->forAll(r |
			 *           r.outgoingassets->size() >= 2 and
			 *           r.incomingassets->size() >= 1 and
			 *           r.incomingassets->size() <
			 *           r.outgoingassets->size())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___SPLITTER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Splitter.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Splitter_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 *
						 * r.outgoingassets->size() >= 2 and
						 * r.incomingassets->size() >= 1 and
						 * r.incomingassets->size() <
						 * r.outgoingassets->size()
						 */
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<GraphAsset> incomingassets_0 = r_0.getIncomingassets();
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets_0 = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets_0 = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets_0);
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets_0 = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets_0);
							final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_incomingassets_0);
							final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets_0);
							final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, size_2, GraphTables.INT_2).booleanValue();
							final /*@NonInvalid*/ Boolean and;
							if (!ge) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
										.evaluate(executor, size_1, GraphTables.INT_1).booleanValue();
								if (!ge_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, size_1, size_2).booleanValue();
								if (!lt) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_and_0; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ForwardSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::ForwardSemanticConstraint";
		try {
			/**
			 *
			 * inv ForwardSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Forward.*$'))
			 *         ->forAll(r |
			 *           r.outgoingassets->size() > 0 and
			 *           r.incomingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___FORWARD_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Forward.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Forward_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.outgoingassets->size() > 0 and r.incomingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_outgoingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!gt) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_incomingassets);
							final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_0).booleanValue();
							if (!gt_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AuthenticatorSemanticConstraint(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Node::AuthenticatorSemanticConstraint";
		try {
			/**
			 *
			 * inv AuthenticatorSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*Authenticator.*$'))
			 *         ->forAll(r |
			 *           r.incomingassets->size() >= 2 and
			 *           r.outgoingassets->size() >= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___AUTHENTICATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*Authenticator.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_Authenticator_a_$)
								.booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() >= 2 and r.outgoingassets->size() >= 1
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_2).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<GraphAsset> outgoingassets = r_0.getOutgoingassets();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingassets = idResolver
									.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, outgoingassets);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_outgoingassets);
							final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, size_0, GraphTables.INT_1).booleanValue();
							if (!ge_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UserSemanticConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::UserSemanticConstraint";
		try {
			/**
			 *
			 * inv UserSemanticConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.responsibility->select(r |
			 *           r.ID.matches('^.*User.*$'))
			 *         ->forAll(r | r.incomingassets->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GraphPackage.Literals.NODE___USER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GraphTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NodeResponsibility> responsibility = this.getResponsibility();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsibility = idResolver
							.createOrderedSetOfAll(GraphTables.ORD_CLSSid_NodeResponsibility, responsibility);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(GraphTables.ORD_CLSSid_NodeResponsibility);
					Iterator<Object> ITERATOR_r = BOXED_responsibility.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r = (NodeResponsibility) ITERATOR_r.next();
						/**
						 * r.ID.matches('^.*User.*$')
						 */
						final /*@NonInvalid*/ String ID = r.getID();
						if (ID == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, ID, GraphTables.STR__94__a_User_a_$).booleanValue();
						//
						if (matches == ValueUtil.TRUE_VALUE) {
							accumulator.add(r);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ NodeResponsibility r_0 = (NodeResponsibility) ITERATOR_r_0.next();
						/**
						 * r.incomingassets->size() > 0
						 */
						final /*@NonInvalid*/ List<GraphAsset> incomingassets = r_0.getIncomingassets();
						final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver
								.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_incomingassets);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, GraphTables.INT_0).booleanValue();
						//
						if (!gt) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (gt) { // Normal successful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GraphTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GraphPackage.NODE___COPIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return CopierSemanticConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___VERIFIER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return VerifierSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___BUSINESS_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return BusinessSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___ENCRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return EncryptSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___JOINER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return JoinerSemanticConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___DECRYPT_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return DecryptSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___STORE_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return StoreSemanticConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___COMPARATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return ComparatorSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___DISCARDER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return DiscarderSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___ATTACKER_OBSERVATION_VIOLATION__DIAGNOSTICCHAIN_MAP:
			return AttackerObservationViolation((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___SPLITTER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return SplitterSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___FORWARD_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return ForwardSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___AUTHENTICATOR_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return AuthenticatorSemanticConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GraphPackage.NODE___USER_SEMANTIC_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return UserSemanticConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
