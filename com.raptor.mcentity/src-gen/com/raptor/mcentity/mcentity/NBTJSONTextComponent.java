/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NBTJSON Text Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.NBTJSONTextComponent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTJSONTextComponent()
 * @model
 * @generated
 */
public interface NBTJSONTextComponent extends NBTValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(JSONTextComponent)
   * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTJSONTextComponent_Value()
   * @model containment="true"
   * @generated
   */
  JSONTextComponent getValue();

  /**
   * Sets the value of the '{@link com.raptor.mcentity.mcentity.NBTJSONTextComponent#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JSONTextComponent value);

} // NBTJSONTextComponent
