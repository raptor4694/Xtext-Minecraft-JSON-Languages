/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamespaced Statistic Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate#getStat <em>Stat</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getUnnamespacedStatisticPredicate()
 * @model
 * @generated
 */
public interface UnnamespacedStatisticPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Stat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stat</em>' attribute.
   * @see #setStat(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getUnnamespacedStatisticPredicate_Stat()
   * @model
   * @generated
   */
  String getStat();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate#getStat <em>Stat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stat</em>' attribute.
   * @see #getStat()
   * @generated
   */
  void setStat(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getUnnamespacedStatisticPredicate_Value()
   * @model containment="true"
   * @generated
   */
  LongRange getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LongRange value);

} // UnnamespacedStatisticPredicate
