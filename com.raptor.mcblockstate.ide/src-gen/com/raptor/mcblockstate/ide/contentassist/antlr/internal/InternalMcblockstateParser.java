package com.raptor.mcblockstate.ide.contentassist.antlr.internal;

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
import com.raptor.mcblockstate.services.McblockstateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMcblockstateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_ULONG", "RULE_SLONG", "RULE_SIGN", "RULE_DIGITS", "RULE_EXPONENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'=='", "'true'", "'false'", "'null'", "'variants'", "'multipart'", "'in'", "'when'", "'apply'", "'x'", "'y'", "'uvlock'", "'{'", "'}'", "'['", "']'", "','", "'('", "')'", "'|'", "'&'", "':'", "'/'", "'.'", "'!'", "'*'"
    };
    public static final int RULE_SIGN=9;
    public static final int RULE_STRING=5;
    public static final int RULE_DIGITS=10;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_ULONG=7;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_EXPONENT=11;
    public static final int T__26=26;
    public static final int RULE_SLONG=8;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMcblockstateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMcblockstateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMcblockstateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMcblockstate.g"; }


    	private McblockstateGrammarAccess grammarAccess;

    	public void setGrammarAccess(McblockstateGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBlockstate"
    // InternalMcblockstate.g:54:1: entryRuleBlockstate : ruleBlockstate EOF ;
    public final void entryRuleBlockstate() throws RecognitionException {
        try {
            // InternalMcblockstate.g:55:1: ( ruleBlockstate EOF )
            // InternalMcblockstate.g:56:1: ruleBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockstate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstateRule()); 
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
    // $ANTLR end "entryRuleBlockstate"


    // $ANTLR start "ruleBlockstate"
    // InternalMcblockstate.g:63:1: ruleBlockstate : ( ( rule__Blockstate__Alternatives ) ) ;
    public final void ruleBlockstate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:67:2: ( ( ( rule__Blockstate__Alternatives ) ) )
            // InternalMcblockstate.g:68:2: ( ( rule__Blockstate__Alternatives ) )
            {
            // InternalMcblockstate.g:68:2: ( ( rule__Blockstate__Alternatives ) )
            // InternalMcblockstate.g:69:3: ( rule__Blockstate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstateAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:70:3: ( rule__Blockstate__Alternatives )
            // InternalMcblockstate.g:70:4: rule__Blockstate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Blockstate__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstateAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBlockstate"


    // $ANTLR start "entryRuleVariantsBlockstate"
    // InternalMcblockstate.g:79:1: entryRuleVariantsBlockstate : ruleVariantsBlockstate EOF ;
    public final void entryRuleVariantsBlockstate() throws RecognitionException {
        try {
            // InternalMcblockstate.g:80:1: ( ruleVariantsBlockstate EOF )
            // InternalMcblockstate.g:81:1: ruleVariantsBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariantsBlockstate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateRule()); 
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
    // $ANTLR end "entryRuleVariantsBlockstate"


    // $ANTLR start "ruleVariantsBlockstate"
    // InternalMcblockstate.g:88:1: ruleVariantsBlockstate : ( ( rule__VariantsBlockstate__Group__0 ) ) ;
    public final void ruleVariantsBlockstate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:92:2: ( ( ( rule__VariantsBlockstate__Group__0 ) ) )
            // InternalMcblockstate.g:93:2: ( ( rule__VariantsBlockstate__Group__0 ) )
            {
            // InternalMcblockstate.g:93:2: ( ( rule__VariantsBlockstate__Group__0 ) )
            // InternalMcblockstate.g:94:3: ( rule__VariantsBlockstate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getGroup()); 
            }
            // InternalMcblockstate.g:95:3: ( rule__VariantsBlockstate__Group__0 )
            // InternalMcblockstate.g:95:4: rule__VariantsBlockstate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getGroup()); 
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
    // $ANTLR end "ruleVariantsBlockstate"


    // $ANTLR start "entryRuleVariant"
    // InternalMcblockstate.g:104:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // InternalMcblockstate.g:105:1: ( ruleVariant EOF )
            // InternalMcblockstate.g:106:1: ruleVariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantRule()); 
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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMcblockstate.g:113:1: ruleVariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:117:2: ( ( ( rule__Variant__Group__0 ) ) )
            // InternalMcblockstate.g:118:2: ( ( rule__Variant__Group__0 ) )
            {
            // InternalMcblockstate.g:118:2: ( ( rule__Variant__Group__0 ) )
            // InternalMcblockstate.g:119:3: ( rule__Variant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup()); 
            }
            // InternalMcblockstate.g:120:3: ( rule__Variant__Group__0 )
            // InternalMcblockstate.g:120:4: rule__Variant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getGroup()); 
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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleBlockstateProperty"
    // InternalMcblockstate.g:129:1: entryRuleBlockstateProperty : ruleBlockstateProperty EOF ;
    public final void entryRuleBlockstateProperty() throws RecognitionException {
        try {
            // InternalMcblockstate.g:130:1: ( ruleBlockstateProperty EOF )
            // InternalMcblockstate.g:131:1: ruleBlockstateProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockstateProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyRule()); 
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
    // $ANTLR end "entryRuleBlockstateProperty"


    // $ANTLR start "ruleBlockstateProperty"
    // InternalMcblockstate.g:138:1: ruleBlockstateProperty : ( ( rule__BlockstateProperty__Group__0 ) ) ;
    public final void ruleBlockstateProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:142:2: ( ( ( rule__BlockstateProperty__Group__0 ) ) )
            // InternalMcblockstate.g:143:2: ( ( rule__BlockstateProperty__Group__0 ) )
            {
            // InternalMcblockstate.g:143:2: ( ( rule__BlockstateProperty__Group__0 ) )
            // InternalMcblockstate.g:144:3: ( rule__BlockstateProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getGroup()); 
            }
            // InternalMcblockstate.g:145:3: ( rule__BlockstateProperty__Group__0 )
            // InternalMcblockstate.g:145:4: rule__BlockstateProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleBlockstateProperty"


    // $ANTLR start "entryRuleMultipartBlockstate"
    // InternalMcblockstate.g:154:1: entryRuleMultipartBlockstate : ruleMultipartBlockstate EOF ;
    public final void entryRuleMultipartBlockstate() throws RecognitionException {
        try {
            // InternalMcblockstate.g:155:1: ( ruleMultipartBlockstate EOF )
            // InternalMcblockstate.g:156:1: ruleMultipartBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultipartBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultipartBlockstate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultipartBlockstateRule()); 
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
    // $ANTLR end "entryRuleMultipartBlockstate"


    // $ANTLR start "ruleMultipartBlockstate"
    // InternalMcblockstate.g:163:1: ruleMultipartBlockstate : ( ( ( rule__MultipartBlockstate__CasesAssignment ) ) ( ( rule__MultipartBlockstate__CasesAssignment )* ) ) ;
    public final void ruleMultipartBlockstate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:167:2: ( ( ( ( rule__MultipartBlockstate__CasesAssignment ) ) ( ( rule__MultipartBlockstate__CasesAssignment )* ) ) )
            // InternalMcblockstate.g:168:2: ( ( ( rule__MultipartBlockstate__CasesAssignment ) ) ( ( rule__MultipartBlockstate__CasesAssignment )* ) )
            {
            // InternalMcblockstate.g:168:2: ( ( ( rule__MultipartBlockstate__CasesAssignment ) ) ( ( rule__MultipartBlockstate__CasesAssignment )* ) )
            // InternalMcblockstate.g:169:3: ( ( rule__MultipartBlockstate__CasesAssignment ) ) ( ( rule__MultipartBlockstate__CasesAssignment )* )
            {
            // InternalMcblockstate.g:169:3: ( ( rule__MultipartBlockstate__CasesAssignment ) )
            // InternalMcblockstate.g:170:4: ( rule__MultipartBlockstate__CasesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultipartBlockstateAccess().getCasesAssignment()); 
            }
            // InternalMcblockstate.g:171:4: ( rule__MultipartBlockstate__CasesAssignment )
            // InternalMcblockstate.g:171:5: rule__MultipartBlockstate__CasesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__MultipartBlockstate__CasesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultipartBlockstateAccess().getCasesAssignment()); 
            }

            }

            // InternalMcblockstate.g:174:3: ( ( rule__MultipartBlockstate__CasesAssignment )* )
            // InternalMcblockstate.g:175:4: ( rule__MultipartBlockstate__CasesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultipartBlockstateAccess().getCasesAssignment()); 
            }
            // InternalMcblockstate.g:176:4: ( rule__MultipartBlockstate__CasesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMcblockstate.g:176:5: rule__MultipartBlockstate__CasesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MultipartBlockstate__CasesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultipartBlockstateAccess().getCasesAssignment()); 
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
    // $ANTLR end "ruleMultipartBlockstate"


    // $ANTLR start "entryRuleCase"
    // InternalMcblockstate.g:186:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMcblockstate.g:187:1: ( ruleCase EOF )
            // InternalMcblockstate.g:188:1: ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseRule()); 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMcblockstate.g:195:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:199:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalMcblockstate.g:200:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalMcblockstate.g:200:2: ( ( rule__Case__Group__0 ) )
            // InternalMcblockstate.g:201:3: ( rule__Case__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup()); 
            }
            // InternalMcblockstate.g:202:3: ( rule__Case__Group__0 )
            // InternalMcblockstate.g:202:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getGroup()); 
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCaseCondition"
    // InternalMcblockstate.g:211:1: entryRuleCaseCondition : ruleCaseCondition EOF ;
    public final void entryRuleCaseCondition() throws RecognitionException {
        try {
            // InternalMcblockstate.g:212:1: ( ruleCaseCondition EOF )
            // InternalMcblockstate.g:213:1: ruleCaseCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionRule()); 
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
    // $ANTLR end "entryRuleCaseCondition"


    // $ANTLR start "ruleCaseCondition"
    // InternalMcblockstate.g:220:1: ruleCaseCondition : ( ( rule__CaseCondition__Group__0 ) ) ;
    public final void ruleCaseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:224:2: ( ( ( rule__CaseCondition__Group__0 ) ) )
            // InternalMcblockstate.g:225:2: ( ( rule__CaseCondition__Group__0 ) )
            {
            // InternalMcblockstate.g:225:2: ( ( rule__CaseCondition__Group__0 ) )
            // InternalMcblockstate.g:226:3: ( rule__CaseCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getGroup()); 
            }
            // InternalMcblockstate.g:227:3: ( rule__CaseCondition__Group__0 )
            // InternalMcblockstate.g:227:4: rule__CaseCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleCaseCondition"


    // $ANTLR start "entryRuleBaseCaseCondition"
    // InternalMcblockstate.g:236:1: entryRuleBaseCaseCondition : ruleBaseCaseCondition EOF ;
    public final void entryRuleBaseCaseCondition() throws RecognitionException {
        try {
            // InternalMcblockstate.g:237:1: ( ruleBaseCaseCondition EOF )
            // InternalMcblockstate.g:238:1: ruleBaseCaseCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionRule()); 
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
    // $ANTLR end "entryRuleBaseCaseCondition"


    // $ANTLR start "ruleBaseCaseCondition"
    // InternalMcblockstate.g:245:1: ruleBaseCaseCondition : ( ( rule__BaseCaseCondition__Alternatives ) ) ;
    public final void ruleBaseCaseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:249:2: ( ( ( rule__BaseCaseCondition__Alternatives ) ) )
            // InternalMcblockstate.g:250:2: ( ( rule__BaseCaseCondition__Alternatives ) )
            {
            // InternalMcblockstate.g:250:2: ( ( rule__BaseCaseCondition__Alternatives ) )
            // InternalMcblockstate.g:251:3: ( rule__BaseCaseCondition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:252:3: ( rule__BaseCaseCondition__Alternatives )
            // InternalMcblockstate.g:252:4: rule__BaseCaseCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBaseCaseCondition"


    // $ANTLR start "entryRuleBlockstatePropertyPredicate"
    // InternalMcblockstate.g:261:1: entryRuleBlockstatePropertyPredicate : ruleBlockstatePropertyPredicate EOF ;
    public final void entryRuleBlockstatePropertyPredicate() throws RecognitionException {
        try {
            // InternalMcblockstate.g:262:1: ( ruleBlockstatePropertyPredicate EOF )
            // InternalMcblockstate.g:263:1: ruleBlockstatePropertyPredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockstatePropertyPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateRule()); 
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
    // $ANTLR end "entryRuleBlockstatePropertyPredicate"


    // $ANTLR start "ruleBlockstatePropertyPredicate"
    // InternalMcblockstate.g:270:1: ruleBlockstatePropertyPredicate : ( ( rule__BlockstatePropertyPredicate__Alternatives ) ) ;
    public final void ruleBlockstatePropertyPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:274:2: ( ( ( rule__BlockstatePropertyPredicate__Alternatives ) ) )
            // InternalMcblockstate.g:275:2: ( ( rule__BlockstatePropertyPredicate__Alternatives ) )
            {
            // InternalMcblockstate.g:275:2: ( ( rule__BlockstatePropertyPredicate__Alternatives ) )
            // InternalMcblockstate.g:276:3: ( rule__BlockstatePropertyPredicate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:277:3: ( rule__BlockstatePropertyPredicate__Alternatives )
            // InternalMcblockstate.g:277:4: rule__BlockstatePropertyPredicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBlockstatePropertyPredicate"


    // $ANTLR start "entryRuleCustomBlockstate"
    // InternalMcblockstate.g:286:1: entryRuleCustomBlockstate : ruleCustomBlockstate EOF ;
    public final void entryRuleCustomBlockstate() throws RecognitionException {
        try {
            // InternalMcblockstate.g:287:1: ( ruleCustomBlockstate EOF )
            // InternalMcblockstate.g:288:1: ruleCustomBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCustomBlockstate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomBlockstateRule()); 
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
    // $ANTLR end "entryRuleCustomBlockstate"


    // $ANTLR start "ruleCustomBlockstate"
    // InternalMcblockstate.g:295:1: ruleCustomBlockstate : ( ( rule__CustomBlockstate__JsonAssignment ) ) ;
    public final void ruleCustomBlockstate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:299:2: ( ( ( rule__CustomBlockstate__JsonAssignment ) ) )
            // InternalMcblockstate.g:300:2: ( ( rule__CustomBlockstate__JsonAssignment ) )
            {
            // InternalMcblockstate.g:300:2: ( ( rule__CustomBlockstate__JsonAssignment ) )
            // InternalMcblockstate.g:301:3: ( rule__CustomBlockstate__JsonAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomBlockstateAccess().getJsonAssignment()); 
            }
            // InternalMcblockstate.g:302:3: ( rule__CustomBlockstate__JsonAssignment )
            // InternalMcblockstate.g:302:4: rule__CustomBlockstate__JsonAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CustomBlockstate__JsonAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomBlockstateAccess().getJsonAssignment()); 
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
    // $ANTLR end "ruleCustomBlockstate"


    // $ANTLR start "entryRuleBlockstatePropertyValue"
    // InternalMcblockstate.g:311:1: entryRuleBlockstatePropertyValue : ruleBlockstatePropertyValue EOF ;
    public final void entryRuleBlockstatePropertyValue() throws RecognitionException {
        try {
            // InternalMcblockstate.g:312:1: ( ruleBlockstatePropertyValue EOF )
            // InternalMcblockstate.g:313:1: ruleBlockstatePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyValueRule()); 
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
    // $ANTLR end "entryRuleBlockstatePropertyValue"


    // $ANTLR start "ruleBlockstatePropertyValue"
    // InternalMcblockstate.g:320:1: ruleBlockstatePropertyValue : ( ( rule__BlockstatePropertyValue__Alternatives ) ) ;
    public final void ruleBlockstatePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:324:2: ( ( ( rule__BlockstatePropertyValue__Alternatives ) ) )
            // InternalMcblockstate.g:325:2: ( ( rule__BlockstatePropertyValue__Alternatives ) )
            {
            // InternalMcblockstate.g:325:2: ( ( rule__BlockstatePropertyValue__Alternatives ) )
            // InternalMcblockstate.g:326:3: ( rule__BlockstatePropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyValueAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:327:3: ( rule__BlockstatePropertyValue__Alternatives )
            // InternalMcblockstate.g:327:4: rule__BlockstatePropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBlockstatePropertyValue"


    // $ANTLR start "entryRuleModelList"
    // InternalMcblockstate.g:336:1: entryRuleModelList : ruleModelList EOF ;
    public final void entryRuleModelList() throws RecognitionException {
        try {
            // InternalMcblockstate.g:337:1: ( ruleModelList EOF )
            // InternalMcblockstate.g:338:1: ruleModelList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListRule()); 
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
    // $ANTLR end "entryRuleModelList"


    // $ANTLR start "ruleModelList"
    // InternalMcblockstate.g:345:1: ruleModelList : ( ( rule__ModelList__Alternatives ) ) ;
    public final void ruleModelList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:349:2: ( ( ( rule__ModelList__Alternatives ) ) )
            // InternalMcblockstate.g:350:2: ( ( rule__ModelList__Alternatives ) )
            {
            // InternalMcblockstate.g:350:2: ( ( rule__ModelList__Alternatives ) )
            // InternalMcblockstate.g:351:3: ( rule__ModelList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:352:3: ( rule__ModelList__Alternatives )
            // InternalMcblockstate.g:352:4: rule__ModelList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getAlternatives()); 
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
    // $ANTLR end "ruleModelList"


    // $ANTLR start "entryRuleModel"
    // InternalMcblockstate.g:361:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMcblockstate.g:362:1: ( ruleModel EOF )
            // InternalMcblockstate.g:363:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMcblockstate.g:370:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:374:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMcblockstate.g:375:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMcblockstate.g:375:2: ( ( rule__Model__Group__0 ) )
            // InternalMcblockstate.g:376:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalMcblockstate.g:377:3: ( rule__Model__Group__0 )
            // InternalMcblockstate.g:377:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMCJsonValue"
    // InternalMcblockstate.g:386:1: entryRuleMCJsonValue : ruleMCJsonValue EOF ;
    public final void entryRuleMCJsonValue() throws RecognitionException {
        try {
            // InternalMcblockstate.g:387:1: ( ruleMCJsonValue EOF )
            // InternalMcblockstate.g:388:1: ruleMCJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonValueRule()); 
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
    // $ANTLR end "entryRuleMCJsonValue"


    // $ANTLR start "ruleMCJsonValue"
    // InternalMcblockstate.g:395:1: ruleMCJsonValue : ( ( rule__MCJsonValue__Alternatives ) ) ;
    public final void ruleMCJsonValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:399:2: ( ( ( rule__MCJsonValue__Alternatives ) ) )
            // InternalMcblockstate.g:400:2: ( ( rule__MCJsonValue__Alternatives ) )
            {
            // InternalMcblockstate.g:400:2: ( ( rule__MCJsonValue__Alternatives ) )
            // InternalMcblockstate.g:401:3: ( rule__MCJsonValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonValueAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:402:3: ( rule__MCJsonValue__Alternatives )
            // InternalMcblockstate.g:402:4: rule__MCJsonValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMCJsonValue"


    // $ANTLR start "entryRuleMCJsonObject"
    // InternalMcblockstate.g:411:1: entryRuleMCJsonObject : ruleMCJsonObject EOF ;
    public final void entryRuleMCJsonObject() throws RecognitionException {
        try {
            // InternalMcblockstate.g:412:1: ( ruleMCJsonObject EOF )
            // InternalMcblockstate.g:413:1: ruleMCJsonObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectRule()); 
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
    // $ANTLR end "entryRuleMCJsonObject"


    // $ANTLR start "ruleMCJsonObject"
    // InternalMcblockstate.g:420:1: ruleMCJsonObject : ( ( rule__MCJsonObject__Group__0 ) ) ;
    public final void ruleMCJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:424:2: ( ( ( rule__MCJsonObject__Group__0 ) ) )
            // InternalMcblockstate.g:425:2: ( ( rule__MCJsonObject__Group__0 ) )
            {
            // InternalMcblockstate.g:425:2: ( ( rule__MCJsonObject__Group__0 ) )
            // InternalMcblockstate.g:426:3: ( rule__MCJsonObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getGroup()); 
            }
            // InternalMcblockstate.g:427:3: ( rule__MCJsonObject__Group__0 )
            // InternalMcblockstate.g:427:4: rule__MCJsonObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getGroup()); 
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
    // $ANTLR end "ruleMCJsonObject"


    // $ANTLR start "entryRuleMCJsonEntry"
    // InternalMcblockstate.g:436:1: entryRuleMCJsonEntry : ruleMCJsonEntry EOF ;
    public final void entryRuleMCJsonEntry() throws RecognitionException {
        try {
            // InternalMcblockstate.g:437:1: ( ruleMCJsonEntry EOF )
            // InternalMcblockstate.g:438:1: ruleMCJsonEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryRule()); 
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
    // $ANTLR end "entryRuleMCJsonEntry"


    // $ANTLR start "ruleMCJsonEntry"
    // InternalMcblockstate.g:445:1: ruleMCJsonEntry : ( ( rule__MCJsonEntry__Group__0 ) ) ;
    public final void ruleMCJsonEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:449:2: ( ( ( rule__MCJsonEntry__Group__0 ) ) )
            // InternalMcblockstate.g:450:2: ( ( rule__MCJsonEntry__Group__0 ) )
            {
            // InternalMcblockstate.g:450:2: ( ( rule__MCJsonEntry__Group__0 ) )
            // InternalMcblockstate.g:451:3: ( rule__MCJsonEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getGroup()); 
            }
            // InternalMcblockstate.g:452:3: ( rule__MCJsonEntry__Group__0 )
            // InternalMcblockstate.g:452:4: rule__MCJsonEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getGroup()); 
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
    // $ANTLR end "ruleMCJsonEntry"


    // $ANTLR start "entryRuleMCJsonArray"
    // InternalMcblockstate.g:461:1: entryRuleMCJsonArray : ruleMCJsonArray EOF ;
    public final void entryRuleMCJsonArray() throws RecognitionException {
        try {
            // InternalMcblockstate.g:462:1: ( ruleMCJsonArray EOF )
            // InternalMcblockstate.g:463:1: ruleMCJsonArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayRule()); 
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
    // $ANTLR end "entryRuleMCJsonArray"


    // $ANTLR start "ruleMCJsonArray"
    // InternalMcblockstate.g:470:1: ruleMCJsonArray : ( ( rule__MCJsonArray__Group__0 ) ) ;
    public final void ruleMCJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:474:2: ( ( ( rule__MCJsonArray__Group__0 ) ) )
            // InternalMcblockstate.g:475:2: ( ( rule__MCJsonArray__Group__0 ) )
            {
            // InternalMcblockstate.g:475:2: ( ( rule__MCJsonArray__Group__0 ) )
            // InternalMcblockstate.g:476:3: ( rule__MCJsonArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getGroup()); 
            }
            // InternalMcblockstate.g:477:3: ( rule__MCJsonArray__Group__0 )
            // InternalMcblockstate.g:477:4: rule__MCJsonArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleMCJsonArray"


    // $ANTLR start "entryRuleMCJsonString"
    // InternalMcblockstate.g:486:1: entryRuleMCJsonString : ruleMCJsonString EOF ;
    public final void entryRuleMCJsonString() throws RecognitionException {
        try {
            // InternalMcblockstate.g:487:1: ( ruleMCJsonString EOF )
            // InternalMcblockstate.g:488:1: ruleMCJsonString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonStringRule()); 
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
    // $ANTLR end "entryRuleMCJsonString"


    // $ANTLR start "ruleMCJsonString"
    // InternalMcblockstate.g:495:1: ruleMCJsonString : ( ( rule__MCJsonString__ValueAssignment ) ) ;
    public final void ruleMCJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:499:2: ( ( ( rule__MCJsonString__ValueAssignment ) ) )
            // InternalMcblockstate.g:500:2: ( ( rule__MCJsonString__ValueAssignment ) )
            {
            // InternalMcblockstate.g:500:2: ( ( rule__MCJsonString__ValueAssignment ) )
            // InternalMcblockstate.g:501:3: ( rule__MCJsonString__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonStringAccess().getValueAssignment()); 
            }
            // InternalMcblockstate.g:502:3: ( rule__MCJsonString__ValueAssignment )
            // InternalMcblockstate.g:502:4: rule__MCJsonString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonString__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonStringAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleMCJsonString"


    // $ANTLR start "entryRuleMCJsonNumber"
    // InternalMcblockstate.g:511:1: entryRuleMCJsonNumber : ruleMCJsonNumber EOF ;
    public final void entryRuleMCJsonNumber() throws RecognitionException {
        try {
            // InternalMcblockstate.g:512:1: ( ruleMCJsonNumber EOF )
            // InternalMcblockstate.g:513:1: ruleMCJsonNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNumberRule()); 
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
    // $ANTLR end "entryRuleMCJsonNumber"


    // $ANTLR start "ruleMCJsonNumber"
    // InternalMcblockstate.g:520:1: ruleMCJsonNumber : ( ( rule__MCJsonNumber__Alternatives ) ) ;
    public final void ruleMCJsonNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:524:2: ( ( ( rule__MCJsonNumber__Alternatives ) ) )
            // InternalMcblockstate.g:525:2: ( ( rule__MCJsonNumber__Alternatives ) )
            {
            // InternalMcblockstate.g:525:2: ( ( rule__MCJsonNumber__Alternatives ) )
            // InternalMcblockstate.g:526:3: ( rule__MCJsonNumber__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNumberAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:527:3: ( rule__MCJsonNumber__Alternatives )
            // InternalMcblockstate.g:527:4: rule__MCJsonNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonNumber__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNumberAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMCJsonNumber"


    // $ANTLR start "entryRuleMCJsonIntegral"
    // InternalMcblockstate.g:536:1: entryRuleMCJsonIntegral : ruleMCJsonIntegral EOF ;
    public final void entryRuleMCJsonIntegral() throws RecognitionException {
        try {
            // InternalMcblockstate.g:537:1: ( ruleMCJsonIntegral EOF )
            // InternalMcblockstate.g:538:1: ruleMCJsonIntegral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonIntegralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonIntegral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonIntegralRule()); 
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
    // $ANTLR end "entryRuleMCJsonIntegral"


    // $ANTLR start "ruleMCJsonIntegral"
    // InternalMcblockstate.g:545:1: ruleMCJsonIntegral : ( ( rule__MCJsonIntegral__ValueAssignment ) ) ;
    public final void ruleMCJsonIntegral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:549:2: ( ( ( rule__MCJsonIntegral__ValueAssignment ) ) )
            // InternalMcblockstate.g:550:2: ( ( rule__MCJsonIntegral__ValueAssignment ) )
            {
            // InternalMcblockstate.g:550:2: ( ( rule__MCJsonIntegral__ValueAssignment ) )
            // InternalMcblockstate.g:551:3: ( rule__MCJsonIntegral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonIntegralAccess().getValueAssignment()); 
            }
            // InternalMcblockstate.g:552:3: ( rule__MCJsonIntegral__ValueAssignment )
            // InternalMcblockstate.g:552:4: rule__MCJsonIntegral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonIntegral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonIntegralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleMCJsonIntegral"


    // $ANTLR start "entryRuleMCJsonFloatingPoint"
    // InternalMcblockstate.g:561:1: entryRuleMCJsonFloatingPoint : ruleMCJsonFloatingPoint EOF ;
    public final void entryRuleMCJsonFloatingPoint() throws RecognitionException {
        try {
            // InternalMcblockstate.g:562:1: ( ruleMCJsonFloatingPoint EOF )
            // InternalMcblockstate.g:563:1: ruleMCJsonFloatingPoint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonFloatingPointRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonFloatingPoint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonFloatingPointRule()); 
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
    // $ANTLR end "entryRuleMCJsonFloatingPoint"


    // $ANTLR start "ruleMCJsonFloatingPoint"
    // InternalMcblockstate.g:570:1: ruleMCJsonFloatingPoint : ( ( rule__MCJsonFloatingPoint__ValueAssignment ) ) ;
    public final void ruleMCJsonFloatingPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:574:2: ( ( ( rule__MCJsonFloatingPoint__ValueAssignment ) ) )
            // InternalMcblockstate.g:575:2: ( ( rule__MCJsonFloatingPoint__ValueAssignment ) )
            {
            // InternalMcblockstate.g:575:2: ( ( rule__MCJsonFloatingPoint__ValueAssignment ) )
            // InternalMcblockstate.g:576:3: ( rule__MCJsonFloatingPoint__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonFloatingPointAccess().getValueAssignment()); 
            }
            // InternalMcblockstate.g:577:3: ( rule__MCJsonFloatingPoint__ValueAssignment )
            // InternalMcblockstate.g:577:4: rule__MCJsonFloatingPoint__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonFloatingPoint__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonFloatingPointAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleMCJsonFloatingPoint"


    // $ANTLR start "entryRuleMCJsonBoolean"
    // InternalMcblockstate.g:586:1: entryRuleMCJsonBoolean : ruleMCJsonBoolean EOF ;
    public final void entryRuleMCJsonBoolean() throws RecognitionException {
        try {
            // InternalMcblockstate.g:587:1: ( ruleMCJsonBoolean EOF )
            // InternalMcblockstate.g:588:1: ruleMCJsonBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanRule()); 
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
    // $ANTLR end "entryRuleMCJsonBoolean"


    // $ANTLR start "ruleMCJsonBoolean"
    // InternalMcblockstate.g:595:1: ruleMCJsonBoolean : ( ( rule__MCJsonBoolean__Alternatives ) ) ;
    public final void ruleMCJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:599:2: ( ( ( rule__MCJsonBoolean__Alternatives ) ) )
            // InternalMcblockstate.g:600:2: ( ( rule__MCJsonBoolean__Alternatives ) )
            {
            // InternalMcblockstate.g:600:2: ( ( rule__MCJsonBoolean__Alternatives ) )
            // InternalMcblockstate.g:601:3: ( rule__MCJsonBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:602:3: ( rule__MCJsonBoolean__Alternatives )
            // InternalMcblockstate.g:602:4: rule__MCJsonBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMCJsonBoolean"


    // $ANTLR start "entryRuleMCJsonNull"
    // InternalMcblockstate.g:611:1: entryRuleMCJsonNull : ruleMCJsonNull EOF ;
    public final void entryRuleMCJsonNull() throws RecognitionException {
        try {
            // InternalMcblockstate.g:612:1: ( ruleMCJsonNull EOF )
            // InternalMcblockstate.g:613:1: ruleMCJsonNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMCJsonNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNullRule()); 
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
    // $ANTLR end "entryRuleMCJsonNull"


    // $ANTLR start "ruleMCJsonNull"
    // InternalMcblockstate.g:620:1: ruleMCJsonNull : ( ( rule__MCJsonNull__Group__0 ) ) ;
    public final void ruleMCJsonNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:624:2: ( ( ( rule__MCJsonNull__Group__0 ) ) )
            // InternalMcblockstate.g:625:2: ( ( rule__MCJsonNull__Group__0 ) )
            {
            // InternalMcblockstate.g:625:2: ( ( rule__MCJsonNull__Group__0 ) )
            // InternalMcblockstate.g:626:3: ( rule__MCJsonNull__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNullAccess().getGroup()); 
            }
            // InternalMcblockstate.g:627:3: ( rule__MCJsonNull__Group__0 )
            // InternalMcblockstate.g:627:4: rule__MCJsonNull__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonNull__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNullAccess().getGroup()); 
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
    // $ANTLR end "ruleMCJsonNull"


    // $ANTLR start "entryRuleNamespacedLocation"
    // InternalMcblockstate.g:636:1: entryRuleNamespacedLocation : ruleNamespacedLocation EOF ;
    public final void entryRuleNamespacedLocation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:640:1: ( ruleNamespacedLocation EOF )
            // InternalMcblockstate.g:641:1: ruleNamespacedLocation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamespacedLocation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNamespacedLocation"


    // $ANTLR start "ruleNamespacedLocation"
    // InternalMcblockstate.g:651:1: ruleNamespacedLocation : ( ( rule__NamespacedLocation__Group__0 ) ) ;
    public final void ruleNamespacedLocation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:656:2: ( ( ( rule__NamespacedLocation__Group__0 ) ) )
            // InternalMcblockstate.g:657:2: ( ( rule__NamespacedLocation__Group__0 ) )
            {
            // InternalMcblockstate.g:657:2: ( ( rule__NamespacedLocation__Group__0 ) )
            // InternalMcblockstate.g:658:3: ( rule__NamespacedLocation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getGroup()); 
            }
            // InternalMcblockstate.g:659:3: ( rule__NamespacedLocation__Group__0 )
            // InternalMcblockstate.g:659:4: rule__NamespacedLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNamespacedLocation"


    // $ANTLR start "entryRuleKey"
    // InternalMcblockstate.g:669:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:673:1: ( ruleKey EOF )
            // InternalMcblockstate.g:674:1: ruleKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMcblockstate.g:684:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:689:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalMcblockstate.g:690:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalMcblockstate.g:690:2: ( ( rule__Key__Group__0 ) )
            // InternalMcblockstate.g:691:3: ( rule__Key__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyAccess().getGroup()); 
            }
            // InternalMcblockstate.g:692:3: ( rule__Key__Group__0 )
            // InternalMcblockstate.g:692:4: rule__Key__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleIdentifier"
    // InternalMcblockstate.g:702:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:706:1: ( ruleIdentifier EOF )
            // InternalMcblockstate.g:707:1: ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalMcblockstate.g:717:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:722:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // InternalMcblockstate.g:723:2: ( ( rule__Identifier__Alternatives ) )
            {
            // InternalMcblockstate.g:723:2: ( ( rule__Identifier__Alternatives ) )
            // InternalMcblockstate.g:724:3: ( rule__Identifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:725:3: ( rule__Identifier__Alternatives )
            // InternalMcblockstate.g:725:4: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleKeyword"
    // InternalMcblockstate.g:735:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalMcblockstate.g:736:1: ( ruleKeyword EOF )
            // InternalMcblockstate.g:737:1: ruleKeyword EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeyword();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordRule()); 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalMcblockstate.g:744:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:748:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // InternalMcblockstate.g:749:2: ( ( rule__Keyword__Alternatives ) )
            {
            // InternalMcblockstate.g:749:2: ( ( rule__Keyword__Alternatives ) )
            // InternalMcblockstate.g:750:3: ( rule__Keyword__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:751:3: ( rule__Keyword__Alternatives )
            // InternalMcblockstate.g:751:4: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordAccess().getAlternatives()); 
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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleLONG"
    // InternalMcblockstate.g:760:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalMcblockstate.g:761:1: ( ruleLONG EOF )
            // InternalMcblockstate.g:762:1: ruleLONG EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLONGRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLONG();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLONGRule()); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalMcblockstate.g:769:1: ruleLONG : ( ( rule__LONG__Alternatives ) ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:773:2: ( ( ( rule__LONG__Alternatives ) ) )
            // InternalMcblockstate.g:774:2: ( ( rule__LONG__Alternatives ) )
            {
            // InternalMcblockstate.g:774:2: ( ( rule__LONG__Alternatives ) )
            // InternalMcblockstate.g:775:3: ( rule__LONG__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLONGAccess().getAlternatives()); 
            }
            // InternalMcblockstate.g:776:3: ( rule__LONG__Alternatives )
            // InternalMcblockstate.g:776:4: rule__LONG__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LONG__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLONGAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "rule__Blockstate__Alternatives"
    // InternalMcblockstate.g:784:1: rule__Blockstate__Alternatives : ( ( ( rule__Blockstate__Group_0__0 ) ) | ( ruleCustomBlockstate ) );
    public final void rule__Blockstate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:788:1: ( ( ( rule__Blockstate__Group_0__0 ) ) | ( ruleCustomBlockstate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=25)) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
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
                    // InternalMcblockstate.g:789:2: ( ( rule__Blockstate__Group_0__0 ) )
                    {
                    // InternalMcblockstate.g:789:2: ( ( rule__Blockstate__Group_0__0 ) )
                    // InternalMcblockstate.g:790:3: ( rule__Blockstate__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstateAccess().getGroup_0()); 
                    }
                    // InternalMcblockstate.g:791:3: ( rule__Blockstate__Group_0__0 )
                    // InternalMcblockstate.g:791:4: rule__Blockstate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Blockstate__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstateAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:795:2: ( ruleCustomBlockstate )
                    {
                    // InternalMcblockstate.g:795:2: ( ruleCustomBlockstate )
                    // InternalMcblockstate.g:796:3: ruleCustomBlockstate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstateAccess().getCustomBlockstateParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCustomBlockstate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstateAccess().getCustomBlockstateParserRuleCall_1()); 
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
    // $ANTLR end "rule__Blockstate__Alternatives"


    // $ANTLR start "rule__Blockstate__Alternatives_0_0"
    // InternalMcblockstate.g:805:1: rule__Blockstate__Alternatives_0_0 : ( ( ruleVariantsBlockstate ) | ( ruleMultipartBlockstate ) );
    public final void rule__Blockstate__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:809:1: ( ( ruleVariantsBlockstate ) | ( ruleMultipartBlockstate ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=24 && LA3_0<=25)) ) {
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
                    // InternalMcblockstate.g:810:2: ( ruleVariantsBlockstate )
                    {
                    // InternalMcblockstate.g:810:2: ( ruleVariantsBlockstate )
                    // InternalMcblockstate.g:811:3: ruleVariantsBlockstate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstateAccess().getVariantsBlockstateParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariantsBlockstate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstateAccess().getVariantsBlockstateParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:816:2: ( ruleMultipartBlockstate )
                    {
                    // InternalMcblockstate.g:816:2: ( ruleMultipartBlockstate )
                    // InternalMcblockstate.g:817:3: ruleMultipartBlockstate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstateAccess().getMultipartBlockstateParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMultipartBlockstate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstateAccess().getMultipartBlockstateParserRuleCall_0_0_1()); 
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
    // $ANTLR end "rule__Blockstate__Alternatives_0_0"


    // $ANTLR start "rule__BaseCaseCondition__Alternatives"
    // InternalMcblockstate.g:826:1: rule__BaseCaseCondition__Alternatives : ( ( ( rule__BaseCaseCondition__Group_0__0 ) ) | ( ( rule__BaseCaseCondition__Group_1__0 ) ) );
    public final void rule__BaseCaseCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:830:1: ( ( ( rule__BaseCaseCondition__Group_0__0 ) ) | ( ( rule__BaseCaseCondition__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_SLONG)||(LA4_0>=18 && LA4_0<=28)||LA4_0==41) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMcblockstate.g:831:2: ( ( rule__BaseCaseCondition__Group_0__0 ) )
                    {
                    // InternalMcblockstate.g:831:2: ( ( rule__BaseCaseCondition__Group_0__0 ) )
                    // InternalMcblockstate.g:832:3: ( rule__BaseCaseCondition__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseCaseConditionAccess().getGroup_0()); 
                    }
                    // InternalMcblockstate.g:833:3: ( rule__BaseCaseCondition__Group_0__0 )
                    // InternalMcblockstate.g:833:4: rule__BaseCaseCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseCaseCondition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseCaseConditionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:837:2: ( ( rule__BaseCaseCondition__Group_1__0 ) )
                    {
                    // InternalMcblockstate.g:837:2: ( ( rule__BaseCaseCondition__Group_1__0 ) )
                    // InternalMcblockstate.g:838:3: ( rule__BaseCaseCondition__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseCaseConditionAccess().getGroup_1()); 
                    }
                    // InternalMcblockstate.g:839:3: ( rule__BaseCaseCondition__Group_1__0 )
                    // InternalMcblockstate.g:839:4: rule__BaseCaseCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseCaseCondition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseCaseConditionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Alternatives"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Alternatives"
    // InternalMcblockstate.g:847:1: rule__BlockstatePropertyPredicate__Alternatives : ( ( ( rule__BlockstatePropertyPredicate__Group_0__0 ) ) | ( ( rule__BlockstatePropertyPredicate__Group_1__0 ) ) );
    public final void rule__BlockstatePropertyPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:851:1: ( ( ( rule__BlockstatePropertyPredicate__Group_0__0 ) ) | ( ( rule__BlockstatePropertyPredicate__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMcblockstate.g:852:2: ( ( rule__BlockstatePropertyPredicate__Group_0__0 ) )
                    {
                    // InternalMcblockstate.g:852:2: ( ( rule__BlockstatePropertyPredicate__Group_0__0 ) )
                    // InternalMcblockstate.g:853:3: ( rule__BlockstatePropertyPredicate__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0()); 
                    }
                    // InternalMcblockstate.g:854:3: ( rule__BlockstatePropertyPredicate__Group_0__0 )
                    // InternalMcblockstate.g:854:4: rule__BlockstatePropertyPredicate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:858:2: ( ( rule__BlockstatePropertyPredicate__Group_1__0 ) )
                    {
                    // InternalMcblockstate.g:858:2: ( ( rule__BlockstatePropertyPredicate__Group_1__0 ) )
                    // InternalMcblockstate.g:859:3: ( rule__BlockstatePropertyPredicate__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_1()); 
                    }
                    // InternalMcblockstate.g:860:3: ( rule__BlockstatePropertyPredicate__Group_1__0 )
                    // InternalMcblockstate.g:860:4: rule__BlockstatePropertyPredicate__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Alternatives"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Alternatives_0_2_0"
    // InternalMcblockstate.g:868:1: rule__BlockstatePropertyPredicate__Alternatives_0_2_0 : ( ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 ) ) | ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 ) ) );
    public final void rule__BlockstatePropertyPredicate__Alternatives_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:872:1: ( ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 ) ) | ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
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
                    // InternalMcblockstate.g:873:2: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 ) )
                    {
                    // InternalMcblockstate.g:873:2: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 ) )
                    // InternalMcblockstate.g:874:3: ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_0()); 
                    }
                    // InternalMcblockstate.g:875:3: ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 )
                    // InternalMcblockstate.g:875:4: rule__BlockstatePropertyPredicate__Group_0_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__Group_0_2_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:879:2: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 ) )
                    {
                    // InternalMcblockstate.g:879:2: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 ) )
                    // InternalMcblockstate.g:880:3: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1()); 
                    }
                    // InternalMcblockstate.g:881:3: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 )
                    // InternalMcblockstate.g:881:4: rule__BlockstatePropertyPredicate__Group_0_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__Group_0_2_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Alternatives_0_2_0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0"
    // InternalMcblockstate.g:889:1: rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 : ( ( '=' ) | ( '==' ) );
    public final void rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:893:1: ( ( '=' ) | ( '==' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
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
                    // InternalMcblockstate.g:894:2: ( '=' )
                    {
                    // InternalMcblockstate.g:894:2: ( '=' )
                    // InternalMcblockstate.g:895:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignKeyword_0_2_0_0_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignKeyword_0_2_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:900:2: ( '==' )
                    {
                    // InternalMcblockstate.g:900:2: ( '==' )
                    // InternalMcblockstate.g:901:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignEqualsSignKeyword_0_2_0_0_0_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignEqualsSignKeyword_0_2_0_0_0_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0"


    // $ANTLR start "rule__BlockstatePropertyValue__Alternatives"
    // InternalMcblockstate.g:910:1: rule__BlockstatePropertyValue__Alternatives : ( ( 'true' ) | ( 'false' ) | ( 'null' ) | ( 'variants' ) | ( 'multipart' ) | ( 'in' ) | ( 'when' ) | ( 'apply' ) | ( 'x' ) | ( 'y' ) | ( 'uvlock' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_DOUBLE ) | ( ruleLONG ) );
    public final void rule__BlockstatePropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:914:1: ( ( 'true' ) | ( 'false' ) | ( 'null' ) | ( 'variants' ) | ( 'multipart' ) | ( 'in' ) | ( 'when' ) | ( 'apply' ) | ( 'x' ) | ( 'y' ) | ( 'uvlock' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_DOUBLE ) | ( ruleLONG ) )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            case 28:
                {
                alt8=11;
                }
                break;
            case RULE_ID:
                {
                alt8=12;
                }
                break;
            case RULE_STRING:
                {
                alt8=13;
                }
                break;
            case RULE_DOUBLE:
                {
                alt8=14;
                }
                break;
            case RULE_ULONG:
            case RULE_SLONG:
                {
                alt8=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMcblockstate.g:915:2: ( 'true' )
                    {
                    // InternalMcblockstate.g:915:2: ( 'true' )
                    // InternalMcblockstate.g:916:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getTrueKeyword_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:921:2: ( 'false' )
                    {
                    // InternalMcblockstate.g:921:2: ( 'false' )
                    // InternalMcblockstate.g:922:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getFalseKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:927:2: ( 'null' )
                    {
                    // InternalMcblockstate.g:927:2: ( 'null' )
                    // InternalMcblockstate.g:928:3: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getNullKeyword_2()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getNullKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:933:2: ( 'variants' )
                    {
                    // InternalMcblockstate.g:933:2: ( 'variants' )
                    // InternalMcblockstate.g:934:3: 'variants'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getVariantsKeyword_3()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getVariantsKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:939:2: ( 'multipart' )
                    {
                    // InternalMcblockstate.g:939:2: ( 'multipart' )
                    // InternalMcblockstate.g:940:3: 'multipart'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getMultipartKeyword_4()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getMultipartKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:945:2: ( 'in' )
                    {
                    // InternalMcblockstate.g:945:2: ( 'in' )
                    // InternalMcblockstate.g:946:3: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getInKeyword_5()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getInKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMcblockstate.g:951:2: ( 'when' )
                    {
                    // InternalMcblockstate.g:951:2: ( 'when' )
                    // InternalMcblockstate.g:952:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getWhenKeyword_6()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getWhenKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMcblockstate.g:957:2: ( 'apply' )
                    {
                    // InternalMcblockstate.g:957:2: ( 'apply' )
                    // InternalMcblockstate.g:958:3: 'apply'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getApplyKeyword_7()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getApplyKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMcblockstate.g:963:2: ( 'x' )
                    {
                    // InternalMcblockstate.g:963:2: ( 'x' )
                    // InternalMcblockstate.g:964:3: 'x'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getXKeyword_8()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getXKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMcblockstate.g:969:2: ( 'y' )
                    {
                    // InternalMcblockstate.g:969:2: ( 'y' )
                    // InternalMcblockstate.g:970:3: 'y'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getYKeyword_9()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getYKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMcblockstate.g:975:2: ( 'uvlock' )
                    {
                    // InternalMcblockstate.g:975:2: ( 'uvlock' )
                    // InternalMcblockstate.g:976:3: 'uvlock'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getUvlockKeyword_10()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getUvlockKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalMcblockstate.g:981:2: ( RULE_ID )
                    {
                    // InternalMcblockstate.g:981:2: ( RULE_ID )
                    // InternalMcblockstate.g:982:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getIDTerminalRuleCall_11()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getIDTerminalRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalMcblockstate.g:987:2: ( RULE_STRING )
                    {
                    // InternalMcblockstate.g:987:2: ( RULE_STRING )
                    // InternalMcblockstate.g:988:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getSTRINGTerminalRuleCall_12()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getSTRINGTerminalRuleCall_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalMcblockstate.g:993:2: ( RULE_DOUBLE )
                    {
                    // InternalMcblockstate.g:993:2: ( RULE_DOUBLE )
                    // InternalMcblockstate.g:994:3: RULE_DOUBLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getDOUBLETerminalRuleCall_13()); 
                    }
                    match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getDOUBLETerminalRuleCall_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalMcblockstate.g:999:2: ( ruleLONG )
                    {
                    // InternalMcblockstate.g:999:2: ( ruleLONG )
                    // InternalMcblockstate.g:1000:3: ruleLONG
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockstatePropertyValueAccess().getLONGParserRuleCall_14()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLONG();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockstatePropertyValueAccess().getLONGParserRuleCall_14()); 
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
    // $ANTLR end "rule__BlockstatePropertyValue__Alternatives"


    // $ANTLR start "rule__ModelList__Alternatives"
    // InternalMcblockstate.g:1009:1: rule__ModelList__Alternatives : ( ( ( rule__ModelList__Group_0__0 ) ) | ( ( rule__ModelList__ModelsAssignment_1 ) ) );
    public final void rule__ModelList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1013:1: ( ( ( rule__ModelList__Group_0__0 ) ) | ( ( rule__ModelList__ModelsAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||(LA9_0>=18 && LA9_0<=22)||(LA9_0>=24 && LA9_0<=25)||LA9_0==28) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMcblockstate.g:1014:2: ( ( rule__ModelList__Group_0__0 ) )
                    {
                    // InternalMcblockstate.g:1014:2: ( ( rule__ModelList__Group_0__0 ) )
                    // InternalMcblockstate.g:1015:3: ( rule__ModelList__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelListAccess().getGroup_0()); 
                    }
                    // InternalMcblockstate.g:1016:3: ( rule__ModelList__Group_0__0 )
                    // InternalMcblockstate.g:1016:4: rule__ModelList__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelList__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelListAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1020:2: ( ( rule__ModelList__ModelsAssignment_1 ) )
                    {
                    // InternalMcblockstate.g:1020:2: ( ( rule__ModelList__ModelsAssignment_1 ) )
                    // InternalMcblockstate.g:1021:3: ( rule__ModelList__ModelsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelListAccess().getModelsAssignment_1()); 
                    }
                    // InternalMcblockstate.g:1022:3: ( rule__ModelList__ModelsAssignment_1 )
                    // InternalMcblockstate.g:1022:4: rule__ModelList__ModelsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelList__ModelsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelListAccess().getModelsAssignment_1()); 
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
    // $ANTLR end "rule__ModelList__Alternatives"


    // $ANTLR start "rule__Model__Alternatives_2_0_1_2_2"
    // InternalMcblockstate.g:1030:1: rule__Model__Alternatives_2_0_1_2_2 : ( ( ( rule__Model__UvlockAssignment_2_0_1_2_2_0 ) ) | ( 'false' ) );
    public final void rule__Model__Alternatives_2_0_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1034:1: ( ( ( rule__Model__UvlockAssignment_2_0_1_2_2_0 ) ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
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
                    // InternalMcblockstate.g:1035:2: ( ( rule__Model__UvlockAssignment_2_0_1_2_2_0 ) )
                    {
                    // InternalMcblockstate.g:1035:2: ( ( rule__Model__UvlockAssignment_2_0_1_2_2_0 ) )
                    // InternalMcblockstate.g:1036:3: ( rule__Model__UvlockAssignment_2_0_1_2_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getUvlockAssignment_2_0_1_2_2_0()); 
                    }
                    // InternalMcblockstate.g:1037:3: ( rule__Model__UvlockAssignment_2_0_1_2_2_0 )
                    // InternalMcblockstate.g:1037:4: rule__Model__UvlockAssignment_2_0_1_2_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UvlockAssignment_2_0_1_2_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getUvlockAssignment_2_0_1_2_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1041:2: ( 'false' )
                    {
                    // InternalMcblockstate.g:1041:2: ( 'false' )
                    // InternalMcblockstate.g:1042:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getFalseKeyword_2_0_1_2_2_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getFalseKeyword_2_0_1_2_2_1()); 
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
    // $ANTLR end "rule__Model__Alternatives_2_0_1_2_2"


    // $ANTLR start "rule__MCJsonValue__Alternatives"
    // InternalMcblockstate.g:1051:1: rule__MCJsonValue__Alternatives : ( ( ruleMCJsonObject ) | ( ruleMCJsonArray ) | ( ruleMCJsonString ) | ( ruleMCJsonNumber ) | ( ruleMCJsonBoolean ) | ( ruleMCJsonNull ) );
    public final void rule__MCJsonValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1055:1: ( ( ruleMCJsonObject ) | ( ruleMCJsonArray ) | ( ruleMCJsonString ) | ( ruleMCJsonNumber ) | ( ruleMCJsonBoolean ) | ( ruleMCJsonNull ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_ULONG:
            case RULE_SLONG:
                {
                alt11=4;
                }
                break;
            case 18:
            case 19:
                {
                alt11=5;
                }
                break;
            case 20:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMcblockstate.g:1056:2: ( ruleMCJsonObject )
                    {
                    // InternalMcblockstate.g:1056:2: ( ruleMCJsonObject )
                    // InternalMcblockstate.g:1057:3: ruleMCJsonObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonObjectParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonObjectParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1062:2: ( ruleMCJsonArray )
                    {
                    // InternalMcblockstate.g:1062:2: ( ruleMCJsonArray )
                    // InternalMcblockstate.g:1063:3: ruleMCJsonArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonArrayParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonArrayParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:1068:2: ( ruleMCJsonString )
                    {
                    // InternalMcblockstate.g:1068:2: ( ruleMCJsonString )
                    // InternalMcblockstate.g:1069:3: ruleMCJsonString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonStringParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonStringParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:1074:2: ( ruleMCJsonNumber )
                    {
                    // InternalMcblockstate.g:1074:2: ( ruleMCJsonNumber )
                    // InternalMcblockstate.g:1075:3: ruleMCJsonNumber
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonNumberParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonNumber();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonNumberParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:1080:2: ( ruleMCJsonBoolean )
                    {
                    // InternalMcblockstate.g:1080:2: ( ruleMCJsonBoolean )
                    // InternalMcblockstate.g:1081:3: ruleMCJsonBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonBooleanParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonBooleanParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:1086:2: ( ruleMCJsonNull )
                    {
                    // InternalMcblockstate.g:1086:2: ( ruleMCJsonNull )
                    // InternalMcblockstate.g:1087:3: ruleMCJsonNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonValueAccess().getMCJsonNullParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonValueAccess().getMCJsonNullParserRuleCall_5()); 
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
    // $ANTLR end "rule__MCJsonValue__Alternatives"


    // $ANTLR start "rule__MCJsonNumber__Alternatives"
    // InternalMcblockstate.g:1096:1: rule__MCJsonNumber__Alternatives : ( ( ruleMCJsonIntegral ) | ( ruleMCJsonFloatingPoint ) );
    public final void rule__MCJsonNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1100:1: ( ( ruleMCJsonIntegral ) | ( ruleMCJsonFloatingPoint ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ULONG && LA12_0<=RULE_SLONG)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DOUBLE) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMcblockstate.g:1101:2: ( ruleMCJsonIntegral )
                    {
                    // InternalMcblockstate.g:1101:2: ( ruleMCJsonIntegral )
                    // InternalMcblockstate.g:1102:3: ruleMCJsonIntegral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonNumberAccess().getMCJsonIntegralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonIntegral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonNumberAccess().getMCJsonIntegralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1107:2: ( ruleMCJsonFloatingPoint )
                    {
                    // InternalMcblockstate.g:1107:2: ( ruleMCJsonFloatingPoint )
                    // InternalMcblockstate.g:1108:3: ruleMCJsonFloatingPoint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonNumberAccess().getMCJsonFloatingPointParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMCJsonFloatingPoint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonNumberAccess().getMCJsonFloatingPointParserRuleCall_1()); 
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
    // $ANTLR end "rule__MCJsonNumber__Alternatives"


    // $ANTLR start "rule__MCJsonBoolean__Alternatives"
    // InternalMcblockstate.g:1117:1: rule__MCJsonBoolean__Alternatives : ( ( ( rule__MCJsonBoolean__ValueAssignment_0 ) ) | ( ( rule__MCJsonBoolean__Group_1__0 ) ) );
    public final void rule__MCJsonBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1121:1: ( ( ( rule__MCJsonBoolean__ValueAssignment_0 ) ) | ( ( rule__MCJsonBoolean__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMcblockstate.g:1122:2: ( ( rule__MCJsonBoolean__ValueAssignment_0 ) )
                    {
                    // InternalMcblockstate.g:1122:2: ( ( rule__MCJsonBoolean__ValueAssignment_0 ) )
                    // InternalMcblockstate.g:1123:3: ( rule__MCJsonBoolean__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonBooleanAccess().getValueAssignment_0()); 
                    }
                    // InternalMcblockstate.g:1124:3: ( rule__MCJsonBoolean__ValueAssignment_0 )
                    // InternalMcblockstate.g:1124:4: rule__MCJsonBoolean__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MCJsonBoolean__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonBooleanAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1128:2: ( ( rule__MCJsonBoolean__Group_1__0 ) )
                    {
                    // InternalMcblockstate.g:1128:2: ( ( rule__MCJsonBoolean__Group_1__0 ) )
                    // InternalMcblockstate.g:1129:3: ( rule__MCJsonBoolean__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMCJsonBooleanAccess().getGroup_1()); 
                    }
                    // InternalMcblockstate.g:1130:3: ( rule__MCJsonBoolean__Group_1__0 )
                    // InternalMcblockstate.g:1130:4: rule__MCJsonBoolean__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MCJsonBoolean__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMCJsonBooleanAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MCJsonBoolean__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // InternalMcblockstate.g:1138:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( ruleKeyword ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1142:1: ( ( RULE_ID ) | ( ruleKeyword ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=18 && LA14_0<=22)||(LA14_0>=24 && LA14_0<=25)||LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMcblockstate.g:1143:2: ( RULE_ID )
                    {
                    // InternalMcblockstate.g:1143:2: ( RULE_ID )
                    // InternalMcblockstate.g:1144:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1149:2: ( ruleKeyword )
                    {
                    // InternalMcblockstate.g:1149:2: ( ruleKeyword )
                    // InternalMcblockstate.g:1150:3: ruleKeyword
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getKeywordParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getKeywordParserRuleCall_1()); 
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
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Keyword__Alternatives"
    // InternalMcblockstate.g:1159:1: rule__Keyword__Alternatives : ( ( 'apply' ) | ( 'false' ) | ( 'multipart' ) | ( 'null' ) | ( 'true' ) | ( 'uvlock' ) | ( 'variants' ) | ( 'when' ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1163:1: ( ( 'apply' ) | ( 'false' ) | ( 'multipart' ) | ( 'null' ) | ( 'true' ) | ( 'uvlock' ) | ( 'variants' ) | ( 'when' ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 20:
                {
                alt15=4;
                }
                break;
            case 18:
                {
                alt15=5;
                }
                break;
            case 28:
                {
                alt15=6;
                }
                break;
            case 21:
                {
                alt15=7;
                }
                break;
            case 24:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMcblockstate.g:1164:2: ( 'apply' )
                    {
                    // InternalMcblockstate.g:1164:2: ( 'apply' )
                    // InternalMcblockstate.g:1165:3: 'apply'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getApplyKeyword_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getApplyKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1170:2: ( 'false' )
                    {
                    // InternalMcblockstate.g:1170:2: ( 'false' )
                    // InternalMcblockstate.g:1171:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getFalseKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:1176:2: ( 'multipart' )
                    {
                    // InternalMcblockstate.g:1176:2: ( 'multipart' )
                    // InternalMcblockstate.g:1177:3: 'multipart'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getMultipartKeyword_2()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getMultipartKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:1182:2: ( 'null' )
                    {
                    // InternalMcblockstate.g:1182:2: ( 'null' )
                    // InternalMcblockstate.g:1183:3: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getNullKeyword_3()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getNullKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:1188:2: ( 'true' )
                    {
                    // InternalMcblockstate.g:1188:2: ( 'true' )
                    // InternalMcblockstate.g:1189:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getTrueKeyword_4()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getTrueKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:1194:2: ( 'uvlock' )
                    {
                    // InternalMcblockstate.g:1194:2: ( 'uvlock' )
                    // InternalMcblockstate.g:1195:3: 'uvlock'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getUvlockKeyword_5()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getUvlockKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMcblockstate.g:1200:2: ( 'variants' )
                    {
                    // InternalMcblockstate.g:1200:2: ( 'variants' )
                    // InternalMcblockstate.g:1201:3: 'variants'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getVariantsKeyword_6()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getVariantsKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMcblockstate.g:1206:2: ( 'when' )
                    {
                    // InternalMcblockstate.g:1206:2: ( 'when' )
                    // InternalMcblockstate.g:1207:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordAccess().getWhenKeyword_7()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordAccess().getWhenKeyword_7()); 
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
    // $ANTLR end "rule__Keyword__Alternatives"


    // $ANTLR start "rule__LONG__Alternatives"
    // InternalMcblockstate.g:1216:1: rule__LONG__Alternatives : ( ( RULE_ULONG ) | ( RULE_SLONG ) );
    public final void rule__LONG__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1220:1: ( ( RULE_ULONG ) | ( RULE_SLONG ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ULONG) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SLONG) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMcblockstate.g:1221:2: ( RULE_ULONG )
                    {
                    // InternalMcblockstate.g:1221:2: ( RULE_ULONG )
                    // InternalMcblockstate.g:1222:3: RULE_ULONG
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLONGAccess().getULONGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ULONG,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLONGAccess().getULONGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1227:2: ( RULE_SLONG )
                    {
                    // InternalMcblockstate.g:1227:2: ( RULE_SLONG )
                    // InternalMcblockstate.g:1228:3: RULE_SLONG
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLONGAccess().getSLONGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_SLONG,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLONGAccess().getSLONGTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__LONG__Alternatives"


    // $ANTLR start "rule__Blockstate__Group_0__0"
    // InternalMcblockstate.g:1237:1: rule__Blockstate__Group_0__0 : rule__Blockstate__Group_0__0__Impl ;
    public final void rule__Blockstate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1241:1: ( rule__Blockstate__Group_0__0__Impl )
            // InternalMcblockstate.g:1242:2: rule__Blockstate__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Blockstate__Group_0__0__Impl();

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
    // $ANTLR end "rule__Blockstate__Group_0__0"


    // $ANTLR start "rule__Blockstate__Group_0__0__Impl"
    // InternalMcblockstate.g:1248:1: rule__Blockstate__Group_0__0__Impl : ( ( rule__Blockstate__Alternatives_0_0 ) ) ;
    public final void rule__Blockstate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1252:1: ( ( ( rule__Blockstate__Alternatives_0_0 ) ) )
            // InternalMcblockstate.g:1253:1: ( ( rule__Blockstate__Alternatives_0_0 ) )
            {
            // InternalMcblockstate.g:1253:1: ( ( rule__Blockstate__Alternatives_0_0 ) )
            // InternalMcblockstate.g:1254:2: ( rule__Blockstate__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstateAccess().getAlternatives_0_0()); 
            }
            // InternalMcblockstate.g:1255:2: ( rule__Blockstate__Alternatives_0_0 )
            // InternalMcblockstate.g:1255:3: rule__Blockstate__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Blockstate__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstateAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__Blockstate__Group_0__0__Impl"


    // $ANTLR start "rule__VariantsBlockstate__Group__0"
    // InternalMcblockstate.g:1264:1: rule__VariantsBlockstate__Group__0 : rule__VariantsBlockstate__Group__0__Impl rule__VariantsBlockstate__Group__1 ;
    public final void rule__VariantsBlockstate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1268:1: ( rule__VariantsBlockstate__Group__0__Impl rule__VariantsBlockstate__Group__1 )
            // InternalMcblockstate.g:1269:2: rule__VariantsBlockstate__Group__0__Impl rule__VariantsBlockstate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariantsBlockstate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__1();

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
    // $ANTLR end "rule__VariantsBlockstate__Group__0"


    // $ANTLR start "rule__VariantsBlockstate__Group__0__Impl"
    // InternalMcblockstate.g:1276:1: rule__VariantsBlockstate__Group__0__Impl : ( 'variants' ) ;
    public final void rule__VariantsBlockstate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1280:1: ( ( 'variants' ) )
            // InternalMcblockstate.g:1281:1: ( 'variants' )
            {
            // InternalMcblockstate.g:1281:1: ( 'variants' )
            // InternalMcblockstate.g:1282:2: 'variants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getVariantsKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getVariantsKeyword_0()); 
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
    // $ANTLR end "rule__VariantsBlockstate__Group__0__Impl"


    // $ANTLR start "rule__VariantsBlockstate__Group__1"
    // InternalMcblockstate.g:1291:1: rule__VariantsBlockstate__Group__1 : rule__VariantsBlockstate__Group__1__Impl rule__VariantsBlockstate__Group__2 ;
    public final void rule__VariantsBlockstate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1295:1: ( rule__VariantsBlockstate__Group__1__Impl rule__VariantsBlockstate__Group__2 )
            // InternalMcblockstate.g:1296:2: rule__VariantsBlockstate__Group__1__Impl rule__VariantsBlockstate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VariantsBlockstate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__2();

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
    // $ANTLR end "rule__VariantsBlockstate__Group__1"


    // $ANTLR start "rule__VariantsBlockstate__Group__1__Impl"
    // InternalMcblockstate.g:1303:1: rule__VariantsBlockstate__Group__1__Impl : ( () ) ;
    public final void rule__VariantsBlockstate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1307:1: ( ( () ) )
            // InternalMcblockstate.g:1308:1: ( () )
            {
            // InternalMcblockstate.g:1308:1: ( () )
            // InternalMcblockstate.g:1309:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getVariantsBlockstateAction_1()); 
            }
            // InternalMcblockstate.g:1310:2: ()
            // InternalMcblockstate.g:1310:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getVariantsBlockstateAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariantsBlockstate__Group__1__Impl"


    // $ANTLR start "rule__VariantsBlockstate__Group__2"
    // InternalMcblockstate.g:1318:1: rule__VariantsBlockstate__Group__2 : rule__VariantsBlockstate__Group__2__Impl rule__VariantsBlockstate__Group__3 ;
    public final void rule__VariantsBlockstate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1322:1: ( rule__VariantsBlockstate__Group__2__Impl rule__VariantsBlockstate__Group__3 )
            // InternalMcblockstate.g:1323:2: rule__VariantsBlockstate__Group__2__Impl rule__VariantsBlockstate__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VariantsBlockstate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__3();

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
    // $ANTLR end "rule__VariantsBlockstate__Group__2"


    // $ANTLR start "rule__VariantsBlockstate__Group__2__Impl"
    // InternalMcblockstate.g:1330:1: rule__VariantsBlockstate__Group__2__Impl : ( '{' ) ;
    public final void rule__VariantsBlockstate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1334:1: ( ( '{' ) )
            // InternalMcblockstate.g:1335:1: ( '{' )
            {
            // InternalMcblockstate.g:1335:1: ( '{' )
            // InternalMcblockstate.g:1336:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__VariantsBlockstate__Group__2__Impl"


    // $ANTLR start "rule__VariantsBlockstate__Group__3"
    // InternalMcblockstate.g:1345:1: rule__VariantsBlockstate__Group__3 : rule__VariantsBlockstate__Group__3__Impl rule__VariantsBlockstate__Group__4 ;
    public final void rule__VariantsBlockstate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1349:1: ( rule__VariantsBlockstate__Group__3__Impl rule__VariantsBlockstate__Group__4 )
            // InternalMcblockstate.g:1350:2: rule__VariantsBlockstate__Group__3__Impl rule__VariantsBlockstate__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__VariantsBlockstate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__4();

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
    // $ANTLR end "rule__VariantsBlockstate__Group__3"


    // $ANTLR start "rule__VariantsBlockstate__Group__3__Impl"
    // InternalMcblockstate.g:1357:1: rule__VariantsBlockstate__Group__3__Impl : ( ( rule__VariantsBlockstate__VariantsAssignment_3 )* ) ;
    public final void rule__VariantsBlockstate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1361:1: ( ( ( rule__VariantsBlockstate__VariantsAssignment_3 )* ) )
            // InternalMcblockstate.g:1362:1: ( ( rule__VariantsBlockstate__VariantsAssignment_3 )* )
            {
            // InternalMcblockstate.g:1362:1: ( ( rule__VariantsBlockstate__VariantsAssignment_3 )* )
            // InternalMcblockstate.g:1363:2: ( rule__VariantsBlockstate__VariantsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getVariantsAssignment_3()); 
            }
            // InternalMcblockstate.g:1364:2: ( rule__VariantsBlockstate__VariantsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMcblockstate.g:1364:3: rule__VariantsBlockstate__VariantsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__VariantsBlockstate__VariantsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getVariantsAssignment_3()); 
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
    // $ANTLR end "rule__VariantsBlockstate__Group__3__Impl"


    // $ANTLR start "rule__VariantsBlockstate__Group__4"
    // InternalMcblockstate.g:1372:1: rule__VariantsBlockstate__Group__4 : rule__VariantsBlockstate__Group__4__Impl ;
    public final void rule__VariantsBlockstate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1376:1: ( rule__VariantsBlockstate__Group__4__Impl )
            // InternalMcblockstate.g:1377:2: rule__VariantsBlockstate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariantsBlockstate__Group__4__Impl();

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
    // $ANTLR end "rule__VariantsBlockstate__Group__4"


    // $ANTLR start "rule__VariantsBlockstate__Group__4__Impl"
    // InternalMcblockstate.g:1383:1: rule__VariantsBlockstate__Group__4__Impl : ( '}' ) ;
    public final void rule__VariantsBlockstate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1387:1: ( ( '}' ) )
            // InternalMcblockstate.g:1388:1: ( '}' )
            {
            // InternalMcblockstate.g:1388:1: ( '}' )
            // InternalMcblockstate.g:1389:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__VariantsBlockstate__Group__4__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // InternalMcblockstate.g:1399:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1403:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // InternalMcblockstate.g:1404:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Variant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__1();

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
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // InternalMcblockstate.g:1411:1: rule__Variant__Group__0__Impl : ( '[' ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1415:1: ( ( '[' ) )
            // InternalMcblockstate.g:1416:1: ( '[' )
            {
            // InternalMcblockstate.g:1416:1: ( '[' )
            // InternalMcblockstate.g:1417:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // InternalMcblockstate.g:1426:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1430:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // InternalMcblockstate.g:1431:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__2();

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
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // InternalMcblockstate.g:1438:1: rule__Variant__Group__1__Impl : ( ( rule__Variant__Group_1__0 )? ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1442:1: ( ( ( rule__Variant__Group_1__0 )? ) )
            // InternalMcblockstate.g:1443:1: ( ( rule__Variant__Group_1__0 )? )
            {
            // InternalMcblockstate.g:1443:1: ( ( rule__Variant__Group_1__0 )? )
            // InternalMcblockstate.g:1444:2: ( rule__Variant__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup_1()); 
            }
            // InternalMcblockstate.g:1445:2: ( rule__Variant__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_SLONG)||(LA18_0>=18 && LA18_0<=28)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMcblockstate.g:1445:3: rule__Variant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variant__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // InternalMcblockstate.g:1453:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1457:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // InternalMcblockstate.g:1458:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Variant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__3();

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
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // InternalMcblockstate.g:1465:1: rule__Variant__Group__2__Impl : ( ']' ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1469:1: ( ( ']' ) )
            // InternalMcblockstate.g:1470:1: ( ']' )
            {
            // InternalMcblockstate.g:1470:1: ( ']' )
            // InternalMcblockstate.g:1471:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // InternalMcblockstate.g:1480:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1484:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // InternalMcblockstate.g:1485:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Variant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__4();

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
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // InternalMcblockstate.g:1492:1: rule__Variant__Group__3__Impl : ( '=' ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1496:1: ( ( '=' ) )
            // InternalMcblockstate.g:1497:1: ( '=' )
            {
            // InternalMcblockstate.g:1497:1: ( '=' )
            // InternalMcblockstate.g:1498:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group__4"
    // InternalMcblockstate.g:1507:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1511:1: ( rule__Variant__Group__4__Impl )
            // InternalMcblockstate.g:1512:2: rule__Variant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__4__Impl();

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
    // $ANTLR end "rule__Variant__Group__4"


    // $ANTLR start "rule__Variant__Group__4__Impl"
    // InternalMcblockstate.g:1518:1: rule__Variant__Group__4__Impl : ( ( rule__Variant__ModelsAssignment_4 ) ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1522:1: ( ( ( rule__Variant__ModelsAssignment_4 ) ) )
            // InternalMcblockstate.g:1523:1: ( ( rule__Variant__ModelsAssignment_4 ) )
            {
            // InternalMcblockstate.g:1523:1: ( ( rule__Variant__ModelsAssignment_4 ) )
            // InternalMcblockstate.g:1524:2: ( rule__Variant__ModelsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getModelsAssignment_4()); 
            }
            // InternalMcblockstate.g:1525:2: ( rule__Variant__ModelsAssignment_4 )
            // InternalMcblockstate.g:1525:3: rule__Variant__ModelsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variant__ModelsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getModelsAssignment_4()); 
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
    // $ANTLR end "rule__Variant__Group__4__Impl"


    // $ANTLR start "rule__Variant__Group_1__0"
    // InternalMcblockstate.g:1534:1: rule__Variant__Group_1__0 : rule__Variant__Group_1__0__Impl rule__Variant__Group_1__1 ;
    public final void rule__Variant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1538:1: ( rule__Variant__Group_1__0__Impl rule__Variant__Group_1__1 )
            // InternalMcblockstate.g:1539:2: rule__Variant__Group_1__0__Impl rule__Variant__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Variant__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1__1();

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
    // $ANTLR end "rule__Variant__Group_1__0"


    // $ANTLR start "rule__Variant__Group_1__0__Impl"
    // InternalMcblockstate.g:1546:1: rule__Variant__Group_1__0__Impl : ( ( rule__Variant__PropertiesAssignment_1_0 ) ) ;
    public final void rule__Variant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1550:1: ( ( ( rule__Variant__PropertiesAssignment_1_0 ) ) )
            // InternalMcblockstate.g:1551:1: ( ( rule__Variant__PropertiesAssignment_1_0 ) )
            {
            // InternalMcblockstate.g:1551:1: ( ( rule__Variant__PropertiesAssignment_1_0 ) )
            // InternalMcblockstate.g:1552:2: ( rule__Variant__PropertiesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getPropertiesAssignment_1_0()); 
            }
            // InternalMcblockstate.g:1553:2: ( rule__Variant__PropertiesAssignment_1_0 )
            // InternalMcblockstate.g:1553:3: rule__Variant__PropertiesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__PropertiesAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getPropertiesAssignment_1_0()); 
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
    // $ANTLR end "rule__Variant__Group_1__0__Impl"


    // $ANTLR start "rule__Variant__Group_1__1"
    // InternalMcblockstate.g:1561:1: rule__Variant__Group_1__1 : rule__Variant__Group_1__1__Impl rule__Variant__Group_1__2 ;
    public final void rule__Variant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1565:1: ( rule__Variant__Group_1__1__Impl rule__Variant__Group_1__2 )
            // InternalMcblockstate.g:1566:2: rule__Variant__Group_1__1__Impl rule__Variant__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Variant__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1__2();

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
    // $ANTLR end "rule__Variant__Group_1__1"


    // $ANTLR start "rule__Variant__Group_1__1__Impl"
    // InternalMcblockstate.g:1573:1: rule__Variant__Group_1__1__Impl : ( ( rule__Variant__Group_1_1__0 )* ) ;
    public final void rule__Variant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1577:1: ( ( ( rule__Variant__Group_1_1__0 )* ) )
            // InternalMcblockstate.g:1578:1: ( ( rule__Variant__Group_1_1__0 )* )
            {
            // InternalMcblockstate.g:1578:1: ( ( rule__Variant__Group_1_1__0 )* )
            // InternalMcblockstate.g:1579:2: ( rule__Variant__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup_1_1()); 
            }
            // InternalMcblockstate.g:1580:2: ( rule__Variant__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=RULE_ID && LA19_1<=RULE_SLONG)||(LA19_1>=18 && LA19_1<=28)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMcblockstate.g:1580:3: rule__Variant__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Variant__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Variant__Group_1__1__Impl"


    // $ANTLR start "rule__Variant__Group_1__2"
    // InternalMcblockstate.g:1588:1: rule__Variant__Group_1__2 : rule__Variant__Group_1__2__Impl ;
    public final void rule__Variant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1592:1: ( rule__Variant__Group_1__2__Impl )
            // InternalMcblockstate.g:1593:2: rule__Variant__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1__2__Impl();

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
    // $ANTLR end "rule__Variant__Group_1__2"


    // $ANTLR start "rule__Variant__Group_1__2__Impl"
    // InternalMcblockstate.g:1599:1: rule__Variant__Group_1__2__Impl : ( ( ',' )? ) ;
    public final void rule__Variant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1603:1: ( ( ( ',' )? ) )
            // InternalMcblockstate.g:1604:1: ( ( ',' )? )
            {
            // InternalMcblockstate.g:1604:1: ( ( ',' )? )
            // InternalMcblockstate.g:1605:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getCommaKeyword_1_2()); 
            }
            // InternalMcblockstate.g:1606:2: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMcblockstate.g:1606:3: ','
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getCommaKeyword_1_2()); 
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
    // $ANTLR end "rule__Variant__Group_1__2__Impl"


    // $ANTLR start "rule__Variant__Group_1_1__0"
    // InternalMcblockstate.g:1615:1: rule__Variant__Group_1_1__0 : rule__Variant__Group_1_1__0__Impl ;
    public final void rule__Variant__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1619:1: ( rule__Variant__Group_1_1__0__Impl )
            // InternalMcblockstate.g:1620:2: rule__Variant__Group_1_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1_1__0__Impl();

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
    // $ANTLR end "rule__Variant__Group_1_1__0"


    // $ANTLR start "rule__Variant__Group_1_1__0__Impl"
    // InternalMcblockstate.g:1626:1: rule__Variant__Group_1_1__0__Impl : ( ( rule__Variant__Group_1_1_0__0 ) ) ;
    public final void rule__Variant__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1630:1: ( ( ( rule__Variant__Group_1_1_0__0 ) ) )
            // InternalMcblockstate.g:1631:1: ( ( rule__Variant__Group_1_1_0__0 ) )
            {
            // InternalMcblockstate.g:1631:1: ( ( rule__Variant__Group_1_1_0__0 ) )
            // InternalMcblockstate.g:1632:2: ( rule__Variant__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup_1_1_0()); 
            }
            // InternalMcblockstate.g:1633:2: ( rule__Variant__Group_1_1_0__0 )
            // InternalMcblockstate.g:1633:3: rule__Variant__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getGroup_1_1_0()); 
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
    // $ANTLR end "rule__Variant__Group_1_1__0__Impl"


    // $ANTLR start "rule__Variant__Group_1_1_0__0"
    // InternalMcblockstate.g:1642:1: rule__Variant__Group_1_1_0__0 : rule__Variant__Group_1_1_0__0__Impl rule__Variant__Group_1_1_0__1 ;
    public final void rule__Variant__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1646:1: ( rule__Variant__Group_1_1_0__0__Impl rule__Variant__Group_1_1_0__1 )
            // InternalMcblockstate.g:1647:2: rule__Variant__Group_1_1_0__0__Impl rule__Variant__Group_1_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Variant__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1_1_0__1();

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
    // $ANTLR end "rule__Variant__Group_1_1_0__0"


    // $ANTLR start "rule__Variant__Group_1_1_0__0__Impl"
    // InternalMcblockstate.g:1654:1: rule__Variant__Group_1_1_0__0__Impl : ( ',' ) ;
    public final void rule__Variant__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1658:1: ( ( ',' ) )
            // InternalMcblockstate.g:1659:1: ( ',' )
            {
            // InternalMcblockstate.g:1659:1: ( ',' )
            // InternalMcblockstate.g:1660:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getCommaKeyword_1_1_0_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getCommaKeyword_1_1_0_0()); 
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
    // $ANTLR end "rule__Variant__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Variant__Group_1_1_0__1"
    // InternalMcblockstate.g:1669:1: rule__Variant__Group_1_1_0__1 : rule__Variant__Group_1_1_0__1__Impl ;
    public final void rule__Variant__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1673:1: ( rule__Variant__Group_1_1_0__1__Impl )
            // InternalMcblockstate.g:1674:2: rule__Variant__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group_1_1_0__1__Impl();

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
    // $ANTLR end "rule__Variant__Group_1_1_0__1"


    // $ANTLR start "rule__Variant__Group_1_1_0__1__Impl"
    // InternalMcblockstate.g:1680:1: rule__Variant__Group_1_1_0__1__Impl : ( ( rule__Variant__PropertiesAssignment_1_1_0_1 ) ) ;
    public final void rule__Variant__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1684:1: ( ( ( rule__Variant__PropertiesAssignment_1_1_0_1 ) ) )
            // InternalMcblockstate.g:1685:1: ( ( rule__Variant__PropertiesAssignment_1_1_0_1 ) )
            {
            // InternalMcblockstate.g:1685:1: ( ( rule__Variant__PropertiesAssignment_1_1_0_1 ) )
            // InternalMcblockstate.g:1686:2: ( rule__Variant__PropertiesAssignment_1_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getPropertiesAssignment_1_1_0_1()); 
            }
            // InternalMcblockstate.g:1687:2: ( rule__Variant__PropertiesAssignment_1_1_0_1 )
            // InternalMcblockstate.g:1687:3: rule__Variant__PropertiesAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variant__PropertiesAssignment_1_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getPropertiesAssignment_1_1_0_1()); 
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
    // $ANTLR end "rule__Variant__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__BlockstateProperty__Group__0"
    // InternalMcblockstate.g:1696:1: rule__BlockstateProperty__Group__0 : rule__BlockstateProperty__Group__0__Impl rule__BlockstateProperty__Group__1 ;
    public final void rule__BlockstateProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1700:1: ( rule__BlockstateProperty__Group__0__Impl rule__BlockstateProperty__Group__1 )
            // InternalMcblockstate.g:1701:2: rule__BlockstateProperty__Group__0__Impl rule__BlockstateProperty__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BlockstateProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__Group__1();

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
    // $ANTLR end "rule__BlockstateProperty__Group__0"


    // $ANTLR start "rule__BlockstateProperty__Group__0__Impl"
    // InternalMcblockstate.g:1708:1: rule__BlockstateProperty__Group__0__Impl : ( ( rule__BlockstateProperty__NameAssignment_0 ) ) ;
    public final void rule__BlockstateProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1712:1: ( ( ( rule__BlockstateProperty__NameAssignment_0 ) ) )
            // InternalMcblockstate.g:1713:1: ( ( rule__BlockstateProperty__NameAssignment_0 ) )
            {
            // InternalMcblockstate.g:1713:1: ( ( rule__BlockstateProperty__NameAssignment_0 ) )
            // InternalMcblockstate.g:1714:2: ( rule__BlockstateProperty__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getNameAssignment_0()); 
            }
            // InternalMcblockstate.g:1715:2: ( rule__BlockstateProperty__NameAssignment_0 )
            // InternalMcblockstate.g:1715:3: rule__BlockstateProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__BlockstateProperty__Group__0__Impl"


    // $ANTLR start "rule__BlockstateProperty__Group__1"
    // InternalMcblockstate.g:1723:1: rule__BlockstateProperty__Group__1 : rule__BlockstateProperty__Group__1__Impl rule__BlockstateProperty__Group__2 ;
    public final void rule__BlockstateProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1727:1: ( rule__BlockstateProperty__Group__1__Impl rule__BlockstateProperty__Group__2 )
            // InternalMcblockstate.g:1728:2: rule__BlockstateProperty__Group__1__Impl rule__BlockstateProperty__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BlockstateProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__Group__2();

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
    // $ANTLR end "rule__BlockstateProperty__Group__1"


    // $ANTLR start "rule__BlockstateProperty__Group__1__Impl"
    // InternalMcblockstate.g:1735:1: rule__BlockstateProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BlockstateProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1739:1: ( ( '=' ) )
            // InternalMcblockstate.g:1740:1: ( '=' )
            {
            // InternalMcblockstate.g:1740:1: ( '=' )
            // InternalMcblockstate.g:1741:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getEqualsSignKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__BlockstateProperty__Group__1__Impl"


    // $ANTLR start "rule__BlockstateProperty__Group__2"
    // InternalMcblockstate.g:1750:1: rule__BlockstateProperty__Group__2 : rule__BlockstateProperty__Group__2__Impl ;
    public final void rule__BlockstateProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1754:1: ( rule__BlockstateProperty__Group__2__Impl )
            // InternalMcblockstate.g:1755:2: rule__BlockstateProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__Group__2__Impl();

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
    // $ANTLR end "rule__BlockstateProperty__Group__2"


    // $ANTLR start "rule__BlockstateProperty__Group__2__Impl"
    // InternalMcblockstate.g:1761:1: rule__BlockstateProperty__Group__2__Impl : ( ( rule__BlockstateProperty__ValueAssignment_2 ) ) ;
    public final void rule__BlockstateProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1765:1: ( ( ( rule__BlockstateProperty__ValueAssignment_2 ) ) )
            // InternalMcblockstate.g:1766:1: ( ( rule__BlockstateProperty__ValueAssignment_2 ) )
            {
            // InternalMcblockstate.g:1766:1: ( ( rule__BlockstateProperty__ValueAssignment_2 ) )
            // InternalMcblockstate.g:1767:2: ( rule__BlockstateProperty__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getValueAssignment_2()); 
            }
            // InternalMcblockstate.g:1768:2: ( rule__BlockstateProperty__ValueAssignment_2 )
            // InternalMcblockstate.g:1768:3: rule__BlockstateProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BlockstateProperty__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__BlockstateProperty__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalMcblockstate.g:1777:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1781:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalMcblockstate.g:1782:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Case__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

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
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalMcblockstate.g:1789:1: rule__Case__Group__0__Impl : ( ( rule__Case__Group_0__0 )? ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1793:1: ( ( ( rule__Case__Group_0__0 )? ) )
            // InternalMcblockstate.g:1794:1: ( ( rule__Case__Group_0__0 )? )
            {
            // InternalMcblockstate.g:1794:1: ( ( rule__Case__Group_0__0 )? )
            // InternalMcblockstate.g:1795:2: ( rule__Case__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup_0()); 
            }
            // InternalMcblockstate.g:1796:2: ( rule__Case__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMcblockstate.g:1796:3: rule__Case__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Case__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalMcblockstate.g:1804:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1808:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalMcblockstate.g:1809:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Case__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

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
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalMcblockstate.g:1816:1: rule__Case__Group__1__Impl : ( 'apply' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1820:1: ( ( 'apply' ) )
            // InternalMcblockstate.g:1821:1: ( 'apply' )
            {
            // InternalMcblockstate.g:1821:1: ( 'apply' )
            // InternalMcblockstate.g:1822:2: 'apply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getApplyKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getApplyKeyword_1()); 
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
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalMcblockstate.g:1831:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1835:1: ( rule__Case__Group__2__Impl )
            // InternalMcblockstate.g:1836:2: rule__Case__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__2__Impl();

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
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalMcblockstate.g:1842:1: rule__Case__Group__2__Impl : ( ( rule__Case__ModelsAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1846:1: ( ( ( rule__Case__ModelsAssignment_2 ) ) )
            // InternalMcblockstate.g:1847:1: ( ( rule__Case__ModelsAssignment_2 ) )
            {
            // InternalMcblockstate.g:1847:1: ( ( rule__Case__ModelsAssignment_2 ) )
            // InternalMcblockstate.g:1848:2: ( rule__Case__ModelsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getModelsAssignment_2()); 
            }
            // InternalMcblockstate.g:1849:2: ( rule__Case__ModelsAssignment_2 )
            // InternalMcblockstate.g:1849:3: rule__Case__ModelsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__ModelsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getModelsAssignment_2()); 
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
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group_0__0"
    // InternalMcblockstate.g:1858:1: rule__Case__Group_0__0 : rule__Case__Group_0__0__Impl rule__Case__Group_0__1 ;
    public final void rule__Case__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1862:1: ( rule__Case__Group_0__0__Impl rule__Case__Group_0__1 )
            // InternalMcblockstate.g:1863:2: rule__Case__Group_0__0__Impl rule__Case__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Case__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group_0__1();

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
    // $ANTLR end "rule__Case__Group_0__0"


    // $ANTLR start "rule__Case__Group_0__0__Impl"
    // InternalMcblockstate.g:1870:1: rule__Case__Group_0__0__Impl : ( 'when' ) ;
    public final void rule__Case__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1874:1: ( ( 'when' ) )
            // InternalMcblockstate.g:1875:1: ( 'when' )
            {
            // InternalMcblockstate.g:1875:1: ( 'when' )
            // InternalMcblockstate.g:1876:2: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getWhenKeyword_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getWhenKeyword_0_0()); 
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
    // $ANTLR end "rule__Case__Group_0__0__Impl"


    // $ANTLR start "rule__Case__Group_0__1"
    // InternalMcblockstate.g:1885:1: rule__Case__Group_0__1 : rule__Case__Group_0__1__Impl rule__Case__Group_0__2 ;
    public final void rule__Case__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1889:1: ( rule__Case__Group_0__1__Impl rule__Case__Group_0__2 )
            // InternalMcblockstate.g:1890:2: rule__Case__Group_0__1__Impl rule__Case__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group_0__2();

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
    // $ANTLR end "rule__Case__Group_0__1"


    // $ANTLR start "rule__Case__Group_0__1__Impl"
    // InternalMcblockstate.g:1897:1: rule__Case__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Case__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1901:1: ( ( '(' ) )
            // InternalMcblockstate.g:1902:1: ( '(' )
            {
            // InternalMcblockstate.g:1902:1: ( '(' )
            // InternalMcblockstate.g:1903:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getLeftParenthesisKeyword_0_1()); 
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
    // $ANTLR end "rule__Case__Group_0__1__Impl"


    // $ANTLR start "rule__Case__Group_0__2"
    // InternalMcblockstate.g:1912:1: rule__Case__Group_0__2 : rule__Case__Group_0__2__Impl rule__Case__Group_0__3 ;
    public final void rule__Case__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1916:1: ( rule__Case__Group_0__2__Impl rule__Case__Group_0__3 )
            // InternalMcblockstate.g:1917:2: rule__Case__Group_0__2__Impl rule__Case__Group_0__3
            {
            pushFollow(FOLLOW_16);
            rule__Case__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group_0__3();

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
    // $ANTLR end "rule__Case__Group_0__2"


    // $ANTLR start "rule__Case__Group_0__2__Impl"
    // InternalMcblockstate.g:1924:1: rule__Case__Group_0__2__Impl : ( ( rule__Case__ConditionAssignment_0_2 ) ) ;
    public final void rule__Case__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1928:1: ( ( ( rule__Case__ConditionAssignment_0_2 ) ) )
            // InternalMcblockstate.g:1929:1: ( ( rule__Case__ConditionAssignment_0_2 ) )
            {
            // InternalMcblockstate.g:1929:1: ( ( rule__Case__ConditionAssignment_0_2 ) )
            // InternalMcblockstate.g:1930:2: ( rule__Case__ConditionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getConditionAssignment_0_2()); 
            }
            // InternalMcblockstate.g:1931:2: ( rule__Case__ConditionAssignment_0_2 )
            // InternalMcblockstate.g:1931:3: rule__Case__ConditionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__ConditionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getConditionAssignment_0_2()); 
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
    // $ANTLR end "rule__Case__Group_0__2__Impl"


    // $ANTLR start "rule__Case__Group_0__3"
    // InternalMcblockstate.g:1939:1: rule__Case__Group_0__3 : rule__Case__Group_0__3__Impl ;
    public final void rule__Case__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1943:1: ( rule__Case__Group_0__3__Impl )
            // InternalMcblockstate.g:1944:2: rule__Case__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group_0__3__Impl();

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
    // $ANTLR end "rule__Case__Group_0__3"


    // $ANTLR start "rule__Case__Group_0__3__Impl"
    // InternalMcblockstate.g:1950:1: rule__Case__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Case__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1954:1: ( ( ')' ) )
            // InternalMcblockstate.g:1955:1: ( ')' )
            {
            // InternalMcblockstate.g:1955:1: ( ')' )
            // InternalMcblockstate.g:1956:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getRightParenthesisKeyword_0_3()); 
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
    // $ANTLR end "rule__Case__Group_0__3__Impl"


    // $ANTLR start "rule__CaseCondition__Group__0"
    // InternalMcblockstate.g:1966:1: rule__CaseCondition__Group__0 : rule__CaseCondition__Group__0__Impl rule__CaseCondition__Group__1 ;
    public final void rule__CaseCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1970:1: ( rule__CaseCondition__Group__0__Impl rule__CaseCondition__Group__1 )
            // InternalMcblockstate.g:1971:2: rule__CaseCondition__Group__0__Impl rule__CaseCondition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CaseCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group__1();

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
    // $ANTLR end "rule__CaseCondition__Group__0"


    // $ANTLR start "rule__CaseCondition__Group__0__Impl"
    // InternalMcblockstate.g:1978:1: rule__CaseCondition__Group__0__Impl : ( ruleBaseCaseCondition ) ;
    public final void rule__CaseCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1982:1: ( ( ruleBaseCaseCondition ) )
            // InternalMcblockstate.g:1983:1: ( ruleBaseCaseCondition )
            {
            // InternalMcblockstate.g:1983:1: ( ruleBaseCaseCondition )
            // InternalMcblockstate.g:1984:2: ruleBaseCaseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getBaseCaseConditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getBaseCaseConditionParserRuleCall_0()); 
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
    // $ANTLR end "rule__CaseCondition__Group__0__Impl"


    // $ANTLR start "rule__CaseCondition__Group__1"
    // InternalMcblockstate.g:1993:1: rule__CaseCondition__Group__1 : rule__CaseCondition__Group__1__Impl ;
    public final void rule__CaseCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:1997:1: ( rule__CaseCondition__Group__1__Impl )
            // InternalMcblockstate.g:1998:2: rule__CaseCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group__1__Impl();

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
    // $ANTLR end "rule__CaseCondition__Group__1"


    // $ANTLR start "rule__CaseCondition__Group__1__Impl"
    // InternalMcblockstate.g:2004:1: rule__CaseCondition__Group__1__Impl : ( ( rule__CaseCondition__Group_1__0 )? ) ;
    public final void rule__CaseCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2008:1: ( ( ( rule__CaseCondition__Group_1__0 )? ) )
            // InternalMcblockstate.g:2009:1: ( ( rule__CaseCondition__Group_1__0 )? )
            {
            // InternalMcblockstate.g:2009:1: ( ( rule__CaseCondition__Group_1__0 )? )
            // InternalMcblockstate.g:2010:2: ( rule__CaseCondition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getGroup_1()); 
            }
            // InternalMcblockstate.g:2011:2: ( rule__CaseCondition__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMcblockstate.g:2011:3: rule__CaseCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseCondition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CaseCondition__Group__1__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1__0"
    // InternalMcblockstate.g:2020:1: rule__CaseCondition__Group_1__0 : rule__CaseCondition__Group_1__0__Impl ;
    public final void rule__CaseCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2024:1: ( rule__CaseCondition__Group_1__0__Impl )
            // InternalMcblockstate.g:2025:2: rule__CaseCondition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1__0__Impl();

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
    // $ANTLR end "rule__CaseCondition__Group_1__0"


    // $ANTLR start "rule__CaseCondition__Group_1__0__Impl"
    // InternalMcblockstate.g:2031:1: rule__CaseCondition__Group_1__0__Impl : ( ( rule__CaseCondition__Group_1_0__0 ) ) ;
    public final void rule__CaseCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2035:1: ( ( ( rule__CaseCondition__Group_1_0__0 ) ) )
            // InternalMcblockstate.g:2036:1: ( ( rule__CaseCondition__Group_1_0__0 ) )
            {
            // InternalMcblockstate.g:2036:1: ( ( rule__CaseCondition__Group_1_0__0 ) )
            // InternalMcblockstate.g:2037:2: ( rule__CaseCondition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getGroup_1_0()); 
            }
            // InternalMcblockstate.g:2038:2: ( rule__CaseCondition__Group_1_0__0 )
            // InternalMcblockstate.g:2038:3: rule__CaseCondition__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1__0__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0__0"
    // InternalMcblockstate.g:2047:1: rule__CaseCondition__Group_1_0__0 : rule__CaseCondition__Group_1_0__0__Impl rule__CaseCondition__Group_1_0__1 ;
    public final void rule__CaseCondition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2051:1: ( rule__CaseCondition__Group_1_0__0__Impl rule__CaseCondition__Group_1_0__1 )
            // InternalMcblockstate.g:2052:2: rule__CaseCondition__Group_1_0__0__Impl rule__CaseCondition__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__CaseCondition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0__1();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0__0"


    // $ANTLR start "rule__CaseCondition__Group_1_0__0__Impl"
    // InternalMcblockstate.g:2059:1: rule__CaseCondition__Group_1_0__0__Impl : ( '|' ) ;
    public final void rule__CaseCondition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2063:1: ( ( '|' ) )
            // InternalMcblockstate.g:2064:1: ( '|' )
            {
            // InternalMcblockstate.g:2064:1: ( '|' )
            // InternalMcblockstate.g:2065:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_0()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1_0__0__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0__1"
    // InternalMcblockstate.g:2074:1: rule__CaseCondition__Group_1_0__1 : rule__CaseCondition__Group_1_0__1__Impl rule__CaseCondition__Group_1_0__2 ;
    public final void rule__CaseCondition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2078:1: ( rule__CaseCondition__Group_1_0__1__Impl rule__CaseCondition__Group_1_0__2 )
            // InternalMcblockstate.g:2079:2: rule__CaseCondition__Group_1_0__1__Impl rule__CaseCondition__Group_1_0__2
            {
            pushFollow(FOLLOW_15);
            rule__CaseCondition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0__2();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0__1"


    // $ANTLR start "rule__CaseCondition__Group_1_0__1__Impl"
    // InternalMcblockstate.g:2086:1: rule__CaseCondition__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CaseCondition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2090:1: ( ( () ) )
            // InternalMcblockstate.g:2091:1: ( () )
            {
            // InternalMcblockstate.g:2091:1: ( () )
            // InternalMcblockstate.g:2092:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getOrCaseConditionOptionsAction_1_0_1()); 
            }
            // InternalMcblockstate.g:2093:2: ()
            // InternalMcblockstate.g:2093:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getOrCaseConditionOptionsAction_1_0_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseCondition__Group_1_0__1__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0__2"
    // InternalMcblockstate.g:2101:1: rule__CaseCondition__Group_1_0__2 : rule__CaseCondition__Group_1_0__2__Impl rule__CaseCondition__Group_1_0__3 ;
    public final void rule__CaseCondition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2105:1: ( rule__CaseCondition__Group_1_0__2__Impl rule__CaseCondition__Group_1_0__3 )
            // InternalMcblockstate.g:2106:2: rule__CaseCondition__Group_1_0__2__Impl rule__CaseCondition__Group_1_0__3
            {
            pushFollow(FOLLOW_17);
            rule__CaseCondition__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0__3();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0__2"


    // $ANTLR start "rule__CaseCondition__Group_1_0__2__Impl"
    // InternalMcblockstate.g:2113:1: rule__CaseCondition__Group_1_0__2__Impl : ( ( rule__CaseCondition__OptionsAssignment_1_0_2 ) ) ;
    public final void rule__CaseCondition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2117:1: ( ( ( rule__CaseCondition__OptionsAssignment_1_0_2 ) ) )
            // InternalMcblockstate.g:2118:1: ( ( rule__CaseCondition__OptionsAssignment_1_0_2 ) )
            {
            // InternalMcblockstate.g:2118:1: ( ( rule__CaseCondition__OptionsAssignment_1_0_2 ) )
            // InternalMcblockstate.g:2119:2: ( rule__CaseCondition__OptionsAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getOptionsAssignment_1_0_2()); 
            }
            // InternalMcblockstate.g:2120:2: ( rule__CaseCondition__OptionsAssignment_1_0_2 )
            // InternalMcblockstate.g:2120:3: rule__CaseCondition__OptionsAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__OptionsAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getOptionsAssignment_1_0_2()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1_0__2__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0__3"
    // InternalMcblockstate.g:2128:1: rule__CaseCondition__Group_1_0__3 : rule__CaseCondition__Group_1_0__3__Impl ;
    public final void rule__CaseCondition__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2132:1: ( rule__CaseCondition__Group_1_0__3__Impl )
            // InternalMcblockstate.g:2133:2: rule__CaseCondition__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0__3"


    // $ANTLR start "rule__CaseCondition__Group_1_0__3__Impl"
    // InternalMcblockstate.g:2139:1: rule__CaseCondition__Group_1_0__3__Impl : ( ( rule__CaseCondition__Group_1_0_3__0 )* ) ;
    public final void rule__CaseCondition__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2143:1: ( ( ( rule__CaseCondition__Group_1_0_3__0 )* ) )
            // InternalMcblockstate.g:2144:1: ( ( rule__CaseCondition__Group_1_0_3__0 )* )
            {
            // InternalMcblockstate.g:2144:1: ( ( rule__CaseCondition__Group_1_0_3__0 )* )
            // InternalMcblockstate.g:2145:2: ( rule__CaseCondition__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getGroup_1_0_3()); 
            }
            // InternalMcblockstate.g:2146:2: ( rule__CaseCondition__Group_1_0_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMcblockstate.g:2146:3: rule__CaseCondition__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CaseCondition__Group_1_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getGroup_1_0_3()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1_0__3__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0_3__0"
    // InternalMcblockstate.g:2155:1: rule__CaseCondition__Group_1_0_3__0 : rule__CaseCondition__Group_1_0_3__0__Impl rule__CaseCondition__Group_1_0_3__1 ;
    public final void rule__CaseCondition__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2159:1: ( rule__CaseCondition__Group_1_0_3__0__Impl rule__CaseCondition__Group_1_0_3__1 )
            // InternalMcblockstate.g:2160:2: rule__CaseCondition__Group_1_0_3__0__Impl rule__CaseCondition__Group_1_0_3__1
            {
            pushFollow(FOLLOW_15);
            rule__CaseCondition__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0_3__1();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0_3__0"


    // $ANTLR start "rule__CaseCondition__Group_1_0_3__0__Impl"
    // InternalMcblockstate.g:2167:1: rule__CaseCondition__Group_1_0_3__0__Impl : ( '|' ) ;
    public final void rule__CaseCondition__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2171:1: ( ( '|' ) )
            // InternalMcblockstate.g:2172:1: ( '|' )
            {
            // InternalMcblockstate.g:2172:1: ( '|' )
            // InternalMcblockstate.g:2173:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_3_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_3_0()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__CaseCondition__Group_1_0_3__1"
    // InternalMcblockstate.g:2182:1: rule__CaseCondition__Group_1_0_3__1 : rule__CaseCondition__Group_1_0_3__1__Impl ;
    public final void rule__CaseCondition__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2186:1: ( rule__CaseCondition__Group_1_0_3__1__Impl )
            // InternalMcblockstate.g:2187:2: rule__CaseCondition__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__Group_1_0_3__1__Impl();

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
    // $ANTLR end "rule__CaseCondition__Group_1_0_3__1"


    // $ANTLR start "rule__CaseCondition__Group_1_0_3__1__Impl"
    // InternalMcblockstate.g:2193:1: rule__CaseCondition__Group_1_0_3__1__Impl : ( ( rule__CaseCondition__OptionsAssignment_1_0_3_1 ) ) ;
    public final void rule__CaseCondition__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2197:1: ( ( ( rule__CaseCondition__OptionsAssignment_1_0_3_1 ) ) )
            // InternalMcblockstate.g:2198:1: ( ( rule__CaseCondition__OptionsAssignment_1_0_3_1 ) )
            {
            // InternalMcblockstate.g:2198:1: ( ( rule__CaseCondition__OptionsAssignment_1_0_3_1 ) )
            // InternalMcblockstate.g:2199:2: ( rule__CaseCondition__OptionsAssignment_1_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getOptionsAssignment_1_0_3_1()); 
            }
            // InternalMcblockstate.g:2200:2: ( rule__CaseCondition__OptionsAssignment_1_0_3_1 )
            // InternalMcblockstate.g:2200:3: rule__CaseCondition__OptionsAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseCondition__OptionsAssignment_1_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getOptionsAssignment_1_0_3_1()); 
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
    // $ANTLR end "rule__CaseCondition__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__0"
    // InternalMcblockstate.g:2209:1: rule__BaseCaseCondition__Group_0__0 : rule__BaseCaseCondition__Group_0__0__Impl rule__BaseCaseCondition__Group_0__1 ;
    public final void rule__BaseCaseCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2213:1: ( rule__BaseCaseCondition__Group_0__0__Impl rule__BaseCaseCondition__Group_0__1 )
            // InternalMcblockstate.g:2214:2: rule__BaseCaseCondition__Group_0__0__Impl rule__BaseCaseCondition__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__BaseCaseCondition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_0__1();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__0"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__0__Impl"
    // InternalMcblockstate.g:2221:1: rule__BaseCaseCondition__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseCaseCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2225:1: ( ( '(' ) )
            // InternalMcblockstate.g:2226:1: ( '(' )
            {
            // InternalMcblockstate.g:2226:1: ( '(' )
            // InternalMcblockstate.g:2227:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__0__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__1"
    // InternalMcblockstate.g:2236:1: rule__BaseCaseCondition__Group_0__1 : rule__BaseCaseCondition__Group_0__1__Impl rule__BaseCaseCondition__Group_0__2 ;
    public final void rule__BaseCaseCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2240:1: ( rule__BaseCaseCondition__Group_0__1__Impl rule__BaseCaseCondition__Group_0__2 )
            // InternalMcblockstate.g:2241:2: rule__BaseCaseCondition__Group_0__1__Impl rule__BaseCaseCondition__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__BaseCaseCondition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_0__2();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__1"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__1__Impl"
    // InternalMcblockstate.g:2248:1: rule__BaseCaseCondition__Group_0__1__Impl : ( ruleCaseCondition ) ;
    public final void rule__BaseCaseCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2252:1: ( ( ruleCaseCondition ) )
            // InternalMcblockstate.g:2253:1: ( ruleCaseCondition )
            {
            // InternalMcblockstate.g:2253:1: ( ruleCaseCondition )
            // InternalMcblockstate.g:2254:2: ruleCaseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getCaseConditionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getCaseConditionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__1__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__2"
    // InternalMcblockstate.g:2263:1: rule__BaseCaseCondition__Group_0__2 : rule__BaseCaseCondition__Group_0__2__Impl ;
    public final void rule__BaseCaseCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2267:1: ( rule__BaseCaseCondition__Group_0__2__Impl )
            // InternalMcblockstate.g:2268:2: rule__BaseCaseCondition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_0__2__Impl();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__2"


    // $ANTLR start "rule__BaseCaseCondition__Group_0__2__Impl"
    // InternalMcblockstate.g:2274:1: rule__BaseCaseCondition__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseCaseCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2278:1: ( ( ')' ) )
            // InternalMcblockstate.g:2279:1: ( ')' )
            {
            // InternalMcblockstate.g:2279:1: ( ')' )
            // InternalMcblockstate.g:2280:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_0__2__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__0"
    // InternalMcblockstate.g:2290:1: rule__BaseCaseCondition__Group_1__0 : rule__BaseCaseCondition__Group_1__0__Impl rule__BaseCaseCondition__Group_1__1 ;
    public final void rule__BaseCaseCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2294:1: ( rule__BaseCaseCondition__Group_1__0__Impl rule__BaseCaseCondition__Group_1__1 )
            // InternalMcblockstate.g:2295:2: rule__BaseCaseCondition__Group_1__0__Impl rule__BaseCaseCondition__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__BaseCaseCondition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_1__1();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_1__0"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__0__Impl"
    // InternalMcblockstate.g:2302:1: rule__BaseCaseCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseCaseCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2306:1: ( ( () ) )
            // InternalMcblockstate.g:2307:1: ( () )
            {
            // InternalMcblockstate.g:2307:1: ( () )
            // InternalMcblockstate.g:2308:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getBaseCaseConditionAction_1_0()); 
            }
            // InternalMcblockstate.g:2309:2: ()
            // InternalMcblockstate.g:2309:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getBaseCaseConditionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCaseCondition__Group_1__0__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__1"
    // InternalMcblockstate.g:2317:1: rule__BaseCaseCondition__Group_1__1 : rule__BaseCaseCondition__Group_1__1__Impl rule__BaseCaseCondition__Group_1__2 ;
    public final void rule__BaseCaseCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2321:1: ( rule__BaseCaseCondition__Group_1__1__Impl rule__BaseCaseCondition__Group_1__2 )
            // InternalMcblockstate.g:2322:2: rule__BaseCaseCondition__Group_1__1__Impl rule__BaseCaseCondition__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__BaseCaseCondition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_1__2();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_1__1"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__1__Impl"
    // InternalMcblockstate.g:2329:1: rule__BaseCaseCondition__Group_1__1__Impl : ( ( rule__BaseCaseCondition__PropertiesAssignment_1_1 ) ) ;
    public final void rule__BaseCaseCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2333:1: ( ( ( rule__BaseCaseCondition__PropertiesAssignment_1_1 ) ) )
            // InternalMcblockstate.g:2334:1: ( ( rule__BaseCaseCondition__PropertiesAssignment_1_1 ) )
            {
            // InternalMcblockstate.g:2334:1: ( ( rule__BaseCaseCondition__PropertiesAssignment_1_1 ) )
            // InternalMcblockstate.g:2335:2: ( rule__BaseCaseCondition__PropertiesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getPropertiesAssignment_1_1()); 
            }
            // InternalMcblockstate.g:2336:2: ( rule__BaseCaseCondition__PropertiesAssignment_1_1 )
            // InternalMcblockstate.g:2336:3: rule__BaseCaseCondition__PropertiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__PropertiesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getPropertiesAssignment_1_1()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_1__1__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__2"
    // InternalMcblockstate.g:2344:1: rule__BaseCaseCondition__Group_1__2 : rule__BaseCaseCondition__Group_1__2__Impl ;
    public final void rule__BaseCaseCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2348:1: ( rule__BaseCaseCondition__Group_1__2__Impl )
            // InternalMcblockstate.g:2349:2: rule__BaseCaseCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_1__2"


    // $ANTLR start "rule__BaseCaseCondition__Group_1__2__Impl"
    // InternalMcblockstate.g:2355:1: rule__BaseCaseCondition__Group_1__2__Impl : ( ( rule__BaseCaseCondition__Group_1_2__0 )* ) ;
    public final void rule__BaseCaseCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2359:1: ( ( ( rule__BaseCaseCondition__Group_1_2__0 )* ) )
            // InternalMcblockstate.g:2360:1: ( ( rule__BaseCaseCondition__Group_1_2__0 )* )
            {
            // InternalMcblockstate.g:2360:1: ( ( rule__BaseCaseCondition__Group_1_2__0 )* )
            // InternalMcblockstate.g:2361:2: ( rule__BaseCaseCondition__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getGroup_1_2()); 
            }
            // InternalMcblockstate.g:2362:2: ( rule__BaseCaseCondition__Group_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMcblockstate.g:2362:3: rule__BaseCaseCondition__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__BaseCaseCondition__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_1__2__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_1_2__0"
    // InternalMcblockstate.g:2371:1: rule__BaseCaseCondition__Group_1_2__0 : rule__BaseCaseCondition__Group_1_2__0__Impl rule__BaseCaseCondition__Group_1_2__1 ;
    public final void rule__BaseCaseCondition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2375:1: ( rule__BaseCaseCondition__Group_1_2__0__Impl rule__BaseCaseCondition__Group_1_2__1 )
            // InternalMcblockstate.g:2376:2: rule__BaseCaseCondition__Group_1_2__0__Impl rule__BaseCaseCondition__Group_1_2__1
            {
            pushFollow(FOLLOW_15);
            rule__BaseCaseCondition__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_1_2__1();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_1_2__0"


    // $ANTLR start "rule__BaseCaseCondition__Group_1_2__0__Impl"
    // InternalMcblockstate.g:2383:1: rule__BaseCaseCondition__Group_1_2__0__Impl : ( '&' ) ;
    public final void rule__BaseCaseCondition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2387:1: ( ( '&' ) )
            // InternalMcblockstate.g:2388:1: ( '&' )
            {
            // InternalMcblockstate.g:2388:1: ( '&' )
            // InternalMcblockstate.g:2389:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getAmpersandKeyword_1_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getAmpersandKeyword_1_2_0()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_1_2__0__Impl"


    // $ANTLR start "rule__BaseCaseCondition__Group_1_2__1"
    // InternalMcblockstate.g:2398:1: rule__BaseCaseCondition__Group_1_2__1 : rule__BaseCaseCondition__Group_1_2__1__Impl ;
    public final void rule__BaseCaseCondition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2402:1: ( rule__BaseCaseCondition__Group_1_2__1__Impl )
            // InternalMcblockstate.g:2403:2: rule__BaseCaseCondition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__BaseCaseCondition__Group_1_2__1"


    // $ANTLR start "rule__BaseCaseCondition__Group_1_2__1__Impl"
    // InternalMcblockstate.g:2409:1: rule__BaseCaseCondition__Group_1_2__1__Impl : ( ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 ) ) ;
    public final void rule__BaseCaseCondition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2413:1: ( ( ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 ) ) )
            // InternalMcblockstate.g:2414:1: ( ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 ) )
            {
            // InternalMcblockstate.g:2414:1: ( ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 ) )
            // InternalMcblockstate.g:2415:2: ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getPropertiesAssignment_1_2_1()); 
            }
            // InternalMcblockstate.g:2416:2: ( rule__BaseCaseCondition__PropertiesAssignment_1_2_1 )
            // InternalMcblockstate.g:2416:3: rule__BaseCaseCondition__PropertiesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseCaseCondition__PropertiesAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getPropertiesAssignment_1_2_1()); 
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
    // $ANTLR end "rule__BaseCaseCondition__Group_1_2__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__0"
    // InternalMcblockstate.g:2425:1: rule__BlockstatePropertyPredicate__Group_0__0 : rule__BlockstatePropertyPredicate__Group_0__0__Impl rule__BlockstatePropertyPredicate__Group_0__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2429:1: ( rule__BlockstatePropertyPredicate__Group_0__0__Impl rule__BlockstatePropertyPredicate__Group_0__1 )
            // InternalMcblockstate.g:2430:2: rule__BlockstatePropertyPredicate__Group_0__0__Impl rule__BlockstatePropertyPredicate__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__BlockstatePropertyPredicate__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__0__Impl"
    // InternalMcblockstate.g:2437:1: rule__BlockstatePropertyPredicate__Group_0__0__Impl : ( () ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2441:1: ( ( () ) )
            // InternalMcblockstate.g:2442:1: ( () )
            {
            // InternalMcblockstate.g:2442:1: ( () )
            // InternalMcblockstate.g:2443:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getNormalBlockstatePropertyPredicateAction_0_0()); 
            }
            // InternalMcblockstate.g:2444:2: ()
            // InternalMcblockstate.g:2444:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getNormalBlockstatePropertyPredicateAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__1"
    // InternalMcblockstate.g:2452:1: rule__BlockstatePropertyPredicate__Group_0__1 : rule__BlockstatePropertyPredicate__Group_0__1__Impl rule__BlockstatePropertyPredicate__Group_0__2 ;
    public final void rule__BlockstatePropertyPredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2456:1: ( rule__BlockstatePropertyPredicate__Group_0__1__Impl rule__BlockstatePropertyPredicate__Group_0__2 )
            // InternalMcblockstate.g:2457:2: rule__BlockstatePropertyPredicate__Group_0__1__Impl rule__BlockstatePropertyPredicate__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__BlockstatePropertyPredicate__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0__2();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__1__Impl"
    // InternalMcblockstate.g:2464:1: rule__BlockstatePropertyPredicate__Group_0__1__Impl : ( ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2468:1: ( ( ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 ) ) )
            // InternalMcblockstate.g:2469:1: ( ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 ) )
            {
            // InternalMcblockstate.g:2469:1: ( ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 ) )
            // InternalMcblockstate.g:2470:2: ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getNameAssignment_0_1()); 
            }
            // InternalMcblockstate.g:2471:2: ( rule__BlockstatePropertyPredicate__NameAssignment_0_1 )
            // InternalMcblockstate.g:2471:3: rule__BlockstatePropertyPredicate__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getNameAssignment_0_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__2"
    // InternalMcblockstate.g:2479:1: rule__BlockstatePropertyPredicate__Group_0__2 : rule__BlockstatePropertyPredicate__Group_0__2__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2483:1: ( rule__BlockstatePropertyPredicate__Group_0__2__Impl )
            // InternalMcblockstate.g:2484:2: rule__BlockstatePropertyPredicate__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0__2__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__2"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0__2__Impl"
    // InternalMcblockstate.g:2490:1: rule__BlockstatePropertyPredicate__Group_0__2__Impl : ( ( rule__BlockstatePropertyPredicate__Group_0_2__0 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2494:1: ( ( ( rule__BlockstatePropertyPredicate__Group_0_2__0 ) ) )
            // InternalMcblockstate.g:2495:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2__0 ) )
            {
            // InternalMcblockstate.g:2495:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2__0 ) )
            // InternalMcblockstate.g:2496:2: ( rule__BlockstatePropertyPredicate__Group_0_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2()); 
            }
            // InternalMcblockstate.g:2497:2: ( rule__BlockstatePropertyPredicate__Group_0_2__0 )
            // InternalMcblockstate.g:2497:3: rule__BlockstatePropertyPredicate__Group_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0__2__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2__0"
    // InternalMcblockstate.g:2506:1: rule__BlockstatePropertyPredicate__Group_0_2__0 : rule__BlockstatePropertyPredicate__Group_0_2__0__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2510:1: ( rule__BlockstatePropertyPredicate__Group_0_2__0__Impl )
            // InternalMcblockstate.g:2511:2: rule__BlockstatePropertyPredicate__Group_0_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2__0__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2__0__Impl"
    // InternalMcblockstate.g:2517:1: rule__BlockstatePropertyPredicate__Group_0_2__0__Impl : ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2521:1: ( ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 ) ) )
            // InternalMcblockstate.g:2522:1: ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 ) )
            {
            // InternalMcblockstate.g:2522:1: ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 ) )
            // InternalMcblockstate.g:2523:2: ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives_0_2_0()); 
            }
            // InternalMcblockstate.g:2524:2: ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0 )
            // InternalMcblockstate.g:2524:3: rule__BlockstatePropertyPredicate__Alternatives_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Alternatives_0_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives_0_2_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_0__0"
    // InternalMcblockstate.g:2533:1: rule__BlockstatePropertyPredicate__Group_0_2_0_0__0 : rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_0__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2537:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_0__1 )
            // InternalMcblockstate.g:2538:2: rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_0__1
            {
            pushFollow(FOLLOW_12);
            rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_0__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_0__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl"
    // InternalMcblockstate.g:2545:1: rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl : ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2549:1: ( ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 ) ) )
            // InternalMcblockstate.g:2550:1: ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 ) )
            {
            // InternalMcblockstate.g:2550:1: ( ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 ) )
            // InternalMcblockstate.g:2551:2: ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives_0_2_0_0_0()); 
            }
            // InternalMcblockstate.g:2552:2: ( rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0 )
            // InternalMcblockstate.g:2552:3: rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Alternatives_0_2_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getAlternatives_0_2_0_0_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_0__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_0__1"
    // InternalMcblockstate.g:2560:1: rule__BlockstatePropertyPredicate__Group_0_2_0_0__1 : rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2564:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl )
            // InternalMcblockstate.g:2565:2: rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_0__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl"
    // InternalMcblockstate.g:2571:1: rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl : ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2575:1: ( ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 ) ) )
            // InternalMcblockstate.g:2576:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 ) )
            {
            // InternalMcblockstate.g:2576:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 ) )
            // InternalMcblockstate.g:2577:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_0_1()); 
            }
            // InternalMcblockstate.g:2578:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 )
            // InternalMcblockstate.g:2578:3: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_0_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_0__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__0"
    // InternalMcblockstate.g:2587:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__0 : rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2591:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__1 )
            // InternalMcblockstate.g:2592:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl"
    // InternalMcblockstate.g:2599:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl : ( 'in' ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2603:1: ( ( 'in' ) )
            // InternalMcblockstate.g:2604:1: ( 'in' )
            {
            // InternalMcblockstate.g:2604:1: ( 'in' )
            // InternalMcblockstate.g:2605:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getInKeyword_0_2_0_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getInKeyword_0_2_0_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__1"
    // InternalMcblockstate.g:2614:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__1 : rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__2 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2618:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__2 )
            // InternalMcblockstate.g:2619:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__2
            {
            pushFollow(FOLLOW_22);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__2();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl"
    // InternalMcblockstate.g:2626:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl : ( '(' ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2630:1: ( ( '(' ) )
            // InternalMcblockstate.g:2631:1: ( '(' )
            {
            // InternalMcblockstate.g:2631:1: ( '(' )
            // InternalMcblockstate.g:2632:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getLeftParenthesisKeyword_0_2_0_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getLeftParenthesisKeyword_0_2_0_1_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__2"
    // InternalMcblockstate.g:2641:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__2 : rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__3 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2645:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__3 )
            // InternalMcblockstate.g:2646:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1__3
            {
            pushFollow(FOLLOW_22);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__3();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__2"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl"
    // InternalMcblockstate.g:2653:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl : ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )? ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2657:1: ( ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )? ) )
            // InternalMcblockstate.g:2658:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )? )
            {
            // InternalMcblockstate.g:2658:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )? )
            // InternalMcblockstate.g:2659:2: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1_2()); 
            }
            // InternalMcblockstate.g:2660:2: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_SLONG)||(LA25_0>=18 && LA25_0<=28)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMcblockstate.g:2660:3: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1_2()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__2__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__3"
    // InternalMcblockstate.g:2668:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__3 : rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2672:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl )
            // InternalMcblockstate.g:2673:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__3"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl"
    // InternalMcblockstate.g:2679:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl : ( ')' ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2683:1: ( ( ')' ) )
            // InternalMcblockstate.g:2684:1: ( ')' )
            {
            // InternalMcblockstate.g:2684:1: ( ')' )
            // InternalMcblockstate.g:2685:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getRightParenthesisKeyword_0_2_0_1_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getRightParenthesisKeyword_0_2_0_1_3()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1__3__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0"
    // InternalMcblockstate.g:2695:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0 : rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2699:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1 )
            // InternalMcblockstate.g:2700:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl"
    // InternalMcblockstate.g:2707:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl : ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2711:1: ( ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 ) ) )
            // InternalMcblockstate.g:2712:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 ) )
            {
            // InternalMcblockstate.g:2712:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 ) )
            // InternalMcblockstate.g:2713:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_1_2_0()); 
            }
            // InternalMcblockstate.g:2714:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 )
            // InternalMcblockstate.g:2714:3: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_1_2_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1"
    // InternalMcblockstate.g:2722:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1 : rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2726:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2 )
            // InternalMcblockstate.g:2727:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2
            {
            pushFollow(FOLLOW_10);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl"
    // InternalMcblockstate.g:2734:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl : ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )* ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2738:1: ( ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )* ) )
            // InternalMcblockstate.g:2739:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )* )
            {
            // InternalMcblockstate.g:2739:1: ( ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )* )
            // InternalMcblockstate.g:2740:2: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1_2_1()); 
            }
            // InternalMcblockstate.g:2741:2: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_ID && LA26_1<=RULE_SLONG)||(LA26_1>=18 && LA26_1<=28)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalMcblockstate.g:2741:3: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getGroup_0_2_0_1_2_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2"
    // InternalMcblockstate.g:2749:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2 : rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2753:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl )
            // InternalMcblockstate.g:2754:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl"
    // InternalMcblockstate.g:2760:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2764:1: ( ( ( ',' )? ) )
            // InternalMcblockstate.g:2765:1: ( ( ',' )? )
            {
            // InternalMcblockstate.g:2765:1: ( ( ',' )? )
            // InternalMcblockstate.g:2766:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_2()); 
            }
            // InternalMcblockstate.g:2767:2: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMcblockstate.g:2767:3: ','
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_2()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2__2__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0"
    // InternalMcblockstate.g:2776:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0 : rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2780:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1 )
            // InternalMcblockstate.g:2781:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl"
    // InternalMcblockstate.g:2788:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2792:1: ( ( ',' ) )
            // InternalMcblockstate.g:2793:1: ( ',' )
            {
            // InternalMcblockstate.g:2793:1: ( ',' )
            // InternalMcblockstate.g:2794:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1"
    // InternalMcblockstate.g:2803:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1 : rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2807:1: ( rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl )
            // InternalMcblockstate.g:2808:2: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl"
    // InternalMcblockstate.g:2814:1: rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl : ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2818:1: ( ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 ) ) )
            // InternalMcblockstate.g:2819:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 ) )
            {
            // InternalMcblockstate.g:2819:1: ( ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 ) )
            // InternalMcblockstate.g:2820:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_1_2_1_1()); 
            }
            // InternalMcblockstate.g:2821:2: ( rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 )
            // InternalMcblockstate.g:2821:3: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesAssignment_0_2_0_1_2_1_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_0_2_0_1_2_1__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__0"
    // InternalMcblockstate.g:2830:1: rule__BlockstatePropertyPredicate__Group_1__0 : rule__BlockstatePropertyPredicate__Group_1__0__Impl rule__BlockstatePropertyPredicate__Group_1__1 ;
    public final void rule__BlockstatePropertyPredicate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2834:1: ( rule__BlockstatePropertyPredicate__Group_1__0__Impl rule__BlockstatePropertyPredicate__Group_1__1 )
            // InternalMcblockstate.g:2835:2: rule__BlockstatePropertyPredicate__Group_1__0__Impl rule__BlockstatePropertyPredicate__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__BlockstatePropertyPredicate__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_1__1();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__0__Impl"
    // InternalMcblockstate.g:2842:1: rule__BlockstatePropertyPredicate__Group_1__0__Impl : ( () ) ;
    public final void rule__BlockstatePropertyPredicate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2846:1: ( ( () ) )
            // InternalMcblockstate.g:2847:1: ( () )
            {
            // InternalMcblockstate.g:2847:1: ( () )
            // InternalMcblockstate.g:2848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getBooleanBlockstatePropertyPredicateAction_1_0()); 
            }
            // InternalMcblockstate.g:2849:2: ()
            // InternalMcblockstate.g:2849:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getBooleanBlockstatePropertyPredicateAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__0__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__1"
    // InternalMcblockstate.g:2857:1: rule__BlockstatePropertyPredicate__Group_1__1 : rule__BlockstatePropertyPredicate__Group_1__1__Impl rule__BlockstatePropertyPredicate__Group_1__2 ;
    public final void rule__BlockstatePropertyPredicate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2861:1: ( rule__BlockstatePropertyPredicate__Group_1__1__Impl rule__BlockstatePropertyPredicate__Group_1__2 )
            // InternalMcblockstate.g:2862:2: rule__BlockstatePropertyPredicate__Group_1__1__Impl rule__BlockstatePropertyPredicate__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__BlockstatePropertyPredicate__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_1__2();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__1__Impl"
    // InternalMcblockstate.g:2869:1: rule__BlockstatePropertyPredicate__Group_1__1__Impl : ( ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )? ) ;
    public final void rule__BlockstatePropertyPredicate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2873:1: ( ( ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )? ) )
            // InternalMcblockstate.g:2874:1: ( ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )? )
            {
            // InternalMcblockstate.g:2874:1: ( ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )? )
            // InternalMcblockstate.g:2875:2: ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedAssignment_1_1()); 
            }
            // InternalMcblockstate.g:2876:2: ( rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMcblockstate.g:2876:3: rule__BlockstatePropertyPredicate__InvertedAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockstatePropertyPredicate__InvertedAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedAssignment_1_1()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__1__Impl"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__2"
    // InternalMcblockstate.g:2884:1: rule__BlockstatePropertyPredicate__Group_1__2 : rule__BlockstatePropertyPredicate__Group_1__2__Impl ;
    public final void rule__BlockstatePropertyPredicate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2888:1: ( rule__BlockstatePropertyPredicate__Group_1__2__Impl )
            // InternalMcblockstate.g:2889:2: rule__BlockstatePropertyPredicate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__Group_1__2__Impl();

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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__2"


    // $ANTLR start "rule__BlockstatePropertyPredicate__Group_1__2__Impl"
    // InternalMcblockstate.g:2895:1: rule__BlockstatePropertyPredicate__Group_1__2__Impl : ( ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 ) ) ;
    public final void rule__BlockstatePropertyPredicate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2899:1: ( ( ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 ) ) )
            // InternalMcblockstate.g:2900:1: ( ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 ) )
            {
            // InternalMcblockstate.g:2900:1: ( ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 ) )
            // InternalMcblockstate.g:2901:2: ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getNameAssignment_1_2()); 
            }
            // InternalMcblockstate.g:2902:2: ( rule__BlockstatePropertyPredicate__NameAssignment_1_2 )
            // InternalMcblockstate.g:2902:3: rule__BlockstatePropertyPredicate__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BlockstatePropertyPredicate__NameAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getNameAssignment_1_2()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__Group_1__2__Impl"


    // $ANTLR start "rule__ModelList__Group_0__0"
    // InternalMcblockstate.g:2911:1: rule__ModelList__Group_0__0 : rule__ModelList__Group_0__0__Impl rule__ModelList__Group_0__1 ;
    public final void rule__ModelList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2915:1: ( rule__ModelList__Group_0__0__Impl rule__ModelList__Group_0__1 )
            // InternalMcblockstate.g:2916:2: rule__ModelList__Group_0__0__Impl rule__ModelList__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ModelList__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelList__Group_0__1();

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
    // $ANTLR end "rule__ModelList__Group_0__0"


    // $ANTLR start "rule__ModelList__Group_0__0__Impl"
    // InternalMcblockstate.g:2923:1: rule__ModelList__Group_0__0__Impl : ( '{' ) ;
    public final void rule__ModelList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2927:1: ( ( '{' ) )
            // InternalMcblockstate.g:2928:1: ( '{' )
            {
            // InternalMcblockstate.g:2928:1: ( '{' )
            // InternalMcblockstate.g:2929:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getLeftCurlyBracketKeyword_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getLeftCurlyBracketKeyword_0_0()); 
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
    // $ANTLR end "rule__ModelList__Group_0__0__Impl"


    // $ANTLR start "rule__ModelList__Group_0__1"
    // InternalMcblockstate.g:2938:1: rule__ModelList__Group_0__1 : rule__ModelList__Group_0__1__Impl rule__ModelList__Group_0__2 ;
    public final void rule__ModelList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2942:1: ( rule__ModelList__Group_0__1__Impl rule__ModelList__Group_0__2 )
            // InternalMcblockstate.g:2943:2: rule__ModelList__Group_0__1__Impl rule__ModelList__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__ModelList__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelList__Group_0__2();

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
    // $ANTLR end "rule__ModelList__Group_0__1"


    // $ANTLR start "rule__ModelList__Group_0__1__Impl"
    // InternalMcblockstate.g:2950:1: rule__ModelList__Group_0__1__Impl : ( () ) ;
    public final void rule__ModelList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2954:1: ( ( () ) )
            // InternalMcblockstate.g:2955:1: ( () )
            {
            // InternalMcblockstate.g:2955:1: ( () )
            // InternalMcblockstate.g:2956:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getModelListAction_0_1()); 
            }
            // InternalMcblockstate.g:2957:2: ()
            // InternalMcblockstate.g:2957:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getModelListAction_0_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_0__1__Impl"


    // $ANTLR start "rule__ModelList__Group_0__2"
    // InternalMcblockstate.g:2965:1: rule__ModelList__Group_0__2 : rule__ModelList__Group_0__2__Impl rule__ModelList__Group_0__3 ;
    public final void rule__ModelList__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2969:1: ( rule__ModelList__Group_0__2__Impl rule__ModelList__Group_0__3 )
            // InternalMcblockstate.g:2970:2: rule__ModelList__Group_0__2__Impl rule__ModelList__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__ModelList__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelList__Group_0__3();

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
    // $ANTLR end "rule__ModelList__Group_0__2"


    // $ANTLR start "rule__ModelList__Group_0__2__Impl"
    // InternalMcblockstate.g:2977:1: rule__ModelList__Group_0__2__Impl : ( ( rule__ModelList__ModelsAssignment_0_2 )* ) ;
    public final void rule__ModelList__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2981:1: ( ( ( rule__ModelList__ModelsAssignment_0_2 )* ) )
            // InternalMcblockstate.g:2982:1: ( ( rule__ModelList__ModelsAssignment_0_2 )* )
            {
            // InternalMcblockstate.g:2982:1: ( ( rule__ModelList__ModelsAssignment_0_2 )* )
            // InternalMcblockstate.g:2983:2: ( rule__ModelList__ModelsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getModelsAssignment_0_2()); 
            }
            // InternalMcblockstate.g:2984:2: ( rule__ModelList__ModelsAssignment_0_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||(LA29_0>=18 && LA29_0<=22)||(LA29_0>=24 && LA29_0<=25)||LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMcblockstate.g:2984:3: rule__ModelList__ModelsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ModelList__ModelsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getModelsAssignment_0_2()); 
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
    // $ANTLR end "rule__ModelList__Group_0__2__Impl"


    // $ANTLR start "rule__ModelList__Group_0__3"
    // InternalMcblockstate.g:2992:1: rule__ModelList__Group_0__3 : rule__ModelList__Group_0__3__Impl ;
    public final void rule__ModelList__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:2996:1: ( rule__ModelList__Group_0__3__Impl )
            // InternalMcblockstate.g:2997:2: rule__ModelList__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__Group_0__3__Impl();

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
    // $ANTLR end "rule__ModelList__Group_0__3"


    // $ANTLR start "rule__ModelList__Group_0__3__Impl"
    // InternalMcblockstate.g:3003:1: rule__ModelList__Group_0__3__Impl : ( ( '}' ) ) ;
    public final void rule__ModelList__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3007:1: ( ( ( '}' ) ) )
            // InternalMcblockstate.g:3008:1: ( ( '}' ) )
            {
            // InternalMcblockstate.g:3008:1: ( ( '}' ) )
            // InternalMcblockstate.g:3009:2: ( '}' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getRightCurlyBracketKeyword_0_3()); 
            }
            // InternalMcblockstate.g:3010:2: ( '}' )
            // InternalMcblockstate.g:3010:3: '}'
            {
            match(input,30,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getRightCurlyBracketKeyword_0_3()); 
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
    // $ANTLR end "rule__ModelList__Group_0__3__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMcblockstate.g:3019:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3023:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMcblockstate.g:3024:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMcblockstate.g:3031:1: rule__Model__Group__0__Impl : ( ( rule__Model__LocationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3035:1: ( ( ( rule__Model__LocationAssignment_0 ) ) )
            // InternalMcblockstate.g:3036:1: ( ( rule__Model__LocationAssignment_0 ) )
            {
            // InternalMcblockstate.g:3036:1: ( ( rule__Model__LocationAssignment_0 ) )
            // InternalMcblockstate.g:3037:2: ( rule__Model__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLocationAssignment_0()); 
            }
            // InternalMcblockstate.g:3038:2: ( rule__Model__LocationAssignment_0 )
            // InternalMcblockstate.g:3038:3: rule__Model__LocationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__LocationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLocationAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMcblockstate.g:3046:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3050:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMcblockstate.g:3051:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMcblockstate.g:3058:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3062:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // InternalMcblockstate.g:3063:1: ( ( rule__Model__Group_1__0 )? )
            {
            // InternalMcblockstate.g:3063:1: ( ( rule__Model__Group_1__0 )? )
            // InternalMcblockstate.g:3064:2: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // InternalMcblockstate.g:3065:2: ( rule__Model__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMcblockstate.g:3065:3: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMcblockstate.g:3073:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3077:1: ( rule__Model__Group__2__Impl )
            // InternalMcblockstate.g:3078:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMcblockstate.g:3084:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3088:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalMcblockstate.g:3089:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalMcblockstate.g:3089:1: ( ( rule__Model__Group_2__0 )? )
            // InternalMcblockstate.g:3090:2: ( rule__Model__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_2()); 
            }
            // InternalMcblockstate.g:3091:2: ( rule__Model__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMcblockstate.g:3091:3: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalMcblockstate.g:3100:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3104:1: ( rule__Model__Group_1__0__Impl )
            // InternalMcblockstate.g:3105:2: rule__Model__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__0__Impl();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalMcblockstate.g:3111:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__Group_1_0__0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3115:1: ( ( ( rule__Model__Group_1_0__0 ) ) )
            // InternalMcblockstate.g:3116:1: ( ( rule__Model__Group_1_0__0 ) )
            {
            // InternalMcblockstate.g:3116:1: ( ( rule__Model__Group_1_0__0 ) )
            // InternalMcblockstate.g:3117:2: ( rule__Model__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_0()); 
            }
            // InternalMcblockstate.g:3118:2: ( rule__Model__Group_1_0__0 )
            // InternalMcblockstate.g:3118:3: rule__Model__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1_0__0"
    // InternalMcblockstate.g:3127:1: rule__Model__Group_1_0__0 : rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 ;
    public final void rule__Model__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3131:1: ( rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 )
            // InternalMcblockstate.g:3132:2: rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Model__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__1();

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
    // $ANTLR end "rule__Model__Group_1_0__0"


    // $ANTLR start "rule__Model__Group_1_0__0__Impl"
    // InternalMcblockstate.g:3139:1: rule__Model__Group_1_0__0__Impl : ( ( rule__Model__WeightDefinedAssignment_1_0_0 ) ) ;
    public final void rule__Model__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3143:1: ( ( ( rule__Model__WeightDefinedAssignment_1_0_0 ) ) )
            // InternalMcblockstate.g:3144:1: ( ( rule__Model__WeightDefinedAssignment_1_0_0 ) )
            {
            // InternalMcblockstate.g:3144:1: ( ( rule__Model__WeightDefinedAssignment_1_0_0 ) )
            // InternalMcblockstate.g:3145:2: ( rule__Model__WeightDefinedAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWeightDefinedAssignment_1_0_0()); 
            }
            // InternalMcblockstate.g:3146:2: ( rule__Model__WeightDefinedAssignment_1_0_0 )
            // InternalMcblockstate.g:3146:3: rule__Model__WeightDefinedAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__WeightDefinedAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWeightDefinedAssignment_1_0_0()); 
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
    // $ANTLR end "rule__Model__Group_1_0__0__Impl"


    // $ANTLR start "rule__Model__Group_1_0__1"
    // InternalMcblockstate.g:3154:1: rule__Model__Group_1_0__1 : rule__Model__Group_1_0__1__Impl ;
    public final void rule__Model__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3158:1: ( rule__Model__Group_1_0__1__Impl )
            // InternalMcblockstate.g:3159:2: rule__Model__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1_0__1"


    // $ANTLR start "rule__Model__Group_1_0__1__Impl"
    // InternalMcblockstate.g:3165:1: rule__Model__Group_1_0__1__Impl : ( ( rule__Model__WeightAssignment_1_0_1 ) ) ;
    public final void rule__Model__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3169:1: ( ( ( rule__Model__WeightAssignment_1_0_1 ) ) )
            // InternalMcblockstate.g:3170:1: ( ( rule__Model__WeightAssignment_1_0_1 ) )
            {
            // InternalMcblockstate.g:3170:1: ( ( rule__Model__WeightAssignment_1_0_1 ) )
            // InternalMcblockstate.g:3171:2: ( rule__Model__WeightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWeightAssignment_1_0_1()); 
            }
            // InternalMcblockstate.g:3172:2: ( rule__Model__WeightAssignment_1_0_1 )
            // InternalMcblockstate.g:3172:3: rule__Model__WeightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__WeightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWeightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__Model__Group_1_0__1__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalMcblockstate.g:3181:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3185:1: ( rule__Model__Group_2__0__Impl )
            // InternalMcblockstate.g:3186:2: rule__Model__Group_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__0__Impl();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalMcblockstate.g:3192:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Group_2_0__0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3196:1: ( ( ( rule__Model__Group_2_0__0 ) ) )
            // InternalMcblockstate.g:3197:1: ( ( rule__Model__Group_2_0__0 ) )
            {
            // InternalMcblockstate.g:3197:1: ( ( rule__Model__Group_2_0__0 ) )
            // InternalMcblockstate.g:3198:2: ( rule__Model__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_2_0()); 
            }
            // InternalMcblockstate.g:3199:2: ( rule__Model__Group_2_0__0 )
            // InternalMcblockstate.g:3199:3: rule__Model__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_2_0()); 
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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2_0__0"
    // InternalMcblockstate.g:3208:1: rule__Model__Group_2_0__0 : rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1 ;
    public final void rule__Model__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3212:1: ( rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1 )
            // InternalMcblockstate.g:3213:2: rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Model__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0__1();

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
    // $ANTLR end "rule__Model__Group_2_0__0"


    // $ANTLR start "rule__Model__Group_2_0__0__Impl"
    // InternalMcblockstate.g:3220:1: rule__Model__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3224:1: ( ( '(' ) )
            // InternalMcblockstate.g:3225:1: ( '(' )
            {
            // InternalMcblockstate.g:3225:1: ( '(' )
            // InternalMcblockstate.g:3226:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Model__Group_2_0__0__Impl"


    // $ANTLR start "rule__Model__Group_2_0__1"
    // InternalMcblockstate.g:3235:1: rule__Model__Group_2_0__1 : rule__Model__Group_2_0__1__Impl rule__Model__Group_2_0__2 ;
    public final void rule__Model__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3239:1: ( rule__Model__Group_2_0__1__Impl rule__Model__Group_2_0__2 )
            // InternalMcblockstate.g:3240:2: rule__Model__Group_2_0__1__Impl rule__Model__Group_2_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Model__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0__2();

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
    // $ANTLR end "rule__Model__Group_2_0__1"


    // $ANTLR start "rule__Model__Group_2_0__1__Impl"
    // InternalMcblockstate.g:3247:1: rule__Model__Group_2_0__1__Impl : ( ( rule__Model__UnorderedGroup_2_0_1 ) ) ;
    public final void rule__Model__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3251:1: ( ( ( rule__Model__UnorderedGroup_2_0_1 ) ) )
            // InternalMcblockstate.g:3252:1: ( ( rule__Model__UnorderedGroup_2_0_1 ) )
            {
            // InternalMcblockstate.g:3252:1: ( ( rule__Model__UnorderedGroup_2_0_1 ) )
            // InternalMcblockstate.g:3253:2: ( rule__Model__UnorderedGroup_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1()); 
            }
            // InternalMcblockstate.g:3254:2: ( rule__Model__UnorderedGroup_2_0_1 )
            // InternalMcblockstate.g:3254:3: rule__Model__UnorderedGroup_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__UnorderedGroup_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1()); 
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
    // $ANTLR end "rule__Model__Group_2_0__1__Impl"


    // $ANTLR start "rule__Model__Group_2_0__2"
    // InternalMcblockstate.g:3262:1: rule__Model__Group_2_0__2 : rule__Model__Group_2_0__2__Impl ;
    public final void rule__Model__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3266:1: ( rule__Model__Group_2_0__2__Impl )
            // InternalMcblockstate.g:3267:2: rule__Model__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2_0__2"


    // $ANTLR start "rule__Model__Group_2_0__2__Impl"
    // InternalMcblockstate.g:3273:1: rule__Model__Group_2_0__2__Impl : ( ')' ) ;
    public final void rule__Model__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3277:1: ( ( ')' ) )
            // InternalMcblockstate.g:3278:1: ( ')' )
            {
            // InternalMcblockstate.g:3278:1: ( ')' )
            // InternalMcblockstate.g:3279:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightParenthesisKeyword_2_0_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightParenthesisKeyword_2_0_2()); 
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
    // $ANTLR end "rule__Model__Group_2_0__2__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_0__0"
    // InternalMcblockstate.g:3289:1: rule__Model__Group_2_0_1_0__0 : rule__Model__Group_2_0_1_0__0__Impl rule__Model__Group_2_0_1_0__1 ;
    public final void rule__Model__Group_2_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3293:1: ( rule__Model__Group_2_0_1_0__0__Impl rule__Model__Group_2_0_1_0__1 )
            // InternalMcblockstate.g:3294:2: rule__Model__Group_2_0_1_0__0__Impl rule__Model__Group_2_0_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_2_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_0__1();

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
    // $ANTLR end "rule__Model__Group_2_0_1_0__0"


    // $ANTLR start "rule__Model__Group_2_0_1_0__0__Impl"
    // InternalMcblockstate.g:3301:1: rule__Model__Group_2_0_1_0__0__Impl : ( ( rule__Model__XDefinedAssignment_2_0_1_0_0 ) ) ;
    public final void rule__Model__Group_2_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3305:1: ( ( ( rule__Model__XDefinedAssignment_2_0_1_0_0 ) ) )
            // InternalMcblockstate.g:3306:1: ( ( rule__Model__XDefinedAssignment_2_0_1_0_0 ) )
            {
            // InternalMcblockstate.g:3306:1: ( ( rule__Model__XDefinedAssignment_2_0_1_0_0 ) )
            // InternalMcblockstate.g:3307:2: ( rule__Model__XDefinedAssignment_2_0_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getXDefinedAssignment_2_0_1_0_0()); 
            }
            // InternalMcblockstate.g:3308:2: ( rule__Model__XDefinedAssignment_2_0_1_0_0 )
            // InternalMcblockstate.g:3308:3: rule__Model__XDefinedAssignment_2_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__XDefinedAssignment_2_0_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getXDefinedAssignment_2_0_1_0_0()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_0__0__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_0__1"
    // InternalMcblockstate.g:3316:1: rule__Model__Group_2_0_1_0__1 : rule__Model__Group_2_0_1_0__1__Impl rule__Model__Group_2_0_1_0__2 ;
    public final void rule__Model__Group_2_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3320:1: ( rule__Model__Group_2_0_1_0__1__Impl rule__Model__Group_2_0_1_0__2 )
            // InternalMcblockstate.g:3321:2: rule__Model__Group_2_0_1_0__1__Impl rule__Model__Group_2_0_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group_2_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_0__2();

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
    // $ANTLR end "rule__Model__Group_2_0_1_0__1"


    // $ANTLR start "rule__Model__Group_2_0_1_0__1__Impl"
    // InternalMcblockstate.g:3328:1: rule__Model__Group_2_0_1_0__1__Impl : ( '=' ) ;
    public final void rule__Model__Group_2_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3332:1: ( ( '=' ) )
            // InternalMcblockstate.g:3333:1: ( '=' )
            {
            // InternalMcblockstate.g:3333:1: ( '=' )
            // InternalMcblockstate.g:3334:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_0_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_0_1()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_0__1__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_0__2"
    // InternalMcblockstate.g:3343:1: rule__Model__Group_2_0_1_0__2 : rule__Model__Group_2_0_1_0__2__Impl ;
    public final void rule__Model__Group_2_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3347:1: ( rule__Model__Group_2_0_1_0__2__Impl )
            // InternalMcblockstate.g:3348:2: rule__Model__Group_2_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_0__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2_0_1_0__2"


    // $ANTLR start "rule__Model__Group_2_0_1_0__2__Impl"
    // InternalMcblockstate.g:3354:1: rule__Model__Group_2_0_1_0__2__Impl : ( ( rule__Model__XAssignment_2_0_1_0_2 ) ) ;
    public final void rule__Model__Group_2_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3358:1: ( ( ( rule__Model__XAssignment_2_0_1_0_2 ) ) )
            // InternalMcblockstate.g:3359:1: ( ( rule__Model__XAssignment_2_0_1_0_2 ) )
            {
            // InternalMcblockstate.g:3359:1: ( ( rule__Model__XAssignment_2_0_1_0_2 ) )
            // InternalMcblockstate.g:3360:2: ( rule__Model__XAssignment_2_0_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getXAssignment_2_0_1_0_2()); 
            }
            // InternalMcblockstate.g:3361:2: ( rule__Model__XAssignment_2_0_1_0_2 )
            // InternalMcblockstate.g:3361:3: rule__Model__XAssignment_2_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__XAssignment_2_0_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getXAssignment_2_0_1_0_2()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_0__2__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_1__0"
    // InternalMcblockstate.g:3370:1: rule__Model__Group_2_0_1_1__0 : rule__Model__Group_2_0_1_1__0__Impl rule__Model__Group_2_0_1_1__1 ;
    public final void rule__Model__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3374:1: ( rule__Model__Group_2_0_1_1__0__Impl rule__Model__Group_2_0_1_1__1 )
            // InternalMcblockstate.g:3375:2: rule__Model__Group_2_0_1_1__0__Impl rule__Model__Group_2_0_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_2_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_1__1();

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
    // $ANTLR end "rule__Model__Group_2_0_1_1__0"


    // $ANTLR start "rule__Model__Group_2_0_1_1__0__Impl"
    // InternalMcblockstate.g:3382:1: rule__Model__Group_2_0_1_1__0__Impl : ( ( rule__Model__YDefinedAssignment_2_0_1_1_0 ) ) ;
    public final void rule__Model__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3386:1: ( ( ( rule__Model__YDefinedAssignment_2_0_1_1_0 ) ) )
            // InternalMcblockstate.g:3387:1: ( ( rule__Model__YDefinedAssignment_2_0_1_1_0 ) )
            {
            // InternalMcblockstate.g:3387:1: ( ( rule__Model__YDefinedAssignment_2_0_1_1_0 ) )
            // InternalMcblockstate.g:3388:2: ( rule__Model__YDefinedAssignment_2_0_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getYDefinedAssignment_2_0_1_1_0()); 
            }
            // InternalMcblockstate.g:3389:2: ( rule__Model__YDefinedAssignment_2_0_1_1_0 )
            // InternalMcblockstate.g:3389:3: rule__Model__YDefinedAssignment_2_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__YDefinedAssignment_2_0_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getYDefinedAssignment_2_0_1_1_0()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_1__0__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_1__1"
    // InternalMcblockstate.g:3397:1: rule__Model__Group_2_0_1_1__1 : rule__Model__Group_2_0_1_1__1__Impl rule__Model__Group_2_0_1_1__2 ;
    public final void rule__Model__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3401:1: ( rule__Model__Group_2_0_1_1__1__Impl rule__Model__Group_2_0_1_1__2 )
            // InternalMcblockstate.g:3402:2: rule__Model__Group_2_0_1_1__1__Impl rule__Model__Group_2_0_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group_2_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_1__2();

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
    // $ANTLR end "rule__Model__Group_2_0_1_1__1"


    // $ANTLR start "rule__Model__Group_2_0_1_1__1__Impl"
    // InternalMcblockstate.g:3409:1: rule__Model__Group_2_0_1_1__1__Impl : ( '=' ) ;
    public final void rule__Model__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3413:1: ( ( '=' ) )
            // InternalMcblockstate.g:3414:1: ( '=' )
            {
            // InternalMcblockstate.g:3414:1: ( '=' )
            // InternalMcblockstate.g:3415:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_1_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_1_1()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_1__1__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_1__2"
    // InternalMcblockstate.g:3424:1: rule__Model__Group_2_0_1_1__2 : rule__Model__Group_2_0_1_1__2__Impl ;
    public final void rule__Model__Group_2_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3428:1: ( rule__Model__Group_2_0_1_1__2__Impl )
            // InternalMcblockstate.g:3429:2: rule__Model__Group_2_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_1__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2_0_1_1__2"


    // $ANTLR start "rule__Model__Group_2_0_1_1__2__Impl"
    // InternalMcblockstate.g:3435:1: rule__Model__Group_2_0_1_1__2__Impl : ( ( rule__Model__YAssignment_2_0_1_1_2 ) ) ;
    public final void rule__Model__Group_2_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3439:1: ( ( ( rule__Model__YAssignment_2_0_1_1_2 ) ) )
            // InternalMcblockstate.g:3440:1: ( ( rule__Model__YAssignment_2_0_1_1_2 ) )
            {
            // InternalMcblockstate.g:3440:1: ( ( rule__Model__YAssignment_2_0_1_1_2 ) )
            // InternalMcblockstate.g:3441:2: ( rule__Model__YAssignment_2_0_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getYAssignment_2_0_1_1_2()); 
            }
            // InternalMcblockstate.g:3442:2: ( rule__Model__YAssignment_2_0_1_1_2 )
            // InternalMcblockstate.g:3442:3: rule__Model__YAssignment_2_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__YAssignment_2_0_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getYAssignment_2_0_1_1_2()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_1__2__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_2__0"
    // InternalMcblockstate.g:3451:1: rule__Model__Group_2_0_1_2__0 : rule__Model__Group_2_0_1_2__0__Impl rule__Model__Group_2_0_1_2__1 ;
    public final void rule__Model__Group_2_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3455:1: ( rule__Model__Group_2_0_1_2__0__Impl rule__Model__Group_2_0_1_2__1 )
            // InternalMcblockstate.g:3456:2: rule__Model__Group_2_0_1_2__0__Impl rule__Model__Group_2_0_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_2_0_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_2__1();

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
    // $ANTLR end "rule__Model__Group_2_0_1_2__0"


    // $ANTLR start "rule__Model__Group_2_0_1_2__0__Impl"
    // InternalMcblockstate.g:3463:1: rule__Model__Group_2_0_1_2__0__Impl : ( ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 ) ) ;
    public final void rule__Model__Group_2_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3467:1: ( ( ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 ) ) )
            // InternalMcblockstate.g:3468:1: ( ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 ) )
            {
            // InternalMcblockstate.g:3468:1: ( ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 ) )
            // InternalMcblockstate.g:3469:2: ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUvlockDefinedAssignment_2_0_1_2_0()); 
            }
            // InternalMcblockstate.g:3470:2: ( rule__Model__UvlockDefinedAssignment_2_0_1_2_0 )
            // InternalMcblockstate.g:3470:3: rule__Model__UvlockDefinedAssignment_2_0_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__UvlockDefinedAssignment_2_0_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUvlockDefinedAssignment_2_0_1_2_0()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_2__1"
    // InternalMcblockstate.g:3478:1: rule__Model__Group_2_0_1_2__1 : rule__Model__Group_2_0_1_2__1__Impl rule__Model__Group_2_0_1_2__2 ;
    public final void rule__Model__Group_2_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3482:1: ( rule__Model__Group_2_0_1_2__1__Impl rule__Model__Group_2_0_1_2__2 )
            // InternalMcblockstate.g:3483:2: rule__Model__Group_2_0_1_2__1__Impl rule__Model__Group_2_0_1_2__2
            {
            pushFollow(FOLLOW_28);
            rule__Model__Group_2_0_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_2__2();

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
    // $ANTLR end "rule__Model__Group_2_0_1_2__1"


    // $ANTLR start "rule__Model__Group_2_0_1_2__1__Impl"
    // InternalMcblockstate.g:3490:1: rule__Model__Group_2_0_1_2__1__Impl : ( '=' ) ;
    public final void rule__Model__Group_2_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3494:1: ( ( '=' ) )
            // InternalMcblockstate.g:3495:1: ( '=' )
            {
            // InternalMcblockstate.g:3495:1: ( '=' )
            // InternalMcblockstate.g:3496:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_2_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_2_1()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_2__1__Impl"


    // $ANTLR start "rule__Model__Group_2_0_1_2__2"
    // InternalMcblockstate.g:3505:1: rule__Model__Group_2_0_1_2__2 : rule__Model__Group_2_0_1_2__2__Impl ;
    public final void rule__Model__Group_2_0_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3509:1: ( rule__Model__Group_2_0_1_2__2__Impl )
            // InternalMcblockstate.g:3510:2: rule__Model__Group_2_0_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_0_1_2__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2_0_1_2__2"


    // $ANTLR start "rule__Model__Group_2_0_1_2__2__Impl"
    // InternalMcblockstate.g:3516:1: rule__Model__Group_2_0_1_2__2__Impl : ( ( rule__Model__Alternatives_2_0_1_2_2 ) ) ;
    public final void rule__Model__Group_2_0_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3520:1: ( ( ( rule__Model__Alternatives_2_0_1_2_2 ) ) )
            // InternalMcblockstate.g:3521:1: ( ( rule__Model__Alternatives_2_0_1_2_2 ) )
            {
            // InternalMcblockstate.g:3521:1: ( ( rule__Model__Alternatives_2_0_1_2_2 ) )
            // InternalMcblockstate.g:3522:2: ( rule__Model__Alternatives_2_0_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_2_0_1_2_2()); 
            }
            // InternalMcblockstate.g:3523:2: ( rule__Model__Alternatives_2_0_1_2_2 )
            // InternalMcblockstate.g:3523:3: rule__Model__Alternatives_2_0_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_2_0_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives_2_0_1_2_2()); 
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
    // $ANTLR end "rule__Model__Group_2_0_1_2__2__Impl"


    // $ANTLR start "rule__MCJsonObject__Group__0"
    // InternalMcblockstate.g:3532:1: rule__MCJsonObject__Group__0 : rule__MCJsonObject__Group__0__Impl rule__MCJsonObject__Group__1 ;
    public final void rule__MCJsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3536:1: ( rule__MCJsonObject__Group__0__Impl rule__MCJsonObject__Group__1 )
            // InternalMcblockstate.g:3537:2: rule__MCJsonObject__Group__0__Impl rule__MCJsonObject__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MCJsonObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group__1();

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
    // $ANTLR end "rule__MCJsonObject__Group__0"


    // $ANTLR start "rule__MCJsonObject__Group__0__Impl"
    // InternalMcblockstate.g:3544:1: rule__MCJsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__MCJsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3548:1: ( ( '{' ) )
            // InternalMcblockstate.g:3549:1: ( '{' )
            {
            // InternalMcblockstate.g:3549:1: ( '{' )
            // InternalMcblockstate.g:3550:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__MCJsonObject__Group__0__Impl"


    // $ANTLR start "rule__MCJsonObject__Group__1"
    // InternalMcblockstate.g:3559:1: rule__MCJsonObject__Group__1 : rule__MCJsonObject__Group__1__Impl rule__MCJsonObject__Group__2 ;
    public final void rule__MCJsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3563:1: ( rule__MCJsonObject__Group__1__Impl rule__MCJsonObject__Group__2 )
            // InternalMcblockstate.g:3564:2: rule__MCJsonObject__Group__1__Impl rule__MCJsonObject__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__MCJsonObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group__2();

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
    // $ANTLR end "rule__MCJsonObject__Group__1"


    // $ANTLR start "rule__MCJsonObject__Group__1__Impl"
    // InternalMcblockstate.g:3571:1: rule__MCJsonObject__Group__1__Impl : ( () ) ;
    public final void rule__MCJsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3575:1: ( ( () ) )
            // InternalMcblockstate.g:3576:1: ( () )
            {
            // InternalMcblockstate.g:3576:1: ( () )
            // InternalMcblockstate.g:3577:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getMCJsonObjectAction_1()); 
            }
            // InternalMcblockstate.g:3578:2: ()
            // InternalMcblockstate.g:3578:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getMCJsonObjectAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCJsonObject__Group__1__Impl"


    // $ANTLR start "rule__MCJsonObject__Group__2"
    // InternalMcblockstate.g:3586:1: rule__MCJsonObject__Group__2 : rule__MCJsonObject__Group__2__Impl rule__MCJsonObject__Group__3 ;
    public final void rule__MCJsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3590:1: ( rule__MCJsonObject__Group__2__Impl rule__MCJsonObject__Group__3 )
            // InternalMcblockstate.g:3591:2: rule__MCJsonObject__Group__2__Impl rule__MCJsonObject__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__MCJsonObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group__3();

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
    // $ANTLR end "rule__MCJsonObject__Group__2"


    // $ANTLR start "rule__MCJsonObject__Group__2__Impl"
    // InternalMcblockstate.g:3598:1: rule__MCJsonObject__Group__2__Impl : ( ( rule__MCJsonObject__Group_2__0 )? ) ;
    public final void rule__MCJsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3602:1: ( ( ( rule__MCJsonObject__Group_2__0 )? ) )
            // InternalMcblockstate.g:3603:1: ( ( rule__MCJsonObject__Group_2__0 )? )
            {
            // InternalMcblockstate.g:3603:1: ( ( rule__MCJsonObject__Group_2__0 )? )
            // InternalMcblockstate.g:3604:2: ( rule__MCJsonObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getGroup_2()); 
            }
            // InternalMcblockstate.g:3605:2: ( rule__MCJsonObject__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMcblockstate.g:3605:3: rule__MCJsonObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MCJsonObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getGroup_2()); 
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
    // $ANTLR end "rule__MCJsonObject__Group__2__Impl"


    // $ANTLR start "rule__MCJsonObject__Group__3"
    // InternalMcblockstate.g:3613:1: rule__MCJsonObject__Group__3 : rule__MCJsonObject__Group__3__Impl ;
    public final void rule__MCJsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3617:1: ( rule__MCJsonObject__Group__3__Impl )
            // InternalMcblockstate.g:3618:2: rule__MCJsonObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group__3__Impl();

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
    // $ANTLR end "rule__MCJsonObject__Group__3"


    // $ANTLR start "rule__MCJsonObject__Group__3__Impl"
    // InternalMcblockstate.g:3624:1: rule__MCJsonObject__Group__3__Impl : ( '}' ) ;
    public final void rule__MCJsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3628:1: ( ( '}' ) )
            // InternalMcblockstate.g:3629:1: ( '}' )
            {
            // InternalMcblockstate.g:3629:1: ( '}' )
            // InternalMcblockstate.g:3630:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__MCJsonObject__Group__3__Impl"


    // $ANTLR start "rule__MCJsonObject__Group_2__0"
    // InternalMcblockstate.g:3640:1: rule__MCJsonObject__Group_2__0 : rule__MCJsonObject__Group_2__0__Impl rule__MCJsonObject__Group_2__1 ;
    public final void rule__MCJsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3644:1: ( rule__MCJsonObject__Group_2__0__Impl rule__MCJsonObject__Group_2__1 )
            // InternalMcblockstate.g:3645:2: rule__MCJsonObject__Group_2__0__Impl rule__MCJsonObject__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MCJsonObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group_2__1();

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
    // $ANTLR end "rule__MCJsonObject__Group_2__0"


    // $ANTLR start "rule__MCJsonObject__Group_2__0__Impl"
    // InternalMcblockstate.g:3652:1: rule__MCJsonObject__Group_2__0__Impl : ( ( rule__MCJsonObject__EntriesAssignment_2_0 ) ) ;
    public final void rule__MCJsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3656:1: ( ( ( rule__MCJsonObject__EntriesAssignment_2_0 ) ) )
            // InternalMcblockstate.g:3657:1: ( ( rule__MCJsonObject__EntriesAssignment_2_0 ) )
            {
            // InternalMcblockstate.g:3657:1: ( ( rule__MCJsonObject__EntriesAssignment_2_0 ) )
            // InternalMcblockstate.g:3658:2: ( rule__MCJsonObject__EntriesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getEntriesAssignment_2_0()); 
            }
            // InternalMcblockstate.g:3659:2: ( rule__MCJsonObject__EntriesAssignment_2_0 )
            // InternalMcblockstate.g:3659:3: rule__MCJsonObject__EntriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__EntriesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getEntriesAssignment_2_0()); 
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
    // $ANTLR end "rule__MCJsonObject__Group_2__0__Impl"


    // $ANTLR start "rule__MCJsonObject__Group_2__1"
    // InternalMcblockstate.g:3667:1: rule__MCJsonObject__Group_2__1 : rule__MCJsonObject__Group_2__1__Impl rule__MCJsonObject__Group_2__2 ;
    public final void rule__MCJsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3671:1: ( rule__MCJsonObject__Group_2__1__Impl rule__MCJsonObject__Group_2__2 )
            // InternalMcblockstate.g:3672:2: rule__MCJsonObject__Group_2__1__Impl rule__MCJsonObject__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__MCJsonObject__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group_2__2();

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
    // $ANTLR end "rule__MCJsonObject__Group_2__1"


    // $ANTLR start "rule__MCJsonObject__Group_2__1__Impl"
    // InternalMcblockstate.g:3679:1: rule__MCJsonObject__Group_2__1__Impl : ( ( rule__MCJsonObject__Group_2_1__0 )* ) ;
    public final void rule__MCJsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3683:1: ( ( ( rule__MCJsonObject__Group_2_1__0 )* ) )
            // InternalMcblockstate.g:3684:1: ( ( rule__MCJsonObject__Group_2_1__0 )* )
            {
            // InternalMcblockstate.g:3684:1: ( ( rule__MCJsonObject__Group_2_1__0 )* )
            // InternalMcblockstate.g:3685:2: ( rule__MCJsonObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getGroup_2_1()); 
            }
            // InternalMcblockstate.g:3686:2: ( rule__MCJsonObject__Group_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_STRING) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMcblockstate.g:3686:3: rule__MCJsonObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MCJsonObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__MCJsonObject__Group_2__1__Impl"


    // $ANTLR start "rule__MCJsonObject__Group_2__2"
    // InternalMcblockstate.g:3694:1: rule__MCJsonObject__Group_2__2 : rule__MCJsonObject__Group_2__2__Impl ;
    public final void rule__MCJsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3698:1: ( rule__MCJsonObject__Group_2__2__Impl )
            // InternalMcblockstate.g:3699:2: rule__MCJsonObject__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group_2__2__Impl();

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
    // $ANTLR end "rule__MCJsonObject__Group_2__2"


    // $ANTLR start "rule__MCJsonObject__Group_2__2__Impl"
    // InternalMcblockstate.g:3705:1: rule__MCJsonObject__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__MCJsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3709:1: ( ( ( ',' )? ) )
            // InternalMcblockstate.g:3710:1: ( ( ',' )? )
            {
            // InternalMcblockstate.g:3710:1: ( ( ',' )? )
            // InternalMcblockstate.g:3711:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_2()); 
            }
            // InternalMcblockstate.g:3712:2: ( ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMcblockstate.g:3712:3: ','
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_2()); 
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
    // $ANTLR end "rule__MCJsonObject__Group_2__2__Impl"


    // $ANTLR start "rule__MCJsonObject__Group_2_1__0"
    // InternalMcblockstate.g:3721:1: rule__MCJsonObject__Group_2_1__0 : rule__MCJsonObject__Group_2_1__0__Impl rule__MCJsonObject__Group_2_1__1 ;
    public final void rule__MCJsonObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3725:1: ( rule__MCJsonObject__Group_2_1__0__Impl rule__MCJsonObject__Group_2_1__1 )
            // InternalMcblockstate.g:3726:2: rule__MCJsonObject__Group_2_1__0__Impl rule__MCJsonObject__Group_2_1__1
            {
            pushFollow(FOLLOW_30);
            rule__MCJsonObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group_2_1__1();

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
    // $ANTLR end "rule__MCJsonObject__Group_2_1__0"


    // $ANTLR start "rule__MCJsonObject__Group_2_1__0__Impl"
    // InternalMcblockstate.g:3733:1: rule__MCJsonObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MCJsonObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3737:1: ( ( ',' ) )
            // InternalMcblockstate.g:3738:1: ( ',' )
            {
            // InternalMcblockstate.g:3738:1: ( ',' )
            // InternalMcblockstate.g:3739:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__MCJsonObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__MCJsonObject__Group_2_1__1"
    // InternalMcblockstate.g:3748:1: rule__MCJsonObject__Group_2_1__1 : rule__MCJsonObject__Group_2_1__1__Impl ;
    public final void rule__MCJsonObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3752:1: ( rule__MCJsonObject__Group_2_1__1__Impl )
            // InternalMcblockstate.g:3753:2: rule__MCJsonObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MCJsonObject__Group_2_1__1"


    // $ANTLR start "rule__MCJsonObject__Group_2_1__1__Impl"
    // InternalMcblockstate.g:3759:1: rule__MCJsonObject__Group_2_1__1__Impl : ( ( rule__MCJsonObject__EntriesAssignment_2_1_1 ) ) ;
    public final void rule__MCJsonObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3763:1: ( ( ( rule__MCJsonObject__EntriesAssignment_2_1_1 ) ) )
            // InternalMcblockstate.g:3764:1: ( ( rule__MCJsonObject__EntriesAssignment_2_1_1 ) )
            {
            // InternalMcblockstate.g:3764:1: ( ( rule__MCJsonObject__EntriesAssignment_2_1_1 ) )
            // InternalMcblockstate.g:3765:2: ( rule__MCJsonObject__EntriesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getEntriesAssignment_2_1_1()); 
            }
            // InternalMcblockstate.g:3766:2: ( rule__MCJsonObject__EntriesAssignment_2_1_1 )
            // InternalMcblockstate.g:3766:3: rule__MCJsonObject__EntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonObject__EntriesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getEntriesAssignment_2_1_1()); 
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
    // $ANTLR end "rule__MCJsonObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__MCJsonEntry__Group__0"
    // InternalMcblockstate.g:3775:1: rule__MCJsonEntry__Group__0 : rule__MCJsonEntry__Group__0__Impl rule__MCJsonEntry__Group__1 ;
    public final void rule__MCJsonEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3779:1: ( rule__MCJsonEntry__Group__0__Impl rule__MCJsonEntry__Group__1 )
            // InternalMcblockstate.g:3780:2: rule__MCJsonEntry__Group__0__Impl rule__MCJsonEntry__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MCJsonEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__Group__1();

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
    // $ANTLR end "rule__MCJsonEntry__Group__0"


    // $ANTLR start "rule__MCJsonEntry__Group__0__Impl"
    // InternalMcblockstate.g:3787:1: rule__MCJsonEntry__Group__0__Impl : ( ( rule__MCJsonEntry__NameAssignment_0 ) ) ;
    public final void rule__MCJsonEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3791:1: ( ( ( rule__MCJsonEntry__NameAssignment_0 ) ) )
            // InternalMcblockstate.g:3792:1: ( ( rule__MCJsonEntry__NameAssignment_0 ) )
            {
            // InternalMcblockstate.g:3792:1: ( ( rule__MCJsonEntry__NameAssignment_0 ) )
            // InternalMcblockstate.g:3793:2: ( rule__MCJsonEntry__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getNameAssignment_0()); 
            }
            // InternalMcblockstate.g:3794:2: ( rule__MCJsonEntry__NameAssignment_0 )
            // InternalMcblockstate.g:3794:3: rule__MCJsonEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__MCJsonEntry__Group__0__Impl"


    // $ANTLR start "rule__MCJsonEntry__Group__1"
    // InternalMcblockstate.g:3802:1: rule__MCJsonEntry__Group__1 : rule__MCJsonEntry__Group__1__Impl rule__MCJsonEntry__Group__2 ;
    public final void rule__MCJsonEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3806:1: ( rule__MCJsonEntry__Group__1__Impl rule__MCJsonEntry__Group__2 )
            // InternalMcblockstate.g:3807:2: rule__MCJsonEntry__Group__1__Impl rule__MCJsonEntry__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__MCJsonEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__Group__2();

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
    // $ANTLR end "rule__MCJsonEntry__Group__1"


    // $ANTLR start "rule__MCJsonEntry__Group__1__Impl"
    // InternalMcblockstate.g:3814:1: rule__MCJsonEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__MCJsonEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3818:1: ( ( ':' ) )
            // InternalMcblockstate.g:3819:1: ( ':' )
            {
            // InternalMcblockstate.g:3819:1: ( ':' )
            // InternalMcblockstate.g:3820:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getColonKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__MCJsonEntry__Group__1__Impl"


    // $ANTLR start "rule__MCJsonEntry__Group__2"
    // InternalMcblockstate.g:3829:1: rule__MCJsonEntry__Group__2 : rule__MCJsonEntry__Group__2__Impl ;
    public final void rule__MCJsonEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3833:1: ( rule__MCJsonEntry__Group__2__Impl )
            // InternalMcblockstate.g:3834:2: rule__MCJsonEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__Group__2__Impl();

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
    // $ANTLR end "rule__MCJsonEntry__Group__2"


    // $ANTLR start "rule__MCJsonEntry__Group__2__Impl"
    // InternalMcblockstate.g:3840:1: rule__MCJsonEntry__Group__2__Impl : ( ( rule__MCJsonEntry__ValueAssignment_2 ) ) ;
    public final void rule__MCJsonEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3844:1: ( ( ( rule__MCJsonEntry__ValueAssignment_2 ) ) )
            // InternalMcblockstate.g:3845:1: ( ( rule__MCJsonEntry__ValueAssignment_2 ) )
            {
            // InternalMcblockstate.g:3845:1: ( ( rule__MCJsonEntry__ValueAssignment_2 ) )
            // InternalMcblockstate.g:3846:2: ( rule__MCJsonEntry__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getValueAssignment_2()); 
            }
            // InternalMcblockstate.g:3847:2: ( rule__MCJsonEntry__ValueAssignment_2 )
            // InternalMcblockstate.g:3847:3: rule__MCJsonEntry__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonEntry__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__MCJsonEntry__Group__2__Impl"


    // $ANTLR start "rule__MCJsonArray__Group__0"
    // InternalMcblockstate.g:3856:1: rule__MCJsonArray__Group__0 : rule__MCJsonArray__Group__0__Impl rule__MCJsonArray__Group__1 ;
    public final void rule__MCJsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3860:1: ( rule__MCJsonArray__Group__0__Impl rule__MCJsonArray__Group__1 )
            // InternalMcblockstate.g:3861:2: rule__MCJsonArray__Group__0__Impl rule__MCJsonArray__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MCJsonArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group__1();

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
    // $ANTLR end "rule__MCJsonArray__Group__0"


    // $ANTLR start "rule__MCJsonArray__Group__0__Impl"
    // InternalMcblockstate.g:3868:1: rule__MCJsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__MCJsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3872:1: ( ( '[' ) )
            // InternalMcblockstate.g:3873:1: ( '[' )
            {
            // InternalMcblockstate.g:3873:1: ( '[' )
            // InternalMcblockstate.g:3874:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__MCJsonArray__Group__0__Impl"


    // $ANTLR start "rule__MCJsonArray__Group__1"
    // InternalMcblockstate.g:3883:1: rule__MCJsonArray__Group__1 : rule__MCJsonArray__Group__1__Impl rule__MCJsonArray__Group__2 ;
    public final void rule__MCJsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3887:1: ( rule__MCJsonArray__Group__1__Impl rule__MCJsonArray__Group__2 )
            // InternalMcblockstate.g:3888:2: rule__MCJsonArray__Group__1__Impl rule__MCJsonArray__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__MCJsonArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group__2();

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
    // $ANTLR end "rule__MCJsonArray__Group__1"


    // $ANTLR start "rule__MCJsonArray__Group__1__Impl"
    // InternalMcblockstate.g:3895:1: rule__MCJsonArray__Group__1__Impl : ( () ) ;
    public final void rule__MCJsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3899:1: ( ( () ) )
            // InternalMcblockstate.g:3900:1: ( () )
            {
            // InternalMcblockstate.g:3900:1: ( () )
            // InternalMcblockstate.g:3901:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getMCJsonArrayAction_1()); 
            }
            // InternalMcblockstate.g:3902:2: ()
            // InternalMcblockstate.g:3902:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getMCJsonArrayAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCJsonArray__Group__1__Impl"


    // $ANTLR start "rule__MCJsonArray__Group__2"
    // InternalMcblockstate.g:3910:1: rule__MCJsonArray__Group__2 : rule__MCJsonArray__Group__2__Impl rule__MCJsonArray__Group__3 ;
    public final void rule__MCJsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3914:1: ( rule__MCJsonArray__Group__2__Impl rule__MCJsonArray__Group__3 )
            // InternalMcblockstate.g:3915:2: rule__MCJsonArray__Group__2__Impl rule__MCJsonArray__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__MCJsonArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group__3();

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
    // $ANTLR end "rule__MCJsonArray__Group__2"


    // $ANTLR start "rule__MCJsonArray__Group__2__Impl"
    // InternalMcblockstate.g:3922:1: rule__MCJsonArray__Group__2__Impl : ( ( rule__MCJsonArray__Group_2__0 )? ) ;
    public final void rule__MCJsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3926:1: ( ( ( rule__MCJsonArray__Group_2__0 )? ) )
            // InternalMcblockstate.g:3927:1: ( ( rule__MCJsonArray__Group_2__0 )? )
            {
            // InternalMcblockstate.g:3927:1: ( ( rule__MCJsonArray__Group_2__0 )? )
            // InternalMcblockstate.g:3928:2: ( rule__MCJsonArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getGroup_2()); 
            }
            // InternalMcblockstate.g:3929:2: ( rule__MCJsonArray__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_SLONG)||(LA35_0>=18 && LA35_0<=20)||LA35_0==29||LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMcblockstate.g:3929:3: rule__MCJsonArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MCJsonArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getGroup_2()); 
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
    // $ANTLR end "rule__MCJsonArray__Group__2__Impl"


    // $ANTLR start "rule__MCJsonArray__Group__3"
    // InternalMcblockstate.g:3937:1: rule__MCJsonArray__Group__3 : rule__MCJsonArray__Group__3__Impl ;
    public final void rule__MCJsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3941:1: ( rule__MCJsonArray__Group__3__Impl )
            // InternalMcblockstate.g:3942:2: rule__MCJsonArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group__3__Impl();

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
    // $ANTLR end "rule__MCJsonArray__Group__3"


    // $ANTLR start "rule__MCJsonArray__Group__3__Impl"
    // InternalMcblockstate.g:3948:1: rule__MCJsonArray__Group__3__Impl : ( ']' ) ;
    public final void rule__MCJsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3952:1: ( ( ']' ) )
            // InternalMcblockstate.g:3953:1: ( ']' )
            {
            // InternalMcblockstate.g:3953:1: ( ']' )
            // InternalMcblockstate.g:3954:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__MCJsonArray__Group__3__Impl"


    // $ANTLR start "rule__MCJsonArray__Group_2__0"
    // InternalMcblockstate.g:3964:1: rule__MCJsonArray__Group_2__0 : rule__MCJsonArray__Group_2__0__Impl rule__MCJsonArray__Group_2__1 ;
    public final void rule__MCJsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3968:1: ( rule__MCJsonArray__Group_2__0__Impl rule__MCJsonArray__Group_2__1 )
            // InternalMcblockstate.g:3969:2: rule__MCJsonArray__Group_2__0__Impl rule__MCJsonArray__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MCJsonArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group_2__1();

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
    // $ANTLR end "rule__MCJsonArray__Group_2__0"


    // $ANTLR start "rule__MCJsonArray__Group_2__0__Impl"
    // InternalMcblockstate.g:3976:1: rule__MCJsonArray__Group_2__0__Impl : ( ( rule__MCJsonArray__ElementsAssignment_2_0 ) ) ;
    public final void rule__MCJsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3980:1: ( ( ( rule__MCJsonArray__ElementsAssignment_2_0 ) ) )
            // InternalMcblockstate.g:3981:1: ( ( rule__MCJsonArray__ElementsAssignment_2_0 ) )
            {
            // InternalMcblockstate.g:3981:1: ( ( rule__MCJsonArray__ElementsAssignment_2_0 ) )
            // InternalMcblockstate.g:3982:2: ( rule__MCJsonArray__ElementsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getElementsAssignment_2_0()); 
            }
            // InternalMcblockstate.g:3983:2: ( rule__MCJsonArray__ElementsAssignment_2_0 )
            // InternalMcblockstate.g:3983:3: rule__MCJsonArray__ElementsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__ElementsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getElementsAssignment_2_0()); 
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
    // $ANTLR end "rule__MCJsonArray__Group_2__0__Impl"


    // $ANTLR start "rule__MCJsonArray__Group_2__1"
    // InternalMcblockstate.g:3991:1: rule__MCJsonArray__Group_2__1 : rule__MCJsonArray__Group_2__1__Impl rule__MCJsonArray__Group_2__2 ;
    public final void rule__MCJsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:3995:1: ( rule__MCJsonArray__Group_2__1__Impl rule__MCJsonArray__Group_2__2 )
            // InternalMcblockstate.g:3996:2: rule__MCJsonArray__Group_2__1__Impl rule__MCJsonArray__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__MCJsonArray__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group_2__2();

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
    // $ANTLR end "rule__MCJsonArray__Group_2__1"


    // $ANTLR start "rule__MCJsonArray__Group_2__1__Impl"
    // InternalMcblockstate.g:4003:1: rule__MCJsonArray__Group_2__1__Impl : ( ( rule__MCJsonArray__Group_2_1__0 )* ) ;
    public final void rule__MCJsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4007:1: ( ( ( rule__MCJsonArray__Group_2_1__0 )* ) )
            // InternalMcblockstate.g:4008:1: ( ( rule__MCJsonArray__Group_2_1__0 )* )
            {
            // InternalMcblockstate.g:4008:1: ( ( rule__MCJsonArray__Group_2_1__0 )* )
            // InternalMcblockstate.g:4009:2: ( rule__MCJsonArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getGroup_2_1()); 
            }
            // InternalMcblockstate.g:4010:2: ( rule__MCJsonArray__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    int LA36_1 = input.LA(2);

                    if ( ((LA36_1>=RULE_STRING && LA36_1<=RULE_SLONG)||(LA36_1>=18 && LA36_1<=20)||LA36_1==29||LA36_1==31) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalMcblockstate.g:4010:3: rule__MCJsonArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MCJsonArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__MCJsonArray__Group_2__1__Impl"


    // $ANTLR start "rule__MCJsonArray__Group_2__2"
    // InternalMcblockstate.g:4018:1: rule__MCJsonArray__Group_2__2 : rule__MCJsonArray__Group_2__2__Impl ;
    public final void rule__MCJsonArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4022:1: ( rule__MCJsonArray__Group_2__2__Impl )
            // InternalMcblockstate.g:4023:2: rule__MCJsonArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group_2__2__Impl();

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
    // $ANTLR end "rule__MCJsonArray__Group_2__2"


    // $ANTLR start "rule__MCJsonArray__Group_2__2__Impl"
    // InternalMcblockstate.g:4029:1: rule__MCJsonArray__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__MCJsonArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4033:1: ( ( ( ',' )? ) )
            // InternalMcblockstate.g:4034:1: ( ( ',' )? )
            {
            // InternalMcblockstate.g:4034:1: ( ( ',' )? )
            // InternalMcblockstate.g:4035:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_2()); 
            }
            // InternalMcblockstate.g:4036:2: ( ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMcblockstate.g:4036:3: ','
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_2()); 
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
    // $ANTLR end "rule__MCJsonArray__Group_2__2__Impl"


    // $ANTLR start "rule__MCJsonArray__Group_2_1__0"
    // InternalMcblockstate.g:4045:1: rule__MCJsonArray__Group_2_1__0 : rule__MCJsonArray__Group_2_1__0__Impl rule__MCJsonArray__Group_2_1__1 ;
    public final void rule__MCJsonArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4049:1: ( rule__MCJsonArray__Group_2_1__0__Impl rule__MCJsonArray__Group_2_1__1 )
            // InternalMcblockstate.g:4050:2: rule__MCJsonArray__Group_2_1__0__Impl rule__MCJsonArray__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
            rule__MCJsonArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group_2_1__1();

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
    // $ANTLR end "rule__MCJsonArray__Group_2_1__0"


    // $ANTLR start "rule__MCJsonArray__Group_2_1__0__Impl"
    // InternalMcblockstate.g:4057:1: rule__MCJsonArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MCJsonArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4061:1: ( ( ',' ) )
            // InternalMcblockstate.g:4062:1: ( ',' )
            {
            // InternalMcblockstate.g:4062:1: ( ',' )
            // InternalMcblockstate.g:4063:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__MCJsonArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__MCJsonArray__Group_2_1__1"
    // InternalMcblockstate.g:4072:1: rule__MCJsonArray__Group_2_1__1 : rule__MCJsonArray__Group_2_1__1__Impl ;
    public final void rule__MCJsonArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4076:1: ( rule__MCJsonArray__Group_2_1__1__Impl )
            // InternalMcblockstate.g:4077:2: rule__MCJsonArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MCJsonArray__Group_2_1__1"


    // $ANTLR start "rule__MCJsonArray__Group_2_1__1__Impl"
    // InternalMcblockstate.g:4083:1: rule__MCJsonArray__Group_2_1__1__Impl : ( ( rule__MCJsonArray__ElementsAssignment_2_1_1 ) ) ;
    public final void rule__MCJsonArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4087:1: ( ( ( rule__MCJsonArray__ElementsAssignment_2_1_1 ) ) )
            // InternalMcblockstate.g:4088:1: ( ( rule__MCJsonArray__ElementsAssignment_2_1_1 ) )
            {
            // InternalMcblockstate.g:4088:1: ( ( rule__MCJsonArray__ElementsAssignment_2_1_1 ) )
            // InternalMcblockstate.g:4089:2: ( rule__MCJsonArray__ElementsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getElementsAssignment_2_1_1()); 
            }
            // InternalMcblockstate.g:4090:2: ( rule__MCJsonArray__ElementsAssignment_2_1_1 )
            // InternalMcblockstate.g:4090:3: rule__MCJsonArray__ElementsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonArray__ElementsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getElementsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__MCJsonArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__MCJsonBoolean__Group_1__0"
    // InternalMcblockstate.g:4099:1: rule__MCJsonBoolean__Group_1__0 : rule__MCJsonBoolean__Group_1__0__Impl rule__MCJsonBoolean__Group_1__1 ;
    public final void rule__MCJsonBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4103:1: ( rule__MCJsonBoolean__Group_1__0__Impl rule__MCJsonBoolean__Group_1__1 )
            // InternalMcblockstate.g:4104:2: rule__MCJsonBoolean__Group_1__0__Impl rule__MCJsonBoolean__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__MCJsonBoolean__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonBoolean__Group_1__1();

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
    // $ANTLR end "rule__MCJsonBoolean__Group_1__0"


    // $ANTLR start "rule__MCJsonBoolean__Group_1__0__Impl"
    // InternalMcblockstate.g:4111:1: rule__MCJsonBoolean__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__MCJsonBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4115:1: ( ( 'false' ) )
            // InternalMcblockstate.g:4116:1: ( 'false' )
            {
            // InternalMcblockstate.g:4116:1: ( 'false' )
            // InternalMcblockstate.g:4117:2: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanAccess().getFalseKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanAccess().getFalseKeyword_1_0()); 
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
    // $ANTLR end "rule__MCJsonBoolean__Group_1__0__Impl"


    // $ANTLR start "rule__MCJsonBoolean__Group_1__1"
    // InternalMcblockstate.g:4126:1: rule__MCJsonBoolean__Group_1__1 : rule__MCJsonBoolean__Group_1__1__Impl ;
    public final void rule__MCJsonBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4130:1: ( rule__MCJsonBoolean__Group_1__1__Impl )
            // InternalMcblockstate.g:4131:2: rule__MCJsonBoolean__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonBoolean__Group_1__1__Impl();

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
    // $ANTLR end "rule__MCJsonBoolean__Group_1__1"


    // $ANTLR start "rule__MCJsonBoolean__Group_1__1__Impl"
    // InternalMcblockstate.g:4137:1: rule__MCJsonBoolean__Group_1__1__Impl : ( () ) ;
    public final void rule__MCJsonBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4141:1: ( ( () ) )
            // InternalMcblockstate.g:4142:1: ( () )
            {
            // InternalMcblockstate.g:4142:1: ( () )
            // InternalMcblockstate.g:4143:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanAccess().getMCJsonBooleanAction_1_1()); 
            }
            // InternalMcblockstate.g:4144:2: ()
            // InternalMcblockstate.g:4144:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanAccess().getMCJsonBooleanAction_1_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCJsonBoolean__Group_1__1__Impl"


    // $ANTLR start "rule__MCJsonNull__Group__0"
    // InternalMcblockstate.g:4153:1: rule__MCJsonNull__Group__0 : rule__MCJsonNull__Group__0__Impl rule__MCJsonNull__Group__1 ;
    public final void rule__MCJsonNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4157:1: ( rule__MCJsonNull__Group__0__Impl rule__MCJsonNull__Group__1 )
            // InternalMcblockstate.g:4158:2: rule__MCJsonNull__Group__0__Impl rule__MCJsonNull__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__MCJsonNull__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MCJsonNull__Group__1();

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
    // $ANTLR end "rule__MCJsonNull__Group__0"


    // $ANTLR start "rule__MCJsonNull__Group__0__Impl"
    // InternalMcblockstate.g:4165:1: rule__MCJsonNull__Group__0__Impl : ( 'null' ) ;
    public final void rule__MCJsonNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4169:1: ( ( 'null' ) )
            // InternalMcblockstate.g:4170:1: ( 'null' )
            {
            // InternalMcblockstate.g:4170:1: ( 'null' )
            // InternalMcblockstate.g:4171:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNullAccess().getNullKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNullAccess().getNullKeyword_0()); 
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
    // $ANTLR end "rule__MCJsonNull__Group__0__Impl"


    // $ANTLR start "rule__MCJsonNull__Group__1"
    // InternalMcblockstate.g:4180:1: rule__MCJsonNull__Group__1 : rule__MCJsonNull__Group__1__Impl ;
    public final void rule__MCJsonNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4184:1: ( rule__MCJsonNull__Group__1__Impl )
            // InternalMcblockstate.g:4185:2: rule__MCJsonNull__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCJsonNull__Group__1__Impl();

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
    // $ANTLR end "rule__MCJsonNull__Group__1"


    // $ANTLR start "rule__MCJsonNull__Group__1__Impl"
    // InternalMcblockstate.g:4191:1: rule__MCJsonNull__Group__1__Impl : ( () ) ;
    public final void rule__MCJsonNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4195:1: ( ( () ) )
            // InternalMcblockstate.g:4196:1: ( () )
            {
            // InternalMcblockstate.g:4196:1: ( () )
            // InternalMcblockstate.g:4197:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonNullAccess().getMCJsonNullAction_1()); 
            }
            // InternalMcblockstate.g:4198:2: ()
            // InternalMcblockstate.g:4198:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonNullAccess().getMCJsonNullAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCJsonNull__Group__1__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group__0"
    // InternalMcblockstate.g:4207:1: rule__NamespacedLocation__Group__0 : rule__NamespacedLocation__Group__0__Impl rule__NamespacedLocation__Group__1 ;
    public final void rule__NamespacedLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4211:1: ( rule__NamespacedLocation__Group__0__Impl rule__NamespacedLocation__Group__1 )
            // InternalMcblockstate.g:4212:2: rule__NamespacedLocation__Group__0__Impl rule__NamespacedLocation__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__NamespacedLocation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group__1();

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
    // $ANTLR end "rule__NamespacedLocation__Group__0"


    // $ANTLR start "rule__NamespacedLocation__Group__0__Impl"
    // InternalMcblockstate.g:4219:1: rule__NamespacedLocation__Group__0__Impl : ( ruleKey ) ;
    public final void rule__NamespacedLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4223:1: ( ( ruleKey ) )
            // InternalMcblockstate.g:4224:1: ( ruleKey )
            {
            // InternalMcblockstate.g:4224:1: ( ruleKey )
            // InternalMcblockstate.g:4225:2: ruleKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_0()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group__0__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group__1"
    // InternalMcblockstate.g:4234:1: rule__NamespacedLocation__Group__1 : rule__NamespacedLocation__Group__1__Impl rule__NamespacedLocation__Group__2 ;
    public final void rule__NamespacedLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4238:1: ( rule__NamespacedLocation__Group__1__Impl rule__NamespacedLocation__Group__2 )
            // InternalMcblockstate.g:4239:2: rule__NamespacedLocation__Group__1__Impl rule__NamespacedLocation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__NamespacedLocation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group__2();

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
    // $ANTLR end "rule__NamespacedLocation__Group__1"


    // $ANTLR start "rule__NamespacedLocation__Group__1__Impl"
    // InternalMcblockstate.g:4246:1: rule__NamespacedLocation__Group__1__Impl : ( ( rule__NamespacedLocation__Group_1__0 )? ) ;
    public final void rule__NamespacedLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4250:1: ( ( ( rule__NamespacedLocation__Group_1__0 )? ) )
            // InternalMcblockstate.g:4251:1: ( ( rule__NamespacedLocation__Group_1__0 )? )
            {
            // InternalMcblockstate.g:4251:1: ( ( rule__NamespacedLocation__Group_1__0 )? )
            // InternalMcblockstate.g:4252:2: ( rule__NamespacedLocation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getGroup_1()); 
            }
            // InternalMcblockstate.g:4253:2: ( rule__NamespacedLocation__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMcblockstate.g:4253:3: rule__NamespacedLocation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamespacedLocation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group__1__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group__2"
    // InternalMcblockstate.g:4261:1: rule__NamespacedLocation__Group__2 : rule__NamespacedLocation__Group__2__Impl ;
    public final void rule__NamespacedLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4265:1: ( rule__NamespacedLocation__Group__2__Impl )
            // InternalMcblockstate.g:4266:2: rule__NamespacedLocation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group__2__Impl();

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
    // $ANTLR end "rule__NamespacedLocation__Group__2"


    // $ANTLR start "rule__NamespacedLocation__Group__2__Impl"
    // InternalMcblockstate.g:4272:1: rule__NamespacedLocation__Group__2__Impl : ( ( rule__NamespacedLocation__Group_2__0 )* ) ;
    public final void rule__NamespacedLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4276:1: ( ( ( rule__NamespacedLocation__Group_2__0 )* ) )
            // InternalMcblockstate.g:4277:1: ( ( rule__NamespacedLocation__Group_2__0 )* )
            {
            // InternalMcblockstate.g:4277:1: ( ( rule__NamespacedLocation__Group_2__0 )* )
            // InternalMcblockstate.g:4278:2: ( rule__NamespacedLocation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getGroup_2()); 
            }
            // InternalMcblockstate.g:4279:2: ( rule__NamespacedLocation__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMcblockstate.g:4279:3: rule__NamespacedLocation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__NamespacedLocation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group__2__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_1__0"
    // InternalMcblockstate.g:4288:1: rule__NamespacedLocation__Group_1__0 : rule__NamespacedLocation__Group_1__0__Impl ;
    public final void rule__NamespacedLocation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4292:1: ( rule__NamespacedLocation__Group_1__0__Impl )
            // InternalMcblockstate.g:4293:2: rule__NamespacedLocation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_1__0__Impl();

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
    // $ANTLR end "rule__NamespacedLocation__Group_1__0"


    // $ANTLR start "rule__NamespacedLocation__Group_1__0__Impl"
    // InternalMcblockstate.g:4299:1: rule__NamespacedLocation__Group_1__0__Impl : ( ( rule__NamespacedLocation__Group_1_0__0 ) ) ;
    public final void rule__NamespacedLocation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4303:1: ( ( ( rule__NamespacedLocation__Group_1_0__0 ) ) )
            // InternalMcblockstate.g:4304:1: ( ( rule__NamespacedLocation__Group_1_0__0 ) )
            {
            // InternalMcblockstate.g:4304:1: ( ( rule__NamespacedLocation__Group_1_0__0 ) )
            // InternalMcblockstate.g:4305:2: ( rule__NamespacedLocation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getGroup_1_0()); 
            }
            // InternalMcblockstate.g:4306:2: ( rule__NamespacedLocation__Group_1_0__0 )
            // InternalMcblockstate.g:4306:3: rule__NamespacedLocation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_1__0__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_1_0__0"
    // InternalMcblockstate.g:4315:1: rule__NamespacedLocation__Group_1_0__0 : rule__NamespacedLocation__Group_1_0__0__Impl rule__NamespacedLocation__Group_1_0__1 ;
    public final void rule__NamespacedLocation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4319:1: ( rule__NamespacedLocation__Group_1_0__0__Impl rule__NamespacedLocation__Group_1_0__1 )
            // InternalMcblockstate.g:4320:2: rule__NamespacedLocation__Group_1_0__0__Impl rule__NamespacedLocation__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__NamespacedLocation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_1_0__1();

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
    // $ANTLR end "rule__NamespacedLocation__Group_1_0__0"


    // $ANTLR start "rule__NamespacedLocation__Group_1_0__0__Impl"
    // InternalMcblockstate.g:4327:1: rule__NamespacedLocation__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__NamespacedLocation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4331:1: ( ( ':' ) )
            // InternalMcblockstate.g:4332:1: ( ':' )
            {
            // InternalMcblockstate.g:4332:1: ( ':' )
            // InternalMcblockstate.g:4333:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getColonKeyword_1_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getColonKeyword_1_0_0()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_1_0__0__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_1_0__1"
    // InternalMcblockstate.g:4342:1: rule__NamespacedLocation__Group_1_0__1 : rule__NamespacedLocation__Group_1_0__1__Impl ;
    public final void rule__NamespacedLocation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4346:1: ( rule__NamespacedLocation__Group_1_0__1__Impl )
            // InternalMcblockstate.g:4347:2: rule__NamespacedLocation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__NamespacedLocation__Group_1_0__1"


    // $ANTLR start "rule__NamespacedLocation__Group_1_0__1__Impl"
    // InternalMcblockstate.g:4353:1: rule__NamespacedLocation__Group_1_0__1__Impl : ( ruleKey ) ;
    public final void rule__NamespacedLocation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4357:1: ( ( ruleKey ) )
            // InternalMcblockstate.g:4358:1: ( ruleKey )
            {
            // InternalMcblockstate.g:4358:1: ( ruleKey )
            // InternalMcblockstate.g:4359:2: ruleKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_1_0__1__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_2__0"
    // InternalMcblockstate.g:4369:1: rule__NamespacedLocation__Group_2__0 : rule__NamespacedLocation__Group_2__0__Impl ;
    public final void rule__NamespacedLocation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4373:1: ( rule__NamespacedLocation__Group_2__0__Impl )
            // InternalMcblockstate.g:4374:2: rule__NamespacedLocation__Group_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_2__0__Impl();

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
    // $ANTLR end "rule__NamespacedLocation__Group_2__0"


    // $ANTLR start "rule__NamespacedLocation__Group_2__0__Impl"
    // InternalMcblockstate.g:4380:1: rule__NamespacedLocation__Group_2__0__Impl : ( ( rule__NamespacedLocation__Group_2_0__0 ) ) ;
    public final void rule__NamespacedLocation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4384:1: ( ( ( rule__NamespacedLocation__Group_2_0__0 ) ) )
            // InternalMcblockstate.g:4385:1: ( ( rule__NamespacedLocation__Group_2_0__0 ) )
            {
            // InternalMcblockstate.g:4385:1: ( ( rule__NamespacedLocation__Group_2_0__0 ) )
            // InternalMcblockstate.g:4386:2: ( rule__NamespacedLocation__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getGroup_2_0()); 
            }
            // InternalMcblockstate.g:4387:2: ( rule__NamespacedLocation__Group_2_0__0 )
            // InternalMcblockstate.g:4387:3: rule__NamespacedLocation__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getGroup_2_0()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_2__0__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_2_0__0"
    // InternalMcblockstate.g:4396:1: rule__NamespacedLocation__Group_2_0__0 : rule__NamespacedLocation__Group_2_0__0__Impl rule__NamespacedLocation__Group_2_0__1 ;
    public final void rule__NamespacedLocation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4400:1: ( rule__NamespacedLocation__Group_2_0__0__Impl rule__NamespacedLocation__Group_2_0__1 )
            // InternalMcblockstate.g:4401:2: rule__NamespacedLocation__Group_2_0__0__Impl rule__NamespacedLocation__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__NamespacedLocation__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_2_0__1();

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
    // $ANTLR end "rule__NamespacedLocation__Group_2_0__0"


    // $ANTLR start "rule__NamespacedLocation__Group_2_0__0__Impl"
    // InternalMcblockstate.g:4408:1: rule__NamespacedLocation__Group_2_0__0__Impl : ( '/' ) ;
    public final void rule__NamespacedLocation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4412:1: ( ( '/' ) )
            // InternalMcblockstate.g:4413:1: ( '/' )
            {
            // InternalMcblockstate.g:4413:1: ( '/' )
            // InternalMcblockstate.g:4414:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getSolidusKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getSolidusKeyword_2_0_0()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_2_0__0__Impl"


    // $ANTLR start "rule__NamespacedLocation__Group_2_0__1"
    // InternalMcblockstate.g:4423:1: rule__NamespacedLocation__Group_2_0__1 : rule__NamespacedLocation__Group_2_0__1__Impl ;
    public final void rule__NamespacedLocation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4427:1: ( rule__NamespacedLocation__Group_2_0__1__Impl )
            // InternalMcblockstate.g:4428:2: rule__NamespacedLocation__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedLocation__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__NamespacedLocation__Group_2_0__1"


    // $ANTLR start "rule__NamespacedLocation__Group_2_0__1__Impl"
    // InternalMcblockstate.g:4434:1: rule__NamespacedLocation__Group_2_0__1__Impl : ( ruleKey ) ;
    public final void rule__NamespacedLocation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4438:1: ( ( ruleKey ) )
            // InternalMcblockstate.g:4439:1: ( ruleKey )
            {
            // InternalMcblockstate.g:4439:1: ( ruleKey )
            // InternalMcblockstate.g:4440:2: ruleKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__NamespacedLocation__Group_2_0__1__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // InternalMcblockstate.g:4450:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4454:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalMcblockstate.g:4455:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Key__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Key__Group__1();

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
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // InternalMcblockstate.g:4462:1: rule__Key__Group__0__Impl : ( ruleIdentifier ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4466:1: ( ( ruleIdentifier ) )
            // InternalMcblockstate.g:4467:1: ( ruleIdentifier )
            {
            // InternalMcblockstate.g:4467:1: ( ruleIdentifier )
            // InternalMcblockstate.g:4468:2: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_0()); 
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
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // InternalMcblockstate.g:4477:1: rule__Key__Group__1 : rule__Key__Group__1__Impl ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4481:1: ( rule__Key__Group__1__Impl )
            // InternalMcblockstate.g:4482:2: rule__Key__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__1__Impl();

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
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // InternalMcblockstate.g:4488:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 )* ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4492:1: ( ( ( rule__Key__Group_1__0 )* ) )
            // InternalMcblockstate.g:4493:1: ( ( rule__Key__Group_1__0 )* )
            {
            // InternalMcblockstate.g:4493:1: ( ( rule__Key__Group_1__0 )* )
            // InternalMcblockstate.g:4494:2: ( rule__Key__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyAccess().getGroup_1()); 
            }
            // InternalMcblockstate.g:4495:2: ( rule__Key__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMcblockstate.g:4495:3: rule__Key__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Key__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group_1__0"
    // InternalMcblockstate.g:4504:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4508:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalMcblockstate.g:4509:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Key__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1();

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
    // $ANTLR end "rule__Key__Group_1__0"


    // $ANTLR start "rule__Key__Group_1__0__Impl"
    // InternalMcblockstate.g:4516:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4520:1: ( ( '.' ) )
            // InternalMcblockstate.g:4521:1: ( '.' )
            {
            // InternalMcblockstate.g:4521:1: ( '.' )
            // InternalMcblockstate.g:4522:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__Key__Group_1__0__Impl"


    // $ANTLR start "rule__Key__Group_1__1"
    // InternalMcblockstate.g:4531:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4535:1: ( rule__Key__Group_1__1__Impl )
            // InternalMcblockstate.g:4536:2: rule__Key__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1__Impl();

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
    // $ANTLR end "rule__Key__Group_1__1"


    // $ANTLR start "rule__Key__Group_1__1__Impl"
    // InternalMcblockstate.g:4542:1: rule__Key__Group_1__1__Impl : ( ruleIdentifier ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4546:1: ( ( ruleIdentifier ) )
            // InternalMcblockstate.g:4547:1: ( ruleIdentifier )
            {
            // InternalMcblockstate.g:4547:1: ( ruleIdentifier )
            // InternalMcblockstate.g:4548:2: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Key__Group_1__1__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup_2_0_1"
    // InternalMcblockstate.g:4558:1: rule__Model__UnorderedGroup_2_0_1 : ( rule__Model__UnorderedGroup_2_0_1__0 )? ;
    public final void rule__Model__UnorderedGroup_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());
        	
        try {
            // InternalMcblockstate.g:4563:1: ( ( rule__Model__UnorderedGroup_2_0_1__0 )? )
            // InternalMcblockstate.g:4564:2: ( rule__Model__UnorderedGroup_2_0_1__0 )?
            {
            // InternalMcblockstate.g:4564:2: ( rule__Model__UnorderedGroup_2_0_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMcblockstate.g:0:0: rule__Model__UnorderedGroup_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UnorderedGroup_2_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup_2_0_1"


    // $ANTLR start "rule__Model__UnorderedGroup_2_0_1__Impl"
    // InternalMcblockstate.g:4572:1: rule__Model__UnorderedGroup_2_0_1__Impl : ( ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup_2_0_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMcblockstate.g:4577:1: ( ( ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) ) ) )
            // InternalMcblockstate.g:4578:3: ( ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) ) )
            {
            // InternalMcblockstate.g:4578:3: ( ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt42=2;
            }
            else if ( LA42_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt42=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMcblockstate.g:4579:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) )
                    {
                    // InternalMcblockstate.g:4579:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) )
                    // InternalMcblockstate.g:4580:4: {...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0)");
                    }
                    // InternalMcblockstate.g:4580:105: ( ( ( rule__Model__Group_2_0_1_0__0 ) ) )
                    // InternalMcblockstate.g:4581:5: ( ( rule__Model__Group_2_0_1_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0);
                    selected = true;
                    // InternalMcblockstate.g:4587:5: ( ( rule__Model__Group_2_0_1_0__0 ) )
                    // InternalMcblockstate.g:4588:6: ( rule__Model__Group_2_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_2_0_1_0()); 
                    }
                    // InternalMcblockstate.g:4589:6: ( rule__Model__Group_2_0_1_0__0 )
                    // InternalMcblockstate.g:4589:7: rule__Model__Group_2_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_2_0_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:4594:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) )
                    {
                    // InternalMcblockstate.g:4594:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) )
                    // InternalMcblockstate.g:4595:4: {...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1)");
                    }
                    // InternalMcblockstate.g:4595:105: ( ( ( rule__Model__Group_2_0_1_1__0 ) ) )
                    // InternalMcblockstate.g:4596:5: ( ( rule__Model__Group_2_0_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1);
                    selected = true;
                    // InternalMcblockstate.g:4602:5: ( ( rule__Model__Group_2_0_1_1__0 ) )
                    // InternalMcblockstate.g:4603:6: ( rule__Model__Group_2_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_2_0_1_1()); 
                    }
                    // InternalMcblockstate.g:4604:6: ( rule__Model__Group_2_0_1_1__0 )
                    // InternalMcblockstate.g:4604:7: rule__Model__Group_2_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_2_0_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:4609:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) )
                    {
                    // InternalMcblockstate.g:4609:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) ) )
                    // InternalMcblockstate.g:4610:4: {...}? => ( ( ( rule__Model__Group_2_0_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2)");
                    }
                    // InternalMcblockstate.g:4610:105: ( ( ( rule__Model__Group_2_0_1_2__0 ) ) )
                    // InternalMcblockstate.g:4611:5: ( ( rule__Model__Group_2_0_1_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2);
                    selected = true;
                    // InternalMcblockstate.g:4617:5: ( ( rule__Model__Group_2_0_1_2__0 ) )
                    // InternalMcblockstate.g:4618:6: ( rule__Model__Group_2_0_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_2_0_1_2()); 
                    }
                    // InternalMcblockstate.g:4619:6: ( rule__Model__Group_2_0_1_2__0 )
                    // InternalMcblockstate.g:4619:7: rule__Model__Group_2_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2_0_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_2_0_1_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup_2_0_1__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup_2_0_1__0"
    // InternalMcblockstate.g:4632:1: rule__Model__UnorderedGroup_2_0_1__0 : rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__1 )? ;
    public final void rule__Model__UnorderedGroup_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4636:1: ( rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__1 )? )
            // InternalMcblockstate.g:4637:2: rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__1 )?
            {
            pushFollow(FOLLOW_38);
            rule__Model__UnorderedGroup_2_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMcblockstate.g:4638:2: ( rule__Model__UnorderedGroup_2_0_1__1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMcblockstate.g:0:0: rule__Model__UnorderedGroup_2_0_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UnorderedGroup_2_0_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Model__UnorderedGroup_2_0_1__0"


    // $ANTLR start "rule__Model__UnorderedGroup_2_0_1__1"
    // InternalMcblockstate.g:4644:1: rule__Model__UnorderedGroup_2_0_1__1 : rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__2 )? ;
    public final void rule__Model__UnorderedGroup_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4648:1: ( rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__2 )? )
            // InternalMcblockstate.g:4649:2: rule__Model__UnorderedGroup_2_0_1__Impl ( rule__Model__UnorderedGroup_2_0_1__2 )?
            {
            pushFollow(FOLLOW_38);
            rule__Model__UnorderedGroup_2_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMcblockstate.g:4650:2: ( rule__Model__UnorderedGroup_2_0_1__2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMcblockstate.g:0:0: rule__Model__UnorderedGroup_2_0_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UnorderedGroup_2_0_1__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Model__UnorderedGroup_2_0_1__1"


    // $ANTLR start "rule__Model__UnorderedGroup_2_0_1__2"
    // InternalMcblockstate.g:4656:1: rule__Model__UnorderedGroup_2_0_1__2 : rule__Model__UnorderedGroup_2_0_1__Impl ;
    public final void rule__Model__UnorderedGroup_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4660:1: ( rule__Model__UnorderedGroup_2_0_1__Impl )
            // InternalMcblockstate.g:4661:2: rule__Model__UnorderedGroup_2_0_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__UnorderedGroup_2_0_1__Impl();

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
    // $ANTLR end "rule__Model__UnorderedGroup_2_0_1__2"


    // $ANTLR start "rule__VariantsBlockstate__VariantsAssignment_3"
    // InternalMcblockstate.g:4668:1: rule__VariantsBlockstate__VariantsAssignment_3 : ( ruleVariant ) ;
    public final void rule__VariantsBlockstate__VariantsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4672:1: ( ( ruleVariant ) )
            // InternalMcblockstate.g:4673:2: ( ruleVariant )
            {
            // InternalMcblockstate.g:4673:2: ( ruleVariant )
            // InternalMcblockstate.g:4674:3: ruleVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantsBlockstateAccess().getVariantsVariantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantsBlockstateAccess().getVariantsVariantParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__VariantsBlockstate__VariantsAssignment_3"


    // $ANTLR start "rule__Variant__PropertiesAssignment_1_0"
    // InternalMcblockstate.g:4683:1: rule__Variant__PropertiesAssignment_1_0 : ( ruleBlockstateProperty ) ;
    public final void rule__Variant__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4687:1: ( ( ruleBlockstateProperty ) )
            // InternalMcblockstate.g:4688:2: ( ruleBlockstateProperty )
            {
            // InternalMcblockstate.g:4688:2: ( ruleBlockstateProperty )
            // InternalMcblockstate.g:4689:3: ruleBlockstateProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstateProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Variant__PropertiesAssignment_1_0"


    // $ANTLR start "rule__Variant__PropertiesAssignment_1_1_0_1"
    // InternalMcblockstate.g:4698:1: rule__Variant__PropertiesAssignment_1_1_0_1 : ( ruleBlockstateProperty ) ;
    public final void rule__Variant__PropertiesAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4702:1: ( ( ruleBlockstateProperty ) )
            // InternalMcblockstate.g:4703:2: ( ruleBlockstateProperty )
            {
            // InternalMcblockstate.g:4703:2: ( ruleBlockstateProperty )
            // InternalMcblockstate.g:4704:3: ruleBlockstateProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstateProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_1_0_1_0()); 
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
    // $ANTLR end "rule__Variant__PropertiesAssignment_1_1_0_1"


    // $ANTLR start "rule__Variant__ModelsAssignment_4"
    // InternalMcblockstate.g:4713:1: rule__Variant__ModelsAssignment_4 : ( ruleModelList ) ;
    public final void rule__Variant__ModelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4717:1: ( ( ruleModelList ) )
            // InternalMcblockstate.g:4718:2: ( ruleModelList )
            {
            // InternalMcblockstate.g:4718:2: ( ruleModelList )
            // InternalMcblockstate.g:4719:3: ruleModelList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getModelsModelListParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getModelsModelListParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Variant__ModelsAssignment_4"


    // $ANTLR start "rule__BlockstateProperty__NameAssignment_0"
    // InternalMcblockstate.g:4728:1: rule__BlockstateProperty__NameAssignment_0 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstateProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4732:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4733:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4733:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4734:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getNameBlockstatePropertyValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getNameBlockstatePropertyValueParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__BlockstateProperty__NameAssignment_0"


    // $ANTLR start "rule__BlockstateProperty__ValueAssignment_2"
    // InternalMcblockstate.g:4743:1: rule__BlockstateProperty__ValueAssignment_2 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstateProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4747:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4748:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4748:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4749:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyAccess().getValueBlockstatePropertyValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyAccess().getValueBlockstatePropertyValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BlockstateProperty__ValueAssignment_2"


    // $ANTLR start "rule__MultipartBlockstate__CasesAssignment"
    // InternalMcblockstate.g:4758:1: rule__MultipartBlockstate__CasesAssignment : ( ruleCase ) ;
    public final void rule__MultipartBlockstate__CasesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4762:1: ( ( ruleCase ) )
            // InternalMcblockstate.g:4763:2: ( ruleCase )
            {
            // InternalMcblockstate.g:4763:2: ( ruleCase )
            // InternalMcblockstate.g:4764:3: ruleCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultipartBlockstateAccess().getCasesCaseParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultipartBlockstateAccess().getCasesCaseParserRuleCall_0()); 
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
    // $ANTLR end "rule__MultipartBlockstate__CasesAssignment"


    // $ANTLR start "rule__Case__ConditionAssignment_0_2"
    // InternalMcblockstate.g:4773:1: rule__Case__ConditionAssignment_0_2 : ( ruleCaseCondition ) ;
    public final void rule__Case__ConditionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4777:1: ( ( ruleCaseCondition ) )
            // InternalMcblockstate.g:4778:2: ( ruleCaseCondition )
            {
            // InternalMcblockstate.g:4778:2: ( ruleCaseCondition )
            // InternalMcblockstate.g:4779:3: ruleCaseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getConditionCaseConditionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getConditionCaseConditionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Case__ConditionAssignment_0_2"


    // $ANTLR start "rule__Case__ModelsAssignment_2"
    // InternalMcblockstate.g:4788:1: rule__Case__ModelsAssignment_2 : ( ruleModelList ) ;
    public final void rule__Case__ModelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4792:1: ( ( ruleModelList ) )
            // InternalMcblockstate.g:4793:2: ( ruleModelList )
            {
            // InternalMcblockstate.g:4793:2: ( ruleModelList )
            // InternalMcblockstate.g:4794:3: ruleModelList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getModelsModelListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getModelsModelListParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Case__ModelsAssignment_2"


    // $ANTLR start "rule__CaseCondition__OptionsAssignment_1_0_2"
    // InternalMcblockstate.g:4803:1: rule__CaseCondition__OptionsAssignment_1_0_2 : ( ruleBaseCaseCondition ) ;
    public final void rule__CaseCondition__OptionsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4807:1: ( ( ruleBaseCaseCondition ) )
            // InternalMcblockstate.g:4808:2: ( ruleBaseCaseCondition )
            {
            // InternalMcblockstate.g:4808:2: ( ruleBaseCaseCondition )
            // InternalMcblockstate.g:4809:3: ruleBaseCaseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__CaseCondition__OptionsAssignment_1_0_2"


    // $ANTLR start "rule__CaseCondition__OptionsAssignment_1_0_3_1"
    // InternalMcblockstate.g:4818:1: rule__CaseCondition__OptionsAssignment_1_0_3_1 : ( ruleBaseCaseCondition ) ;
    public final void rule__CaseCondition__OptionsAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4822:1: ( ( ruleBaseCaseCondition ) )
            // InternalMcblockstate.g:4823:2: ( ruleBaseCaseCondition )
            {
            // InternalMcblockstate.g:4823:2: ( ruleBaseCaseCondition )
            // InternalMcblockstate.g:4824:3: ruleBaseCaseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_3_1_0()); 
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
    // $ANTLR end "rule__CaseCondition__OptionsAssignment_1_0_3_1"


    // $ANTLR start "rule__BaseCaseCondition__PropertiesAssignment_1_1"
    // InternalMcblockstate.g:4833:1: rule__BaseCaseCondition__PropertiesAssignment_1_1 : ( ruleBlockstatePropertyPredicate ) ;
    public final void rule__BaseCaseCondition__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4837:1: ( ( ruleBlockstatePropertyPredicate ) )
            // InternalMcblockstate.g:4838:2: ( ruleBlockstatePropertyPredicate )
            {
            // InternalMcblockstate.g:4838:2: ( ruleBlockstatePropertyPredicate )
            // InternalMcblockstate.g:4839:3: ruleBlockstatePropertyPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__BaseCaseCondition__PropertiesAssignment_1_1"


    // $ANTLR start "rule__BaseCaseCondition__PropertiesAssignment_1_2_1"
    // InternalMcblockstate.g:4848:1: rule__BaseCaseCondition__PropertiesAssignment_1_2_1 : ( ruleBlockstatePropertyPredicate ) ;
    public final void rule__BaseCaseCondition__PropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4852:1: ( ( ruleBlockstatePropertyPredicate ) )
            // InternalMcblockstate.g:4853:2: ( ruleBlockstatePropertyPredicate )
            {
            // InternalMcblockstate.g:4853:2: ( ruleBlockstatePropertyPredicate )
            // InternalMcblockstate.g:4854:3: ruleBlockstatePropertyPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__BaseCaseCondition__PropertiesAssignment_1_2_1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__NameAssignment_0_1"
    // InternalMcblockstate.g:4863:1: rule__BlockstatePropertyPredicate__NameAssignment_0_1 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstatePropertyPredicate__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4867:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4868:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4868:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4869:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__NameAssignment_0_1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1"
    // InternalMcblockstate.g:4878:1: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4882:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4883:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4883:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4884:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_0_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_0_1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0"
    // InternalMcblockstate.g:4893:1: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4897:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4898:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4898:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4899:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_0_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_0"


    // $ANTLR start "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1"
    // InternalMcblockstate.g:4908:1: rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4912:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4913:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4913:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4914:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_1_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__ValuesAssignment_0_2_0_1_2_1_1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__InvertedAssignment_1_1"
    // InternalMcblockstate.g:4923:1: rule__BlockstatePropertyPredicate__InvertedAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__BlockstatePropertyPredicate__InvertedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4927:1: ( ( ( '!' ) ) )
            // InternalMcblockstate.g:4928:2: ( ( '!' ) )
            {
            // InternalMcblockstate.g:4928:2: ( ( '!' ) )
            // InternalMcblockstate.g:4929:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedExclamationMarkKeyword_1_1_0()); 
            }
            // InternalMcblockstate.g:4930:3: ( '!' )
            // InternalMcblockstate.g:4931:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedExclamationMarkKeyword_1_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedExclamationMarkKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedExclamationMarkKeyword_1_1_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__InvertedAssignment_1_1"


    // $ANTLR start "rule__BlockstatePropertyPredicate__NameAssignment_1_2"
    // InternalMcblockstate.g:4942:1: rule__BlockstatePropertyPredicate__NameAssignment_1_2 : ( ruleBlockstatePropertyValue ) ;
    public final void rule__BlockstatePropertyPredicate__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4946:1: ( ( ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:4947:2: ( ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:4947:2: ( ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:4948:3: ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__BlockstatePropertyPredicate__NameAssignment_1_2"


    // $ANTLR start "rule__CustomBlockstate__JsonAssignment"
    // InternalMcblockstate.g:4957:1: rule__CustomBlockstate__JsonAssignment : ( ruleMCJsonObject ) ;
    public final void rule__CustomBlockstate__JsonAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4961:1: ( ( ruleMCJsonObject ) )
            // InternalMcblockstate.g:4962:2: ( ruleMCJsonObject )
            {
            // InternalMcblockstate.g:4962:2: ( ruleMCJsonObject )
            // InternalMcblockstate.g:4963:3: ruleMCJsonObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomBlockstateAccess().getJsonMCJsonObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomBlockstateAccess().getJsonMCJsonObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__CustomBlockstate__JsonAssignment"


    // $ANTLR start "rule__ModelList__ModelsAssignment_0_2"
    // InternalMcblockstate.g:4972:1: rule__ModelList__ModelsAssignment_0_2 : ( ruleModel ) ;
    public final void rule__ModelList__ModelsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4976:1: ( ( ruleModel ) )
            // InternalMcblockstate.g:4977:2: ( ruleModel )
            {
            // InternalMcblockstate.g:4977:2: ( ruleModel )
            // InternalMcblockstate.g:4978:3: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__ModelList__ModelsAssignment_0_2"


    // $ANTLR start "rule__ModelList__ModelsAssignment_1"
    // InternalMcblockstate.g:4987:1: rule__ModelList__ModelsAssignment_1 : ( ruleModel ) ;
    public final void rule__ModelList__ModelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:4991:1: ( ( ruleModel ) )
            // InternalMcblockstate.g:4992:2: ( ruleModel )
            {
            // InternalMcblockstate.g:4992:2: ( ruleModel )
            // InternalMcblockstate.g:4993:3: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ModelList__ModelsAssignment_1"


    // $ANTLR start "rule__Model__LocationAssignment_0"
    // InternalMcblockstate.g:5002:1: rule__Model__LocationAssignment_0 : ( ruleNamespacedLocation ) ;
    public final void rule__Model__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5006:1: ( ( ruleNamespacedLocation ) )
            // InternalMcblockstate.g:5007:2: ( ruleNamespacedLocation )
            {
            // InternalMcblockstate.g:5007:2: ( ruleNamespacedLocation )
            // InternalMcblockstate.g:5008:3: ruleNamespacedLocation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLocationNamespacedLocationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamespacedLocation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLocationNamespacedLocationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__LocationAssignment_0"


    // $ANTLR start "rule__Model__WeightDefinedAssignment_1_0_0"
    // InternalMcblockstate.g:5017:1: rule__Model__WeightDefinedAssignment_1_0_0 : ( ( '*' ) ) ;
    public final void rule__Model__WeightDefinedAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5021:1: ( ( ( '*' ) ) )
            // InternalMcblockstate.g:5022:2: ( ( '*' ) )
            {
            // InternalMcblockstate.g:5022:2: ( ( '*' ) )
            // InternalMcblockstate.g:5023:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWeightDefinedAsteriskKeyword_1_0_0_0()); 
            }
            // InternalMcblockstate.g:5024:3: ( '*' )
            // InternalMcblockstate.g:5025:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWeightDefinedAsteriskKeyword_1_0_0_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWeightDefinedAsteriskKeyword_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWeightDefinedAsteriskKeyword_1_0_0_0()); 
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
    // $ANTLR end "rule__Model__WeightDefinedAssignment_1_0_0"


    // $ANTLR start "rule__Model__WeightAssignment_1_0_1"
    // InternalMcblockstate.g:5036:1: rule__Model__WeightAssignment_1_0_1 : ( RULE_ULONG ) ;
    public final void rule__Model__WeightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5040:1: ( ( RULE_ULONG ) )
            // InternalMcblockstate.g:5041:2: ( RULE_ULONG )
            {
            // InternalMcblockstate.g:5041:2: ( RULE_ULONG )
            // InternalMcblockstate.g:5042:3: RULE_ULONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWeightULONGTerminalRuleCall_1_0_1_0()); 
            }
            match(input,RULE_ULONG,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWeightULONGTerminalRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__Model__WeightAssignment_1_0_1"


    // $ANTLR start "rule__Model__XDefinedAssignment_2_0_1_0_0"
    // InternalMcblockstate.g:5051:1: rule__Model__XDefinedAssignment_2_0_1_0_0 : ( ( 'x' ) ) ;
    public final void rule__Model__XDefinedAssignment_2_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5055:1: ( ( ( 'x' ) ) )
            // InternalMcblockstate.g:5056:2: ( ( 'x' ) )
            {
            // InternalMcblockstate.g:5056:2: ( ( 'x' ) )
            // InternalMcblockstate.g:5057:3: ( 'x' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getXDefinedXKeyword_2_0_1_0_0_0()); 
            }
            // InternalMcblockstate.g:5058:3: ( 'x' )
            // InternalMcblockstate.g:5059:4: 'x'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getXDefinedXKeyword_2_0_1_0_0_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getXDefinedXKeyword_2_0_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getXDefinedXKeyword_2_0_1_0_0_0()); 
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
    // $ANTLR end "rule__Model__XDefinedAssignment_2_0_1_0_0"


    // $ANTLR start "rule__Model__XAssignment_2_0_1_0_2"
    // InternalMcblockstate.g:5070:1: rule__Model__XAssignment_2_0_1_0_2 : ( ruleLONG ) ;
    public final void rule__Model__XAssignment_2_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5074:1: ( ( ruleLONG ) )
            // InternalMcblockstate.g:5075:2: ( ruleLONG )
            {
            // InternalMcblockstate.g:5075:2: ( ruleLONG )
            // InternalMcblockstate.g:5076:3: ruleLONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getXLONGParserRuleCall_2_0_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLONG();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getXLONGParserRuleCall_2_0_1_0_2_0()); 
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
    // $ANTLR end "rule__Model__XAssignment_2_0_1_0_2"


    // $ANTLR start "rule__Model__YDefinedAssignment_2_0_1_1_0"
    // InternalMcblockstate.g:5085:1: rule__Model__YDefinedAssignment_2_0_1_1_0 : ( ( 'y' ) ) ;
    public final void rule__Model__YDefinedAssignment_2_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5089:1: ( ( ( 'y' ) ) )
            // InternalMcblockstate.g:5090:2: ( ( 'y' ) )
            {
            // InternalMcblockstate.g:5090:2: ( ( 'y' ) )
            // InternalMcblockstate.g:5091:3: ( 'y' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getYDefinedYKeyword_2_0_1_1_0_0()); 
            }
            // InternalMcblockstate.g:5092:3: ( 'y' )
            // InternalMcblockstate.g:5093:4: 'y'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getYDefinedYKeyword_2_0_1_1_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getYDefinedYKeyword_2_0_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getYDefinedYKeyword_2_0_1_1_0_0()); 
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
    // $ANTLR end "rule__Model__YDefinedAssignment_2_0_1_1_0"


    // $ANTLR start "rule__Model__YAssignment_2_0_1_1_2"
    // InternalMcblockstate.g:5104:1: rule__Model__YAssignment_2_0_1_1_2 : ( ruleLONG ) ;
    public final void rule__Model__YAssignment_2_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5108:1: ( ( ruleLONG ) )
            // InternalMcblockstate.g:5109:2: ( ruleLONG )
            {
            // InternalMcblockstate.g:5109:2: ( ruleLONG )
            // InternalMcblockstate.g:5110:3: ruleLONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getYLONGParserRuleCall_2_0_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLONG();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getYLONGParserRuleCall_2_0_1_1_2_0()); 
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
    // $ANTLR end "rule__Model__YAssignment_2_0_1_1_2"


    // $ANTLR start "rule__Model__UvlockDefinedAssignment_2_0_1_2_0"
    // InternalMcblockstate.g:5119:1: rule__Model__UvlockDefinedAssignment_2_0_1_2_0 : ( ( 'uvlock' ) ) ;
    public final void rule__Model__UvlockDefinedAssignment_2_0_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5123:1: ( ( ( 'uvlock' ) ) )
            // InternalMcblockstate.g:5124:2: ( ( 'uvlock' ) )
            {
            // InternalMcblockstate.g:5124:2: ( ( 'uvlock' ) )
            // InternalMcblockstate.g:5125:3: ( 'uvlock' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUvlockDefinedUvlockKeyword_2_0_1_2_0_0()); 
            }
            // InternalMcblockstate.g:5126:3: ( 'uvlock' )
            // InternalMcblockstate.g:5127:4: 'uvlock'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUvlockDefinedUvlockKeyword_2_0_1_2_0_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUvlockDefinedUvlockKeyword_2_0_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUvlockDefinedUvlockKeyword_2_0_1_2_0_0()); 
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
    // $ANTLR end "rule__Model__UvlockDefinedAssignment_2_0_1_2_0"


    // $ANTLR start "rule__Model__UvlockAssignment_2_0_1_2_2_0"
    // InternalMcblockstate.g:5138:1: rule__Model__UvlockAssignment_2_0_1_2_2_0 : ( ( 'true' ) ) ;
    public final void rule__Model__UvlockAssignment_2_0_1_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5142:1: ( ( ( 'true' ) ) )
            // InternalMcblockstate.g:5143:2: ( ( 'true' ) )
            {
            // InternalMcblockstate.g:5143:2: ( ( 'true' ) )
            // InternalMcblockstate.g:5144:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUvlockTrueKeyword_2_0_1_2_2_0_0()); 
            }
            // InternalMcblockstate.g:5145:3: ( 'true' )
            // InternalMcblockstate.g:5146:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUvlockTrueKeyword_2_0_1_2_2_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUvlockTrueKeyword_2_0_1_2_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUvlockTrueKeyword_2_0_1_2_2_0_0()); 
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
    // $ANTLR end "rule__Model__UvlockAssignment_2_0_1_2_2_0"


    // $ANTLR start "rule__MCJsonObject__EntriesAssignment_2_0"
    // InternalMcblockstate.g:5157:1: rule__MCJsonObject__EntriesAssignment_2_0 : ( ruleMCJsonEntry ) ;
    public final void rule__MCJsonObject__EntriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5161:1: ( ( ruleMCJsonEntry ) )
            // InternalMcblockstate.g:5162:2: ( ruleMCJsonEntry )
            {
            // InternalMcblockstate.g:5162:2: ( ruleMCJsonEntry )
            // InternalMcblockstate.g:5163:3: ruleMCJsonEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__MCJsonObject__EntriesAssignment_2_0"


    // $ANTLR start "rule__MCJsonObject__EntriesAssignment_2_1_1"
    // InternalMcblockstate.g:5172:1: rule__MCJsonObject__EntriesAssignment_2_1_1 : ( ruleMCJsonEntry ) ;
    public final void rule__MCJsonObject__EntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5176:1: ( ( ruleMCJsonEntry ) )
            // InternalMcblockstate.g:5177:2: ( ruleMCJsonEntry )
            {
            // InternalMcblockstate.g:5177:2: ( ruleMCJsonEntry )
            // InternalMcblockstate.g:5178:3: ruleMCJsonEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__MCJsonObject__EntriesAssignment_2_1_1"


    // $ANTLR start "rule__MCJsonEntry__NameAssignment_0"
    // InternalMcblockstate.g:5187:1: rule__MCJsonEntry__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MCJsonEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5191:1: ( ( RULE_STRING ) )
            // InternalMcblockstate.g:5192:2: ( RULE_STRING )
            {
            // InternalMcblockstate.g:5192:2: ( RULE_STRING )
            // InternalMcblockstate.g:5193:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__MCJsonEntry__NameAssignment_0"


    // $ANTLR start "rule__MCJsonEntry__ValueAssignment_2"
    // InternalMcblockstate.g:5202:1: rule__MCJsonEntry__ValueAssignment_2 : ( ruleMCJsonValue ) ;
    public final void rule__MCJsonEntry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5206:1: ( ( ruleMCJsonValue ) )
            // InternalMcblockstate.g:5207:2: ( ruleMCJsonValue )
            {
            // InternalMcblockstate.g:5207:2: ( ruleMCJsonValue )
            // InternalMcblockstate.g:5208:3: ruleMCJsonValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonEntryAccess().getValueMCJsonValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonEntryAccess().getValueMCJsonValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MCJsonEntry__ValueAssignment_2"


    // $ANTLR start "rule__MCJsonArray__ElementsAssignment_2_0"
    // InternalMcblockstate.g:5217:1: rule__MCJsonArray__ElementsAssignment_2_0 : ( ruleMCJsonValue ) ;
    public final void rule__MCJsonArray__ElementsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5221:1: ( ( ruleMCJsonValue ) )
            // InternalMcblockstate.g:5222:2: ( ruleMCJsonValue )
            {
            // InternalMcblockstate.g:5222:2: ( ruleMCJsonValue )
            // InternalMcblockstate.g:5223:3: ruleMCJsonValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__MCJsonArray__ElementsAssignment_2_0"


    // $ANTLR start "rule__MCJsonArray__ElementsAssignment_2_1_1"
    // InternalMcblockstate.g:5232:1: rule__MCJsonArray__ElementsAssignment_2_1_1 : ( ruleMCJsonValue ) ;
    public final void rule__MCJsonArray__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5236:1: ( ( ruleMCJsonValue ) )
            // InternalMcblockstate.g:5237:2: ( ruleMCJsonValue )
            {
            // InternalMcblockstate.g:5237:2: ( ruleMCJsonValue )
            // InternalMcblockstate.g:5238:3: ruleMCJsonValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__MCJsonArray__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__MCJsonString__ValueAssignment"
    // InternalMcblockstate.g:5247:1: rule__MCJsonString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__MCJsonString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5251:1: ( ( RULE_STRING ) )
            // InternalMcblockstate.g:5252:2: ( RULE_STRING )
            {
            // InternalMcblockstate.g:5252:2: ( RULE_STRING )
            // InternalMcblockstate.g:5253:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonStringAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__MCJsonString__ValueAssignment"


    // $ANTLR start "rule__MCJsonIntegral__ValueAssignment"
    // InternalMcblockstate.g:5262:1: rule__MCJsonIntegral__ValueAssignment : ( ruleLONG ) ;
    public final void rule__MCJsonIntegral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5266:1: ( ( ruleLONG ) )
            // InternalMcblockstate.g:5267:2: ( ruleLONG )
            {
            // InternalMcblockstate.g:5267:2: ( ruleLONG )
            // InternalMcblockstate.g:5268:3: ruleLONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonIntegralAccess().getValueLONGParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLONG();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonIntegralAccess().getValueLONGParserRuleCall_0()); 
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
    // $ANTLR end "rule__MCJsonIntegral__ValueAssignment"


    // $ANTLR start "rule__MCJsonFloatingPoint__ValueAssignment"
    // InternalMcblockstate.g:5277:1: rule__MCJsonFloatingPoint__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__MCJsonFloatingPoint__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5281:1: ( ( RULE_DOUBLE ) )
            // InternalMcblockstate.g:5282:2: ( RULE_DOUBLE )
            {
            // InternalMcblockstate.g:5282:2: ( RULE_DOUBLE )
            // InternalMcblockstate.g:5283:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonFloatingPointAccess().getValueDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonFloatingPointAccess().getValueDOUBLETerminalRuleCall_0()); 
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
    // $ANTLR end "rule__MCJsonFloatingPoint__ValueAssignment"


    // $ANTLR start "rule__MCJsonBoolean__ValueAssignment_0"
    // InternalMcblockstate.g:5292:1: rule__MCJsonBoolean__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__MCJsonBoolean__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMcblockstate.g:5296:1: ( ( ( 'true' ) ) )
            // InternalMcblockstate.g:5297:2: ( ( 'true' ) )
            {
            // InternalMcblockstate.g:5297:2: ( ( 'true' ) )
            // InternalMcblockstate.g:5298:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanAccess().getValueTrueKeyword_0_0()); 
            }
            // InternalMcblockstate.g:5299:3: ( 'true' )
            // InternalMcblockstate.g:5300:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMCJsonBooleanAccess().getValueTrueKeyword_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanAccess().getValueTrueKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMCJsonBooleanAccess().getValueTrueKeyword_0_0()); 
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
    // $ANTLR end "rule__MCJsonBoolean__ValueAssignment_0"

    // $ANTLR start synpred64_InternalMcblockstate
    public final void synpred64_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:4564:2: ( rule__Model__UnorderedGroup_2_0_1__0 )
        // InternalMcblockstate.g:4564:2: rule__Model__UnorderedGroup_2_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Model__UnorderedGroup_2_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalMcblockstate

    // $ANTLR start synpred65_InternalMcblockstate
    public final void synpred65_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:4579:3: ( ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) ) )
        // InternalMcblockstate.g:4579:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) )
        {
        // InternalMcblockstate.g:4579:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) ) )
        // InternalMcblockstate.g:4580:4: {...}? => ( ( ( rule__Model__Group_2_0_1_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred65_InternalMcblockstate", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0)");
        }
        // InternalMcblockstate.g:4580:105: ( ( ( rule__Model__Group_2_0_1_0__0 ) ) )
        // InternalMcblockstate.g:4581:5: ( ( rule__Model__Group_2_0_1_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0);
        // InternalMcblockstate.g:4587:5: ( ( rule__Model__Group_2_0_1_0__0 ) )
        // InternalMcblockstate.g:4588:6: ( rule__Model__Group_2_0_1_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getModelAccess().getGroup_2_0_1_0()); 
        }
        // InternalMcblockstate.g:4589:6: ( rule__Model__Group_2_0_1_0__0 )
        // InternalMcblockstate.g:4589:7: rule__Model__Group_2_0_1_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Model__Group_2_0_1_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalMcblockstate

    // $ANTLR start synpred66_InternalMcblockstate
    public final void synpred66_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:4594:3: ( ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) ) )
        // InternalMcblockstate.g:4594:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) )
        {
        // InternalMcblockstate.g:4594:3: ({...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) ) )
        // InternalMcblockstate.g:4595:4: {...}? => ( ( ( rule__Model__Group_2_0_1_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred66_InternalMcblockstate", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1)");
        }
        // InternalMcblockstate.g:4595:105: ( ( ( rule__Model__Group_2_0_1_1__0 ) ) )
        // InternalMcblockstate.g:4596:5: ( ( rule__Model__Group_2_0_1_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1);
        // InternalMcblockstate.g:4602:5: ( ( rule__Model__Group_2_0_1_1__0 ) )
        // InternalMcblockstate.g:4603:6: ( rule__Model__Group_2_0_1_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getModelAccess().getGroup_2_0_1_1()); 
        }
        // InternalMcblockstate.g:4604:6: ( rule__Model__Group_2_0_1_1__0 )
        // InternalMcblockstate.g:4604:7: rule__Model__Group_2_0_1_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Model__Group_2_0_1_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalMcblockstate

    // $ANTLR start synpred67_InternalMcblockstate
    public final void synpred67_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:4638:2: ( rule__Model__UnorderedGroup_2_0_1__1 )
        // InternalMcblockstate.g:4638:2: rule__Model__UnorderedGroup_2_0_1__1
        {
        pushFollow(FOLLOW_2);
        rule__Model__UnorderedGroup_2_0_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalMcblockstate

    // $ANTLR start synpred68_InternalMcblockstate
    public final void synpred68_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:4650:2: ( rule__Model__UnorderedGroup_2_0_1__2 )
        // InternalMcblockstate.g:4650:2: rule__Model__UnorderedGroup_2_0_1__2
        {
        pushFollow(FOLLOW_2);
        rule__Model__UnorderedGroup_2_0_1__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalMcblockstate

    // Delegated rules

    public final boolean synpred66_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\uffff\20\21\2\uffff";
    static final String dfa_3s = "\1\4\20\20\2\uffff";
    static final String dfa_4s = "\1\51\20\45\2\uffff";
    static final String dfa_5s = "\21\uffff\1\2\1\1";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\14\1\15\1\16\1\17\1\20\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\14\uffff\1\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
            "\2\22\5\uffff\1\22\13\uffff\3\21",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "847:1: rule__BlockstatePropertyPredicate__Alternatives : ( ( ( rule__BlockstatePropertyPredicate__Group_0__0 ) ) | ( ( rule__BlockstatePropertyPredicate__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000011FFC01F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000337C0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001FFC01F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000002041FFC01F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000830000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000081FFC01F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000737C0010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000337C0012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000BFFC01F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000001BFFC01F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000001C000002L});

}
