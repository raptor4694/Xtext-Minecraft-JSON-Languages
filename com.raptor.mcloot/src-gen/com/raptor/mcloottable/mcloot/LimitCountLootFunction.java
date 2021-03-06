/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Count Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.LimitCountLootFunction#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getLimitCountLootFunction()
 * @model
 * @generated
 */
public interface LimitCountLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLimitCountLootFunction_Limit()
   * @model containment="true"
   * @generated
   */
  LongRange getLimit();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LimitCountLootFunction#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(LongRange value);

} // LimitCountLootFunction
