/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.mcentity.impl;

import com.raptor.mcentity.mcentity.McentityPackage;
import com.raptor.mcentity.mcentity.NamespacedKey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespaced Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcentity.mcentity.impl.NamespacedKeyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.raptor.mcentity.mcentity.impl.NamespacedKeyImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespacedKeyImpl extends NBTValueImpl implements NamespacedKey
{
  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespacedKeyImpl()
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
    return McentityPackage.Literals.NAMESPACED_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McentityPackage.NAMESPACED_KEY__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McentityPackage.NAMESPACED_KEY__KEY, oldKey, key));
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
      case McentityPackage.NAMESPACED_KEY__NAMESPACE:
        return getNamespace();
      case McentityPackage.NAMESPACED_KEY__KEY:
        return getKey();
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
      case McentityPackage.NAMESPACED_KEY__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case McentityPackage.NAMESPACED_KEY__KEY:
        setKey((String)newValue);
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
      case McentityPackage.NAMESPACED_KEY__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case McentityPackage.NAMESPACED_KEY__KEY:
        setKey(KEY_EDEFAULT);
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
      case McentityPackage.NAMESPACED_KEY__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case McentityPackage.NAMESPACED_KEY__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
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
    result.append(" (namespace: ");
    result.append(namespace);
    result.append(", key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

} //NamespacedKeyImpl