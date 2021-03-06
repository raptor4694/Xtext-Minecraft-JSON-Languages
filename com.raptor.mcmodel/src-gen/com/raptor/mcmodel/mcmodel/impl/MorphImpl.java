/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.mcmodel.impl;

import com.raptor.mcmodel.mcmodel.McmodelPackage;
import com.raptor.mcmodel.mcmodel.Morph;
import com.raptor.mcmodel.mcmodel.Vec3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Morph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.raptor.mcmodel.mcmodel.impl.MorphImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.impl.MorphImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link com.raptor.mcmodel.mcmodel.impl.MorphImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MorphImpl extends MinimalEObjectImpl.Container implements Morph
{
  /**
   * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotation()
   * @generated
   * @ordered
   */
  protected Vec3d rotation;

  /**
   * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation()
   * @generated
   * @ordered
   */
  protected Vec3d translation;

  /**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected Vec3d scale;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MorphImpl()
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
    return McmodelPackage.Literals.MORPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vec3d getRotation()
  {
    return rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotation(Vec3d newRotation, NotificationChain msgs)
  {
    Vec3d oldRotation = rotation;
    rotation = newRotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__ROTATION, oldRotation, newRotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRotation(Vec3d newRotation)
  {
    if (newRotation != rotation)
    {
      NotificationChain msgs = null;
      if (rotation != null)
        msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__ROTATION, null, msgs);
      if (newRotation != null)
        msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__ROTATION, null, msgs);
      msgs = basicSetRotation(newRotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__ROTATION, newRotation, newRotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vec3d getTranslation()
  {
    return translation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTranslation(Vec3d newTranslation, NotificationChain msgs)
  {
    Vec3d oldTranslation = translation;
    translation = newTranslation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__TRANSLATION, oldTranslation, newTranslation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTranslation(Vec3d newTranslation)
  {
    if (newTranslation != translation)
    {
      NotificationChain msgs = null;
      if (translation != null)
        msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__TRANSLATION, null, msgs);
      if (newTranslation != null)
        msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__TRANSLATION, null, msgs);
      msgs = basicSetTranslation(newTranslation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__TRANSLATION, newTranslation, newTranslation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vec3d getScale()
  {
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScale(Vec3d newScale, NotificationChain msgs)
  {
    Vec3d oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__SCALE, oldScale, newScale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScale(Vec3d newScale)
  {
    if (newScale != scale)
    {
      NotificationChain msgs = null;
      if (scale != null)
        msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__SCALE, null, msgs);
      if (newScale != null)
        msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McmodelPackage.MORPH__SCALE, null, msgs);
      msgs = basicSetScale(newScale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McmodelPackage.MORPH__SCALE, newScale, newScale));
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
      case McmodelPackage.MORPH__ROTATION:
        return basicSetRotation(null, msgs);
      case McmodelPackage.MORPH__TRANSLATION:
        return basicSetTranslation(null, msgs);
      case McmodelPackage.MORPH__SCALE:
        return basicSetScale(null, msgs);
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
      case McmodelPackage.MORPH__ROTATION:
        return getRotation();
      case McmodelPackage.MORPH__TRANSLATION:
        return getTranslation();
      case McmodelPackage.MORPH__SCALE:
        return getScale();
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
      case McmodelPackage.MORPH__ROTATION:
        setRotation((Vec3d)newValue);
        return;
      case McmodelPackage.MORPH__TRANSLATION:
        setTranslation((Vec3d)newValue);
        return;
      case McmodelPackage.MORPH__SCALE:
        setScale((Vec3d)newValue);
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
      case McmodelPackage.MORPH__ROTATION:
        setRotation((Vec3d)null);
        return;
      case McmodelPackage.MORPH__TRANSLATION:
        setTranslation((Vec3d)null);
        return;
      case McmodelPackage.MORPH__SCALE:
        setScale((Vec3d)null);
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
      case McmodelPackage.MORPH__ROTATION:
        return rotation != null;
      case McmodelPackage.MORPH__TRANSLATION:
        return translation != null;
      case McmodelPackage.MORPH__SCALE:
        return scale != null;
    }
    return super.eIsSet(featureID);
  }

} //MorphImpl
