package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.EsperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEsperParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'*'", "'avg'", "'current_timestamp'", "'count'", "'max'", "'within'", "'time_batch'", "'time'", "'.'", "'where'", "'='", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'between'", "'in'", "'not'", "'not in'", "'+'", "'-'", "'is not'", "'create'", "'schema'", "';'", "'('", "')'", "','", "'insert'", "'into'", "'@Name'", "'@Priority'", "'select'", "'as'", "'from'", "'pattern'", "'['", "']'", "'->'", "'win'", "':'", "'timer'", "'group'", "'by'", "'having'", "'every'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(EsperGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalEsper.g:54:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalEsper.g:55:1: ( ruleDomainmodel EOF )
            // InternalEsper.g:56:1: ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalEsper.g:63:1: ruleDomainmodel : ( ( rule__Domainmodel__Alternatives )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:67:2: ( ( ( rule__Domainmodel__Alternatives )* ) )
            // InternalEsper.g:68:2: ( ( rule__Domainmodel__Alternatives )* )
            {
            // InternalEsper.g:68:2: ( ( rule__Domainmodel__Alternatives )* )
            // InternalEsper.g:69:3: ( rule__Domainmodel__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelAccess().getAlternatives()); 
            }
            // InternalEsper.g:70:3: ( rule__Domainmodel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35||LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsper.g:70:4: rule__Domainmodel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleEvent"
    // InternalEsper.g:79:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalEsper.g:80:1: ( ruleEvent EOF )
            // InternalEsper.g:81:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEsper.g:88:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:92:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalEsper.g:93:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalEsper.g:93:2: ( ( rule__Event__Group__0 ) )
            // InternalEsper.g:94:3: ( rule__Event__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup()); 
            }
            // InternalEsper.g:95:3: ( rule__Event__Group__0 )
            // InternalEsper.g:95:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAttributes"
    // InternalEsper.g:104:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalEsper.g:105:1: ( ruleAttributes EOF )
            // InternalEsper.g:106:1: ruleAttributes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalEsper.g:113:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:117:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalEsper.g:118:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalEsper.g:118:2: ( ( rule__Attributes__Group__0 ) )
            // InternalEsper.g:119:3: ( rule__Attributes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getGroup()); 
            }
            // InternalEsper.g:120:3: ( rule__Attributes__Group__0 )
            // InternalEsper.g:120:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttributesDefinition"
    // InternalEsper.g:129:1: entryRuleAttributesDefinition : ruleAttributesDefinition EOF ;
    public final void entryRuleAttributesDefinition() throws RecognitionException {
        try {
            // InternalEsper.g:130:1: ( ruleAttributesDefinition EOF )
            // InternalEsper.g:131:1: ruleAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributesDefinition"


    // $ANTLR start "ruleAttributesDefinition"
    // InternalEsper.g:138:1: ruleAttributesDefinition : ( ( rule__AttributesDefinition__Group__0 ) ) ;
    public final void ruleAttributesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:142:2: ( ( ( rule__AttributesDefinition__Group__0 ) ) )
            // InternalEsper.g:143:2: ( ( rule__AttributesDefinition__Group__0 ) )
            {
            // InternalEsper.g:143:2: ( ( rule__AttributesDefinition__Group__0 ) )
            // InternalEsper.g:144:3: ( rule__AttributesDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionAccess().getGroup()); 
            }
            // InternalEsper.g:145:3: ( rule__AttributesDefinition__Group__0 )
            // InternalEsper.g:145:4: rule__AttributesDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributesDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributesDefinition"


    // $ANTLR start "entryRuleRuleParts"
    // InternalEsper.g:154:1: entryRuleRuleParts : ruleRuleParts EOF ;
    public final void entryRuleRuleParts() throws RecognitionException {
        try {
            // InternalEsper.g:155:1: ( ruleRuleParts EOF )
            // InternalEsper.g:156:1: ruleRuleParts EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleParts();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleParts"


    // $ANTLR start "ruleRuleParts"
    // InternalEsper.g:163:1: ruleRuleParts : ( ( rule__RuleParts__Group__0 ) ) ;
    public final void ruleRuleParts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:167:2: ( ( ( rule__RuleParts__Group__0 ) ) )
            // InternalEsper.g:168:2: ( ( rule__RuleParts__Group__0 ) )
            {
            // InternalEsper.g:168:2: ( ( rule__RuleParts__Group__0 ) )
            // InternalEsper.g:169:3: ( rule__RuleParts__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getGroup()); 
            }
            // InternalEsper.g:170:3: ( rule__RuleParts__Group__0 )
            // InternalEsper.g:170:4: rule__RuleParts__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleParts"


    // $ANTLR start "entryRuleInsert"
    // InternalEsper.g:179:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalEsper.g:180:1: ( ruleInsert EOF )
            // InternalEsper.g:181:1: ruleInsert EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalEsper.g:188:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:192:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalEsper.g:193:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalEsper.g:193:2: ( ( rule__Insert__Group__0 ) )
            // InternalEsper.g:194:3: ( rule__Insert__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup()); 
            }
            // InternalEsper.g:195:3: ( rule__Insert__Group__0 )
            // InternalEsper.g:195:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleName"
    // InternalEsper.g:204:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalEsper.g:205:1: ( ruleName EOF )
            // InternalEsper.g:206:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalEsper.g:213:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:217:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalEsper.g:218:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalEsper.g:218:2: ( ( rule__Name__Group__0 ) )
            // InternalEsper.g:219:3: ( rule__Name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getGroup()); 
            }
            // InternalEsper.g:220:3: ( rule__Name__Group__0 )
            // InternalEsper.g:220:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRulePriority"
    // InternalEsper.g:229:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
        try {
            // InternalEsper.g:230:1: ( rulePriority EOF )
            // InternalEsper.g:231:1: rulePriority EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePriority();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // InternalEsper.g:238:1: rulePriority : ( ( rule__Priority__Group__0 ) ) ;
    public final void rulePriority() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:242:2: ( ( ( rule__Priority__Group__0 ) ) )
            // InternalEsper.g:243:2: ( ( rule__Priority__Group__0 ) )
            {
            // InternalEsper.g:243:2: ( ( rule__Priority__Group__0 ) )
            // InternalEsper.g:244:3: ( rule__Priority__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getGroup()); 
            }
            // InternalEsper.g:245:3: ( rule__Priority__Group__0 )
            // InternalEsper.g:245:4: rule__Priority__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Priority__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "entryRuleSelect"
    // InternalEsper.g:254:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalEsper.g:255:1: ( ruleSelect EOF )
            // InternalEsper.g:256:1: ruleSelect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalEsper.g:263:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:267:2: ( ( ( rule__Select__Alternatives ) ) )
            // InternalEsper.g:268:2: ( ( rule__Select__Alternatives ) )
            {
            // InternalEsper.g:268:2: ( ( rule__Select__Alternatives ) )
            // InternalEsper.g:269:3: ( rule__Select__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAlternatives()); 
            }
            // InternalEsper.g:270:3: ( rule__Select__Alternatives )
            // InternalEsper.g:270:4: rule__Select__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleKindSelectAttributesDefinition"
    // InternalEsper.g:279:1: entryRuleKindSelectAttributesDefinition : ruleKindSelectAttributesDefinition EOF ;
    public final void entryRuleKindSelectAttributesDefinition() throws RecognitionException {
        try {
            // InternalEsper.g:280:1: ( ruleKindSelectAttributesDefinition EOF )
            // InternalEsper.g:281:1: ruleKindSelectAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKindSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKindSelectAttributesDefinition"


    // $ANTLR start "ruleKindSelectAttributesDefinition"
    // InternalEsper.g:288:1: ruleKindSelectAttributesDefinition : ( ( rule__KindSelectAttributesDefinition__Alternatives ) ) ;
    public final void ruleKindSelectAttributesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:292:2: ( ( ( rule__KindSelectAttributesDefinition__Alternatives ) ) )
            // InternalEsper.g:293:2: ( ( rule__KindSelectAttributesDefinition__Alternatives ) )
            {
            // InternalEsper.g:293:2: ( ( rule__KindSelectAttributesDefinition__Alternatives ) )
            // InternalEsper.g:294:3: ( rule__KindSelectAttributesDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionAccess().getAlternatives()); 
            }
            // InternalEsper.g:295:3: ( rule__KindSelectAttributesDefinition__Alternatives )
            // InternalEsper.g:295:4: rule__KindSelectAttributesDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KindSelectAttributesDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKindSelectAttributesDefinition"


    // $ANTLR start "entryRuleSelectAttributesDefinition"
    // InternalEsper.g:304:1: entryRuleSelectAttributesDefinition : ruleSelectAttributesDefinition EOF ;
    public final void entryRuleSelectAttributesDefinition() throws RecognitionException {
        try {
            // InternalEsper.g:305:1: ( ruleSelectAttributesDefinition EOF )
            // InternalEsper.g:306:1: ruleSelectAttributesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectAttributesDefinition"


    // $ANTLR start "ruleSelectAttributesDefinition"
    // InternalEsper.g:313:1: ruleSelectAttributesDefinition : ( ( rule__SelectAttributesDefinition__Group__0 ) ) ;
    public final void ruleSelectAttributesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:317:2: ( ( ( rule__SelectAttributesDefinition__Group__0 ) ) )
            // InternalEsper.g:318:2: ( ( rule__SelectAttributesDefinition__Group__0 ) )
            {
            // InternalEsper.g:318:2: ( ( rule__SelectAttributesDefinition__Group__0 ) )
            // InternalEsper.g:319:3: ( rule__SelectAttributesDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getGroup()); 
            }
            // InternalEsper.g:320:3: ( rule__SelectAttributesDefinition__Group__0 )
            // InternalEsper.g:320:4: rule__SelectAttributesDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectAttributesDefinition"


    // $ANTLR start "entryRuleSingleSelectDefinition"
    // InternalEsper.g:329:1: entryRuleSingleSelectDefinition : ruleSingleSelectDefinition EOF ;
    public final void entryRuleSingleSelectDefinition() throws RecognitionException {
        try {
            // InternalEsper.g:330:1: ( ruleSingleSelectDefinition EOF )
            // InternalEsper.g:331:1: ruleSingleSelectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleSelectDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleSelectDefinition"


    // $ANTLR start "ruleSingleSelectDefinition"
    // InternalEsper.g:338:1: ruleSingleSelectDefinition : ( ( rule__SingleSelectDefinition__Group__0 ) ) ;
    public final void ruleSingleSelectDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:342:2: ( ( ( rule__SingleSelectDefinition__Group__0 ) ) )
            // InternalEsper.g:343:2: ( ( rule__SingleSelectDefinition__Group__0 ) )
            {
            // InternalEsper.g:343:2: ( ( rule__SingleSelectDefinition__Group__0 ) )
            // InternalEsper.g:344:3: ( rule__SingleSelectDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getGroup()); 
            }
            // InternalEsper.g:345:3: ( rule__SingleSelectDefinition__Group__0 )
            // InternalEsper.g:345:4: rule__SingleSelectDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleSelectDefinition"


    // $ANTLR start "entryRuleFrom"
    // InternalEsper.g:354:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalEsper.g:355:1: ( ruleFrom EOF )
            // InternalEsper.g:356:1: ruleFrom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFrom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalEsper.g:363:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:367:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalEsper.g:368:2: ( ( rule__From__Group__0 ) )
            {
            // InternalEsper.g:368:2: ( ( rule__From__Group__0 ) )
            // InternalEsper.g:369:3: ( rule__From__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getGroup()); 
            }
            // InternalEsper.g:370:3: ( rule__From__Group__0 )
            // InternalEsper.g:370:4: rule__From__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRulePattern"
    // InternalEsper.g:379:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalEsper.g:380:1: ( rulePattern EOF )
            // InternalEsper.g:381:1: rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalEsper.g:388:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:392:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalEsper.g:393:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalEsper.g:393:2: ( ( rule__Pattern__Group__0 ) )
            // InternalEsper.g:394:3: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // InternalEsper.g:395:3: ( rule__Pattern__Group__0 )
            // InternalEsper.g:395:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleJoinFollowBy"
    // InternalEsper.g:404:1: entryRuleJoinFollowBy : ruleJoinFollowBy EOF ;
    public final void entryRuleJoinFollowBy() throws RecognitionException {
        try {
            // InternalEsper.g:405:1: ( ruleJoinFollowBy EOF )
            // InternalEsper.g:406:1: ruleJoinFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJoinFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoinFollowBy"


    // $ANTLR start "ruleJoinFollowBy"
    // InternalEsper.g:413:1: ruleJoinFollowBy : ( ( rule__JoinFollowBy__Group__0 ) ) ;
    public final void ruleJoinFollowBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:417:2: ( ( ( rule__JoinFollowBy__Group__0 ) ) )
            // InternalEsper.g:418:2: ( ( rule__JoinFollowBy__Group__0 ) )
            {
            // InternalEsper.g:418:2: ( ( rule__JoinFollowBy__Group__0 ) )
            // InternalEsper.g:419:3: ( rule__JoinFollowBy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getGroup()); 
            }
            // InternalEsper.g:420:3: ( rule__JoinFollowBy__Group__0 )
            // InternalEsper.g:420:4: rule__JoinFollowBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinFollowBy"


    // $ANTLR start "entryRuleAbstractFollowBy"
    // InternalEsper.g:429:1: entryRuleAbstractFollowBy : ruleAbstractFollowBy EOF ;
    public final void entryRuleAbstractFollowBy() throws RecognitionException {
        try {
            // InternalEsper.g:430:1: ( ruleAbstractFollowBy EOF )
            // InternalEsper.g:431:1: ruleAbstractFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractFollowBy"


    // $ANTLR start "ruleAbstractFollowBy"
    // InternalEsper.g:438:1: ruleAbstractFollowBy : ( ( rule__AbstractFollowBy__Group__0 ) ) ;
    public final void ruleAbstractFollowBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:442:2: ( ( ( rule__AbstractFollowBy__Group__0 ) ) )
            // InternalEsper.g:443:2: ( ( rule__AbstractFollowBy__Group__0 ) )
            {
            // InternalEsper.g:443:2: ( ( rule__AbstractFollowBy__Group__0 ) )
            // InternalEsper.g:444:3: ( rule__AbstractFollowBy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getGroup()); 
            }
            // InternalEsper.g:445:3: ( rule__AbstractFollowBy__Group__0 )
            // InternalEsper.g:445:4: rule__AbstractFollowBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractFollowBy"


    // $ANTLR start "entryRuleFollowBy"
    // InternalEsper.g:454:1: entryRuleFollowBy : ruleFollowBy EOF ;
    public final void entryRuleFollowBy() throws RecognitionException {
        try {
            // InternalEsper.g:455:1: ( ruleFollowBy EOF )
            // InternalEsper.g:456:1: ruleFollowBy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFollowBy"


    // $ANTLR start "ruleFollowBy"
    // InternalEsper.g:463:1: ruleFollowBy : ( ( rule__FollowBy__Group__0 ) ) ;
    public final void ruleFollowBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:467:2: ( ( ( rule__FollowBy__Group__0 ) ) )
            // InternalEsper.g:468:2: ( ( rule__FollowBy__Group__0 ) )
            {
            // InternalEsper.g:468:2: ( ( rule__FollowBy__Group__0 ) )
            // InternalEsper.g:469:3: ( rule__FollowBy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getGroup()); 
            }
            // InternalEsper.g:470:3: ( rule__FollowBy__Group__0 )
            // InternalEsper.g:470:4: rule__FollowBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowBy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowBy"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalEsper.g:479:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalEsper.g:480:1: ( ruleTerminalExpression EOF )
            // InternalEsper.g:481:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalEsper.g:488:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:492:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalEsper.g:493:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalEsper.g:493:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalEsper.g:494:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalEsper.g:495:3: ( rule__TerminalExpression__Alternatives )
            // InternalEsper.g:495:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleSingleDefinition"
    // InternalEsper.g:504:1: entryRuleSingleDefinition : ruleSingleDefinition EOF ;
    public final void entryRuleSingleDefinition() throws RecognitionException {
        try {
            // InternalEsper.g:505:1: ( ruleSingleDefinition EOF )
            // InternalEsper.g:506:1: ruleSingleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleDefinition"


    // $ANTLR start "ruleSingleDefinition"
    // InternalEsper.g:513:1: ruleSingleDefinition : ( ( rule__SingleDefinition__Group__0 ) ) ;
    public final void ruleSingleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:517:2: ( ( ( rule__SingleDefinition__Group__0 ) ) )
            // InternalEsper.g:518:2: ( ( rule__SingleDefinition__Group__0 ) )
            {
            // InternalEsper.g:518:2: ( ( rule__SingleDefinition__Group__0 ) )
            // InternalEsper.g:519:3: ( rule__SingleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getGroup()); 
            }
            // InternalEsper.g:520:3: ( rule__SingleDefinition__Group__0 )
            // InternalEsper.g:520:4: rule__SingleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleDefinition"


    // $ANTLR start "entryRuleWin"
    // InternalEsper.g:529:1: entryRuleWin : ruleWin EOF ;
    public final void entryRuleWin() throws RecognitionException {
        try {
            // InternalEsper.g:530:1: ( ruleWin EOF )
            // InternalEsper.g:531:1: ruleWin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWin"


    // $ANTLR start "ruleWin"
    // InternalEsper.g:538:1: ruleWin : ( ( rule__Win__Group__0 ) ) ;
    public final void ruleWin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:542:2: ( ( ( rule__Win__Group__0 ) ) )
            // InternalEsper.g:543:2: ( ( rule__Win__Group__0 ) )
            {
            // InternalEsper.g:543:2: ( ( rule__Win__Group__0 ) )
            // InternalEsper.g:544:3: ( rule__Win__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinAccess().getGroup()); 
            }
            // InternalEsper.g:545:3: ( rule__Win__Group__0 )
            // InternalEsper.g:545:4: rule__Win__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Win__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWin"


    // $ANTLR start "entryRuleFollowByWhere"
    // InternalEsper.g:554:1: entryRuleFollowByWhere : ruleFollowByWhere EOF ;
    public final void entryRuleFollowByWhere() throws RecognitionException {
        try {
            // InternalEsper.g:555:1: ( ruleFollowByWhere EOF )
            // InternalEsper.g:556:1: ruleFollowByWhere EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFollowByWhere();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFollowByWhere"


    // $ANTLR start "ruleFollowByWhere"
    // InternalEsper.g:563:1: ruleFollowByWhere : ( ( rule__FollowByWhere__Alternatives ) ) ;
    public final void ruleFollowByWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:567:2: ( ( ( rule__FollowByWhere__Alternatives ) ) )
            // InternalEsper.g:568:2: ( ( rule__FollowByWhere__Alternatives ) )
            {
            // InternalEsper.g:568:2: ( ( rule__FollowByWhere__Alternatives ) )
            // InternalEsper.g:569:3: ( rule__FollowByWhere__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getAlternatives()); 
            }
            // InternalEsper.g:570:3: ( rule__FollowByWhere__Alternatives )
            // InternalEsper.g:570:4: rule__FollowByWhere__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowByWhere"


    // $ANTLR start "entryRuleTimer"
    // InternalEsper.g:579:1: entryRuleTimer : ruleTimer EOF ;
    public final void entryRuleTimer() throws RecognitionException {
        try {
            // InternalEsper.g:580:1: ( ruleTimer EOF )
            // InternalEsper.g:581:1: ruleTimer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTimer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // InternalEsper.g:588:1: ruleTimer : ( ( rule__Timer__Group__0 ) ) ;
    public final void ruleTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:592:2: ( ( ( rule__Timer__Group__0 ) ) )
            // InternalEsper.g:593:2: ( ( rule__Timer__Group__0 ) )
            {
            // InternalEsper.g:593:2: ( ( rule__Timer__Group__0 ) )
            // InternalEsper.g:594:3: ( rule__Timer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerAccess().getGroup()); 
            }
            // InternalEsper.g:595:3: ( rule__Timer__Group__0 )
            // InternalEsper.g:595:4: rule__Timer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Timer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleGroupBy"
    // InternalEsper.g:604:1: entryRuleGroupBy : ruleGroupBy EOF ;
    public final void entryRuleGroupBy() throws RecognitionException {
        try {
            // InternalEsper.g:605:1: ( ruleGroupBy EOF )
            // InternalEsper.g:606:1: ruleGroupBy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroupBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupBy"


    // $ANTLR start "ruleGroupBy"
    // InternalEsper.g:613:1: ruleGroupBy : ( ( rule__GroupBy__Group__0 ) ) ;
    public final void ruleGroupBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:617:2: ( ( ( rule__GroupBy__Group__0 ) ) )
            // InternalEsper.g:618:2: ( ( rule__GroupBy__Group__0 ) )
            {
            // InternalEsper.g:618:2: ( ( rule__GroupBy__Group__0 ) )
            // InternalEsper.g:619:3: ( rule__GroupBy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByAccess().getGroup()); 
            }
            // InternalEsper.g:620:3: ( rule__GroupBy__Group__0 )
            // InternalEsper.g:620:4: rule__GroupBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupBy"


    // $ANTLR start "entryRuleHaving"
    // InternalEsper.g:629:1: entryRuleHaving : ruleHaving EOF ;
    public final void entryRuleHaving() throws RecognitionException {
        try {
            // InternalEsper.g:630:1: ( ruleHaving EOF )
            // InternalEsper.g:631:1: ruleHaving EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHaving();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHaving"


    // $ANTLR start "ruleHaving"
    // InternalEsper.g:638:1: ruleHaving : ( ( rule__Having__Group__0 ) ) ;
    public final void ruleHaving() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:642:2: ( ( ( rule__Having__Group__0 ) ) )
            // InternalEsper.g:643:2: ( ( rule__Having__Group__0 ) )
            {
            // InternalEsper.g:643:2: ( ( rule__Having__Group__0 ) )
            // InternalEsper.g:644:3: ( rule__Having__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getGroup()); 
            }
            // InternalEsper.g:645:3: ( rule__Having__Group__0 )
            // InternalEsper.g:645:4: rule__Having__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Having__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHaving"


    // $ANTLR start "entryRuleDefaultMethods"
    // InternalEsper.g:654:1: entryRuleDefaultMethods : ruleDefaultMethods EOF ;
    public final void entryRuleDefaultMethods() throws RecognitionException {
        try {
            // InternalEsper.g:655:1: ( ruleDefaultMethods EOF )
            // InternalEsper.g:656:1: ruleDefaultMethods EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultMethods"


    // $ANTLR start "ruleDefaultMethods"
    // InternalEsper.g:663:1: ruleDefaultMethods : ( ( rule__DefaultMethods__Group__0 ) ) ;
    public final void ruleDefaultMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:667:2: ( ( ( rule__DefaultMethods__Group__0 ) ) )
            // InternalEsper.g:668:2: ( ( rule__DefaultMethods__Group__0 ) )
            {
            // InternalEsper.g:668:2: ( ( rule__DefaultMethods__Group__0 ) )
            // InternalEsper.g:669:3: ( rule__DefaultMethods__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getGroup()); 
            }
            // InternalEsper.g:670:3: ( rule__DefaultMethods__Group__0 )
            // InternalEsper.g:670:4: rule__DefaultMethods__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultMethods"


    // $ANTLR start "entryRuleValidID"
    // InternalEsper.g:679:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalEsper.g:680:1: ( ruleValidID EOF )
            // InternalEsper.g:681:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalEsper.g:688:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:692:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalEsper.g:693:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalEsper.g:693:2: ( ( rule__ValidID__Alternatives ) )
            // InternalEsper.g:694:3: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // InternalEsper.g:695:3: ( rule__ValidID__Alternatives )
            // InternalEsper.g:695:4: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNameMethod"
    // InternalEsper.g:704:1: entryRuleNameMethod : ruleNameMethod EOF ;
    public final void entryRuleNameMethod() throws RecognitionException {
        try {
            // InternalEsper.g:705:1: ( ruleNameMethod EOF )
            // InternalEsper.g:706:1: ruleNameMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNameMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameMethod"


    // $ANTLR start "ruleNameMethod"
    // InternalEsper.g:713:1: ruleNameMethod : ( ( rule__NameMethod__Alternatives ) ) ;
    public final void ruleNameMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:717:2: ( ( ( rule__NameMethod__Alternatives ) ) )
            // InternalEsper.g:718:2: ( ( rule__NameMethod__Alternatives ) )
            {
            // InternalEsper.g:718:2: ( ( rule__NameMethod__Alternatives ) )
            // InternalEsper.g:719:3: ( rule__NameMethod__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameMethodAccess().getAlternatives()); 
            }
            // InternalEsper.g:720:3: ( rule__NameMethod__Alternatives )
            // InternalEsper.g:720:4: rule__NameMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NameMethod__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameMethodAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameMethod"


    // $ANTLR start "entryRuleAnything"
    // InternalEsper.g:729:1: entryRuleAnything : ruleAnything EOF ;
    public final void entryRuleAnything() throws RecognitionException {
        try {
            // InternalEsper.g:730:1: ( ruleAnything EOF )
            // InternalEsper.g:731:1: ruleAnything EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnything"


    // $ANTLR start "ruleAnything"
    // InternalEsper.g:738:1: ruleAnything : ( ( rule__Anything__Group__0 ) ) ;
    public final void ruleAnything() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:742:2: ( ( ( rule__Anything__Group__0 ) ) )
            // InternalEsper.g:743:2: ( ( rule__Anything__Group__0 ) )
            {
            // InternalEsper.g:743:2: ( ( rule__Anything__Group__0 ) )
            // InternalEsper.g:744:3: ( rule__Anything__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getGroup()); 
            }
            // InternalEsper.g:745:3: ( rule__Anything__Group__0 )
            // InternalEsper.g:745:4: rule__Anything__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Anything__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnything"


    // $ANTLR start "entryRuleExtraParenthesisRule"
    // InternalEsper.g:754:1: entryRuleExtraParenthesisRule : ruleExtraParenthesisRule EOF ;
    public final void entryRuleExtraParenthesisRule() throws RecognitionException {
        try {
            // InternalEsper.g:755:1: ( ruleExtraParenthesisRule EOF )
            // InternalEsper.g:756:1: ruleExtraParenthesisRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtraParenthesisRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtraParenthesisRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtraParenthesisRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtraParenthesisRule"


    // $ANTLR start "ruleExtraParenthesisRule"
    // InternalEsper.g:763:1: ruleExtraParenthesisRule : ( ( rule__ExtraParenthesisRule__Group__0 ) ) ;
    public final void ruleExtraParenthesisRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:767:2: ( ( ( rule__ExtraParenthesisRule__Group__0 ) ) )
            // InternalEsper.g:768:2: ( ( rule__ExtraParenthesisRule__Group__0 ) )
            {
            // InternalEsper.g:768:2: ( ( rule__ExtraParenthesisRule__Group__0 ) )
            // InternalEsper.g:769:3: ( rule__ExtraParenthesisRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtraParenthesisRuleAccess().getGroup()); 
            }
            // InternalEsper.g:770:3: ( rule__ExtraParenthesisRule__Group__0 )
            // InternalEsper.g:770:4: rule__ExtraParenthesisRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtraParenthesisRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtraParenthesisRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtraParenthesisRule"


    // $ANTLR start "ruleOperators"
    // InternalEsper.g:779:1: ruleOperators : ( ( rule__Operators__Alternatives ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:783:1: ( ( ( rule__Operators__Alternatives ) ) )
            // InternalEsper.g:784:2: ( ( rule__Operators__Alternatives ) )
            {
            // InternalEsper.g:784:2: ( ( rule__Operators__Alternatives ) )
            // InternalEsper.g:785:3: ( rule__Operators__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getAlternatives()); 
            }
            // InternalEsper.g:786:3: ( rule__Operators__Alternatives )
            // InternalEsper.g:786:4: rule__Operators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operators__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperators"


    // $ANTLR start "rule__Domainmodel__Alternatives"
    // InternalEsper.g:794:1: rule__Domainmodel__Alternatives : ( ( ( rule__Domainmodel__RulesAssignment_0 ) ) | ( ( rule__Domainmodel__EventsAssignment_1 ) ) );
    public final void rule__Domainmodel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:798:1: ( ( ( rule__Domainmodel__RulesAssignment_0 ) ) | ( ( rule__Domainmodel__EventsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEsper.g:799:2: ( ( rule__Domainmodel__RulesAssignment_0 ) )
                    {
                    // InternalEsper.g:799:2: ( ( rule__Domainmodel__RulesAssignment_0 ) )
                    // InternalEsper.g:800:3: ( rule__Domainmodel__RulesAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainmodelAccess().getRulesAssignment_0()); 
                    }
                    // InternalEsper.g:801:3: ( rule__Domainmodel__RulesAssignment_0 )
                    // InternalEsper.g:801:4: rule__Domainmodel__RulesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domainmodel__RulesAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainmodelAccess().getRulesAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:805:2: ( ( rule__Domainmodel__EventsAssignment_1 ) )
                    {
                    // InternalEsper.g:805:2: ( ( rule__Domainmodel__EventsAssignment_1 ) )
                    // InternalEsper.g:806:3: ( rule__Domainmodel__EventsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainmodelAccess().getEventsAssignment_1()); 
                    }
                    // InternalEsper.g:807:3: ( rule__Domainmodel__EventsAssignment_1 )
                    // InternalEsper.g:807:4: rule__Domainmodel__EventsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domainmodel__EventsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainmodelAccess().getEventsAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Alternatives"


    // $ANTLR start "rule__Select__Alternatives"
    // InternalEsper.g:815:1: rule__Select__Alternatives : ( ( ( rule__Select__Group_0__0 ) ) | ( ( rule__Select__AsteriskAssignment_1 ) ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:819:1: ( ( ( rule__Select__Group_0__0 ) ) | ( ( rule__Select__AsteriskAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsper.g:820:2: ( ( rule__Select__Group_0__0 ) )
                    {
                    // InternalEsper.g:820:2: ( ( rule__Select__Group_0__0 ) )
                    // InternalEsper.g:821:3: ( rule__Select__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectAccess().getGroup_0()); 
                    }
                    // InternalEsper.g:822:3: ( rule__Select__Group_0__0 )
                    // InternalEsper.g:822:4: rule__Select__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:826:2: ( ( rule__Select__AsteriskAssignment_1 ) )
                    {
                    // InternalEsper.g:826:2: ( ( rule__Select__AsteriskAssignment_1 ) )
                    // InternalEsper.g:827:3: ( rule__Select__AsteriskAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectAccess().getAsteriskAssignment_1()); 
                    }
                    // InternalEsper.g:828:3: ( rule__Select__AsteriskAssignment_1 )
                    // InternalEsper.g:828:4: rule__Select__AsteriskAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__AsteriskAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectAccess().getAsteriskAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Alternatives"


    // $ANTLR start "rule__KindSelectAttributesDefinition__Alternatives"
    // InternalEsper.g:836:1: rule__KindSelectAttributesDefinition__Alternatives : ( ( ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 ) ) | ( ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 ) ) | ( ( rule__KindSelectAttributesDefinition__IntAssignment_2 ) ) | ( ( rule__KindSelectAttributesDefinition__StringAssignment_3 ) ) );
    public final void rule__KindSelectAttributesDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:840:1: ( ( ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 ) ) | ( ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 ) ) | ( ( rule__KindSelectAttributesDefinition__IntAssignment_2 ) ) | ( ( rule__KindSelectAttributesDefinition__StringAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEsper.g:841:2: ( ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 ) )
                    {
                    // InternalEsper.g:841:2: ( ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 ) )
                    // InternalEsper.g:842:3: ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionAssignment_0()); 
                    }
                    // InternalEsper.g:843:3: ( rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 )
                    // InternalEsper.g:843:4: rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:847:2: ( ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 ) )
                    {
                    // InternalEsper.g:847:2: ( ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 ) )
                    // InternalEsper.g:848:3: ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodAssignment_1()); 
                    }
                    // InternalEsper.g:849:3: ( rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 )
                    // InternalEsper.g:849:4: rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:853:2: ( ( rule__KindSelectAttributesDefinition__IntAssignment_2 ) )
                    {
                    // InternalEsper.g:853:2: ( ( rule__KindSelectAttributesDefinition__IntAssignment_2 ) )
                    // InternalEsper.g:854:3: ( rule__KindSelectAttributesDefinition__IntAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKindSelectAttributesDefinitionAccess().getIntAssignment_2()); 
                    }
                    // InternalEsper.g:855:3: ( rule__KindSelectAttributesDefinition__IntAssignment_2 )
                    // InternalEsper.g:855:4: rule__KindSelectAttributesDefinition__IntAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__KindSelectAttributesDefinition__IntAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKindSelectAttributesDefinitionAccess().getIntAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:859:2: ( ( rule__KindSelectAttributesDefinition__StringAssignment_3 ) )
                    {
                    // InternalEsper.g:859:2: ( ( rule__KindSelectAttributesDefinition__StringAssignment_3 ) )
                    // InternalEsper.g:860:3: ( rule__KindSelectAttributesDefinition__StringAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKindSelectAttributesDefinitionAccess().getStringAssignment_3()); 
                    }
                    // InternalEsper.g:861:3: ( rule__KindSelectAttributesDefinition__StringAssignment_3 )
                    // InternalEsper.g:861:4: rule__KindSelectAttributesDefinition__StringAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__KindSelectAttributesDefinition__StringAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKindSelectAttributesDefinitionAccess().getStringAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindSelectAttributesDefinition__Alternatives"


    // $ANTLR start "rule__SingleSelectDefinition__Alternatives_2"
    // InternalEsper.g:869:1: rule__SingleSelectDefinition__Alternatives_2 : ( ( ( rule__SingleSelectDefinition__AttributeAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__SingleSelectDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:873:1: ( ( ( rule__SingleSelectDefinition__AttributeAssignment_2_0 ) ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEsper.g:874:2: ( ( rule__SingleSelectDefinition__AttributeAssignment_2_0 ) )
                    {
                    // InternalEsper.g:874:2: ( ( rule__SingleSelectDefinition__AttributeAssignment_2_0 ) )
                    // InternalEsper.g:875:3: ( rule__SingleSelectDefinition__AttributeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleSelectDefinitionAccess().getAttributeAssignment_2_0()); 
                    }
                    // InternalEsper.g:876:3: ( rule__SingleSelectDefinition__AttributeAssignment_2_0 )
                    // InternalEsper.g:876:4: rule__SingleSelectDefinition__AttributeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleSelectDefinition__AttributeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleSelectDefinitionAccess().getAttributeAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:880:2: ( '*' )
                    {
                    // InternalEsper.g:880:2: ( '*' )
                    // InternalEsper.g:881:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleSelectDefinitionAccess().getAsteriskKeyword_2_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleSelectDefinitionAccess().getAsteriskKeyword_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Alternatives_2"


    // $ANTLR start "rule__From__Alternatives_1"
    // InternalEsper.g:890:1: rule__From__Alternatives_1 : ( ( ( rule__From__Group_1_0__0 ) ) | ( ( rule__From__PatternAssignment_1_1 ) ) );
    public final void rule__From__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:894:1: ( ( ( rule__From__Group_1_0__0 ) ) | ( ( rule__From__PatternAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==48) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEsper.g:895:2: ( ( rule__From__Group_1_0__0 ) )
                    {
                    // InternalEsper.g:895:2: ( ( rule__From__Group_1_0__0 ) )
                    // InternalEsper.g:896:3: ( rule__From__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAccess().getGroup_1_0()); 
                    }
                    // InternalEsper.g:897:3: ( rule__From__Group_1_0__0 )
                    // InternalEsper.g:897:4: rule__From__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:901:2: ( ( rule__From__PatternAssignment_1_1 ) )
                    {
                    // InternalEsper.g:901:2: ( ( rule__From__PatternAssignment_1_1 ) )
                    // InternalEsper.g:902:3: ( rule__From__PatternAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAccess().getPatternAssignment_1_1()); 
                    }
                    // InternalEsper.g:903:3: ( rule__From__PatternAssignment_1_1 )
                    // InternalEsper.g:903:4: rule__From__PatternAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__PatternAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAccess().getPatternAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Alternatives_1"


    // $ANTLR start "rule__From__Alternatives_1_0_1"
    // InternalEsper.g:911:1: rule__From__Alternatives_1_0_1 : ( ( ( rule__From__Group_1_0_1_0__0 ) ) | ( ( rule__From__Group_1_0_1_1__0 ) ) );
    public final void rule__From__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:915:1: ( ( ( rule__From__Group_1_0_1_0__0 ) ) | ( ( rule__From__Group_1_0_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEsper.g:916:2: ( ( rule__From__Group_1_0_1_0__0 ) )
                    {
                    // InternalEsper.g:916:2: ( ( rule__From__Group_1_0_1_0__0 ) )
                    // InternalEsper.g:917:3: ( rule__From__Group_1_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAccess().getGroup_1_0_1_0()); 
                    }
                    // InternalEsper.g:918:3: ( rule__From__Group_1_0_1_0__0 )
                    // InternalEsper.g:918:4: rule__From__Group_1_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Group_1_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAccess().getGroup_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:922:2: ( ( rule__From__Group_1_0_1_1__0 ) )
                    {
                    // InternalEsper.g:922:2: ( ( rule__From__Group_1_0_1_1__0 ) )
                    // InternalEsper.g:923:3: ( rule__From__Group_1_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAccess().getGroup_1_0_1_1()); 
                    }
                    // InternalEsper.g:924:3: ( rule__From__Group_1_0_1_1__0 )
                    // InternalEsper.g:924:4: rule__From__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Group_1_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAccess().getGroup_1_0_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Alternatives_1_0_1"


    // $ANTLR start "rule__AbstractFollowBy__Alternatives_0"
    // InternalEsper.g:932:1: rule__AbstractFollowBy__Alternatives_0 : ( ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) ) | ( ( rule__AbstractFollowBy__Group_0_1__0 ) ) );
    public final void rule__AbstractFollowBy__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:936:1: ( ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) ) | ( ( rule__AbstractFollowBy__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==58) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                int LA8_2 = input.LA(2);

                if ( (synpred10_InternalEsper()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsper.g:937:2: ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) )
                    {
                    // InternalEsper.g:937:2: ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) )
                    // InternalEsper.g:938:3: ( rule__AbstractFollowBy__FollowByAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_0()); 
                    }
                    // InternalEsper.g:939:3: ( rule__AbstractFollowBy__FollowByAssignment_0_0 )
                    // InternalEsper.g:939:4: rule__AbstractFollowBy__FollowByAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractFollowBy__FollowByAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:943:2: ( ( rule__AbstractFollowBy__Group_0_1__0 ) )
                    {
                    // InternalEsper.g:943:2: ( ( rule__AbstractFollowBy__Group_0_1__0 ) )
                    // InternalEsper.g:944:3: ( rule__AbstractFollowBy__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractFollowByAccess().getGroup_0_1()); 
                    }
                    // InternalEsper.g:945:3: ( rule__AbstractFollowBy__Group_0_1__0 )
                    // InternalEsper.g:945:4: rule__AbstractFollowBy__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractFollowBy__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractFollowByAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Alternatives_0"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalEsper.g:953:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__SingleDefinitionAssignment_2 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:957:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__SingleDefinitionAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEsper.g:958:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalEsper.g:958:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalEsper.g:959:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalEsper.g:960:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalEsper.g:960:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:964:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalEsper.g:964:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalEsper.g:965:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalEsper.g:966:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalEsper.g:966:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:970:2: ( ( rule__TerminalExpression__SingleDefinitionAssignment_2 ) )
                    {
                    // InternalEsper.g:970:2: ( ( rule__TerminalExpression__SingleDefinitionAssignment_2 ) )
                    // InternalEsper.g:971:3: ( rule__TerminalExpression__SingleDefinitionAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionAssignment_2()); 
                    }
                    // InternalEsper.g:972:3: ( rule__TerminalExpression__SingleDefinitionAssignment_2 )
                    // InternalEsper.g:972:4: rule__TerminalExpression__SingleDefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__SingleDefinitionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__FollowByWhere__Alternatives"
    // InternalEsper.g:980:1: rule__FollowByWhere__Alternatives : ( ( ( rule__FollowByWhere__Group_0__0 ) ) | ( ( rule__FollowByWhere__Group_1__0 ) ) );
    public final void rule__FollowByWhere__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:984:1: ( ( ( rule__FollowByWhere__Group_0__0 ) ) | ( ( rule__FollowByWhere__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEsper.g:985:2: ( ( rule__FollowByWhere__Group_0__0 ) )
                    {
                    // InternalEsper.g:985:2: ( ( rule__FollowByWhere__Group_0__0 ) )
                    // InternalEsper.g:986:3: ( rule__FollowByWhere__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFollowByWhereAccess().getGroup_0()); 
                    }
                    // InternalEsper.g:987:3: ( rule__FollowByWhere__Group_0__0 )
                    // InternalEsper.g:987:4: rule__FollowByWhere__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FollowByWhere__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFollowByWhereAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:991:2: ( ( rule__FollowByWhere__Group_1__0 ) )
                    {
                    // InternalEsper.g:991:2: ( ( rule__FollowByWhere__Group_1__0 ) )
                    // InternalEsper.g:992:3: ( rule__FollowByWhere__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFollowByWhereAccess().getGroup_1()); 
                    }
                    // InternalEsper.g:993:3: ( rule__FollowByWhere__Group_1__0 )
                    // InternalEsper.g:993:4: rule__FollowByWhere__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FollowByWhere__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFollowByWhereAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalEsper.g:1001:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( ruleNameMethod ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1005:1: ( ( RULE_ID ) | ( ruleNameMethod ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=12 && LA11_0<=18)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEsper.g:1006:2: ( RULE_ID )
                    {
                    // InternalEsper.g:1006:2: ( RULE_ID )
                    // InternalEsper.g:1007:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1012:2: ( ruleNameMethod )
                    {
                    // InternalEsper.g:1012:2: ( ruleNameMethod )
                    // InternalEsper.g:1013:3: ruleNameMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getNameMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNameMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getNameMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__NameMethod__Alternatives"
    // InternalEsper.g:1022:1: rule__NameMethod__Alternatives : ( ( 'avg' ) | ( 'current_timestamp' ) | ( 'count' ) | ( 'max' ) | ( 'within' ) | ( 'time_batch' ) | ( 'time' ) );
    public final void rule__NameMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1026:1: ( ( 'avg' ) | ( 'current_timestamp' ) | ( 'count' ) | ( 'max' ) | ( 'within' ) | ( 'time_batch' ) | ( 'time' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt12=1;
                }
                break;
            case 13:
                {
                alt12=2;
                }
                break;
            case 14:
                {
                alt12=3;
                }
                break;
            case 15:
                {
                alt12=4;
                }
                break;
            case 16:
                {
                alt12=5;
                }
                break;
            case 17:
                {
                alt12=6;
                }
                break;
            case 18:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEsper.g:1027:2: ( 'avg' )
                    {
                    // InternalEsper.g:1027:2: ( 'avg' )
                    // InternalEsper.g:1028:3: 'avg'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getAvgKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getAvgKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1033:2: ( 'current_timestamp' )
                    {
                    // InternalEsper.g:1033:2: ( 'current_timestamp' )
                    // InternalEsper.g:1034:3: 'current_timestamp'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getCurrent_timestampKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getCurrent_timestampKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:1039:2: ( 'count' )
                    {
                    // InternalEsper.g:1039:2: ( 'count' )
                    // InternalEsper.g:1040:3: 'count'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getCountKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getCountKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:1045:2: ( 'max' )
                    {
                    // InternalEsper.g:1045:2: ( 'max' )
                    // InternalEsper.g:1046:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getMaxKeyword_3()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getMaxKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper.g:1051:2: ( 'within' )
                    {
                    // InternalEsper.g:1051:2: ( 'within' )
                    // InternalEsper.g:1052:3: 'within'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getWithinKeyword_4()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getWithinKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper.g:1057:2: ( 'time_batch' )
                    {
                    // InternalEsper.g:1057:2: ( 'time_batch' )
                    // InternalEsper.g:1058:3: 'time_batch'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getTime_batchKeyword_5()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getTime_batchKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsper.g:1063:2: ( 'time' )
                    {
                    // InternalEsper.g:1063:2: ( 'time' )
                    // InternalEsper.g:1064:3: 'time'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameMethodAccess().getTimeKeyword_6()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameMethodAccess().getTimeKeyword_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameMethod__Alternatives"


    // $ANTLR start "rule__Anything__Alternatives_1_0"
    // InternalEsper.g:1073:1: rule__Anything__Alternatives_1_0 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '.' ) | ( ( rule__Anything__OperatorAssignment_1_0_4 ) ) | ( ( rule__Anything__ExtraParenthesisAssignment_1_0_5 ) ) | ( 'where' ) | ( RULE_ANY_OTHER ) );
    public final void rule__Anything__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1077:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '.' ) | ( ( rule__Anything__OperatorAssignment_1_0_4 ) ) | ( ( rule__Anything__ExtraParenthesisAssignment_1_0_5 ) ) | ( 'where' ) | ( RULE_ANY_OTHER ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case 19:
                {
                alt13=4;
                }
                break;
            case 11:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt13=5;
                }
                break;
            case 38:
                {
                alt13=6;
                }
                break;
            case 20:
                {
                alt13=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEsper.g:1078:2: ( RULE_ID )
                    {
                    // InternalEsper.g:1078:2: ( RULE_ID )
                    // InternalEsper.g:1079:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1084:2: ( RULE_INT )
                    {
                    // InternalEsper.g:1084:2: ( RULE_INT )
                    // InternalEsper.g:1085:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getINTTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getINTTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:1090:2: ( RULE_STRING )
                    {
                    // InternalEsper.g:1090:2: ( RULE_STRING )
                    // InternalEsper.g:1091:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getSTRINGTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getSTRINGTerminalRuleCall_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:1096:2: ( '.' )
                    {
                    // InternalEsper.g:1096:2: ( '.' )
                    // InternalEsper.g:1097:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getFullStopKeyword_1_0_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getFullStopKeyword_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper.g:1102:2: ( ( rule__Anything__OperatorAssignment_1_0_4 ) )
                    {
                    // InternalEsper.g:1102:2: ( ( rule__Anything__OperatorAssignment_1_0_4 ) )
                    // InternalEsper.g:1103:3: ( rule__Anything__OperatorAssignment_1_0_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getOperatorAssignment_1_0_4()); 
                    }
                    // InternalEsper.g:1104:3: ( rule__Anything__OperatorAssignment_1_0_4 )
                    // InternalEsper.g:1104:4: rule__Anything__OperatorAssignment_1_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Anything__OperatorAssignment_1_0_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getOperatorAssignment_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper.g:1108:2: ( ( rule__Anything__ExtraParenthesisAssignment_1_0_5 ) )
                    {
                    // InternalEsper.g:1108:2: ( ( rule__Anything__ExtraParenthesisAssignment_1_0_5 ) )
                    // InternalEsper.g:1109:3: ( rule__Anything__ExtraParenthesisAssignment_1_0_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getExtraParenthesisAssignment_1_0_5()); 
                    }
                    // InternalEsper.g:1110:3: ( rule__Anything__ExtraParenthesisAssignment_1_0_5 )
                    // InternalEsper.g:1110:4: rule__Anything__ExtraParenthesisAssignment_1_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Anything__ExtraParenthesisAssignment_1_0_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getExtraParenthesisAssignment_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsper.g:1114:2: ( 'where' )
                    {
                    // InternalEsper.g:1114:2: ( 'where' )
                    // InternalEsper.g:1115:3: 'where'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getWhereKeyword_1_0_6()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getWhereKeyword_1_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEsper.g:1120:2: ( RULE_ANY_OTHER )
                    {
                    // InternalEsper.g:1120:2: ( RULE_ANY_OTHER )
                    // InternalEsper.g:1121:3: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnythingAccess().getANY_OTHERTerminalRuleCall_1_0_7()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnythingAccess().getANY_OTHERTerminalRuleCall_1_0_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Alternatives_1_0"


    // $ANTLR start "rule__Operators__Alternatives"
    // InternalEsper.g:1130:1: rule__Operators__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'between' ) ) | ( ( 'in' ) ) | ( ( 'not' ) ) | ( ( 'not in' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( 'is not' ) ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1134:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'between' ) ) | ( ( 'in' ) ) | ( ( 'not' ) ) | ( ( 'not in' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( 'is not' ) ) )
            int alt14=15;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            case 25:
                {
                alt14=5;
                }
                break;
            case 26:
                {
                alt14=6;
                }
                break;
            case 27:
                {
                alt14=7;
                }
                break;
            case 28:
                {
                alt14=8;
                }
                break;
            case 29:
                {
                alt14=9;
                }
                break;
            case 30:
                {
                alt14=10;
                }
                break;
            case 31:
                {
                alt14=11;
                }
                break;
            case 32:
                {
                alt14=12;
                }
                break;
            case 33:
                {
                alt14=13;
                }
                break;
            case 11:
                {
                alt14=14;
                }
                break;
            case 34:
                {
                alt14=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEsper.g:1135:2: ( ( '=' ) )
                    {
                    // InternalEsper.g:1135:2: ( ( '=' ) )
                    // InternalEsper.g:1136:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getEqualEnumLiteralDeclaration_0()); 
                    }
                    // InternalEsper.g:1137:3: ( '=' )
                    // InternalEsper.g:1137:4: '='
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getEqualEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper.g:1141:2: ( ( '<' ) )
                    {
                    // InternalEsper.g:1141:2: ( ( '<' ) )
                    // InternalEsper.g:1142:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getLessThanEnumLiteralDeclaration_1()); 
                    }
                    // InternalEsper.g:1143:3: ( '<' )
                    // InternalEsper.g:1143:4: '<'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getLessThanEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper.g:1147:2: ( ( '>' ) )
                    {
                    // InternalEsper.g:1147:2: ( ( '>' ) )
                    // InternalEsper.g:1148:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getMoreThanEnumLiteralDeclaration_2()); 
                    }
                    // InternalEsper.g:1149:3: ( '>' )
                    // InternalEsper.g:1149:4: '>'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getMoreThanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper.g:1153:2: ( ( '<=' ) )
                    {
                    // InternalEsper.g:1153:2: ( ( '<=' ) )
                    // InternalEsper.g:1154:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getLessEqualThanEnumLiteralDeclaration_3()); 
                    }
                    // InternalEsper.g:1155:3: ( '<=' )
                    // InternalEsper.g:1155:4: '<='
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getLessEqualThanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper.g:1159:2: ( ( '>=' ) )
                    {
                    // InternalEsper.g:1159:2: ( ( '>=' ) )
                    // InternalEsper.g:1160:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getMoreEqualThanEnumLiteralDeclaration_4()); 
                    }
                    // InternalEsper.g:1161:3: ( '>=' )
                    // InternalEsper.g:1161:4: '>='
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getMoreEqualThanEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper.g:1165:2: ( ( 'and' ) )
                    {
                    // InternalEsper.g:1165:2: ( ( 'and' ) )
                    // InternalEsper.g:1166:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getAndEnumLiteralDeclaration_5()); 
                    }
                    // InternalEsper.g:1167:3: ( 'and' )
                    // InternalEsper.g:1167:4: 'and'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getAndEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsper.g:1171:2: ( ( 'or' ) )
                    {
                    // InternalEsper.g:1171:2: ( ( 'or' ) )
                    // InternalEsper.g:1172:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getOrEnumLiteralDeclaration_6()); 
                    }
                    // InternalEsper.g:1173:3: ( 'or' )
                    // InternalEsper.g:1173:4: 'or'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getOrEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEsper.g:1177:2: ( ( 'between' ) )
                    {
                    // InternalEsper.g:1177:2: ( ( 'between' ) )
                    // InternalEsper.g:1178:3: ( 'between' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getBetweenEnumLiteralDeclaration_7()); 
                    }
                    // InternalEsper.g:1179:3: ( 'between' )
                    // InternalEsper.g:1179:4: 'between'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getBetweenEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEsper.g:1183:2: ( ( 'in' ) )
                    {
                    // InternalEsper.g:1183:2: ( ( 'in' ) )
                    // InternalEsper.g:1184:3: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getInEnumLiteralDeclaration_8()); 
                    }
                    // InternalEsper.g:1185:3: ( 'in' )
                    // InternalEsper.g:1185:4: 'in'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getInEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEsper.g:1189:2: ( ( 'not' ) )
                    {
                    // InternalEsper.g:1189:2: ( ( 'not' ) )
                    // InternalEsper.g:1190:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getNotEnumLiteralDeclaration_9()); 
                    }
                    // InternalEsper.g:1191:3: ( 'not' )
                    // InternalEsper.g:1191:4: 'not'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getNotEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEsper.g:1195:2: ( ( 'not in' ) )
                    {
                    // InternalEsper.g:1195:2: ( ( 'not in' ) )
                    // InternalEsper.g:1196:3: ( 'not in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getNotInEnumLiteralDeclaration_10()); 
                    }
                    // InternalEsper.g:1197:3: ( 'not in' )
                    // InternalEsper.g:1197:4: 'not in'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getNotInEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEsper.g:1201:2: ( ( '+' ) )
                    {
                    // InternalEsper.g:1201:2: ( ( '+' ) )
                    // InternalEsper.g:1202:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getPlusEnumLiteralDeclaration_11()); 
                    }
                    // InternalEsper.g:1203:3: ( '+' )
                    // InternalEsper.g:1203:4: '+'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getPlusEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalEsper.g:1207:2: ( ( '-' ) )
                    {
                    // InternalEsper.g:1207:2: ( ( '-' ) )
                    // InternalEsper.g:1208:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getMinusEnumLiteralDeclaration_12()); 
                    }
                    // InternalEsper.g:1209:3: ( '-' )
                    // InternalEsper.g:1209:4: '-'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getMinusEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalEsper.g:1213:2: ( ( '*' ) )
                    {
                    // InternalEsper.g:1213:2: ( ( '*' ) )
                    // InternalEsper.g:1214:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getMultiplicationEnumLiteralDeclaration_13()); 
                    }
                    // InternalEsper.g:1215:3: ( '*' )
                    // InternalEsper.g:1215:4: '*'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getMultiplicationEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalEsper.g:1219:2: ( ( 'is not' ) )
                    {
                    // InternalEsper.g:1219:2: ( ( 'is not' ) )
                    // InternalEsper.g:1220:3: ( 'is not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorsAccess().getIsnotEnumLiteralDeclaration_14()); 
                    }
                    // InternalEsper.g:1221:3: ( 'is not' )
                    // InternalEsper.g:1221:4: 'is not'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorsAccess().getIsnotEnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__Alternatives"


    // $ANTLR start "rule__Event__Group__0"
    // InternalEsper.g:1229:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1233:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalEsper.g:1234:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalEsper.g:1241:1: rule__Event__Group__0__Impl : ( 'create' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1245:1: ( ( 'create' ) )
            // InternalEsper.g:1246:1: ( 'create' )
            {
            // InternalEsper.g:1246:1: ( 'create' )
            // InternalEsper.g:1247:2: 'create'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCreateKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getCreateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalEsper.g:1256:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1260:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalEsper.g:1261:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalEsper.g:1268:1: rule__Event__Group__1__Impl : ( 'schema' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1272:1: ( ( 'schema' ) )
            // InternalEsper.g:1273:1: ( 'schema' )
            {
            // InternalEsper.g:1273:1: ( 'schema' )
            // InternalEsper.g:1274:2: 'schema'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getSchemaKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getSchemaKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalEsper.g:1283:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1287:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalEsper.g:1288:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalEsper.g:1295:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1299:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalEsper.g:1300:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalEsper.g:1300:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalEsper.g:1301:2: ( rule__Event__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            }
            // InternalEsper.g:1302:2: ( rule__Event__NameAssignment_2 )
            // InternalEsper.g:1302:3: rule__Event__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalEsper.g:1310:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1314:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalEsper.g:1315:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalEsper.g:1322:1: rule__Event__Group__3__Impl : ( ( rule__Event__EventattributesAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1326:1: ( ( ( rule__Event__EventattributesAssignment_3 ) ) )
            // InternalEsper.g:1327:1: ( ( rule__Event__EventattributesAssignment_3 ) )
            {
            // InternalEsper.g:1327:1: ( ( rule__Event__EventattributesAssignment_3 ) )
            // InternalEsper.g:1328:2: ( rule__Event__EventattributesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventattributesAssignment_3()); 
            }
            // InternalEsper.g:1329:2: ( rule__Event__EventattributesAssignment_3 )
            // InternalEsper.g:1329:3: rule__Event__EventattributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventattributesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventattributesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalEsper.g:1337:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1341:1: ( rule__Event__Group__4__Impl )
            // InternalEsper.g:1342:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalEsper.g:1348:1: rule__Event__Group__4__Impl : ( ';' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1352:1: ( ( ';' ) )
            // InternalEsper.g:1353:1: ( ';' )
            {
            // InternalEsper.g:1353:1: ( ';' )
            // InternalEsper.g:1354:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalEsper.g:1364:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1368:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalEsper.g:1369:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attributes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalEsper.g:1376:1: rule__Attributes__Group__0__Impl : ( '(' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1380:1: ( ( '(' ) )
            // InternalEsper.g:1381:1: ( '(' )
            {
            // InternalEsper.g:1381:1: ( '(' )
            // InternalEsper.g:1382:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalEsper.g:1391:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl rule__Attributes__Group__2 ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1395:1: ( rule__Attributes__Group__1__Impl rule__Attributes__Group__2 )
            // InternalEsper.g:1396:2: rule__Attributes__Group__1__Impl rule__Attributes__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attributes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalEsper.g:1403:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__AttributeAssignment_1 ) ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1407:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) )
            // InternalEsper.g:1408:1: ( ( rule__Attributes__AttributeAssignment_1 ) )
            {
            // InternalEsper.g:1408:1: ( ( rule__Attributes__AttributeAssignment_1 ) )
            // InternalEsper.g:1409:2: ( rule__Attributes__AttributeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            }
            // InternalEsper.g:1410:2: ( rule__Attributes__AttributeAssignment_1 )
            // InternalEsper.g:1410:3: rule__Attributes__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttributeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group__2"
    // InternalEsper.g:1418:1: rule__Attributes__Group__2 : rule__Attributes__Group__2__Impl rule__Attributes__Group__3 ;
    public final void rule__Attributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1422:1: ( rule__Attributes__Group__2__Impl rule__Attributes__Group__3 )
            // InternalEsper.g:1423:2: rule__Attributes__Group__2__Impl rule__Attributes__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Attributes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__2"


    // $ANTLR start "rule__Attributes__Group__2__Impl"
    // InternalEsper.g:1430:1: rule__Attributes__Group__2__Impl : ( ( rule__Attributes__Group_2__0 )* ) ;
    public final void rule__Attributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1434:1: ( ( ( rule__Attributes__Group_2__0 )* ) )
            // InternalEsper.g:1435:1: ( ( rule__Attributes__Group_2__0 )* )
            {
            // InternalEsper.g:1435:1: ( ( rule__Attributes__Group_2__0 )* )
            // InternalEsper.g:1436:2: ( rule__Attributes__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getGroup_2()); 
            }
            // InternalEsper.g:1437:2: ( rule__Attributes__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEsper.g:1437:3: rule__Attributes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Attributes__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__3"
    // InternalEsper.g:1445:1: rule__Attributes__Group__3 : rule__Attributes__Group__3__Impl ;
    public final void rule__Attributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1449:1: ( rule__Attributes__Group__3__Impl )
            // InternalEsper.g:1450:2: rule__Attributes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__3"


    // $ANTLR start "rule__Attributes__Group__3__Impl"
    // InternalEsper.g:1456:1: rule__Attributes__Group__3__Impl : ( ')' ) ;
    public final void rule__Attributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1460:1: ( ( ')' ) )
            // InternalEsper.g:1461:1: ( ')' )
            {
            // InternalEsper.g:1461:1: ( ')' )
            // InternalEsper.g:1462:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__3__Impl"


    // $ANTLR start "rule__Attributes__Group_2__0"
    // InternalEsper.g:1472:1: rule__Attributes__Group_2__0 : rule__Attributes__Group_2__0__Impl rule__Attributes__Group_2__1 ;
    public final void rule__Attributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1476:1: ( rule__Attributes__Group_2__0__Impl rule__Attributes__Group_2__1 )
            // InternalEsper.g:1477:2: rule__Attributes__Group_2__0__Impl rule__Attributes__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Attributes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_2__0"


    // $ANTLR start "rule__Attributes__Group_2__0__Impl"
    // InternalEsper.g:1484:1: rule__Attributes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1488:1: ( ( ',' ) )
            // InternalEsper.g:1489:1: ( ',' )
            {
            // InternalEsper.g:1489:1: ( ',' )
            // InternalEsper.g:1490:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getCommaKeyword_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_2__0__Impl"


    // $ANTLR start "rule__Attributes__Group_2__1"
    // InternalEsper.g:1499:1: rule__Attributes__Group_2__1 : rule__Attributes__Group_2__1__Impl ;
    public final void rule__Attributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1503:1: ( rule__Attributes__Group_2__1__Impl )
            // InternalEsper.g:1504:2: rule__Attributes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_2__1"


    // $ANTLR start "rule__Attributes__Group_2__1__Impl"
    // InternalEsper.g:1510:1: rule__Attributes__Group_2__1__Impl : ( ( rule__Attributes__AttributeAssignment_2_1 ) ) ;
    public final void rule__Attributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1514:1: ( ( ( rule__Attributes__AttributeAssignment_2_1 ) ) )
            // InternalEsper.g:1515:1: ( ( rule__Attributes__AttributeAssignment_2_1 ) )
            {
            // InternalEsper.g:1515:1: ( ( rule__Attributes__AttributeAssignment_2_1 ) )
            // InternalEsper.g:1516:2: ( rule__Attributes__AttributeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getAttributeAssignment_2_1()); 
            }
            // InternalEsper.g:1517:2: ( rule__Attributes__AttributeAssignment_2_1 )
            // InternalEsper.g:1517:3: rule__Attributes__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttributeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getAttributeAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_2__1__Impl"


    // $ANTLR start "rule__AttributesDefinition__Group__0"
    // InternalEsper.g:1526:1: rule__AttributesDefinition__Group__0 : rule__AttributesDefinition__Group__0__Impl rule__AttributesDefinition__Group__1 ;
    public final void rule__AttributesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1530:1: ( rule__AttributesDefinition__Group__0__Impl rule__AttributesDefinition__Group__1 )
            // InternalEsper.g:1531:2: rule__AttributesDefinition__Group__0__Impl rule__AttributesDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AttributesDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributesDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__Group__0"


    // $ANTLR start "rule__AttributesDefinition__Group__0__Impl"
    // InternalEsper.g:1538:1: rule__AttributesDefinition__Group__0__Impl : ( ( rule__AttributesDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1542:1: ( ( ( rule__AttributesDefinition__NameAssignment_0 ) ) )
            // InternalEsper.g:1543:1: ( ( rule__AttributesDefinition__NameAssignment_0 ) )
            {
            // InternalEsper.g:1543:1: ( ( rule__AttributesDefinition__NameAssignment_0 ) )
            // InternalEsper.g:1544:2: ( rule__AttributesDefinition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionAccess().getNameAssignment_0()); 
            }
            // InternalEsper.g:1545:2: ( rule__AttributesDefinition__NameAssignment_0 )
            // InternalEsper.g:1545:3: rule__AttributesDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributesDefinition__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__Group__0__Impl"


    // $ANTLR start "rule__AttributesDefinition__Group__1"
    // InternalEsper.g:1553:1: rule__AttributesDefinition__Group__1 : rule__AttributesDefinition__Group__1__Impl ;
    public final void rule__AttributesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1557:1: ( rule__AttributesDefinition__Group__1__Impl )
            // InternalEsper.g:1558:2: rule__AttributesDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributesDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__Group__1"


    // $ANTLR start "rule__AttributesDefinition__Group__1__Impl"
    // InternalEsper.g:1564:1: rule__AttributesDefinition__Group__1__Impl : ( ( rule__AttributesDefinition__TypeAssignment_1 ) ) ;
    public final void rule__AttributesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1568:1: ( ( ( rule__AttributesDefinition__TypeAssignment_1 ) ) )
            // InternalEsper.g:1569:1: ( ( rule__AttributesDefinition__TypeAssignment_1 ) )
            {
            // InternalEsper.g:1569:1: ( ( rule__AttributesDefinition__TypeAssignment_1 ) )
            // InternalEsper.g:1570:2: ( rule__AttributesDefinition__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionAccess().getTypeAssignment_1()); 
            }
            // InternalEsper.g:1571:2: ( rule__AttributesDefinition__TypeAssignment_1 )
            // InternalEsper.g:1571:3: rule__AttributesDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributesDefinition__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__Group__1__Impl"


    // $ANTLR start "rule__RuleParts__Group__0"
    // InternalEsper.g:1580:1: rule__RuleParts__Group__0 : rule__RuleParts__Group__0__Impl rule__RuleParts__Group__1 ;
    public final void rule__RuleParts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1584:1: ( rule__RuleParts__Group__0__Impl rule__RuleParts__Group__1 )
            // InternalEsper.g:1585:2: rule__RuleParts__Group__0__Impl rule__RuleParts__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RuleParts__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__0"


    // $ANTLR start "rule__RuleParts__Group__0__Impl"
    // InternalEsper.g:1592:1: rule__RuleParts__Group__0__Impl : ( ( rule__RuleParts__NameRuleAssignment_0 ) ) ;
    public final void rule__RuleParts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1596:1: ( ( ( rule__RuleParts__NameRuleAssignment_0 ) ) )
            // InternalEsper.g:1597:1: ( ( rule__RuleParts__NameRuleAssignment_0 ) )
            {
            // InternalEsper.g:1597:1: ( ( rule__RuleParts__NameRuleAssignment_0 ) )
            // InternalEsper.g:1598:2: ( rule__RuleParts__NameRuleAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getNameRuleAssignment_0()); 
            }
            // InternalEsper.g:1599:2: ( rule__RuleParts__NameRuleAssignment_0 )
            // InternalEsper.g:1599:3: rule__RuleParts__NameRuleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__NameRuleAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getNameRuleAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__0__Impl"


    // $ANTLR start "rule__RuleParts__Group__1"
    // InternalEsper.g:1607:1: rule__RuleParts__Group__1 : rule__RuleParts__Group__1__Impl rule__RuleParts__Group__2 ;
    public final void rule__RuleParts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1611:1: ( rule__RuleParts__Group__1__Impl rule__RuleParts__Group__2 )
            // InternalEsper.g:1612:2: rule__RuleParts__Group__1__Impl rule__RuleParts__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RuleParts__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__1"


    // $ANTLR start "rule__RuleParts__Group__1__Impl"
    // InternalEsper.g:1619:1: rule__RuleParts__Group__1__Impl : ( ( rule__RuleParts__InsertAssignment_1 ) ) ;
    public final void rule__RuleParts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1623:1: ( ( ( rule__RuleParts__InsertAssignment_1 ) ) )
            // InternalEsper.g:1624:1: ( ( rule__RuleParts__InsertAssignment_1 ) )
            {
            // InternalEsper.g:1624:1: ( ( rule__RuleParts__InsertAssignment_1 ) )
            // InternalEsper.g:1625:2: ( rule__RuleParts__InsertAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getInsertAssignment_1()); 
            }
            // InternalEsper.g:1626:2: ( rule__RuleParts__InsertAssignment_1 )
            // InternalEsper.g:1626:3: rule__RuleParts__InsertAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__InsertAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getInsertAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__1__Impl"


    // $ANTLR start "rule__RuleParts__Group__2"
    // InternalEsper.g:1634:1: rule__RuleParts__Group__2 : rule__RuleParts__Group__2__Impl rule__RuleParts__Group__3 ;
    public final void rule__RuleParts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1638:1: ( rule__RuleParts__Group__2__Impl rule__RuleParts__Group__3 )
            // InternalEsper.g:1639:2: rule__RuleParts__Group__2__Impl rule__RuleParts__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RuleParts__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__2"


    // $ANTLR start "rule__RuleParts__Group__2__Impl"
    // InternalEsper.g:1646:1: rule__RuleParts__Group__2__Impl : ( ( rule__RuleParts__PriorityAssignment_2 )? ) ;
    public final void rule__RuleParts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1650:1: ( ( ( rule__RuleParts__PriorityAssignment_2 )? ) )
            // InternalEsper.g:1651:1: ( ( rule__RuleParts__PriorityAssignment_2 )? )
            {
            // InternalEsper.g:1651:1: ( ( rule__RuleParts__PriorityAssignment_2 )? )
            // InternalEsper.g:1652:2: ( rule__RuleParts__PriorityAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getPriorityAssignment_2()); 
            }
            // InternalEsper.g:1653:2: ( rule__RuleParts__PriorityAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsper.g:1653:3: rule__RuleParts__PriorityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleParts__PriorityAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getPriorityAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__2__Impl"


    // $ANTLR start "rule__RuleParts__Group__3"
    // InternalEsper.g:1661:1: rule__RuleParts__Group__3 : rule__RuleParts__Group__3__Impl rule__RuleParts__Group__4 ;
    public final void rule__RuleParts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1665:1: ( rule__RuleParts__Group__3__Impl rule__RuleParts__Group__4 )
            // InternalEsper.g:1666:2: rule__RuleParts__Group__3__Impl rule__RuleParts__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RuleParts__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__3"


    // $ANTLR start "rule__RuleParts__Group__3__Impl"
    // InternalEsper.g:1673:1: rule__RuleParts__Group__3__Impl : ( ( rule__RuleParts__SelectRuleAssignment_3 ) ) ;
    public final void rule__RuleParts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1677:1: ( ( ( rule__RuleParts__SelectRuleAssignment_3 ) ) )
            // InternalEsper.g:1678:1: ( ( rule__RuleParts__SelectRuleAssignment_3 ) )
            {
            // InternalEsper.g:1678:1: ( ( rule__RuleParts__SelectRuleAssignment_3 ) )
            // InternalEsper.g:1679:2: ( rule__RuleParts__SelectRuleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getSelectRuleAssignment_3()); 
            }
            // InternalEsper.g:1680:2: ( rule__RuleParts__SelectRuleAssignment_3 )
            // InternalEsper.g:1680:3: rule__RuleParts__SelectRuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__SelectRuleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getSelectRuleAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__3__Impl"


    // $ANTLR start "rule__RuleParts__Group__4"
    // InternalEsper.g:1688:1: rule__RuleParts__Group__4 : rule__RuleParts__Group__4__Impl rule__RuleParts__Group__5 ;
    public final void rule__RuleParts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1692:1: ( rule__RuleParts__Group__4__Impl rule__RuleParts__Group__5 )
            // InternalEsper.g:1693:2: rule__RuleParts__Group__4__Impl rule__RuleParts__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RuleParts__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__4"


    // $ANTLR start "rule__RuleParts__Group__4__Impl"
    // InternalEsper.g:1700:1: rule__RuleParts__Group__4__Impl : ( ( rule__RuleParts__FromRuleAssignment_4 ) ) ;
    public final void rule__RuleParts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1704:1: ( ( ( rule__RuleParts__FromRuleAssignment_4 ) ) )
            // InternalEsper.g:1705:1: ( ( rule__RuleParts__FromRuleAssignment_4 ) )
            {
            // InternalEsper.g:1705:1: ( ( rule__RuleParts__FromRuleAssignment_4 ) )
            // InternalEsper.g:1706:2: ( rule__RuleParts__FromRuleAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getFromRuleAssignment_4()); 
            }
            // InternalEsper.g:1707:2: ( rule__RuleParts__FromRuleAssignment_4 )
            // InternalEsper.g:1707:3: rule__RuleParts__FromRuleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__FromRuleAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getFromRuleAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__4__Impl"


    // $ANTLR start "rule__RuleParts__Group__5"
    // InternalEsper.g:1715:1: rule__RuleParts__Group__5 : rule__RuleParts__Group__5__Impl rule__RuleParts__Group__6 ;
    public final void rule__RuleParts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1719:1: ( rule__RuleParts__Group__5__Impl rule__RuleParts__Group__6 )
            // InternalEsper.g:1720:2: rule__RuleParts__Group__5__Impl rule__RuleParts__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RuleParts__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__5"


    // $ANTLR start "rule__RuleParts__Group__5__Impl"
    // InternalEsper.g:1727:1: rule__RuleParts__Group__5__Impl : ( ( rule__RuleParts__GroupByAssignment_5 )? ) ;
    public final void rule__RuleParts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1731:1: ( ( ( rule__RuleParts__GroupByAssignment_5 )? ) )
            // InternalEsper.g:1732:1: ( ( rule__RuleParts__GroupByAssignment_5 )? )
            {
            // InternalEsper.g:1732:1: ( ( rule__RuleParts__GroupByAssignment_5 )? )
            // InternalEsper.g:1733:2: ( rule__RuleParts__GroupByAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getGroupByAssignment_5()); 
            }
            // InternalEsper.g:1734:2: ( rule__RuleParts__GroupByAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEsper.g:1734:3: rule__RuleParts__GroupByAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleParts__GroupByAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getGroupByAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__5__Impl"


    // $ANTLR start "rule__RuleParts__Group__6"
    // InternalEsper.g:1742:1: rule__RuleParts__Group__6 : rule__RuleParts__Group__6__Impl rule__RuleParts__Group__7 ;
    public final void rule__RuleParts__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1746:1: ( rule__RuleParts__Group__6__Impl rule__RuleParts__Group__7 )
            // InternalEsper.g:1747:2: rule__RuleParts__Group__6__Impl rule__RuleParts__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__RuleParts__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__6"


    // $ANTLR start "rule__RuleParts__Group__6__Impl"
    // InternalEsper.g:1754:1: rule__RuleParts__Group__6__Impl : ( ( rule__RuleParts__HavingAssignment_6 )? ) ;
    public final void rule__RuleParts__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1758:1: ( ( ( rule__RuleParts__HavingAssignment_6 )? ) )
            // InternalEsper.g:1759:1: ( ( rule__RuleParts__HavingAssignment_6 )? )
            {
            // InternalEsper.g:1759:1: ( ( rule__RuleParts__HavingAssignment_6 )? )
            // InternalEsper.g:1760:2: ( rule__RuleParts__HavingAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getHavingAssignment_6()); 
            }
            // InternalEsper.g:1761:2: ( rule__RuleParts__HavingAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==57) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEsper.g:1761:3: rule__RuleParts__HavingAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleParts__HavingAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getHavingAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__6__Impl"


    // $ANTLR start "rule__RuleParts__Group__7"
    // InternalEsper.g:1769:1: rule__RuleParts__Group__7 : rule__RuleParts__Group__7__Impl ;
    public final void rule__RuleParts__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1773:1: ( rule__RuleParts__Group__7__Impl )
            // InternalEsper.g:1774:2: rule__RuleParts__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleParts__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__7"


    // $ANTLR start "rule__RuleParts__Group__7__Impl"
    // InternalEsper.g:1780:1: rule__RuleParts__Group__7__Impl : ( ';' ) ;
    public final void rule__RuleParts__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1784:1: ( ( ';' ) )
            // InternalEsper.g:1785:1: ( ';' )
            {
            // InternalEsper.g:1785:1: ( ';' )
            // InternalEsper.g:1786:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getSemicolonKeyword_7()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__Group__7__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalEsper.g:1796:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1800:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalEsper.g:1801:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Insert__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalEsper.g:1808:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1812:1: ( ( 'insert' ) )
            // InternalEsper.g:1813:1: ( 'insert' )
            {
            // InternalEsper.g:1813:1: ( 'insert' )
            // InternalEsper.g:1814:2: 'insert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalEsper.g:1823:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1827:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalEsper.g:1828:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Insert__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalEsper.g:1835:1: rule__Insert__Group__1__Impl : ( 'into' ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1839:1: ( ( 'into' ) )
            // InternalEsper.g:1840:1: ( 'into' )
            {
            // InternalEsper.g:1840:1: ( 'into' )
            // InternalEsper.g:1841:2: 'into'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getIntoKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getIntoKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalEsper.g:1850:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1854:1: ( rule__Insert__Group__2__Impl )
            // InternalEsper.g:1855:2: rule__Insert__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalEsper.g:1861:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__NameAssignment_2 ) ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1865:1: ( ( ( rule__Insert__NameAssignment_2 ) ) )
            // InternalEsper.g:1866:1: ( ( rule__Insert__NameAssignment_2 ) )
            {
            // InternalEsper.g:1866:1: ( ( rule__Insert__NameAssignment_2 ) )
            // InternalEsper.g:1867:2: ( rule__Insert__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getNameAssignment_2()); 
            }
            // InternalEsper.g:1868:2: ( rule__Insert__NameAssignment_2 )
            // InternalEsper.g:1868:3: rule__Insert__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Insert__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalEsper.g:1877:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1881:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalEsper.g:1882:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalEsper.g:1889:1: rule__Name__Group__0__Impl : ( '@Name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1893:1: ( ( '@Name' ) )
            // InternalEsper.g:1894:1: ( '@Name' )
            {
            // InternalEsper.g:1894:1: ( '@Name' )
            // InternalEsper.g:1895:2: '@Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getNameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalEsper.g:1904:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1908:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalEsper.g:1909:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Name__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Name__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalEsper.g:1916:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1920:1: ( ( '(' ) )
            // InternalEsper.g:1921:1: ( '(' )
            {
            // InternalEsper.g:1921:1: ( '(' )
            // InternalEsper.g:1922:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__2"
    // InternalEsper.g:1931:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1935:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalEsper.g:1936:2: rule__Name__Group__2__Impl rule__Name__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Name__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Name__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2"


    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalEsper.g:1943:1: rule__Name__Group__2__Impl : ( ( rule__Name__NameAssignment_2 ) ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1947:1: ( ( ( rule__Name__NameAssignment_2 ) ) )
            // InternalEsper.g:1948:1: ( ( rule__Name__NameAssignment_2 ) )
            {
            // InternalEsper.g:1948:1: ( ( rule__Name__NameAssignment_2 ) )
            // InternalEsper.g:1949:2: ( rule__Name__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getNameAssignment_2()); 
            }
            // InternalEsper.g:1950:2: ( rule__Name__NameAssignment_2 )
            // InternalEsper.g:1950:3: rule__Name__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__3"
    // InternalEsper.g:1958:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1962:1: ( rule__Name__Group__3__Impl )
            // InternalEsper.g:1963:2: rule__Name__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__3"


    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalEsper.g:1969:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1973:1: ( ( ')' ) )
            // InternalEsper.g:1974:1: ( ')' )
            {
            // InternalEsper.g:1974:1: ( ')' )
            // InternalEsper.g:1975:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__3__Impl"


    // $ANTLR start "rule__Priority__Group__0"
    // InternalEsper.g:1985:1: rule__Priority__Group__0 : rule__Priority__Group__0__Impl rule__Priority__Group__1 ;
    public final void rule__Priority__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:1989:1: ( rule__Priority__Group__0__Impl rule__Priority__Group__1 )
            // InternalEsper.g:1990:2: rule__Priority__Group__0__Impl rule__Priority__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Priority__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Priority__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__0"


    // $ANTLR start "rule__Priority__Group__0__Impl"
    // InternalEsper.g:1997:1: rule__Priority__Group__0__Impl : ( '@Priority' ) ;
    public final void rule__Priority__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2001:1: ( ( '@Priority' ) )
            // InternalEsper.g:2002:1: ( '@Priority' )
            {
            // InternalEsper.g:2002:1: ( '@Priority' )
            // InternalEsper.g:2003:2: '@Priority'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getPriorityKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getPriorityKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__0__Impl"


    // $ANTLR start "rule__Priority__Group__1"
    // InternalEsper.g:2012:1: rule__Priority__Group__1 : rule__Priority__Group__1__Impl rule__Priority__Group__2 ;
    public final void rule__Priority__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2016:1: ( rule__Priority__Group__1__Impl rule__Priority__Group__2 )
            // InternalEsper.g:2017:2: rule__Priority__Group__1__Impl rule__Priority__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Priority__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Priority__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__1"


    // $ANTLR start "rule__Priority__Group__1__Impl"
    // InternalEsper.g:2024:1: rule__Priority__Group__1__Impl : ( '(' ) ;
    public final void rule__Priority__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2028:1: ( ( '(' ) )
            // InternalEsper.g:2029:1: ( '(' )
            {
            // InternalEsper.g:2029:1: ( '(' )
            // InternalEsper.g:2030:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__1__Impl"


    // $ANTLR start "rule__Priority__Group__2"
    // InternalEsper.g:2039:1: rule__Priority__Group__2 : rule__Priority__Group__2__Impl rule__Priority__Group__3 ;
    public final void rule__Priority__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2043:1: ( rule__Priority__Group__2__Impl rule__Priority__Group__3 )
            // InternalEsper.g:2044:2: rule__Priority__Group__2__Impl rule__Priority__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Priority__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Priority__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__2"


    // $ANTLR start "rule__Priority__Group__2__Impl"
    // InternalEsper.g:2051:1: rule__Priority__Group__2__Impl : ( ( rule__Priority__PriorityIntAssignment_2 ) ) ;
    public final void rule__Priority__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2055:1: ( ( ( rule__Priority__PriorityIntAssignment_2 ) ) )
            // InternalEsper.g:2056:1: ( ( rule__Priority__PriorityIntAssignment_2 ) )
            {
            // InternalEsper.g:2056:1: ( ( rule__Priority__PriorityIntAssignment_2 ) )
            // InternalEsper.g:2057:2: ( rule__Priority__PriorityIntAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getPriorityIntAssignment_2()); 
            }
            // InternalEsper.g:2058:2: ( rule__Priority__PriorityIntAssignment_2 )
            // InternalEsper.g:2058:3: rule__Priority__PriorityIntAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Priority__PriorityIntAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getPriorityIntAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__2__Impl"


    // $ANTLR start "rule__Priority__Group__3"
    // InternalEsper.g:2066:1: rule__Priority__Group__3 : rule__Priority__Group__3__Impl ;
    public final void rule__Priority__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2070:1: ( rule__Priority__Group__3__Impl )
            // InternalEsper.g:2071:2: rule__Priority__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Priority__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__3"


    // $ANTLR start "rule__Priority__Group__3__Impl"
    // InternalEsper.g:2077:1: rule__Priority__Group__3__Impl : ( ')' ) ;
    public final void rule__Priority__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2081:1: ( ( ')' ) )
            // InternalEsper.g:2082:1: ( ')' )
            {
            // InternalEsper.g:2082:1: ( ')' )
            // InternalEsper.g:2083:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__Group__3__Impl"


    // $ANTLR start "rule__Select__Group_0__0"
    // InternalEsper.g:2093:1: rule__Select__Group_0__0 : rule__Select__Group_0__0__Impl rule__Select__Group_0__1 ;
    public final void rule__Select__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2097:1: ( rule__Select__Group_0__0__Impl rule__Select__Group_0__1 )
            // InternalEsper.g:2098:2: rule__Select__Group_0__0__Impl rule__Select__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Select__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__0"


    // $ANTLR start "rule__Select__Group_0__0__Impl"
    // InternalEsper.g:2105:1: rule__Select__Group_0__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2109:1: ( ( 'select' ) )
            // InternalEsper.g:2110:1: ( 'select' )
            {
            // InternalEsper.g:2110:1: ( 'select' )
            // InternalEsper.g:2111:2: 'select'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectKeyword_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__0__Impl"


    // $ANTLR start "rule__Select__Group_0__1"
    // InternalEsper.g:2120:1: rule__Select__Group_0__1 : rule__Select__Group_0__1__Impl rule__Select__Group_0__2 ;
    public final void rule__Select__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2124:1: ( rule__Select__Group_0__1__Impl rule__Select__Group_0__2 )
            // InternalEsper.g:2125:2: rule__Select__Group_0__1__Impl rule__Select__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Select__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__1"


    // $ANTLR start "rule__Select__Group_0__1__Impl"
    // InternalEsper.g:2132:1: rule__Select__Group_0__1__Impl : ( ( ( rule__Select__Group_0_1__0 ) ) ( ( rule__Select__Group_0_1__0 )* ) ) ;
    public final void rule__Select__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2136:1: ( ( ( ( rule__Select__Group_0_1__0 ) ) ( ( rule__Select__Group_0_1__0 )* ) ) )
            // InternalEsper.g:2137:1: ( ( ( rule__Select__Group_0_1__0 ) ) ( ( rule__Select__Group_0_1__0 )* ) )
            {
            // InternalEsper.g:2137:1: ( ( ( rule__Select__Group_0_1__0 ) ) ( ( rule__Select__Group_0_1__0 )* ) )
            // InternalEsper.g:2138:2: ( ( rule__Select__Group_0_1__0 ) ) ( ( rule__Select__Group_0_1__0 )* )
            {
            // InternalEsper.g:2138:2: ( ( rule__Select__Group_0_1__0 ) )
            // InternalEsper.g:2139:3: ( rule__Select__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_0_1()); 
            }
            // InternalEsper.g:2140:3: ( rule__Select__Group_0_1__0 )
            // InternalEsper.g:2140:4: rule__Select__Group_0_1__0
            {
            pushFollow(FOLLOW_20);
            rule__Select__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_0_1()); 
            }

            }

            // InternalEsper.g:2143:2: ( ( rule__Select__Group_0_1__0 )* )
            // InternalEsper.g:2144:3: ( rule__Select__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_0_1()); 
            }
            // InternalEsper.g:2145:3: ( rule__Select__Group_0_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=12 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEsper.g:2145:4: rule__Select__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Select__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_0_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__1__Impl"


    // $ANTLR start "rule__Select__Group_0__2"
    // InternalEsper.g:2154:1: rule__Select__Group_0__2 : rule__Select__Group_0__2__Impl ;
    public final void rule__Select__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2158:1: ( rule__Select__Group_0__2__Impl )
            // InternalEsper.g:2159:2: rule__Select__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__2"


    // $ANTLR start "rule__Select__Group_0__2__Impl"
    // InternalEsper.g:2165:1: rule__Select__Group_0__2__Impl : ( ( rule__Select__Group_0_2__0 )* ) ;
    public final void rule__Select__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2169:1: ( ( ( rule__Select__Group_0_2__0 )* ) )
            // InternalEsper.g:2170:1: ( ( rule__Select__Group_0_2__0 )* )
            {
            // InternalEsper.g:2170:1: ( ( rule__Select__Group_0_2__0 )* )
            // InternalEsper.g:2171:2: ( rule__Select__Group_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_0_2()); 
            }
            // InternalEsper.g:2172:2: ( rule__Select__Group_0_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEsper.g:2172:3: rule__Select__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Select__Group_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0__2__Impl"


    // $ANTLR start "rule__Select__Group_0_1__0"
    // InternalEsper.g:2181:1: rule__Select__Group_0_1__0 : rule__Select__Group_0_1__0__Impl rule__Select__Group_0_1__1 ;
    public final void rule__Select__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2185:1: ( rule__Select__Group_0_1__0__Impl rule__Select__Group_0_1__1 )
            // InternalEsper.g:2186:2: rule__Select__Group_0_1__0__Impl rule__Select__Group_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Select__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1__0"


    // $ANTLR start "rule__Select__Group_0_1__0__Impl"
    // InternalEsper.g:2193:1: rule__Select__Group_0_1__0__Impl : ( ( rule__Select__SelectAttributesAssignment_0_1_0 ) ) ;
    public final void rule__Select__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2197:1: ( ( ( rule__Select__SelectAttributesAssignment_0_1_0 ) ) )
            // InternalEsper.g:2198:1: ( ( rule__Select__SelectAttributesAssignment_0_1_0 ) )
            {
            // InternalEsper.g:2198:1: ( ( rule__Select__SelectAttributesAssignment_0_1_0 ) )
            // InternalEsper.g:2199:2: ( rule__Select__SelectAttributesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_1_0()); 
            }
            // InternalEsper.g:2200:2: ( rule__Select__SelectAttributesAssignment_0_1_0 )
            // InternalEsper.g:2200:3: rule__Select__SelectAttributesAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectAttributesAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1__0__Impl"


    // $ANTLR start "rule__Select__Group_0_1__1"
    // InternalEsper.g:2208:1: rule__Select__Group_0_1__1 : rule__Select__Group_0_1__1__Impl ;
    public final void rule__Select__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2212:1: ( rule__Select__Group_0_1__1__Impl )
            // InternalEsper.g:2213:2: rule__Select__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1__1"


    // $ANTLR start "rule__Select__Group_0_1__1__Impl"
    // InternalEsper.g:2219:1: rule__Select__Group_0_1__1__Impl : ( ( rule__Select__Group_0_1_1__0 )? ) ;
    public final void rule__Select__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2223:1: ( ( ( rule__Select__Group_0_1_1__0 )? ) )
            // InternalEsper.g:2224:1: ( ( rule__Select__Group_0_1_1__0 )? )
            {
            // InternalEsper.g:2224:1: ( ( rule__Select__Group_0_1_1__0 )? )
            // InternalEsper.g:2225:2: ( rule__Select__Group_0_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_0_1_1()); 
            }
            // InternalEsper.g:2226:2: ( rule__Select__Group_0_1_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEsper.g:2226:3: rule__Select__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1__1__Impl"


    // $ANTLR start "rule__Select__Group_0_1_1__0"
    // InternalEsper.g:2235:1: rule__Select__Group_0_1_1__0 : rule__Select__Group_0_1_1__0__Impl rule__Select__Group_0_1_1__1 ;
    public final void rule__Select__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2239:1: ( rule__Select__Group_0_1_1__0__Impl rule__Select__Group_0_1_1__1 )
            // InternalEsper.g:2240:2: rule__Select__Group_0_1_1__0__Impl rule__Select__Group_0_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Select__Group_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1_1__0"


    // $ANTLR start "rule__Select__Group_0_1_1__0__Impl"
    // InternalEsper.g:2247:1: rule__Select__Group_0_1_1__0__Impl : ( 'as' ) ;
    public final void rule__Select__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2251:1: ( ( 'as' ) )
            // InternalEsper.g:2252:1: ( 'as' )
            {
            // InternalEsper.g:2252:1: ( 'as' )
            // InternalEsper.g:2253:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAsKeyword_0_1_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAsKeyword_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__Select__Group_0_1_1__1"
    // InternalEsper.g:2262:1: rule__Select__Group_0_1_1__1 : rule__Select__Group_0_1_1__1__Impl ;
    public final void rule__Select__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2266:1: ( rule__Select__Group_0_1_1__1__Impl )
            // InternalEsper.g:2267:2: rule__Select__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1_1__1"


    // $ANTLR start "rule__Select__Group_0_1_1__1__Impl"
    // InternalEsper.g:2273:1: rule__Select__Group_0_1_1__1__Impl : ( ( rule__Select__AliasAssignment_0_1_1_1 ) ) ;
    public final void rule__Select__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2277:1: ( ( ( rule__Select__AliasAssignment_0_1_1_1 ) ) )
            // InternalEsper.g:2278:1: ( ( rule__Select__AliasAssignment_0_1_1_1 ) )
            {
            // InternalEsper.g:2278:1: ( ( rule__Select__AliasAssignment_0_1_1_1 ) )
            // InternalEsper.g:2279:2: ( rule__Select__AliasAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAliasAssignment_0_1_1_1()); 
            }
            // InternalEsper.g:2280:2: ( rule__Select__AliasAssignment_0_1_1_1 )
            // InternalEsper.g:2280:3: rule__Select__AliasAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__AliasAssignment_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAliasAssignment_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__Select__Group_0_2__0"
    // InternalEsper.g:2289:1: rule__Select__Group_0_2__0 : rule__Select__Group_0_2__0__Impl rule__Select__Group_0_2__1 ;
    public final void rule__Select__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2293:1: ( rule__Select__Group_0_2__0__Impl rule__Select__Group_0_2__1 )
            // InternalEsper.g:2294:2: rule__Select__Group_0_2__0__Impl rule__Select__Group_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Select__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__0"


    // $ANTLR start "rule__Select__Group_0_2__0__Impl"
    // InternalEsper.g:2301:1: rule__Select__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2305:1: ( ( ',' ) )
            // InternalEsper.g:2306:1: ( ',' )
            {
            // InternalEsper.g:2306:1: ( ',' )
            // InternalEsper.g:2307:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getCommaKeyword_0_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getCommaKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__0__Impl"


    // $ANTLR start "rule__Select__Group_0_2__1"
    // InternalEsper.g:2316:1: rule__Select__Group_0_2__1 : rule__Select__Group_0_2__1__Impl rule__Select__Group_0_2__2 ;
    public final void rule__Select__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2320:1: ( rule__Select__Group_0_2__1__Impl rule__Select__Group_0_2__2 )
            // InternalEsper.g:2321:2: rule__Select__Group_0_2__1__Impl rule__Select__Group_0_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Select__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__1"


    // $ANTLR start "rule__Select__Group_0_2__1__Impl"
    // InternalEsper.g:2328:1: rule__Select__Group_0_2__1__Impl : ( ( rule__Select__SelectAttributesAssignment_0_2_1 ) ) ;
    public final void rule__Select__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2332:1: ( ( ( rule__Select__SelectAttributesAssignment_0_2_1 ) ) )
            // InternalEsper.g:2333:1: ( ( rule__Select__SelectAttributesAssignment_0_2_1 ) )
            {
            // InternalEsper.g:2333:1: ( ( rule__Select__SelectAttributesAssignment_0_2_1 ) )
            // InternalEsper.g:2334:2: ( rule__Select__SelectAttributesAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_2_1()); 
            }
            // InternalEsper.g:2335:2: ( rule__Select__SelectAttributesAssignment_0_2_1 )
            // InternalEsper.g:2335:3: rule__Select__SelectAttributesAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectAttributesAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectAttributesAssignment_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__1__Impl"


    // $ANTLR start "rule__Select__Group_0_2__2"
    // InternalEsper.g:2343:1: rule__Select__Group_0_2__2 : rule__Select__Group_0_2__2__Impl ;
    public final void rule__Select__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2347:1: ( rule__Select__Group_0_2__2__Impl )
            // InternalEsper.g:2348:2: rule__Select__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__2"


    // $ANTLR start "rule__Select__Group_0_2__2__Impl"
    // InternalEsper.g:2354:1: rule__Select__Group_0_2__2__Impl : ( ( rule__Select__Group_0_2_2__0 )? ) ;
    public final void rule__Select__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2358:1: ( ( ( rule__Select__Group_0_2_2__0 )? ) )
            // InternalEsper.g:2359:1: ( ( rule__Select__Group_0_2_2__0 )? )
            {
            // InternalEsper.g:2359:1: ( ( rule__Select__Group_0_2_2__0 )? )
            // InternalEsper.g:2360:2: ( rule__Select__Group_0_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_0_2_2()); 
            }
            // InternalEsper.g:2361:2: ( rule__Select__Group_0_2_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEsper.g:2361:3: rule__Select__Group_0_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_0_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_0_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2__2__Impl"


    // $ANTLR start "rule__Select__Group_0_2_2__0"
    // InternalEsper.g:2370:1: rule__Select__Group_0_2_2__0 : rule__Select__Group_0_2_2__0__Impl rule__Select__Group_0_2_2__1 ;
    public final void rule__Select__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2374:1: ( rule__Select__Group_0_2_2__0__Impl rule__Select__Group_0_2_2__1 )
            // InternalEsper.g:2375:2: rule__Select__Group_0_2_2__0__Impl rule__Select__Group_0_2_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Select__Group_0_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2_2__0"


    // $ANTLR start "rule__Select__Group_0_2_2__0__Impl"
    // InternalEsper.g:2382:1: rule__Select__Group_0_2_2__0__Impl : ( 'as' ) ;
    public final void rule__Select__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2386:1: ( ( 'as' ) )
            // InternalEsper.g:2387:1: ( 'as' )
            {
            // InternalEsper.g:2387:1: ( 'as' )
            // InternalEsper.g:2388:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAsKeyword_0_2_2_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAsKeyword_0_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2_2__0__Impl"


    // $ANTLR start "rule__Select__Group_0_2_2__1"
    // InternalEsper.g:2397:1: rule__Select__Group_0_2_2__1 : rule__Select__Group_0_2_2__1__Impl ;
    public final void rule__Select__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2401:1: ( rule__Select__Group_0_2_2__1__Impl )
            // InternalEsper.g:2402:2: rule__Select__Group_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_0_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2_2__1"


    // $ANTLR start "rule__Select__Group_0_2_2__1__Impl"
    // InternalEsper.g:2408:1: rule__Select__Group_0_2_2__1__Impl : ( ( rule__Select__AliasAssignment_0_2_2_1 ) ) ;
    public final void rule__Select__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2412:1: ( ( ( rule__Select__AliasAssignment_0_2_2_1 ) ) )
            // InternalEsper.g:2413:1: ( ( rule__Select__AliasAssignment_0_2_2_1 ) )
            {
            // InternalEsper.g:2413:1: ( ( rule__Select__AliasAssignment_0_2_2_1 ) )
            // InternalEsper.g:2414:2: ( rule__Select__AliasAssignment_0_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAliasAssignment_0_2_2_1()); 
            }
            // InternalEsper.g:2415:2: ( rule__Select__AliasAssignment_0_2_2_1 )
            // InternalEsper.g:2415:3: rule__Select__AliasAssignment_0_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__AliasAssignment_0_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAliasAssignment_0_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_0_2_2__1__Impl"


    // $ANTLR start "rule__SelectAttributesDefinition__Group__0"
    // InternalEsper.g:2424:1: rule__SelectAttributesDefinition__Group__0 : rule__SelectAttributesDefinition__Group__0__Impl rule__SelectAttributesDefinition__Group__1 ;
    public final void rule__SelectAttributesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2428:1: ( rule__SelectAttributesDefinition__Group__0__Impl rule__SelectAttributesDefinition__Group__1 )
            // InternalEsper.g:2429:2: rule__SelectAttributesDefinition__Group__0__Impl rule__SelectAttributesDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SelectAttributesDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group__0"


    // $ANTLR start "rule__SelectAttributesDefinition__Group__0__Impl"
    // InternalEsper.g:2436:1: rule__SelectAttributesDefinition__Group__0__Impl : ( ( rule__SelectAttributesDefinition__RightSideAssignment_0 ) ) ;
    public final void rule__SelectAttributesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2440:1: ( ( ( rule__SelectAttributesDefinition__RightSideAssignment_0 ) ) )
            // InternalEsper.g:2441:1: ( ( rule__SelectAttributesDefinition__RightSideAssignment_0 ) )
            {
            // InternalEsper.g:2441:1: ( ( rule__SelectAttributesDefinition__RightSideAssignment_0 ) )
            // InternalEsper.g:2442:2: ( rule__SelectAttributesDefinition__RightSideAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideAssignment_0()); 
            }
            // InternalEsper.g:2443:2: ( rule__SelectAttributesDefinition__RightSideAssignment_0 )
            // InternalEsper.g:2443:3: rule__SelectAttributesDefinition__RightSideAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__RightSideAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group__0__Impl"


    // $ANTLR start "rule__SelectAttributesDefinition__Group__1"
    // InternalEsper.g:2451:1: rule__SelectAttributesDefinition__Group__1 : rule__SelectAttributesDefinition__Group__1__Impl ;
    public final void rule__SelectAttributesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2455:1: ( rule__SelectAttributesDefinition__Group__1__Impl )
            // InternalEsper.g:2456:2: rule__SelectAttributesDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group__1"


    // $ANTLR start "rule__SelectAttributesDefinition__Group__1__Impl"
    // InternalEsper.g:2462:1: rule__SelectAttributesDefinition__Group__1__Impl : ( ( rule__SelectAttributesDefinition__Group_1__0 )* ) ;
    public final void rule__SelectAttributesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2466:1: ( ( ( rule__SelectAttributesDefinition__Group_1__0 )* ) )
            // InternalEsper.g:2467:1: ( ( rule__SelectAttributesDefinition__Group_1__0 )* )
            {
            // InternalEsper.g:2467:1: ( ( rule__SelectAttributesDefinition__Group_1__0 )* )
            // InternalEsper.g:2468:2: ( rule__SelectAttributesDefinition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getGroup_1()); 
            }
            // InternalEsper.g:2469:2: ( rule__SelectAttributesDefinition__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==11||(LA23_0>=21 && LA23_0<=34)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEsper.g:2469:3: rule__SelectAttributesDefinition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SelectAttributesDefinition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group__1__Impl"


    // $ANTLR start "rule__SelectAttributesDefinition__Group_1__0"
    // InternalEsper.g:2478:1: rule__SelectAttributesDefinition__Group_1__0 : rule__SelectAttributesDefinition__Group_1__0__Impl rule__SelectAttributesDefinition__Group_1__1 ;
    public final void rule__SelectAttributesDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2482:1: ( rule__SelectAttributesDefinition__Group_1__0__Impl rule__SelectAttributesDefinition__Group_1__1 )
            // InternalEsper.g:2483:2: rule__SelectAttributesDefinition__Group_1__0__Impl rule__SelectAttributesDefinition__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SelectAttributesDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group_1__0"


    // $ANTLR start "rule__SelectAttributesDefinition__Group_1__0__Impl"
    // InternalEsper.g:2490:1: rule__SelectAttributesDefinition__Group_1__0__Impl : ( ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 ) ) ;
    public final void rule__SelectAttributesDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2494:1: ( ( ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 ) ) )
            // InternalEsper.g:2495:1: ( ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 ) )
            {
            // InternalEsper.g:2495:1: ( ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 ) )
            // InternalEsper.g:2496:2: ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorAssignment_1_0()); 
            }
            // InternalEsper.g:2497:2: ( rule__SelectAttributesDefinition__OperatorAssignment_1_0 )
            // InternalEsper.g:2497:3: rule__SelectAttributesDefinition__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__OperatorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__SelectAttributesDefinition__Group_1__1"
    // InternalEsper.g:2505:1: rule__SelectAttributesDefinition__Group_1__1 : rule__SelectAttributesDefinition__Group_1__1__Impl ;
    public final void rule__SelectAttributesDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2509:1: ( rule__SelectAttributesDefinition__Group_1__1__Impl )
            // InternalEsper.g:2510:2: rule__SelectAttributesDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group_1__1"


    // $ANTLR start "rule__SelectAttributesDefinition__Group_1__1__Impl"
    // InternalEsper.g:2516:1: rule__SelectAttributesDefinition__Group_1__1__Impl : ( ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 ) ) ;
    public final void rule__SelectAttributesDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2520:1: ( ( ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 ) ) )
            // InternalEsper.g:2521:1: ( ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 ) )
            {
            // InternalEsper.g:2521:1: ( ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 ) )
            // InternalEsper.g:2522:2: ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideAssignment_1_1()); 
            }
            // InternalEsper.g:2523:2: ( rule__SelectAttributesDefinition__LeftSideAssignment_1_1 )
            // InternalEsper.g:2523:3: rule__SelectAttributesDefinition__LeftSideAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectAttributesDefinition__LeftSideAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__SingleSelectDefinition__Group__0"
    // InternalEsper.g:2532:1: rule__SingleSelectDefinition__Group__0 : rule__SingleSelectDefinition__Group__0__Impl rule__SingleSelectDefinition__Group__1 ;
    public final void rule__SingleSelectDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2536:1: ( rule__SingleSelectDefinition__Group__0__Impl rule__SingleSelectDefinition__Group__1 )
            // InternalEsper.g:2537:2: rule__SingleSelectDefinition__Group__0__Impl rule__SingleSelectDefinition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SingleSelectDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__0"


    // $ANTLR start "rule__SingleSelectDefinition__Group__0__Impl"
    // InternalEsper.g:2544:1: rule__SingleSelectDefinition__Group__0__Impl : ( ( rule__SingleSelectDefinition__EventAssignment_0 ) ) ;
    public final void rule__SingleSelectDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2548:1: ( ( ( rule__SingleSelectDefinition__EventAssignment_0 ) ) )
            // InternalEsper.g:2549:1: ( ( rule__SingleSelectDefinition__EventAssignment_0 ) )
            {
            // InternalEsper.g:2549:1: ( ( rule__SingleSelectDefinition__EventAssignment_0 ) )
            // InternalEsper.g:2550:2: ( rule__SingleSelectDefinition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getEventAssignment_0()); 
            }
            // InternalEsper.g:2551:2: ( rule__SingleSelectDefinition__EventAssignment_0 )
            // InternalEsper.g:2551:3: rule__SingleSelectDefinition__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__EventAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getEventAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__0__Impl"


    // $ANTLR start "rule__SingleSelectDefinition__Group__1"
    // InternalEsper.g:2559:1: rule__SingleSelectDefinition__Group__1 : rule__SingleSelectDefinition__Group__1__Impl rule__SingleSelectDefinition__Group__2 ;
    public final void rule__SingleSelectDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2563:1: ( rule__SingleSelectDefinition__Group__1__Impl rule__SingleSelectDefinition__Group__2 )
            // InternalEsper.g:2564:2: rule__SingleSelectDefinition__Group__1__Impl rule__SingleSelectDefinition__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__SingleSelectDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__1"


    // $ANTLR start "rule__SingleSelectDefinition__Group__1__Impl"
    // InternalEsper.g:2571:1: rule__SingleSelectDefinition__Group__1__Impl : ( '.' ) ;
    public final void rule__SingleSelectDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2575:1: ( ( '.' ) )
            // InternalEsper.g:2576:1: ( '.' )
            {
            // InternalEsper.g:2576:1: ( '.' )
            // InternalEsper.g:2577:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getFullStopKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__1__Impl"


    // $ANTLR start "rule__SingleSelectDefinition__Group__2"
    // InternalEsper.g:2586:1: rule__SingleSelectDefinition__Group__2 : rule__SingleSelectDefinition__Group__2__Impl ;
    public final void rule__SingleSelectDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2590:1: ( rule__SingleSelectDefinition__Group__2__Impl )
            // InternalEsper.g:2591:2: rule__SingleSelectDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__2"


    // $ANTLR start "rule__SingleSelectDefinition__Group__2__Impl"
    // InternalEsper.g:2597:1: rule__SingleSelectDefinition__Group__2__Impl : ( ( rule__SingleSelectDefinition__Alternatives_2 ) ) ;
    public final void rule__SingleSelectDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2601:1: ( ( ( rule__SingleSelectDefinition__Alternatives_2 ) ) )
            // InternalEsper.g:2602:1: ( ( rule__SingleSelectDefinition__Alternatives_2 ) )
            {
            // InternalEsper.g:2602:1: ( ( rule__SingleSelectDefinition__Alternatives_2 ) )
            // InternalEsper.g:2603:2: ( rule__SingleSelectDefinition__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getAlternatives_2()); 
            }
            // InternalEsper.g:2604:2: ( rule__SingleSelectDefinition__Alternatives_2 )
            // InternalEsper.g:2604:3: rule__SingleSelectDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDefinition__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__Group__2__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalEsper.g:2613:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2617:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalEsper.g:2618:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__From__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__From__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // InternalEsper.g:2625:1: rule__From__Group__0__Impl : ( 'from' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2629:1: ( ( 'from' ) )
            // InternalEsper.g:2630:1: ( 'from' )
            {
            // InternalEsper.g:2630:1: ( 'from' )
            // InternalEsper.g:2631:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getFromKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getFromKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // InternalEsper.g:2640:1: rule__From__Group__1 : rule__From__Group__1__Impl ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2644:1: ( rule__From__Group__1__Impl )
            // InternalEsper.g:2645:2: rule__From__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // InternalEsper.g:2651:1: rule__From__Group__1__Impl : ( ( rule__From__Alternatives_1 ) ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2655:1: ( ( ( rule__From__Alternatives_1 ) ) )
            // InternalEsper.g:2656:1: ( ( rule__From__Alternatives_1 ) )
            {
            // InternalEsper.g:2656:1: ( ( rule__From__Alternatives_1 ) )
            // InternalEsper.g:2657:2: ( rule__From__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAlternatives_1()); 
            }
            // InternalEsper.g:2658:2: ( rule__From__Alternatives_1 )
            // InternalEsper.g:2658:3: rule__From__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__From__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group_1_0__0"
    // InternalEsper.g:2667:1: rule__From__Group_1_0__0 : rule__From__Group_1_0__0__Impl rule__From__Group_1_0__1 ;
    public final void rule__From__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2671:1: ( rule__From__Group_1_0__0__Impl rule__From__Group_1_0__1 )
            // InternalEsper.g:2672:2: rule__From__Group_1_0__0__Impl rule__From__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
            rule__From__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0__0"


    // $ANTLR start "rule__From__Group_1_0__0__Impl"
    // InternalEsper.g:2679:1: rule__From__Group_1_0__0__Impl : ( ( rule__From__EventAssignment_1_0_0 ) ) ;
    public final void rule__From__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2683:1: ( ( ( rule__From__EventAssignment_1_0_0 ) ) )
            // InternalEsper.g:2684:1: ( ( rule__From__EventAssignment_1_0_0 ) )
            {
            // InternalEsper.g:2684:1: ( ( rule__From__EventAssignment_1_0_0 ) )
            // InternalEsper.g:2685:2: ( rule__From__EventAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getEventAssignment_1_0_0()); 
            }
            // InternalEsper.g:2686:2: ( rule__From__EventAssignment_1_0_0 )
            // InternalEsper.g:2686:3: rule__From__EventAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__From__EventAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getEventAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0__0__Impl"


    // $ANTLR start "rule__From__Group_1_0__1"
    // InternalEsper.g:2694:1: rule__From__Group_1_0__1 : rule__From__Group_1_0__1__Impl ;
    public final void rule__From__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2698:1: ( rule__From__Group_1_0__1__Impl )
            // InternalEsper.g:2699:2: rule__From__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0__1"


    // $ANTLR start "rule__From__Group_1_0__1__Impl"
    // InternalEsper.g:2705:1: rule__From__Group_1_0__1__Impl : ( ( rule__From__Alternatives_1_0_1 ) ) ;
    public final void rule__From__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2709:1: ( ( ( rule__From__Alternatives_1_0_1 ) ) )
            // InternalEsper.g:2710:1: ( ( rule__From__Alternatives_1_0_1 ) )
            {
            // InternalEsper.g:2710:1: ( ( rule__From__Alternatives_1_0_1 ) )
            // InternalEsper.g:2711:2: ( rule__From__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAlternatives_1_0_1()); 
            }
            // InternalEsper.g:2712:2: ( rule__From__Alternatives_1_0_1 )
            // InternalEsper.g:2712:3: rule__From__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__From__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAlternatives_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0__1__Impl"


    // $ANTLR start "rule__From__Group_1_0_1_0__0"
    // InternalEsper.g:2721:1: rule__From__Group_1_0_1_0__0 : rule__From__Group_1_0_1_0__0__Impl rule__From__Group_1_0_1_0__1 ;
    public final void rule__From__Group_1_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2725:1: ( rule__From__Group_1_0_1_0__0__Impl rule__From__Group_1_0_1_0__1 )
            // InternalEsper.g:2726:2: rule__From__Group_1_0_1_0__0__Impl rule__From__Group_1_0_1_0__1
            {
            pushFollow(FOLLOW_29);
            rule__From__Group_1_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__0"


    // $ANTLR start "rule__From__Group_1_0_1_0__0__Impl"
    // InternalEsper.g:2733:1: rule__From__Group_1_0_1_0__0__Impl : ( '(' ) ;
    public final void rule__From__Group_1_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2737:1: ( ( '(' ) )
            // InternalEsper.g:2738:1: ( '(' )
            {
            // InternalEsper.g:2738:1: ( '(' )
            // InternalEsper.g:2739:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getLeftParenthesisKeyword_1_0_1_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getLeftParenthesisKeyword_1_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__0__Impl"


    // $ANTLR start "rule__From__Group_1_0_1_0__1"
    // InternalEsper.g:2748:1: rule__From__Group_1_0_1_0__1 : rule__From__Group_1_0_1_0__1__Impl rule__From__Group_1_0_1_0__2 ;
    public final void rule__From__Group_1_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2752:1: ( rule__From__Group_1_0_1_0__1__Impl rule__From__Group_1_0_1_0__2 )
            // InternalEsper.g:2753:2: rule__From__Group_1_0_1_0__1__Impl rule__From__Group_1_0_1_0__2
            {
            pushFollow(FOLLOW_16);
            rule__From__Group_1_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__1"


    // $ANTLR start "rule__From__Group_1_0_1_0__1__Impl"
    // InternalEsper.g:2760:1: rule__From__Group_1_0_1_0__1__Impl : ( ( rule__From__AnythingAssignment_1_0_1_0_1 ) ) ;
    public final void rule__From__Group_1_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2764:1: ( ( ( rule__From__AnythingAssignment_1_0_1_0_1 ) ) )
            // InternalEsper.g:2765:1: ( ( rule__From__AnythingAssignment_1_0_1_0_1 ) )
            {
            // InternalEsper.g:2765:1: ( ( rule__From__AnythingAssignment_1_0_1_0_1 ) )
            // InternalEsper.g:2766:2: ( rule__From__AnythingAssignment_1_0_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_0_1()); 
            }
            // InternalEsper.g:2767:2: ( rule__From__AnythingAssignment_1_0_1_0_1 )
            // InternalEsper.g:2767:3: rule__From__AnythingAssignment_1_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__From__AnythingAssignment_1_0_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__1__Impl"


    // $ANTLR start "rule__From__Group_1_0_1_0__2"
    // InternalEsper.g:2775:1: rule__From__Group_1_0_1_0__2 : rule__From__Group_1_0_1_0__2__Impl ;
    public final void rule__From__Group_1_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2779:1: ( rule__From__Group_1_0_1_0__2__Impl )
            // InternalEsper.g:2780:2: rule__From__Group_1_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__2"


    // $ANTLR start "rule__From__Group_1_0_1_0__2__Impl"
    // InternalEsper.g:2786:1: rule__From__Group_1_0_1_0__2__Impl : ( ')' ) ;
    public final void rule__From__Group_1_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2790:1: ( ( ')' ) )
            // InternalEsper.g:2791:1: ( ')' )
            {
            // InternalEsper.g:2791:1: ( ')' )
            // InternalEsper.g:2792:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getRightParenthesisKeyword_1_0_1_0_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getRightParenthesisKeyword_1_0_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_0__2__Impl"


    // $ANTLR start "rule__From__Group_1_0_1_1__0"
    // InternalEsper.g:2802:1: rule__From__Group_1_0_1_1__0 : rule__From__Group_1_0_1_1__0__Impl rule__From__Group_1_0_1_1__1 ;
    public final void rule__From__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2806:1: ( rule__From__Group_1_0_1_1__0__Impl rule__From__Group_1_0_1_1__1 )
            // InternalEsper.g:2807:2: rule__From__Group_1_0_1_1__0__Impl rule__From__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__From__Group_1_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_1__0"


    // $ANTLR start "rule__From__Group_1_0_1_1__0__Impl"
    // InternalEsper.g:2814:1: rule__From__Group_1_0_1_1__0__Impl : ( '.' ) ;
    public final void rule__From__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2818:1: ( ( '.' ) )
            // InternalEsper.g:2819:1: ( '.' )
            {
            // InternalEsper.g:2819:1: ( '.' )
            // InternalEsper.g:2820:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getFullStopKeyword_1_0_1_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getFullStopKeyword_1_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__From__Group_1_0_1_1__1"
    // InternalEsper.g:2829:1: rule__From__Group_1_0_1_1__1 : rule__From__Group_1_0_1_1__1__Impl ;
    public final void rule__From__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2833:1: ( rule__From__Group_1_0_1_1__1__Impl )
            // InternalEsper.g:2834:2: rule__From__Group_1_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group_1_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_1__1"


    // $ANTLR start "rule__From__Group_1_0_1_1__1__Impl"
    // InternalEsper.g:2840:1: rule__From__Group_1_0_1_1__1__Impl : ( ( rule__From__AnythingAssignment_1_0_1_1_1 ) ) ;
    public final void rule__From__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2844:1: ( ( ( rule__From__AnythingAssignment_1_0_1_1_1 ) ) )
            // InternalEsper.g:2845:1: ( ( rule__From__AnythingAssignment_1_0_1_1_1 ) )
            {
            // InternalEsper.g:2845:1: ( ( rule__From__AnythingAssignment_1_0_1_1_1 ) )
            // InternalEsper.g:2846:2: ( rule__From__AnythingAssignment_1_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_1_1()); 
            }
            // InternalEsper.g:2847:2: ( rule__From__AnythingAssignment_1_0_1_1_1 )
            // InternalEsper.g:2847:3: rule__From__AnythingAssignment_1_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__From__AnythingAssignment_1_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAnythingAssignment_1_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalEsper.g:2856:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2860:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalEsper.g:2861:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Pattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalEsper.g:2868:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2872:1: ( ( 'pattern' ) )
            // InternalEsper.g:2873:1: ( 'pattern' )
            {
            // InternalEsper.g:2873:1: ( 'pattern' )
            // InternalEsper.g:2874:2: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalEsper.g:2883:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2887:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalEsper.g:2888:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Pattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalEsper.g:2895:1: rule__Pattern__Group__1__Impl : ( '[' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2899:1: ( ( '[' ) )
            // InternalEsper.g:2900:1: ( '[' )
            {
            // InternalEsper.g:2900:1: ( '[' )
            // InternalEsper.g:2901:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalEsper.g:2910:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2914:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalEsper.g:2915:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Pattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalEsper.g:2922:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__JoinFollowByAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2926:1: ( ( ( rule__Pattern__JoinFollowByAssignment_2 ) ) )
            // InternalEsper.g:2927:1: ( ( rule__Pattern__JoinFollowByAssignment_2 ) )
            {
            // InternalEsper.g:2927:1: ( ( rule__Pattern__JoinFollowByAssignment_2 ) )
            // InternalEsper.g:2928:2: ( rule__Pattern__JoinFollowByAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getJoinFollowByAssignment_2()); 
            }
            // InternalEsper.g:2929:2: ( rule__Pattern__JoinFollowByAssignment_2 )
            // InternalEsper.g:2929:3: rule__Pattern__JoinFollowByAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__JoinFollowByAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getJoinFollowByAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalEsper.g:2937:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2941:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalEsper.g:2942:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Pattern__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalEsper.g:2949:1: rule__Pattern__Group__3__Impl : ( ']' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2953:1: ( ( ']' ) )
            // InternalEsper.g:2954:1: ( ']' )
            {
            // InternalEsper.g:2954:1: ( ']' )
            // InternalEsper.g:2955:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalEsper.g:2964:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2968:1: ( rule__Pattern__Group__4__Impl )
            // InternalEsper.g:2969:2: rule__Pattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalEsper.g:2975:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2979:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalEsper.g:2980:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalEsper.g:2980:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalEsper.g:2981:2: ( rule__Pattern__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_4()); 
            }
            // InternalEsper.g:2982:2: ( rule__Pattern__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsper.g:2982:3: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalEsper.g:2991:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:2995:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalEsper.g:2996:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalEsper.g:3003:1: rule__Pattern__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3007:1: ( ( '.' ) )
            // InternalEsper.g:3008:1: ( '.' )
            {
            // InternalEsper.g:3008:1: ( '.' )
            // InternalEsper.g:3009:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getFullStopKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getFullStopKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalEsper.g:3018:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3022:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalEsper.g:3023:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalEsper.g:3029:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__WinAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3033:1: ( ( ( rule__Pattern__WinAssignment_4_1 ) ) )
            // InternalEsper.g:3034:1: ( ( rule__Pattern__WinAssignment_4_1 ) )
            {
            // InternalEsper.g:3034:1: ( ( rule__Pattern__WinAssignment_4_1 ) )
            // InternalEsper.g:3035:2: ( rule__Pattern__WinAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getWinAssignment_4_1()); 
            }
            // InternalEsper.g:3036:2: ( rule__Pattern__WinAssignment_4_1 )
            // InternalEsper.g:3036:3: rule__Pattern__WinAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__WinAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getWinAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__JoinFollowBy__Group__0"
    // InternalEsper.g:3045:1: rule__JoinFollowBy__Group__0 : rule__JoinFollowBy__Group__0__Impl rule__JoinFollowBy__Group__1 ;
    public final void rule__JoinFollowBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3049:1: ( rule__JoinFollowBy__Group__0__Impl rule__JoinFollowBy__Group__1 )
            // InternalEsper.g:3050:2: rule__JoinFollowBy__Group__0__Impl rule__JoinFollowBy__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__JoinFollowBy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group__0"


    // $ANTLR start "rule__JoinFollowBy__Group__0__Impl"
    // InternalEsper.g:3057:1: rule__JoinFollowBy__Group__0__Impl : ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 ) ) ;
    public final void rule__JoinFollowBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3061:1: ( ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 ) ) )
            // InternalEsper.g:3062:1: ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 ) )
            {
            // InternalEsper.g:3062:1: ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 ) )
            // InternalEsper.g:3063:2: ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_0()); 
            }
            // InternalEsper.g:3064:2: ( rule__JoinFollowBy__FollowsByJoinListAssignment_0 )
            // InternalEsper.g:3064:3: rule__JoinFollowBy__FollowsByJoinListAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__FollowsByJoinListAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group__0__Impl"


    // $ANTLR start "rule__JoinFollowBy__Group__1"
    // InternalEsper.g:3072:1: rule__JoinFollowBy__Group__1 : rule__JoinFollowBy__Group__1__Impl ;
    public final void rule__JoinFollowBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3076:1: ( rule__JoinFollowBy__Group__1__Impl )
            // InternalEsper.g:3077:2: rule__JoinFollowBy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group__1"


    // $ANTLR start "rule__JoinFollowBy__Group__1__Impl"
    // InternalEsper.g:3083:1: rule__JoinFollowBy__Group__1__Impl : ( ( rule__JoinFollowBy__Group_1__0 )* ) ;
    public final void rule__JoinFollowBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3087:1: ( ( ( rule__JoinFollowBy__Group_1__0 )* ) )
            // InternalEsper.g:3088:1: ( ( rule__JoinFollowBy__Group_1__0 )* )
            {
            // InternalEsper.g:3088:1: ( ( rule__JoinFollowBy__Group_1__0 )* )
            // InternalEsper.g:3089:2: ( rule__JoinFollowBy__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getGroup_1()); 
            }
            // InternalEsper.g:3090:2: ( rule__JoinFollowBy__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==11||(LA25_0>=21 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEsper.g:3090:3: rule__JoinFollowBy__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__JoinFollowBy__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group__1__Impl"


    // $ANTLR start "rule__JoinFollowBy__Group_1__0"
    // InternalEsper.g:3099:1: rule__JoinFollowBy__Group_1__0 : rule__JoinFollowBy__Group_1__0__Impl rule__JoinFollowBy__Group_1__1 ;
    public final void rule__JoinFollowBy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3103:1: ( rule__JoinFollowBy__Group_1__0__Impl rule__JoinFollowBy__Group_1__1 )
            // InternalEsper.g:3104:2: rule__JoinFollowBy__Group_1__0__Impl rule__JoinFollowBy__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__JoinFollowBy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group_1__0"


    // $ANTLR start "rule__JoinFollowBy__Group_1__0__Impl"
    // InternalEsper.g:3111:1: rule__JoinFollowBy__Group_1__0__Impl : ( ( rule__JoinFollowBy__OperatorAssignment_1_0 ) ) ;
    public final void rule__JoinFollowBy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3115:1: ( ( ( rule__JoinFollowBy__OperatorAssignment_1_0 ) ) )
            // InternalEsper.g:3116:1: ( ( rule__JoinFollowBy__OperatorAssignment_1_0 ) )
            {
            // InternalEsper.g:3116:1: ( ( rule__JoinFollowBy__OperatorAssignment_1_0 ) )
            // InternalEsper.g:3117:2: ( rule__JoinFollowBy__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getOperatorAssignment_1_0()); 
            }
            // InternalEsper.g:3118:2: ( rule__JoinFollowBy__OperatorAssignment_1_0 )
            // InternalEsper.g:3118:3: rule__JoinFollowBy__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__OperatorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getOperatorAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group_1__0__Impl"


    // $ANTLR start "rule__JoinFollowBy__Group_1__1"
    // InternalEsper.g:3126:1: rule__JoinFollowBy__Group_1__1 : rule__JoinFollowBy__Group_1__1__Impl ;
    public final void rule__JoinFollowBy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3130:1: ( rule__JoinFollowBy__Group_1__1__Impl )
            // InternalEsper.g:3131:2: rule__JoinFollowBy__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group_1__1"


    // $ANTLR start "rule__JoinFollowBy__Group_1__1__Impl"
    // InternalEsper.g:3137:1: rule__JoinFollowBy__Group_1__1__Impl : ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 ) ) ;
    public final void rule__JoinFollowBy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3141:1: ( ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 ) ) )
            // InternalEsper.g:3142:1: ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 ) )
            {
            // InternalEsper.g:3142:1: ( ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 ) )
            // InternalEsper.g:3143:2: ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_1_1()); 
            }
            // InternalEsper.g:3144:2: ( rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 )
            // InternalEsper.g:3144:3: rule__JoinFollowBy__FollowsByJoinListAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JoinFollowBy__FollowsByJoinListAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractFollowBy__Group__0"
    // InternalEsper.g:3153:1: rule__AbstractFollowBy__Group__0 : rule__AbstractFollowBy__Group__0__Impl rule__AbstractFollowBy__Group__1 ;
    public final void rule__AbstractFollowBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3157:1: ( rule__AbstractFollowBy__Group__0__Impl rule__AbstractFollowBy__Group__1 )
            // InternalEsper.g:3158:2: rule__AbstractFollowBy__Group__0__Impl rule__AbstractFollowBy__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__AbstractFollowBy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group__0"


    // $ANTLR start "rule__AbstractFollowBy__Group__0__Impl"
    // InternalEsper.g:3165:1: rule__AbstractFollowBy__Group__0__Impl : ( ( rule__AbstractFollowBy__Alternatives_0 ) ) ;
    public final void rule__AbstractFollowBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3169:1: ( ( ( rule__AbstractFollowBy__Alternatives_0 ) ) )
            // InternalEsper.g:3170:1: ( ( rule__AbstractFollowBy__Alternatives_0 ) )
            {
            // InternalEsper.g:3170:1: ( ( rule__AbstractFollowBy__Alternatives_0 ) )
            // InternalEsper.g:3171:2: ( rule__AbstractFollowBy__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getAlternatives_0()); 
            }
            // InternalEsper.g:3172:2: ( rule__AbstractFollowBy__Alternatives_0 )
            // InternalEsper.g:3172:3: rule__AbstractFollowBy__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group__0__Impl"


    // $ANTLR start "rule__AbstractFollowBy__Group__1"
    // InternalEsper.g:3180:1: rule__AbstractFollowBy__Group__1 : rule__AbstractFollowBy__Group__1__Impl ;
    public final void rule__AbstractFollowBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3184:1: ( rule__AbstractFollowBy__Group__1__Impl )
            // InternalEsper.g:3185:2: rule__AbstractFollowBy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group__1"


    // $ANTLR start "rule__AbstractFollowBy__Group__1__Impl"
    // InternalEsper.g:3191:1: rule__AbstractFollowBy__Group__1__Impl : ( ( rule__AbstractFollowBy__WherePartAssignment_1 )? ) ;
    public final void rule__AbstractFollowBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3195:1: ( ( ( rule__AbstractFollowBy__WherePartAssignment_1 )? ) )
            // InternalEsper.g:3196:1: ( ( rule__AbstractFollowBy__WherePartAssignment_1 )? )
            {
            // InternalEsper.g:3196:1: ( ( rule__AbstractFollowBy__WherePartAssignment_1 )? )
            // InternalEsper.g:3197:2: ( rule__AbstractFollowBy__WherePartAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getWherePartAssignment_1()); 
            }
            // InternalEsper.g:3198:2: ( rule__AbstractFollowBy__WherePartAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20||LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEsper.g:3198:3: rule__AbstractFollowBy__WherePartAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractFollowBy__WherePartAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getWherePartAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group__1__Impl"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__0"
    // InternalEsper.g:3207:1: rule__AbstractFollowBy__Group_0_1__0 : rule__AbstractFollowBy__Group_0_1__0__Impl rule__AbstractFollowBy__Group_0_1__1 ;
    public final void rule__AbstractFollowBy__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3211:1: ( rule__AbstractFollowBy__Group_0_1__0__Impl rule__AbstractFollowBy__Group_0_1__1 )
            // InternalEsper.g:3212:2: rule__AbstractFollowBy__Group_0_1__0__Impl rule__AbstractFollowBy__Group_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__AbstractFollowBy__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__0"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__0__Impl"
    // InternalEsper.g:3219:1: rule__AbstractFollowBy__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__AbstractFollowBy__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3223:1: ( ( '(' ) )
            // InternalEsper.g:3224:1: ( '(' )
            {
            // InternalEsper.g:3224:1: ( '(' )
            // InternalEsper.g:3225:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getLeftParenthesisKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__0__Impl"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__1"
    // InternalEsper.g:3234:1: rule__AbstractFollowBy__Group_0_1__1 : rule__AbstractFollowBy__Group_0_1__1__Impl rule__AbstractFollowBy__Group_0_1__2 ;
    public final void rule__AbstractFollowBy__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3238:1: ( rule__AbstractFollowBy__Group_0_1__1__Impl rule__AbstractFollowBy__Group_0_1__2 )
            // InternalEsper.g:3239:2: rule__AbstractFollowBy__Group_0_1__1__Impl rule__AbstractFollowBy__Group_0_1__2
            {
            pushFollow(FOLLOW_16);
            rule__AbstractFollowBy__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__1"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__1__Impl"
    // InternalEsper.g:3246:1: rule__AbstractFollowBy__Group_0_1__1__Impl : ( ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 ) ) ;
    public final void rule__AbstractFollowBy__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3250:1: ( ( ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 ) ) )
            // InternalEsper.g:3251:1: ( ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 ) )
            {
            // InternalEsper.g:3251:1: ( ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 ) )
            // InternalEsper.g:3252:2: ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_1_1()); 
            }
            // InternalEsper.g:3253:2: ( rule__AbstractFollowBy__FollowByAssignment_0_1_1 )
            // InternalEsper.g:3253:3: rule__AbstractFollowBy__FollowByAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__FollowByAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__1__Impl"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__2"
    // InternalEsper.g:3261:1: rule__AbstractFollowBy__Group_0_1__2 : rule__AbstractFollowBy__Group_0_1__2__Impl ;
    public final void rule__AbstractFollowBy__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3265:1: ( rule__AbstractFollowBy__Group_0_1__2__Impl )
            // InternalEsper.g:3266:2: rule__AbstractFollowBy__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFollowBy__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__2"


    // $ANTLR start "rule__AbstractFollowBy__Group_0_1__2__Impl"
    // InternalEsper.g:3272:1: rule__AbstractFollowBy__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__AbstractFollowBy__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3276:1: ( ( ')' ) )
            // InternalEsper.g:3277:1: ( ')' )
            {
            // InternalEsper.g:3277:1: ( ')' )
            // InternalEsper.g:3278:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getRightParenthesisKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__Group_0_1__2__Impl"


    // $ANTLR start "rule__FollowBy__Group__0"
    // InternalEsper.g:3288:1: rule__FollowBy__Group__0 : rule__FollowBy__Group__0__Impl rule__FollowBy__Group__1 ;
    public final void rule__FollowBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3292:1: ( rule__FollowBy__Group__0__Impl rule__FollowBy__Group__1 )
            // InternalEsper.g:3293:2: rule__FollowBy__Group__0__Impl rule__FollowBy__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__FollowBy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FollowBy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group__0"


    // $ANTLR start "rule__FollowBy__Group__0__Impl"
    // InternalEsper.g:3300:1: rule__FollowBy__Group__0__Impl : ( ( rule__FollowBy__LeftSideAssignment_0 ) ) ;
    public final void rule__FollowBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3304:1: ( ( ( rule__FollowBy__LeftSideAssignment_0 ) ) )
            // InternalEsper.g:3305:1: ( ( rule__FollowBy__LeftSideAssignment_0 ) )
            {
            // InternalEsper.g:3305:1: ( ( rule__FollowBy__LeftSideAssignment_0 ) )
            // InternalEsper.g:3306:2: ( rule__FollowBy__LeftSideAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getLeftSideAssignment_0()); 
            }
            // InternalEsper.g:3307:2: ( rule__FollowBy__LeftSideAssignment_0 )
            // InternalEsper.g:3307:3: rule__FollowBy__LeftSideAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FollowBy__LeftSideAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getLeftSideAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group__0__Impl"


    // $ANTLR start "rule__FollowBy__Group__1"
    // InternalEsper.g:3315:1: rule__FollowBy__Group__1 : rule__FollowBy__Group__1__Impl ;
    public final void rule__FollowBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3319:1: ( rule__FollowBy__Group__1__Impl )
            // InternalEsper.g:3320:2: rule__FollowBy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowBy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group__1"


    // $ANTLR start "rule__FollowBy__Group__1__Impl"
    // InternalEsper.g:3326:1: rule__FollowBy__Group__1__Impl : ( ( rule__FollowBy__Group_1__0 )* ) ;
    public final void rule__FollowBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3330:1: ( ( ( rule__FollowBy__Group_1__0 )* ) )
            // InternalEsper.g:3331:1: ( ( rule__FollowBy__Group_1__0 )* )
            {
            // InternalEsper.g:3331:1: ( ( rule__FollowBy__Group_1__0 )* )
            // InternalEsper.g:3332:2: ( rule__FollowBy__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getGroup_1()); 
            }
            // InternalEsper.g:3333:2: ( rule__FollowBy__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred54_InternalEsper()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalEsper.g:3333:3: rule__FollowBy__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__FollowBy__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group__1__Impl"


    // $ANTLR start "rule__FollowBy__Group_1__0"
    // InternalEsper.g:3342:1: rule__FollowBy__Group_1__0 : rule__FollowBy__Group_1__0__Impl rule__FollowBy__Group_1__1 ;
    public final void rule__FollowBy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3346:1: ( rule__FollowBy__Group_1__0__Impl rule__FollowBy__Group_1__1 )
            // InternalEsper.g:3347:2: rule__FollowBy__Group_1__0__Impl rule__FollowBy__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__FollowBy__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FollowBy__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group_1__0"


    // $ANTLR start "rule__FollowBy__Group_1__0__Impl"
    // InternalEsper.g:3354:1: rule__FollowBy__Group_1__0__Impl : ( ( '->' ) ) ;
    public final void rule__FollowBy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3358:1: ( ( ( '->' ) ) )
            // InternalEsper.g:3359:1: ( ( '->' ) )
            {
            // InternalEsper.g:3359:1: ( ( '->' ) )
            // InternalEsper.g:3360:2: ( '->' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            }
            // InternalEsper.g:3361:2: ( '->' )
            // InternalEsper.g:3361:3: '->'
            {
            match(input,51,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group_1__0__Impl"


    // $ANTLR start "rule__FollowBy__Group_1__1"
    // InternalEsper.g:3369:1: rule__FollowBy__Group_1__1 : rule__FollowBy__Group_1__1__Impl ;
    public final void rule__FollowBy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3373:1: ( rule__FollowBy__Group_1__1__Impl )
            // InternalEsper.g:3374:2: rule__FollowBy__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowBy__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group_1__1"


    // $ANTLR start "rule__FollowBy__Group_1__1__Impl"
    // InternalEsper.g:3380:1: rule__FollowBy__Group_1__1__Impl : ( ( rule__FollowBy__RightSideAssignment_1_1 ) ) ;
    public final void rule__FollowBy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3384:1: ( ( ( rule__FollowBy__RightSideAssignment_1_1 ) ) )
            // InternalEsper.g:3385:1: ( ( rule__FollowBy__RightSideAssignment_1_1 ) )
            {
            // InternalEsper.g:3385:1: ( ( rule__FollowBy__RightSideAssignment_1_1 ) )
            // InternalEsper.g:3386:2: ( rule__FollowBy__RightSideAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getRightSideAssignment_1_1()); 
            }
            // InternalEsper.g:3387:2: ( rule__FollowBy__RightSideAssignment_1_1 )
            // InternalEsper.g:3387:3: rule__FollowBy__RightSideAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowBy__RightSideAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getRightSideAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalEsper.g:3396:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3400:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalEsper.g:3401:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalEsper.g:3408:1: rule__TerminalExpression__Group_0__0__Impl : ( ( rule__TerminalExpression__EveryAssignment_0_0 ) ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3412:1: ( ( ( rule__TerminalExpression__EveryAssignment_0_0 ) ) )
            // InternalEsper.g:3413:1: ( ( rule__TerminalExpression__EveryAssignment_0_0 ) )
            {
            // InternalEsper.g:3413:1: ( ( rule__TerminalExpression__EveryAssignment_0_0 ) )
            // InternalEsper.g:3414:2: ( rule__TerminalExpression__EveryAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getEveryAssignment_0_0()); 
            }
            // InternalEsper.g:3415:2: ( rule__TerminalExpression__EveryAssignment_0_0 )
            // InternalEsper.g:3415:3: rule__TerminalExpression__EveryAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__EveryAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getEveryAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalEsper.g:3423:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3427:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalEsper.g:3428:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalEsper.g:3434:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__EveryExpressionAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3438:1: ( ( ( rule__TerminalExpression__EveryExpressionAssignment_0_1 ) ) )
            // InternalEsper.g:3439:1: ( ( rule__TerminalExpression__EveryExpressionAssignment_0_1 ) )
            {
            // InternalEsper.g:3439:1: ( ( rule__TerminalExpression__EveryExpressionAssignment_0_1 ) )
            // InternalEsper.g:3440:2: ( rule__TerminalExpression__EveryExpressionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getEveryExpressionAssignment_0_1()); 
            }
            // InternalEsper.g:3441:2: ( rule__TerminalExpression__EveryExpressionAssignment_0_1 )
            // InternalEsper.g:3441:3: rule__TerminalExpression__EveryExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__EveryExpressionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getEveryExpressionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalEsper.g:3450:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3454:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalEsper.g:3455:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalEsper.g:3462:1: rule__TerminalExpression__Group_1__0__Impl : ( ( rule__TerminalExpression__ParenthesisAssignment_1_0 ) ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3466:1: ( ( ( rule__TerminalExpression__ParenthesisAssignment_1_0 ) ) )
            // InternalEsper.g:3467:1: ( ( rule__TerminalExpression__ParenthesisAssignment_1_0 ) )
            {
            // InternalEsper.g:3467:1: ( ( rule__TerminalExpression__ParenthesisAssignment_1_0 ) )
            // InternalEsper.g:3468:2: ( rule__TerminalExpression__ParenthesisAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getParenthesisAssignment_1_0()); 
            }
            // InternalEsper.g:3469:2: ( rule__TerminalExpression__ParenthesisAssignment_1_0 )
            // InternalEsper.g:3469:3: rule__TerminalExpression__ParenthesisAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ParenthesisAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getParenthesisAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalEsper.g:3477:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3481:1: ( rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 )
            // InternalEsper.g:3482:2: rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalEsper.g:3489:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3493:1: ( ( ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 ) ) )
            // InternalEsper.g:3494:1: ( ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 ) )
            {
            // InternalEsper.g:3494:1: ( ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 ) )
            // InternalEsper.g:3495:2: ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisAssignment_1_1()); 
            }
            // InternalEsper.g:3496:2: ( rule__TerminalExpression__BetweenParenthesisAssignment_1_1 )
            // InternalEsper.g:3496:3: rule__TerminalExpression__BetweenParenthesisAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__BetweenParenthesisAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__2"
    // InternalEsper.g:3504:1: rule__TerminalExpression__Group_1__2 : rule__TerminalExpression__Group_1__2__Impl ;
    public final void rule__TerminalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3508:1: ( rule__TerminalExpression__Group_1__2__Impl )
            // InternalEsper.g:3509:2: rule__TerminalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__2"


    // $ANTLR start "rule__TerminalExpression__Group_1__2__Impl"
    // InternalEsper.g:3515:1: rule__TerminalExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3519:1: ( ( ')' ) )
            // InternalEsper.g:3520:1: ( ')' )
            {
            // InternalEsper.g:3520:1: ( ')' )
            // InternalEsper.g:3521:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SingleDefinition__Group__0"
    // InternalEsper.g:3531:1: rule__SingleDefinition__Group__0 : rule__SingleDefinition__Group__0__Impl rule__SingleDefinition__Group__1 ;
    public final void rule__SingleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3535:1: ( rule__SingleDefinition__Group__0__Impl rule__SingleDefinition__Group__1 )
            // InternalEsper.g:3536:2: rule__SingleDefinition__Group__0__Impl rule__SingleDefinition__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SingleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__0"


    // $ANTLR start "rule__SingleDefinition__Group__0__Impl"
    // InternalEsper.g:3543:1: rule__SingleDefinition__Group__0__Impl : ( ( rule__SingleDefinition__Group_0__0 )? ) ;
    public final void rule__SingleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3547:1: ( ( ( rule__SingleDefinition__Group_0__0 )? ) )
            // InternalEsper.g:3548:1: ( ( rule__SingleDefinition__Group_0__0 )? )
            {
            // InternalEsper.g:3548:1: ( ( rule__SingleDefinition__Group_0__0 )? )
            // InternalEsper.g:3549:2: ( rule__SingleDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getGroup_0()); 
            }
            // InternalEsper.g:3550:2: ( rule__SingleDefinition__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==21) ) {
                    int LA28_3 = input.LA(3);

                    if ( (synpred55_InternalEsper()) ) {
                        alt28=1;
                    }
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalEsper.g:3550:3: rule__SingleDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleDefinition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__0__Impl"


    // $ANTLR start "rule__SingleDefinition__Group__1"
    // InternalEsper.g:3558:1: rule__SingleDefinition__Group__1 : rule__SingleDefinition__Group__1__Impl rule__SingleDefinition__Group__2 ;
    public final void rule__SingleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3562:1: ( rule__SingleDefinition__Group__1__Impl rule__SingleDefinition__Group__2 )
            // InternalEsper.g:3563:2: rule__SingleDefinition__Group__1__Impl rule__SingleDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SingleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__1"


    // $ANTLR start "rule__SingleDefinition__Group__1__Impl"
    // InternalEsper.g:3570:1: rule__SingleDefinition__Group__1__Impl : ( ( rule__SingleDefinition__SimpleEventsAssignment_1 ) ) ;
    public final void rule__SingleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3574:1: ( ( ( rule__SingleDefinition__SimpleEventsAssignment_1 ) ) )
            // InternalEsper.g:3575:1: ( ( rule__SingleDefinition__SimpleEventsAssignment_1 ) )
            {
            // InternalEsper.g:3575:1: ( ( rule__SingleDefinition__SimpleEventsAssignment_1 ) )
            // InternalEsper.g:3576:2: ( rule__SingleDefinition__SimpleEventsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getSimpleEventsAssignment_1()); 
            }
            // InternalEsper.g:3577:2: ( rule__SingleDefinition__SimpleEventsAssignment_1 )
            // InternalEsper.g:3577:3: rule__SingleDefinition__SimpleEventsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__SimpleEventsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getSimpleEventsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__1__Impl"


    // $ANTLR start "rule__SingleDefinition__Group__2"
    // InternalEsper.g:3585:1: rule__SingleDefinition__Group__2 : rule__SingleDefinition__Group__2__Impl ;
    public final void rule__SingleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3589:1: ( rule__SingleDefinition__Group__2__Impl )
            // InternalEsper.g:3590:2: rule__SingleDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__2"


    // $ANTLR start "rule__SingleDefinition__Group__2__Impl"
    // InternalEsper.g:3596:1: rule__SingleDefinition__Group__2__Impl : ( ( rule__SingleDefinition__Group_2__0 )? ) ;
    public final void rule__SingleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3600:1: ( ( ( rule__SingleDefinition__Group_2__0 )? ) )
            // InternalEsper.g:3601:1: ( ( rule__SingleDefinition__Group_2__0 )? )
            {
            // InternalEsper.g:3601:1: ( ( rule__SingleDefinition__Group_2__0 )? )
            // InternalEsper.g:3602:2: ( rule__SingleDefinition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getGroup_2()); 
            }
            // InternalEsper.g:3603:2: ( rule__SingleDefinition__Group_2__0 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalEsper.g:3603:3: rule__SingleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleDefinition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group__2__Impl"


    // $ANTLR start "rule__SingleDefinition__Group_0__0"
    // InternalEsper.g:3612:1: rule__SingleDefinition__Group_0__0 : rule__SingleDefinition__Group_0__0__Impl rule__SingleDefinition__Group_0__1 ;
    public final void rule__SingleDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3616:1: ( rule__SingleDefinition__Group_0__0__Impl rule__SingleDefinition__Group_0__1 )
            // InternalEsper.g:3617:2: rule__SingleDefinition__Group_0__0__Impl rule__SingleDefinition__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__SingleDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_0__0"


    // $ANTLR start "rule__SingleDefinition__Group_0__0__Impl"
    // InternalEsper.g:3624:1: rule__SingleDefinition__Group_0__0__Impl : ( ( rule__SingleDefinition__NameAssignment_0_0 ) ) ;
    public final void rule__SingleDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3628:1: ( ( ( rule__SingleDefinition__NameAssignment_0_0 ) ) )
            // InternalEsper.g:3629:1: ( ( rule__SingleDefinition__NameAssignment_0_0 ) )
            {
            // InternalEsper.g:3629:1: ( ( rule__SingleDefinition__NameAssignment_0_0 ) )
            // InternalEsper.g:3630:2: ( rule__SingleDefinition__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getNameAssignment_0_0()); 
            }
            // InternalEsper.g:3631:2: ( rule__SingleDefinition__NameAssignment_0_0 )
            // InternalEsper.g:3631:3: rule__SingleDefinition__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__NameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getNameAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__SingleDefinition__Group_0__1"
    // InternalEsper.g:3639:1: rule__SingleDefinition__Group_0__1 : rule__SingleDefinition__Group_0__1__Impl ;
    public final void rule__SingleDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3643:1: ( rule__SingleDefinition__Group_0__1__Impl )
            // InternalEsper.g:3644:2: rule__SingleDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_0__1"


    // $ANTLR start "rule__SingleDefinition__Group_0__1__Impl"
    // InternalEsper.g:3650:1: rule__SingleDefinition__Group_0__1__Impl : ( '=' ) ;
    public final void rule__SingleDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3654:1: ( ( '=' ) )
            // InternalEsper.g:3655:1: ( '=' )
            {
            // InternalEsper.g:3655:1: ( '=' )
            // InternalEsper.g:3656:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getEqualsSignKeyword_0_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getEqualsSignKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__SingleDefinition__Group_2__0"
    // InternalEsper.g:3666:1: rule__SingleDefinition__Group_2__0 : rule__SingleDefinition__Group_2__0__Impl rule__SingleDefinition__Group_2__1 ;
    public final void rule__SingleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3670:1: ( rule__SingleDefinition__Group_2__0__Impl rule__SingleDefinition__Group_2__1 )
            // InternalEsper.g:3671:2: rule__SingleDefinition__Group_2__0__Impl rule__SingleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__SingleDefinition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__0"


    // $ANTLR start "rule__SingleDefinition__Group_2__0__Impl"
    // InternalEsper.g:3678:1: rule__SingleDefinition__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__SingleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3682:1: ( ( ( '(' ) ) )
            // InternalEsper.g:3683:1: ( ( '(' ) )
            {
            // InternalEsper.g:3683:1: ( ( '(' ) )
            // InternalEsper.g:3684:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // InternalEsper.g:3685:2: ( '(' )
            // InternalEsper.g:3685:3: '('
            {
            match(input,38,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__SingleDefinition__Group_2__1"
    // InternalEsper.g:3693:1: rule__SingleDefinition__Group_2__1 : rule__SingleDefinition__Group_2__1__Impl rule__SingleDefinition__Group_2__2 ;
    public final void rule__SingleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3697:1: ( rule__SingleDefinition__Group_2__1__Impl rule__SingleDefinition__Group_2__2 )
            // InternalEsper.g:3698:2: rule__SingleDefinition__Group_2__1__Impl rule__SingleDefinition__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__SingleDefinition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__1"


    // $ANTLR start "rule__SingleDefinition__Group_2__1__Impl"
    // InternalEsper.g:3705:1: rule__SingleDefinition__Group_2__1__Impl : ( ( rule__SingleDefinition__AnythingAssignment_2_1 ) ) ;
    public final void rule__SingleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3709:1: ( ( ( rule__SingleDefinition__AnythingAssignment_2_1 ) ) )
            // InternalEsper.g:3710:1: ( ( rule__SingleDefinition__AnythingAssignment_2_1 ) )
            {
            // InternalEsper.g:3710:1: ( ( rule__SingleDefinition__AnythingAssignment_2_1 ) )
            // InternalEsper.g:3711:2: ( rule__SingleDefinition__AnythingAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getAnythingAssignment_2_1()); 
            }
            // InternalEsper.g:3712:2: ( rule__SingleDefinition__AnythingAssignment_2_1 )
            // InternalEsper.g:3712:3: rule__SingleDefinition__AnythingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__AnythingAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getAnythingAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__SingleDefinition__Group_2__2"
    // InternalEsper.g:3720:1: rule__SingleDefinition__Group_2__2 : rule__SingleDefinition__Group_2__2__Impl ;
    public final void rule__SingleDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3724:1: ( rule__SingleDefinition__Group_2__2__Impl )
            // InternalEsper.g:3725:2: rule__SingleDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleDefinition__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__2"


    // $ANTLR start "rule__SingleDefinition__Group_2__2__Impl"
    // InternalEsper.g:3731:1: rule__SingleDefinition__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SingleDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3735:1: ( ( ')' ) )
            // InternalEsper.g:3736:1: ( ')' )
            {
            // InternalEsper.g:3736:1: ( ')' )
            // InternalEsper.g:3737:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__Win__Group__0"
    // InternalEsper.g:3747:1: rule__Win__Group__0 : rule__Win__Group__0__Impl rule__Win__Group__1 ;
    public final void rule__Win__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3751:1: ( rule__Win__Group__0__Impl rule__Win__Group__1 )
            // InternalEsper.g:3752:2: rule__Win__Group__0__Impl rule__Win__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Win__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Win__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__0"


    // $ANTLR start "rule__Win__Group__0__Impl"
    // InternalEsper.g:3759:1: rule__Win__Group__0__Impl : ( 'win' ) ;
    public final void rule__Win__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3763:1: ( ( 'win' ) )
            // InternalEsper.g:3764:1: ( 'win' )
            {
            // InternalEsper.g:3764:1: ( 'win' )
            // InternalEsper.g:3765:2: 'win'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinAccess().getWinKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinAccess().getWinKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__0__Impl"


    // $ANTLR start "rule__Win__Group__1"
    // InternalEsper.g:3774:1: rule__Win__Group__1 : rule__Win__Group__1__Impl rule__Win__Group__2 ;
    public final void rule__Win__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3778:1: ( rule__Win__Group__1__Impl rule__Win__Group__2 )
            // InternalEsper.g:3779:2: rule__Win__Group__1__Impl rule__Win__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Win__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Win__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__1"


    // $ANTLR start "rule__Win__Group__1__Impl"
    // InternalEsper.g:3786:1: rule__Win__Group__1__Impl : ( ':' ) ;
    public final void rule__Win__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3790:1: ( ( ':' ) )
            // InternalEsper.g:3791:1: ( ':' )
            {
            // InternalEsper.g:3791:1: ( ':' )
            // InternalEsper.g:3792:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinAccess().getColonKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__1__Impl"


    // $ANTLR start "rule__Win__Group__2"
    // InternalEsper.g:3801:1: rule__Win__Group__2 : rule__Win__Group__2__Impl ;
    public final void rule__Win__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3805:1: ( rule__Win__Group__2__Impl )
            // InternalEsper.g:3806:2: rule__Win__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Win__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__2"


    // $ANTLR start "rule__Win__Group__2__Impl"
    // InternalEsper.g:3812:1: rule__Win__Group__2__Impl : ( ( rule__Win__DefaultMethodAssignment_2 ) ) ;
    public final void rule__Win__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3816:1: ( ( ( rule__Win__DefaultMethodAssignment_2 ) ) )
            // InternalEsper.g:3817:1: ( ( rule__Win__DefaultMethodAssignment_2 ) )
            {
            // InternalEsper.g:3817:1: ( ( rule__Win__DefaultMethodAssignment_2 ) )
            // InternalEsper.g:3818:2: ( rule__Win__DefaultMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinAccess().getDefaultMethodAssignment_2()); 
            }
            // InternalEsper.g:3819:2: ( rule__Win__DefaultMethodAssignment_2 )
            // InternalEsper.g:3819:3: rule__Win__DefaultMethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Win__DefaultMethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinAccess().getDefaultMethodAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Group__2__Impl"


    // $ANTLR start "rule__FollowByWhere__Group_0__0"
    // InternalEsper.g:3828:1: rule__FollowByWhere__Group_0__0 : rule__FollowByWhere__Group_0__0__Impl rule__FollowByWhere__Group_0__1 ;
    public final void rule__FollowByWhere__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3832:1: ( rule__FollowByWhere__Group_0__0__Impl rule__FollowByWhere__Group_0__1 )
            // InternalEsper.g:3833:2: rule__FollowByWhere__Group_0__0__Impl rule__FollowByWhere__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__FollowByWhere__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__0"


    // $ANTLR start "rule__FollowByWhere__Group_0__0__Impl"
    // InternalEsper.g:3840:1: rule__FollowByWhere__Group_0__0__Impl : ( '(' ) ;
    public final void rule__FollowByWhere__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3844:1: ( ( '(' ) )
            // InternalEsper.g:3845:1: ( '(' )
            {
            // InternalEsper.g:3845:1: ( '(' )
            // InternalEsper.g:3846:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__0__Impl"


    // $ANTLR start "rule__FollowByWhere__Group_0__1"
    // InternalEsper.g:3855:1: rule__FollowByWhere__Group_0__1 : rule__FollowByWhere__Group_0__1__Impl rule__FollowByWhere__Group_0__2 ;
    public final void rule__FollowByWhere__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3859:1: ( rule__FollowByWhere__Group_0__1__Impl rule__FollowByWhere__Group_0__2 )
            // InternalEsper.g:3860:2: rule__FollowByWhere__Group_0__1__Impl rule__FollowByWhere__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__FollowByWhere__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__1"


    // $ANTLR start "rule__FollowByWhere__Group_0__1__Impl"
    // InternalEsper.g:3867:1: rule__FollowByWhere__Group_0__1__Impl : ( ruleFollowByWhere ) ;
    public final void rule__FollowByWhere__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3871:1: ( ( ruleFollowByWhere ) )
            // InternalEsper.g:3872:1: ( ruleFollowByWhere )
            {
            // InternalEsper.g:3872:1: ( ruleFollowByWhere )
            // InternalEsper.g:3873:2: ruleFollowByWhere
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getFollowByWhereParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowByWhere();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getFollowByWhereParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__1__Impl"


    // $ANTLR start "rule__FollowByWhere__Group_0__2"
    // InternalEsper.g:3882:1: rule__FollowByWhere__Group_0__2 : rule__FollowByWhere__Group_0__2__Impl ;
    public final void rule__FollowByWhere__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3886:1: ( rule__FollowByWhere__Group_0__2__Impl )
            // InternalEsper.g:3887:2: rule__FollowByWhere__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__2"


    // $ANTLR start "rule__FollowByWhere__Group_0__2__Impl"
    // InternalEsper.g:3893:1: rule__FollowByWhere__Group_0__2__Impl : ( ')' ) ;
    public final void rule__FollowByWhere__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3897:1: ( ( ')' ) )
            // InternalEsper.g:3898:1: ( ')' )
            {
            // InternalEsper.g:3898:1: ( ')' )
            // InternalEsper.g:3899:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_0__2__Impl"


    // $ANTLR start "rule__FollowByWhere__Group_1__0"
    // InternalEsper.g:3909:1: rule__FollowByWhere__Group_1__0 : rule__FollowByWhere__Group_1__0__Impl rule__FollowByWhere__Group_1__1 ;
    public final void rule__FollowByWhere__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3913:1: ( rule__FollowByWhere__Group_1__0__Impl rule__FollowByWhere__Group_1__1 )
            // InternalEsper.g:3914:2: rule__FollowByWhere__Group_1__0__Impl rule__FollowByWhere__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__FollowByWhere__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_1__0"


    // $ANTLR start "rule__FollowByWhere__Group_1__0__Impl"
    // InternalEsper.g:3921:1: rule__FollowByWhere__Group_1__0__Impl : ( 'where' ) ;
    public final void rule__FollowByWhere__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3925:1: ( ( 'where' ) )
            // InternalEsper.g:3926:1: ( 'where' )
            {
            // InternalEsper.g:3926:1: ( 'where' )
            // InternalEsper.g:3927:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getWhereKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getWhereKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_1__0__Impl"


    // $ANTLR start "rule__FollowByWhere__Group_1__1"
    // InternalEsper.g:3936:1: rule__FollowByWhere__Group_1__1 : rule__FollowByWhere__Group_1__1__Impl ;
    public final void rule__FollowByWhere__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3940:1: ( rule__FollowByWhere__Group_1__1__Impl )
            // InternalEsper.g:3941:2: rule__FollowByWhere__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_1__1"


    // $ANTLR start "rule__FollowByWhere__Group_1__1__Impl"
    // InternalEsper.g:3947:1: rule__FollowByWhere__Group_1__1__Impl : ( ( rule__FollowByWhere__TimerAssignment_1_1 ) ) ;
    public final void rule__FollowByWhere__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3951:1: ( ( ( rule__FollowByWhere__TimerAssignment_1_1 ) ) )
            // InternalEsper.g:3952:1: ( ( rule__FollowByWhere__TimerAssignment_1_1 ) )
            {
            // InternalEsper.g:3952:1: ( ( rule__FollowByWhere__TimerAssignment_1_1 ) )
            // InternalEsper.g:3953:2: ( rule__FollowByWhere__TimerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getTimerAssignment_1_1()); 
            }
            // InternalEsper.g:3954:2: ( rule__FollowByWhere__TimerAssignment_1_1 )
            // InternalEsper.g:3954:3: rule__FollowByWhere__TimerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowByWhere__TimerAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getTimerAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__Group_1__1__Impl"


    // $ANTLR start "rule__Timer__Group__0"
    // InternalEsper.g:3963:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3967:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // InternalEsper.g:3968:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Timer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Timer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__0"


    // $ANTLR start "rule__Timer__Group__0__Impl"
    // InternalEsper.g:3975:1: rule__Timer__Group__0__Impl : ( 'timer' ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3979:1: ( ( 'timer' ) )
            // InternalEsper.g:3980:1: ( 'timer' )
            {
            // InternalEsper.g:3980:1: ( 'timer' )
            // InternalEsper.g:3981:2: 'timer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerAccess().getTimerKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerAccess().getTimerKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__0__Impl"


    // $ANTLR start "rule__Timer__Group__1"
    // InternalEsper.g:3990:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:3994:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // InternalEsper.g:3995:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Timer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Timer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__1"


    // $ANTLR start "rule__Timer__Group__1__Impl"
    // InternalEsper.g:4002:1: rule__Timer__Group__1__Impl : ( ':' ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4006:1: ( ( ':' ) )
            // InternalEsper.g:4007:1: ( ':' )
            {
            // InternalEsper.g:4007:1: ( ':' )
            // InternalEsper.g:4008:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerAccess().getColonKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__1__Impl"


    // $ANTLR start "rule__Timer__Group__2"
    // InternalEsper.g:4017:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4021:1: ( rule__Timer__Group__2__Impl )
            // InternalEsper.g:4022:2: rule__Timer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__2"


    // $ANTLR start "rule__Timer__Group__2__Impl"
    // InternalEsper.g:4028:1: rule__Timer__Group__2__Impl : ( ( rule__Timer__DefaultMethodAssignment_2 ) ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4032:1: ( ( ( rule__Timer__DefaultMethodAssignment_2 ) ) )
            // InternalEsper.g:4033:1: ( ( rule__Timer__DefaultMethodAssignment_2 ) )
            {
            // InternalEsper.g:4033:1: ( ( rule__Timer__DefaultMethodAssignment_2 ) )
            // InternalEsper.g:4034:2: ( rule__Timer__DefaultMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerAccess().getDefaultMethodAssignment_2()); 
            }
            // InternalEsper.g:4035:2: ( rule__Timer__DefaultMethodAssignment_2 )
            // InternalEsper.g:4035:3: rule__Timer__DefaultMethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Timer__DefaultMethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerAccess().getDefaultMethodAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__2__Impl"


    // $ANTLR start "rule__GroupBy__Group__0"
    // InternalEsper.g:4044:1: rule__GroupBy__Group__0 : rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 ;
    public final void rule__GroupBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4048:1: ( rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 )
            // InternalEsper.g:4049:2: rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__GroupBy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__0"


    // $ANTLR start "rule__GroupBy__Group__0__Impl"
    // InternalEsper.g:4056:1: rule__GroupBy__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4060:1: ( ( 'group' ) )
            // InternalEsper.g:4061:1: ( 'group' )
            {
            // InternalEsper.g:4061:1: ( 'group' )
            // InternalEsper.g:4062:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByAccess().getGroupKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByAccess().getGroupKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__0__Impl"


    // $ANTLR start "rule__GroupBy__Group__1"
    // InternalEsper.g:4071:1: rule__GroupBy__Group__1 : rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 ;
    public final void rule__GroupBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4075:1: ( rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 )
            // InternalEsper.g:4076:2: rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__GroupBy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__1"


    // $ANTLR start "rule__GroupBy__Group__1__Impl"
    // InternalEsper.g:4083:1: rule__GroupBy__Group__1__Impl : ( 'by' ) ;
    public final void rule__GroupBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4087:1: ( ( 'by' ) )
            // InternalEsper.g:4088:1: ( 'by' )
            {
            // InternalEsper.g:4088:1: ( 'by' )
            // InternalEsper.g:4089:2: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByAccess().getByKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByAccess().getByKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__1__Impl"


    // $ANTLR start "rule__GroupBy__Group__2"
    // InternalEsper.g:4098:1: rule__GroupBy__Group__2 : rule__GroupBy__Group__2__Impl ;
    public final void rule__GroupBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4102:1: ( rule__GroupBy__Group__2__Impl )
            // InternalEsper.g:4103:2: rule__GroupBy__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__2"


    // $ANTLR start "rule__GroupBy__Group__2__Impl"
    // InternalEsper.g:4109:1: rule__GroupBy__Group__2__Impl : ( ( rule__GroupBy__AnythingAssignment_2 ) ) ;
    public final void rule__GroupBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4113:1: ( ( ( rule__GroupBy__AnythingAssignment_2 ) ) )
            // InternalEsper.g:4114:1: ( ( rule__GroupBy__AnythingAssignment_2 ) )
            {
            // InternalEsper.g:4114:1: ( ( rule__GroupBy__AnythingAssignment_2 ) )
            // InternalEsper.g:4115:2: ( rule__GroupBy__AnythingAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByAccess().getAnythingAssignment_2()); 
            }
            // InternalEsper.g:4116:2: ( rule__GroupBy__AnythingAssignment_2 )
            // InternalEsper.g:4116:3: rule__GroupBy__AnythingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__AnythingAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByAccess().getAnythingAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__2__Impl"


    // $ANTLR start "rule__Having__Group__0"
    // InternalEsper.g:4125:1: rule__Having__Group__0 : rule__Having__Group__0__Impl rule__Having__Group__1 ;
    public final void rule__Having__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4129:1: ( rule__Having__Group__0__Impl rule__Having__Group__1 )
            // InternalEsper.g:4130:2: rule__Having__Group__0__Impl rule__Having__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Having__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Having__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__0"


    // $ANTLR start "rule__Having__Group__0__Impl"
    // InternalEsper.g:4137:1: rule__Having__Group__0__Impl : ( 'having' ) ;
    public final void rule__Having__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4141:1: ( ( 'having' ) )
            // InternalEsper.g:4142:1: ( 'having' )
            {
            // InternalEsper.g:4142:1: ( 'having' )
            // InternalEsper.g:4143:2: 'having'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getHavingKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getHavingKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__0__Impl"


    // $ANTLR start "rule__Having__Group__1"
    // InternalEsper.g:4152:1: rule__Having__Group__1 : rule__Having__Group__1__Impl rule__Having__Group__2 ;
    public final void rule__Having__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4156:1: ( rule__Having__Group__1__Impl rule__Having__Group__2 )
            // InternalEsper.g:4157:2: rule__Having__Group__1__Impl rule__Having__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Having__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Having__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__1"


    // $ANTLR start "rule__Having__Group__1__Impl"
    // InternalEsper.g:4164:1: rule__Having__Group__1__Impl : ( ( rule__Having__DefaultMethodAssignment_1 ) ) ;
    public final void rule__Having__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4168:1: ( ( ( rule__Having__DefaultMethodAssignment_1 ) ) )
            // InternalEsper.g:4169:1: ( ( rule__Having__DefaultMethodAssignment_1 ) )
            {
            // InternalEsper.g:4169:1: ( ( rule__Having__DefaultMethodAssignment_1 ) )
            // InternalEsper.g:4170:2: ( rule__Having__DefaultMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getDefaultMethodAssignment_1()); 
            }
            // InternalEsper.g:4171:2: ( rule__Having__DefaultMethodAssignment_1 )
            // InternalEsper.g:4171:3: rule__Having__DefaultMethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Having__DefaultMethodAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getDefaultMethodAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__1__Impl"


    // $ANTLR start "rule__Having__Group__2"
    // InternalEsper.g:4179:1: rule__Having__Group__2 : rule__Having__Group__2__Impl rule__Having__Group__3 ;
    public final void rule__Having__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4183:1: ( rule__Having__Group__2__Impl rule__Having__Group__3 )
            // InternalEsper.g:4184:2: rule__Having__Group__2__Impl rule__Having__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Having__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Having__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__2"


    // $ANTLR start "rule__Having__Group__2__Impl"
    // InternalEsper.g:4191:1: rule__Having__Group__2__Impl : ( ( rule__Having__OperatorAssignment_2 ) ) ;
    public final void rule__Having__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4195:1: ( ( ( rule__Having__OperatorAssignment_2 ) ) )
            // InternalEsper.g:4196:1: ( ( rule__Having__OperatorAssignment_2 ) )
            {
            // InternalEsper.g:4196:1: ( ( rule__Having__OperatorAssignment_2 ) )
            // InternalEsper.g:4197:2: ( rule__Having__OperatorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getOperatorAssignment_2()); 
            }
            // InternalEsper.g:4198:2: ( rule__Having__OperatorAssignment_2 )
            // InternalEsper.g:4198:3: rule__Having__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Having__OperatorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getOperatorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__2__Impl"


    // $ANTLR start "rule__Having__Group__3"
    // InternalEsper.g:4206:1: rule__Having__Group__3 : rule__Having__Group__3__Impl ;
    public final void rule__Having__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4210:1: ( rule__Having__Group__3__Impl )
            // InternalEsper.g:4211:2: rule__Having__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Having__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__3"


    // $ANTLR start "rule__Having__Group__3__Impl"
    // InternalEsper.g:4217:1: rule__Having__Group__3__Impl : ( ( rule__Having__AnythingAssignment_3 ) ) ;
    public final void rule__Having__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4221:1: ( ( ( rule__Having__AnythingAssignment_3 ) ) )
            // InternalEsper.g:4222:1: ( ( rule__Having__AnythingAssignment_3 ) )
            {
            // InternalEsper.g:4222:1: ( ( rule__Having__AnythingAssignment_3 ) )
            // InternalEsper.g:4223:2: ( rule__Having__AnythingAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getAnythingAssignment_3()); 
            }
            // InternalEsper.g:4224:2: ( rule__Having__AnythingAssignment_3 )
            // InternalEsper.g:4224:3: rule__Having__AnythingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Having__AnythingAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getAnythingAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__Group__3__Impl"


    // $ANTLR start "rule__DefaultMethods__Group__0"
    // InternalEsper.g:4233:1: rule__DefaultMethods__Group__0 : rule__DefaultMethods__Group__0__Impl rule__DefaultMethods__Group__1 ;
    public final void rule__DefaultMethods__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4237:1: ( rule__DefaultMethods__Group__0__Impl rule__DefaultMethods__Group__1 )
            // InternalEsper.g:4238:2: rule__DefaultMethods__Group__0__Impl rule__DefaultMethods__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DefaultMethods__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__0"


    // $ANTLR start "rule__DefaultMethods__Group__0__Impl"
    // InternalEsper.g:4245:1: rule__DefaultMethods__Group__0__Impl : ( ( rule__DefaultMethods__NameAssignment_0 ) ) ;
    public final void rule__DefaultMethods__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4249:1: ( ( ( rule__DefaultMethods__NameAssignment_0 ) ) )
            // InternalEsper.g:4250:1: ( ( rule__DefaultMethods__NameAssignment_0 ) )
            {
            // InternalEsper.g:4250:1: ( ( rule__DefaultMethods__NameAssignment_0 ) )
            // InternalEsper.g:4251:2: ( rule__DefaultMethods__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getNameAssignment_0()); 
            }
            // InternalEsper.g:4252:2: ( rule__DefaultMethods__NameAssignment_0 )
            // InternalEsper.g:4252:3: rule__DefaultMethods__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__0__Impl"


    // $ANTLR start "rule__DefaultMethods__Group__1"
    // InternalEsper.g:4260:1: rule__DefaultMethods__Group__1 : rule__DefaultMethods__Group__1__Impl rule__DefaultMethods__Group__2 ;
    public final void rule__DefaultMethods__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4264:1: ( rule__DefaultMethods__Group__1__Impl rule__DefaultMethods__Group__2 )
            // InternalEsper.g:4265:2: rule__DefaultMethods__Group__1__Impl rule__DefaultMethods__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DefaultMethods__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__1"


    // $ANTLR start "rule__DefaultMethods__Group__1__Impl"
    // InternalEsper.g:4272:1: rule__DefaultMethods__Group__1__Impl : ( '(' ) ;
    public final void rule__DefaultMethods__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4276:1: ( ( '(' ) )
            // InternalEsper.g:4277:1: ( '(' )
            {
            // InternalEsper.g:4277:1: ( '(' )
            // InternalEsper.g:4278:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__1__Impl"


    // $ANTLR start "rule__DefaultMethods__Group__2"
    // InternalEsper.g:4287:1: rule__DefaultMethods__Group__2 : rule__DefaultMethods__Group__2__Impl rule__DefaultMethods__Group__3 ;
    public final void rule__DefaultMethods__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4291:1: ( rule__DefaultMethods__Group__2__Impl rule__DefaultMethods__Group__3 )
            // InternalEsper.g:4292:2: rule__DefaultMethods__Group__2__Impl rule__DefaultMethods__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DefaultMethods__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__2"


    // $ANTLR start "rule__DefaultMethods__Group__2__Impl"
    // InternalEsper.g:4299:1: rule__DefaultMethods__Group__2__Impl : ( ( rule__DefaultMethods__AnythingAssignment_2 ) ) ;
    public final void rule__DefaultMethods__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4303:1: ( ( ( rule__DefaultMethods__AnythingAssignment_2 ) ) )
            // InternalEsper.g:4304:1: ( ( rule__DefaultMethods__AnythingAssignment_2 ) )
            {
            // InternalEsper.g:4304:1: ( ( rule__DefaultMethods__AnythingAssignment_2 ) )
            // InternalEsper.g:4305:2: ( rule__DefaultMethods__AnythingAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getAnythingAssignment_2()); 
            }
            // InternalEsper.g:4306:2: ( rule__DefaultMethods__AnythingAssignment_2 )
            // InternalEsper.g:4306:3: rule__DefaultMethods__AnythingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__AnythingAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getAnythingAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__2__Impl"


    // $ANTLR start "rule__DefaultMethods__Group__3"
    // InternalEsper.g:4314:1: rule__DefaultMethods__Group__3 : rule__DefaultMethods__Group__3__Impl ;
    public final void rule__DefaultMethods__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4318:1: ( rule__DefaultMethods__Group__3__Impl )
            // InternalEsper.g:4319:2: rule__DefaultMethods__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultMethods__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__3"


    // $ANTLR start "rule__DefaultMethods__Group__3__Impl"
    // InternalEsper.g:4325:1: rule__DefaultMethods__Group__3__Impl : ( ')' ) ;
    public final void rule__DefaultMethods__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4329:1: ( ( ')' ) )
            // InternalEsper.g:4330:1: ( ')' )
            {
            // InternalEsper.g:4330:1: ( ')' )
            // InternalEsper.g:4331:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__Group__3__Impl"


    // $ANTLR start "rule__Anything__Group__0"
    // InternalEsper.g:4341:1: rule__Anything__Group__0 : rule__Anything__Group__0__Impl rule__Anything__Group__1 ;
    public final void rule__Anything__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4345:1: ( rule__Anything__Group__0__Impl rule__Anything__Group__1 )
            // InternalEsper.g:4346:2: rule__Anything__Group__0__Impl rule__Anything__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Anything__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Anything__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group__0"


    // $ANTLR start "rule__Anything__Group__0__Impl"
    // InternalEsper.g:4353:1: rule__Anything__Group__0__Impl : ( () ) ;
    public final void rule__Anything__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4357:1: ( ( () ) )
            // InternalEsper.g:4358:1: ( () )
            {
            // InternalEsper.g:4358:1: ( () )
            // InternalEsper.g:4359:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getAnythingAction_0()); 
            }
            // InternalEsper.g:4360:2: ()
            // InternalEsper.g:4360:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getAnythingAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group__0__Impl"


    // $ANTLR start "rule__Anything__Group__1"
    // InternalEsper.g:4368:1: rule__Anything__Group__1 : rule__Anything__Group__1__Impl ;
    public final void rule__Anything__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4372:1: ( rule__Anything__Group__1__Impl )
            // InternalEsper.g:4373:2: rule__Anything__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anything__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group__1"


    // $ANTLR start "rule__Anything__Group__1__Impl"
    // InternalEsper.g:4379:1: rule__Anything__Group__1__Impl : ( ( rule__Anything__Group_1__0 )* ) ;
    public final void rule__Anything__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4383:1: ( ( ( rule__Anything__Group_1__0 )* ) )
            // InternalEsper.g:4384:1: ( ( rule__Anything__Group_1__0 )* )
            {
            // InternalEsper.g:4384:1: ( ( rule__Anything__Group_1__0 )* )
            // InternalEsper.g:4385:2: ( rule__Anything__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getGroup_1()); 
            }
            // InternalEsper.g:4386:2: ( rule__Anything__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_ANY_OTHER)||LA30_0==11||(LA30_0>=19 && LA30_0<=34)||LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEsper.g:4386:3: rule__Anything__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Anything__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group__1__Impl"


    // $ANTLR start "rule__Anything__Group_1__0"
    // InternalEsper.g:4395:1: rule__Anything__Group_1__0 : rule__Anything__Group_1__0__Impl ;
    public final void rule__Anything__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4399:1: ( rule__Anything__Group_1__0__Impl )
            // InternalEsper.g:4400:2: rule__Anything__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anything__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group_1__0"


    // $ANTLR start "rule__Anything__Group_1__0__Impl"
    // InternalEsper.g:4406:1: rule__Anything__Group_1__0__Impl : ( ( rule__Anything__Alternatives_1_0 ) ) ;
    public final void rule__Anything__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4410:1: ( ( ( rule__Anything__Alternatives_1_0 ) ) )
            // InternalEsper.g:4411:1: ( ( rule__Anything__Alternatives_1_0 ) )
            {
            // InternalEsper.g:4411:1: ( ( rule__Anything__Alternatives_1_0 ) )
            // InternalEsper.g:4412:2: ( rule__Anything__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getAlternatives_1_0()); 
            }
            // InternalEsper.g:4413:2: ( rule__Anything__Alternatives_1_0 )
            // InternalEsper.g:4413:3: rule__Anything__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Anything__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__Group_1__0__Impl"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__0"
    // InternalEsper.g:4422:1: rule__ExtraParenthesisRule__Group__0 : rule__ExtraParenthesisRule__Group__0__Impl rule__ExtraParenthesisRule__Group__1 ;
    public final void rule__ExtraParenthesisRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4426:1: ( rule__ExtraParenthesisRule__Group__0__Impl rule__ExtraParenthesisRule__Group__1 )
            // InternalEsper.g:4427:2: rule__ExtraParenthesisRule__Group__0__Impl rule__ExtraParenthesisRule__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ExtraParenthesisRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtraParenthesisRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__0"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__0__Impl"
    // InternalEsper.g:4434:1: rule__ExtraParenthesisRule__Group__0__Impl : ( '(' ) ;
    public final void rule__ExtraParenthesisRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4438:1: ( ( '(' ) )
            // InternalEsper.g:4439:1: ( '(' )
            {
            // InternalEsper.g:4439:1: ( '(' )
            // InternalEsper.g:4440:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtraParenthesisRuleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtraParenthesisRuleAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__0__Impl"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__1"
    // InternalEsper.g:4449:1: rule__ExtraParenthesisRule__Group__1 : rule__ExtraParenthesisRule__Group__1__Impl rule__ExtraParenthesisRule__Group__2 ;
    public final void rule__ExtraParenthesisRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4453:1: ( rule__ExtraParenthesisRule__Group__1__Impl rule__ExtraParenthesisRule__Group__2 )
            // InternalEsper.g:4454:2: rule__ExtraParenthesisRule__Group__1__Impl rule__ExtraParenthesisRule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExtraParenthesisRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtraParenthesisRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__1"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__1__Impl"
    // InternalEsper.g:4461:1: rule__ExtraParenthesisRule__Group__1__Impl : ( ruleAnything ) ;
    public final void rule__ExtraParenthesisRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4465:1: ( ( ruleAnything ) )
            // InternalEsper.g:4466:1: ( ruleAnything )
            {
            // InternalEsper.g:4466:1: ( ruleAnything )
            // InternalEsper.g:4467:2: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtraParenthesisRuleAccess().getAnythingParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtraParenthesisRuleAccess().getAnythingParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__1__Impl"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__2"
    // InternalEsper.g:4476:1: rule__ExtraParenthesisRule__Group__2 : rule__ExtraParenthesisRule__Group__2__Impl ;
    public final void rule__ExtraParenthesisRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4480:1: ( rule__ExtraParenthesisRule__Group__2__Impl )
            // InternalEsper.g:4481:2: rule__ExtraParenthesisRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtraParenthesisRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__2"


    // $ANTLR start "rule__ExtraParenthesisRule__Group__2__Impl"
    // InternalEsper.g:4487:1: rule__ExtraParenthesisRule__Group__2__Impl : ( ')' ) ;
    public final void rule__ExtraParenthesisRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4491:1: ( ( ')' ) )
            // InternalEsper.g:4492:1: ( ')' )
            {
            // InternalEsper.g:4492:1: ( ')' )
            // InternalEsper.g:4493:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtraParenthesisRuleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtraParenthesisRuleAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraParenthesisRule__Group__2__Impl"


    // $ANTLR start "rule__Domainmodel__RulesAssignment_0"
    // InternalEsper.g:4503:1: rule__Domainmodel__RulesAssignment_0 : ( ruleRuleParts ) ;
    public final void rule__Domainmodel__RulesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4507:1: ( ( ruleRuleParts ) )
            // InternalEsper.g:4508:2: ( ruleRuleParts )
            {
            // InternalEsper.g:4508:2: ( ruleRuleParts )
            // InternalEsper.g:4509:3: ruleRuleParts
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelAccess().getRulesRulePartsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleParts();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelAccess().getRulesRulePartsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__RulesAssignment_0"


    // $ANTLR start "rule__Domainmodel__EventsAssignment_1"
    // InternalEsper.g:4518:1: rule__Domainmodel__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Domainmodel__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4522:1: ( ( ruleEvent ) )
            // InternalEsper.g:4523:2: ( ruleEvent )
            {
            // InternalEsper.g:4523:2: ( ruleEvent )
            // InternalEsper.g:4524:3: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelAccess().getEventsEventParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelAccess().getEventsEventParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__EventsAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalEsper.g:4533:1: rule__Event__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4537:1: ( ( RULE_ID ) )
            // InternalEsper.g:4538:2: ( RULE_ID )
            {
            // InternalEsper.g:4538:2: ( RULE_ID )
            // InternalEsper.g:4539:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__EventattributesAssignment_3"
    // InternalEsper.g:4548:1: rule__Event__EventattributesAssignment_3 : ( ruleAttributes ) ;
    public final void rule__Event__EventattributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4552:1: ( ( ruleAttributes ) )
            // InternalEsper.g:4553:2: ( ruleAttributes )
            {
            // InternalEsper.g:4553:2: ( ruleAttributes )
            // InternalEsper.g:4554:3: ruleAttributes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventattributesAttributesParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventattributesAttributesParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventattributesAssignment_3"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // InternalEsper.g:4563:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttributesDefinition ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4567:1: ( ( ruleAttributesDefinition ) )
            // InternalEsper.g:4568:2: ( ruleAttributesDefinition )
            {
            // InternalEsper.g:4568:2: ( ruleAttributesDefinition )
            // InternalEsper.g:4569:3: ruleAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributeAssignment_1"


    // $ANTLR start "rule__Attributes__AttributeAssignment_2_1"
    // InternalEsper.g:4578:1: rule__Attributes__AttributeAssignment_2_1 : ( ruleAttributesDefinition ) ;
    public final void rule__Attributes__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4582:1: ( ( ruleAttributesDefinition ) )
            // InternalEsper.g:4583:2: ( ruleAttributesDefinition )
            {
            // InternalEsper.g:4583:2: ( ruleAttributesDefinition )
            // InternalEsper.g:4584:3: ruleAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getAttributeAttributesDefinitionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributeAssignment_2_1"


    // $ANTLR start "rule__AttributesDefinition__NameAssignment_0"
    // InternalEsper.g:4593:1: rule__AttributesDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributesDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4597:1: ( ( RULE_ID ) )
            // InternalEsper.g:4598:2: ( RULE_ID )
            {
            // InternalEsper.g:4598:2: ( RULE_ID )
            // InternalEsper.g:4599:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__NameAssignment_0"


    // $ANTLR start "rule__AttributesDefinition__TypeAssignment_1"
    // InternalEsper.g:4608:1: rule__AttributesDefinition__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributesDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4612:1: ( ( RULE_ID ) )
            // InternalEsper.g:4613:2: ( RULE_ID )
            {
            // InternalEsper.g:4613:2: ( RULE_ID )
            // InternalEsper.g:4614:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesDefinitionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesDefinitionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributesDefinition__TypeAssignment_1"


    // $ANTLR start "rule__RuleParts__NameRuleAssignment_0"
    // InternalEsper.g:4623:1: rule__RuleParts__NameRuleAssignment_0 : ( ruleName ) ;
    public final void rule__RuleParts__NameRuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4627:1: ( ( ruleName ) )
            // InternalEsper.g:4628:2: ( ruleName )
            {
            // InternalEsper.g:4628:2: ( ruleName )
            // InternalEsper.g:4629:3: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getNameRuleNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getNameRuleNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__NameRuleAssignment_0"


    // $ANTLR start "rule__RuleParts__InsertAssignment_1"
    // InternalEsper.g:4638:1: rule__RuleParts__InsertAssignment_1 : ( ruleInsert ) ;
    public final void rule__RuleParts__InsertAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4642:1: ( ( ruleInsert ) )
            // InternalEsper.g:4643:2: ( ruleInsert )
            {
            // InternalEsper.g:4643:2: ( ruleInsert )
            // InternalEsper.g:4644:3: ruleInsert
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getInsertInsertParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInsert();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getInsertInsertParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__InsertAssignment_1"


    // $ANTLR start "rule__RuleParts__PriorityAssignment_2"
    // InternalEsper.g:4653:1: rule__RuleParts__PriorityAssignment_2 : ( rulePriority ) ;
    public final void rule__RuleParts__PriorityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4657:1: ( ( rulePriority ) )
            // InternalEsper.g:4658:2: ( rulePriority )
            {
            // InternalEsper.g:4658:2: ( rulePriority )
            // InternalEsper.g:4659:3: rulePriority
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getPriorityPriorityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getPriorityPriorityParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__PriorityAssignment_2"


    // $ANTLR start "rule__RuleParts__SelectRuleAssignment_3"
    // InternalEsper.g:4668:1: rule__RuleParts__SelectRuleAssignment_3 : ( ruleSelect ) ;
    public final void rule__RuleParts__SelectRuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4672:1: ( ( ruleSelect ) )
            // InternalEsper.g:4673:2: ( ruleSelect )
            {
            // InternalEsper.g:4673:2: ( ruleSelect )
            // InternalEsper.g:4674:3: ruleSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getSelectRuleSelectParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getSelectRuleSelectParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__SelectRuleAssignment_3"


    // $ANTLR start "rule__RuleParts__FromRuleAssignment_4"
    // InternalEsper.g:4683:1: rule__RuleParts__FromRuleAssignment_4 : ( ruleFrom ) ;
    public final void rule__RuleParts__FromRuleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4687:1: ( ( ruleFrom ) )
            // InternalEsper.g:4688:2: ( ruleFrom )
            {
            // InternalEsper.g:4688:2: ( ruleFrom )
            // InternalEsper.g:4689:3: ruleFrom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getFromRuleFromParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFrom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getFromRuleFromParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__FromRuleAssignment_4"


    // $ANTLR start "rule__RuleParts__GroupByAssignment_5"
    // InternalEsper.g:4698:1: rule__RuleParts__GroupByAssignment_5 : ( ruleGroupBy ) ;
    public final void rule__RuleParts__GroupByAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4702:1: ( ( ruleGroupBy ) )
            // InternalEsper.g:4703:2: ( ruleGroupBy )
            {
            // InternalEsper.g:4703:2: ( ruleGroupBy )
            // InternalEsper.g:4704:3: ruleGroupBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getGroupByGroupByParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGroupBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getGroupByGroupByParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__GroupByAssignment_5"


    // $ANTLR start "rule__RuleParts__HavingAssignment_6"
    // InternalEsper.g:4713:1: rule__RuleParts__HavingAssignment_6 : ( ruleHaving ) ;
    public final void rule__RuleParts__HavingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4717:1: ( ( ruleHaving ) )
            // InternalEsper.g:4718:2: ( ruleHaving )
            {
            // InternalEsper.g:4718:2: ( ruleHaving )
            // InternalEsper.g:4719:3: ruleHaving
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePartsAccess().getHavingHavingParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHaving();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePartsAccess().getHavingHavingParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleParts__HavingAssignment_6"


    // $ANTLR start "rule__Insert__NameAssignment_2"
    // InternalEsper.g:4728:1: rule__Insert__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Insert__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4732:1: ( ( RULE_ID ) )
            // InternalEsper.g:4733:2: ( RULE_ID )
            {
            // InternalEsper.g:4733:2: ( RULE_ID )
            // InternalEsper.g:4734:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__NameAssignment_2"


    // $ANTLR start "rule__Name__NameAssignment_2"
    // InternalEsper.g:4743:1: rule__Name__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Name__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4747:1: ( ( RULE_STRING ) )
            // InternalEsper.g:4748:2: ( RULE_STRING )
            {
            // InternalEsper.g:4748:2: ( RULE_STRING )
            // InternalEsper.g:4749:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__NameAssignment_2"


    // $ANTLR start "rule__Priority__PriorityIntAssignment_2"
    // InternalEsper.g:4758:1: rule__Priority__PriorityIntAssignment_2 : ( RULE_INT ) ;
    public final void rule__Priority__PriorityIntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4762:1: ( ( RULE_INT ) )
            // InternalEsper.g:4763:2: ( RULE_INT )
            {
            // InternalEsper.g:4763:2: ( RULE_INT )
            // InternalEsper.g:4764:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPriorityAccess().getPriorityIntINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPriorityAccess().getPriorityIntINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__PriorityIntAssignment_2"


    // $ANTLR start "rule__Select__SelectAttributesAssignment_0_1_0"
    // InternalEsper.g:4773:1: rule__Select__SelectAttributesAssignment_0_1_0 : ( ruleSelectAttributesDefinition ) ;
    public final void rule__Select__SelectAttributesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4777:1: ( ( ruleSelectAttributesDefinition ) )
            // InternalEsper.g:4778:2: ( ruleSelectAttributesDefinition )
            {
            // InternalEsper.g:4778:2: ( ruleSelectAttributesDefinition )
            // InternalEsper.g:4779:3: ruleSelectAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAttributesAssignment_0_1_0"


    // $ANTLR start "rule__Select__AliasAssignment_0_1_1_1"
    // InternalEsper.g:4788:1: rule__Select__AliasAssignment_0_1_1_1 : ( ruleValidID ) ;
    public final void rule__Select__AliasAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4792:1: ( ( ruleValidID ) )
            // InternalEsper.g:4793:2: ( ruleValidID )
            {
            // InternalEsper.g:4793:2: ( ruleValidID )
            // InternalEsper.g:4794:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__AliasAssignment_0_1_1_1"


    // $ANTLR start "rule__Select__SelectAttributesAssignment_0_2_1"
    // InternalEsper.g:4803:1: rule__Select__SelectAttributesAssignment_0_2_1 : ( ruleSelectAttributesDefinition ) ;
    public final void rule__Select__SelectAttributesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4807:1: ( ( ruleSelectAttributesDefinition ) )
            // InternalEsper.g:4808:2: ( ruleSelectAttributesDefinition )
            {
            // InternalEsper.g:4808:2: ( ruleSelectAttributesDefinition )
            // InternalEsper.g:4809:3: ruleSelectAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectAttributesSelectAttributesDefinitionParserRuleCall_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAttributesAssignment_0_2_1"


    // $ANTLR start "rule__Select__AliasAssignment_0_2_2_1"
    // InternalEsper.g:4818:1: rule__Select__AliasAssignment_0_2_2_1 : ( ruleValidID ) ;
    public final void rule__Select__AliasAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4822:1: ( ( ruleValidID ) )
            // InternalEsper.g:4823:2: ( ruleValidID )
            {
            // InternalEsper.g:4823:2: ( ruleValidID )
            // InternalEsper.g:4824:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAliasValidIDParserRuleCall_0_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__AliasAssignment_0_2_2_1"


    // $ANTLR start "rule__Select__AsteriskAssignment_1"
    // InternalEsper.g:4833:1: rule__Select__AsteriskAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Select__AsteriskAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4837:1: ( ( ( '*' ) ) )
            // InternalEsper.g:4838:2: ( ( '*' ) )
            {
            // InternalEsper.g:4838:2: ( ( '*' ) )
            // InternalEsper.g:4839:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAsteriskAsteriskKeyword_1_0()); 
            }
            // InternalEsper.g:4840:3: ( '*' )
            // InternalEsper.g:4841:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getAsteriskAsteriskKeyword_1_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAsteriskAsteriskKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getAsteriskAsteriskKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__AsteriskAssignment_1"


    // $ANTLR start "rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0"
    // InternalEsper.g:4852:1: rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0 : ( ruleSingleSelectDefinition ) ;
    public final void rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4856:1: ( ( ruleSingleSelectDefinition ) )
            // InternalEsper.g:4857:2: ( ruleSingleSelectDefinition )
            {
            // InternalEsper.g:4857:2: ( ruleSingleSelectDefinition )
            // InternalEsper.g:4858:3: ruleSingleSelectDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionSingleSelectDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleSelectDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionAccess().getSingleSelectDefinitionSingleSelectDefinitionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindSelectAttributesDefinition__SingleSelectDefinitionAssignment_0"


    // $ANTLR start "rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1"
    // InternalEsper.g:4867:1: rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1 : ( ruleDefaultMethods ) ;
    public final void rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4871:1: ( ( ruleDefaultMethods ) )
            // InternalEsper.g:4872:2: ( ruleDefaultMethods )
            {
            // InternalEsper.g:4872:2: ( ruleDefaultMethods )
            // InternalEsper.g:4873:3: ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindSelectAttributesDefinition__DefaultMethodAssignment_1"


    // $ANTLR start "rule__KindSelectAttributesDefinition__IntAssignment_2"
    // InternalEsper.g:4882:1: rule__KindSelectAttributesDefinition__IntAssignment_2 : ( RULE_INT ) ;
    public final void rule__KindSelectAttributesDefinition__IntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4886:1: ( ( RULE_INT ) )
            // InternalEsper.g:4887:2: ( RULE_INT )
            {
            // InternalEsper.g:4887:2: ( RULE_INT )
            // InternalEsper.g:4888:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionAccess().getIntINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionAccess().getIntINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindSelectAttributesDefinition__IntAssignment_2"


    // $ANTLR start "rule__KindSelectAttributesDefinition__StringAssignment_3"
    // InternalEsper.g:4897:1: rule__KindSelectAttributesDefinition__StringAssignment_3 : ( RULE_STRING ) ;
    public final void rule__KindSelectAttributesDefinition__StringAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4901:1: ( ( RULE_STRING ) )
            // InternalEsper.g:4902:2: ( RULE_STRING )
            {
            // InternalEsper.g:4902:2: ( RULE_STRING )
            // InternalEsper.g:4903:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKindSelectAttributesDefinitionAccess().getStringSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKindSelectAttributesDefinitionAccess().getStringSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindSelectAttributesDefinition__StringAssignment_3"


    // $ANTLR start "rule__SelectAttributesDefinition__RightSideAssignment_0"
    // InternalEsper.g:4912:1: rule__SelectAttributesDefinition__RightSideAssignment_0 : ( ruleKindSelectAttributesDefinition ) ;
    public final void rule__SelectAttributesDefinition__RightSideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4916:1: ( ( ruleKindSelectAttributesDefinition ) )
            // InternalEsper.g:4917:2: ( ruleKindSelectAttributesDefinition )
            {
            // InternalEsper.g:4917:2: ( ruleKindSelectAttributesDefinition )
            // InternalEsper.g:4918:3: ruleKindSelectAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideKindSelectAttributesDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKindSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getRightSideKindSelectAttributesDefinitionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__RightSideAssignment_0"


    // $ANTLR start "rule__SelectAttributesDefinition__OperatorAssignment_1_0"
    // InternalEsper.g:4927:1: rule__SelectAttributesDefinition__OperatorAssignment_1_0 : ( ruleOperators ) ;
    public final void rule__SelectAttributesDefinition__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4931:1: ( ( ruleOperators ) )
            // InternalEsper.g:4932:2: ( ruleOperators )
            {
            // InternalEsper.g:4932:2: ( ruleOperators )
            // InternalEsper.g:4933:3: ruleOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorOperatorsEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getOperatorOperatorsEnumRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__OperatorAssignment_1_0"


    // $ANTLR start "rule__SelectAttributesDefinition__LeftSideAssignment_1_1"
    // InternalEsper.g:4942:1: rule__SelectAttributesDefinition__LeftSideAssignment_1_1 : ( ruleKindSelectAttributesDefinition ) ;
    public final void rule__SelectAttributesDefinition__LeftSideAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4946:1: ( ( ruleKindSelectAttributesDefinition ) )
            // InternalEsper.g:4947:2: ( ruleKindSelectAttributesDefinition )
            {
            // InternalEsper.g:4947:2: ( ruleKindSelectAttributesDefinition )
            // InternalEsper.g:4948:3: ruleKindSelectAttributesDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideKindSelectAttributesDefinitionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKindSelectAttributesDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAttributesDefinitionAccess().getLeftSideKindSelectAttributesDefinitionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttributesDefinition__LeftSideAssignment_1_1"


    // $ANTLR start "rule__SingleSelectDefinition__EventAssignment_0"
    // InternalEsper.g:4957:1: rule__SingleSelectDefinition__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SingleSelectDefinition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4961:1: ( ( ( RULE_ID ) ) )
            // InternalEsper.g:4962:2: ( ( RULE_ID ) )
            {
            // InternalEsper.g:4962:2: ( ( RULE_ID ) )
            // InternalEsper.g:4963:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getEventSingleDefinitionCrossReference_0_0()); 
            }
            // InternalEsper.g:4964:3: ( RULE_ID )
            // InternalEsper.g:4965:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getEventSingleDefinitionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getEventSingleDefinitionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getEventSingleDefinitionCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__EventAssignment_0"


    // $ANTLR start "rule__SingleSelectDefinition__AttributeAssignment_2_0"
    // InternalEsper.g:4976:1: rule__SingleSelectDefinition__AttributeAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SingleSelectDefinition__AttributeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4980:1: ( ( RULE_ID ) )
            // InternalEsper.g:4981:2: ( RULE_ID )
            {
            // InternalEsper.g:4981:2: ( RULE_ID )
            // InternalEsper.g:4982:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleSelectDefinitionAccess().getAttributeIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleSelectDefinitionAccess().getAttributeIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelectDefinition__AttributeAssignment_2_0"


    // $ANTLR start "rule__From__EventAssignment_1_0_0"
    // InternalEsper.g:4991:1: rule__From__EventAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__From__EventAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:4995:1: ( ( ( RULE_ID ) ) )
            // InternalEsper.g:4996:2: ( ( RULE_ID ) )
            {
            // InternalEsper.g:4996:2: ( ( RULE_ID ) )
            // InternalEsper.g:4997:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getEventEventCrossReference_1_0_0_0()); 
            }
            // InternalEsper.g:4998:3: ( RULE_ID )
            // InternalEsper.g:4999:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getEventEventIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getEventEventIDTerminalRuleCall_1_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getEventEventCrossReference_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__EventAssignment_1_0_0"


    // $ANTLR start "rule__From__AnythingAssignment_1_0_1_0_1"
    // InternalEsper.g:5010:1: rule__From__AnythingAssignment_1_0_1_0_1 : ( ruleAnything ) ;
    public final void rule__From__AnythingAssignment_1_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5014:1: ( ( ruleAnything ) )
            // InternalEsper.g:5015:2: ( ruleAnything )
            {
            // InternalEsper.g:5015:2: ( ruleAnything )
            // InternalEsper.g:5016:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__AnythingAssignment_1_0_1_0_1"


    // $ANTLR start "rule__From__AnythingAssignment_1_0_1_1_1"
    // InternalEsper.g:5025:1: rule__From__AnythingAssignment_1_0_1_1_1 : ( ruleAnything ) ;
    public final void rule__From__AnythingAssignment_1_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5029:1: ( ( ruleAnything ) )
            // InternalEsper.g:5030:2: ( ruleAnything )
            {
            // InternalEsper.g:5030:2: ( ruleAnything )
            // InternalEsper.g:5031:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getAnythingAnythingParserRuleCall_1_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__AnythingAssignment_1_0_1_1_1"


    // $ANTLR start "rule__From__PatternAssignment_1_1"
    // InternalEsper.g:5040:1: rule__From__PatternAssignment_1_1 : ( rulePattern ) ;
    public final void rule__From__PatternAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5044:1: ( ( rulePattern ) )
            // InternalEsper.g:5045:2: ( rulePattern )
            {
            // InternalEsper.g:5045:2: ( rulePattern )
            // InternalEsper.g:5046:3: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAccess().getPatternPatternParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAccess().getPatternPatternParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__PatternAssignment_1_1"


    // $ANTLR start "rule__Pattern__JoinFollowByAssignment_2"
    // InternalEsper.g:5055:1: rule__Pattern__JoinFollowByAssignment_2 : ( ruleJoinFollowBy ) ;
    public final void rule__Pattern__JoinFollowByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5059:1: ( ( ruleJoinFollowBy ) )
            // InternalEsper.g:5060:2: ( ruleJoinFollowBy )
            {
            // InternalEsper.g:5060:2: ( ruleJoinFollowBy )
            // InternalEsper.g:5061:3: ruleJoinFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getJoinFollowByJoinFollowByParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJoinFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getJoinFollowByJoinFollowByParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__JoinFollowByAssignment_2"


    // $ANTLR start "rule__Pattern__WinAssignment_4_1"
    // InternalEsper.g:5070:1: rule__Pattern__WinAssignment_4_1 : ( ruleWin ) ;
    public final void rule__Pattern__WinAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5074:1: ( ( ruleWin ) )
            // InternalEsper.g:5075:2: ( ruleWin )
            {
            // InternalEsper.g:5075:2: ( ruleWin )
            // InternalEsper.g:5076:3: ruleWin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getWinWinParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getWinWinParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__WinAssignment_4_1"


    // $ANTLR start "rule__JoinFollowBy__FollowsByJoinListAssignment_0"
    // InternalEsper.g:5085:1: rule__JoinFollowBy__FollowsByJoinListAssignment_0 : ( ruleAbstractFollowBy ) ;
    public final void rule__JoinFollowBy__FollowsByJoinListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5089:1: ( ( ruleAbstractFollowBy ) )
            // InternalEsper.g:5090:2: ( ruleAbstractFollowBy )
            {
            // InternalEsper.g:5090:2: ( ruleAbstractFollowBy )
            // InternalEsper.g:5091:3: ruleAbstractFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__FollowsByJoinListAssignment_0"


    // $ANTLR start "rule__JoinFollowBy__OperatorAssignment_1_0"
    // InternalEsper.g:5100:1: rule__JoinFollowBy__OperatorAssignment_1_0 : ( ruleOperators ) ;
    public final void rule__JoinFollowBy__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5104:1: ( ( ruleOperators ) )
            // InternalEsper.g:5105:2: ( ruleOperators )
            {
            // InternalEsper.g:5105:2: ( ruleOperators )
            // InternalEsper.g:5106:3: ruleOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getOperatorOperatorsEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getOperatorOperatorsEnumRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__OperatorAssignment_1_0"


    // $ANTLR start "rule__JoinFollowBy__FollowsByJoinListAssignment_1_1"
    // InternalEsper.g:5115:1: rule__JoinFollowBy__FollowsByJoinListAssignment_1_1 : ( ruleAbstractFollowBy ) ;
    public final void rule__JoinFollowBy__FollowsByJoinListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5119:1: ( ( ruleAbstractFollowBy ) )
            // InternalEsper.g:5120:2: ( ruleAbstractFollowBy )
            {
            // InternalEsper.g:5120:2: ( ruleAbstractFollowBy )
            // InternalEsper.g:5121:3: ruleAbstractFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJoinFollowByAccess().getFollowsByJoinListAbstractFollowByParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFollowBy__FollowsByJoinListAssignment_1_1"


    // $ANTLR start "rule__AbstractFollowBy__FollowByAssignment_0_0"
    // InternalEsper.g:5130:1: rule__AbstractFollowBy__FollowByAssignment_0_0 : ( ruleFollowBy ) ;
    public final void rule__AbstractFollowBy__FollowByAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5134:1: ( ( ruleFollowBy ) )
            // InternalEsper.g:5135:2: ( ruleFollowBy )
            {
            // InternalEsper.g:5135:2: ( ruleFollowBy )
            // InternalEsper.g:5136:3: ruleFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__FollowByAssignment_0_0"


    // $ANTLR start "rule__AbstractFollowBy__FollowByAssignment_0_1_1"
    // InternalEsper.g:5145:1: rule__AbstractFollowBy__FollowByAssignment_0_1_1 : ( ruleFollowBy ) ;
    public final void rule__AbstractFollowBy__FollowByAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5149:1: ( ( ruleFollowBy ) )
            // InternalEsper.g:5150:2: ( ruleFollowBy )
            {
            // InternalEsper.g:5150:2: ( ruleFollowBy )
            // InternalEsper.g:5151:3: ruleFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getFollowByFollowByParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__FollowByAssignment_0_1_1"


    // $ANTLR start "rule__AbstractFollowBy__WherePartAssignment_1"
    // InternalEsper.g:5160:1: rule__AbstractFollowBy__WherePartAssignment_1 : ( ruleFollowByWhere ) ;
    public final void rule__AbstractFollowBy__WherePartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5164:1: ( ( ruleFollowByWhere ) )
            // InternalEsper.g:5165:2: ( ruleFollowByWhere )
            {
            // InternalEsper.g:5165:2: ( ruleFollowByWhere )
            // InternalEsper.g:5166:3: ruleFollowByWhere
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractFollowByAccess().getWherePartFollowByWhereParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowByWhere();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractFollowByAccess().getWherePartFollowByWhereParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFollowBy__WherePartAssignment_1"


    // $ANTLR start "rule__FollowBy__LeftSideAssignment_0"
    // InternalEsper.g:5175:1: rule__FollowBy__LeftSideAssignment_0 : ( ruleTerminalExpression ) ;
    public final void rule__FollowBy__LeftSideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5179:1: ( ( ruleTerminalExpression ) )
            // InternalEsper.g:5180:2: ( ruleTerminalExpression )
            {
            // InternalEsper.g:5180:2: ( ruleTerminalExpression )
            // InternalEsper.g:5181:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getLeftSideTerminalExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getLeftSideTerminalExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__LeftSideAssignment_0"


    // $ANTLR start "rule__FollowBy__RightSideAssignment_1_1"
    // InternalEsper.g:5190:1: rule__FollowBy__RightSideAssignment_1_1 : ( ruleTerminalExpression ) ;
    public final void rule__FollowBy__RightSideAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5194:1: ( ( ruleTerminalExpression ) )
            // InternalEsper.g:5195:2: ( ruleTerminalExpression )
            {
            // InternalEsper.g:5195:2: ( ruleTerminalExpression )
            // InternalEsper.g:5196:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByAccess().getRightSideTerminalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByAccess().getRightSideTerminalExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowBy__RightSideAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__EveryAssignment_0_0"
    // InternalEsper.g:5205:1: rule__TerminalExpression__EveryAssignment_0_0 : ( ( 'every' ) ) ;
    public final void rule__TerminalExpression__EveryAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5209:1: ( ( ( 'every' ) ) )
            // InternalEsper.g:5210:2: ( ( 'every' ) )
            {
            // InternalEsper.g:5210:2: ( ( 'every' ) )
            // InternalEsper.g:5211:3: ( 'every' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getEveryEveryKeyword_0_0_0()); 
            }
            // InternalEsper.g:5212:3: ( 'every' )
            // InternalEsper.g:5213:4: 'every'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getEveryEveryKeyword_0_0_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getEveryEveryKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getEveryEveryKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__EveryAssignment_0_0"


    // $ANTLR start "rule__TerminalExpression__EveryExpressionAssignment_0_1"
    // InternalEsper.g:5224:1: rule__TerminalExpression__EveryExpressionAssignment_0_1 : ( ruleFollowBy ) ;
    public final void rule__TerminalExpression__EveryExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5228:1: ( ( ruleFollowBy ) )
            // InternalEsper.g:5229:2: ( ruleFollowBy )
            {
            // InternalEsper.g:5229:2: ( ruleFollowBy )
            // InternalEsper.g:5230:3: ruleFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getEveryExpressionFollowByParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getEveryExpressionFollowByParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__EveryExpressionAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ParenthesisAssignment_1_0"
    // InternalEsper.g:5239:1: rule__TerminalExpression__ParenthesisAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__TerminalExpression__ParenthesisAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5243:1: ( ( ( '(' ) ) )
            // InternalEsper.g:5244:2: ( ( '(' ) )
            {
            // InternalEsper.g:5244:2: ( ( '(' ) )
            // InternalEsper.g:5245:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getParenthesisLeftParenthesisKeyword_1_0_0()); 
            }
            // InternalEsper.g:5246:3: ( '(' )
            // InternalEsper.g:5247:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getParenthesisLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getParenthesisLeftParenthesisKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getParenthesisLeftParenthesisKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ParenthesisAssignment_1_0"


    // $ANTLR start "rule__TerminalExpression__BetweenParenthesisAssignment_1_1"
    // InternalEsper.g:5258:1: rule__TerminalExpression__BetweenParenthesisAssignment_1_1 : ( ruleFollowBy ) ;
    public final void rule__TerminalExpression__BetweenParenthesisAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5262:1: ( ( ruleFollowBy ) )
            // InternalEsper.g:5263:2: ( ruleFollowBy )
            {
            // InternalEsper.g:5263:2: ( ruleFollowBy )
            // InternalEsper.g:5264:3: ruleFollowBy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisFollowByParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFollowBy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBetweenParenthesisFollowByParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__BetweenParenthesisAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__SingleDefinitionAssignment_2"
    // InternalEsper.g:5273:1: rule__TerminalExpression__SingleDefinitionAssignment_2 : ( ruleSingleDefinition ) ;
    public final void rule__TerminalExpression__SingleDefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5277:1: ( ( ruleSingleDefinition ) )
            // InternalEsper.g:5278:2: ( ruleSingleDefinition )
            {
            // InternalEsper.g:5278:2: ( ruleSingleDefinition )
            // InternalEsper.g:5279:3: ruleSingleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionSingleDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSingleDefinitionSingleDefinitionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__SingleDefinitionAssignment_2"


    // $ANTLR start "rule__SingleDefinition__NameAssignment_0_0"
    // InternalEsper.g:5288:1: rule__SingleDefinition__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__SingleDefinition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5292:1: ( ( RULE_ID ) )
            // InternalEsper.g:5293:2: ( RULE_ID )
            {
            // InternalEsper.g:5293:2: ( RULE_ID )
            // InternalEsper.g:5294:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getNameIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getNameIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__NameAssignment_0_0"


    // $ANTLR start "rule__SingleDefinition__SimpleEventsAssignment_1"
    // InternalEsper.g:5303:1: rule__SingleDefinition__SimpleEventsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SingleDefinition__SimpleEventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5307:1: ( ( ( RULE_ID ) ) )
            // InternalEsper.g:5308:2: ( ( RULE_ID ) )
            {
            // InternalEsper.g:5308:2: ( ( RULE_ID ) )
            // InternalEsper.g:5309:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getSimpleEventsKindOfEventCrossReference_1_0()); 
            }
            // InternalEsper.g:5310:3: ( RULE_ID )
            // InternalEsper.g:5311:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getSimpleEventsKindOfEventIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getSimpleEventsKindOfEventIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getSimpleEventsKindOfEventCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__SimpleEventsAssignment_1"


    // $ANTLR start "rule__SingleDefinition__AnythingAssignment_2_1"
    // InternalEsper.g:5322:1: rule__SingleDefinition__AnythingAssignment_2_1 : ( ruleAnything ) ;
    public final void rule__SingleDefinition__AnythingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5326:1: ( ( ruleAnything ) )
            // InternalEsper.g:5327:2: ( ruleAnything )
            {
            // InternalEsper.g:5327:2: ( ruleAnything )
            // InternalEsper.g:5328:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleDefinitionAccess().getAnythingAnythingParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleDefinitionAccess().getAnythingAnythingParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDefinition__AnythingAssignment_2_1"


    // $ANTLR start "rule__Win__DefaultMethodAssignment_2"
    // InternalEsper.g:5337:1: rule__Win__DefaultMethodAssignment_2 : ( ruleDefaultMethods ) ;
    public final void rule__Win__DefaultMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5341:1: ( ( ruleDefaultMethods ) )
            // InternalEsper.g:5342:2: ( ruleDefaultMethods )
            {
            // InternalEsper.g:5342:2: ( ruleDefaultMethods )
            // InternalEsper.g:5343:3: ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWinAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWinAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__DefaultMethodAssignment_2"


    // $ANTLR start "rule__FollowByWhere__TimerAssignment_1_1"
    // InternalEsper.g:5352:1: rule__FollowByWhere__TimerAssignment_1_1 : ( ruleTimer ) ;
    public final void rule__FollowByWhere__TimerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5356:1: ( ( ruleTimer ) )
            // InternalEsper.g:5357:2: ( ruleTimer )
            {
            // InternalEsper.g:5357:2: ( ruleTimer )
            // InternalEsper.g:5358:3: ruleTimer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFollowByWhereAccess().getTimerTimerParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFollowByWhereAccess().getTimerTimerParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowByWhere__TimerAssignment_1_1"


    // $ANTLR start "rule__Timer__DefaultMethodAssignment_2"
    // InternalEsper.g:5367:1: rule__Timer__DefaultMethodAssignment_2 : ( ruleDefaultMethods ) ;
    public final void rule__Timer__DefaultMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5371:1: ( ( ruleDefaultMethods ) )
            // InternalEsper.g:5372:2: ( ruleDefaultMethods )
            {
            // InternalEsper.g:5372:2: ( ruleDefaultMethods )
            // InternalEsper.g:5373:3: ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimerAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimerAccess().getDefaultMethodDefaultMethodsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__DefaultMethodAssignment_2"


    // $ANTLR start "rule__GroupBy__AnythingAssignment_2"
    // InternalEsper.g:5382:1: rule__GroupBy__AnythingAssignment_2 : ( ruleAnything ) ;
    public final void rule__GroupBy__AnythingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5386:1: ( ( ruleAnything ) )
            // InternalEsper.g:5387:2: ( ruleAnything )
            {
            // InternalEsper.g:5387:2: ( ruleAnything )
            // InternalEsper.g:5388:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupByAccess().getAnythingAnythingParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupByAccess().getAnythingAnythingParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__AnythingAssignment_2"


    // $ANTLR start "rule__Having__DefaultMethodAssignment_1"
    // InternalEsper.g:5397:1: rule__Having__DefaultMethodAssignment_1 : ( ruleDefaultMethods ) ;
    public final void rule__Having__DefaultMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5401:1: ( ( ruleDefaultMethods ) )
            // InternalEsper.g:5402:2: ( ruleDefaultMethods )
            {
            // InternalEsper.g:5402:2: ( ruleDefaultMethods )
            // InternalEsper.g:5403:3: ruleDefaultMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefaultMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getDefaultMethodDefaultMethodsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__DefaultMethodAssignment_1"


    // $ANTLR start "rule__Having__OperatorAssignment_2"
    // InternalEsper.g:5412:1: rule__Having__OperatorAssignment_2 : ( ruleOperators ) ;
    public final void rule__Having__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5416:1: ( ( ruleOperators ) )
            // InternalEsper.g:5417:2: ( ruleOperators )
            {
            // InternalEsper.g:5417:2: ( ruleOperators )
            // InternalEsper.g:5418:3: ruleOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getOperatorOperatorsEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getOperatorOperatorsEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__OperatorAssignment_2"


    // $ANTLR start "rule__Having__AnythingAssignment_3"
    // InternalEsper.g:5427:1: rule__Having__AnythingAssignment_3 : ( ruleAnything ) ;
    public final void rule__Having__AnythingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5431:1: ( ( ruleAnything ) )
            // InternalEsper.g:5432:2: ( ruleAnything )
            {
            // InternalEsper.g:5432:2: ( ruleAnything )
            // InternalEsper.g:5433:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHavingAccess().getAnythingAnythingParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHavingAccess().getAnythingAnythingParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Having__AnythingAssignment_3"


    // $ANTLR start "rule__DefaultMethods__NameAssignment_0"
    // InternalEsper.g:5442:1: rule__DefaultMethods__NameAssignment_0 : ( ruleNameMethod ) ;
    public final void rule__DefaultMethods__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5446:1: ( ( ruleNameMethod ) )
            // InternalEsper.g:5447:2: ( ruleNameMethod )
            {
            // InternalEsper.g:5447:2: ( ruleNameMethod )
            // InternalEsper.g:5448:3: ruleNameMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getNameNameMethodParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNameMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getNameNameMethodParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__NameAssignment_0"


    // $ANTLR start "rule__DefaultMethods__AnythingAssignment_2"
    // InternalEsper.g:5457:1: rule__DefaultMethods__AnythingAssignment_2 : ( ruleAnything ) ;
    public final void rule__DefaultMethods__AnythingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5461:1: ( ( ruleAnything ) )
            // InternalEsper.g:5462:2: ( ruleAnything )
            {
            // InternalEsper.g:5462:2: ( ruleAnything )
            // InternalEsper.g:5463:3: ruleAnything
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMethodsAccess().getAnythingAnythingParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnything();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMethodsAccess().getAnythingAnythingParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultMethods__AnythingAssignment_2"


    // $ANTLR start "rule__Anything__OperatorAssignment_1_0_4"
    // InternalEsper.g:5472:1: rule__Anything__OperatorAssignment_1_0_4 : ( ruleOperators ) ;
    public final void rule__Anything__OperatorAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5476:1: ( ( ruleOperators ) )
            // InternalEsper.g:5477:2: ( ruleOperators )
            {
            // InternalEsper.g:5477:2: ( ruleOperators )
            // InternalEsper.g:5478:3: ruleOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getOperatorOperatorsEnumRuleCall_1_0_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getOperatorOperatorsEnumRuleCall_1_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__OperatorAssignment_1_0_4"


    // $ANTLR start "rule__Anything__ExtraParenthesisAssignment_1_0_5"
    // InternalEsper.g:5487:1: rule__Anything__ExtraParenthesisAssignment_1_0_5 : ( ruleExtraParenthesisRule ) ;
    public final void rule__Anything__ExtraParenthesisAssignment_1_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper.g:5491:1: ( ( ruleExtraParenthesisRule ) )
            // InternalEsper.g:5492:2: ( ruleExtraParenthesisRule )
            {
            // InternalEsper.g:5492:2: ( ruleExtraParenthesisRule )
            // InternalEsper.g:5493:3: ruleExtraParenthesisRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnythingAccess().getExtraParenthesisExtraParenthesisRuleParserRuleCall_1_0_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExtraParenthesisRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnythingAccess().getExtraParenthesisExtraParenthesisRuleParserRuleCall_1_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anything__ExtraParenthesisAssignment_1_0_5"

    // $ANTLR start synpred10_InternalEsper
    public final void synpred10_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:937:2: ( ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) ) )
        // InternalEsper.g:937:2: ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) )
        {
        // InternalEsper.g:937:2: ( ( rule__AbstractFollowBy__FollowByAssignment_0_0 ) )
        // InternalEsper.g:938:3: ( rule__AbstractFollowBy__FollowByAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAbstractFollowByAccess().getFollowByAssignment_0_0()); 
        }
        // InternalEsper.g:939:3: ( rule__AbstractFollowBy__FollowByAssignment_0_0 )
        // InternalEsper.g:939:4: rule__AbstractFollowBy__FollowByAssignment_0_0
        {
        pushFollow(FOLLOW_2);
        rule__AbstractFollowBy__FollowByAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalEsper

    // $ANTLR start synpred54_InternalEsper
    public final void synpred54_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:3333:3: ( rule__FollowBy__Group_1__0 )
        // InternalEsper.g:3333:3: rule__FollowBy__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__FollowBy__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalEsper

    // $ANTLR start synpred55_InternalEsper
    public final void synpred55_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:3550:3: ( rule__SingleDefinition__Group_0__0 )
        // InternalEsper.g:3550:3: rule__SingleDefinition__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__SingleDefinition__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalEsper

    // $ANTLR start synpred56_InternalEsper
    public final void synpred56_InternalEsper_fragment() throws RecognitionException {   
        // InternalEsper.g:3603:3: ( rule__SingleDefinition__Group_2__0 )
        // InternalEsper.g:3603:3: rule__SingleDefinition__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__SingleDefinition__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalEsper

    // Delegated rules

    public final boolean synpred10_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalEsper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalEsper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\2\26\uffff";
    static final String dfa_3s = "\1\13\1\0\25\uffff";
    static final String dfa_4s = "\1\63\1\0\25\uffff";
    static final String dfa_5s = "\2\uffff\1\2\23\uffff\1\1";
    static final String dfa_6s = "\1\uffff\1\0\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\10\uffff\17\2\3\uffff\1\1\1\2\12\uffff\2\2",
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

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3603:2: ( rule__SingleDefinition__Group_2__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalEsper()) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0280002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000007F070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000007F072L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000007FFE00800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000007FFE00802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000047FFF808F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400004000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000047FFF808F2L});

}