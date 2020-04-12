/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.UniformCount#getMin <em>Min</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.UniformCount#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getUniformCount()
 * @model
 * @generated
 */
public interface UniformCount extends SpecialCount
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(long)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getUniformCount_Min()
   * @model
   * @generated
   */
  long getMin();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.UniformCount#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(long value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(long)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getUniformCount_Max()
   * @model
   * @generated
   */
  long getMax();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.UniformCount#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(long value);

} // UniformCount