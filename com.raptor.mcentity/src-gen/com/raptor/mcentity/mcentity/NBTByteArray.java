/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NBT Byte Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.NBTByteArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTByteArray()
 * @model
 * @generated
 */
public interface NBTByteArray extends NBTValue
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Byte}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see com.raptor.mcentity.mcentity.McentityPackage#getNBTByteArray_Elements()
   * @model unique="false"
   * @generated
   */
  EList<Byte> getElements();

} // NBTByteArray
