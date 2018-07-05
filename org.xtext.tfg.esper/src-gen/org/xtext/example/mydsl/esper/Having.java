/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Having</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.Having#getDefaultMethod <em>Default Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.Having#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.Having#getAnything <em>Anything</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getHaving()
 * @model
 * @generated
 */
public interface Having extends EObject
{
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
   * @see org.xtext.example.mydsl.esper.EsperPackage#getHaving_DefaultMethod()
   * @model containment="true"
   * @generated
   */
  DefaultMethods getDefaultMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.Having#getDefaultMethod <em>Default Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Method</em>' containment reference.
   * @see #getDefaultMethod()
   * @generated
   */
  void setDefaultMethod(DefaultMethods value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.esper.Operators}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.xtext.example.mydsl.esper.Operators
   * @see #setOperator(Operators)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getHaving_Operator()
   * @model
   * @generated
   */
  Operators getOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.Having#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.xtext.example.mydsl.esper.Operators
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operators value);

  /**
   * Returns the value of the '<em><b>Anything</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anything</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anything</em>' containment reference.
   * @see #setAnything(Anything)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getHaving_Anything()
   * @model containment="true"
   * @generated
   */
  Anything getAnything();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.Having#getAnything <em>Anything</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anything</em>' containment reference.
   * @see #getAnything()
   * @generated
   */
  void setAnything(Anything value);

} // Having
