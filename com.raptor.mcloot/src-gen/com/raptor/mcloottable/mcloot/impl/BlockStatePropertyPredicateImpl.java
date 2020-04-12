/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.NormalLongRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block State Property Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockStatePropertyPredicateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockStatePropertyPredicateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.BlockStatePropertyPredicateImpl#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockStatePropertyPredicateImpl extends MinimalEObjectImpl.Container implements BlockStatePropertyPredicate
{
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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueRange()
   * @generated
   * @ordered
   */
  protected NormalLongRange valueRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockStatePropertyPredicateImpl()
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
    return MclootPackage.Literals.BLOCK_STATE_PROPERTY_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NormalLongRange getValueRange()
  {
    return valueRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueRange(NormalLongRange newValueRange, NotificationChain msgs)
  {
    NormalLongRange oldValueRange = valueRange;
    valueRange = newValueRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE, oldValueRange, newValueRange);
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
  public void setValueRange(NormalLongRange newValueRange)
  {
    if (newValueRange != valueRange)
    {
      NotificationChain msgs = null;
      if (valueRange != null)
        msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE, null, msgs);
      if (newValueRange != null)
        msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE, null, msgs);
      msgs = basicSetValueRange(newValueRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE, newValueRange, newValueRange));
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
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE:
        return basicSetValueRange(null, msgs);
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
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__NAME:
        return getName();
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE:
        return getValue();
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE:
        return getValueRange();
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
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__NAME:
        setName((String)newValue);
        return;
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE:
        setValue((String)newValue);
        return;
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE:
        setValueRange((NormalLongRange)newValue);
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
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE:
        setValueRange((NormalLongRange)null);
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
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case MclootPackage.BLOCK_STATE_PROPERTY_PREDICATE__VALUE_RANGE:
        return valueRange != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //BlockStatePropertyPredicateImpl