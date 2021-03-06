/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalEsperParser;
import org.xtext.example.mydsl.services.EsperGrammarAccess;

public class EsperParser extends AbstractContentAssistParser {

	@Inject
	private EsperGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEsperParser createParser() {
		InternalEsperParser result = new InternalEsperParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDomainmodelAccess().getAlternatives(), "rule__Domainmodel__Alternatives");
					put(grammarAccess.getSelectAccess().getAlternatives(), "rule__Select__Alternatives");
					put(grammarAccess.getKindSelectAttributesDefinitionAccess().getAlternatives(), "rule__KindSelectAttributesDefinition__Alternatives");
					put(grammarAccess.getSingleSelectDefinitionAccess().getAlternatives_2(), "rule__SingleSelectDefinition__Alternatives_2");
					put(grammarAccess.getFromAccess().getAlternatives_1(), "rule__From__Alternatives_1");
					put(grammarAccess.getFromAccess().getAlternatives_1_0_1(), "rule__From__Alternatives_1_0_1");
					put(grammarAccess.getAbstractFollowByAccess().getAlternatives_0(), "rule__AbstractFollowBy__Alternatives_0");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getKindOfEventAccess().getAlternatives(), "rule__KindOfEvent__Alternatives");
					put(grammarAccess.getFollowByWhereAccess().getAlternatives(), "rule__FollowByWhere__Alternatives");
					put(grammarAccess.getValidIDAccess().getAlternatives(), "rule__ValidID__Alternatives");
					put(grammarAccess.getNameMethodAccess().getAlternatives(), "rule__NameMethod__Alternatives");
					put(grammarAccess.getAnythingAccess().getAlternatives_1_0(), "rule__Anything__Alternatives_1_0");
					put(grammarAccess.getOperatorsAccess().getAlternatives(), "rule__Operators__Alternatives");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getAttributesAccess().getGroup(), "rule__Attributes__Group__0");
					put(grammarAccess.getAttributesAccess().getGroup_2(), "rule__Attributes__Group_2__0");
					put(grammarAccess.getAttributesDefinitionAccess().getGroup(), "rule__AttributesDefinition__Group__0");
					put(grammarAccess.getRulePartsAccess().getGroup(), "rule__RuleParts__Group__0");
					put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getPriorityAccess().getGroup(), "rule__Priority__Group__0");
					put(grammarAccess.getSelectAccess().getGroup_0(), "rule__Select__Group_0__0");
					put(grammarAccess.getSelectAccess().getGroup_0_1(), "rule__Select__Group_0_1__0");
					put(grammarAccess.getSelectAccess().getGroup_0_1_1(), "rule__Select__Group_0_1_1__0");
					put(grammarAccess.getSelectAccess().getGroup_0_2(), "rule__Select__Group_0_2__0");
					put(grammarAccess.getSelectAccess().getGroup_0_2_2(), "rule__Select__Group_0_2_2__0");
					put(grammarAccess.getSelectAttributesDefinitionAccess().getGroup(), "rule__SelectAttributesDefinition__Group__0");
					put(grammarAccess.getSelectAttributesDefinitionAccess().getGroup_1(), "rule__SelectAttributesDefinition__Group_1__0");
					put(grammarAccess.getSingleSelectDefinitionAccess().getGroup(), "rule__SingleSelectDefinition__Group__0");
					put(grammarAccess.getFromAccess().getGroup(), "rule__From__Group__0");
					put(grammarAccess.getFromAccess().getGroup_1_0(), "rule__From__Group_1_0__0");
					put(grammarAccess.getFromAccess().getGroup_1_0_1_0(), "rule__From__Group_1_0_1_0__0");
					put(grammarAccess.getFromAccess().getGroup_1_0_1_1(), "rule__From__Group_1_0_1_1__0");
					put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
					put(grammarAccess.getPatternAccess().getGroup_4(), "rule__Pattern__Group_4__0");
					put(grammarAccess.getJoinFollowByAccess().getGroup(), "rule__JoinFollowBy__Group__0");
					put(grammarAccess.getJoinFollowByAccess().getGroup_1(), "rule__JoinFollowBy__Group_1__0");
					put(grammarAccess.getAbstractFollowByAccess().getGroup(), "rule__AbstractFollowBy__Group__0");
					put(grammarAccess.getAbstractFollowByAccess().getGroup_0_1(), "rule__AbstractFollowBy__Group_0_1__0");
					put(grammarAccess.getFollowByAccess().getGroup(), "rule__FollowBy__Group__0");
					put(grammarAccess.getFollowByAccess().getGroup_1(), "rule__FollowBy__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getSingleDefinitionAccess().getGroup(), "rule__SingleDefinition__Group__0");
					put(grammarAccess.getSingleDefinitionAccess().getGroup_0(), "rule__SingleDefinition__Group_0__0");
					put(grammarAccess.getSingleDefinitionAccess().getGroup_2(), "rule__SingleDefinition__Group_2__0");
					put(grammarAccess.getWinAccess().getGroup(), "rule__Win__Group__0");
					put(grammarAccess.getFollowByWhereAccess().getGroup_0(), "rule__FollowByWhere__Group_0__0");
					put(grammarAccess.getFollowByWhereAccess().getGroup_1(), "rule__FollowByWhere__Group_1__0");
					put(grammarAccess.getTimerAccess().getGroup(), "rule__Timer__Group__0");
					put(grammarAccess.getGroupByAccess().getGroup(), "rule__GroupBy__Group__0");
					put(grammarAccess.getHavingAccess().getGroup(), "rule__Having__Group__0");
					put(grammarAccess.getDefaultMethodsAccess().getGroup(), "rule__DefaultMethods__Group__0");
					put(grammarAccess.getAnythingAccess().getGroup(), "rule__Anything__Group__0");
					put(grammarAccess.getAnythingAccess().getGroup_1(), "rule__Anything__Group_1__0");
					put(grammarAccess.getExtraParenthesisRuleAccess().getGroup(), "rule__ExtraParenthesisRule__Group__0");
					put(grammarAccess.getDomainmodelAccess().getRulesAssignment_0(), "rule__Domainmodel__RulesAssignment_0");
					put(grammarAccess.getDomainmodelAccess().getEventsAssignment_1(), "rule__Domainmodel__EventsAssignment_1");
					put(grammarAccess.getEventAccess().getNameAssignment_2(), "rule__Event__NameAssignment_2");
					put(grammarAccess.getEventAccess().getEventattributesAssignment_3(), "rule__Event__EventattributesAssignment_3");
					put(grammarAccess.getAttributesAccess().getAttributeAssignment_1(), "rule__Attributes__AttributeAssignment_1");
					put(grammarAccess.getAttributesAccess().getAttributeAssignment_2_1(), "rule__Attributes__AttributeAssignment_2_1");
					put(grammarAccess.getAttributesDefinitionAccess().getNameAssignment_0(), "rule__AttributesDefinition__NameAssignment_0");
					put(grammarAccess.getAttributesDefinitionAccess().getTypeAssignment_1(), "rule__AttributesDefinition__TypeAssignment_1");
					put(grammarAccess.getRulePartsAccess().getNameRuleAssignment_0(), "rule__RuleParts__NameRuleAssignment_0");
					put(grammarAccess.getRulePartsAccess().getInsertAssignment_1(), "rule__RuleParts__InsertAssignment_1");
					put(grammarAccess.getRulePartsAccess().getPriorityAssignment_2(), "rule__RuleParts__PriorityAssignment_2");
					put(grammarAccess.getRulePartsAccess().getSelectRuleAssignment_3(), "rule__RuleParts__SelectRuleAssignment_3");
					put(grammarAccess.getRulePartsAccess().getFromRuleAssignment_4(), "rule__RuleParts__FromRuleAssignment_4");
					put(grammarAccess.getRulePartsAccess().getGroupByAssignment_5(), "rule__RuleParts__GroupByAssignment_5");
					put(grammarAccess.getRulePartsAccess().getHavingAssignment_6(), "rule__RuleParts__HavingAssignment_6");
					put(grammarAccess.getInsertAccess().getNameAssignment_2(), "rule__Insert__NameAssignment_2");
					put(grammarAccess.getNameAccess().getNameAssignment_2(), "rule__Name__NameAssignment_2");
					put(grammarAccess.getPriorityAccess().getPriorityIntAssignment_2(), "rule__Priority__PriorityIntAssignment_2");
					put(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_1_0(), "rule__Select__SelectAttributesAssignment_0_1_0");
					put(grammarAccess.getSelectAccess().getAliasAssignment_0_1_1_1(), "rule__Select__AliasAssignment_0_1_1_1");
					put(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_2_1(), "rule__Select__SelectAttributesAssignment_0_2_1");
					put(grammarAccess.getSelectAccess().getAliasAssignment_0_2_2_1(), "rule__Select__AliasAssignment_0_2_2_1");
					put(grammarAccess.getSelectAccess().getAsteriskAssignment_1(), "rule__Select__AsteriskAssignment_1");
					put(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionAssignment_0(), "rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0");
					put(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodAssignment_1(), "rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1");
					put(grammarAccess.getKindSelectAttributesDefinitionAccess().getIntAssignment_2(), "rule__KindSelectAttributesDefinition__IntAssignment_2");
					put(grammarAccess.getKindSelectAttributesDefinitionAccess().getStringAssignment_3(), "rule__KindSelectAttributesDefinition__StringAssignment_3");
					put(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideAssignment_0(), "rule__SelectAttributesDefinition__RightSideAssignment_0");
					put(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorAssignment_1_0(), "rule__SelectAttributesDefinition__OperatorAssignment_1_0");
					put(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideAssignment_1_1(), "rule__SelectAttributesDefinition__LeftSideAssignment_1_1");
					put(grammarAccess.getSingleSelectDefinitionAccess().getEventAssignment_0(), "rule__SingleSelectDefinition__EventAssignment_0");
					put(grammarAccess.getSingleSelectDefinitionAccess().getAttributeAssignment_2_0(), "rule__SingleSelectDefinition__AttributeAssignment_2_0");
					put(grammarAccess.getFromAccess().getEventAssignment_1_0_0(), "rule__From__EventAssignment_1_0_0");
					put(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_0_1(), "rule__From__AnythingAssignment_1_0_1_0_1");
					put(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_1_1(), "rule__From__AnythingAssignment_1_0_1_1_1");
					put(grammarAccess.getFromAccess().getPatternAssignment_1_1(), "rule__From__PatternAssignment_1_1");
					put(grammarAccess.getPatternAccess().getJoinFollowByAssignment_2(), "rule__Pattern__JoinFollowByAssignment_2");
					put(grammarAccess.getPatternAccess().getWinAssignment_4_1(), "rule__Pattern__WinAssignment_4_1");
					put(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_0(), "rule__JoinFollowBy__FollowsByJoinListAssignment_0");
					put(grammarAccess.getJoinFollowByAccess().getOperatorAssignment_1_0(), "rule__JoinFollowBy__OperatorAssignment_1_0");
					put(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_1_1(), "rule__JoinFollowBy__FollowsByJoinListAssignment_1_1");
					put(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_0(), "rule__AbstractFollowBy__FollowByAssignment_0_0");
					put(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_1_1(), "rule__AbstractFollowBy__FollowByAssignment_0_1_1");
					put(grammarAccess.getAbstractFollowByAccess().getWherePartAssignment_1(), "rule__AbstractFollowBy__WherePartAssignment_1");
					put(grammarAccess.getFollowByAccess().getLeftSideAssignment_0(), "rule__FollowBy__LeftSideAssignment_0");
					put(grammarAccess.getFollowByAccess().getRightSideAssignment_1_1(), "rule__FollowBy__RightSideAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getEveryAssignment_0_0(), "rule__TerminalExpression__EveryAssignment_0_0");
					put(grammarAccess.getTerminalExpressionAccess().getEveryExpressionAssignment_0_1(), "rule__TerminalExpression__EveryExpressionAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getParenthesisAssignment_1_0(), "rule__TerminalExpression__ParenthesisAssignment_1_0");
					put(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisAssignment_1_1(), "rule__TerminalExpression__BetweenParenthesisAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionAssignment_2(), "rule__TerminalExpression__SingleDefinitionAssignment_2");
					put(grammarAccess.getSingleDefinitionAccess().getNameAssignment_0_0(), "rule__SingleDefinition__NameAssignment_0_0");
					put(grammarAccess.getSingleDefinitionAccess().getSimpleEventsAssignment_1(), "rule__SingleDefinition__SimpleEventsAssignment_1");
					put(grammarAccess.getSingleDefinitionAccess().getAnythingAssignment_2_1(), "rule__SingleDefinition__AnythingAssignment_2_1");
					put(grammarAccess.getWinAccess().getDefaultMethodAssignment_2(), "rule__Win__DefaultMethodAssignment_2");
					put(grammarAccess.getFollowByWhereAccess().getTimerAssignment_1_1(), "rule__FollowByWhere__TimerAssignment_1_1");
					put(grammarAccess.getTimerAccess().getDefaultMethodAssignment_2(), "rule__Timer__DefaultMethodAssignment_2");
					put(grammarAccess.getGroupByAccess().getAnythingAssignment_2(), "rule__GroupBy__AnythingAssignment_2");
					put(grammarAccess.getHavingAccess().getDefaultMethodAssignment_1(), "rule__Having__DefaultMethodAssignment_1");
					put(grammarAccess.getHavingAccess().getOperatorAssignment_2(), "rule__Having__OperatorAssignment_2");
					put(grammarAccess.getHavingAccess().getAnythingAssignment_3(), "rule__Having__AnythingAssignment_3");
					put(grammarAccess.getDefaultMethodsAccess().getNameAssignment_0(), "rule__DefaultMethods__NameAssignment_0");
					put(grammarAccess.getDefaultMethodsAccess().getAnythingAssignment_2(), "rule__DefaultMethods__AnythingAssignment_2");
					put(grammarAccess.getAnythingAccess().getOperatorAssignment_1_0_4(), "rule__Anything__OperatorAssignment_1_0_4");
					put(grammarAccess.getAnythingAccess().getExtraParenthesisAssignment_1_0_5(), "rule__Anything__ExtraParenthesisAssignment_1_0_5");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EsperGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EsperGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
