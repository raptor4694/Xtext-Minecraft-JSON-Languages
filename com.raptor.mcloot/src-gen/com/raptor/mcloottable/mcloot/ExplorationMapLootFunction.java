/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploration Map Loot Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isZoomDefined <em>Zoom Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getZoom <em>Zoom</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSearchRadiusDefined <em>Search Radius Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getSearchRadius <em>Search Radius</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSkipExistingChunksDefined <em>Skip Existing Chunks Defined</em>}</li>
 *   <li>{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSkipExistingChunks <em>Skip Existing Chunks</em>}</li>
 * </ul>
 *
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction()
 * @model
 * @generated
 */
public interface ExplorationMapLootFunction extends LootFunction
{
  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_Destination()
   * @model
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

  /**
   * Returns the value of the '<em><b>Decoration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decoration</em>' attribute.
   * @see #setDecoration(String)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_Decoration()
   * @model
   * @generated
   */
  String getDecoration();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getDecoration <em>Decoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decoration</em>' attribute.
   * @see #getDecoration()
   * @generated
   */
  void setDecoration(String value);

  /**
   * Returns the value of the '<em><b>Zoom Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zoom Defined</em>' attribute.
   * @see #setZoomDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_ZoomDefined()
   * @model
   * @generated
   */
  boolean isZoomDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isZoomDefined <em>Zoom Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zoom Defined</em>' attribute.
   * @see #isZoomDefined()
   * @generated
   */
  void setZoomDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Zoom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zoom</em>' attribute.
   * @see #setZoom(long)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_Zoom()
   * @model
   * @generated
   */
  long getZoom();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getZoom <em>Zoom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zoom</em>' attribute.
   * @see #getZoom()
   * @generated
   */
  void setZoom(long value);

  /**
   * Returns the value of the '<em><b>Search Radius Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Radius Defined</em>' attribute.
   * @see #setSearchRadiusDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_SearchRadiusDefined()
   * @model
   * @generated
   */
  boolean isSearchRadiusDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSearchRadiusDefined <em>Search Radius Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Radius Defined</em>' attribute.
   * @see #isSearchRadiusDefined()
   * @generated
   */
  void setSearchRadiusDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Search Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Radius</em>' attribute.
   * @see #setSearchRadius(long)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_SearchRadius()
   * @model
   * @generated
   */
  long getSearchRadius();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#getSearchRadius <em>Search Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Radius</em>' attribute.
   * @see #getSearchRadius()
   * @generated
   */
  void setSearchRadius(long value);

  /**
   * Returns the value of the '<em><b>Skip Existing Chunks Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip Existing Chunks Defined</em>' attribute.
   * @see #setSkipExistingChunksDefined(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_SkipExistingChunksDefined()
   * @model
   * @generated
   */
  boolean isSkipExistingChunksDefined();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSkipExistingChunksDefined <em>Skip Existing Chunks Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip Existing Chunks Defined</em>' attribute.
   * @see #isSkipExistingChunksDefined()
   * @generated
   */
  void setSkipExistingChunksDefined(boolean value);

  /**
   * Returns the value of the '<em><b>Skip Existing Chunks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip Existing Chunks</em>' attribute.
   * @see #setSkipExistingChunks(boolean)
   * @see com.raptor.mcloottable.mcloot.MclootPackage#getExplorationMapLootFunction_SkipExistingChunks()
   * @model
   * @generated
   */
  boolean isSkipExistingChunks();

  /**
   * Sets the value of the '{@link com.raptor.mcloottable.mcloot.ExplorationMapLootFunction#isSkipExistingChunks <em>Skip Existing Chunks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip Existing Chunks</em>' attribute.
   * @see #isSkipExistingChunks()
   * @generated
   */
  void setSkipExistingChunks(boolean value);

} // ExplorationMapLootFunction
