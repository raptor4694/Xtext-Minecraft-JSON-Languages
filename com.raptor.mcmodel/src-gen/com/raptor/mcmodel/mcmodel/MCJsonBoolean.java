/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.mcmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Json Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcmodel.mcmodel.MCJsonBoolean#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getMCJsonBoolean()
 * @model
 * @generated
 */
public interface MCJsonBoolean extends MCJsonValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getMCJsonBoolean_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link com.raptor.mcmodel.mcmodel.MCJsonBoolean#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // MCJsonBoolean