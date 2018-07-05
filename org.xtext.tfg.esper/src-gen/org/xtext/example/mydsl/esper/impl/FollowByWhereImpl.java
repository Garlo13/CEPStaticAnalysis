/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.esper.EsperPackage;
import org.xtext.example.mydsl.esper.FollowByWhere;
import org.xtext.example.mydsl.esper.Timer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Follow By Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.FollowByWhereImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowByWhereImpl extends MinimalEObjectImpl.Container implements FollowByWhere
{
  /**
   * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimer()
   * @generated
   * @ordered
   */
  protected Timer timer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FollowByWhereImpl()
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
    return EsperPackage.Literals.FOLLOW_BY_WHERE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timer getTimer()
  {
    return timer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimer(Timer newTimer, NotificationChain msgs)
  {
    Timer oldTimer = timer;
    timer = newTimer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsperPackage.FOLLOW_BY_WHERE__TIMER, oldTimer, newTimer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimer(Timer newTimer)
  {
    if (newTimer != timer)
    {
      NotificationChain msgs = null;
      if (timer != null)
        msgs = ((InternalEObject)timer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsperPackage.FOLLOW_BY_WHERE__TIMER, null, msgs);
      if (newTimer != null)
        msgs = ((InternalEObject)newTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsperPackage.FOLLOW_BY_WHERE__TIMER, null, msgs);
      msgs = basicSetTimer(newTimer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.FOLLOW_BY_WHERE__TIMER, newTimer, newTimer));
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
      case EsperPackage.FOLLOW_BY_WHERE__TIMER:
        return basicSetTimer(null, msgs);
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
      case EsperPackage.FOLLOW_BY_WHERE__TIMER:
        return getTimer();
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
      case EsperPackage.FOLLOW_BY_WHERE__TIMER:
        setTimer((Timer)newValue);
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
      case EsperPackage.FOLLOW_BY_WHERE__TIMER:
        setTimer((Timer)null);
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
      case EsperPackage.FOLLOW_BY_WHERE__TIMER:
        return timer != null;
    }
    return super.eIsSet(featureID);
  }

} //FollowByWhereImpl