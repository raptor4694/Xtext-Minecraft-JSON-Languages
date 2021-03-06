/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.mcblockstate.impl;

import com.raptor.mcblockstate.mcblockstate.BooleanBlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.McblockstatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Blockstate Property Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcblockstate.mcblockstate.impl.BooleanBlockstatePropertyPredicateImpl#isInverted <em>Inverted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanBlockstatePropertyPredicateImpl extends BlockstatePropertyPredicateImpl implements BooleanBlockstatePropertyPredicate
{
  /**
   * The default value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInverted()
   * @generated
   * @ordered
   */
  protected static final boolean INVERTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInverted()
   * @generated
   * @ordered
   */
  protected boolean inverted = INVERTED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanBlockstatePropertyPredicateImpl()
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
    return McblockstatePackage.Literals.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInverted()
  {
    return inverted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInverted(boolean newInverted)
  {
    boolean oldInverted = inverted;
    inverted = newInverted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED, oldInverted, inverted));
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
      case McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED:
        return isInverted();
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
      case McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED:
        setInverted((Boolean)newValue);
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
      case McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED:
        setInverted(INVERTED_EDEFAULT);
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
      case McblockstatePackage.BOOLEAN_BLOCKSTATE_PROPERTY_PREDICATE__INVERTED:
        return inverted != INVERTED_EDEFAULT;
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
    result.append(" (inverted: ");
    result.append(inverted);
    result.append(')');
    return result.toString();
  }

} //BooleanBlockstatePropertyPredicateImpl
