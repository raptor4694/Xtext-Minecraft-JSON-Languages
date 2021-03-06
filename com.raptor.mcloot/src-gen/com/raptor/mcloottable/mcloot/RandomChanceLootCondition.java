/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Chance Loot Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#getChance <em>Chance</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#isLootingMultiplierDefined <em>Looting Multiplier Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#getLootingMultiplier <em>Looting Multiplier</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getRandomChanceLootCondition()
 * @model
 * @generated
 */
public interface RandomChanceLootCondition extends NamedLootCondition
{
  /**
   * Returns the value of the '<em><b>Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chance</em>' attribute.
   * @see #setChance(double)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getRandomChanceLootCondition_Chance()
   * @model
   * @generated
   */
  double getChance();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#getChance <em>Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chance</em>' attribute.
   * @see #getChance()
   * @generated
   */
  void setChance(double value);

  /**
   * Returns the value of the '<em><b>Looting Multiplier Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Looting Multiplier Defined</em>' attribute.
   * @see #setLootingMultiplierDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getRandomChanceLootCondition_LootingMultiplierDefined()
   * @model
   * @generated
   */
  boolean isLootingMultiplierDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#isLootingMultiplierDefined <em>Looting Multiplier Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Looting Multiplier Defined</em>' attribute.
   * @see #isLootingMultiplierDefined()
   * @generated
   */
  void setLootingMultiplierDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Looting Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Looting Multiplier</em>' attribute.
   * @see #setLootingMultiplier(double)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getRandomChanceLootCondition_LootingMultiplier()
   * @model
   * @generated
   */
  double getLootingMultiplier();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.RandomChanceLootCondition#getLootingMultiplier <em>Looting Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Looting Multiplier</em>' attribute.
   * @see #getLootingMultiplier()
   * @generated
   */
  void setLootingMultiplier(double value);

} // RandomChanceLootCondition
