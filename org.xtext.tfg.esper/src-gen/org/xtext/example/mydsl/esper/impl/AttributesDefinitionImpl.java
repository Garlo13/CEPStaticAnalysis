/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.esper.AttributesDefinition;
import org.xtext.example.mydsl.esper.EsperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.AttributesDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.AttributesDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesDefinitionImpl extends MinimalEObjectImpl.Container implements AttributesDefinition
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<String> type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributesDefinitionImpl()
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
    return EsperPackage.Literals.ATTRIBUTES_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, EsperPackage.ATTRIBUTES_DEFINITION__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getType()
  {
    if (type == null)
    {
      type = new EDataTypeEList<String>(String.class, this, EsperPackage.ATTRIBUTES_DEFINITION__TYPE);
    }
    return type;
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
      case EsperPackage.ATTRIBUTES_DEFINITION__NAME:
        return getName();
      case EsperPackage.ATTRIBUTES_DEFINITION__TYPE:
        return getType();
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
      case EsperPackage.ATTRIBUTES_DEFINITION__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case EsperPackage.ATTRIBUTES_DEFINITION__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends String>)newValue);
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
      case EsperPackage.ATTRIBUTES_DEFINITION__NAME:
        getName().clear();
        return;
      case EsperPackage.ATTRIBUTES_DEFINITION__TYPE:
        getType().clear();
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
      case EsperPackage.ATTRIBUTES_DEFINITION__NAME:
        return name != null && !name.isEmpty();
      case EsperPackage.ATTRIBUTES_DEFINITION__TYPE:
        return type != null && !type.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AttributesDefinitionImpl