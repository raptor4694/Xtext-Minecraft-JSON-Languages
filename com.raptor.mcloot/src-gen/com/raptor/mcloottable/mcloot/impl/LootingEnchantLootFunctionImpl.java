/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.mcloot.LootingEnchantLootFunction;
import com.raptor.mcloottable.mcloot.MclootPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Looting Enchant Loot Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootingEnchantLootFunctionImpl#isLimitDefined <em>Limit Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootingEnchantLootFunctionImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.LootingEnchantLootFunctionImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LootingEnchantLootFunctionImpl extends LootFunctionImpl implements LootingEnchantLootFunction
{
  /**
   * The default value of the '{@link #isLimitDefined() <em>Limit Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimitDefined()
   * @generated
   * @ordered
   */
  protected static final boolean LIMIT_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLimitDefined() <em>Limit Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimitDefined()
   * @generated
   * @ordered
   */
  protected boolean limitDefined = LIMIT_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected static final long LIMIT_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected long limit = LIMIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected LongRange count;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LootingEnchantLootFunctionImpl()
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
    return MclootPackage.Literals.LOOTING_ENCHANT_LOOT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLimitDefined()
  {
    return limitDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLimitDefined(boolean newLimitDefined)
  {
    boolean oldLimitDefined = limitDefined;
    limitDefined = newLimitDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED, oldLimitDefined, limitDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLimit(long newLimit)
  {
    long oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT, oldLimit, limit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LongRange getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCount(LongRange newCount, NotificationChain msgs)
  {
    LongRange oldCount = count;
    count = newCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT, oldCount, newCount);
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
  public void setCount(LongRange newCount)
  {
    if (newCount != count)
    {
      NotificationChain msgs = null;
      if (count != null)
        msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT, null, msgs);
      if (newCount != null)
        msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT, null, msgs);
      msgs = basicSetCount(newCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT, newCount, newCount));
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
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT:
        return basicSetCount(null, msgs);
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
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED:
        return isLimitDefined();
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT:
        return getLimit();
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT:
        return getCount();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED:
        setLimitDefined((Boolean)newValue);
        return;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT:
        setLimit((Long)newValue);
        return;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT:
        setCount((LongRange)newValue);
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
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED:
        setLimitDefined(LIMIT_DEFINED_EDEFAULT);
        return;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT:
        setLimit(LIMIT_EDEFAULT);
        return;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT:
        setCount((LongRange)null);
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
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED:
        return limitDefined != LIMIT_DEFINED_EDEFAULT;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT:
        return limit != LIMIT_EDEFAULT;
      case MclootPackage.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT:
        return count != null;
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
    result.append(" (limitDefined: ");
    result.append(limitDefined);
    result.append(", limit: ");
    result.append(limit);
    result.append(')');
    return result.toString();
  }

} //LootingEnchantLootFunctionImpl