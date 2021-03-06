/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.ApplyBonusLootFunction;
import com.raptor.mcloottable.mcloot.EnumBonusFormula;
import com.raptor.mcloottable.mcloot.MclootPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Bonus Loot Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#getEnchantment <em>Enchantment</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#isExtraDefined <em>Extra Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#isProbabilityDefined <em>Probability Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#isBonusMultiplierDefined <em>Bonus Multiplier Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.ApplyBonusLootFunctionImpl#getBonusMultiplier <em>Bonus Multiplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyBonusLootFunctionImpl extends LootFunctionImpl implements ApplyBonusLootFunction
{
  /**
   * The default value of the '{@link #getEnchantment() <em>Enchantment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnchantment()
   * @generated
   * @ordered
   */
  protected static final String ENCHANTMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnchantment() <em>Enchantment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnchantment()
   * @generated
   * @ordered
   */
  protected String enchantment = ENCHANTMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula()
   * @generated
   * @ordered
   */
  protected static final EnumBonusFormula FORMULA_EDEFAULT = EnumBonusFormula.BINOMIAL_WITH_BONUS_COUNT;

  /**
   * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula()
   * @generated
   * @ordered
   */
  protected EnumBonusFormula formula = FORMULA_EDEFAULT;

  /**
   * The default value of the '{@link #isExtraDefined() <em>Extra Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtraDefined()
   * @generated
   * @ordered
   */
  protected static final boolean EXTRA_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtraDefined() <em>Extra Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtraDefined()
   * @generated
   * @ordered
   */
  protected boolean extraDefined = EXTRA_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getExtra() <em>Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
  protected static final long EXTRA_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
  protected long extra = EXTRA_EDEFAULT;

  /**
   * The default value of the '{@link #isProbabilityDefined() <em>Probability Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProbabilityDefined()
   * @generated
   * @ordered
   */
  protected static final boolean PROBABILITY_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProbabilityDefined() <em>Probability Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProbabilityDefined()
   * @generated
   * @ordered
   */
  protected boolean probabilityDefined = PROBABILITY_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected static final double PROBABILITY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected double probability = PROBABILITY_EDEFAULT;

  /**
   * The default value of the '{@link #isBonusMultiplierDefined() <em>Bonus Multiplier Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBonusMultiplierDefined()
   * @generated
   * @ordered
   */
  protected static final boolean BONUS_MULTIPLIER_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBonusMultiplierDefined() <em>Bonus Multiplier Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBonusMultiplierDefined()
   * @generated
   * @ordered
   */
  protected boolean bonusMultiplierDefined = BONUS_MULTIPLIER_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getBonusMultiplier() <em>Bonus Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBonusMultiplier()
   * @generated
   * @ordered
   */
  protected static final double BONUS_MULTIPLIER_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getBonusMultiplier() <em>Bonus Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBonusMultiplier()
   * @generated
   * @ordered
   */
  protected double bonusMultiplier = BONUS_MULTIPLIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyBonusLootFunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MclootPackage.Literals.APPLY_BONUS_LOOT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnchantment()
  {
    return enchantment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnchantment(String newEnchantment)
  {
    String oldEnchantment = enchantment;
    enchantment = newEnchantment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT, oldEnchantment, enchantment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumBonusFormula getFormula()
  {
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormula(EnumBonusFormula newFormula)
  {
    EnumBonusFormula oldFormula = formula;
    formula = newFormula == null ? FORMULA_EDEFAULT : newFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__FORMULA, oldFormula, formula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isExtraDefined()
  {
    return extraDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtraDefined(boolean newExtraDefined)
  {
    boolean oldExtraDefined = extraDefined;
    extraDefined = newExtraDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA_DEFINED, oldExtraDefined, extraDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getExtra()
  {
    return extra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtra(long newExtra)
  {
    long oldExtra = extra;
    extra = newExtra;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA, oldExtra, extra));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isProbabilityDefined()
  {
    return probabilityDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProbabilityDefined(boolean newProbabilityDefined)
  {
    boolean oldProbabilityDefined = probabilityDefined;
    probabilityDefined = newProbabilityDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY_DEFINED, oldProbabilityDefined, probabilityDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getProbability()
  {
    return probability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProbability(double newProbability)
  {
    double oldProbability = probability;
    probability = newProbability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY, oldProbability, probability));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isBonusMultiplierDefined()
  {
    return bonusMultiplierDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBonusMultiplierDefined(boolean newBonusMultiplierDefined)
  {
    boolean oldBonusMultiplierDefined = bonusMultiplierDefined;
    bonusMultiplierDefined = newBonusMultiplierDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER_DEFINED, oldBonusMultiplierDefined, bonusMultiplierDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getBonusMultiplier()
  {
    return bonusMultiplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBonusMultiplier(double newBonusMultiplier)
  {
    double oldBonusMultiplier = bonusMultiplier;
    bonusMultiplier = newBonusMultiplier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER, oldBonusMultiplier, bonusMultiplier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT:
        return getEnchantment();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__FORMULA:
        return getFormula();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA_DEFINED:
        return isExtraDefined();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA:
        return getExtra();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY_DEFINED:
        return isProbabilityDefined();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY:
        return getProbability();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER_DEFINED:
        return isBonusMultiplierDefined();
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER:
        return getBonusMultiplier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT:
        setEnchantment((String)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__FORMULA:
        setFormula((EnumBonusFormula)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA_DEFINED:
        setExtraDefined((Boolean)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA:
        setExtra((Long)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY_DEFINED:
        setProbabilityDefined((Boolean)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY:
        setProbability((Double)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER_DEFINED:
        setBonusMultiplierDefined((Boolean)newValue);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER:
        setBonusMultiplier((Double)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT:
        setEnchantment(ENCHANTMENT_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__FORMULA:
        setFormula(FORMULA_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA_DEFINED:
        setExtraDefined(EXTRA_DEFINED_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA:
        setExtra(EXTRA_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY_DEFINED:
        setProbabilityDefined(PROBABILITY_DEFINED_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY:
        setProbability(PROBABILITY_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER_DEFINED:
        setBonusMultiplierDefined(BONUS_MULTIPLIER_DEFINED_EDEFAULT);
        return;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER:
        setBonusMultiplier(BONUS_MULTIPLIER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT:
        return ENCHANTMENT_EDEFAULT == null ? enchantment != null : !ENCHANTMENT_EDEFAULT.equals(enchantment);
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__FORMULA:
        return formula != FORMULA_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA_DEFINED:
        return extraDefined != EXTRA_DEFINED_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__EXTRA:
        return extra != EXTRA_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY_DEFINED:
        return probabilityDefined != PROBABILITY_DEFINED_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__PROBABILITY:
        return probability != PROBABILITY_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER_DEFINED:
        return bonusMultiplierDefined != BONUS_MULTIPLIER_DEFINED_EDEFAULT;
      case MclootPackage.APPLY_BONUS_LOOT_FUNCTION__BONUS_MULTIPLIER:
        return bonusMultiplier != BONUS_MULTIPLIER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (enchantment: ");
    result.append(enchantment);
    result.append(", formula: ");
    result.append(formula);
    result.append(", extraDefined: ");
    result.append(extraDefined);
    result.append(", extra: ");
    result.append(extra);
    result.append(", probabilityDefined: ");
    result.append(probabilityDefined);
    result.append(", probability: ");
    result.append(probability);
    result.append(", bonusMultiplierDefined: ");
    result.append(bonusMultiplierDefined);
    result.append(", bonusMultiplier: ");
    result.append(bonusMultiplier);
    result.append(')');
    return result.toString();
  }

} //ApplyBonusLootFunctionImpl
