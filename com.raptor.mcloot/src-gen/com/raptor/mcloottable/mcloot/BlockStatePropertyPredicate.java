/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block State Property Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getName <em>Name</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getValue <em>Value</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getBlockStatePropertyPredicate()
 * @model
 * @generated
 */
public interface BlockStatePropertyPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getBlockStatePropertyPredicate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getBlockStatePropertyPredicate_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Range</em>' containment reference.
   * @see #setValueRange(NormalLongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getBlockStatePropertyPredicate_ValueRange()
   * @model containment="true"
   * @generated
   */
  NormalLongRange getValueRange();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate#getValueRange <em>Value Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Range</em>' containment reference.
   * @see #getValueRange()
   * @generated
   */
  void setValueRange(NormalLongRange value);

} // BlockStatePropertyPredicate
