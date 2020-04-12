/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.MCJsonArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getMCJsonArray()
 * @model
 * @generated
 */
public interface MCJsonArray extends MCJsonValue
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.raptor.mcloottable.mcloot.MCJsonValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getMCJsonArray_Elements()
   * @model containment="true"
   * @generated
   */
  EList<MCJsonValue> getElements();

} // MCJsonArray