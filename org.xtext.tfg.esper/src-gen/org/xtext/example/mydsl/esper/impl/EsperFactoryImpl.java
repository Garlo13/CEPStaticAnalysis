/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.esper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsperFactoryImpl extends EFactoryImpl implements EsperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EsperFactory init()
  {
    try
    {
      EsperFactory theEsperFactory = (EsperFactory)EPackage.Registry.INSTANCE.getEFactory(EsperPackage.eNS_URI);
      if (theEsperFactory != null)
      {
        return theEsperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EsperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsperFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EsperPackage.DOMAINMODEL: return createDomainmodel();
      case EsperPackage.EVENT: return createEvent();
      case EsperPackage.ATTRIBUTES: return createAttributes();
      case EsperPackage.ATTRIBUTES_DEFINITION: return createAttributesDefinition();
      case EsperPackage.RULE_PARTS: return createRuleParts();
      case EsperPackage.INSERT: return createInsert();
      case EsperPackage.NAME: return createName();
      case EsperPackage.PRIORITY: return createPriority();
      case EsperPackage.SELECT: return createSelect();
      case EsperPackage.KIND_SELECT_ATTRIBUTES_DEFINITION: return createKindSelectAttributesDefinition();
      case EsperPackage.SELECT_ATTRIBUTES_DEFINITION: return createSelectAttributesDefinition();
      case EsperPackage.SINGLE_SELECT_DEFINITION: return createSingleSelectDefinition();
      case EsperPackage.FROM: return createFrom();
      case EsperPackage.PATTERN: return createPattern();
      case EsperPackage.JOIN_FOLLOW_BY: return createJoinFollowBy();
      case EsperPackage.ABSTRACT_FOLLOW_BY: return createAbstractFollowBy();
      case EsperPackage.FOLLOW_BY: return createFollowBy();
      case EsperPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case EsperPackage.KIND_OF_EVENT: return createKindOfEvent();
      case EsperPackage.SINGLE_DEFINITION: return createSingleDefinition();
      case EsperPackage.WIN: return createWin();
      case EsperPackage.FOLLOW_BY_WHERE: return createFollowByWhere();
      case EsperPackage.TIMER: return createTimer();
      case EsperPackage.GROUP_BY: return createGroupBy();
      case EsperPackage.HAVING: return createHaving();
      case EsperPackage.DEFAULT_METHODS: return createDefaultMethods();
      case EsperPackage.ANYTHING: return createAnything();
      case EsperPackage.EXTRA_PARENTHESIS_RULE: return createExtraParenthesisRule();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EsperPackage.OPERATORS:
        return createOperatorsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EsperPackage.OPERATORS:
        return convertOperatorsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesDefinition createAttributesDefinition()
  {
    AttributesDefinitionImpl attributesDefinition = new AttributesDefinitionImpl();
    return attributesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleParts createRuleParts()
  {
    RulePartsImpl ruleParts = new RulePartsImpl();
    return ruleParts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindSelectAttributesDefinition createKindSelectAttributesDefinition()
  {
    KindSelectAttributesDefinitionImpl kindSelectAttributesDefinition = new KindSelectAttributesDefinitionImpl();
    return kindSelectAttributesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAttributesDefinition createSelectAttributesDefinition()
  {
    SelectAttributesDefinitionImpl selectAttributesDefinition = new SelectAttributesDefinitionImpl();
    return selectAttributesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSelectDefinition createSingleSelectDefinition()
  {
    SingleSelectDefinitionImpl singleSelectDefinition = new SingleSelectDefinitionImpl();
    return singleSelectDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinFollowBy createJoinFollowBy()
  {
    JoinFollowByImpl joinFollowBy = new JoinFollowByImpl();
    return joinFollowBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFollowBy createAbstractFollowBy()
  {
    AbstractFollowByImpl abstractFollowBy = new AbstractFollowByImpl();
    return abstractFollowBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowBy createFollowBy()
  {
    FollowByImpl followBy = new FollowByImpl();
    return followBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindOfEvent createKindOfEvent()
  {
    KindOfEventImpl kindOfEvent = new KindOfEventImpl();
    return kindOfEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleDefinition createSingleDefinition()
  {
    SingleDefinitionImpl singleDefinition = new SingleDefinitionImpl();
    return singleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Win createWin()
  {
    WinImpl win = new WinImpl();
    return win;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowByWhere createFollowByWhere()
  {
    FollowByWhereImpl followByWhere = new FollowByWhereImpl();
    return followByWhere;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timer createTimer()
  {
    TimerImpl timer = new TimerImpl();
    return timer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupBy createGroupBy()
  {
    GroupByImpl groupBy = new GroupByImpl();
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Having createHaving()
  {
    HavingImpl having = new HavingImpl();
    return having;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultMethods createDefaultMethods()
  {
    DefaultMethodsImpl defaultMethods = new DefaultMethodsImpl();
    return defaultMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anything createAnything()
  {
    AnythingImpl anything = new AnythingImpl();
    return anything;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtraParenthesisRule createExtraParenthesisRule()
  {
    ExtraParenthesisRuleImpl extraParenthesisRule = new ExtraParenthesisRuleImpl();
    return extraParenthesisRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operators createOperatorsFromString(EDataType eDataType, String initialValue)
  {
    Operators result = Operators.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsperPackage getEsperPackage()
  {
    return (EsperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EsperPackage getPackage()
  {
    return EsperPackage.eINSTANCE;
  }

} //EsperFactoryImpl
