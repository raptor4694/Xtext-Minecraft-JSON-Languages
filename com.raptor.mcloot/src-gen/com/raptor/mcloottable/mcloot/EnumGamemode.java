/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.mcloot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Gamemode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.raptor.mcloottable.mcloot.MclootPackage#getEnumGamemode()
 * @model
 * @generated
 */
public enum EnumGamemode implements Enumerator
{
  /**
   * The '<em><b>SURVIVAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SURVIVAL_VALUE
   * @generated
   * @ordered
   */
  SURVIVAL(0, "SURVIVAL", "survival"),

  /**
   * The '<em><b>CREATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATIVE_VALUE
   * @generated
   * @ordered
   */
  CREATIVE(1, "CREATIVE", "creative"),

  /**
   * The '<em><b>ADVENTURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADVENTURE_VALUE
   * @generated
   * @ordered
   */
  ADVENTURE(2, "ADVENTURE", "adventure"),

  /**
   * The '<em><b>SPECTATOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECTATOR_VALUE
   * @generated
   * @ordered
   */
  SPECTATOR(3, "SPECTATOR", "spectator");

  /**
   * The '<em><b>SURVIVAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SURVIVAL
   * @model literal="survival"
   * @generated
   * @ordered
   */
  public static final int SURVIVAL_VALUE = 0;

  /**
   * The '<em><b>CREATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATIVE
   * @model literal="creative"
   * @generated
   * @ordered
   */
  public static final int CREATIVE_VALUE = 1;

  /**
   * The '<em><b>ADVENTURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADVENTURE
   * @model literal="adventure"
   * @generated
   * @ordered
   */
  public static final int ADVENTURE_VALUE = 2;

  /**
   * The '<em><b>SPECTATOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECTATOR
   * @model literal="spectator"
   * @generated
   * @ordered
   */
  public static final int SPECTATOR_VALUE = 3;

  /**
   * An array of all the '<em><b>Enum Gamemode</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumGamemode[] VALUES_ARRAY =
    new EnumGamemode[]
    {
      SURVIVAL,
      CREATIVE,
      ADVENTURE,
      SPECTATOR,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Gamemode</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumGamemode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Gamemode</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumGamemode get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumGamemode result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Gamemode</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumGamemode getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumGamemode result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Gamemode</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumGamemode get(int value)
  {
    switch (value)
    {
      case SURVIVAL_VALUE: return SURVIVAL;
      case CREATIVE_VALUE: return CREATIVE;
      case ADVENTURE_VALUE: return ADVENTURE;
      case SPECTATOR_VALUE: return SPECTATOR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EnumGamemode(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EnumGamemode