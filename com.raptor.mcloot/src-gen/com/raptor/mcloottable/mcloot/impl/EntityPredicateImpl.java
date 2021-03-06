/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.DoubleRange;
import com.raptor.mcloottable.mcloot.EffectPredicate;
import com.raptor.mcloottable.mcloot.EntityFlags;
import com.raptor.mcloottable.mcloot.EntityPredicate;
import com.raptor.mcloottable.mcloot.EquipmentPredicate;
import com.raptor.mcloottable.mcloot.FishingHookPredicate;
import com.raptor.mcloottable.mcloot.ItemPredicate;
import com.raptor.mcloottable.mcloot.LocationPredicate;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.PlayerPredicate;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getAbsoluteDistance <em>Absolute Distance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getHorizontalDistance <em>Horizontal Distance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getXDistance <em>XDistance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getYDistance <em>YDistance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getZDistance <em>ZDistance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#isEffectsDefined <em>Effects Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getDefaultEquipment <em>Default Equipment</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getNbt <em>Nbt</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.EntityPredicateImpl#getFishingHook <em>Fishing Hook</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityPredicateImpl extends MinimalEObjectImpl.Container implements EntityPredicate
{
  /**
   * The cached value of the '{@link #getAbsoluteDistance() <em>Absolute Distance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsoluteDistance()
   * @generated
   * @ordered
   */
  protected DoubleRange absoluteDistance;

  /**
   * The cached value of the '{@link #getHorizontalDistance() <em>Horizontal Distance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalDistance()
   * @generated
   * @ordered
   */
  protected DoubleRange horizontalDistance;

  /**
   * The cached value of the '{@link #getXDistance() <em>XDistance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXDistance()
   * @generated
   * @ordered
   */
  protected DoubleRange xDistance;

  /**
   * The cached value of the '{@link #getYDistance() <em>YDistance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYDistance()
   * @generated
   * @ordered
   */
  protected DoubleRange yDistance;

  /**
   * The cached value of the '{@link #getZDistance() <em>ZDistance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZDistance()
   * @generated
   * @ordered
   */
  protected DoubleRange zDistance;

  /**
   * The default value of the '{@link #isEffectsDefined() <em>Effects Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEffectsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean EFFECTS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEffectsDefined() <em>Effects Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEffectsDefined()
   * @generated
   * @ordered
   */
  protected boolean effectsDefined = EFFECTS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<EffectPredicate> effects;

  /**
   * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipment()
   * @generated
   * @ordered
   */
  protected EList<EquipmentPredicate> equipment;

  /**
   * The cached value of the '{@link #getDefaultEquipment() <em>Default Equipment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultEquipment()
   * @generated
   * @ordered
   */
  protected ItemPredicate defaultEquipment;

  /**
   * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected EntityFlags flags;

  /**
   * The default value of the '{@link #getNbt() <em>Nbt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbt()
   * @generated
   * @ordered
   */
  protected static final String NBT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNbt() <em>Nbt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbt()
   * @generated
   * @ordered
   */
  protected String nbt = NBT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer()
   * @generated
   * @ordered
   */
  protected PlayerPredicate player;

  /**
   * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected static final String TEAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected String team = TEAM_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected LocationPredicate location;

  /**
   * The cached value of the '{@link #getFishingHook() <em>Fishing Hook</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFishingHook()
   * @generated
   * @ordered
   */
  protected FishingHookPredicate fishingHook;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityPredicateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MclootPackage.Literals.ENTITY_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleRange getAbsoluteDistance()
  {
    return absoluteDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsoluteDistance(DoubleRange newAbsoluteDistance, NotificationChain msgs)
  {
    DoubleRange oldAbsoluteDistance = absoluteDistance;
    absoluteDistance = newAbsoluteDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE, oldAbsoluteDistance, newAbsoluteDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbsoluteDistance(DoubleRange newAbsoluteDistance)
  {
    if (newAbsoluteDistance != absoluteDistance)
    {
      NotificationChain msgs = null;
      if (absoluteDistance != null)
        msgs = ((InternalEObject)absoluteDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE, null, msgs);
      if (newAbsoluteDistance != null)
        msgs = ((InternalEObject)newAbsoluteDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE, null, msgs);
      msgs = basicSetAbsoluteDistance(newAbsoluteDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE, newAbsoluteDistance, newAbsoluteDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleRange getHorizontalDistance()
  {
    return horizontalDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorizontalDistance(DoubleRange newHorizontalDistance, NotificationChain msgs)
  {
    DoubleRange oldHorizontalDistance = horizontalDistance;
    horizontalDistance = newHorizontalDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE, oldHorizontalDistance, newHorizontalDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHorizontalDistance(DoubleRange newHorizontalDistance)
  {
    if (newHorizontalDistance != horizontalDistance)
    {
      NotificationChain msgs = null;
      if (horizontalDistance != null)
        msgs = ((InternalEObject)horizontalDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE, null, msgs);
      if (newHorizontalDistance != null)
        msgs = ((InternalEObject)newHorizontalDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE, null, msgs);
      msgs = basicSetHorizontalDistance(newHorizontalDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE, newHorizontalDistance, newHorizontalDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleRange getXDistance()
  {
    return xDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXDistance(DoubleRange newXDistance, NotificationChain msgs)
  {
    DoubleRange oldXDistance = xDistance;
    xDistance = newXDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__XDISTANCE, oldXDistance, newXDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXDistance(DoubleRange newXDistance)
  {
    if (newXDistance != xDistance)
    {
      NotificationChain msgs = null;
      if (xDistance != null)
        msgs = ((InternalEObject)xDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__XDISTANCE, null, msgs);
      if (newXDistance != null)
        msgs = ((InternalEObject)newXDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__XDISTANCE, null, msgs);
      msgs = basicSetXDistance(newXDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__XDISTANCE, newXDistance, newXDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleRange getYDistance()
  {
    return yDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYDistance(DoubleRange newYDistance, NotificationChain msgs)
  {
    DoubleRange oldYDistance = yDistance;
    yDistance = newYDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__YDISTANCE, oldYDistance, newYDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYDistance(DoubleRange newYDistance)
  {
    if (newYDistance != yDistance)
    {
      NotificationChain msgs = null;
      if (yDistance != null)
        msgs = ((InternalEObject)yDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__YDISTANCE, null, msgs);
      if (newYDistance != null)
        msgs = ((InternalEObject)newYDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__YDISTANCE, null, msgs);
      msgs = basicSetYDistance(newYDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__YDISTANCE, newYDistance, newYDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleRange getZDistance()
  {
    return zDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZDistance(DoubleRange newZDistance, NotificationChain msgs)
  {
    DoubleRange oldZDistance = zDistance;
    zDistance = newZDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__ZDISTANCE, oldZDistance, newZDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setZDistance(DoubleRange newZDistance)
  {
    if (newZDistance != zDistance)
    {
      NotificationChain msgs = null;
      if (zDistance != null)
        msgs = ((InternalEObject)zDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__ZDISTANCE, null, msgs);
      if (newZDistance != null)
        msgs = ((InternalEObject)newZDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__ZDISTANCE, null, msgs);
      msgs = basicSetZDistance(newZDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__ZDISTANCE, newZDistance, newZDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEffectsDefined()
  {
    return effectsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffectsDefined(boolean newEffectsDefined)
  {
    boolean oldEffectsDefined = effectsDefined;
    effectsDefined = newEffectsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__EFFECTS_DEFINED, oldEffectsDefined, effectsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EffectPredicate> getEffects()
  {
    if (effects == null)
    {
      effects = new EObjectContainmentEList<EffectPredicate>(EffectPredicate.class, this, MclootPackage.ENTITY_PREDICATE__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EquipmentPredicate> getEquipment()
  {
    if (equipment == null)
    {
      equipment = new EObjectContainmentEList<EquipmentPredicate>(EquipmentPredicate.class, this, MclootPackage.ENTITY_PREDICATE__EQUIPMENT);
    }
    return equipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemPredicate getDefaultEquipment()
  {
    return defaultEquipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultEquipment(ItemPredicate newDefaultEquipment, NotificationChain msgs)
  {
    ItemPredicate oldDefaultEquipment = defaultEquipment;
    defaultEquipment = newDefaultEquipment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT, oldDefaultEquipment, newDefaultEquipment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultEquipment(ItemPredicate newDefaultEquipment)
  {
    if (newDefaultEquipment != defaultEquipment)
    {
      NotificationChain msgs = null;
      if (defaultEquipment != null)
        msgs = ((InternalEObject)defaultEquipment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT, null, msgs);
      if (newDefaultEquipment != null)
        msgs = ((InternalEObject)newDefaultEquipment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT, null, msgs);
      msgs = basicSetDefaultEquipment(newDefaultEquipment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT, newDefaultEquipment, newDefaultEquipment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityFlags getFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlags(EntityFlags newFlags, NotificationChain msgs)
  {
    EntityFlags oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__FLAGS, oldFlags, newFlags);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFlags(EntityFlags newFlags)
  {
    if (newFlags != flags)
    {
      NotificationChain msgs = null;
      if (flags != null)
        msgs = ((InternalEObject)flags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__FLAGS, null, msgs);
      if (newFlags != null)
        msgs = ((InternalEObject)newFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__FLAGS, null, msgs);
      msgs = basicSetFlags(newFlags, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__FLAGS, newFlags, newFlags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNbt()
  {
    return nbt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbt(String newNbt)
  {
    String oldNbt = nbt;
    nbt = newNbt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__NBT, oldNbt, nbt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlayerPredicate getPlayer()
  {
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlayer(PlayerPredicate newPlayer, NotificationChain msgs)
  {
    PlayerPredicate oldPlayer = player;
    player = newPlayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__PLAYER, oldPlayer, newPlayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlayer(PlayerPredicate newPlayer)
  {
    if (newPlayer != player)
    {
      NotificationChain msgs = null;
      if (player != null)
        msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__PLAYER, null, msgs);
      if (newPlayer != null)
        msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__PLAYER, null, msgs);
      msgs = basicSetPlayer(newPlayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__PLAYER, newPlayer, newPlayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTeam()
  {
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTeam(String newTeam)
  {
    String oldTeam = team;
    team = newTeam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__TEAM, oldTeam, team));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocationPredicate getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(LocationPredicate newLocation, NotificationChain msgs)
  {
    LocationPredicate oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(LocationPredicate newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FishingHookPredicate getFishingHook()
  {
    return fishingHook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFishingHook(FishingHookPredicate newFishingHook, NotificationChain msgs)
  {
    FishingHookPredicate oldFishingHook = fishingHook;
    fishingHook = newFishingHook;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__FISHING_HOOK, oldFishingHook, newFishingHook);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFishingHook(FishingHookPredicate newFishingHook)
  {
    if (newFishingHook != fishingHook)
    {
      NotificationChain msgs = null;
      if (fishingHook != null)
        msgs = ((InternalEObject)fishingHook).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__FISHING_HOOK, null, msgs);
      if (newFishingHook != null)
        msgs = ((InternalEObject)newFishingHook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.ENTITY_PREDICATE__FISHING_HOOK, null, msgs);
      msgs = basicSetFishingHook(newFishingHook, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.ENTITY_PREDICATE__FISHING_HOOK, newFishingHook, newFishingHook));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE:
        return basicSetAbsoluteDistance(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE:
        return basicSetHorizontalDistance(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__XDISTANCE:
        return basicSetXDistance(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__YDISTANCE:
        return basicSetYDistance(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__ZDISTANCE:
        return basicSetZDistance(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
      case MclootPackage.ENTITY_PREDICATE__EQUIPMENT:
        return ((InternalEList<?>)getEquipment()).basicRemove(otherEnd, msgs);
      case MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT:
        return basicSetDefaultEquipment(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__FLAGS:
        return basicSetFlags(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__PLAYER:
        return basicSetPlayer(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__LOCATION:
        return basicSetLocation(null, msgs);
      case MclootPackage.ENTITY_PREDICATE__FISHING_HOOK:
        return basicSetFishingHook(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE:
        return getAbsoluteDistance();
      case MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE:
        return getHorizontalDistance();
      case MclootPackage.ENTITY_PREDICATE__XDISTANCE:
        return getXDistance();
      case MclootPackage.ENTITY_PREDICATE__YDISTANCE:
        return getYDistance();
      case MclootPackage.ENTITY_PREDICATE__ZDISTANCE:
        return getZDistance();
      case MclootPackage.ENTITY_PREDICATE__EFFECTS_DEFINED:
        return isEffectsDefined();
      case MclootPackage.ENTITY_PREDICATE__EFFECTS:
        return getEffects();
      case MclootPackage.ENTITY_PREDICATE__EQUIPMENT:
        return getEquipment();
      case MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT:
        return getDefaultEquipment();
      case MclootPackage.ENTITY_PREDICATE__FLAGS:
        return getFlags();
      case MclootPackage.ENTITY_PREDICATE__NBT:
        return getNbt();
      case MclootPackage.ENTITY_PREDICATE__PLAYER:
        return getPlayer();
      case MclootPackage.ENTITY_PREDICATE__TEAM:
        return getTeam();
      case MclootPackage.ENTITY_PREDICATE__TYPE:
        return getType();
      case MclootPackage.ENTITY_PREDICATE__LOCATION:
        return getLocation();
      case MclootPackage.ENTITY_PREDICATE__FISHING_HOOK:
        return getFishingHook();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE:
        setAbsoluteDistance((DoubleRange)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE:
        setHorizontalDistance((DoubleRange)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__XDISTANCE:
        setXDistance((DoubleRange)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__YDISTANCE:
        setYDistance((DoubleRange)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__ZDISTANCE:
        setZDistance((DoubleRange)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS_DEFINED:
        setEffectsDefined((Boolean)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends EffectPredicate>)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__EQUIPMENT:
        getEquipment().clear();
        getEquipment().addAll((Collection<? extends EquipmentPredicate>)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT:
        setDefaultEquipment((ItemPredicate)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__FLAGS:
        setFlags((EntityFlags)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__NBT:
        setNbt((String)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__PLAYER:
        setPlayer((PlayerPredicate)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__TEAM:
        setTeam((String)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__TYPE:
        setType((String)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__LOCATION:
        setLocation((LocationPredicate)newValue);
        return;
      case MclootPackage.ENTITY_PREDICATE__FISHING_HOOK:
        setFishingHook((FishingHookPredicate)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE:
        setAbsoluteDistance((DoubleRange)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE:
        setHorizontalDistance((DoubleRange)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__XDISTANCE:
        setXDistance((DoubleRange)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__YDISTANCE:
        setYDistance((DoubleRange)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__ZDISTANCE:
        setZDistance((DoubleRange)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS_DEFINED:
        setEffectsDefined(EFFECTS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS:
        getEffects().clear();
        return;
      case MclootPackage.ENTITY_PREDICATE__EQUIPMENT:
        getEquipment().clear();
        return;
      case MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT:
        setDefaultEquipment((ItemPredicate)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__FLAGS:
        setFlags((EntityFlags)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__NBT:
        setNbt(NBT_EDEFAULT);
        return;
      case MclootPackage.ENTITY_PREDICATE__PLAYER:
        setPlayer((PlayerPredicate)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__TEAM:
        setTeam(TEAM_EDEFAULT);
        return;
      case MclootPackage.ENTITY_PREDICATE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MclootPackage.ENTITY_PREDICATE__LOCATION:
        setLocation((LocationPredicate)null);
        return;
      case MclootPackage.ENTITY_PREDICATE__FISHING_HOOK:
        setFishingHook((FishingHookPredicate)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MclootPackage.ENTITY_PREDICATE__ABSOLUTE_DISTANCE:
        return absoluteDistance != null;
      case MclootPackage.ENTITY_PREDICATE__HORIZONTAL_DISTANCE:
        return horizontalDistance != null;
      case MclootPackage.ENTITY_PREDICATE__XDISTANCE:
        return xDistance != null;
      case MclootPackage.ENTITY_PREDICATE__YDISTANCE:
        return yDistance != null;
      case MclootPackage.ENTITY_PREDICATE__ZDISTANCE:
        return zDistance != null;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS_DEFINED:
        return effectsDefined != EFFECTS_DEFINED_EDEFAULT;
      case MclootPackage.ENTITY_PREDICATE__EFFECTS:
        return effects != null && !effects.isEmpty();
      case MclootPackage.ENTITY_PREDICATE__EQUIPMENT:
        return equipment != null && !equipment.isEmpty();
      case MclootPackage.ENTITY_PREDICATE__DEFAULT_EQUIPMENT:
        return defaultEquipment != null;
      case MclootPackage.ENTITY_PREDICATE__FLAGS:
        return flags != null;
      case MclootPackage.ENTITY_PREDICATE__NBT:
        return NBT_EDEFAULT == null ? nbt != null : !NBT_EDEFAULT.equals(nbt);
      case MclootPackage.ENTITY_PREDICATE__PLAYER:
        return player != null;
      case MclootPackage.ENTITY_PREDICATE__TEAM:
        return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
      case MclootPackage.ENTITY_PREDICATE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MclootPackage.ENTITY_PREDICATE__LOCATION:
        return location != null;
      case MclootPackage.ENTITY_PREDICATE__FISHING_HOOK:
        return fishingHook != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (effectsDefined: ");
    result.append(effectsDefined);
    result.append(", nbt: ");
    result.append(nbt);
    result.append(", team: ");
    result.append(team);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //EntityPredicateImpl
