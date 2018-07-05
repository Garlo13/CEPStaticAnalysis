/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.esper.EsperPackage;
import org.xtext.example.mydsl.esper.SingleDefinition;
import org.xtext.example.mydsl.esper.SingleSelectDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Select Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.SingleSelectDefinitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.SingleSelectDefinitionImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleSelectDefinitionImpl extends MinimalEObjectImpl.Container implements SingleSelectDefinition
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<SingleDefinition> event;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<String> attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSelectDefinitionImpl()
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
    return EsperPackage.Literals.SINGLE_SELECT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SingleDefinition> getEvent()
  {
    if (event == null)
    {
      event = new EObjectResolvingEList<SingleDefinition>(SingleDefinition.class, this, EsperPackage.SINGLE_SELECT_DEFINITION__EVENT);
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EDataTypeEList<String>(String.class, this, EsperPackage.SINGLE_SELECT_DEFINITION__ATTRIBUTE);
    }
    return attribute;
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
      case EsperPackage.SINGLE_SELECT_DEFINITION__EVENT:
        return getEvent();
      case EsperPackage.SINGLE_SELECT_DEFINITION__ATTRIBUTE:
        return getAttribute();
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
      case EsperPackage.SINGLE_SELECT_DEFINITION__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends SingleDefinition>)newValue);
        return;
      case EsperPackage.SINGLE_SELECT_DEFINITION__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends String>)newValue);
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
      case EsperPackage.SINGLE_SELECT_DEFINITION__EVENT:
        getEvent().clear();
        return;
      case EsperPackage.SINGLE_SELECT_DEFINITION__ATTRIBUTE:
        getAttribute().clear();
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
      case EsperPackage.SINGLE_SELECT_DEFINITION__EVENT:
        return event != null && !event.isEmpty();
      case EsperPackage.SINGLE_SELECT_DEFINITION__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (attribute: ");
    result.append(attribute);
    result.append(')');
    return result.toString();
  }

} //SingleSelectDefinitionImpl
