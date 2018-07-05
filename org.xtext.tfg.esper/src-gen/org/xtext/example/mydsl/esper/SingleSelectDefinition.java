/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Select Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.SingleSelectDefinition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.SingleSelectDefinition#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getSingleSelectDefinition()
 * @model
 * @generated
 */
public interface SingleSelectDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.esper.SingleDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference list.
   * @see org.xtext.example.mydsl.esper.EsperPackage#getSingleSelectDefinition_Event()
   * @model
   * @generated
   */
  EList<SingleDefinition> getEvent();

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute list.
   * @see org.xtext.example.mydsl.esper.EsperPackage#getSingleSelectDefinition_Attribute()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttribute();

} // SingleSelectDefinition
