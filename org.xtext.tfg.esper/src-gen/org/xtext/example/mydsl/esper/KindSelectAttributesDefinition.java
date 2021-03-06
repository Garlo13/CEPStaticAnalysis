/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Select Attributes Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getSingleSelectDefinition <em>Single Select Definition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getDefaultMethod <em>Default Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getKindSelectAttributesDefinition()
 * @model
 * @generated
 */
public interface KindSelectAttributesDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Single Select Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Select Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Select Definition</em>' containment reference.
   * @see #setSingleSelectDefinition(SingleSelectDefinition)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getKindSelectAttributesDefinition_SingleSelectDefinition()
   * @model containment="true"
   * @generated
   */
  SingleSelectDefinition getSingleSelectDefinition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getSingleSelectDefinition <em>Single Select Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Select Definition</em>' containment reference.
   * @see #getSingleSelectDefinition()
   * @generated
   */
  void setSingleSelectDefinition(SingleSelectDefinition value);

  /**
   * Returns the value of the '<em><b>Default Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Method</em>' containment reference.
   * @see #setDefaultMethod(DefaultMethods)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getKindSelectAttributesDefinition_DefaultMethod()
   * @model containment="true"
   * @generated
   */
  DefaultMethods getDefaultMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getDefaultMethod <em>Default Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Method</em>' containment reference.
   * @see #getDefaultMethod()
   * @generated
   */
  void setDefaultMethod(DefaultMethods value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getKindSelectAttributesDefinition_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getKindSelectAttributesDefinition_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.KindSelectAttributesDefinition#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // KindSelectAttributesDefinition
