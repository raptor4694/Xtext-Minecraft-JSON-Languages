/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity.impl;

import com.raptor.mcentity.mcentity.McentityPackage;
import com.raptor.mcentity.mcentity.SelectorArguments;
import com.raptor.mcentity.mcentity.SelectorFilter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.impl.SelectorArgumentsImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectorArgumentsImpl extends MinimalEObjectImpl.Container implements SelectorArguments
{
  /**
   * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilters()
   * @generated
   * @ordered
   */
  protected EList<SelectorFilter> filters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorArgumentsImpl()
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
    return McentityPackage.Literals.SELECTOR_ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SelectorFilter> getFilters()
  {
    if (filters == null)
    {
      filters = new EObjectContainmentEList<SelectorFilter>(SelectorFilter.class, this, McentityPackage.SELECTOR_ARGUMENTS__FILTERS);
    }
    return filters;
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
      case McentityPackage.SELECTOR_ARGUMENTS__FILTERS:
        return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
      case McentityPackage.SELECTOR_ARGUMENTS__FILTERS:
        return getFilters();
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
      case McentityPackage.SELECTOR_ARGUMENTS__FILTERS:
        getFilters().clear();
        getFilters().addAll((Collection<? extends SelectorFilter>)newValue);
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
      case McentityPackage.SELECTOR_ARGUMENTS__FILTERS:
        getFilters().clear();
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
      case McentityPackage.SELECTOR_ARGUMENTS__FILTERS:
        return filters != null && !filters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectorArgumentsImpl
