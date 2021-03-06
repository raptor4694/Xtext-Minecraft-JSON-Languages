/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getBiome <em>Biome</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getBlock <em>Block</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getDimension <em>Dimension</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getFluid <em>Fluid</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getLight <em>Light</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getXPos <em>XPos</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getYPos <em>YPos</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.LocationPredicate#getZPos <em>ZPos</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate()
 * @model
 * @generated
 */
public interface LocationPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Biome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biome</em>' attribute.
   * @see #setBiome(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Biome()
   * @model
   * @generated
   */
  String getBiome();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getBiome <em>Biome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Biome</em>' attribute.
   * @see #getBiome()
   * @generated
   */
  void setBiome(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(BlockPredicate)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Block()
   * @model containment="true"
   * @generated
   */
  BlockPredicate getBlock();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(BlockPredicate value);

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute.
   * @see #setDimension(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Dimension()
   * @model
   * @generated
   */
  String getDimension();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getDimension <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' attribute.
   * @see #getDimension()
   * @generated
   */
  void setDimension(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Fluid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluid</em>' containment reference.
   * @see #setFluid(FluidPredicate)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Fluid()
   * @model containment="true"
   * @generated
   */
  FluidPredicate getFluid();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getFluid <em>Fluid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fluid</em>' containment reference.
   * @see #getFluid()
   * @generated
   */
  void setFluid(FluidPredicate value);

  /**
   * Returns the value of the '<em><b>Light</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Light</em>' containment reference.
   * @see #setLight(LongRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_Light()
   * @model containment="true"
   * @generated
   */
  LongRange getLight();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getLight <em>Light</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Light</em>' containment reference.
   * @see #getLight()
   * @generated
   */
  void setLight(LongRange value);

  /**
   * Returns the value of the '<em><b>XPos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPos</em>' containment reference.
   * @see #setXPos(DoubleRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_XPos()
   * @model containment="true"
   * @generated
   */
  DoubleRange getXPos();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getXPos <em>XPos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XPos</em>' containment reference.
   * @see #getXPos()
   * @generated
   */
  void setXPos(DoubleRange value);

  /**
   * Returns the value of the '<em><b>YPos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>YPos</em>' containment reference.
   * @see #setYPos(DoubleRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_YPos()
   * @model containment="true"
   * @generated
   */
  DoubleRange getYPos();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getYPos <em>YPos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YPos</em>' containment reference.
   * @see #getYPos()
   * @generated
   */
  void setYPos(DoubleRange value);

  /**
   * Returns the value of the '<em><b>ZPos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ZPos</em>' containment reference.
   * @see #setZPos(DoubleRange)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getLocationPredicate_ZPos()
   * @model containment="true"
   * @generated
   */
  DoubleRange getZPos();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.LocationPredicate#getZPos <em>ZPos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZPos</em>' containment reference.
   * @see #getZPos()
   * @generated
   */
  void setZPos(DoubleRange value);

} // LocationPredicate
