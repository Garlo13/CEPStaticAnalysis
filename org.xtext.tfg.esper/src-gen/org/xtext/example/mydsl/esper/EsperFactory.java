/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.esper.EsperPackage
 * @generated
 */
public interface EsperFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsperFactory eINSTANCE = org.xtext.example.mydsl.esper.impl.EsperFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes</em>'.
   * @generated
   */
  Attributes createAttributes();

  /**
   * Returns a new object of class '<em>Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes Definition</em>'.
   * @generated
   */
  AttributesDefinition createAttributesDefinition();

  /**
   * Returns a new object of class '<em>Rule Parts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Parts</em>'.
   * @generated
   */
  RuleParts createRuleParts();

  /**
   * Returns a new object of class '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert</em>'.
   * @generated
   */
  Insert createInsert();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Priority</em>'.
   * @generated
   */
  Priority createPriority();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>Kind Select Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kind Select Attributes Definition</em>'.
   * @generated
   */
  KindSelectAttributesDefinition createKindSelectAttributesDefinition();

  /**
   * Returns a new object of class '<em>Select Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Attributes Definition</em>'.
   * @generated
   */
  SelectAttributesDefinition createSelectAttributesDefinition();

  /**
   * Returns a new object of class '<em>Single Select Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Select Definition</em>'.
   * @generated
   */
  SingleSelectDefinition createSingleSelectDefinition();

  /**
   * Returns a new object of class '<em>From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From</em>'.
   * @generated
   */
  From createFrom();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Join Follow By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Follow By</em>'.
   * @generated
   */
  JoinFollowBy createJoinFollowBy();

  /**
   * Returns a new object of class '<em>Abstract Follow By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Follow By</em>'.
   * @generated
   */
  AbstractFollowBy createAbstractFollowBy();

  /**
   * Returns a new object of class '<em>Follow By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Follow By</em>'.
   * @generated
   */
  FollowBy createFollowBy();

  /**
   * Returns a new object of class '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal Expression</em>'.
   * @generated
   */
  TerminalExpression createTerminalExpression();

  /**
   * Returns a new object of class '<em>Kind Of Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kind Of Event</em>'.
   * @generated
   */
  KindOfEvent createKindOfEvent();

  /**
   * Returns a new object of class '<em>Single Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Definition</em>'.
   * @generated
   */
  SingleDefinition createSingleDefinition();

  /**
   * Returns a new object of class '<em>Win</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Win</em>'.
   * @generated
   */
  Win createWin();

  /**
   * Returns a new object of class '<em>Follow By Where</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Follow By Where</em>'.
   * @generated
   */
  FollowByWhere createFollowByWhere();

  /**
   * Returns a new object of class '<em>Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timer</em>'.
   * @generated
   */
  Timer createTimer();

  /**
   * Returns a new object of class '<em>Group By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group By</em>'.
   * @generated
   */
  GroupBy createGroupBy();

  /**
   * Returns a new object of class '<em>Having</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Having</em>'.
   * @generated
   */
  Having createHaving();

  /**
   * Returns a new object of class '<em>Default Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Methods</em>'.
   * @generated
   */
  DefaultMethods createDefaultMethods();

  /**
   * Returns a new object of class '<em>Anything</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anything</em>'.
   * @generated
   */
  Anything createAnything();

  /**
   * Returns a new object of class '<em>Extra Parenthesis Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extra Parenthesis Rule</em>'.
   * @generated
   */
  ExtraParenthesisRule createExtraParenthesisRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EsperPackage getEsperPackage();

} //EsperFactory
