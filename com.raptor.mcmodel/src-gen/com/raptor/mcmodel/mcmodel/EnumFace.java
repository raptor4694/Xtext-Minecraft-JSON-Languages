/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.mcmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Face</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.raptor.mcmodel.mcmodel.McmodelPackage#getEnumFace()
 * @model
 * @generated
 */
public enum EnumFace implements Enumerator
{
  /**
   * The '<em><b>NORTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH_VALUE
   * @generated
   * @ordered
   */
  NORTH(0, "NORTH", "north"),

  /**
   * The '<em><b>SOUTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_VALUE
   * @generated
   * @ordered
   */
  SOUTH(1, "SOUTH", "south"),

  /**
   * The '<em><b>EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST_VALUE
   * @generated
   * @ordered
   */
  EAST(2, "EAST", "east"),

  /**
   * The '<em><b>WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST_VALUE
   * @generated
   * @ordered
   */
  WEST(3, "WEST", "west"),

  /**
   * The '<em><b>UP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UP_VALUE
   * @generated
   * @ordered
   */
  UP(4, "UP", "up"),

  /**
   * The '<em><b>DOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOWN_VALUE
   * @generated
   * @ordered
   */
  DOWN(5, "DOWN", "down");

  /**
   * The '<em><b>NORTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH
   * @model literal="north"
   * @generated
   * @ordered
   */
  public static final int NORTH_VALUE = 0;

  /**
   * The '<em><b>SOUTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH
   * @model literal="south"
   * @generated
   * @ordered
   */
  public static final int SOUTH_VALUE = 1;

  /**
   * The '<em><b>EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST
   * @model literal="east"
   * @generated
   * @ordered
   */
  public static final int EAST_VALUE = 2;

  /**
   * The '<em><b>WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST
   * @model literal="west"
   * @generated
   * @ordered
   */
  public static final int WEST_VALUE = 3;

  /**
   * The '<em><b>UP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UP
   * @model literal="up"
   * @generated
   * @ordered
   */
  public static final int UP_VALUE = 4;

  /**
   * The '<em><b>DOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOWN
   * @model literal="down"
   * @generated
   * @ordered
   */
  public static final int DOWN_VALUE = 5;

  /**
   * An array of all the '<em><b>Enum Face</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumFace[] VALUES_ARRAY =
    new EnumFace[]
    {
      NORTH,
      SOUTH,
      EAST,
      WEST,
      UP,
      DOWN,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Face</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumFace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Face</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumFace get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumFace result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Face</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumFace getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumFace result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Face</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumFace get(int value)
  {
    switch (value)
    {
      case NORTH_VALUE: return NORTH;
      case SOUTH_VALUE: return SOUTH;
      case EAST_VALUE: return EAST;
      case WEST_VALUE: return WEST;
      case UP_VALUE: return UP;
      case DOWN_VALUE: return DOWN;
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
  private EnumFace(int value, String name, String literal)
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
  
} //EnumFace
