/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enchant With Levels Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#isTreasureDefined <em>Treasure Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#isTreasure <em>Treasure</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getEnchantWithLevelsLootFunction()
 * @model
 * @generated
 */
public interface EnchantWithLevelsLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Treasure Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Treasure Defined</em>' attribute.
   * @see #setTreasureDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEnchantWithLevelsLootFunction_TreasureDefined()
   * @model
   * @generated
   */
  boolean isTreasureDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#isTreasureDefined <em>Treasure Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Treasure Defined</em>' attribute.
   * @see #isTreasureDefined()
   * @generated
   */
  void setTreasureDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Treasure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Treasure</em>' attribute.
   * @see #setTreasure(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEnchantWithLevelsLootFunction_Treasure()
   * @model
   * @generated
   */
  boolean isTreasure();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#isTreasure <em>Treasure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Treasure</em>' attribute.
   * @see #isTreasure()
   * @generated
   */
  void setTreasure(boolean value);

  /**
   * Returns the value of the '<em><b>Levels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Levels</em>' containment reference.
   * @see #setLevels(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getEnchantWithLevelsLootFunction_Levels()
   * @model containment="true"
   * @generated
   */
  LongRange getLevels();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.EnchantWithLevelsLootFunction#getLevels <em>Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Levels</em>' containment reference.
   * @see #getLevels()
   * @generated
   */
  void setLevels(LongRange value);

} // EnchantWithLevelsLootFunction