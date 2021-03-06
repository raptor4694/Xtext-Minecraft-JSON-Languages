/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.CopyNameLootFunction;
import com.raptor.mcloottable.mcloot.EnumNBTSource;
import com.raptor.mcloottable.mcloot.MclootPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Name Loot Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.CopyNameLootFunctionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyNameLootFunctionImpl extends LootFunctionImpl implements CopyNameLootFunction
{
  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final EnumNBTSource SOURCE_EDEFAULT = EnumNBTSource.BLOCK_ENTITY;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EnumNBTSource source = SOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CopyNameLootFunctionImpl()
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
    return MclootPackage.Literals.COPY_NAME_LOOT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumNBTSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(EnumNBTSource newSource)
  {
    EnumNBTSource oldSource = source;
    source = newSource == null ? SOURCE_EDEFAULT : newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.COPY_NAME_LOOT_FUNCTION__SOURCE, oldSource, source));
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
      case MclootPackage.COPY_NAME_LOOT_FUNCTION__SOURCE:
        return getSource();
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
      case MclootPackage.COPY_NAME_LOOT_FUNCTION__SOURCE:
        setSource((EnumNBTSource)newValue);
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
      case MclootPackage.COPY_NAME_LOOT_FUNCTION__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case MclootPackage.COPY_NAME_LOOT_FUNCTION__SOURCE:
        return source != SOURCE_EDEFAULT;
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
    result.append(" (source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //CopyNameLootFunctionImpl
