/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.TerminalExpression#isEvery <em>Every</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.TerminalExpression#getEveryExpression <em>Every Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.TerminalExpression#isParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.TerminalExpression#getBetweenParenthesis <em>Between Parenthesis</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.TerminalExpression#getSingleDefinition <em>Single Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Every</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every</em>' attribute.
   * @see #setEvery(boolean)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression_Every()
   * @model
   * @generated
   */
  boolean isEvery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.TerminalExpression#isEvery <em>Every</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every</em>' attribute.
   * @see #isEvery()
   * @generated
   */
  void setEvery(boolean value);

  /**
   * Returns the value of the '<em><b>Every Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every Expression</em>' containment reference.
   * @see #setEveryExpression(FollowBy)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression_EveryExpression()
   * @model containment="true"
   * @generated
   */
  FollowBy getEveryExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.TerminalExpression#getEveryExpression <em>Every Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every Expression</em>' containment reference.
   * @see #getEveryExpression()
   * @generated
   */
  void setEveryExpression(FollowBy value);

  /**
   * Returns the value of the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parenthesis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesis</em>' attribute.
   * @see #setParenthesis(boolean)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression_Parenthesis()
   * @model
   * @generated
   */
  boolean isParenthesis();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.TerminalExpression#isParenthesis <em>Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parenthesis</em>' attribute.
   * @see #isParenthesis()
   * @generated
   */
  void setParenthesis(boolean value);

  /**
   * Returns the value of the '<em><b>Between Parenthesis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Between Parenthesis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Between Parenthesis</em>' containment reference.
   * @see #setBetweenParenthesis(FollowBy)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression_BetweenParenthesis()
   * @model containment="true"
   * @generated
   */
  FollowBy getBetweenParenthesis();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.TerminalExpression#getBetweenParenthesis <em>Between Parenthesis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Between Parenthesis</em>' containment reference.
   * @see #getBetweenParenthesis()
   * @generated
   */
  void setBetweenParenthesis(FollowBy value);

  /**
   * Returns the value of the '<em><b>Single Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Definition</em>' containment reference.
   * @see #setSingleDefinition(SingleDefinition)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getTerminalExpression_SingleDefinition()
   * @model containment="true"
   * @generated
   */
  SingleDefinition getSingleDefinition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.TerminalExpression#getSingleDefinition <em>Single Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Definition</em>' containment reference.
   * @see #getSingleDefinition()
   * @generated
   */
  void setSingleDefinition(SingleDefinition value);

} // TerminalExpression
