package com.raptor.mcblockstate.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.raptor.mcblockstate.services.McblockstateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMcblockstateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_ULONG", "RULE_SLONG", "RULE_SIGN", "RULE_DIGITS", "RULE_EXPONENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variants'", "'{'", "'}'", "'['", "','", "']'", "'='", "'when'", "'('", "')'", "'apply'", "'|'", "'&'", "'=='", "'in'", "'!'", "'true'", "'false'", "'null'", "'multipart'", "'x'", "'y'", "'uvlock'", "'*'", "':'", "'/'", "'.'"
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

        public InternalMcblockstateParser(TokenStream input, McblockstateGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Blockstate";
       	}

       	@Override
       	protected McblockstateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBlockstate"
    // InternalMcblockstate.g:64:1: entryRuleBlockstate returns [EObject current=null] : iv_ruleBlockstate= ruleBlockstate EOF ;
    public final EObject entryRuleBlockstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockstate = null;


        try {
            // InternalMcblockstate.g:64:51: (iv_ruleBlockstate= ruleBlockstate EOF )
            // InternalMcblockstate.g:65:2: iv_ruleBlockstate= ruleBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockstate=ruleBlockstate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockstate; 
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
    // $ANTLR end "entryRuleBlockstate"


    // $ANTLR start "ruleBlockstate"
    // InternalMcblockstate.g:71:1: ruleBlockstate returns [EObject current=null] : ( ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) ) | this_CustomBlockstate_2= ruleCustomBlockstate ) ;
    public final EObject ruleBlockstate() throws RecognitionException {
        EObject current = null;

        EObject this_VariantsBlockstate_0 = null;

        EObject this_MultipartBlockstate_1 = null;

        EObject this_CustomBlockstate_2 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:77:2: ( ( ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) ) | this_CustomBlockstate_2= ruleCustomBlockstate ) )
            // InternalMcblockstate.g:78:2: ( ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) ) | this_CustomBlockstate_2= ruleCustomBlockstate )
            {
            // InternalMcblockstate.g:78:2: ( ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) ) | this_CustomBlockstate_2= ruleCustomBlockstate )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) && (synpred1_InternalMcblockstate())) {
                alt2=1;
            }
            else if ( (LA2_0==23) && (synpred1_InternalMcblockstate())) {
                alt2=1;
            }
            else if ( (LA2_0==26) && (synpred1_InternalMcblockstate())) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMcblockstate.g:79:3: ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) )
                    {
                    // InternalMcblockstate.g:79:3: ( ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate ) )
                    // InternalMcblockstate.g:80:4: ( 'variants' | 'when' | 'apply' )=> (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate )
                    {
                    // InternalMcblockstate.g:81:4: (this_VariantsBlockstate_0= ruleVariantsBlockstate | this_MultipartBlockstate_1= ruleMultipartBlockstate )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==16) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==23||LA1_0==26) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalMcblockstate.g:82:5: this_VariantsBlockstate_0= ruleVariantsBlockstate
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getBlockstateAccess().getVariantsBlockstateParserRuleCall_0_0_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_VariantsBlockstate_0=ruleVariantsBlockstate();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_VariantsBlockstate_0;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMcblockstate.g:91:5: this_MultipartBlockstate_1= ruleMultipartBlockstate
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getBlockstateAccess().getMultipartBlockstateParserRuleCall_0_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_MultipartBlockstate_1=ruleMultipartBlockstate();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_MultipartBlockstate_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:102:3: this_CustomBlockstate_2= ruleCustomBlockstate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockstateAccess().getCustomBlockstateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CustomBlockstate_2=ruleCustomBlockstate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CustomBlockstate_2;
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
    // $ANTLR end "ruleBlockstate"


    // $ANTLR start "entryRuleVariantsBlockstate"
    // InternalMcblockstate.g:114:1: entryRuleVariantsBlockstate returns [EObject current=null] : iv_ruleVariantsBlockstate= ruleVariantsBlockstate EOF ;
    public final EObject entryRuleVariantsBlockstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantsBlockstate = null;


        try {
            // InternalMcblockstate.g:114:59: (iv_ruleVariantsBlockstate= ruleVariantsBlockstate EOF )
            // InternalMcblockstate.g:115:2: iv_ruleVariantsBlockstate= ruleVariantsBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariantsBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariantsBlockstate=ruleVariantsBlockstate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariantsBlockstate; 
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
    // $ANTLR end "entryRuleVariantsBlockstate"


    // $ANTLR start "ruleVariantsBlockstate"
    // InternalMcblockstate.g:121:1: ruleVariantsBlockstate returns [EObject current=null] : (otherlv_0= 'variants' () otherlv_2= '{' ( (lv_variants_3_0= ruleVariant ) )* otherlv_4= '}' ) ;
    public final EObject ruleVariantsBlockstate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:127:2: ( (otherlv_0= 'variants' () otherlv_2= '{' ( (lv_variants_3_0= ruleVariant ) )* otherlv_4= '}' ) )
            // InternalMcblockstate.g:128:2: (otherlv_0= 'variants' () otherlv_2= '{' ( (lv_variants_3_0= ruleVariant ) )* otherlv_4= '}' )
            {
            // InternalMcblockstate.g:128:2: (otherlv_0= 'variants' () otherlv_2= '{' ( (lv_variants_3_0= ruleVariant ) )* otherlv_4= '}' )
            // InternalMcblockstate.g:129:3: otherlv_0= 'variants' () otherlv_2= '{' ( (lv_variants_3_0= ruleVariant ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariantsBlockstateAccess().getVariantsKeyword_0());
              		
            }
            // InternalMcblockstate.g:133:3: ()
            // InternalMcblockstate.g:134:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariantsBlockstateAccess().getVariantsBlockstateAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariantsBlockstateAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMcblockstate.g:144:3: ( (lv_variants_3_0= ruleVariant ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMcblockstate.g:145:4: (lv_variants_3_0= ruleVariant )
            	    {
            	    // InternalMcblockstate.g:145:4: (lv_variants_3_0= ruleVariant )
            	    // InternalMcblockstate.g:146:5: lv_variants_3_0= ruleVariant
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariantsBlockstateAccess().getVariantsVariantParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_variants_3_0=ruleVariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVariantsBlockstateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"variants",
            	      						lv_variants_3_0,
            	      						"com.raptor.mcblockstate.Mcblockstate.Variant");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVariantsBlockstateAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleVariantsBlockstate"


    // $ANTLR start "entryRuleVariant"
    // InternalMcblockstate.g:171:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // InternalMcblockstate.g:171:48: (iv_ruleVariant= ruleVariant EOF )
            // InternalMcblockstate.g:172:2: iv_ruleVariant= ruleVariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariant=ruleVariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariant; 
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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMcblockstate.g:178:1: ruleVariant returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )? otherlv_5= ']' otherlv_6= '=' ( (lv_models_7_0= ruleModelList ) ) ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_models_7_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:184:2: ( (otherlv_0= '[' ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )? otherlv_5= ']' otherlv_6= '=' ( (lv_models_7_0= ruleModelList ) ) ) )
            // InternalMcblockstate.g:185:2: (otherlv_0= '[' ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )? otherlv_5= ']' otherlv_6= '=' ( (lv_models_7_0= ruleModelList ) ) )
            {
            // InternalMcblockstate.g:185:2: (otherlv_0= '[' ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )? otherlv_5= ']' otherlv_6= '=' ( (lv_models_7_0= ruleModelList ) ) )
            // InternalMcblockstate.g:186:3: otherlv_0= '[' ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )? otherlv_5= ']' otherlv_6= '=' ( (lv_models_7_0= ruleModelList ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariantAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMcblockstate.g:190:3: ( ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_SLONG)||LA6_0==16||LA6_0==23||LA6_0==26||LA6_0==30||(LA6_0>=32 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMcblockstate.g:191:4: ( (lv_properties_1_0= ruleBlockstateProperty ) ) ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )* (otherlv_4= ',' )?
                    {
                    // InternalMcblockstate.g:191:4: ( (lv_properties_1_0= ruleBlockstateProperty ) )
                    // InternalMcblockstate.g:192:5: (lv_properties_1_0= ruleBlockstateProperty )
                    {
                    // InternalMcblockstate.g:192:5: (lv_properties_1_0= ruleBlockstateProperty )
                    // InternalMcblockstate.g:193:6: lv_properties_1_0= ruleBlockstateProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_properties_1_0=ruleBlockstateProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariantRule());
                      						}
                      						add(
                      							current,
                      							"properties",
                      							lv_properties_1_0,
                      							"com.raptor.mcblockstate.Mcblockstate.BlockstateProperty");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMcblockstate.g:210:4: ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        alt4 = dfa4.predict(input);
                        switch (alt4) {
                    	case 1 :
                    	    // InternalMcblockstate.g:211:5: ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) )
                    	    {
                    	    // InternalMcblockstate.g:220:5: (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) )
                    	    // InternalMcblockstate.g:221:6: otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getCommaKeyword_1_1_0_0());
                    	      					
                    	    }
                    	    // InternalMcblockstate.g:225:6: ( (lv_properties_3_0= ruleBlockstateProperty ) )
                    	    // InternalMcblockstate.g:226:7: (lv_properties_3_0= ruleBlockstateProperty )
                    	    {
                    	    // InternalMcblockstate.g:226:7: (lv_properties_3_0= ruleBlockstateProperty )
                    	    // InternalMcblockstate.g:227:8: lv_properties_3_0= ruleBlockstateProperty
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getVariantAccess().getPropertiesBlockstatePropertyParserRuleCall_1_1_0_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_3_0=ruleBlockstateProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getVariantRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"properties",
                    	      									lv_properties_3_0,
                    	      									"com.raptor.mcblockstate.Mcblockstate.BlockstateProperty");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalMcblockstate.g:246:4: (otherlv_4= ',' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMcblockstate.g:247:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getCommaKeyword_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVariantAccess().getRightSquareBracketKeyword_2());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVariantAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMcblockstate.g:261:3: ( (lv_models_7_0= ruleModelList ) )
            // InternalMcblockstate.g:262:4: (lv_models_7_0= ruleModelList )
            {
            // InternalMcblockstate.g:262:4: (lv_models_7_0= ruleModelList )
            // InternalMcblockstate.g:263:5: lv_models_7_0= ruleModelList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariantAccess().getModelsModelListParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_models_7_0=ruleModelList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariantRule());
              					}
              					set(
              						current,
              						"models",
              						lv_models_7_0,
              						"com.raptor.mcblockstate.Mcblockstate.ModelList");
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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleBlockstateProperty"
    // InternalMcblockstate.g:284:1: entryRuleBlockstateProperty returns [EObject current=null] : iv_ruleBlockstateProperty= ruleBlockstateProperty EOF ;
    public final EObject entryRuleBlockstateProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockstateProperty = null;


        try {
            // InternalMcblockstate.g:284:59: (iv_ruleBlockstateProperty= ruleBlockstateProperty EOF )
            // InternalMcblockstate.g:285:2: iv_ruleBlockstateProperty= ruleBlockstateProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockstatePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockstateProperty=ruleBlockstateProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockstateProperty; 
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
    // $ANTLR end "entryRuleBlockstateProperty"


    // $ANTLR start "ruleBlockstateProperty"
    // InternalMcblockstate.g:291:1: ruleBlockstateProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleBlockstatePropertyValue ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBlockstatePropertyValue ) ) ) ;
    public final EObject ruleBlockstateProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:297:2: ( ( ( (lv_name_0_0= ruleBlockstatePropertyValue ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBlockstatePropertyValue ) ) ) )
            // InternalMcblockstate.g:298:2: ( ( (lv_name_0_0= ruleBlockstatePropertyValue ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBlockstatePropertyValue ) ) )
            {
            // InternalMcblockstate.g:298:2: ( ( (lv_name_0_0= ruleBlockstatePropertyValue ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBlockstatePropertyValue ) ) )
            // InternalMcblockstate.g:299:3: ( (lv_name_0_0= ruleBlockstatePropertyValue ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBlockstatePropertyValue ) )
            {
            // InternalMcblockstate.g:299:3: ( (lv_name_0_0= ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:300:4: (lv_name_0_0= ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:300:4: (lv_name_0_0= ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:301:5: lv_name_0_0= ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockstatePropertyAccess().getNameBlockstatePropertyValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockstatePropertyRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockstatePropertyAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMcblockstate.g:322:3: ( (lv_value_2_0= ruleBlockstatePropertyValue ) )
            // InternalMcblockstate.g:323:4: (lv_value_2_0= ruleBlockstatePropertyValue )
            {
            // InternalMcblockstate.g:323:4: (lv_value_2_0= ruleBlockstatePropertyValue )
            // InternalMcblockstate.g:324:5: lv_value_2_0= ruleBlockstatePropertyValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockstatePropertyAccess().getValueBlockstatePropertyValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockstatePropertyRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
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
    // $ANTLR end "ruleBlockstateProperty"


    // $ANTLR start "entryRuleMultipartBlockstate"
    // InternalMcblockstate.g:345:1: entryRuleMultipartBlockstate returns [EObject current=null] : iv_ruleMultipartBlockstate= ruleMultipartBlockstate EOF ;
    public final EObject entryRuleMultipartBlockstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipartBlockstate = null;


        try {
            // InternalMcblockstate.g:345:60: (iv_ruleMultipartBlockstate= ruleMultipartBlockstate EOF )
            // InternalMcblockstate.g:346:2: iv_ruleMultipartBlockstate= ruleMultipartBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipartBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultipartBlockstate=ruleMultipartBlockstate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipartBlockstate; 
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
    // $ANTLR end "entryRuleMultipartBlockstate"


    // $ANTLR start "ruleMultipartBlockstate"
    // InternalMcblockstate.g:352:1: ruleMultipartBlockstate returns [EObject current=null] : ( (lv_cases_0_0= ruleCase ) )+ ;
    public final EObject ruleMultipartBlockstate() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:358:2: ( ( (lv_cases_0_0= ruleCase ) )+ )
            // InternalMcblockstate.g:359:2: ( (lv_cases_0_0= ruleCase ) )+
            {
            // InternalMcblockstate.g:359:2: ( (lv_cases_0_0= ruleCase ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMcblockstate.g:360:3: (lv_cases_0_0= ruleCase )
            	    {
            	    // InternalMcblockstate.g:360:3: (lv_cases_0_0= ruleCase )
            	    // InternalMcblockstate.g:361:4: lv_cases_0_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMultipartBlockstateAccess().getCasesCaseParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_cases_0_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getMultipartBlockstateRule());
            	      				}
            	      				add(
            	      					current,
            	      					"cases",
            	      					lv_cases_0_0,
            	      					"com.raptor.mcblockstate.Mcblockstate.Case");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

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
    // $ANTLR end "ruleMultipartBlockstate"


    // $ANTLR start "entryRuleCase"
    // InternalMcblockstate.g:381:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalMcblockstate.g:381:45: (iv_ruleCase= ruleCase EOF )
            // InternalMcblockstate.g:382:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMcblockstate.g:388:1: ruleCase returns [EObject current=null] : ( (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )? otherlv_4= 'apply' ( (lv_models_5_0= ruleModelList ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_condition_2_0 = null;

        EObject lv_models_5_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:394:2: ( ( (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )? otherlv_4= 'apply' ( (lv_models_5_0= ruleModelList ) ) ) )
            // InternalMcblockstate.g:395:2: ( (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )? otherlv_4= 'apply' ( (lv_models_5_0= ruleModelList ) ) )
            {
            // InternalMcblockstate.g:395:2: ( (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )? otherlv_4= 'apply' ( (lv_models_5_0= ruleModelList ) ) )
            // InternalMcblockstate.g:396:3: (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )? otherlv_4= 'apply' ( (lv_models_5_0= ruleModelList ) )
            {
            // InternalMcblockstate.g:396:3: (otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMcblockstate.g:397:4: otherlv_0= 'when' otherlv_1= '(' ( (lv_condition_2_0= ruleCaseCondition ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalMcblockstate.g:405:4: ( (lv_condition_2_0= ruleCaseCondition ) )
                    // InternalMcblockstate.g:406:5: (lv_condition_2_0= ruleCaseCondition )
                    {
                    // InternalMcblockstate.g:406:5: (lv_condition_2_0= ruleCaseCondition )
                    // InternalMcblockstate.g:407:6: lv_condition_2_0= ruleCaseCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCaseAccess().getConditionCaseConditionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_condition_2_0=ruleCaseCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCaseRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_2_0,
                      							"com.raptor.mcblockstate.Mcblockstate.CaseCondition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getApplyKeyword_1());
              		
            }
            // InternalMcblockstate.g:433:3: ( (lv_models_5_0= ruleModelList ) )
            // InternalMcblockstate.g:434:4: (lv_models_5_0= ruleModelList )
            {
            // InternalMcblockstate.g:434:4: (lv_models_5_0= ruleModelList )
            // InternalMcblockstate.g:435:5: lv_models_5_0= ruleModelList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseAccess().getModelsModelListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_models_5_0=ruleModelList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseRule());
              					}
              					set(
              						current,
              						"models",
              						lv_models_5_0,
              						"com.raptor.mcblockstate.Mcblockstate.ModelList");
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCaseCondition"
    // InternalMcblockstate.g:456:1: entryRuleCaseCondition returns [EObject current=null] : iv_ruleCaseCondition= ruleCaseCondition EOF ;
    public final EObject entryRuleCaseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseCondition = null;


        try {
            // InternalMcblockstate.g:456:54: (iv_ruleCaseCondition= ruleCaseCondition EOF )
            // InternalMcblockstate.g:457:2: iv_ruleCaseCondition= ruleCaseCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseCondition=ruleCaseCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseCondition; 
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
    // $ANTLR end "entryRuleCaseCondition"


    // $ANTLR start "ruleCaseCondition"
    // InternalMcblockstate.g:463:1: ruleCaseCondition returns [EObject current=null] : (this_BaseCaseCondition_0= ruleBaseCaseCondition ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )? ) ;
    public final EObject ruleCaseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_BaseCaseCondition_0 = null;

        EObject lv_options_3_0 = null;

        EObject lv_options_5_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:469:2: ( (this_BaseCaseCondition_0= ruleBaseCaseCondition ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )? ) )
            // InternalMcblockstate.g:470:2: (this_BaseCaseCondition_0= ruleBaseCaseCondition ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )? )
            {
            // InternalMcblockstate.g:470:2: (this_BaseCaseCondition_0= ruleBaseCaseCondition ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )? )
            // InternalMcblockstate.g:471:3: this_BaseCaseCondition_0= ruleBaseCaseCondition ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCaseConditionAccess().getBaseCaseConditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_BaseCaseCondition_0=ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BaseCaseCondition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMcblockstate.g:479:3: ( ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) && (synpred3_InternalMcblockstate())) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMcblockstate.g:480:4: ( '|' )=> (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* )
                    {
                    // InternalMcblockstate.g:481:4: (otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )* )
                    // InternalMcblockstate.g:482:5: otherlv_1= '|' () ( (lv_options_3_0= ruleBaseCaseCondition ) ) (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )*
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_0());
                      				
                    }
                    // InternalMcblockstate.g:486:5: ()
                    // InternalMcblockstate.g:487:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getCaseConditionAccess().getOrCaseConditionOptionsAction_1_0_1(),
                      							current);
                      					
                    }

                    }

                    // InternalMcblockstate.g:493:5: ( (lv_options_3_0= ruleBaseCaseCondition ) )
                    // InternalMcblockstate.g:494:6: (lv_options_3_0= ruleBaseCaseCondition )
                    {
                    // InternalMcblockstate.g:494:6: (lv_options_3_0= ruleBaseCaseCondition )
                    // InternalMcblockstate.g:495:7: lv_options_3_0= ruleBaseCaseCondition
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_options_3_0=ruleBaseCaseCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCaseConditionRule());
                      							}
                      							add(
                      								current,
                      								"options",
                      								lv_options_3_0,
                      								"com.raptor.mcblockstate.Mcblockstate.BaseCaseCondition");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMcblockstate.g:512:5: (otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMcblockstate.g:513:6: otherlv_4= '|' ( (lv_options_5_0= ruleBaseCaseCondition ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCaseConditionAccess().getVerticalLineKeyword_1_0_3_0());
                    	      					
                    	    }
                    	    // InternalMcblockstate.g:517:6: ( (lv_options_5_0= ruleBaseCaseCondition ) )
                    	    // InternalMcblockstate.g:518:7: (lv_options_5_0= ruleBaseCaseCondition )
                    	    {
                    	    // InternalMcblockstate.g:518:7: (lv_options_5_0= ruleBaseCaseCondition )
                    	    // InternalMcblockstate.g:519:8: lv_options_5_0= ruleBaseCaseCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCaseConditionAccess().getOptionsBaseCaseConditionParserRuleCall_1_0_3_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_options_5_0=ruleBaseCaseCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getCaseConditionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"options",
                    	      									lv_options_5_0,
                    	      									"com.raptor.mcblockstate.Mcblockstate.BaseCaseCondition");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


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
    // $ANTLR end "ruleCaseCondition"


    // $ANTLR start "entryRuleBaseCaseCondition"
    // InternalMcblockstate.g:543:1: entryRuleBaseCaseCondition returns [EObject current=null] : iv_ruleBaseCaseCondition= ruleBaseCaseCondition EOF ;
    public final EObject entryRuleBaseCaseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseCaseCondition = null;


        try {
            // InternalMcblockstate.g:543:58: (iv_ruleBaseCaseCondition= ruleBaseCaseCondition EOF )
            // InternalMcblockstate.g:544:2: iv_ruleBaseCaseCondition= ruleBaseCaseCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseCaseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseCaseCondition=ruleBaseCaseCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseCaseCondition; 
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
    // $ANTLR end "entryRuleBaseCaseCondition"


    // $ANTLR start "ruleBaseCaseCondition"
    // InternalMcblockstate.g:550:1: ruleBaseCaseCondition returns [EObject current=null] : ( (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' ) | ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* ) ) ;
    public final EObject ruleBaseCaseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_CaseCondition_1 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:556:2: ( ( (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' ) | ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* ) ) )
            // InternalMcblockstate.g:557:2: ( (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' ) | ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* ) )
            {
            // InternalMcblockstate.g:557:2: ( (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' ) | ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_SLONG)||LA12_0==16||LA12_0==23||LA12_0==26||(LA12_0>=30 && LA12_0<=38)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMcblockstate.g:558:3: (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' )
                    {
                    // InternalMcblockstate.g:558:3: (otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')' )
                    // InternalMcblockstate.g:559:4: otherlv_0= '(' this_CaseCondition_1= ruleCaseCondition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getBaseCaseConditionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseCaseConditionAccess().getCaseConditionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_CaseCondition_1=ruleCaseCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CaseCondition_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBaseCaseConditionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:577:3: ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* )
                    {
                    // InternalMcblockstate.g:577:3: ( () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )* )
                    // InternalMcblockstate.g:578:4: () ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) ) (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )*
                    {
                    // InternalMcblockstate.g:578:4: ()
                    // InternalMcblockstate.g:579:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBaseCaseConditionAccess().getBaseCaseConditionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMcblockstate.g:585:4: ( (lv_properties_4_0= ruleBlockstatePropertyPredicate ) )
                    // InternalMcblockstate.g:586:5: (lv_properties_4_0= ruleBlockstatePropertyPredicate )
                    {
                    // InternalMcblockstate.g:586:5: (lv_properties_4_0= ruleBlockstatePropertyPredicate )
                    // InternalMcblockstate.g:587:6: lv_properties_4_0= ruleBlockstatePropertyPredicate
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_properties_4_0=ruleBlockstatePropertyPredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBaseCaseConditionRule());
                      						}
                      						add(
                      							current,
                      							"properties",
                      							lv_properties_4_0,
                      							"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyPredicate");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMcblockstate.g:604:4: (otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMcblockstate.g:605:5: otherlv_5= '&' ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getBaseCaseConditionAccess().getAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalMcblockstate.g:609:5: ( (lv_properties_6_0= ruleBlockstatePropertyPredicate ) )
                    	    // InternalMcblockstate.g:610:6: (lv_properties_6_0= ruleBlockstatePropertyPredicate )
                    	    {
                    	    // InternalMcblockstate.g:610:6: (lv_properties_6_0= ruleBlockstatePropertyPredicate )
                    	    // InternalMcblockstate.g:611:7: lv_properties_6_0= ruleBlockstatePropertyPredicate
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBaseCaseConditionAccess().getPropertiesBlockstatePropertyPredicateParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_properties_6_0=ruleBlockstatePropertyPredicate();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBaseCaseConditionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"properties",
                    	      								lv_properties_6_0,
                    	      								"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyPredicate");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end "ruleBaseCaseCondition"


    // $ANTLR start "entryRuleBlockstatePropertyPredicate"
    // InternalMcblockstate.g:634:1: entryRuleBlockstatePropertyPredicate returns [EObject current=null] : iv_ruleBlockstatePropertyPredicate= ruleBlockstatePropertyPredicate EOF ;
    public final EObject entryRuleBlockstatePropertyPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockstatePropertyPredicate = null;


        try {
            // InternalMcblockstate.g:634:68: (iv_ruleBlockstatePropertyPredicate= ruleBlockstatePropertyPredicate EOF )
            // InternalMcblockstate.g:635:2: iv_ruleBlockstatePropertyPredicate= ruleBlockstatePropertyPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockstatePropertyPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockstatePropertyPredicate=ruleBlockstatePropertyPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockstatePropertyPredicate; 
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
    // $ANTLR end "entryRuleBlockstatePropertyPredicate"


    // $ANTLR start "ruleBlockstatePropertyPredicate"
    // InternalMcblockstate.g:641:1: ruleBlockstatePropertyPredicate returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) ) | ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) ) ) ;
    public final EObject ruleBlockstatePropertyPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_inverted_13_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;

        AntlrDatatypeRuleToken lv_values_9_0 = null;

        AntlrDatatypeRuleToken lv_name_14_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:647:2: ( ( ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) ) | ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) ) ) )
            // InternalMcblockstate.g:648:2: ( ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) ) | ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) ) )
            {
            // InternalMcblockstate.g:648:2: ( ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) ) | ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalMcblockstate.g:649:3: ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) )
                    {
                    // InternalMcblockstate.g:649:3: ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) )
                    // InternalMcblockstate.g:650:4: () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) )
                    {
                    // InternalMcblockstate.g:650:4: ()
                    // InternalMcblockstate.g:651:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBlockstatePropertyPredicateAccess().getNormalBlockstatePropertyPredicateAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMcblockstate.g:657:4: ( (lv_name_1_0= ruleBlockstatePropertyValue ) )
                    // InternalMcblockstate.g:658:5: (lv_name_1_0= ruleBlockstatePropertyValue )
                    {
                    // InternalMcblockstate.g:658:5: (lv_name_1_0= ruleBlockstatePropertyValue )
                    // InternalMcblockstate.g:659:6: lv_name_1_0= ruleBlockstatePropertyValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_name_1_0=ruleBlockstatePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockstatePropertyPredicateRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMcblockstate.g:676:4: ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) )
                    // InternalMcblockstate.g:677:5: ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) )
                    {
                    // InternalMcblockstate.g:678:5: ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==22||LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMcblockstate.g:679:6: ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) )
                            {
                            // InternalMcblockstate.g:679:6: ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) )
                            // InternalMcblockstate.g:680:7: (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) )
                            {
                            // InternalMcblockstate.g:680:7: (otherlv_2= '=' | otherlv_3= '==' )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==22) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==29) ) {
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
                                    // InternalMcblockstate.g:681:8: otherlv_2= '='
                                    {
                                    otherlv_2=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_2, grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignKeyword_0_2_0_0_0_0());
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalMcblockstate.g:686:8: otherlv_3= '=='
                                    {
                                    otherlv_3=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_3, grammarAccess.getBlockstatePropertyPredicateAccess().getEqualsSignEqualsSignKeyword_0_2_0_0_0_1());
                                      							
                                    }

                                    }
                                    break;

                            }

                            // InternalMcblockstate.g:691:7: ( (lv_values_4_0= ruleBlockstatePropertyValue ) )
                            // InternalMcblockstate.g:692:8: (lv_values_4_0= ruleBlockstatePropertyValue )
                            {
                            // InternalMcblockstate.g:692:8: (lv_values_4_0= ruleBlockstatePropertyValue )
                            // InternalMcblockstate.g:693:9: lv_values_4_0= ruleBlockstatePropertyValue
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_2);
                            lv_values_4_0=ruleBlockstatePropertyValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getBlockstatePropertyPredicateRule());
                              									}
                              									add(
                              										current,
                              										"values",
                              										lv_values_4_0,
                              										"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMcblockstate.g:712:6: (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' )
                            {
                            // InternalMcblockstate.g:712:6: (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' )
                            // InternalMcblockstate.g:713:7: otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')'
                            {
                            otherlv_5=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_5, grammarAccess.getBlockstatePropertyPredicateAccess().getInKeyword_0_2_0_1_0());
                              						
                            }
                            otherlv_6=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_6, grammarAccess.getBlockstatePropertyPredicateAccess().getLeftParenthesisKeyword_0_2_0_1_1());
                              						
                            }
                            // InternalMcblockstate.g:721:7: ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_SLONG)||LA16_0==16||LA16_0==23||LA16_0==26||LA16_0==30||(LA16_0>=32 && LA16_0<=38)) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalMcblockstate.g:722:8: ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )?
                                    {
                                    // InternalMcblockstate.g:722:8: ( (lv_values_7_0= ruleBlockstatePropertyValue ) )
                                    // InternalMcblockstate.g:723:9: (lv_values_7_0= ruleBlockstatePropertyValue )
                                    {
                                    // InternalMcblockstate.g:723:9: (lv_values_7_0= ruleBlockstatePropertyValue )
                                    // InternalMcblockstate.g:724:10: lv_values_7_0= ruleBlockstatePropertyValue
                                    {
                                    if ( state.backtracking==0 ) {

                                      										newCompositeNode(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_0_0());
                                      									
                                    }
                                    pushFollow(FOLLOW_20);
                                    lv_values_7_0=ruleBlockstatePropertyValue();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      										if (current==null) {
                                      											current = createModelElementForParent(grammarAccess.getBlockstatePropertyPredicateRule());
                                      										}
                                      										add(
                                      											current,
                                      											"values",
                                      											lv_values_7_0,
                                      											"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
                                      										afterParserOrEnumRuleCall();
                                      									
                                    }

                                    }


                                    }

                                    // InternalMcblockstate.g:741:8: (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )*
                                    loop14:
                                    do {
                                        int alt14=2;
                                        int LA14_0 = input.LA(1);

                                        if ( (LA14_0==20) ) {
                                            int LA14_1 = input.LA(2);

                                            if ( ((LA14_1>=RULE_ID && LA14_1<=RULE_SLONG)||LA14_1==16||LA14_1==23||LA14_1==26||LA14_1==30||(LA14_1>=32 && LA14_1<=38)) ) {
                                                alt14=1;
                                            }


                                        }


                                        switch (alt14) {
                                    	case 1 :
                                    	    // InternalMcblockstate.g:742:9: otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) )
                                    	    {
                                    	    otherlv_8=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									newLeafNode(otherlv_8, grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_1_0());
                                    	      								
                                    	    }
                                    	    // InternalMcblockstate.g:746:9: ( (lv_values_9_0= ruleBlockstatePropertyValue ) )
                                    	    // InternalMcblockstate.g:747:10: (lv_values_9_0= ruleBlockstatePropertyValue )
                                    	    {
                                    	    // InternalMcblockstate.g:747:10: (lv_values_9_0= ruleBlockstatePropertyValue )
                                    	    // InternalMcblockstate.g:748:11: lv_values_9_0= ruleBlockstatePropertyValue
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      											newCompositeNode(grammarAccess.getBlockstatePropertyPredicateAccess().getValuesBlockstatePropertyValueParserRuleCall_0_2_0_1_2_1_1_0());
                                    	      										
                                    	    }
                                    	    pushFollow(FOLLOW_20);
                                    	    lv_values_9_0=ruleBlockstatePropertyValue();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      											if (current==null) {
                                    	      												current = createModelElementForParent(grammarAccess.getBlockstatePropertyPredicateRule());
                                    	      											}
                                    	      											add(
                                    	      												current,
                                    	      												"values",
                                    	      												lv_values_9_0,
                                    	      												"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
                                    	      											afterParserOrEnumRuleCall();
                                    	      										
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop14;
                                        }
                                    } while (true);

                                    // InternalMcblockstate.g:766:8: (otherlv_10= ',' )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0==20) ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // InternalMcblockstate.g:767:9: otherlv_10= ','
                                            {
                                            otherlv_10=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              									newLeafNode(otherlv_10, grammarAccess.getBlockstatePropertyPredicateAccess().getCommaKeyword_0_2_0_1_2_2());
                                              								
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_11, grammarAccess.getBlockstatePropertyPredicateAccess().getRightParenthesisKeyword_0_2_0_1_3());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:782:3: ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) )
                    {
                    // InternalMcblockstate.g:782:3: ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) )
                    // InternalMcblockstate.g:783:4: () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) )
                    {
                    // InternalMcblockstate.g:783:4: ()
                    // InternalMcblockstate.g:784:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBlockstatePropertyPredicateAccess().getBooleanBlockstatePropertyPredicateAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMcblockstate.g:790:4: ( (lv_inverted_13_0= '!' ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMcblockstate.g:791:5: (lv_inverted_13_0= '!' )
                            {
                            // InternalMcblockstate.g:791:5: (lv_inverted_13_0= '!' )
                            // InternalMcblockstate.g:792:6: lv_inverted_13_0= '!'
                            {
                            lv_inverted_13_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_inverted_13_0, grammarAccess.getBlockstatePropertyPredicateAccess().getInvertedExclamationMarkKeyword_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getBlockstatePropertyPredicateRule());
                              						}
                              						setWithLastConsumed(current, "inverted", true, "!");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMcblockstate.g:804:4: ( (lv_name_14_0= ruleBlockstatePropertyValue ) )
                    // InternalMcblockstate.g:805:5: (lv_name_14_0= ruleBlockstatePropertyValue )
                    {
                    // InternalMcblockstate.g:805:5: (lv_name_14_0= ruleBlockstatePropertyValue )
                    // InternalMcblockstate.g:806:6: lv_name_14_0= ruleBlockstatePropertyValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockstatePropertyPredicateAccess().getNameBlockstatePropertyValueParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_14_0=ruleBlockstatePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockstatePropertyPredicateRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_14_0,
                      							"com.raptor.mcblockstate.Mcblockstate.BlockstatePropertyValue");
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
    // $ANTLR end "ruleBlockstatePropertyPredicate"


    // $ANTLR start "entryRuleCustomBlockstate"
    // InternalMcblockstate.g:828:1: entryRuleCustomBlockstate returns [EObject current=null] : iv_ruleCustomBlockstate= ruleCustomBlockstate EOF ;
    public final EObject entryRuleCustomBlockstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomBlockstate = null;


        try {
            // InternalMcblockstate.g:828:57: (iv_ruleCustomBlockstate= ruleCustomBlockstate EOF )
            // InternalMcblockstate.g:829:2: iv_ruleCustomBlockstate= ruleCustomBlockstate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomBlockstateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCustomBlockstate=ruleCustomBlockstate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomBlockstate; 
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
    // $ANTLR end "entryRuleCustomBlockstate"


    // $ANTLR start "ruleCustomBlockstate"
    // InternalMcblockstate.g:835:1: ruleCustomBlockstate returns [EObject current=null] : ( (lv_json_0_0= ruleMCJsonObject ) ) ;
    public final EObject ruleCustomBlockstate() throws RecognitionException {
        EObject current = null;

        EObject lv_json_0_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:841:2: ( ( (lv_json_0_0= ruleMCJsonObject ) ) )
            // InternalMcblockstate.g:842:2: ( (lv_json_0_0= ruleMCJsonObject ) )
            {
            // InternalMcblockstate.g:842:2: ( (lv_json_0_0= ruleMCJsonObject ) )
            // InternalMcblockstate.g:843:3: (lv_json_0_0= ruleMCJsonObject )
            {
            // InternalMcblockstate.g:843:3: (lv_json_0_0= ruleMCJsonObject )
            // InternalMcblockstate.g:844:4: lv_json_0_0= ruleMCJsonObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCustomBlockstateAccess().getJsonMCJsonObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_json_0_0=ruleMCJsonObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getCustomBlockstateRule());
              				}
              				set(
              					current,
              					"json",
              					lv_json_0_0,
              					"com.raptor.mcblockstate.Mcblockstate.MCJsonObject");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleCustomBlockstate"


    // $ANTLR start "entryRuleBlockstatePropertyValue"
    // InternalMcblockstate.g:864:1: entryRuleBlockstatePropertyValue returns [String current=null] : iv_ruleBlockstatePropertyValue= ruleBlockstatePropertyValue EOF ;
    public final String entryRuleBlockstatePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockstatePropertyValue = null;


        try {
            // InternalMcblockstate.g:864:63: (iv_ruleBlockstatePropertyValue= ruleBlockstatePropertyValue EOF )
            // InternalMcblockstate.g:865:2: iv_ruleBlockstatePropertyValue= ruleBlockstatePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockstatePropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockstatePropertyValue=ruleBlockstatePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockstatePropertyValue.getText(); 
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
    // $ANTLR end "entryRuleBlockstatePropertyValue"


    // $ANTLR start "ruleBlockstatePropertyValue"
    // InternalMcblockstate.g:871:1: ruleBlockstatePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' | kw= 'null' | kw= 'variants' | kw= 'multipart' | kw= 'in' | kw= 'when' | kw= 'apply' | kw= 'x' | kw= 'y' | kw= 'uvlock' | this_ID_11= RULE_ID | this_STRING_12= RULE_STRING | this_DOUBLE_13= RULE_DOUBLE | this_LONG_14= ruleLONG ) ;
    public final AntlrDatatypeRuleToken ruleBlockstatePropertyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_11=null;
        Token this_STRING_12=null;
        Token this_DOUBLE_13=null;
        AntlrDatatypeRuleToken this_LONG_14 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:877:2: ( (kw= 'true' | kw= 'false' | kw= 'null' | kw= 'variants' | kw= 'multipart' | kw= 'in' | kw= 'when' | kw= 'apply' | kw= 'x' | kw= 'y' | kw= 'uvlock' | this_ID_11= RULE_ID | this_STRING_12= RULE_STRING | this_DOUBLE_13= RULE_DOUBLE | this_LONG_14= ruleLONG ) )
            // InternalMcblockstate.g:878:2: (kw= 'true' | kw= 'false' | kw= 'null' | kw= 'variants' | kw= 'multipart' | kw= 'in' | kw= 'when' | kw= 'apply' | kw= 'x' | kw= 'y' | kw= 'uvlock' | this_ID_11= RULE_ID | this_STRING_12= RULE_STRING | this_DOUBLE_13= RULE_DOUBLE | this_LONG_14= ruleLONG )
            {
            // InternalMcblockstate.g:878:2: (kw= 'true' | kw= 'false' | kw= 'null' | kw= 'variants' | kw= 'multipart' | kw= 'in' | kw= 'when' | kw= 'apply' | kw= 'x' | kw= 'y' | kw= 'uvlock' | this_ID_11= RULE_ID | this_STRING_12= RULE_STRING | this_DOUBLE_13= RULE_DOUBLE | this_LONG_14= ruleLONG )
            int alt20=15;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            case 16:
                {
                alt20=4;
                }
                break;
            case 35:
                {
                alt20=5;
                }
                break;
            case 30:
                {
                alt20=6;
                }
                break;
            case 23:
                {
                alt20=7;
                }
                break;
            case 26:
                {
                alt20=8;
                }
                break;
            case 36:
                {
                alt20=9;
                }
                break;
            case 37:
                {
                alt20=10;
                }
                break;
            case 38:
                {
                alt20=11;
                }
                break;
            case RULE_ID:
                {
                alt20=12;
                }
                break;
            case RULE_STRING:
                {
                alt20=13;
                }
                break;
            case RULE_DOUBLE:
                {
                alt20=14;
                }
                break;
            case RULE_ULONG:
            case RULE_SLONG:
                {
                alt20=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMcblockstate.g:879:3: kw= 'true'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:885:3: kw= 'false'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:891:3: kw= 'null'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getNullKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:897:3: kw= 'variants'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getVariantsKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:903:3: kw= 'multipart'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getMultipartKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:909:3: kw= 'in'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getInKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMcblockstate.g:915:3: kw= 'when'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getWhenKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMcblockstate.g:921:3: kw= 'apply'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getApplyKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMcblockstate.g:927:3: kw= 'x'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getXKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMcblockstate.g:933:3: kw= 'y'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getYKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalMcblockstate.g:939:3: kw= 'uvlock'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBlockstatePropertyValueAccess().getUvlockKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalMcblockstate.g:945:3: this_ID_11= RULE_ID
                    {
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_11, grammarAccess.getBlockstatePropertyValueAccess().getIDTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalMcblockstate.g:953:3: this_STRING_12= RULE_STRING
                    {
                    this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_12, grammarAccess.getBlockstatePropertyValueAccess().getSTRINGTerminalRuleCall_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalMcblockstate.g:961:3: this_DOUBLE_13= RULE_DOUBLE
                    {
                    this_DOUBLE_13=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DOUBLE_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DOUBLE_13, grammarAccess.getBlockstatePropertyValueAccess().getDOUBLETerminalRuleCall_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalMcblockstate.g:969:3: this_LONG_14= ruleLONG
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockstatePropertyValueAccess().getLONGParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LONG_14=ruleLONG();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LONG_14);
                      		
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
    // $ANTLR end "ruleBlockstatePropertyValue"


    // $ANTLR start "entryRuleModelList"
    // InternalMcblockstate.g:983:1: entryRuleModelList returns [EObject current=null] : iv_ruleModelList= ruleModelList EOF ;
    public final EObject entryRuleModelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelList = null;


        try {
            // InternalMcblockstate.g:983:50: (iv_ruleModelList= ruleModelList EOF )
            // InternalMcblockstate.g:984:2: iv_ruleModelList= ruleModelList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelList=ruleModelList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelList; 
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
    // $ANTLR end "entryRuleModelList"


    // $ANTLR start "ruleModelList"
    // InternalMcblockstate.g:990:1: ruleModelList returns [EObject current=null] : ( (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) ) | ( (lv_models_4_0= ruleModel ) ) ) ;
    public final EObject ruleModelList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_models_2_0 = null;

        EObject lv_models_4_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:996:2: ( ( (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) ) | ( (lv_models_4_0= ruleModel ) ) ) )
            // InternalMcblockstate.g:997:2: ( (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) ) | ( (lv_models_4_0= ruleModel ) ) )
            {
            // InternalMcblockstate.g:997:2: ( (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) ) | ( (lv_models_4_0= ruleModel ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID||LA22_0==16||LA22_0==23||LA22_0==26||(LA22_0>=32 && LA22_0<=35)||LA22_0==38) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMcblockstate.g:998:3: (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) )
                    {
                    // InternalMcblockstate.g:998:3: (otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' ) )
                    // InternalMcblockstate.g:999:4: otherlv_0= '{' () ( (lv_models_2_0= ruleModel ) )* ( ( '}' )=>otherlv_3= '}' )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getModelListAccess().getLeftCurlyBracketKeyword_0_0());
                      			
                    }
                    // InternalMcblockstate.g:1003:4: ()
                    // InternalMcblockstate.g:1004:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getModelListAccess().getModelListAction_0_1(),
                      						current);
                      				
                    }

                    }

                    // InternalMcblockstate.g:1010:4: ( (lv_models_2_0= ruleModel ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==16||LA21_0==23||LA21_0==26||(LA21_0>=32 && LA21_0<=35)||LA21_0==38) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMcblockstate.g:1011:5: (lv_models_2_0= ruleModel )
                    	    {
                    	    // InternalMcblockstate.g:1011:5: (lv_models_2_0= ruleModel )
                    	    // InternalMcblockstate.g:1012:6: lv_models_2_0= ruleModel
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_0_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_models_2_0=ruleModel();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModelListRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"models",
                    	      							lv_models_2_0,
                    	      							"com.raptor.mcblockstate.Mcblockstate.Model");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // InternalMcblockstate.g:1029:4: ( ( '}' )=>otherlv_3= '}' )
                    // InternalMcblockstate.g:1030:5: ( '}' )=>otherlv_3= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getModelListAccess().getRightCurlyBracketKeyword_0_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1038:3: ( (lv_models_4_0= ruleModel ) )
                    {
                    // InternalMcblockstate.g:1038:3: ( (lv_models_4_0= ruleModel ) )
                    // InternalMcblockstate.g:1039:4: (lv_models_4_0= ruleModel )
                    {
                    // InternalMcblockstate.g:1039:4: (lv_models_4_0= ruleModel )
                    // InternalMcblockstate.g:1040:5: lv_models_4_0= ruleModel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelListAccess().getModelsModelParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_models_4_0=ruleModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelListRule());
                      					}
                      					add(
                      						current,
                      						"models",
                      						lv_models_4_0,
                      						"com.raptor.mcblockstate.Mcblockstate.Model");
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
    // $ANTLR end "ruleModelList"


    // $ANTLR start "entryRuleModel"
    // InternalMcblockstate.g:1061:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMcblockstate.g:1061:46: (iv_ruleModel= ruleModel EOF )
            // InternalMcblockstate.g:1062:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMcblockstate.g:1068:1: ruleModel returns [EObject current=null] : ( ( (lv_location_0_0= ruleNamespacedLocation ) ) ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )? ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_weightDefined_1_0=null;
        Token lv_weight_2_0=null;
        Token otherlv_3=null;
        Token lv_xDefined_5_0=null;
        Token otherlv_6=null;
        Token lv_yDefined_8_0=null;
        Token otherlv_9=null;
        Token lv_uvlockDefined_11_0=null;
        Token otherlv_12=null;
        Token lv_uvlock_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_location_0_0 = null;

        AntlrDatatypeRuleToken lv_x_7_0 = null;

        AntlrDatatypeRuleToken lv_y_10_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1074:2: ( ( ( (lv_location_0_0= ruleNamespacedLocation ) ) ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )? ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )? ) )
            // InternalMcblockstate.g:1075:2: ( ( (lv_location_0_0= ruleNamespacedLocation ) ) ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )? ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )? )
            {
            // InternalMcblockstate.g:1075:2: ( ( (lv_location_0_0= ruleNamespacedLocation ) ) ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )? ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )? )
            // InternalMcblockstate.g:1076:3: ( (lv_location_0_0= ruleNamespacedLocation ) ) ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )? ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )?
            {
            // InternalMcblockstate.g:1076:3: ( (lv_location_0_0= ruleNamespacedLocation ) )
            // InternalMcblockstate.g:1077:4: (lv_location_0_0= ruleNamespacedLocation )
            {
            // InternalMcblockstate.g:1077:4: (lv_location_0_0= ruleNamespacedLocation )
            // InternalMcblockstate.g:1078:5: lv_location_0_0= ruleNamespacedLocation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getLocationNamespacedLocationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_location_0_0=ruleNamespacedLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"location",
              						lv_location_0_0,
              						"com.raptor.mcblockstate.Mcblockstate.NamespacedLocation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMcblockstate.g:1095:3: ( ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) && (synpred6_InternalMcblockstate())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMcblockstate.g:1096:4: ( '*' )=> ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) )
                    {
                    // InternalMcblockstate.g:1097:4: ( ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) ) )
                    // InternalMcblockstate.g:1098:5: ( (lv_weightDefined_1_0= '*' ) ) ( (lv_weight_2_0= RULE_ULONG ) )
                    {
                    // InternalMcblockstate.g:1098:5: ( (lv_weightDefined_1_0= '*' ) )
                    // InternalMcblockstate.g:1099:6: (lv_weightDefined_1_0= '*' )
                    {
                    // InternalMcblockstate.g:1099:6: (lv_weightDefined_1_0= '*' )
                    // InternalMcblockstate.g:1100:7: lv_weightDefined_1_0= '*'
                    {
                    lv_weightDefined_1_0=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_weightDefined_1_0, grammarAccess.getModelAccess().getWeightDefinedAsteriskKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getModelRule());
                      							}
                      							setWithLastConsumed(current, "weightDefined", true, "*");
                      						
                    }

                    }


                    }

                    // InternalMcblockstate.g:1112:5: ( (lv_weight_2_0= RULE_ULONG ) )
                    // InternalMcblockstate.g:1113:6: (lv_weight_2_0= RULE_ULONG )
                    {
                    // InternalMcblockstate.g:1113:6: (lv_weight_2_0= RULE_ULONG )
                    // InternalMcblockstate.g:1114:7: lv_weight_2_0= RULE_ULONG
                    {
                    lv_weight_2_0=(Token)match(input,RULE_ULONG,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_weight_2_0, grammarAccess.getModelAccess().getWeightULONGTerminalRuleCall_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getModelRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"weight",
                      								lv_weight_2_0,
                      								"com.raptor.mcblockstate.Mcblockstate.ULONG");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMcblockstate.g:1132:3: ( ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) && (synpred7_InternalMcblockstate())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMcblockstate.g:1133:4: ( '(' )=> (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' )
                    {
                    // InternalMcblockstate.g:1134:4: (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')' )
                    // InternalMcblockstate.g:1135:5: otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) ) otherlv_15= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalMcblockstate.g:1139:5: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) ) )
                    // InternalMcblockstate.g:1140:6: ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) )
                    {
                    // InternalMcblockstate.g:1140:6: ( ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* ) )
                    // InternalMcblockstate.g:1141:7: ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());
                    // InternalMcblockstate.g:1144:7: ( ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )* )
                    // InternalMcblockstate.g:1145:8: ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )*
                    {
                    // InternalMcblockstate.g:1145:8: ( ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) ) )*
                    loop25:
                    do {
                        int alt25=4;
                        int LA25_0 = input.LA(1);

                        if ( LA25_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                            alt25=1;
                        }
                        else if ( LA25_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                            alt25=2;
                        }
                        else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                            alt25=3;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMcblockstate.g:1146:6: ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) )
                    	    {
                    	    // InternalMcblockstate.g:1146:6: ({...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) ) )
                    	    // InternalMcblockstate.g:1147:7: {...}? => ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0)");
                    	    }
                    	    // InternalMcblockstate.g:1147:108: ( ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) ) )
                    	    // InternalMcblockstate.g:1148:8: ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 0);
                    	    // InternalMcblockstate.g:1151:11: ({...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) ) )
                    	    // InternalMcblockstate.g:1151:12: {...}? => ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "true");
                    	    }
                    	    // InternalMcblockstate.g:1151:21: ( ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) ) )
                    	    // InternalMcblockstate.g:1151:22: ( (lv_xDefined_5_0= 'x' ) ) otherlv_6= '=' ( (lv_x_7_0= ruleLONG ) )
                    	    {
                    	    // InternalMcblockstate.g:1151:22: ( (lv_xDefined_5_0= 'x' ) )
                    	    // InternalMcblockstate.g:1152:12: (lv_xDefined_5_0= 'x' )
                    	    {
                    	    // InternalMcblockstate.g:1152:12: (lv_xDefined_5_0= 'x' )
                    	    // InternalMcblockstate.g:1153:13: lv_xDefined_5_0= 'x'
                    	    {
                    	    lv_xDefined_5_0=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      													newLeafNode(lv_xDefined_5_0, grammarAccess.getModelAccess().getXDefinedXKeyword_2_0_1_0_0_0());
                    	      												
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      													if (current==null) {
                    	      														current = createModelElement(grammarAccess.getModelRule());
                    	      													}
                    	      													setWithLastConsumed(current, "xDefined", true, "x");
                    	      												
                    	    }

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(otherlv_6, grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_0_1());
                    	      										
                    	    }
                    	    // InternalMcblockstate.g:1169:11: ( (lv_x_7_0= ruleLONG ) )
                    	    // InternalMcblockstate.g:1170:12: (lv_x_7_0= ruleLONG )
                    	    {
                    	    // InternalMcblockstate.g:1170:12: (lv_x_7_0= ruleLONG )
                    	    // InternalMcblockstate.g:1171:13: lv_x_7_0= ruleLONG
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      													newCompositeNode(grammarAccess.getModelAccess().getXLONGParserRuleCall_2_0_1_0_2_0());
                    	      												
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_x_7_0=ruleLONG();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      													if (current==null) {
                    	      														current = createModelElementForParent(grammarAccess.getModelRule());
                    	      													}
                    	      													set(
                    	      														current,
                    	      														"x",
                    	      														lv_x_7_0,
                    	      														"com.raptor.mcblockstate.Mcblockstate.LONG");
                    	      													afterParserOrEnumRuleCall();
                    	      												
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMcblockstate.g:1194:6: ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) )
                    	    {
                    	    // InternalMcblockstate.g:1194:6: ({...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) ) )
                    	    // InternalMcblockstate.g:1195:7: {...}? => ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1)");
                    	    }
                    	    // InternalMcblockstate.g:1195:108: ( ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) ) )
                    	    // InternalMcblockstate.g:1196:8: ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 1);
                    	    // InternalMcblockstate.g:1199:11: ({...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) ) )
                    	    // InternalMcblockstate.g:1199:12: {...}? => ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "true");
                    	    }
                    	    // InternalMcblockstate.g:1199:21: ( ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) ) )
                    	    // InternalMcblockstate.g:1199:22: ( (lv_yDefined_8_0= 'y' ) ) otherlv_9= '=' ( (lv_y_10_0= ruleLONG ) )
                    	    {
                    	    // InternalMcblockstate.g:1199:22: ( (lv_yDefined_8_0= 'y' ) )
                    	    // InternalMcblockstate.g:1200:12: (lv_yDefined_8_0= 'y' )
                    	    {
                    	    // InternalMcblockstate.g:1200:12: (lv_yDefined_8_0= 'y' )
                    	    // InternalMcblockstate.g:1201:13: lv_yDefined_8_0= 'y'
                    	    {
                    	    lv_yDefined_8_0=(Token)match(input,37,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      													newLeafNode(lv_yDefined_8_0, grammarAccess.getModelAccess().getYDefinedYKeyword_2_0_1_1_0_0());
                    	      												
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      													if (current==null) {
                    	      														current = createModelElement(grammarAccess.getModelRule());
                    	      													}
                    	      													setWithLastConsumed(current, "yDefined", true, "y");
                    	      												
                    	    }

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(otherlv_9, grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_1_1());
                    	      										
                    	    }
                    	    // InternalMcblockstate.g:1217:11: ( (lv_y_10_0= ruleLONG ) )
                    	    // InternalMcblockstate.g:1218:12: (lv_y_10_0= ruleLONG )
                    	    {
                    	    // InternalMcblockstate.g:1218:12: (lv_y_10_0= ruleLONG )
                    	    // InternalMcblockstate.g:1219:13: lv_y_10_0= ruleLONG
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      													newCompositeNode(grammarAccess.getModelAccess().getYLONGParserRuleCall_2_0_1_1_2_0());
                    	      												
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_y_10_0=ruleLONG();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      													if (current==null) {
                    	      														current = createModelElementForParent(grammarAccess.getModelRule());
                    	      													}
                    	      													set(
                    	      														current,
                    	      														"y",
                    	      														lv_y_10_0,
                    	      														"com.raptor.mcblockstate.Mcblockstate.LONG");
                    	      													afterParserOrEnumRuleCall();
                    	      												
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMcblockstate.g:1242:6: ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) )
                    	    {
                    	    // InternalMcblockstate.g:1242:6: ({...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) ) )
                    	    // InternalMcblockstate.g:1243:7: {...}? => ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2)");
                    	    }
                    	    // InternalMcblockstate.g:1243:108: ( ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) ) )
                    	    // InternalMcblockstate.g:1244:8: ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1(), 2);
                    	    // InternalMcblockstate.g:1247:11: ({...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) ) )
                    	    // InternalMcblockstate.g:1247:12: {...}? => ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleModel", "true");
                    	    }
                    	    // InternalMcblockstate.g:1247:21: ( ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' ) )
                    	    // InternalMcblockstate.g:1247:22: ( (lv_uvlockDefined_11_0= 'uvlock' ) ) otherlv_12= '=' ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' )
                    	    {
                    	    // InternalMcblockstate.g:1247:22: ( (lv_uvlockDefined_11_0= 'uvlock' ) )
                    	    // InternalMcblockstate.g:1248:12: (lv_uvlockDefined_11_0= 'uvlock' )
                    	    {
                    	    // InternalMcblockstate.g:1248:12: (lv_uvlockDefined_11_0= 'uvlock' )
                    	    // InternalMcblockstate.g:1249:13: lv_uvlockDefined_11_0= 'uvlock'
                    	    {
                    	    lv_uvlockDefined_11_0=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      													newLeafNode(lv_uvlockDefined_11_0, grammarAccess.getModelAccess().getUvlockDefinedUvlockKeyword_2_0_1_2_0_0());
                    	      												
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      													if (current==null) {
                    	      														current = createModelElement(grammarAccess.getModelRule());
                    	      													}
                    	      													setWithLastConsumed(current, "uvlockDefined", true, "uvlock");
                    	      												
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,22,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      											newLeafNode(otherlv_12, grammarAccess.getModelAccess().getEqualsSignKeyword_2_0_1_2_1());
                    	      										
                    	    }
                    	    // InternalMcblockstate.g:1265:11: ( ( (lv_uvlock_13_0= 'true' ) ) | otherlv_14= 'false' )
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==32) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==33) ) {
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
                    	            // InternalMcblockstate.g:1266:12: ( (lv_uvlock_13_0= 'true' ) )
                    	            {
                    	            // InternalMcblockstate.g:1266:12: ( (lv_uvlock_13_0= 'true' ) )
                    	            // InternalMcblockstate.g:1267:13: (lv_uvlock_13_0= 'true' )
                    	            {
                    	            // InternalMcblockstate.g:1267:13: (lv_uvlock_13_0= 'true' )
                    	            // InternalMcblockstate.g:1268:14: lv_uvlock_13_0= 'true'
                    	            {
                    	            lv_uvlock_13_0=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              														newLeafNode(lv_uvlock_13_0, grammarAccess.getModelAccess().getUvlockTrueKeyword_2_0_1_2_2_0_0());
                    	              													
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              														if (current==null) {
                    	              															current = createModelElement(grammarAccess.getModelRule());
                    	              														}
                    	              														setWithLastConsumed(current, "uvlock", true, "true");
                    	              													
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMcblockstate.g:1281:12: otherlv_14= 'false'
                    	            {
                    	            otherlv_14=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              												newLeafNode(otherlv_14, grammarAccess.getModelAccess().getFalseKeyword_2_0_1_2_2_1());
                    	              											
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_2_0_1());

                    }

                    otherlv_15=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightParenthesisKeyword_2_0_2());
                      				
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMCJsonValue"
    // InternalMcblockstate.g:1309:1: entryRuleMCJsonValue returns [EObject current=null] : iv_ruleMCJsonValue= ruleMCJsonValue EOF ;
    public final EObject entryRuleMCJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonValue = null;


        try {
            // InternalMcblockstate.g:1309:52: (iv_ruleMCJsonValue= ruleMCJsonValue EOF )
            // InternalMcblockstate.g:1310:2: iv_ruleMCJsonValue= ruleMCJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonValue=ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonValue; 
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
    // $ANTLR end "entryRuleMCJsonValue"


    // $ANTLR start "ruleMCJsonValue"
    // InternalMcblockstate.g:1316:1: ruleMCJsonValue returns [EObject current=null] : (this_MCJsonObject_0= ruleMCJsonObject | this_MCJsonArray_1= ruleMCJsonArray | this_MCJsonString_2= ruleMCJsonString | this_MCJsonNumber_3= ruleMCJsonNumber | this_MCJsonBoolean_4= ruleMCJsonBoolean | this_MCJsonNull_5= ruleMCJsonNull ) ;
    public final EObject ruleMCJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_MCJsonObject_0 = null;

        EObject this_MCJsonArray_1 = null;

        EObject this_MCJsonString_2 = null;

        EObject this_MCJsonNumber_3 = null;

        EObject this_MCJsonBoolean_4 = null;

        EObject this_MCJsonNull_5 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1322:2: ( (this_MCJsonObject_0= ruleMCJsonObject | this_MCJsonArray_1= ruleMCJsonArray | this_MCJsonString_2= ruleMCJsonString | this_MCJsonNumber_3= ruleMCJsonNumber | this_MCJsonBoolean_4= ruleMCJsonBoolean | this_MCJsonNull_5= ruleMCJsonNull ) )
            // InternalMcblockstate.g:1323:2: (this_MCJsonObject_0= ruleMCJsonObject | this_MCJsonArray_1= ruleMCJsonArray | this_MCJsonString_2= ruleMCJsonString | this_MCJsonNumber_3= ruleMCJsonNumber | this_MCJsonBoolean_4= ruleMCJsonBoolean | this_MCJsonNull_5= ruleMCJsonNull )
            {
            // InternalMcblockstate.g:1323:2: (this_MCJsonObject_0= ruleMCJsonObject | this_MCJsonArray_1= ruleMCJsonArray | this_MCJsonString_2= ruleMCJsonString | this_MCJsonNumber_3= ruleMCJsonNumber | this_MCJsonBoolean_4= ruleMCJsonBoolean | this_MCJsonNull_5= ruleMCJsonNull )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt27=1;
                }
                break;
            case 19:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                alt27=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_ULONG:
            case RULE_SLONG:
                {
                alt27=4;
                }
                break;
            case 32:
            case 33:
                {
                alt27=5;
                }
                break;
            case 34:
                {
                alt27=6;
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
                    // InternalMcblockstate.g:1324:3: this_MCJsonObject_0= ruleMCJsonObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonObjectParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonObject_0=ruleMCJsonObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonObject_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1333:3: this_MCJsonArray_1= ruleMCJsonArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonArrayParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonArray_1=ruleMCJsonArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonArray_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:1342:3: this_MCJsonString_2= ruleMCJsonString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonStringParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonString_2=ruleMCJsonString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonString_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:1351:3: this_MCJsonNumber_3= ruleMCJsonNumber
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonNumberParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonNumber_3=ruleMCJsonNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonNumber_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:1360:3: this_MCJsonBoolean_4= ruleMCJsonBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonBooleanParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonBoolean_4=ruleMCJsonBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonBoolean_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:1369:3: this_MCJsonNull_5= ruleMCJsonNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonValueAccess().getMCJsonNullParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonNull_5=ruleMCJsonNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonNull_5;
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
    // $ANTLR end "ruleMCJsonValue"


    // $ANTLR start "entryRuleMCJsonObject"
    // InternalMcblockstate.g:1381:1: entryRuleMCJsonObject returns [EObject current=null] : iv_ruleMCJsonObject= ruleMCJsonObject EOF ;
    public final EObject entryRuleMCJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonObject = null;


        try {
            // InternalMcblockstate.g:1381:53: (iv_ruleMCJsonObject= ruleMCJsonObject EOF )
            // InternalMcblockstate.g:1382:2: iv_ruleMCJsonObject= ruleMCJsonObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonObject=ruleMCJsonObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonObject; 
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
    // $ANTLR end "entryRuleMCJsonObject"


    // $ANTLR start "ruleMCJsonObject"
    // InternalMcblockstate.g:1388:1: ruleMCJsonObject returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ;
    public final EObject ruleMCJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1394:2: ( (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            // InternalMcblockstate.g:1395:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            {
            // InternalMcblockstate.g:1395:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            // InternalMcblockstate.g:1396:3: otherlv_0= '{' () ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMCJsonObjectAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMcblockstate.g:1400:3: ()
            // InternalMcblockstate.g:1401:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMCJsonObjectAccess().getMCJsonObjectAction_1(),
              					current);
              			
            }

            }

            // InternalMcblockstate.g:1407:3: ( ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMcblockstate.g:1408:4: ( (lv_entries_2_0= ruleMCJsonEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMcblockstate.g:1408:4: ( (lv_entries_2_0= ruleMCJsonEntry ) )
                    // InternalMcblockstate.g:1409:5: (lv_entries_2_0= ruleMCJsonEntry )
                    {
                    // InternalMcblockstate.g:1409:5: (lv_entries_2_0= ruleMCJsonEntry )
                    // InternalMcblockstate.g:1410:6: lv_entries_2_0= ruleMCJsonEntry
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_entries_2_0=ruleMCJsonEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMCJsonObjectRule());
                      						}
                      						add(
                      							current,
                      							"entries",
                      							lv_entries_2_0,
                      							"com.raptor.mcblockstate.Mcblockstate.MCJsonEntry");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMcblockstate.g:1427:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==RULE_STRING) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMcblockstate.g:1428:5: otherlv_3= ',' ( (lv_entries_4_0= ruleMCJsonEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMcblockstate.g:1432:5: ( (lv_entries_4_0= ruleMCJsonEntry ) )
                    	    // InternalMcblockstate.g:1433:6: (lv_entries_4_0= ruleMCJsonEntry )
                    	    {
                    	    // InternalMcblockstate.g:1433:6: (lv_entries_4_0= ruleMCJsonEntry )
                    	    // InternalMcblockstate.g:1434:7: lv_entries_4_0= ruleMCJsonEntry
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMCJsonObjectAccess().getEntriesMCJsonEntryParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_entries_4_0=ruleMCJsonEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMCJsonObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_4_0,
                    	      								"com.raptor.mcblockstate.Mcblockstate.MCJsonEntry");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    // InternalMcblockstate.g:1452:4: (otherlv_5= ',' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==20) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMcblockstate.g:1453:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMCJsonObjectAccess().getCommaKeyword_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMCJsonObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleMCJsonObject"


    // $ANTLR start "entryRuleMCJsonEntry"
    // InternalMcblockstate.g:1467:1: entryRuleMCJsonEntry returns [EObject current=null] : iv_ruleMCJsonEntry= ruleMCJsonEntry EOF ;
    public final EObject entryRuleMCJsonEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonEntry = null;


        try {
            // InternalMcblockstate.g:1467:52: (iv_ruleMCJsonEntry= ruleMCJsonEntry EOF )
            // InternalMcblockstate.g:1468:2: iv_ruleMCJsonEntry= ruleMCJsonEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonEntry=ruleMCJsonEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonEntry; 
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
    // $ANTLR end "entryRuleMCJsonEntry"


    // $ANTLR start "ruleMCJsonEntry"
    // InternalMcblockstate.g:1474:1: ruleMCJsonEntry returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleMCJsonValue ) ) ) ;
    public final EObject ruleMCJsonEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1480:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleMCJsonValue ) ) ) )
            // InternalMcblockstate.g:1481:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleMCJsonValue ) ) )
            {
            // InternalMcblockstate.g:1481:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleMCJsonValue ) ) )
            // InternalMcblockstate.g:1482:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleMCJsonValue ) )
            {
            // InternalMcblockstate.g:1482:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMcblockstate.g:1483:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalMcblockstate.g:1483:4: (lv_name_0_0= RULE_STRING )
            // InternalMcblockstate.g:1484:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMCJsonEntryAccess().getNameSTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMCJsonEntryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.raptor.mcblockstate.Mcblockstate.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMCJsonEntryAccess().getColonKeyword_1());
              		
            }
            // InternalMcblockstate.g:1504:3: ( (lv_value_2_0= ruleMCJsonValue ) )
            // InternalMcblockstate.g:1505:4: (lv_value_2_0= ruleMCJsonValue )
            {
            // InternalMcblockstate.g:1505:4: (lv_value_2_0= ruleMCJsonValue )
            // InternalMcblockstate.g:1506:5: lv_value_2_0= ruleMCJsonValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMCJsonEntryAccess().getValueMCJsonValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleMCJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMCJsonEntryRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.raptor.mcblockstate.Mcblockstate.MCJsonValue");
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
    // $ANTLR end "ruleMCJsonEntry"


    // $ANTLR start "entryRuleMCJsonArray"
    // InternalMcblockstate.g:1527:1: entryRuleMCJsonArray returns [EObject current=null] : iv_ruleMCJsonArray= ruleMCJsonArray EOF ;
    public final EObject entryRuleMCJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonArray = null;


        try {
            // InternalMcblockstate.g:1527:52: (iv_ruleMCJsonArray= ruleMCJsonArray EOF )
            // InternalMcblockstate.g:1528:2: iv_ruleMCJsonArray= ruleMCJsonArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonArray=ruleMCJsonArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonArray; 
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
    // $ANTLR end "entryRuleMCJsonArray"


    // $ANTLR start "ruleMCJsonArray"
    // InternalMcblockstate.g:1534:1: ruleMCJsonArray returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) ;
    public final EObject ruleMCJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1540:2: ( (otherlv_0= '[' () ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) )
            // InternalMcblockstate.g:1541:2: (otherlv_0= '[' () ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            {
            // InternalMcblockstate.g:1541:2: (otherlv_0= '[' () ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            // InternalMcblockstate.g:1542:3: otherlv_0= '[' () ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMCJsonArrayAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMcblockstate.g:1546:3: ()
            // InternalMcblockstate.g:1547:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMCJsonArrayAccess().getMCJsonArrayAction_1(),
              					current);
              			
            }

            }

            // InternalMcblockstate.g:1553:3: ( ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_SLONG)||LA33_0==17||LA33_0==19||(LA33_0>=32 && LA33_0<=34)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMcblockstate.g:1554:4: ( (lv_elements_2_0= ruleMCJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMcblockstate.g:1554:4: ( (lv_elements_2_0= ruleMCJsonValue ) )
                    // InternalMcblockstate.g:1555:5: (lv_elements_2_0= ruleMCJsonValue )
                    {
                    // InternalMcblockstate.g:1555:5: (lv_elements_2_0= ruleMCJsonValue )
                    // InternalMcblockstate.g:1556:6: lv_elements_2_0= ruleMCJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_elements_2_0=ruleMCJsonValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMCJsonArrayRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"com.raptor.mcblockstate.Mcblockstate.MCJsonValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMcblockstate.g:1573:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            int LA31_1 = input.LA(2);

                            if ( ((LA31_1>=RULE_STRING && LA31_1<=RULE_SLONG)||LA31_1==17||LA31_1==19||(LA31_1>=32 && LA31_1<=34)) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMcblockstate.g:1574:5: otherlv_3= ',' ( (lv_elements_4_0= ruleMCJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMcblockstate.g:1578:5: ( (lv_elements_4_0= ruleMCJsonValue ) )
                    	    // InternalMcblockstate.g:1579:6: (lv_elements_4_0= ruleMCJsonValue )
                    	    {
                    	    // InternalMcblockstate.g:1579:6: (lv_elements_4_0= ruleMCJsonValue )
                    	    // InternalMcblockstate.g:1580:7: lv_elements_4_0= ruleMCJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMCJsonArrayAccess().getElementsMCJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleMCJsonValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMCJsonArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"com.raptor.mcblockstate.Mcblockstate.MCJsonValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalMcblockstate.g:1598:4: (otherlv_5= ',' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==20) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMcblockstate.g:1599:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMCJsonArrayAccess().getCommaKeyword_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMCJsonArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleMCJsonArray"


    // $ANTLR start "entryRuleMCJsonString"
    // InternalMcblockstate.g:1613:1: entryRuleMCJsonString returns [EObject current=null] : iv_ruleMCJsonString= ruleMCJsonString EOF ;
    public final EObject entryRuleMCJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonString = null;


        try {
            // InternalMcblockstate.g:1613:53: (iv_ruleMCJsonString= ruleMCJsonString EOF )
            // InternalMcblockstate.g:1614:2: iv_ruleMCJsonString= ruleMCJsonString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonString=ruleMCJsonString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonString; 
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
    // $ANTLR end "entryRuleMCJsonString"


    // $ANTLR start "ruleMCJsonString"
    // InternalMcblockstate.g:1620:1: ruleMCJsonString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleMCJsonString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:1626:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMcblockstate.g:1627:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMcblockstate.g:1627:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMcblockstate.g:1628:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMcblockstate.g:1628:3: (lv_value_0_0= RULE_STRING )
            // InternalMcblockstate.g:1629:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getMCJsonStringAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getMCJsonStringRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.raptor.mcblockstate.Mcblockstate.STRING");
              			
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
    // $ANTLR end "ruleMCJsonString"


    // $ANTLR start "entryRuleMCJsonNumber"
    // InternalMcblockstate.g:1648:1: entryRuleMCJsonNumber returns [EObject current=null] : iv_ruleMCJsonNumber= ruleMCJsonNumber EOF ;
    public final EObject entryRuleMCJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonNumber = null;


        try {
            // InternalMcblockstate.g:1648:53: (iv_ruleMCJsonNumber= ruleMCJsonNumber EOF )
            // InternalMcblockstate.g:1649:2: iv_ruleMCJsonNumber= ruleMCJsonNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonNumber=ruleMCJsonNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonNumber; 
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
    // $ANTLR end "entryRuleMCJsonNumber"


    // $ANTLR start "ruleMCJsonNumber"
    // InternalMcblockstate.g:1655:1: ruleMCJsonNumber returns [EObject current=null] : (this_MCJsonIntegral_0= ruleMCJsonIntegral | this_MCJsonFloatingPoint_1= ruleMCJsonFloatingPoint ) ;
    public final EObject ruleMCJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject this_MCJsonIntegral_0 = null;

        EObject this_MCJsonFloatingPoint_1 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1661:2: ( (this_MCJsonIntegral_0= ruleMCJsonIntegral | this_MCJsonFloatingPoint_1= ruleMCJsonFloatingPoint ) )
            // InternalMcblockstate.g:1662:2: (this_MCJsonIntegral_0= ruleMCJsonIntegral | this_MCJsonFloatingPoint_1= ruleMCJsonFloatingPoint )
            {
            // InternalMcblockstate.g:1662:2: (this_MCJsonIntegral_0= ruleMCJsonIntegral | this_MCJsonFloatingPoint_1= ruleMCJsonFloatingPoint )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ULONG && LA34_0<=RULE_SLONG)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_DOUBLE) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMcblockstate.g:1663:3: this_MCJsonIntegral_0= ruleMCJsonIntegral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonNumberAccess().getMCJsonIntegralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonIntegral_0=ruleMCJsonIntegral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonIntegral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1672:3: this_MCJsonFloatingPoint_1= ruleMCJsonFloatingPoint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMCJsonNumberAccess().getMCJsonFloatingPointParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MCJsonFloatingPoint_1=ruleMCJsonFloatingPoint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MCJsonFloatingPoint_1;
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
    // $ANTLR end "ruleMCJsonNumber"


    // $ANTLR start "entryRuleMCJsonIntegral"
    // InternalMcblockstate.g:1684:1: entryRuleMCJsonIntegral returns [EObject current=null] : iv_ruleMCJsonIntegral= ruleMCJsonIntegral EOF ;
    public final EObject entryRuleMCJsonIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonIntegral = null;


        try {
            // InternalMcblockstate.g:1684:55: (iv_ruleMCJsonIntegral= ruleMCJsonIntegral EOF )
            // InternalMcblockstate.g:1685:2: iv_ruleMCJsonIntegral= ruleMCJsonIntegral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonIntegralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonIntegral=ruleMCJsonIntegral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonIntegral; 
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
    // $ANTLR end "entryRuleMCJsonIntegral"


    // $ANTLR start "ruleMCJsonIntegral"
    // InternalMcblockstate.g:1691:1: ruleMCJsonIntegral returns [EObject current=null] : ( (lv_value_0_0= ruleLONG ) ) ;
    public final EObject ruleMCJsonIntegral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMcblockstate.g:1697:2: ( ( (lv_value_0_0= ruleLONG ) ) )
            // InternalMcblockstate.g:1698:2: ( (lv_value_0_0= ruleLONG ) )
            {
            // InternalMcblockstate.g:1698:2: ( (lv_value_0_0= ruleLONG ) )
            // InternalMcblockstate.g:1699:3: (lv_value_0_0= ruleLONG )
            {
            // InternalMcblockstate.g:1699:3: (lv_value_0_0= ruleLONG )
            // InternalMcblockstate.g:1700:4: lv_value_0_0= ruleLONG
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMCJsonIntegralAccess().getValueLONGParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleLONG();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getMCJsonIntegralRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.raptor.mcblockstate.Mcblockstate.LONG");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleMCJsonIntegral"


    // $ANTLR start "entryRuleMCJsonFloatingPoint"
    // InternalMcblockstate.g:1720:1: entryRuleMCJsonFloatingPoint returns [EObject current=null] : iv_ruleMCJsonFloatingPoint= ruleMCJsonFloatingPoint EOF ;
    public final EObject entryRuleMCJsonFloatingPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonFloatingPoint = null;


        try {
            // InternalMcblockstate.g:1720:60: (iv_ruleMCJsonFloatingPoint= ruleMCJsonFloatingPoint EOF )
            // InternalMcblockstate.g:1721:2: iv_ruleMCJsonFloatingPoint= ruleMCJsonFloatingPoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonFloatingPointRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonFloatingPoint=ruleMCJsonFloatingPoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonFloatingPoint; 
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
    // $ANTLR end "entryRuleMCJsonFloatingPoint"


    // $ANTLR start "ruleMCJsonFloatingPoint"
    // InternalMcblockstate.g:1727:1: ruleMCJsonFloatingPoint returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleMCJsonFloatingPoint() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:1733:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalMcblockstate.g:1734:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalMcblockstate.g:1734:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalMcblockstate.g:1735:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalMcblockstate.g:1735:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalMcblockstate.g:1736:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getMCJsonFloatingPointAccess().getValueDOUBLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getMCJsonFloatingPointRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.raptor.mcblockstate.Mcblockstate.DOUBLE");
              			
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
    // $ANTLR end "ruleMCJsonFloatingPoint"


    // $ANTLR start "entryRuleMCJsonBoolean"
    // InternalMcblockstate.g:1755:1: entryRuleMCJsonBoolean returns [EObject current=null] : iv_ruleMCJsonBoolean= ruleMCJsonBoolean EOF ;
    public final EObject entryRuleMCJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonBoolean = null;


        try {
            // InternalMcblockstate.g:1755:54: (iv_ruleMCJsonBoolean= ruleMCJsonBoolean EOF )
            // InternalMcblockstate.g:1756:2: iv_ruleMCJsonBoolean= ruleMCJsonBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonBoolean=ruleMCJsonBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonBoolean; 
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
    // $ANTLR end "entryRuleMCJsonBoolean"


    // $ANTLR start "ruleMCJsonBoolean"
    // InternalMcblockstate.g:1762:1: ruleMCJsonBoolean returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) ;
    public final EObject ruleMCJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:1768:2: ( ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) )
            // InternalMcblockstate.g:1769:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            {
            // InternalMcblockstate.g:1769:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            else if ( (LA35_0==33) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMcblockstate.g:1770:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalMcblockstate.g:1770:3: ( (lv_value_0_0= 'true' ) )
                    // InternalMcblockstate.g:1771:4: (lv_value_0_0= 'true' )
                    {
                    // InternalMcblockstate.g:1771:4: (lv_value_0_0= 'true' )
                    // InternalMcblockstate.g:1772:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_0, grammarAccess.getMCJsonBooleanAccess().getValueTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMCJsonBooleanRule());
                      					}
                      					setWithLastConsumed(current, "value", true, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1785:3: (otherlv_1= 'false' () )
                    {
                    // InternalMcblockstate.g:1785:3: (otherlv_1= 'false' () )
                    // InternalMcblockstate.g:1786:4: otherlv_1= 'false' ()
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMCJsonBooleanAccess().getFalseKeyword_1_0());
                      			
                    }
                    // InternalMcblockstate.g:1790:4: ()
                    // InternalMcblockstate.g:1791:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMCJsonBooleanAccess().getMCJsonBooleanAction_1_1(),
                      						current);
                      				
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
    // $ANTLR end "ruleMCJsonBoolean"


    // $ANTLR start "entryRuleMCJsonNull"
    // InternalMcblockstate.g:1802:1: entryRuleMCJsonNull returns [EObject current=null] : iv_ruleMCJsonNull= ruleMCJsonNull EOF ;
    public final EObject entryRuleMCJsonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCJsonNull = null;


        try {
            // InternalMcblockstate.g:1802:51: (iv_ruleMCJsonNull= ruleMCJsonNull EOF )
            // InternalMcblockstate.g:1803:2: iv_ruleMCJsonNull= ruleMCJsonNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCJsonNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMCJsonNull=ruleMCJsonNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCJsonNull; 
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
    // $ANTLR end "entryRuleMCJsonNull"


    // $ANTLR start "ruleMCJsonNull"
    // InternalMcblockstate.g:1809:1: ruleMCJsonNull returns [EObject current=null] : (otherlv_0= 'null' () ) ;
    public final EObject ruleMCJsonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:1815:2: ( (otherlv_0= 'null' () ) )
            // InternalMcblockstate.g:1816:2: (otherlv_0= 'null' () )
            {
            // InternalMcblockstate.g:1816:2: (otherlv_0= 'null' () )
            // InternalMcblockstate.g:1817:3: otherlv_0= 'null' ()
            {
            otherlv_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMCJsonNullAccess().getNullKeyword_0());
              		
            }
            // InternalMcblockstate.g:1821:3: ()
            // InternalMcblockstate.g:1822:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMCJsonNullAccess().getMCJsonNullAction_1(),
              					current);
              			
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
    // $ANTLR end "ruleMCJsonNull"


    // $ANTLR start "entryRuleNamespacedLocation"
    // InternalMcblockstate.g:1832:1: entryRuleNamespacedLocation returns [String current=null] : iv_ruleNamespacedLocation= ruleNamespacedLocation EOF ;
    public final String entryRuleNamespacedLocation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedLocation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1834:2: (iv_ruleNamespacedLocation= ruleNamespacedLocation EOF )
            // InternalMcblockstate.g:1835:2: iv_ruleNamespacedLocation= ruleNamespacedLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespacedLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespacedLocation=ruleNamespacedLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespacedLocation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNamespacedLocation"


    // $ANTLR start "ruleNamespacedLocation"
    // InternalMcblockstate.g:1844:1: ruleNamespacedLocation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Key_0= ruleKey ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )? ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedLocation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Key_2 = null;

        AntlrDatatypeRuleToken this_Key_4 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1851:2: ( (this_Key_0= ruleKey ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )? ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )* ) )
            // InternalMcblockstate.g:1852:2: (this_Key_0= ruleKey ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )? ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )* )
            {
            // InternalMcblockstate.g:1852:2: (this_Key_0= ruleKey ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )? ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )* )
            // InternalMcblockstate.g:1853:3: this_Key_0= ruleKey ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )? ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_Key_0=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Key_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMcblockstate.g:1863:3: ( ( ':' )=> (kw= ':' this_Key_2= ruleKey ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) && (synpred8_InternalMcblockstate())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMcblockstate.g:1864:4: ( ':' )=> (kw= ':' this_Key_2= ruleKey )
                    {
                    // InternalMcblockstate.g:1865:4: (kw= ':' this_Key_2= ruleKey )
                    // InternalMcblockstate.g:1866:5: kw= ':' this_Key_2= ruleKey
                    {
                    kw=(Token)match(input,40,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getNamespacedLocationAccess().getColonKeyword_1_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_1_0_1());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    this_Key_2=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Key_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMcblockstate.g:1883:3: ( ( '/' )=> (kw= '/' this_Key_4= ruleKey ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==41) && (synpred9_InternalMcblockstate())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMcblockstate.g:1884:4: ( '/' )=> (kw= '/' this_Key_4= ruleKey )
            	    {
            	    // InternalMcblockstate.g:1885:4: (kw= '/' this_Key_4= ruleKey )
            	    // InternalMcblockstate.g:1886:5: kw= '/' this_Key_4= ruleKey
            	    {
            	    kw=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getNamespacedLocationAccess().getSolidusKeyword_2_0_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNamespacedLocationAccess().getKeyParserRuleCall_2_0_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    this_Key_4=ruleKey();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_Key_4);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNamespacedLocation"


    // $ANTLR start "entryRuleKey"
    // InternalMcblockstate.g:1910:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1912:2: (iv_ruleKey= ruleKey EOF )
            // InternalMcblockstate.g:1913:2: iv_ruleKey= ruleKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKey.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMcblockstate.g:1922:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Identifier_0= ruleIdentifier (kw= '.' this_Identifier_2= ruleIdentifier )* ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;

        AntlrDatatypeRuleToken this_Identifier_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1929:2: ( (this_Identifier_0= ruleIdentifier (kw= '.' this_Identifier_2= ruleIdentifier )* ) )
            // InternalMcblockstate.g:1930:2: (this_Identifier_0= ruleIdentifier (kw= '.' this_Identifier_2= ruleIdentifier )* )
            {
            // InternalMcblockstate.g:1930:2: (this_Identifier_0= ruleIdentifier (kw= '.' this_Identifier_2= ruleIdentifier )* )
            // InternalMcblockstate.g:1931:3: this_Identifier_0= ruleIdentifier (kw= '.' this_Identifier_2= ruleIdentifier )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Identifier_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMcblockstate.g:1941:3: (kw= '.' this_Identifier_2= ruleIdentifier )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==42) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMcblockstate.g:1942:4: kw= '.' this_Identifier_2= ruleIdentifier
            	    {
            	    kw=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getKeyAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getKeyAccess().getIdentifierParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_36);
            	    this_Identifier_2=ruleIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Identifier_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleIdentifier"
    // InternalMcblockstate.g:1965:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1967:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalMcblockstate.g:1968:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalMcblockstate.g:1977:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Keyword_1= ruleKeyword ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Keyword_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMcblockstate.g:1984:2: ( (this_ID_0= RULE_ID | this_Keyword_1= ruleKeyword ) )
            // InternalMcblockstate.g:1985:2: (this_ID_0= RULE_ID | this_Keyword_1= ruleKeyword )
            {
            // InternalMcblockstate.g:1985:2: (this_ID_0= RULE_ID | this_Keyword_1= ruleKeyword )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==16||LA39_0==23||LA39_0==26||(LA39_0>=32 && LA39_0<=35)||LA39_0==38) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMcblockstate.g:1986:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:1994:3: this_Keyword_1= ruleKeyword
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Keyword_1=ruleKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Keyword_1);
                      		
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleKeyword"
    // InternalMcblockstate.g:2011:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // InternalMcblockstate.g:2011:47: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalMcblockstate.g:2012:2: iv_ruleKeyword= ruleKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyword.getText(); 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalMcblockstate.g:2018:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'apply' | kw= 'false' | kw= 'multipart' | kw= 'null' | kw= 'true' | kw= 'uvlock' | kw= 'variants' | kw= 'when' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:2024:2: ( (kw= 'apply' | kw= 'false' | kw= 'multipart' | kw= 'null' | kw= 'true' | kw= 'uvlock' | kw= 'variants' | kw= 'when' ) )
            // InternalMcblockstate.g:2025:2: (kw= 'apply' | kw= 'false' | kw= 'multipart' | kw= 'null' | kw= 'true' | kw= 'uvlock' | kw= 'variants' | kw= 'when' )
            {
            // InternalMcblockstate.g:2025:2: (kw= 'apply' | kw= 'false' | kw= 'multipart' | kw= 'null' | kw= 'true' | kw= 'uvlock' | kw= 'variants' | kw= 'when' )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt40=1;
                }
                break;
            case 33:
                {
                alt40=2;
                }
                break;
            case 35:
                {
                alt40=3;
                }
                break;
            case 34:
                {
                alt40=4;
                }
                break;
            case 32:
                {
                alt40=5;
                }
                break;
            case 38:
                {
                alt40=6;
                }
                break;
            case 16:
                {
                alt40=7;
                }
                break;
            case 23:
                {
                alt40=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMcblockstate.g:2026:3: kw= 'apply'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getApplyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:2032:3: kw= 'false'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMcblockstate.g:2038:3: kw= 'multipart'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getMultipartKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMcblockstate.g:2044:3: kw= 'null'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getNullKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMcblockstate.g:2050:3: kw= 'true'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getTrueKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMcblockstate.g:2056:3: kw= 'uvlock'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getUvlockKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMcblockstate.g:2062:3: kw= 'variants'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getVariantsKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMcblockstate.g:2068:3: kw= 'when'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordAccess().getWhenKeyword_7());
                      		
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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleLONG"
    // InternalMcblockstate.g:2077:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalMcblockstate.g:2077:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalMcblockstate.g:2078:2: iv_ruleLONG= ruleLONG EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLONGRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLONG.getText(); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalMcblockstate.g:2084:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ULONG_0= RULE_ULONG | this_SLONG_1= RULE_SLONG ) ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ULONG_0=null;
        Token this_SLONG_1=null;


        	enterRule();

        try {
            // InternalMcblockstate.g:2090:2: ( (this_ULONG_0= RULE_ULONG | this_SLONG_1= RULE_SLONG ) )
            // InternalMcblockstate.g:2091:2: (this_ULONG_0= RULE_ULONG | this_SLONG_1= RULE_SLONG )
            {
            // InternalMcblockstate.g:2091:2: (this_ULONG_0= RULE_ULONG | this_SLONG_1= RULE_SLONG )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ULONG) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_SLONG) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMcblockstate.g:2092:3: this_ULONG_0= RULE_ULONG
                    {
                    this_ULONG_0=(Token)match(input,RULE_ULONG,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ULONG_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ULONG_0, grammarAccess.getLONGAccess().getULONGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:2100:3: this_SLONG_1= RULE_SLONG
                    {
                    this_SLONG_1=(Token)match(input,RULE_SLONG,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SLONG_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SLONG_1, grammarAccess.getLONGAccess().getSLONGTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleLONG"

    // $ANTLR start synpred1_InternalMcblockstate
    public final void synpred1_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:80:4: ( 'variants' | 'when' | 'apply' )
        // InternalMcblockstate.g:
        {
        if ( input.LA(1)==16||input.LA(1)==23||input.LA(1)==26 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalMcblockstate

    // $ANTLR start synpred2_InternalMcblockstate
    public final void synpred2_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:211:5: ( ( ',' ( ( ruleBlockstateProperty ) ) ) )
        // InternalMcblockstate.g:211:6: ( ',' ( ( ruleBlockstateProperty ) ) )
        {
        // InternalMcblockstate.g:211:6: ( ',' ( ( ruleBlockstateProperty ) ) )
        // InternalMcblockstate.g:212:6: ',' ( ( ruleBlockstateProperty ) )
        {
        match(input,20,FOLLOW_7); if (state.failed) return ;
        // InternalMcblockstate.g:213:6: ( ( ruleBlockstateProperty ) )
        // InternalMcblockstate.g:214:7: ( ruleBlockstateProperty )
        {
        // InternalMcblockstate.g:214:7: ( ruleBlockstateProperty )
        // InternalMcblockstate.g:215:8: ruleBlockstateProperty
        {
        pushFollow(FOLLOW_2);
        ruleBlockstateProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMcblockstate

    // $ANTLR start synpred3_InternalMcblockstate
    public final void synpred3_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:480:4: ( '|' )
        // InternalMcblockstate.g:480:5: '|'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMcblockstate

    // $ANTLR start synpred5_InternalMcblockstate
    public final void synpred5_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:1030:5: ( '}' )
        // InternalMcblockstate.g:1030:6: '}'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMcblockstate

    // $ANTLR start synpred6_InternalMcblockstate
    public final void synpred6_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:1096:4: ( '*' )
        // InternalMcblockstate.g:1096:5: '*'
        {
        match(input,39,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalMcblockstate

    // $ANTLR start synpred7_InternalMcblockstate
    public final void synpred7_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:1133:4: ( '(' )
        // InternalMcblockstate.g:1133:5: '('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalMcblockstate

    // $ANTLR start synpred8_InternalMcblockstate
    public final void synpred8_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:1864:4: ( ':' )
        // InternalMcblockstate.g:1864:5: ':'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalMcblockstate

    // $ANTLR start synpred9_InternalMcblockstate
    public final void synpred9_InternalMcblockstate_fragment() throws RecognitionException {   
        // InternalMcblockstate.g:1884:4: ( '/' )
        // InternalMcblockstate.g:1884:5: '/'
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMcblockstate

    // Delegated rules

    public final boolean synpred9_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalMcblockstate() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMcblockstate_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\24\1\4\21\uffff";
    static final String dfa_3s = "\1\25\1\46\21\uffff";
    static final String dfa_4s = "\2\uffff\1\2\20\1";
    static final String dfa_5s = "\1\uffff\1\0\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\16\1\17\1\20\1\21\1\22\7\uffff\1\6\4\uffff\1\2\1\uffff\1\11\2\uffff\1\12\3\uffff\1\10\1\uffff\1\3\1\4\1\5\1\7\1\13\1\14\1\15",
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
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 210:4: ( ( ( ',' ( ( ruleBlockstateProperty ) ) ) )=> (otherlv_2= ',' ( (lv_properties_3_0= ruleBlockstateProperty ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_1==32) && (synpred2_InternalMcblockstate())) {s = 3;}

                        else if ( (LA4_1==33) && (synpred2_InternalMcblockstate())) {s = 4;}

                        else if ( (LA4_1==34) && (synpred2_InternalMcblockstate())) {s = 5;}

                        else if ( (LA4_1==16) && (synpred2_InternalMcblockstate())) {s = 6;}

                        else if ( (LA4_1==35) && (synpred2_InternalMcblockstate())) {s = 7;}

                        else if ( (LA4_1==30) && (synpred2_InternalMcblockstate())) {s = 8;}

                        else if ( (LA4_1==23) && (synpred2_InternalMcblockstate())) {s = 9;}

                        else if ( (LA4_1==26) && (synpred2_InternalMcblockstate())) {s = 10;}

                        else if ( (LA4_1==36) && (synpred2_InternalMcblockstate())) {s = 11;}

                        else if ( (LA4_1==37) && (synpred2_InternalMcblockstate())) {s = 12;}

                        else if ( (LA4_1==38) && (synpred2_InternalMcblockstate())) {s = 13;}

                        else if ( (LA4_1==RULE_ID) && (synpred2_InternalMcblockstate())) {s = 14;}

                        else if ( (LA4_1==RULE_STRING) && (synpred2_InternalMcblockstate())) {s = 15;}

                        else if ( (LA4_1==RULE_DOUBLE) && (synpred2_InternalMcblockstate())) {s = 16;}

                        else if ( (LA4_1==RULE_ULONG) && (synpred2_InternalMcblockstate())) {s = 17;}

                        else if ( (LA4_1==RULE_SLONG) && (synpred2_InternalMcblockstate())) {s = 18;}

                        else if ( (LA4_1==21) ) {s = 2;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\1\uffff\20\21\2\uffff";
    static final String dfa_8s = "\1\4\20\26\2\uffff";
    static final String dfa_9s = "\1\46\20\36\2\uffff";
    static final String dfa_10s = "\21\uffff\1\2\1\1";
    static final String dfa_11s = "\23\uffff}>";
    static final String[] dfa_12s = {
            "\1\14\1\15\1\16\1\17\1\20\7\uffff\1\4\6\uffff\1\7\2\uffff\1\10\3\uffff\1\6\1\21\1\1\1\2\1\3\1\5\1\11\1\12\1\13",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "\1\22\2\uffff\1\21\1\uffff\2\21\2\22",
            "",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "648:2: ( ( () ( (lv_name_1_0= ruleBlockstatePropertyValue ) ) ( ( '=' | '==' | 'in' )=> ( ( (otherlv_2= '=' | otherlv_3= '==' ) ( (lv_values_4_0= ruleBlockstatePropertyValue ) ) ) | (otherlv_5= 'in' otherlv_6= '(' ( ( (lv_values_7_0= ruleBlockstatePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleBlockstatePropertyValue ) ) )* (otherlv_10= ',' )? )? otherlv_11= ')' ) ) ) ) | ( () ( (lv_inverted_13_0= '!' ) )? ( (lv_name_14_0= ruleBlockstatePropertyValue ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007F44A101F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000007F448101F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004F04830010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007FC58101F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000007F468101F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004F04870010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007F448B01F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007F44AB01F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000002L});

}
