package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.EsperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEsperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'create'", "'schema'", "';'", "'('", "','", "')'", "'insert'", "'into'", "'@Name'", "'@Priority'", "'select'", "'as'", "'*'", "'.'", "'from'", "'pattern'", "'['", "']'", "'->'", "'every'", "'='", "'win'", "':'", "'where'", "'timer'", "'group'", "'by'", "'having'", "'avg'", "'current_timestamp'", "'count'", "'max'", "'within'", "'time_batch'", "'time'", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'between'", "'in'", "'not'", "'not in'", "'+'", "'-'", "'is not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEsperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsperParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEsper.g"; }



     	private EsperGrammarAccess grammarAccess;

        public InternalEsperParser(TokenStream input, EsperGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected EsperGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalEsper.g:65:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalEsper.g:65:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalEsper.g:66:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalEsper.g:72:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_rules_0_0= ruleRuleParts ) ) | ( (lv_events_1_0= ruleEvent ) ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;

        EObject lv_events_1_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:78:2: ( ( ( (lv_rules_0_0= ruleRuleParts ) ) | ( (lv_events_1_0= ruleEvent ) ) )* )
            // InternalEsper.g:79:2: ( ( (lv_rules_0_0= ruleRuleParts ) ) | ( (lv_events_1_0= ruleEvent ) ) )*
            {
            // InternalEsper.g:79:2: ( ( (lv_rules_0_0= ruleRuleParts ) ) | ( (lv_events_1_0= ruleEvent ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsper.g:80:3: ( (lv_rules_0_0= ruleRuleParts ) )
            	    {
            	    // InternalEsper.g:80:3: ( (lv_rules_0_0= ruleRuleParts ) )
            	    // InternalEsper.g:81:4: (lv_rules_0_0= ruleRuleParts )
            	    {
            	    // InternalEsper.g:81:4: (lv_rules_0_0= ruleRuleParts )
            	    // InternalEsper.g:82:5: lv_rules_0_0= ruleRuleParts
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainmodelAccess().getRulesRulePartsParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rules_0_0=ruleRuleParts();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_0_0,
            	      						"org.xtext.example.mydsl.Esper.RuleParts");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsper.g:100:3: ( (lv_events_1_0= ruleEvent ) )
            	    {
            	    // InternalEsper.g:100:3: ( (lv_events_1_0= ruleEvent ) )
            	    // InternalEsper.g:101:4: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalEsper.g:101:4: (lv_events_1_0= ruleEvent )
            	    // InternalEsper.g:102:5: lv_events_1_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainmodelAccess().getEventsEventParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_events_1_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"events",
            	      						lv_events_1_0,
            	      						"org.xtext.example.mydsl.Esper.Event");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleEvent"
    // InternalEsper.g:123:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEsper.g:123:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEsper.g:124:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEsper.g:130:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) ( (lv_eventattributes_3_0= ruleAttributes ) ) otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_eventattributes_3_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:136:2: ( (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) ( (lv_eventattributes_3_0= ruleAttributes ) ) otherlv_4= ';' ) )
            // InternalEsper.g:137:2: (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) ( (lv_eventattributes_3_0= ruleAttributes ) ) otherlv_4= ';' )
            {
            // InternalEsper.g:137:2: (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) ( (lv_eventattributes_3_0= ruleAttributes ) ) otherlv_4= ';' )
            // InternalEsper.g:138:3: otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) ( (lv_eventattributes_3_0= ruleAttributes ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getCreateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getSchemaKeyword_1());
              		
            }
            // InternalEsper.g:146:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEsper.g:147:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEsper.g:147:4: (lv_name_2_0= RULE_ID )
            // InternalEsper.g:148:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalEsper.g:164:3: ( (lv_eventattributes_3_0= ruleAttributes ) )
            // InternalEsper.g:165:4: (lv_eventattributes_3_0= ruleAttributes )
            {
            // InternalEsper.g:165:4: (lv_eventattributes_3_0= ruleAttributes )
            // InternalEsper.g:166:5: lv_eventattributes_3_0= ruleAttributes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventAccess().getEventattributesAttributesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_eventattributes_3_0=ruleAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventRule());
              					}
              					set(
              						current,
              						"eventattributes",
              						lv_eventattributes_3_0,
              						"org.xtext.example.mydsl.Esper.Attributes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAttributes"
    // InternalEsper.g:191:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalEsper.g:191:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalEsper.g:192:2: iv_ruleAttributes= ruleAttributes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalEsper.g:198:1: ruleAttributes returns [EObject current=null] : (otherlv_0= '(' ( (lv_attribute_1_0= ruleAttributesDefinition ) ) (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attribute_1_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:204:2: ( (otherlv_0= '(' ( (lv_attribute_1_0= ruleAttributesDefinition ) ) (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )* otherlv_4= ')' ) )
            // InternalEsper.g:205:2: (otherlv_0= '(' ( (lv_attribute_1_0= ruleAttributesDefinition ) ) (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )* otherlv_4= ')' )
            {
            // InternalEsper.g:205:2: (otherlv_0= '(' ( (lv_attribute_1_0= ruleAttributesDefinition ) ) (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )* otherlv_4= ')' )
            // InternalEsper.g:206:3: otherlv_0= '(' ( (lv_attribute_1_0= ruleAttributesDefinition ) ) (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalEsper.g:210:3: ( (lv_attribute_1_0= ruleAttributesDefinition ) )
            // InternalEsper.g:211:4: (lv_attribute_1_0= ruleAttributesDefinition )
            {
            // InternalEsper.g:211:4: (lv_attribute_1_0= ruleAttributesDefinition )
            // InternalEsper.g:212:5: lv_attribute_1_0= ruleAttributesDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_attribute_1_0=ruleAttributesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributesRule());
              					}
              					add(
              						current,
              						"attribute",
              						lv_attribute_1_0,
              						"org.xtext.example.mydsl.Esper.AttributesDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:229:3: (otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEsper.g:230:4: otherlv_2= ',' ( (lv_attribute_3_0= ruleAttributesDefinition ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAttributesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalEsper.g:234:4: ( (lv_attribute_3_0= ruleAttributesDefinition ) )
            	    // InternalEsper.g:235:5: (lv_attribute_3_0= ruleAttributesDefinition )
            	    {
            	    // InternalEsper.g:235:5: (lv_attribute_3_0= ruleAttributesDefinition )
            	    // InternalEsper.g:236:6: lv_attribute_3_0= ruleAttributesDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_attribute_3_0=ruleAttributesDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAttributesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"attribute",
            	      							lv_attribute_3_0,
            	      							"org.xtext.example.mydsl.Esper.AttributesDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAttributesAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttributesDefinition"
    // InternalEsper.g:262:1: entryRuleAttributesDefinition returns [EObject current=null] : iv_ruleAttributesDefinition= ruleAttributesDefinition EOF ;
    public final EObject entryRuleAttributesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributesDefinition = null;


        try {
            // InternalEsper.g:262:61: (iv_ruleAttributesDefinition= ruleAttributesDefinition EOF )
            // InternalEsper.g:263:2: iv_ruleAttributesDefinition= ruleAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributesDefinition=ruleAttributesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributesDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributesDefinition"


    // $ANTLR start "ruleAttributesDefinition"
    // InternalEsper.g:269:1: ruleAttributesDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributesDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalEsper.g:275:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_ID ) ) ) )
            // InternalEsper.g:276:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_ID ) ) )
            {
            // InternalEsper.g:276:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_ID ) ) )
            // InternalEsper.g:277:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_ID ) )
            {
            // InternalEsper.g:277:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsper.g:278:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsper.g:278:4: (lv_name_0_0= RULE_ID )
            // InternalEsper.g:279:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAttributesDefinitionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributesDefinitionRule());
              					}
              					addWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalEsper.g:295:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalEsper.g:296:4: (lv_type_1_0= RULE_ID )
            {
            // InternalEsper.g:296:4: (lv_type_1_0= RULE_ID )
            // InternalEsper.g:297:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_1_0, grammarAccess.getAttributesDefinitionAccess().getTypeIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributesDefinitionRule());
              					}
              					addWithLastConsumed(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributesDefinition"


    // $ANTLR start "entryRuleRuleParts"
    // InternalEsper.g:317:1: entryRuleRuleParts returns [EObject current=null] : iv_ruleRuleParts= ruleRuleParts EOF ;
    public final EObject entryRuleRuleParts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleParts = null;


        try {
            // InternalEsper.g:317:50: (iv_ruleRuleParts= ruleRuleParts EOF )
            // InternalEsper.g:318:2: iv_ruleRuleParts= ruleRuleParts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulePartsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleParts=ruleRuleParts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleParts; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleParts"


    // $ANTLR start "ruleRuleParts"
    // InternalEsper.g:324:1: ruleRuleParts returns [EObject current=null] : ( ( (lv_nameRule_0_0= ruleName ) ) ( (lv_insert_1_0= ruleInsert ) ) ( (lv_priority_2_0= rulePriority ) )? ( (lv_selectRule_3_0= ruleSelect ) ) ( (lv_fromRule_4_0= ruleFrom ) ) ( (lv_groupBy_5_0= ruleGroupBy ) )? ( (lv_having_6_0= ruleHaving ) )? otherlv_7= ';' ) ;
    public final EObject ruleRuleParts() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject lv_nameRule_0_0 = null;

        EObject lv_insert_1_0 = null;

        EObject lv_priority_2_0 = null;

        EObject lv_selectRule_3_0 = null;

        EObject lv_fromRule_4_0 = null;

        EObject lv_groupBy_5_0 = null;

        EObject lv_having_6_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:330:2: ( ( ( (lv_nameRule_0_0= ruleName ) ) ( (lv_insert_1_0= ruleInsert ) ) ( (lv_priority_2_0= rulePriority ) )? ( (lv_selectRule_3_0= ruleSelect ) ) ( (lv_fromRule_4_0= ruleFrom ) ) ( (lv_groupBy_5_0= ruleGroupBy ) )? ( (lv_having_6_0= ruleHaving ) )? otherlv_7= ';' ) )
            // InternalEsper.g:331:2: ( ( (lv_nameRule_0_0= ruleName ) ) ( (lv_insert_1_0= ruleInsert ) ) ( (lv_priority_2_0= rulePriority ) )? ( (lv_selectRule_3_0= ruleSelect ) ) ( (lv_fromRule_4_0= ruleFrom ) ) ( (lv_groupBy_5_0= ruleGroupBy ) )? ( (lv_having_6_0= ruleHaving ) )? otherlv_7= ';' )
            {
            // InternalEsper.g:331:2: ( ( (lv_nameRule_0_0= ruleName ) ) ( (lv_insert_1_0= ruleInsert ) ) ( (lv_priority_2_0= rulePriority ) )? ( (lv_selectRule_3_0= ruleSelect ) ) ( (lv_fromRule_4_0= ruleFrom ) ) ( (lv_groupBy_5_0= ruleGroupBy ) )? ( (lv_having_6_0= ruleHaving ) )? otherlv_7= ';' )
            // InternalEsper.g:332:3: ( (lv_nameRule_0_0= ruleName ) ) ( (lv_insert_1_0= ruleInsert ) ) ( (lv_priority_2_0= rulePriority ) )? ( (lv_selectRule_3_0= ruleSelect ) ) ( (lv_fromRule_4_0= ruleFrom ) ) ( (lv_groupBy_5_0= ruleGroupBy ) )? ( (lv_having_6_0= ruleHaving ) )? otherlv_7= ';'
            {
            // InternalEsper.g:332:3: ( (lv_nameRule_0_0= ruleName ) )
            // InternalEsper.g:333:4: (lv_nameRule_0_0= ruleName )
            {
            // InternalEsper.g:333:4: (lv_nameRule_0_0= ruleName )
            // InternalEsper.g:334:5: lv_nameRule_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRulePartsAccess().getNameRuleNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_nameRule_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRulePartsRule());
              					}
              					set(
              						current,
              						"nameRule",
              						lv_nameRule_0_0,
              						"org.xtext.example.mydsl.Esper.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:351:3: ( (lv_insert_1_0= ruleInsert ) )
            // InternalEsper.g:352:4: (lv_insert_1_0= ruleInsert )
            {
            // InternalEsper.g:352:4: (lv_insert_1_0= ruleInsert )
            // InternalEsper.g:353:5: lv_insert_1_0= ruleInsert
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRulePartsAccess().getInsertInsertParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_insert_1_0=ruleInsert();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRulePartsRule());
              					}
              					set(
              						current,
              						"insert",
              						lv_insert_1_0,
              						"org.xtext.example.mydsl.Esper.Insert");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:370:3: ( (lv_priority_2_0= rulePriority ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsper.g:371:4: (lv_priority_2_0= rulePriority )
                    {
                    // InternalEsper.g:371:4: (lv_priority_2_0= rulePriority )
                    // InternalEsper.g:372:5: lv_priority_2_0= rulePriority
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRulePartsAccess().getPriorityPriorityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_priority_2_0=rulePriority();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRulePartsRule());
                      					}
                      					set(
                      						current,
                      						"priority",
                      						lv_priority_2_0,
                      						"org.xtext.example.mydsl.Esper.Priority");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsper.g:389:3: ( (lv_selectRule_3_0= ruleSelect ) )
            // InternalEsper.g:390:4: (lv_selectRule_3_0= ruleSelect )
            {
            // InternalEsper.g:390:4: (lv_selectRule_3_0= ruleSelect )
            // InternalEsper.g:391:5: lv_selectRule_3_0= ruleSelect
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRulePartsAccess().getSelectRuleSelectParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_selectRule_3_0=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRulePartsRule());
              					}
              					set(
              						current,
              						"selectRule",
              						lv_selectRule_3_0,
              						"org.xtext.example.mydsl.Esper.Select");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:408:3: ( (lv_fromRule_4_0= ruleFrom ) )
            // InternalEsper.g:409:4: (lv_fromRule_4_0= ruleFrom )
            {
            // InternalEsper.g:409:4: (lv_fromRule_4_0= ruleFrom )
            // InternalEsper.g:410:5: lv_fromRule_4_0= ruleFrom
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRulePartsAccess().getFromRuleFromParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_fromRule_4_0=ruleFrom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRulePartsRule());
              					}
              					set(
              						current,
              						"fromRule",
              						lv_fromRule_4_0,
              						"org.xtext.example.mydsl.Esper.From");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:427:3: ( (lv_groupBy_5_0= ruleGroupBy ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEsper.g:428:4: (lv_groupBy_5_0= ruleGroupBy )
                    {
                    // InternalEsper.g:428:4: (lv_groupBy_5_0= ruleGroupBy )
                    // InternalEsper.g:429:5: lv_groupBy_5_0= ruleGroupBy
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRulePartsAccess().getGroupByGroupByParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_groupBy_5_0=ruleGroupBy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRulePartsRule());
                      					}
                      					set(
                      						current,
                      						"groupBy",
                      						lv_groupBy_5_0,
                      						"org.xtext.example.mydsl.Esper.GroupBy");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsper.g:446:3: ( (lv_having_6_0= ruleHaving ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEsper.g:447:4: (lv_having_6_0= ruleHaving )
                    {
                    // InternalEsper.g:447:4: (lv_having_6_0= ruleHaving )
                    // InternalEsper.g:448:5: lv_having_6_0= ruleHaving
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRulePartsAccess().getHavingHavingParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_having_6_0=ruleHaving();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRulePartsRule());
                      					}
                      					set(
                      						current,
                      						"having",
                      						lv_having_6_0,
                      						"org.xtext.example.mydsl.Esper.Having");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRulePartsAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleParts"


    // $ANTLR start "entryRuleInsert"
    // InternalEsper.g:473:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalEsper.g:473:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalEsper.g:474:2: iv_ruleInsert= ruleInsert EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsert; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalEsper.g:480:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' otherlv_1= 'into' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalEsper.g:486:2: ( (otherlv_0= 'insert' otherlv_1= 'into' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalEsper.g:487:2: (otherlv_0= 'insert' otherlv_1= 'into' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalEsper.g:487:2: (otherlv_0= 'insert' otherlv_1= 'into' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalEsper.g:488:3: otherlv_0= 'insert' otherlv_1= 'into' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getIntoKeyword_1());
              		
            }
            // InternalEsper.g:496:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEsper.g:497:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEsper.g:497:4: (lv_name_2_0= RULE_ID )
            // InternalEsper.g:498:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInsertAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInsertRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleName"
    // InternalEsper.g:518:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalEsper.g:518:45: (iv_ruleName= ruleName EOF )
            // InternalEsper.g:519:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalEsper.g:525:1: ruleName returns [EObject current=null] : (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEsper.g:531:2: ( (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalEsper.g:532:2: (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalEsper.g:532:2: (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalEsper.g:533:3: otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEsper.g:541:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalEsper.g:542:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalEsper.g:542:4: (lv_name_2_0= RULE_STRING )
            // InternalEsper.g:543:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNameRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNameAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRulePriority"
    // InternalEsper.g:567:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // InternalEsper.g:567:49: (iv_rulePriority= rulePriority EOF )
            // InternalEsper.g:568:2: iv_rulePriority= rulePriority EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPriorityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePriority=rulePriority();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePriority; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // InternalEsper.g:574:1: rulePriority returns [EObject current=null] : (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priorityInt_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_priorityInt_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEsper.g:580:2: ( (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priorityInt_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalEsper.g:581:2: (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priorityInt_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalEsper.g:581:2: (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priorityInt_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalEsper.g:582:3: otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priorityInt_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPriorityAccess().getPriorityKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPriorityAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEsper.g:590:3: ( (lv_priorityInt_2_0= RULE_INT ) )
            // InternalEsper.g:591:4: (lv_priorityInt_2_0= RULE_INT )
            {
            // InternalEsper.g:591:4: (lv_priorityInt_2_0= RULE_INT )
            // InternalEsper.g:592:5: lv_priorityInt_2_0= RULE_INT
            {
            lv_priorityInt_2_0=(Token)match(input,RULE_INT,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_priorityInt_2_0, grammarAccess.getPriorityAccess().getPriorityIntINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPriorityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"priorityInt",
              						lv_priorityInt_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPriorityAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "entryRuleSelect"
    // InternalEsper.g:616:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalEsper.g:616:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalEsper.g:617:2: iv_ruleSelect= ruleSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalEsper.g:623:1: ruleSelect returns [EObject current=null] : ( (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* ) | ( (lv_asterisk_8_0= '*' ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_asterisk_8_0=null;
        EObject lv_selectAttributes_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;

        EObject lv_selectAttributes_5_0 = null;

        AntlrDatatypeRuleToken lv_alias_7_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:629:2: ( ( (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* ) | ( (lv_asterisk_8_0= '*' ) ) ) )
            // InternalEsper.g:630:2: ( (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* ) | ( (lv_asterisk_8_0= '*' ) ) )
            {
            // InternalEsper.g:630:2: ( (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* ) | ( (lv_asterisk_8_0= '*' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEsper.g:631:3: (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* )
                    {
                    // InternalEsper.g:631:3: (otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )* )
                    // InternalEsper.g:632:4: otherlv_0= 'select' ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+ (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )*
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0_0());
                      			
                    }
                    // InternalEsper.g:636:4: ( ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=39 && LA7_0<=45)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEsper.g:637:5: ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
                    	    {
                    	    // InternalEsper.g:637:5: ( (lv_selectAttributes_1_0= ruleSelectAttributesDefinition ) )
                    	    // InternalEsper.g:638:6: (lv_selectAttributes_1_0= ruleSelectAttributesDefinition )
                    	    {
                    	    // InternalEsper.g:638:6: (lv_selectAttributes_1_0= ruleSelectAttributesDefinition )
                    	    // InternalEsper.g:639:7: lv_selectAttributes_1_0= ruleSelectAttributesDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_selectAttributes_1_0=ruleSelectAttributesDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSelectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"selectAttributes",
                    	      								lv_selectAttributes_1_0,
                    	      								"org.xtext.example.mydsl.Esper.SelectAttributesDefinition");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalEsper.g:656:5: (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==22) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalEsper.g:657:6: otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) )
                    	            {
                    	            otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getAsKeyword_0_1_1_0());
                    	              					
                    	            }
                    	            // InternalEsper.g:661:6: ( (lv_alias_3_0= ruleValidID ) )
                    	            // InternalEsper.g:662:7: (lv_alias_3_0= ruleValidID )
                    	            {
                    	            // InternalEsper.g:662:7: (lv_alias_3_0= ruleValidID )
                    	            // InternalEsper.g:663:8: lv_alias_3_0= ruleValidID
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_1_1_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_21);
                    	            lv_alias_3_0=ruleValidID();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getSelectRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"alias",
                    	              									lv_alias_3_0,
                    	              									"org.xtext.example.mydsl.Esper.ValidID");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // InternalEsper.g:682:4: (otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEsper.g:683:5: otherlv_4= ',' ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) ) (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )?
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalEsper.g:687:5: ( (lv_selectAttributes_5_0= ruleSelectAttributesDefinition ) )
                    	    // InternalEsper.g:688:6: (lv_selectAttributes_5_0= ruleSelectAttributesDefinition )
                    	    {
                    	    // InternalEsper.g:688:6: (lv_selectAttributes_5_0= ruleSelectAttributesDefinition )
                    	    // InternalEsper.g:689:7: lv_selectAttributes_5_0= ruleSelectAttributesDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_selectAttributes_5_0=ruleSelectAttributesDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSelectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"selectAttributes",
                    	      								lv_selectAttributes_5_0,
                    	      								"org.xtext.example.mydsl.Esper.SelectAttributesDefinition");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalEsper.g:706:5: (otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) ) )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==22) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalEsper.g:707:6: otherlv_6= 'as' ( (lv_alias_7_0= ruleValidID ) )
                    	            {
                    	            otherlv_6=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getAsKeyword_0_2_2_0());
                    	              					
                    	            }
                    	            // InternalEsper.g:711:6: ( (lv_alias_7_0= ruleValidID ) )
                    	            // InternalEsper.g:712:7: (lv_alias_7_0= ruleValidID )
                    	            {
                    	            // InternalEsper.g:712:7: (lv_alias_7_0= ruleValidID )
                    	            // InternalEsper.g:713:8: lv_alias_7_0= ruleValidID
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_2_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_23);
                    	            lv_alias_7_0=ruleValidID();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getSelectRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"alias",
                    	              									lv_alias_7_0,
                    	              									"org.xtext.example.mydsl.Esper.ValidID");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:734:3: ( (lv_asterisk_8_0= '*' ) )
                    {
                    // InternalEsper.g:734:3: ( (lv_asterisk_8_0= '*' ) )
                    // InternalEsper.g:735:4: (lv_asterisk_8_0= '*' )
                    {
                    // InternalEsper.g:735:4: (lv_asterisk_8_0= '*' )
                    // InternalEsper.g:736:5: lv_asterisk_8_0= '*'
                    {
                    lv_asterisk_8_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_asterisk_8_0, grammarAccess.getSelectAccess().getAsteriskAsteriskKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSelectRule());
                      					}
                      					setWithLastConsumed(current, "asterisk", true, "*");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleKindSelectAttributesDefinition"
    // InternalEsper.g:752:1: entryRuleKindSelectAttributesDefinition returns [EObject current=null] : iv_ruleKindSelectAttributesDefinition= ruleKindSelectAttributesDefinition EOF ;
    public final EObject entryRuleKindSelectAttributesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindSelectAttributesDefinition = null;


        try {
            // InternalEsper.g:752:71: (iv_ruleKindSelectAttributesDefinition= ruleKindSelectAttributesDefinition EOF )
            // InternalEsper.g:753:2: iv_ruleKindSelectAttributesDefinition= ruleKindSelectAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKindSelectAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKindSelectAttributesDefinition=ruleKindSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKindSelectAttributesDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKindSelectAttributesDefinition"


    // $ANTLR start "ruleKindSelectAttributesDefinition"
    // InternalEsper.g:759:1: ruleKindSelectAttributesDefinition returns [EObject current=null] : ( ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) ) | ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleKindSelectAttributesDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_int_2_0=null;
        Token lv_string_3_0=null;
        EObject lv_singleSelectDefinition_0_0 = null;

        EObject lv_defaultMethod_1_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:765:2: ( ( ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) ) | ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // InternalEsper.g:766:2: ( ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) ) | ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // InternalEsper.g:766:2: ( ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) ) | ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case RULE_STRING:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEsper.g:767:3: ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) )
                    {
                    // InternalEsper.g:767:3: ( (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition ) )
                    // InternalEsper.g:768:4: (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition )
                    {
                    // InternalEsper.g:768:4: (lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition )
                    // InternalEsper.g:769:5: lv_singleSelectDefinition_0_0= ruleSingleSelectDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionSingleSelectDefinitionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_singleSelectDefinition_0_0=ruleSingleSelectDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getKindSelectAttributesDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"singleSelectDefinition",
                      						lv_singleSelectDefinition_0_0,
                      						"org.xtext.example.mydsl.Esper.SingleSelectDefinition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:787:3: ( (lv_defaultMethod_1_0= ruleDefaultMethods ) )
                    {
                    // InternalEsper.g:787:3: ( (lv_defaultMethod_1_0= ruleDefaultMethods ) )
                    // InternalEsper.g:788:4: (lv_defaultMethod_1_0= ruleDefaultMethods )
                    {
                    // InternalEsper.g:788:4: (lv_defaultMethod_1_0= ruleDefaultMethods )
                    // InternalEsper.g:789:5: lv_defaultMethod_1_0= ruleDefaultMethods
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_defaultMethod_1_0=ruleDefaultMethods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getKindSelectAttributesDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"defaultMethod",
                      						lv_defaultMethod_1_0,
                      						"org.xtext.example.mydsl.Esper.DefaultMethods");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:807:3: ( (lv_int_2_0= RULE_INT ) )
                    {
                    // InternalEsper.g:807:3: ( (lv_int_2_0= RULE_INT ) )
                    // InternalEsper.g:808:4: (lv_int_2_0= RULE_INT )
                    {
                    // InternalEsper.g:808:4: (lv_int_2_0= RULE_INT )
                    // InternalEsper.g:809:5: lv_int_2_0= RULE_INT
                    {
                    lv_int_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_2_0, grammarAccess.getKindSelectAttributesDefinitionAccess().getIntINTTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getKindSelectAttributesDefinitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"int",
                      						lv_int_2_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:826:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalEsper.g:826:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalEsper.g:827:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalEsper.g:827:4: (lv_string_3_0= RULE_STRING )
                    // InternalEsper.g:828:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_3_0, grammarAccess.getKindSelectAttributesDefinitionAccess().getStringSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getKindSelectAttributesDefinitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"string",
                      						lv_string_3_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKindSelectAttributesDefinition"


    // $ANTLR start "entryRuleSelectAttributesDefinition"
    // InternalEsper.g:848:1: entryRuleSelectAttributesDefinition returns [EObject current=null] : iv_ruleSelectAttributesDefinition= ruleSelectAttributesDefinition EOF ;
    public final EObject entryRuleSelectAttributesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAttributesDefinition = null;


        try {
            // InternalEsper.g:848:67: (iv_ruleSelectAttributesDefinition= ruleSelectAttributesDefinition EOF )
            // InternalEsper.g:849:2: iv_ruleSelectAttributesDefinition= ruleSelectAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectAttributesDefinition=ruleSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectAttributesDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectAttributesDefinition"


    // $ANTLR start "ruleSelectAttributesDefinition"
    // InternalEsper.g:855:1: ruleSelectAttributesDefinition returns [EObject current=null] : ( ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )* ) ;
    public final EObject ruleSelectAttributesDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_rightSide_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_leftSide_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:861:2: ( ( ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )* ) )
            // InternalEsper.g:862:2: ( ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )* )
            {
            // InternalEsper.g:862:2: ( ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )* )
            // InternalEsper.g:863:3: ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )*
            {
            // InternalEsper.g:863:3: ( (lv_rightSide_0_0= ruleKindSelectAttributesDefinition ) )
            // InternalEsper.g:864:4: (lv_rightSide_0_0= ruleKindSelectAttributesDefinition )
            {
            // InternalEsper.g:864:4: (lv_rightSide_0_0= ruleKindSelectAttributesDefinition )
            // InternalEsper.g:865:5: lv_rightSide_0_0= ruleKindSelectAttributesDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideKindSelectAttributesDefinitionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_rightSide_0_0=ruleKindSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectAttributesDefinitionRule());
              					}
              					add(
              						current,
              						"rightSide",
              						lv_rightSide_0_0,
              						"org.xtext.example.mydsl.Esper.KindSelectAttributesDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:882:3: ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23||LA12_0==31||(LA12_0>=46 && LA12_0<=58)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEsper.g:883:4: ( (lv_operator_1_0= ruleOperators ) ) ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) )
            	    {
            	    // InternalEsper.g:883:4: ( (lv_operator_1_0= ruleOperators ) )
            	    // InternalEsper.g:884:5: (lv_operator_1_0= ruleOperators )
            	    {
            	    // InternalEsper.g:884:5: (lv_operator_1_0= ruleOperators )
            	    // InternalEsper.g:885:6: lv_operator_1_0= ruleOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorOperatorsEnumRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_operator_1_0=ruleOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSelectAttributesDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operator",
            	      							lv_operator_1_0,
            	      							"org.xtext.example.mydsl.Esper.Operators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalEsper.g:902:4: ( (lv_leftSide_2_0= ruleKindSelectAttributesDefinition ) )
            	    // InternalEsper.g:903:5: (lv_leftSide_2_0= ruleKindSelectAttributesDefinition )
            	    {
            	    // InternalEsper.g:903:5: (lv_leftSide_2_0= ruleKindSelectAttributesDefinition )
            	    // InternalEsper.g:904:6: lv_leftSide_2_0= ruleKindSelectAttributesDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideKindSelectAttributesDefinitionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_leftSide_2_0=ruleKindSelectAttributesDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSelectAttributesDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"leftSide",
            	      							lv_leftSide_2_0,
            	      							"org.xtext.example.mydsl.Esper.KindSelectAttributesDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectAttributesDefinition"


    // $ANTLR start "entryRuleSingleSelectDefinition"
    // InternalEsper.g:926:1: entryRuleSingleSelectDefinition returns [EObject current=null] : iv_ruleSingleSelectDefinition= ruleSingleSelectDefinition EOF ;
    public final EObject entryRuleSingleSelectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSelectDefinition = null;


        try {
            // InternalEsper.g:926:63: (iv_ruleSingleSelectDefinition= ruleSingleSelectDefinition EOF )
            // InternalEsper.g:927:2: iv_ruleSingleSelectDefinition= ruleSingleSelectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSelectDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleSelectDefinition=ruleSingleSelectDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSelectDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSelectDefinition"


    // $ANTLR start "ruleSingleSelectDefinition"
    // InternalEsper.g:933:1: ruleSingleSelectDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' ) ) ;
    public final EObject ruleSingleSelectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEsper.g:939:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' ) ) )
            // InternalEsper.g:940:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' ) )
            {
            // InternalEsper.g:940:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' ) )
            // InternalEsper.g:941:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' )
            {
            // InternalEsper.g:941:3: ( (otherlv_0= RULE_ID ) )
            // InternalEsper.g:942:4: (otherlv_0= RULE_ID )
            {
            // InternalEsper.g:942:4: (otherlv_0= RULE_ID )
            // InternalEsper.g:943:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleSelectDefinitionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSingleSelectDefinitionAccess().getEventSingleDefinitionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSingleSelectDefinitionAccess().getFullStopKeyword_1());
              		
            }
            // InternalEsper.g:958:3: ( ( (lv_attribute_2_0= RULE_ID ) ) | otherlv_3= '*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEsper.g:959:4: ( (lv_attribute_2_0= RULE_ID ) )
                    {
                    // InternalEsper.g:959:4: ( (lv_attribute_2_0= RULE_ID ) )
                    // InternalEsper.g:960:5: (lv_attribute_2_0= RULE_ID )
                    {
                    // InternalEsper.g:960:5: (lv_attribute_2_0= RULE_ID )
                    // InternalEsper.g:961:6: lv_attribute_2_0= RULE_ID
                    {
                    lv_attribute_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_attribute_2_0, grammarAccess.getSingleSelectDefinitionAccess().getAttributeIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleSelectDefinitionRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"attribute",
                      							lv_attribute_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:978:4: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSingleSelectDefinitionAccess().getAsteriskKeyword_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSelectDefinition"


    // $ANTLR start "entryRuleFrom"
    // InternalEsper.g:987:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalEsper.g:987:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalEsper.g:988:2: iv_ruleFrom= ruleFrom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFrom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalEsper.g:994:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'from' ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) ) ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_anything_3_0 = null;

        EObject lv_anything_6_0 = null;

        EObject lv_pattern_7_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1000:2: ( (otherlv_0= 'from' ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) ) ) )
            // InternalEsper.g:1001:2: (otherlv_0= 'from' ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) ) )
            {
            // InternalEsper.g:1001:2: (otherlv_0= 'from' ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) ) )
            // InternalEsper.g:1002:3: otherlv_0= 'from' ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFromKeyword_0());
              		
            }
            // InternalEsper.g:1006:3: ( ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) ) | ( (lv_pattern_7_0= rulePattern ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEsper.g:1007:4: ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) )
                    {
                    // InternalEsper.g:1007:4: ( ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) ) )
                    // InternalEsper.g:1008:5: ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) )
                    {
                    // InternalEsper.g:1008:5: ( (otherlv_1= RULE_ID ) )
                    // InternalEsper.g:1009:6: (otherlv_1= RULE_ID )
                    {
                    // InternalEsper.g:1009:6: (otherlv_1= RULE_ID )
                    // InternalEsper.g:1010:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFromRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getFromAccess().getEventEventCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalEsper.g:1021:5: ( (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' ) | (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==14) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==24) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEsper.g:1022:6: (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' )
                            {
                            // InternalEsper.g:1022:6: (otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')' )
                            // InternalEsper.g:1023:7: otherlv_2= '(' ( (lv_anything_3_0= ruleAnything ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getFromAccess().getLeftParenthesisKeyword_1_0_1_0_0());
                              						
                            }
                            // InternalEsper.g:1027:7: ( (lv_anything_3_0= ruleAnything ) )
                            // InternalEsper.g:1028:8: (lv_anything_3_0= ruleAnything )
                            {
                            // InternalEsper.g:1028:8: (lv_anything_3_0= ruleAnything )
                            // InternalEsper.g:1029:9: lv_anything_3_0= ruleAnything
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_16);
                            lv_anything_3_0=ruleAnything();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getFromRule());
                              									}
                              									set(
                              										current,
                              										"anything",
                              										lv_anything_3_0,
                              										"org.xtext.example.mydsl.Esper.Anything");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getFromAccess().getRightParenthesisKeyword_1_0_1_0_2());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalEsper.g:1052:6: (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) )
                            {
                            // InternalEsper.g:1052:6: (otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) ) )
                            // InternalEsper.g:1053:7: otherlv_5= '.' ( (lv_anything_6_0= ruleAnything ) )
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_5, grammarAccess.getFromAccess().getFullStopKeyword_1_0_1_1_0());
                              						
                            }
                            // InternalEsper.g:1057:7: ( (lv_anything_6_0= ruleAnything ) )
                            // InternalEsper.g:1058:8: (lv_anything_6_0= ruleAnything )
                            {
                            // InternalEsper.g:1058:8: (lv_anything_6_0= ruleAnything )
                            // InternalEsper.g:1059:9: lv_anything_6_0= ruleAnything
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_2);
                            lv_anything_6_0=ruleAnything();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getFromRule());
                              									}
                              									set(
                              										current,
                              										"anything",
                              										lv_anything_6_0,
                              										"org.xtext.example.mydsl.Esper.Anything");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1080:4: ( (lv_pattern_7_0= rulePattern ) )
                    {
                    // InternalEsper.g:1080:4: ( (lv_pattern_7_0= rulePattern ) )
                    // InternalEsper.g:1081:5: (lv_pattern_7_0= rulePattern )
                    {
                    // InternalEsper.g:1081:5: (lv_pattern_7_0= rulePattern )
                    // InternalEsper.g:1082:6: lv_pattern_7_0= rulePattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFromAccess().getPatternPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_pattern_7_0=rulePattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFromRule());
                      						}
                      						set(
                      							current,
                      							"pattern",
                      							lv_pattern_7_0,
                      							"org.xtext.example.mydsl.Esper.Pattern");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRulePattern"
    // InternalEsper.g:1104:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalEsper.g:1104:48: (iv_rulePattern= rulePattern EOF )
            // InternalEsper.g:1105:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalEsper.g:1111:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' otherlv_1= '[' ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_joinFollowBy_2_0 = null;

        EObject lv_win_5_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1117:2: ( (otherlv_0= 'pattern' otherlv_1= '[' ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )? ) )
            // InternalEsper.g:1118:2: (otherlv_0= 'pattern' otherlv_1= '[' ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )? )
            {
            // InternalEsper.g:1118:2: (otherlv_0= 'pattern' otherlv_1= '[' ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )? )
            // InternalEsper.g:1119:3: otherlv_0= 'pattern' otherlv_1= '[' ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEsper.g:1127:3: ( (lv_joinFollowBy_2_0= ruleJoinFollowBy ) )
            // InternalEsper.g:1128:4: (lv_joinFollowBy_2_0= ruleJoinFollowBy )
            {
            // InternalEsper.g:1128:4: (lv_joinFollowBy_2_0= ruleJoinFollowBy )
            // InternalEsper.g:1129:5: lv_joinFollowBy_2_0= ruleJoinFollowBy
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternAccess().getJoinFollowByJoinFollowByParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_joinFollowBy_2_0=ruleJoinFollowBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternRule());
              					}
              					set(
              						current,
              						"joinFollowBy",
              						lv_joinFollowBy_2_0,
              						"org.xtext.example.mydsl.Esper.JoinFollowBy");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalEsper.g:1150:3: (otherlv_4= '.' ( (lv_win_5_0= ruleWin ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsper.g:1151:4: otherlv_4= '.' ( (lv_win_5_0= ruleWin ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getFullStopKeyword_4_0());
                      			
                    }
                    // InternalEsper.g:1155:4: ( (lv_win_5_0= ruleWin ) )
                    // InternalEsper.g:1156:5: (lv_win_5_0= ruleWin )
                    {
                    // InternalEsper.g:1156:5: (lv_win_5_0= ruleWin )
                    // InternalEsper.g:1157:6: lv_win_5_0= ruleWin
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getWinWinParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_win_5_0=ruleWin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPatternRule());
                      						}
                      						set(
                      							current,
                      							"win",
                      							lv_win_5_0,
                      							"org.xtext.example.mydsl.Esper.Win");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleJoinFollowBy"
    // InternalEsper.g:1179:1: entryRuleJoinFollowBy returns [EObject current=null] : iv_ruleJoinFollowBy= ruleJoinFollowBy EOF ;
    public final EObject entryRuleJoinFollowBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinFollowBy = null;


        try {
            // InternalEsper.g:1179:53: (iv_ruleJoinFollowBy= ruleJoinFollowBy EOF )
            // InternalEsper.g:1180:2: iv_ruleJoinFollowBy= ruleJoinFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinFollowBy=ruleJoinFollowBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinFollowBy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinFollowBy"


    // $ANTLR start "ruleJoinFollowBy"
    // InternalEsper.g:1186:1: ruleJoinFollowBy returns [EObject current=null] : ( ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )* ) ;
    public final EObject ruleJoinFollowBy() throws RecognitionException {
        EObject current = null;

        EObject lv_followsByJoinList_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_followsByJoinList_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1192:2: ( ( ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )* ) )
            // InternalEsper.g:1193:2: ( ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )* )
            {
            // InternalEsper.g:1193:2: ( ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )* )
            // InternalEsper.g:1194:3: ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) ) ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )*
            {
            // InternalEsper.g:1194:3: ( (lv_followsByJoinList_0_0= ruleAbstractFollowBy ) )
            // InternalEsper.g:1195:4: (lv_followsByJoinList_0_0= ruleAbstractFollowBy )
            {
            // InternalEsper.g:1195:4: (lv_followsByJoinList_0_0= ruleAbstractFollowBy )
            // InternalEsper.g:1196:5: lv_followsByJoinList_0_0= ruleAbstractFollowBy
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_followsByJoinList_0_0=ruleAbstractFollowBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJoinFollowByRule());
              					}
              					add(
              						current,
              						"followsByJoinList",
              						lv_followsByJoinList_0_0,
              						"org.xtext.example.mydsl.Esper.AbstractFollowBy");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:1213:3: ( ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23||LA17_0==31||(LA17_0>=46 && LA17_0<=58)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEsper.g:1214:4: ( (lv_operator_1_0= ruleOperators ) ) ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) )
            	    {
            	    // InternalEsper.g:1214:4: ( (lv_operator_1_0= ruleOperators ) )
            	    // InternalEsper.g:1215:5: (lv_operator_1_0= ruleOperators )
            	    {
            	    // InternalEsper.g:1215:5: (lv_operator_1_0= ruleOperators )
            	    // InternalEsper.g:1216:6: lv_operator_1_0= ruleOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getJoinFollowByAccess().getOperatorOperatorsEnumRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_operator_1_0=ruleOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getJoinFollowByRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operator",
            	      							lv_operator_1_0,
            	      							"org.xtext.example.mydsl.Esper.Operators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalEsper.g:1233:4: ( (lv_followsByJoinList_2_0= ruleAbstractFollowBy ) )
            	    // InternalEsper.g:1234:5: (lv_followsByJoinList_2_0= ruleAbstractFollowBy )
            	    {
            	    // InternalEsper.g:1234:5: (lv_followsByJoinList_2_0= ruleAbstractFollowBy )
            	    // InternalEsper.g:1235:6: lv_followsByJoinList_2_0= ruleAbstractFollowBy
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_followsByJoinList_2_0=ruleAbstractFollowBy();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getJoinFollowByRule());
            	      						}
            	      						add(
            	      							current,
            	      							"followsByJoinList",
            	      							lv_followsByJoinList_2_0,
            	      							"org.xtext.example.mydsl.Esper.AbstractFollowBy");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinFollowBy"


    // $ANTLR start "entryRuleAbstractFollowBy"
    // InternalEsper.g:1257:1: entryRuleAbstractFollowBy returns [EObject current=null] : iv_ruleAbstractFollowBy= ruleAbstractFollowBy EOF ;
    public final EObject entryRuleAbstractFollowBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFollowBy = null;


        try {
            // InternalEsper.g:1257:57: (iv_ruleAbstractFollowBy= ruleAbstractFollowBy EOF )
            // InternalEsper.g:1258:2: iv_ruleAbstractFollowBy= ruleAbstractFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractFollowBy=ruleAbstractFollowBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractFollowBy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFollowBy"


    // $ANTLR start "ruleAbstractFollowBy"
    // InternalEsper.g:1264:1: ruleAbstractFollowBy returns [EObject current=null] : ( ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) ) ( (lv_wherePart_4_0= ruleFollowByWhere ) )? ) ;
    public final EObject ruleAbstractFollowBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_followBy_0_0 = null;

        EObject lv_followBy_2_0 = null;

        EObject lv_wherePart_4_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1270:2: ( ( ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) ) ( (lv_wherePart_4_0= ruleFollowByWhere ) )? ) )
            // InternalEsper.g:1271:2: ( ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) ) ( (lv_wherePart_4_0= ruleFollowByWhere ) )? )
            {
            // InternalEsper.g:1271:2: ( ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) ) ( (lv_wherePart_4_0= ruleFollowByWhere ) )? )
            // InternalEsper.g:1272:3: ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) ) ( (lv_wherePart_4_0= ruleFollowByWhere ) )?
            {
            // InternalEsper.g:1272:3: ( ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) ) | (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) && (synpred1_InternalEsper())) {
                alt18=1;
            }
            else if ( (LA18_0==14) ) {
                int LA18_2 = input.LA(2);

                if ( (synpred1_InternalEsper()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_ID) && (synpred1_InternalEsper())) {
                alt18=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEsper.g:1273:4: ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) )
                    {
                    // InternalEsper.g:1273:4: ( ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy ) )
                    // InternalEsper.g:1274:5: ( ( ruleFollowBy ) )=> (lv_followBy_0_0= ruleFollowBy )
                    {
                    // InternalEsper.g:1278:5: (lv_followBy_0_0= ruleFollowBy )
                    // InternalEsper.g:1279:6: lv_followBy_0_0= ruleFollowBy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_followBy_0_0=ruleFollowBy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAbstractFollowByRule());
                      						}
                      						set(
                      							current,
                      							"followBy",
                      							lv_followBy_0_0,
                      							"org.xtext.example.mydsl.Esper.FollowBy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1297:4: (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' )
                    {
                    // InternalEsper.g:1297:4: (otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')' )
                    // InternalEsper.g:1298:5: otherlv_1= '(' ( (lv_followBy_2_0= ruleFollowBy ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getAbstractFollowByAccess().getLeftParenthesisKeyword_0_1_0());
                      				
                    }
                    // InternalEsper.g:1302:5: ( (lv_followBy_2_0= ruleFollowBy ) )
                    // InternalEsper.g:1303:6: (lv_followBy_2_0= ruleFollowBy )
                    {
                    // InternalEsper.g:1303:6: (lv_followBy_2_0= ruleFollowBy )
                    // InternalEsper.g:1304:7: lv_followBy_2_0= ruleFollowBy
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_followBy_2_0=ruleFollowBy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAbstractFollowByRule());
                      							}
                      							set(
                      								current,
                      								"followBy",
                      								lv_followBy_2_0,
                      								"org.xtext.example.mydsl.Esper.FollowBy");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getAbstractFollowByAccess().getRightParenthesisKeyword_0_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsper.g:1327:3: ( (lv_wherePart_4_0= ruleFollowByWhere ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14||LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEsper.g:1328:4: (lv_wherePart_4_0= ruleFollowByWhere )
                    {
                    // InternalEsper.g:1328:4: (lv_wherePart_4_0= ruleFollowByWhere )
                    // InternalEsper.g:1329:5: lv_wherePart_4_0= ruleFollowByWhere
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAbstractFollowByAccess().getWherePartFollowByWhereParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_wherePart_4_0=ruleFollowByWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAbstractFollowByRule());
                      					}
                      					set(
                      						current,
                      						"wherePart",
                      						lv_wherePart_4_0,
                      						"org.xtext.example.mydsl.Esper.FollowByWhere");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFollowBy"


    // $ANTLR start "entryRuleFollowBy"
    // InternalEsper.g:1350:1: entryRuleFollowBy returns [EObject current=null] : iv_ruleFollowBy= ruleFollowBy EOF ;
    public final EObject entryRuleFollowBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowBy = null;


        try {
            // InternalEsper.g:1350:49: (iv_ruleFollowBy= ruleFollowBy EOF )
            // InternalEsper.g:1351:2: iv_ruleFollowBy= ruleFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFollowBy=ruleFollowBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFollowBy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFollowBy"


    // $ANTLR start "ruleFollowBy"
    // InternalEsper.g:1357:1: ruleFollowBy returns [EObject current=null] : ( ( (lv_leftSide_0_0= ruleTerminalExpression ) ) ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleFollowBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftSide_0_0 = null;

        EObject lv_rightSide_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1363:2: ( ( ( (lv_leftSide_0_0= ruleTerminalExpression ) ) ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )* ) )
            // InternalEsper.g:1364:2: ( ( (lv_leftSide_0_0= ruleTerminalExpression ) ) ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )* )
            {
            // InternalEsper.g:1364:2: ( ( (lv_leftSide_0_0= ruleTerminalExpression ) ) ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )* )
            // InternalEsper.g:1365:3: ( (lv_leftSide_0_0= ruleTerminalExpression ) ) ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )*
            {
            // InternalEsper.g:1365:3: ( (lv_leftSide_0_0= ruleTerminalExpression ) )
            // InternalEsper.g:1366:4: (lv_leftSide_0_0= ruleTerminalExpression )
            {
            // InternalEsper.g:1366:4: (lv_leftSide_0_0= ruleTerminalExpression )
            // InternalEsper.g:1367:5: lv_leftSide_0_0= ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFollowByAccess().getLeftSideTerminalExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_leftSide_0_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFollowByRule());
              					}
              					set(
              						current,
              						"leftSide",
              						lv_leftSide_0_0,
              						"org.xtext.example.mydsl.Esper.TerminalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:1384:3: ( ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred2_InternalEsper()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalEsper.g:1385:4: ( ( '->' )=>otherlv_1= '->' ) ( (lv_rightSide_2_0= ruleTerminalExpression ) )
            	    {
            	    // InternalEsper.g:1385:4: ( ( '->' )=>otherlv_1= '->' )
            	    // InternalEsper.g:1386:5: ( '->' )=>otherlv_1= '->'
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getFollowByAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	      				
            	    }

            	    }

            	    // InternalEsper.g:1392:4: ( (lv_rightSide_2_0= ruleTerminalExpression ) )
            	    // InternalEsper.g:1393:5: (lv_rightSide_2_0= ruleTerminalExpression )
            	    {
            	    // InternalEsper.g:1393:5: (lv_rightSide_2_0= ruleTerminalExpression )
            	    // InternalEsper.g:1394:6: lv_rightSide_2_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFollowByAccess().getRightSideTerminalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_rightSide_2_0=ruleTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFollowByRule());
            	      						}
            	      						add(
            	      							current,
            	      							"rightSide",
            	      							lv_rightSide_2_0,
            	      							"org.xtext.example.mydsl.Esper.TerminalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFollowBy"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalEsper.g:1416:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalEsper.g:1416:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalEsper.g:1417:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalEsper.g:1423:1: ruleTerminalExpression returns [EObject current=null] : ( ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) ) | ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' ) | ( (lv_singleDefinition_5_0= ruleSingleDefinition ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_every_0_0=null;
        Token lv_parenthesis_2_0=null;
        Token otherlv_4=null;
        EObject lv_everyExpression_1_0 = null;

        EObject lv_betweenParenthesis_3_0 = null;

        EObject lv_singleDefinition_5_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1429:2: ( ( ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) ) | ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' ) | ( (lv_singleDefinition_5_0= ruleSingleDefinition ) ) ) )
            // InternalEsper.g:1430:2: ( ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) ) | ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' ) | ( (lv_singleDefinition_5_0= ruleSingleDefinition ) ) )
            {
            // InternalEsper.g:1430:2: ( ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) ) | ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' ) | ( (lv_singleDefinition_5_0= ruleSingleDefinition ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 14:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalEsper.g:1431:3: ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) )
                    {
                    // InternalEsper.g:1431:3: ( ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) ) )
                    // InternalEsper.g:1432:4: ( (lv_every_0_0= 'every' ) ) ( (lv_everyExpression_1_0= ruleFollowBy ) )
                    {
                    // InternalEsper.g:1432:4: ( (lv_every_0_0= 'every' ) )
                    // InternalEsper.g:1433:5: (lv_every_0_0= 'every' )
                    {
                    // InternalEsper.g:1433:5: (lv_every_0_0= 'every' )
                    // InternalEsper.g:1434:6: lv_every_0_0= 'every'
                    {
                    lv_every_0_0=(Token)match(input,30,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_every_0_0, grammarAccess.getTerminalExpressionAccess().getEveryEveryKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "every", true, "every");
                      					
                    }

                    }


                    }

                    // InternalEsper.g:1446:4: ( (lv_everyExpression_1_0= ruleFollowBy ) )
                    // InternalEsper.g:1447:5: (lv_everyExpression_1_0= ruleFollowBy )
                    {
                    // InternalEsper.g:1447:5: (lv_everyExpression_1_0= ruleFollowBy )
                    // InternalEsper.g:1448:6: lv_everyExpression_1_0= ruleFollowBy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getEveryExpressionFollowByParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_everyExpression_1_0=ruleFollowBy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"everyExpression",
                      							lv_everyExpression_1_0,
                      							"org.xtext.example.mydsl.Esper.FollowBy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1467:3: ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' )
                    {
                    // InternalEsper.g:1467:3: ( ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')' )
                    // InternalEsper.g:1468:4: ( (lv_parenthesis_2_0= '(' ) ) ( (lv_betweenParenthesis_3_0= ruleFollowBy ) ) otherlv_4= ')'
                    {
                    // InternalEsper.g:1468:4: ( (lv_parenthesis_2_0= '(' ) )
                    // InternalEsper.g:1469:5: (lv_parenthesis_2_0= '(' )
                    {
                    // InternalEsper.g:1469:5: (lv_parenthesis_2_0= '(' )
                    // InternalEsper.g:1470:6: lv_parenthesis_2_0= '('
                    {
                    lv_parenthesis_2_0=(Token)match(input,14,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_parenthesis_2_0, grammarAccess.getTerminalExpressionAccess().getParenthesisLeftParenthesisKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "parenthesis", true, "(");
                      					
                    }

                    }


                    }

                    // InternalEsper.g:1482:4: ( (lv_betweenParenthesis_3_0= ruleFollowBy ) )
                    // InternalEsper.g:1483:5: (lv_betweenParenthesis_3_0= ruleFollowBy )
                    {
                    // InternalEsper.g:1483:5: (lv_betweenParenthesis_3_0= ruleFollowBy )
                    // InternalEsper.g:1484:6: lv_betweenParenthesis_3_0= ruleFollowBy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisFollowByParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_betweenParenthesis_3_0=ruleFollowBy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"betweenParenthesis",
                      							lv_betweenParenthesis_3_0,
                      							"org.xtext.example.mydsl.Esper.FollowBy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:1507:3: ( (lv_singleDefinition_5_0= ruleSingleDefinition ) )
                    {
                    // InternalEsper.g:1507:3: ( (lv_singleDefinition_5_0= ruleSingleDefinition ) )
                    // InternalEsper.g:1508:4: (lv_singleDefinition_5_0= ruleSingleDefinition )
                    {
                    // InternalEsper.g:1508:4: (lv_singleDefinition_5_0= ruleSingleDefinition )
                    // InternalEsper.g:1509:5: lv_singleDefinition_5_0= ruleSingleDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionSingleDefinitionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_singleDefinition_5_0=ruleSingleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      					}
                      					set(
                      						current,
                      						"singleDefinition",
                      						lv_singleDefinition_5_0,
                      						"org.xtext.example.mydsl.Esper.SingleDefinition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleSingleDefinition"
    // InternalEsper.g:1530:1: entryRuleSingleDefinition returns [EObject current=null] : iv_ruleSingleDefinition= ruleSingleDefinition EOF ;
    public final EObject entryRuleSingleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDefinition = null;


        try {
            // InternalEsper.g:1530:57: (iv_ruleSingleDefinition= ruleSingleDefinition EOF )
            // InternalEsper.g:1531:2: iv_ruleSingleDefinition= ruleSingleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleDefinition=ruleSingleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleDefinition"


    // $ANTLR start "ruleSingleDefinition"
    // InternalEsper.g:1537:1: ruleSingleDefinition returns [EObject current=null] : ( ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleSingleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_anything_4_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1543:2: ( ( ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )? ) )
            // InternalEsper.g:1544:2: ( ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )? )
            {
            // InternalEsper.g:1544:2: ( ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )? )
            // InternalEsper.g:1545:3: ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )?
            {
            // InternalEsper.g:1545:3: ( ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==31) ) {
                    int LA22_2 = input.LA(3);

                    if ( (synpred3_InternalEsper()) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalEsper.g:1546:4: ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // InternalEsper.g:1546:4: ( ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID ) )
                    // InternalEsper.g:1547:5: ( ( RULE_ID ) )=> (lv_name_0_0= RULE_ID )
                    {
                    // InternalEsper.g:1551:5: (lv_name_0_0= RULE_ID )
                    // InternalEsper.g:1552:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getSingleDefinitionAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleDefinitionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSingleDefinitionAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEsper.g:1573:3: ( (otherlv_2= RULE_ID ) )
            // InternalEsper.g:1574:4: (otherlv_2= RULE_ID )
            {
            // InternalEsper.g:1574:4: (otherlv_2= RULE_ID )
            // InternalEsper.g:1575:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleDefinitionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getSingleDefinitionAccess().getSimpleEventsKindOfEventCrossReference_1_0());
              				
            }

            }


            }

            // InternalEsper.g:1586:3: ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalEsper.g:1587:4: ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')'
                    {
                    // InternalEsper.g:1587:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalEsper.g:1588:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSingleDefinitionAccess().getLeftParenthesisKeyword_2_0());
                      				
                    }

                    }

                    // InternalEsper.g:1594:4: ( (lv_anything_4_0= ruleAnything ) )
                    // InternalEsper.g:1595:5: (lv_anything_4_0= ruleAnything )
                    {
                    // InternalEsper.g:1595:5: (lv_anything_4_0= ruleAnything )
                    // InternalEsper.g:1596:6: lv_anything_4_0= ruleAnything
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleDefinitionAccess().getAnythingAnythingParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_anything_4_0=ruleAnything();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"anything",
                      							lv_anything_4_0,
                      							"org.xtext.example.mydsl.Esper.Anything");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSingleDefinitionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleDefinition"


    // $ANTLR start "entryRuleWin"
    // InternalEsper.g:1622:1: entryRuleWin returns [EObject current=null] : iv_ruleWin= ruleWin EOF ;
    public final EObject entryRuleWin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWin = null;


        try {
            // InternalEsper.g:1622:44: (iv_ruleWin= ruleWin EOF )
            // InternalEsper.g:1623:2: iv_ruleWin= ruleWin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWin=ruleWin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWin"


    // $ANTLR start "ruleWin"
    // InternalEsper.g:1629:1: ruleWin returns [EObject current=null] : (otherlv_0= 'win' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) ) ;
    public final EObject ruleWin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_defaultMethod_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1635:2: ( (otherlv_0= 'win' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) ) )
            // InternalEsper.g:1636:2: (otherlv_0= 'win' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) )
            {
            // InternalEsper.g:1636:2: (otherlv_0= 'win' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) )
            // InternalEsper.g:1637:3: otherlv_0= 'win' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWinAccess().getWinKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWinAccess().getColonKeyword_1());
              		
            }
            // InternalEsper.g:1645:3: ( (lv_defaultMethod_2_0= ruleDefaultMethods ) )
            // InternalEsper.g:1646:4: (lv_defaultMethod_2_0= ruleDefaultMethods )
            {
            // InternalEsper.g:1646:4: (lv_defaultMethod_2_0= ruleDefaultMethods )
            // InternalEsper.g:1647:5: lv_defaultMethod_2_0= ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWinAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_defaultMethod_2_0=ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWinRule());
              					}
              					set(
              						current,
              						"defaultMethod",
              						lv_defaultMethod_2_0,
              						"org.xtext.example.mydsl.Esper.DefaultMethods");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWin"


    // $ANTLR start "entryRuleFollowByWhere"
    // InternalEsper.g:1668:1: entryRuleFollowByWhere returns [EObject current=null] : iv_ruleFollowByWhere= ruleFollowByWhere EOF ;
    public final EObject entryRuleFollowByWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowByWhere = null;


        try {
            // InternalEsper.g:1668:54: (iv_ruleFollowByWhere= ruleFollowByWhere EOF )
            // InternalEsper.g:1669:2: iv_ruleFollowByWhere= ruleFollowByWhere EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFollowByWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFollowByWhere=ruleFollowByWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFollowByWhere; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFollowByWhere"


    // $ANTLR start "ruleFollowByWhere"
    // InternalEsper.g:1675:1: ruleFollowByWhere returns [EObject current=null] : ( (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' ) | (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) ) ) ;
    public final EObject ruleFollowByWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_FollowByWhere_1 = null;

        EObject lv_timer_4_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1681:2: ( ( (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' ) | (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) ) ) )
            // InternalEsper.g:1682:2: ( (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' ) | (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) ) )
            {
            // InternalEsper.g:1682:2: ( (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' ) | (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            else if ( (LA24_0==34) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsper.g:1683:3: (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' )
                    {
                    // InternalEsper.g:1683:3: (otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')' )
                    // InternalEsper.g:1684:4: otherlv_0= '(' this_FollowByWhere_1= ruleFollowByWhere otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFollowByWhereAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFollowByWhereAccess().getFollowByWhereParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_FollowByWhere_1=ruleFollowByWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FollowByWhere_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFollowByWhereAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1702:3: (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) )
                    {
                    // InternalEsper.g:1702:3: (otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) ) )
                    // InternalEsper.g:1703:4: otherlv_3= 'where' ( (lv_timer_4_0= ruleTimer ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFollowByWhereAccess().getWhereKeyword_1_0());
                      			
                    }
                    // InternalEsper.g:1707:4: ( (lv_timer_4_0= ruleTimer ) )
                    // InternalEsper.g:1708:5: (lv_timer_4_0= ruleTimer )
                    {
                    // InternalEsper.g:1708:5: (lv_timer_4_0= ruleTimer )
                    // InternalEsper.g:1709:6: lv_timer_4_0= ruleTimer
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFollowByWhereAccess().getTimerTimerParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_timer_4_0=ruleTimer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFollowByWhereRule());
                      						}
                      						set(
                      							current,
                      							"timer",
                      							lv_timer_4_0,
                      							"org.xtext.example.mydsl.Esper.Timer");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFollowByWhere"


    // $ANTLR start "entryRuleTimer"
    // InternalEsper.g:1731:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // InternalEsper.g:1731:46: (iv_ruleTimer= ruleTimer EOF )
            // InternalEsper.g:1732:2: iv_ruleTimer= ruleTimer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimer=ruleTimer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // InternalEsper.g:1738:1: ruleTimer returns [EObject current=null] : (otherlv_0= 'timer' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_defaultMethod_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1744:2: ( (otherlv_0= 'timer' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) ) )
            // InternalEsper.g:1745:2: (otherlv_0= 'timer' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) )
            {
            // InternalEsper.g:1745:2: (otherlv_0= 'timer' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) ) )
            // InternalEsper.g:1746:3: otherlv_0= 'timer' otherlv_1= ':' ( (lv_defaultMethod_2_0= ruleDefaultMethods ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTimerAccess().getTimerKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTimerAccess().getColonKeyword_1());
              		
            }
            // InternalEsper.g:1754:3: ( (lv_defaultMethod_2_0= ruleDefaultMethods ) )
            // InternalEsper.g:1755:4: (lv_defaultMethod_2_0= ruleDefaultMethods )
            {
            // InternalEsper.g:1755:4: (lv_defaultMethod_2_0= ruleDefaultMethods )
            // InternalEsper.g:1756:5: lv_defaultMethod_2_0= ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimerAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_defaultMethod_2_0=ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimerRule());
              					}
              					set(
              						current,
              						"defaultMethod",
              						lv_defaultMethod_2_0,
              						"org.xtext.example.mydsl.Esper.DefaultMethods");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleGroupBy"
    // InternalEsper.g:1777:1: entryRuleGroupBy returns [EObject current=null] : iv_ruleGroupBy= ruleGroupBy EOF ;
    public final EObject entryRuleGroupBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBy = null;


        try {
            // InternalEsper.g:1777:48: (iv_ruleGroupBy= ruleGroupBy EOF )
            // InternalEsper.g:1778:2: iv_ruleGroupBy= ruleGroupBy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroupBy=ruleGroupBy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupBy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupBy"


    // $ANTLR start "ruleGroupBy"
    // InternalEsper.g:1784:1: ruleGroupBy returns [EObject current=null] : (otherlv_0= 'group' otherlv_1= 'by' ( (lv_anything_2_0= ruleAnything ) ) ) ;
    public final EObject ruleGroupBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_anything_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1790:2: ( (otherlv_0= 'group' otherlv_1= 'by' ( (lv_anything_2_0= ruleAnything ) ) ) )
            // InternalEsper.g:1791:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_anything_2_0= ruleAnything ) ) )
            {
            // InternalEsper.g:1791:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_anything_2_0= ruleAnything ) ) )
            // InternalEsper.g:1792:3: otherlv_0= 'group' otherlv_1= 'by' ( (lv_anything_2_0= ruleAnything ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGroupByAccess().getGroupKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGroupByAccess().getByKeyword_1());
              		
            }
            // InternalEsper.g:1800:3: ( (lv_anything_2_0= ruleAnything ) )
            // InternalEsper.g:1801:4: (lv_anything_2_0= ruleAnything )
            {
            // InternalEsper.g:1801:4: (lv_anything_2_0= ruleAnything )
            // InternalEsper.g:1802:5: lv_anything_2_0= ruleAnything
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGroupByAccess().getAnythingAnythingParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_anything_2_0=ruleAnything();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGroupByRule());
              					}
              					set(
              						current,
              						"anything",
              						lv_anything_2_0,
              						"org.xtext.example.mydsl.Esper.Anything");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupBy"


    // $ANTLR start "entryRuleHaving"
    // InternalEsper.g:1823:1: entryRuleHaving returns [EObject current=null] : iv_ruleHaving= ruleHaving EOF ;
    public final EObject entryRuleHaving() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHaving = null;


        try {
            // InternalEsper.g:1823:47: (iv_ruleHaving= ruleHaving EOF )
            // InternalEsper.g:1824:2: iv_ruleHaving= ruleHaving EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHaving=ruleHaving();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHaving; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHaving"


    // $ANTLR start "ruleHaving"
    // InternalEsper.g:1830:1: ruleHaving returns [EObject current=null] : (otherlv_0= 'having' ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) ( (lv_operator_2_0= ruleOperators ) ) ( (lv_anything_3_0= ruleAnything ) ) ) ;
    public final EObject ruleHaving() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defaultMethod_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_anything_3_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1836:2: ( (otherlv_0= 'having' ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) ( (lv_operator_2_0= ruleOperators ) ) ( (lv_anything_3_0= ruleAnything ) ) ) )
            // InternalEsper.g:1837:2: (otherlv_0= 'having' ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) ( (lv_operator_2_0= ruleOperators ) ) ( (lv_anything_3_0= ruleAnything ) ) )
            {
            // InternalEsper.g:1837:2: (otherlv_0= 'having' ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) ( (lv_operator_2_0= ruleOperators ) ) ( (lv_anything_3_0= ruleAnything ) ) )
            // InternalEsper.g:1838:3: otherlv_0= 'having' ( (lv_defaultMethod_1_0= ruleDefaultMethods ) ) ( (lv_operator_2_0= ruleOperators ) ) ( (lv_anything_3_0= ruleAnything ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHavingAccess().getHavingKeyword_0());
              		
            }
            // InternalEsper.g:1842:3: ( (lv_defaultMethod_1_0= ruleDefaultMethods ) )
            // InternalEsper.g:1843:4: (lv_defaultMethod_1_0= ruleDefaultMethods )
            {
            // InternalEsper.g:1843:4: (lv_defaultMethod_1_0= ruleDefaultMethods )
            // InternalEsper.g:1844:5: lv_defaultMethod_1_0= ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHavingAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_defaultMethod_1_0=ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHavingRule());
              					}
              					set(
              						current,
              						"defaultMethod",
              						lv_defaultMethod_1_0,
              						"org.xtext.example.mydsl.Esper.DefaultMethods");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:1861:3: ( (lv_operator_2_0= ruleOperators ) )
            // InternalEsper.g:1862:4: (lv_operator_2_0= ruleOperators )
            {
            // InternalEsper.g:1862:4: (lv_operator_2_0= ruleOperators )
            // InternalEsper.g:1863:5: lv_operator_2_0= ruleOperators
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHavingAccess().getOperatorOperatorsEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_operator_2_0=ruleOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHavingRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"org.xtext.example.mydsl.Esper.Operators");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsper.g:1880:3: ( (lv_anything_3_0= ruleAnything ) )
            // InternalEsper.g:1881:4: (lv_anything_3_0= ruleAnything )
            {
            // InternalEsper.g:1881:4: (lv_anything_3_0= ruleAnything )
            // InternalEsper.g:1882:5: lv_anything_3_0= ruleAnything
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHavingAccess().getAnythingAnythingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_anything_3_0=ruleAnything();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHavingRule());
              					}
              					set(
              						current,
              						"anything",
              						lv_anything_3_0,
              						"org.xtext.example.mydsl.Esper.Anything");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHaving"


    // $ANTLR start "entryRuleDefaultMethods"
    // InternalEsper.g:1903:1: entryRuleDefaultMethods returns [EObject current=null] : iv_ruleDefaultMethods= ruleDefaultMethods EOF ;
    public final EObject entryRuleDefaultMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultMethods = null;


        try {
            // InternalEsper.g:1903:55: (iv_ruleDefaultMethods= ruleDefaultMethods EOF )
            // InternalEsper.g:1904:2: iv_ruleDefaultMethods= ruleDefaultMethods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultMethodsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultMethods=ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultMethods; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultMethods"


    // $ANTLR start "ruleDefaultMethods"
    // InternalEsper.g:1910:1: ruleDefaultMethods returns [EObject current=null] : ( ( (lv_name_0_0= ruleNameMethod ) ) otherlv_1= '(' ( (lv_anything_2_0= ruleAnything ) ) otherlv_3= ')' ) ;
    public final EObject ruleDefaultMethods() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_anything_2_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:1916:2: ( ( ( (lv_name_0_0= ruleNameMethod ) ) otherlv_1= '(' ( (lv_anything_2_0= ruleAnything ) ) otherlv_3= ')' ) )
            // InternalEsper.g:1917:2: ( ( (lv_name_0_0= ruleNameMethod ) ) otherlv_1= '(' ( (lv_anything_2_0= ruleAnything ) ) otherlv_3= ')' )
            {
            // InternalEsper.g:1917:2: ( ( (lv_name_0_0= ruleNameMethod ) ) otherlv_1= '(' ( (lv_anything_2_0= ruleAnything ) ) otherlv_3= ')' )
            // InternalEsper.g:1918:3: ( (lv_name_0_0= ruleNameMethod ) ) otherlv_1= '(' ( (lv_anything_2_0= ruleAnything ) ) otherlv_3= ')'
            {
            // InternalEsper.g:1918:3: ( (lv_name_0_0= ruleNameMethod ) )
            // InternalEsper.g:1919:4: (lv_name_0_0= ruleNameMethod )
            {
            // InternalEsper.g:1919:4: (lv_name_0_0= ruleNameMethod )
            // InternalEsper.g:1920:5: lv_name_0_0= ruleNameMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultMethodsAccess().getNameNameMethodParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleNameMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultMethodsRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.mydsl.Esper.NameMethod");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultMethodsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEsper.g:1941:3: ( (lv_anything_2_0= ruleAnything ) )
            // InternalEsper.g:1942:4: (lv_anything_2_0= ruleAnything )
            {
            // InternalEsper.g:1942:4: (lv_anything_2_0= ruleAnything )
            // InternalEsper.g:1943:5: lv_anything_2_0= ruleAnything
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultMethodsAccess().getAnythingAnythingParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_anything_2_0=ruleAnything();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultMethodsRule());
              					}
              					set(
              						current,
              						"anything",
              						lv_anything_2_0,
              						"org.xtext.example.mydsl.Esper.Anything");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefaultMethodsAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultMethods"


    // $ANTLR start "entryRuleValidID"
    // InternalEsper.g:1968:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalEsper.g:1968:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalEsper.g:1969:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalEsper.g:1975:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_NameMethod_1= ruleNameMethod ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_NameMethod_1 = null;



        	enterRule();

        try {
            // InternalEsper.g:1981:2: ( (this_ID_0= RULE_ID | this_NameMethod_1= ruleNameMethod ) )
            // InternalEsper.g:1982:2: (this_ID_0= RULE_ID | this_NameMethod_1= ruleNameMethod )
            {
            // InternalEsper.g:1982:2: (this_ID_0= RULE_ID | this_NameMethod_1= ruleNameMethod )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=39 && LA25_0<=45)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEsper.g:1983:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsper.g:1991:3: this_NameMethod_1= ruleNameMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValidIDAccess().getNameMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameMethod_1=ruleNameMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NameMethod_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNameMethod"
    // InternalEsper.g:2005:1: entryRuleNameMethod returns [String current=null] : iv_ruleNameMethod= ruleNameMethod EOF ;
    public final String entryRuleNameMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameMethod = null;


        try {
            // InternalEsper.g:2005:50: (iv_ruleNameMethod= ruleNameMethod EOF )
            // InternalEsper.g:2006:2: iv_ruleNameMethod= ruleNameMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameMethod=ruleNameMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameMethod.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameMethod"


    // $ANTLR start "ruleNameMethod"
    // InternalEsper.g:2012:1: ruleNameMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'avg' | kw= 'current_timestamp' | kw= 'count' | kw= 'max' | kw= 'within' | kw= 'time_batch' | kw= 'time' ) ;
    public final AntlrDatatypeRuleToken ruleNameMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsper.g:2018:2: ( (kw= 'avg' | kw= 'current_timestamp' | kw= 'count' | kw= 'max' | kw= 'within' | kw= 'time_batch' | kw= 'time' ) )
            // InternalEsper.g:2019:2: (kw= 'avg' | kw= 'current_timestamp' | kw= 'count' | kw= 'max' | kw= 'within' | kw= 'time_batch' | kw= 'time' )
            {
            // InternalEsper.g:2019:2: (kw= 'avg' | kw= 'current_timestamp' | kw= 'count' | kw= 'max' | kw= 'within' | kw= 'time_batch' | kw= 'time' )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt26=1;
                }
                break;
            case 40:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            case 42:
                {
                alt26=4;
                }
                break;
            case 43:
                {
                alt26=5;
                }
                break;
            case 44:
                {
                alt26=6;
                }
                break;
            case 45:
                {
                alt26=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalEsper.g:2020:3: kw= 'avg'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getAvgKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsper.g:2026:3: kw= 'current_timestamp'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getCurrent_timestampKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEsper.g:2032:3: kw= 'count'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getCountKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEsper.g:2038:3: kw= 'max'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getMaxKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEsper.g:2044:3: kw= 'within'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getWithinKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEsper.g:2050:3: kw= 'time_batch'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getTime_batchKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEsper.g:2056:3: kw= 'time'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNameMethodAccess().getTimeKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameMethod"


    // $ANTLR start "entryRuleAnything"
    // InternalEsper.g:2065:1: entryRuleAnything returns [EObject current=null] : iv_ruleAnything= ruleAnything EOF ;
    public final EObject entryRuleAnything() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnything = null;


        try {
            // InternalEsper.g:2065:49: (iv_ruleAnything= ruleAnything EOF )
            // InternalEsper.g:2066:2: iv_ruleAnything= ruleAnything EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnythingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnything=ruleAnything();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnything; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnything"


    // $ANTLR start "ruleAnything"
    // InternalEsper.g:2072:1: ruleAnything returns [EObject current=null] : ( () ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )* ) ;
    public final EObject ruleAnything() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token this_ANY_OTHER_8=null;
        Enumerator lv_operator_5_0 = null;

        EObject lv_extraParenthesis_6_0 = null;



        	enterRule();

        try {
            // InternalEsper.g:2078:2: ( ( () ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )* ) )
            // InternalEsper.g:2079:2: ( () ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )* )
            {
            // InternalEsper.g:2079:2: ( () ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )* )
            // InternalEsper.g:2080:3: () ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )*
            {
            // InternalEsper.g:2080:3: ()
            // InternalEsper.g:2081:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnythingAccess().getAnythingAction_0(),
              					current);
              			
            }

            }

            // InternalEsper.g:2087:3: ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // InternalEsper.g:2088:4: ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER )
            	    {
            	    // InternalEsper.g:2114:4: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER )
            	    int alt27=8;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    case 23:
            	    case 31:
            	    case 46:
            	    case 47:
            	    case 48:
            	    case 49:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	        {
            	        alt27=5;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt27=6;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt27=7;
            	        }
            	        break;
            	    case RULE_ANY_OTHER:
            	        {
            	        alt27=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalEsper.g:2115:5: this_ID_1= RULE_ID
            	            {
            	            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ID_1, grammarAccess.getAnythingAccess().getIDTerminalRuleCall_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEsper.g:2120:5: this_INT_2= RULE_INT
            	            {
            	            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_2, grammarAccess.getAnythingAccess().getINTTerminalRuleCall_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalEsper.g:2125:5: this_STRING_3= RULE_STRING
            	            {
            	            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_STRING_3, grammarAccess.getAnythingAccess().getSTRINGTerminalRuleCall_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalEsper.g:2130:5: otherlv_4= '.'
            	            {
            	            otherlv_4=(Token)match(input,24,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_4, grammarAccess.getAnythingAccess().getFullStopKeyword_1_0_3());
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalEsper.g:2135:5: ( (lv_operator_5_0= ruleOperators ) )
            	            {
            	            // InternalEsper.g:2135:5: ( (lv_operator_5_0= ruleOperators ) )
            	            // InternalEsper.g:2136:6: (lv_operator_5_0= ruleOperators )
            	            {
            	            // InternalEsper.g:2136:6: (lv_operator_5_0= ruleOperators )
            	            // InternalEsper.g:2137:7: lv_operator_5_0= ruleOperators
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAnythingAccess().getOperatorOperatorsEnumRuleCall_1_0_4_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_46);
            	            lv_operator_5_0=ruleOperators();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAnythingRule());
            	              							}
            	              							add(
            	              								current,
            	              								"operator",
            	              								lv_operator_5_0,
            	              								"org.xtext.example.mydsl.Esper.Operators");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalEsper.g:2155:5: ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) )
            	            {
            	            // InternalEsper.g:2155:5: ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) )
            	            // InternalEsper.g:2156:6: (lv_extraParenthesis_6_0= ruleExtraParenthesisRule )
            	            {
            	            // InternalEsper.g:2156:6: (lv_extraParenthesis_6_0= ruleExtraParenthesisRule )
            	            // InternalEsper.g:2157:7: lv_extraParenthesis_6_0= ruleExtraParenthesisRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAnythingAccess().getExtraParenthesisExtraParenthesisRuleParserRuleCall_1_0_5_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_46);
            	            lv_extraParenthesis_6_0=ruleExtraParenthesisRule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAnythingRule());
            	              							}
            	              							add(
            	              								current,
            	              								"extraParenthesis",
            	              								lv_extraParenthesis_6_0,
            	              								"org.xtext.example.mydsl.Esper.ExtraParenthesisRule");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalEsper.g:2175:5: otherlv_7= 'where'
            	            {
            	            otherlv_7=(Token)match(input,34,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_7, grammarAccess.getAnythingAccess().getWhereKeyword_1_0_6());
            	              				
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // InternalEsper.g:2180:5: this_ANY_OTHER_8= RULE_ANY_OTHER
            	            {
            	            this_ANY_OTHER_8=(Token)match(input,RULE_ANY_OTHER,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ANY_OTHER_8, grammarAccess.getAnythingAccess().getANY_OTHERTerminalRuleCall_1_0_7());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnything"


    // $ANTLR start "entryRuleExtraParenthesisRule"
    // InternalEsper.g:2190:1: entryRuleExtraParenthesisRule returns [EObject current=null] : iv_ruleExtraParenthesisRule= ruleExtraParenthesisRule EOF ;
    public final EObject entryRuleExtraParenthesisRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraParenthesisRule = null;


        try {
            // InternalEsper.g:2190:61: (iv_ruleExtraParenthesisRule= ruleExtraParenthesisRule EOF )
            // InternalEsper.g:2191:2: iv_ruleExtraParenthesisRule= ruleExtraParenthesisRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtraParenthesisRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtraParenthesisRule=ruleExtraParenthesisRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtraParenthesisRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtraParenthesisRule"


    // $ANTLR start "ruleExtraParenthesisRule"
    // InternalEsper.g:2197:1: ruleExtraParenthesisRule returns [EObject current=null] : (otherlv_0= '(' this_Anything_1= ruleAnything otherlv_2= ')' ) ;
    public final EObject ruleExtraParenthesisRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Anything_1 = null;



        	enterRule();

        try {
            // InternalEsper.g:2203:2: ( (otherlv_0= '(' this_Anything_1= ruleAnything otherlv_2= ')' ) )
            // InternalEsper.g:2204:2: (otherlv_0= '(' this_Anything_1= ruleAnything otherlv_2= ')' )
            {
            // InternalEsper.g:2204:2: (otherlv_0= '(' this_Anything_1= ruleAnything otherlv_2= ')' )
            // InternalEsper.g:2205:3: otherlv_0= '(' this_Anything_1= ruleAnything otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExtraParenthesisRuleAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExtraParenthesisRuleAccess().getAnythingParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
            this_Anything_1=ruleAnything();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Anything_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExtraParenthesisRuleAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtraParenthesisRule"


    // $ANTLR start "ruleOperators"
    // InternalEsper.g:2225:1: ruleOperators returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= 'and' ) | (enumLiteral_6= 'or' ) | (enumLiteral_7= 'between' ) | (enumLiteral_8= 'in' ) | (enumLiteral_9= 'not' ) | (enumLiteral_10= 'not in' ) | (enumLiteral_11= '+' ) | (enumLiteral_12= '-' ) | (enumLiteral_13= '*' ) | (enumLiteral_14= 'is not' ) ) ;
    public final Enumerator ruleOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalEsper.g:2231:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= 'and' ) | (enumLiteral_6= 'or' ) | (enumLiteral_7= 'between' ) | (enumLiteral_8= 'in' ) | (enumLiteral_9= 'not' ) | (enumLiteral_10= 'not in' ) | (enumLiteral_11= '+' ) | (enumLiteral_12= '-' ) | (enumLiteral_13= '*' ) | (enumLiteral_14= 'is not' ) ) )
            // InternalEsper.g:2232:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= 'and' ) | (enumLiteral_6= 'or' ) | (enumLiteral_7= 'between' ) | (enumLiteral_8= 'in' ) | (enumLiteral_9= 'not' ) | (enumLiteral_10= 'not in' ) | (enumLiteral_11= '+' ) | (enumLiteral_12= '-' ) | (enumLiteral_13= '*' ) | (enumLiteral_14= 'is not' ) )
            {
            // InternalEsper.g:2232:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= 'and' ) | (enumLiteral_6= 'or' ) | (enumLiteral_7= 'between' ) | (enumLiteral_8= 'in' ) | (enumLiteral_9= 'not' ) | (enumLiteral_10= 'not in' ) | (enumLiteral_11= '+' ) | (enumLiteral_12= '-' ) | (enumLiteral_13= '*' ) | (enumLiteral_14= 'is not' ) )
            int alt29=15;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 46:
                {
                alt29=2;
                }
                break;
            case 47:
                {
                alt29=3;
                }
                break;
            case 48:
                {
                alt29=4;
                }
                break;
            case 49:
                {
                alt29=5;
                }
                break;
            case 50:
                {
                alt29=6;
                }
                break;
            case 51:
                {
                alt29=7;
                }
                break;
            case 52:
                {
                alt29=8;
                }
                break;
            case 53:
                {
                alt29=9;
                }
                break;
            case 54:
                {
                alt29=10;
                }
                break;
            case 55:
                {
                alt29=11;
                }
                break;
            case 56:
                {
                alt29=12;
                }
                break;
            case 57:
                {
                alt29=13;
                }
                break;
            case 23:
                {
                alt29=14;
                }
                break;
            case 58:
                {
                alt29=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalEsper.g:2233:3: (enumLiteral_0= '=' )
                    {
                    // InternalEsper.g:2233:3: (enumLiteral_0= '=' )
                    // InternalEsper.g:2234:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOperatorsAccess().getEqualEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:2241:3: (enumLiteral_1= '<' )
                    {
                    // InternalEsper.g:2241:3: (enumLiteral_1= '<' )
                    // InternalEsper.g:2242:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getLessThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOperatorsAccess().getLessThanEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:2249:3: (enumLiteral_2= '>' )
                    {
                    // InternalEsper.g:2249:3: (enumLiteral_2= '>' )
                    // InternalEsper.g:2250:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getMoreThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOperatorsAccess().getMoreThanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:2257:3: (enumLiteral_3= '<=' )
                    {
                    // InternalEsper.g:2257:3: (enumLiteral_3= '<=' )
                    // InternalEsper.g:2258:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getLessEqualThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOperatorsAccess().getLessEqualThanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper.g:2265:3: (enumLiteral_4= '>=' )
                    {
                    // InternalEsper.g:2265:3: (enumLiteral_4= '>=' )
                    // InternalEsper.g:2266:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getMoreEqualThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOperatorsAccess().getMoreEqualThanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper.g:2273:3: (enumLiteral_5= 'and' )
                    {
                    // InternalEsper.g:2273:3: (enumLiteral_5= 'and' )
                    // InternalEsper.g:2274:4: enumLiteral_5= 'and'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getAndEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getOperatorsAccess().getAndEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsper.g:2281:3: (enumLiteral_6= 'or' )
                    {
                    // InternalEsper.g:2281:3: (enumLiteral_6= 'or' )
                    // InternalEsper.g:2282:4: enumLiteral_6= 'or'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getOrEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getOperatorsAccess().getOrEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEsper.g:2289:3: (enumLiteral_7= 'between' )
                    {
                    // InternalEsper.g:2289:3: (enumLiteral_7= 'between' )
                    // InternalEsper.g:2290:4: enumLiteral_7= 'between'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getBetweenEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getOperatorsAccess().getBetweenEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEsper.g:2297:3: (enumLiteral_8= 'in' )
                    {
                    // InternalEsper.g:2297:3: (enumLiteral_8= 'in' )
                    // InternalEsper.g:2298:4: enumLiteral_8= 'in'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getInEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getOperatorsAccess().getInEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEsper.g:2305:3: (enumLiteral_9= 'not' )
                    {
                    // InternalEsper.g:2305:3: (enumLiteral_9= 'not' )
                    // InternalEsper.g:2306:4: enumLiteral_9= 'not'
                    {
                    enumLiteral_9=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getNotEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getOperatorsAccess().getNotEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEsper.g:2313:3: (enumLiteral_10= 'not in' )
                    {
                    // InternalEsper.g:2313:3: (enumLiteral_10= 'not in' )
                    // InternalEsper.g:2314:4: enumLiteral_10= 'not in'
                    {
                    enumLiteral_10=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getNotInEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getOperatorsAccess().getNotInEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEsper.g:2321:3: (enumLiteral_11= '+' )
                    {
                    // InternalEsper.g:2321:3: (enumLiteral_11= '+' )
                    // InternalEsper.g:2322:4: enumLiteral_11= '+'
                    {
                    enumLiteral_11=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getPlusEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getOperatorsAccess().getPlusEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalEsper.g:2329:3: (enumLiteral_12= '-' )
                    {
                    // InternalEsper.g:2329:3: (enumLiteral_12= '-' )
                    // InternalEsper.g:2330:4: enumLiteral_12= '-'
                    {
                    enumLiteral_12=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getMinusEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getOperatorsAccess().getMinusEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalEsper.g:2337:3: (enumLiteral_13= '*' )
                    {
                    // InternalEsper.g:2337:3: (enumLiteral_13= '*' )
                    // InternalEsper.g:2338:4: enumLiteral_13= '*'
                    {
                    enumLiteral_13=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getMultiplicationEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getOperatorsAccess().getMultiplicationEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalEsper.g:2345:3: (enumLiteral_14= 'is not' )
                    {
                    // InternalEsper.g:2345:3: (enumLiteral_14= 'is not' )
                    // InternalEsper.g:2346:4: enumLiteral_14= 'is not'
                    {
                    enumLiteral_14=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOperatorsAccess().getIsnotEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getOperatorsAccess().getIsnotEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperators"

    // $ANTLR start synpred1_InternalEsper
    public final void synpred1_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:1274:5: ( ( ruleFollowBy ) )
        // InternalEsper.g:1274:6: ( ruleFollowBy )
        {
        // InternalEsper.g:1274:6: ( ruleFollowBy )
        // InternalEsper.g:1275:6: ruleFollowBy
        {
        pushFollow(FOLLOW_2);
        ruleFollowBy();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEsper

    // $ANTLR start synpred2_InternalEsper
    public final void synpred2_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:1386:5: ( '->' )
        // InternalEsper.g:1386:6: '->'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEsper

    // $ANTLR start synpred3_InternalEsper
    public final void synpred3_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:1547:5: ( ( RULE_ID ) )
        // InternalEsper.g:1547:6: ( RULE_ID )
        {
        // InternalEsper.g:1547:6: ( RULE_ID )
        // InternalEsper.g:1548:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEsper

    // $ANTLR start synpred4_InternalEsper
    public final void synpred4_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:1588:5: ( '(' )
        // InternalEsper.g:1588:6: '('
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalEsper

    // $ANTLR start synpred5_InternalEsper
    public final void synpred5_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:2088:4: ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )
        // InternalEsper.g:2088:5: ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER )
        {
        // InternalEsper.g:2088:5: ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER )
        int alt30=8;
        switch ( input.LA(1) ) {
        case RULE_ID:
            {
            alt30=1;
            }
            break;
        case RULE_INT:
            {
            alt30=2;
            }
            break;
        case RULE_STRING:
            {
            alt30=3;
            }
            break;
        case 24:
            {
            alt30=4;
            }
            break;
        case 23:
        case 31:
        case 46:
        case 47:
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 56:
        case 57:
        case 58:
            {
            alt30=5;
            }
            break;
        case 14:
            {
            alt30=6;
            }
            break;
        case 34:
            {
            alt30=7;
            }
            break;
        case RULE_ANY_OTHER:
            {
            alt30=8;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;
        }

        switch (alt30) {
            case 1 :
                // InternalEsper.g:2089:5: RULE_ID
                {
                match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalEsper.g:2091:5: RULE_INT
                {
                match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalEsper.g:2093:5: RULE_STRING
                {
                match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalEsper.g:2095:5: '.'
                {
                match(input,24,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalEsper.g:2097:5: ( ( ruleOperators ) )
                {
                // InternalEsper.g:2097:5: ( ( ruleOperators ) )
                // InternalEsper.g:2098:6: ( ruleOperators )
                {
                // InternalEsper.g:2098:6: ( ruleOperators )
                // InternalEsper.g:2099:7: ruleOperators
                {
                pushFollow(FOLLOW_2);
                ruleOperators();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 6 :
                // InternalEsper.g:2103:5: ( ( ruleExtraParenthesisRule ) )
                {
                // InternalEsper.g:2103:5: ( ( ruleExtraParenthesisRule ) )
                // InternalEsper.g:2104:6: ( ruleExtraParenthesisRule )
                {
                // InternalEsper.g:2104:6: ( ruleExtraParenthesisRule )
                // InternalEsper.g:2105:7: ruleExtraParenthesisRule
                {
                pushFollow(FOLLOW_2);
                ruleExtraParenthesisRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 7 :
                // InternalEsper.g:2109:5: 'where'
                {
                match(input,34,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 8 :
                // InternalEsper.g:2111:5: RULE_ANY_OTHER
                {
                match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred5_InternalEsper

    // Delegated rules

    public final boolean synpred3_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\2\26\uffff";
    static final String dfa_3s = "\1\16\1\0\25\uffff";
    static final String dfa_4s = "\1\72\1\0\25\uffff";
    static final String dfa_5s = "\2\uffff\1\2\23\uffff\1\1";
    static final String dfa_6s = "\1\uffff\1\0\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\6\uffff\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff\1\2\13\uffff\15\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1586:3: ( ( ( '(' )=>otherlv_3= '(' ) ( (lv_anything_4_0= ruleAnything ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalEsper()) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\1\27\uffff";
    static final String dfa_10s = "\1\4\27\uffff";
    static final String dfa_11s = "\1\72\27\uffff";
    static final String dfa_12s = "\1\uffff\1\2\26\1";
    static final String dfa_13s = "\1\0\27\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\4\1\3\1\27\5\uffff\1\1\1\25\1\uffff\1\1\6\uffff\1\23\1\5\6\uffff\1\6\2\uffff\1\26\1\uffff\1\1\1\uffff\1\1\7\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2087:3: ( ( ( RULE_ID | RULE_INT | RULE_STRING | '.' | ( ( ruleOperators ) ) | ( ( ruleExtraParenthesisRule ) ) | 'where' | RULE_ANY_OTHER ) )=> (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | otherlv_4= '.' | ( (lv_operator_5_0= ruleOperators ) ) | ( (lv_extraParenthesis_6_0= ruleExtraParenthesisRule ) ) | otherlv_7= 'where' | this_ANY_OTHER_8= RULE_ANY_OTHER ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==EOF||LA28_0==13||LA28_0==16||LA28_0==36||LA28_0==38) ) {s = 1;}

                        else if ( (LA28_0==RULE_ID) && (synpred5_InternalEsper())) {s = 2;}

                        else if ( (LA28_0==RULE_INT) && (synpred5_InternalEsper())) {s = 3;}

                        else if ( (LA28_0==RULE_STRING) && (synpred5_InternalEsper())) {s = 4;}

                        else if ( (LA28_0==24) && (synpred5_InternalEsper())) {s = 5;}

                        else if ( (LA28_0==31) && (synpred5_InternalEsper())) {s = 6;}

                        else if ( (LA28_0==46) && (synpred5_InternalEsper())) {s = 7;}

                        else if ( (LA28_0==47) && (synpred5_InternalEsper())) {s = 8;}

                        else if ( (LA28_0==48) && (synpred5_InternalEsper())) {s = 9;}

                        else if ( (LA28_0==49) && (synpred5_InternalEsper())) {s = 10;}

                        else if ( (LA28_0==50) && (synpred5_InternalEsper())) {s = 11;}

                        else if ( (LA28_0==51) && (synpred5_InternalEsper())) {s = 12;}

                        else if ( (LA28_0==52) && (synpred5_InternalEsper())) {s = 13;}

                        else if ( (LA28_0==53) && (synpred5_InternalEsper())) {s = 14;}

                        else if ( (LA28_0==54) && (synpred5_InternalEsper())) {s = 15;}

                        else if ( (LA28_0==55) && (synpred5_InternalEsper())) {s = 16;}

                        else if ( (LA28_0==56) && (synpred5_InternalEsper())) {s = 17;}

                        else if ( (LA28_0==57) && (synpred5_InternalEsper())) {s = 18;}

                        else if ( (LA28_0==23) && (synpred5_InternalEsper())) {s = 19;}

                        else if ( (LA28_0==58) && (synpred5_InternalEsper())) {s = 20;}

                        else if ( (LA28_0==14) && (synpred5_InternalEsper())) {s = 21;}

                        else if ( (LA28_0==34) && (synpred5_InternalEsper())) {s = 22;}

                        else if ( (LA28_0==RULE_ANY_OTHER) && (synpred5_InternalEsper())) {s = 23;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000005000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003F8000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00003F8000408072L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003F8000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003F8000008072L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x07FFC00080800002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x07FFC004818140F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x07FFC004818040F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040004010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x07FFC00080800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x07FFC004818040F2L});

}