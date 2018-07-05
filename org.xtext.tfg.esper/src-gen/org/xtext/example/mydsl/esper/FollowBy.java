/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.FollowBy#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.FollowBy#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getFollowBy()
 * @model
 * @generated
 */
public interface FollowBy extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Side</em>' containment reference.
   * @see #setLeftSide(TerminalExpression)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getFollowBy_LeftSide()
   * @model containment="true"
   * @generated
   */
  TerminalExpression getLeftSide();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.FollowBy#getLeftSide <em>Left Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Side</em>' containment reference.
   * @see #getLeftSide()
   * @generated
   */
  void setLeftSide(TerminalExpression value);

  /**
   * Returns the value of the '<em><b>Right Side</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.esper.TerminalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side</em>' containment reference list.
   * @see org.xtext.example.mydsl.esper.EsperPackage#getFollowBy_RightSide()
   * @model containment="true"
   * @generated
   */
  EList<TerminalExpression> getRightSide();

} // FollowBy
