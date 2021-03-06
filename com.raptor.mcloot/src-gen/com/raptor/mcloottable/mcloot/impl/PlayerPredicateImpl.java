/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.AdvancementPredicate;
import com.raptor.mcloottable.mcloot.EnumGamemode;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.PlayerPredicate;
import com.raptor.mcloottable.mcloot.RecipePredicate;
import com.raptor.mcloottable.mcloot.StatisticPredicate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#isAdvancementsDefined <em>Advancements Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#getAdvancements <em>Advancements</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#isGamemodeDefined <em>Gamemode Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#getGamemode <em>Gamemode</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#isRecipesDefined <em>Recipes Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#isStatsDefined <em>Stats Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.impl.PlayerPredicateImpl#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerPredicateImpl extends MinimalEObjectImpl.Container implements PlayerPredicate
{
  /**
   * The default value of the '{@link #isAdvancementsDefined() <em>Advancements Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAdvancementsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean ADVANCEMENTS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAdvancementsDefined() <em>Advancements Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAdvancementsDefined()
   * @generated
   * @ordered
   */
  protected boolean advancementsDefined = ADVANCEMENTS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdvancements() <em>Advancements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvancements()
   * @generated
   * @ordered
   */
  protected EList<AdvancementPredicate> advancements;

  /**
   * The default value of the '{@link #isGamemodeDefined() <em>Gamemode Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGamemodeDefined()
   * @generated
   * @ordered
   */
  protected static final boolean GAMEMODE_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGamemodeDefined() <em>Gamemode Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGamemodeDefined()
   * @generated
   * @ordered
   */
  protected boolean gamemodeDefined = GAMEMODE_DEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getGamemode() <em>Gamemode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGamemode()
   * @generated
   * @ordered
   */
  protected static final EnumGamemode GAMEMODE_EDEFAULT = EnumGamemode.SURVIVAL;

  /**
   * The cached value of the '{@link #getGamemode() <em>Gamemode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGamemode()
   * @generated
   * @ordered
   */
  protected EnumGamemode gamemode = GAMEMODE_EDEFAULT;

  /**
   * The default value of the '{@link #isRecipesDefined() <em>Recipes Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecipesDefined()
   * @generated
   * @ordered
   */
  protected static final boolean RECIPES_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRecipesDefined() <em>Recipes Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecipesDefined()
   * @generated
   * @ordered
   */
  protected boolean recipesDefined = RECIPES_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipes()
   * @generated
   * @ordered
   */
  protected EList<RecipePredicate> recipes;

  /**
   * The default value of the '{@link #isStatsDefined() <em>Stats Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatsDefined()
   * @generated
   * @ordered
   */
  protected static final boolean STATS_DEFINED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatsDefined() <em>Stats Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatsDefined()
   * @generated
   * @ordered
   */
  protected boolean statsDefined = STATS_DEFINED_EDEFAULT;

  /**
   * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStats()
   * @generated
   * @ordered
   */
  protected EList<StatisticPredicate> stats;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlayerPredicateImpl()
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
    return MclootPackage.Literals.PLAYER_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAdvancementsDefined()
  {
    return advancementsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAdvancementsDefined(boolean newAdvancementsDefined)
  {
    boolean oldAdvancementsDefined = advancementsDefined;
    advancementsDefined = newAdvancementsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS_DEFINED, oldAdvancementsDefined, advancementsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AdvancementPredicate> getAdvancements()
  {
    if (advancements == null)
    {
      advancements = new EObjectContainmentEList<AdvancementPredicate>(AdvancementPredicate.class, this, MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS);
    }
    return advancements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGamemodeDefined()
  {
    return gamemodeDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGamemodeDefined(boolean newGamemodeDefined)
  {
    boolean oldGamemodeDefined = gamemodeDefined;
    gamemodeDefined = newGamemodeDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.PLAYER_PREDICATE__GAMEMODE_DEFINED, oldGamemodeDefined, gamemodeDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumGamemode getGamemode()
  {
    return gamemode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGamemode(EnumGamemode newGamemode)
  {
    EnumGamemode oldGamemode = gamemode;
    gamemode = newGamemode == null ? GAMEMODE_EDEFAULT : newGamemode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.PLAYER_PREDICATE__GAMEMODE, oldGamemode, gamemode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRecipesDefined()
  {
    return recipesDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRecipesDefined(boolean newRecipesDefined)
  {
    boolean oldRecipesDefined = recipesDefined;
    recipesDefined = newRecipesDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.PLAYER_PREDICATE__RECIPES_DEFINED, oldRecipesDefined, recipesDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RecipePredicate> getRecipes()
  {
    if (recipes == null)
    {
      recipes = new EObjectContainmentEList<RecipePredicate>(RecipePredicate.class, this, MclootPackage.PLAYER_PREDICATE__RECIPES);
    }
    return recipes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isStatsDefined()
  {
    return statsDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatsDefined(boolean newStatsDefined)
  {
    boolean oldStatsDefined = statsDefined;
    statsDefined = newStatsDefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclootPackage.PLAYER_PREDICATE__STATS_DEFINED, oldStatsDefined, statsDefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StatisticPredicate> getStats()
  {
    if (stats == null)
    {
      stats = new EObjectContainmentEList<StatisticPredicate>(StatisticPredicate.class, this, MclootPackage.PLAYER_PREDICATE__STATS);
    }
    return stats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS:
        return ((InternalEList<?>)getAdvancements()).basicRemove(otherEnd, msgs);
      case MclootPackage.PLAYER_PREDICATE__RECIPES:
        return ((InternalEList<?>)getRecipes()).basicRemove(otherEnd, msgs);
      case MclootPackage.PLAYER_PREDICATE__STATS:
        return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS_DEFINED:
        return isAdvancementsDefined();
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS:
        return getAdvancements();
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE_DEFINED:
        return isGamemodeDefined();
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE:
        return getGamemode();
      case MclootPackage.PLAYER_PREDICATE__RECIPES_DEFINED:
        return isRecipesDefined();
      case MclootPackage.PLAYER_PREDICATE__RECIPES:
        return getRecipes();
      case MclootPackage.PLAYER_PREDICATE__STATS_DEFINED:
        return isStatsDefined();
      case MclootPackage.PLAYER_PREDICATE__STATS:
        return getStats();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS_DEFINED:
        setAdvancementsDefined((Boolean)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS:
        getAdvancements().clear();
        getAdvancements().addAll((Collection<? extends AdvancementPredicate>)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE_DEFINED:
        setGamemodeDefined((Boolean)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE:
        setGamemode((EnumGamemode)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__RECIPES_DEFINED:
        setRecipesDefined((Boolean)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__RECIPES:
        getRecipes().clear();
        getRecipes().addAll((Collection<? extends RecipePredicate>)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__STATS_DEFINED:
        setStatsDefined((Boolean)newValue);
        return;
      case MclootPackage.PLAYER_PREDICATE__STATS:
        getStats().clear();
        getStats().addAll((Collection<? extends StatisticPredicate>)newValue);
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
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS_DEFINED:
        setAdvancementsDefined(ADVANCEMENTS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS:
        getAdvancements().clear();
        return;
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE_DEFINED:
        setGamemodeDefined(GAMEMODE_DEFINED_EDEFAULT);
        return;
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE:
        setGamemode(GAMEMODE_EDEFAULT);
        return;
      case MclootPackage.PLAYER_PREDICATE__RECIPES_DEFINED:
        setRecipesDefined(RECIPES_DEFINED_EDEFAULT);
        return;
      case MclootPackage.PLAYER_PREDICATE__RECIPES:
        getRecipes().clear();
        return;
      case MclootPackage.PLAYER_PREDICATE__STATS_DEFINED:
        setStatsDefined(STATS_DEFINED_EDEFAULT);
        return;
      case MclootPackage.PLAYER_PREDICATE__STATS:
        getStats().clear();
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
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS_DEFINED:
        return advancementsDefined != ADVANCEMENTS_DEFINED_EDEFAULT;
      case MclootPackage.PLAYER_PREDICATE__ADVANCEMENTS:
        return advancements != null && !advancements.isEmpty();
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE_DEFINED:
        return gamemodeDefined != GAMEMODE_DEFINED_EDEFAULT;
      case MclootPackage.PLAYER_PREDICATE__GAMEMODE:
        return gamemode != GAMEMODE_EDEFAULT;
      case MclootPackage.PLAYER_PREDICATE__RECIPES_DEFINED:
        return recipesDefined != RECIPES_DEFINED_EDEFAULT;
      case MclootPackage.PLAYER_PREDICATE__RECIPES:
        return recipes != null && !recipes.isEmpty();
      case MclootPackage.PLAYER_PREDICATE__STATS_DEFINED:
        return statsDefined != STATS_DEFINED_EDEFAULT;
      case MclootPackage.PLAYER_PREDICATE__STATS:
        return stats != null && !stats.isEmpty();
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
    result.append(" (advancementsDefined: ");
    result.append(advancementsDefined);
    result.append(", gamemodeDefined: ");
    result.append(gamemodeDefined);
    result.append(", gamemode: ");
    result.append(gamemode);
    result.append(", recipesDefined: ");
    result.append(recipesDefined);
    result.append(", statsDefined: ");
    result.append(statsDefined);
    result.append(')');
    return result.toString();
  }

} //PlayerPredicateImpl
