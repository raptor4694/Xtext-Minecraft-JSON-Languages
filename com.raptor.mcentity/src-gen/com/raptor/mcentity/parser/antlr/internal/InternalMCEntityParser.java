package com.raptor.mcentity.parser.antlr.internal;

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
import com.raptor.mcentity.services.MCEntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NBT_BYTE_ARRAY_START", "RULE_BYTE", "RULE_NBT_LONG_ARRAY_START", "RULE_LONG", "RULE_NBT_INT_ARRAY_START", "RULE_INT", "RULE_FLOAT", "RULE_DOUBLE", "RULE_SHORT", "RULE_SINGLE_STRING", "RULE_JSON_TEXT_BEGIN_OBJ", "RULE_JSON_TEXT_END_OBJ", "RULE_JSON_TEXT_BEGIN_ARRAY", "RULE_JSON_TEXT_END_ARRAY", "RULE_JSON_TEXT_BEGIN_STR", "RULE_JSON_TEXT_END_STR", "RULE_ID", "RULE_SIGN", "RULE_EXP", "RULE_HEX_DIGIT", "RULE_INTBASE", "RULE_SIGNEDINTBASE", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "','", "'}'", "':'", "']'", "'['", "'true'", "'false'", "'='", "'!'", "'..'", "'/'", "'-'", "'.'", "'+'", "'@p'", "'@a'", "'@s'", "'@e'", "'@r'"
    };
    public static final int RULE_EXP=23;
    public static final int T__50=50;
    public static final int RULE_SIGN=22;
    public static final int RULE_NBT_LONG_ARRAY_START=7;
    public static final int RULE_SINGLE_STRING=14;
    public static final int RULE_SIGNEDINTBASE=26;
    public static final int RULE_JSON_TEXT_BEGIN_ARRAY=17;
    public static final int RULE_NBT_INT_ARRAY_START=9;
    public static final int RULE_JSON_TEXT_END_STR=20;
    public static final int RULE_ID=21;
    public static final int RULE_SHORT=13;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=28;
    public static final int RULE_NBT_BYTE_ARRAY_START=5;
    public static final int RULE_STRING=4;
    public static final int RULE_BYTE=6;
    public static final int RULE_JSON_TEXT_BEGIN_STR=19;
    public static final int RULE_SL_COMMENT=29;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int RULE_JSON_TEXT_END_ARRAY=18;
    public static final int T__32=32;
    public static final int RULE_WS=27;
    public static final int RULE_ANY_OTHER=30;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_JSON_TEXT_BEGIN_OBJ=15;
    public static final int T__44=44;
    public static final int RULE_INTBASE=25;
    public static final int T__45=45;
    public static final int RULE_FLOAT=11;
    public static final int RULE_HEX_DIGIT=24;
    public static final int T__46=46;
    public static final int RULE_LONG=8;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_JSON_TEXT_END_OBJ=16;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMCEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMCEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMCEntityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMCEntity.g"; }



     	private MCEntityGrammarAccess grammarAccess;

        public InternalMCEntityParser(TokenStream input, MCEntityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntityData";
       	}

       	@Override
       	protected MCEntityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntityData"
    // InternalMCEntity.g:65:1: entryRuleEntityData returns [EObject current=null] : iv_ruleEntityData= ruleEntityData EOF ;
    public final EObject entryRuleEntityData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityData = null;


        try {
            // InternalMCEntity.g:65:51: (iv_ruleEntityData= ruleEntityData EOF )
            // InternalMCEntity.g:66:2: iv_ruleEntityData= ruleEntityData EOF
            {
             newCompositeNode(grammarAccess.getEntityDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityData=ruleEntityData();

            state._fsp--;

             current =iv_ruleEntityData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityData"


    // $ANTLR start "ruleEntityData"
    // InternalMCEntity.g:72:1: ruleEntityData returns [EObject current=null] : ( (lv_nbt_0_0= ruleNBTCompound ) ) ;
    public final EObject ruleEntityData() throws RecognitionException {
        EObject current = null;

        EObject lv_nbt_0_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:78:2: ( ( (lv_nbt_0_0= ruleNBTCompound ) ) )
            // InternalMCEntity.g:79:2: ( (lv_nbt_0_0= ruleNBTCompound ) )
            {
            // InternalMCEntity.g:79:2: ( (lv_nbt_0_0= ruleNBTCompound ) )
            // InternalMCEntity.g:80:3: (lv_nbt_0_0= ruleNBTCompound )
            {
            // InternalMCEntity.g:80:3: (lv_nbt_0_0= ruleNBTCompound )
            // InternalMCEntity.g:81:4: lv_nbt_0_0= ruleNBTCompound
            {

            				newCompositeNode(grammarAccess.getEntityDataAccess().getNbtNBTCompoundParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nbt_0_0=ruleNBTCompound();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEntityDataRule());
            				}
            				set(
            					current,
            					"nbt",
            					lv_nbt_0_0,
            					"com.raptor.mcentity.MCEntity.NBTCompound");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityData"


    // $ANTLR start "entryRuleNBTValue"
    // InternalMCEntity.g:101:1: entryRuleNBTValue returns [EObject current=null] : iv_ruleNBTValue= ruleNBTValue EOF ;
    public final EObject entryRuleNBTValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTValue = null;


        try {
            // InternalMCEntity.g:101:49: (iv_ruleNBTValue= ruleNBTValue EOF )
            // InternalMCEntity.g:102:2: iv_ruleNBTValue= ruleNBTValue EOF
            {
             newCompositeNode(grammarAccess.getNBTValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTValue=ruleNBTValue();

            state._fsp--;

             current =iv_ruleNBTValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTValue"


    // $ANTLR start "ruleNBTValue"
    // InternalMCEntity.g:108:1: ruleNBTValue returns [EObject current=null] : (this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent | this_NBTCompound_1= ruleNBTCompound | this_NBTByteArray_2= ruleNBTByteArray | this_NBTLongArray_3= ruleNBTLongArray | this_NBTIntArray_4= ruleNBTIntArray | this_NBTArray_5= ruleNBTArray | this_NBTBool_6= ruleNBTBool | this_NBTNumber_7= ruleNBTNumber | this_NamespacedKey_8= ruleNamespacedKey | this_NBTString_9= ruleNBTString ) ;
    public final EObject ruleNBTValue() throws RecognitionException {
        EObject current = null;

        EObject this_NBTJSONTextComponent_0 = null;

        EObject this_NBTCompound_1 = null;

        EObject this_NBTByteArray_2 = null;

        EObject this_NBTLongArray_3 = null;

        EObject this_NBTIntArray_4 = null;

        EObject this_NBTArray_5 = null;

        EObject this_NBTBool_6 = null;

        EObject this_NBTNumber_7 = null;

        EObject this_NamespacedKey_8 = null;

        EObject this_NBTString_9 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:114:2: ( (this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent | this_NBTCompound_1= ruleNBTCompound | this_NBTByteArray_2= ruleNBTByteArray | this_NBTLongArray_3= ruleNBTLongArray | this_NBTIntArray_4= ruleNBTIntArray | this_NBTArray_5= ruleNBTArray | this_NBTBool_6= ruleNBTBool | this_NBTNumber_7= ruleNBTNumber | this_NamespacedKey_8= ruleNamespacedKey | this_NBTString_9= ruleNBTString ) )
            // InternalMCEntity.g:115:2: (this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent | this_NBTCompound_1= ruleNBTCompound | this_NBTByteArray_2= ruleNBTByteArray | this_NBTLongArray_3= ruleNBTLongArray | this_NBTIntArray_4= ruleNBTIntArray | this_NBTArray_5= ruleNBTArray | this_NBTBool_6= ruleNBTBool | this_NBTNumber_7= ruleNBTNumber | this_NamespacedKey_8= ruleNamespacedKey | this_NBTString_9= ruleNBTString )
            {
            // InternalMCEntity.g:115:2: (this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent | this_NBTCompound_1= ruleNBTCompound | this_NBTByteArray_2= ruleNBTByteArray | this_NBTLongArray_3= ruleNBTLongArray | this_NBTIntArray_4= ruleNBTIntArray | this_NBTArray_5= ruleNBTArray | this_NBTBool_6= ruleNBTBool | this_NBTNumber_7= ruleNBTNumber | this_NamespacedKey_8= ruleNamespacedKey | this_NBTString_9= ruleNBTString )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMCEntity.g:116:3: this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTJSONTextComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTJSONTextComponent_0=ruleNBTJSONTextComponent();

                    state._fsp--;


                    			current = this_NBTJSONTextComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:125:3: this_NBTCompound_1= ruleNBTCompound
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTCompoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTCompound_1=ruleNBTCompound();

                    state._fsp--;


                    			current = this_NBTCompound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:134:3: this_NBTByteArray_2= ruleNBTByteArray
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTByteArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTByteArray_2=ruleNBTByteArray();

                    state._fsp--;


                    			current = this_NBTByteArray_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:143:3: this_NBTLongArray_3= ruleNBTLongArray
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTLongArrayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTLongArray_3=ruleNBTLongArray();

                    state._fsp--;


                    			current = this_NBTLongArray_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:152:3: this_NBTIntArray_4= ruleNBTIntArray
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTIntArrayParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTIntArray_4=ruleNBTIntArray();

                    state._fsp--;


                    			current = this_NBTIntArray_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:161:3: this_NBTArray_5= ruleNBTArray
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTArrayParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTArray_5=ruleNBTArray();

                    state._fsp--;


                    			current = this_NBTArray_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:170:3: this_NBTBool_6= ruleNBTBool
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTBoolParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTBool_6=ruleNBTBool();

                    state._fsp--;


                    			current = this_NBTBool_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:179:3: this_NBTNumber_7= ruleNBTNumber
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTNumberParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTNumber_7=ruleNBTNumber();

                    state._fsp--;


                    			current = this_NBTNumber_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMCEntity.g:188:3: this_NamespacedKey_8= ruleNamespacedKey
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNamespacedKeyParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamespacedKey_8=ruleNamespacedKey();

                    state._fsp--;


                    			current = this_NamespacedKey_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMCEntity.g:197:3: this_NBTString_9= ruleNBTString
                    {

                    			newCompositeNode(grammarAccess.getNBTValueAccess().getNBTStringParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTString_9=ruleNBTString();

                    state._fsp--;


                    			current = this_NBTString_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTValue"


    // $ANTLR start "entryRuleNBTCompound"
    // InternalMCEntity.g:209:1: entryRuleNBTCompound returns [EObject current=null] : iv_ruleNBTCompound= ruleNBTCompound EOF ;
    public final EObject entryRuleNBTCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTCompound = null;


        try {
            // InternalMCEntity.g:209:52: (iv_ruleNBTCompound= ruleNBTCompound EOF )
            // InternalMCEntity.g:210:2: iv_ruleNBTCompound= ruleNBTCompound EOF
            {
             newCompositeNode(grammarAccess.getNBTCompoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTCompound=ruleNBTCompound();

            state._fsp--;

             current =iv_ruleNBTCompound; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTCompound"


    // $ANTLR start "ruleNBTCompound"
    // InternalMCEntity.g:216:1: ruleNBTCompound returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ;
    public final EObject ruleNBTCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:222:2: ( (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            // InternalMCEntity.g:223:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            {
            // InternalMCEntity.g:223:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            // InternalMCEntity.g:224:3: otherlv_0= '{' () ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNBTCompoundAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMCEntity.g:228:3: ()
            // InternalMCEntity.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTCompoundAccess().getNBTCompoundAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:235:3: ( ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==RULE_ID||(LA4_0>=43 && LA4_0<=45)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMCEntity.g:236:4: ( (lv_entries_2_0= ruleNBTEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:236:4: ( (lv_entries_2_0= ruleNBTEntry ) )
                    // InternalMCEntity.g:237:5: (lv_entries_2_0= ruleNBTEntry )
                    {
                    // InternalMCEntity.g:237:5: (lv_entries_2_0= ruleNBTEntry )
                    // InternalMCEntity.g:238:6: lv_entries_2_0= ruleNBTEntry
                    {

                    						newCompositeNode(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_entries_2_0=ruleNBTEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTCompoundRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_2_0,
                    							"com.raptor.mcentity.MCEntity.NBTEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMCEntity.g:255:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==32) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_STRING||LA2_1==RULE_ID||(LA2_1>=43 && LA2_1<=45)) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMCEntity.g:256:5: otherlv_3= ',' ( (lv_entries_4_0= ruleNBTEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:260:5: ( (lv_entries_4_0= ruleNBTEntry ) )
                    	    // InternalMCEntity.g:261:6: (lv_entries_4_0= ruleNBTEntry )
                    	    {
                    	    // InternalMCEntity.g:261:6: (lv_entries_4_0= ruleNBTEntry )
                    	    // InternalMCEntity.g:262:7: lv_entries_4_0= ruleNBTEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_entries_4_0=ruleNBTEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNBTCompoundRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_4_0,
                    	    								"com.raptor.mcentity.MCEntity.NBTEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // InternalMCEntity.g:280:4: (otherlv_5= ',' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==32) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMCEntity.g:281:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNBTCompoundAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTCompound"


    // $ANTLR start "entryRuleNBTEntry"
    // InternalMCEntity.g:295:1: entryRuleNBTEntry returns [EObject current=null] : iv_ruleNBTEntry= ruleNBTEntry EOF ;
    public final EObject entryRuleNBTEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTEntry = null;


        try {
            // InternalMCEntity.g:295:49: (iv_ruleNBTEntry= ruleNBTEntry EOF )
            // InternalMCEntity.g:296:2: iv_ruleNBTEntry= ruleNBTEntry EOF
            {
             newCompositeNode(grammarAccess.getNBTEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTEntry=ruleNBTEntry();

            state._fsp--;

             current =iv_ruleNBTEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTEntry"


    // $ANTLR start "ruleNBTEntry"
    // InternalMCEntity.g:302:1: ruleNBTEntry returns [EObject current=null] : ( ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNBTValue ) ) ) ;
    public final EObject ruleNBTEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_1=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_2 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:308:2: ( ( ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNBTValue ) ) ) )
            // InternalMCEntity.g:309:2: ( ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNBTValue ) ) )
            {
            // InternalMCEntity.g:309:2: ( ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNBTValue ) ) )
            // InternalMCEntity.g:310:3: ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNBTValue ) )
            {
            // InternalMCEntity.g:310:3: ( ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) ) )
            // InternalMCEntity.g:311:4: ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) )
            {
            // InternalMCEntity.g:311:4: ( (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString ) )
            // InternalMCEntity.g:312:5: (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString )
            {
            // InternalMCEntity.g:312:5: (lv_key_0_1= RULE_STRING | lv_key_0_2= ruleUnquotedString )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||(LA5_0>=43 && LA5_0<=45)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMCEntity.g:313:6: lv_key_0_1= RULE_STRING
                    {
                    lv_key_0_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_key_0_1, grammarAccess.getNBTEntryAccess().getKeySTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNBTEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_0_1,
                    							"com.raptor.mcentity.MCEntity.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:328:6: lv_key_0_2= ruleUnquotedString
                    {

                    						newCompositeNode(grammarAccess.getNBTEntryAccess().getKeyUnquotedStringParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_7);
                    lv_key_0_2=ruleUnquotedString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_0_2,
                    							"com.raptor.mcentity.MCEntity.UnquotedString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNBTEntryAccess().getColonKeyword_1());
            		
            // InternalMCEntity.g:350:3: ( (lv_value_2_0= ruleNBTValue ) )
            // InternalMCEntity.g:351:4: (lv_value_2_0= ruleNBTValue )
            {
            // InternalMCEntity.g:351:4: (lv_value_2_0= ruleNBTValue )
            // InternalMCEntity.g:352:5: lv_value_2_0= ruleNBTValue
            {

            					newCompositeNode(grammarAccess.getNBTEntryAccess().getValueNBTValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleNBTValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNBTEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.raptor.mcentity.MCEntity.NBTValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTEntry"


    // $ANTLR start "entryRuleNBTByteArray"
    // InternalMCEntity.g:373:1: entryRuleNBTByteArray returns [EObject current=null] : iv_ruleNBTByteArray= ruleNBTByteArray EOF ;
    public final EObject entryRuleNBTByteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTByteArray = null;


        try {
            // InternalMCEntity.g:373:53: (iv_ruleNBTByteArray= ruleNBTByteArray EOF )
            // InternalMCEntity.g:374:2: iv_ruleNBTByteArray= ruleNBTByteArray EOF
            {
             newCompositeNode(grammarAccess.getNBTByteArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTByteArray=ruleNBTByteArray();

            state._fsp--;

             current =iv_ruleNBTByteArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTByteArray"


    // $ANTLR start "ruleNBTByteArray"
    // InternalMCEntity.g:380:1: ruleNBTByteArray returns [EObject current=null] : (this_NBT_BYTE_ARRAY_START_0= RULE_NBT_BYTE_ARRAY_START () ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) ;
    public final EObject ruleNBTByteArray() throws RecognitionException {
        EObject current = null;

        Token this_NBT_BYTE_ARRAY_START_0=null;
        Token lv_elements_2_0=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMCEntity.g:386:2: ( (this_NBT_BYTE_ARRAY_START_0= RULE_NBT_BYTE_ARRAY_START () ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) )
            // InternalMCEntity.g:387:2: (this_NBT_BYTE_ARRAY_START_0= RULE_NBT_BYTE_ARRAY_START () ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            {
            // InternalMCEntity.g:387:2: (this_NBT_BYTE_ARRAY_START_0= RULE_NBT_BYTE_ARRAY_START () ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            // InternalMCEntity.g:388:3: this_NBT_BYTE_ARRAY_START_0= RULE_NBT_BYTE_ARRAY_START () ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']'
            {
            this_NBT_BYTE_ARRAY_START_0=(Token)match(input,RULE_NBT_BYTE_ARRAY_START,FOLLOW_9); 

            			newLeafNode(this_NBT_BYTE_ARRAY_START_0, grammarAccess.getNBTByteArrayAccess().getNBT_BYTE_ARRAY_STARTTerminalRuleCall_0());
            		
            // InternalMCEntity.g:392:3: ()
            // InternalMCEntity.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTByteArrayAccess().getNBTByteArrayAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:399:3: ( ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_BYTE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMCEntity.g:400:4: ( (lv_elements_2_0= RULE_BYTE ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:400:4: ( (lv_elements_2_0= RULE_BYTE ) )
                    // InternalMCEntity.g:401:5: (lv_elements_2_0= RULE_BYTE )
                    {
                    // InternalMCEntity.g:401:5: (lv_elements_2_0= RULE_BYTE )
                    // InternalMCEntity.g:402:6: lv_elements_2_0= RULE_BYTE
                    {
                    lv_elements_2_0=(Token)match(input,RULE_BYTE,FOLLOW_10); 

                    						newLeafNode(lv_elements_2_0, grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNBTByteArrayRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"com.raptor.mcentity.MCEntity.BYTE");
                    					

                    }


                    }

                    // InternalMCEntity.g:418:4: (otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==32) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==RULE_BYTE) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMCEntity.g:419:5: otherlv_3= ',' ( (lv_elements_4_0= RULE_BYTE ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:423:5: ( (lv_elements_4_0= RULE_BYTE ) )
                    	    // InternalMCEntity.g:424:6: (lv_elements_4_0= RULE_BYTE )
                    	    {
                    	    // InternalMCEntity.g:424:6: (lv_elements_4_0= RULE_BYTE )
                    	    // InternalMCEntity.g:425:7: lv_elements_4_0= RULE_BYTE
                    	    {
                    	    lv_elements_4_0=(Token)match(input,RULE_BYTE,FOLLOW_10); 

                    	    							newLeafNode(lv_elements_4_0, grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNBTByteArrayRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"com.raptor.mcentity.MCEntity.BYTE");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalMCEntity.g:442:4: (otherlv_5= ',' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==32) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMCEntity.g:443:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNBTByteArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTByteArray"


    // $ANTLR start "entryRuleNBTLongArray"
    // InternalMCEntity.g:457:1: entryRuleNBTLongArray returns [EObject current=null] : iv_ruleNBTLongArray= ruleNBTLongArray EOF ;
    public final EObject entryRuleNBTLongArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTLongArray = null;


        try {
            // InternalMCEntity.g:457:53: (iv_ruleNBTLongArray= ruleNBTLongArray EOF )
            // InternalMCEntity.g:458:2: iv_ruleNBTLongArray= ruleNBTLongArray EOF
            {
             newCompositeNode(grammarAccess.getNBTLongArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTLongArray=ruleNBTLongArray();

            state._fsp--;

             current =iv_ruleNBTLongArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTLongArray"


    // $ANTLR start "ruleNBTLongArray"
    // InternalMCEntity.g:464:1: ruleNBTLongArray returns [EObject current=null] : (this_NBT_LONG_ARRAY_START_0= RULE_NBT_LONG_ARRAY_START () ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) ;
    public final EObject ruleNBTLongArray() throws RecognitionException {
        EObject current = null;

        Token this_NBT_LONG_ARRAY_START_0=null;
        Token lv_elements_2_0=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMCEntity.g:470:2: ( (this_NBT_LONG_ARRAY_START_0= RULE_NBT_LONG_ARRAY_START () ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) )
            // InternalMCEntity.g:471:2: (this_NBT_LONG_ARRAY_START_0= RULE_NBT_LONG_ARRAY_START () ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            {
            // InternalMCEntity.g:471:2: (this_NBT_LONG_ARRAY_START_0= RULE_NBT_LONG_ARRAY_START () ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            // InternalMCEntity.g:472:3: this_NBT_LONG_ARRAY_START_0= RULE_NBT_LONG_ARRAY_START () ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']'
            {
            this_NBT_LONG_ARRAY_START_0=(Token)match(input,RULE_NBT_LONG_ARRAY_START,FOLLOW_13); 

            			newLeafNode(this_NBT_LONG_ARRAY_START_0, grammarAccess.getNBTLongArrayAccess().getNBT_LONG_ARRAY_STARTTerminalRuleCall_0());
            		
            // InternalMCEntity.g:476:3: ()
            // InternalMCEntity.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTLongArrayAccess().getNBTLongArrayAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:483:3: ( ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LONG) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCEntity.g:484:4: ( (lv_elements_2_0= RULE_LONG ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:484:4: ( (lv_elements_2_0= RULE_LONG ) )
                    // InternalMCEntity.g:485:5: (lv_elements_2_0= RULE_LONG )
                    {
                    // InternalMCEntity.g:485:5: (lv_elements_2_0= RULE_LONG )
                    // InternalMCEntity.g:486:6: lv_elements_2_0= RULE_LONG
                    {
                    lv_elements_2_0=(Token)match(input,RULE_LONG,FOLLOW_10); 

                    						newLeafNode(lv_elements_2_0, grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNBTLongArrayRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"com.raptor.mcentity.MCEntity.LONG");
                    					

                    }


                    }

                    // InternalMCEntity.g:502:4: (otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==32) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==RULE_LONG) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMCEntity.g:503:5: otherlv_3= ',' ( (lv_elements_4_0= RULE_LONG ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:507:5: ( (lv_elements_4_0= RULE_LONG ) )
                    	    // InternalMCEntity.g:508:6: (lv_elements_4_0= RULE_LONG )
                    	    {
                    	    // InternalMCEntity.g:508:6: (lv_elements_4_0= RULE_LONG )
                    	    // InternalMCEntity.g:509:7: lv_elements_4_0= RULE_LONG
                    	    {
                    	    lv_elements_4_0=(Token)match(input,RULE_LONG,FOLLOW_10); 

                    	    							newLeafNode(lv_elements_4_0, grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNBTLongArrayRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"com.raptor.mcentity.MCEntity.LONG");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalMCEntity.g:526:4: (otherlv_5= ',' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==32) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMCEntity.g:527:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNBTLongArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTLongArray"


    // $ANTLR start "entryRuleNBTIntArray"
    // InternalMCEntity.g:541:1: entryRuleNBTIntArray returns [EObject current=null] : iv_ruleNBTIntArray= ruleNBTIntArray EOF ;
    public final EObject entryRuleNBTIntArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTIntArray = null;


        try {
            // InternalMCEntity.g:541:52: (iv_ruleNBTIntArray= ruleNBTIntArray EOF )
            // InternalMCEntity.g:542:2: iv_ruleNBTIntArray= ruleNBTIntArray EOF
            {
             newCompositeNode(grammarAccess.getNBTIntArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTIntArray=ruleNBTIntArray();

            state._fsp--;

             current =iv_ruleNBTIntArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTIntArray"


    // $ANTLR start "ruleNBTIntArray"
    // InternalMCEntity.g:548:1: ruleNBTIntArray returns [EObject current=null] : (this_NBT_INT_ARRAY_START_0= RULE_NBT_INT_ARRAY_START () ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) ;
    public final EObject ruleNBTIntArray() throws RecognitionException {
        EObject current = null;

        Token this_NBT_INT_ARRAY_START_0=null;
        Token lv_elements_2_0=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMCEntity.g:554:2: ( (this_NBT_INT_ARRAY_START_0= RULE_NBT_INT_ARRAY_START () ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) )
            // InternalMCEntity.g:555:2: (this_NBT_INT_ARRAY_START_0= RULE_NBT_INT_ARRAY_START () ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            {
            // InternalMCEntity.g:555:2: (this_NBT_INT_ARRAY_START_0= RULE_NBT_INT_ARRAY_START () ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            // InternalMCEntity.g:556:3: this_NBT_INT_ARRAY_START_0= RULE_NBT_INT_ARRAY_START () ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']'
            {
            this_NBT_INT_ARRAY_START_0=(Token)match(input,RULE_NBT_INT_ARRAY_START,FOLLOW_15); 

            			newLeafNode(this_NBT_INT_ARRAY_START_0, grammarAccess.getNBTIntArrayAccess().getNBT_INT_ARRAY_STARTTerminalRuleCall_0());
            		
            // InternalMCEntity.g:560:3: ()
            // InternalMCEntity.g:561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTIntArrayAccess().getNBTIntArrayAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:567:3: ( ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMCEntity.g:568:4: ( (lv_elements_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:568:4: ( (lv_elements_2_0= RULE_INT ) )
                    // InternalMCEntity.g:569:5: (lv_elements_2_0= RULE_INT )
                    {
                    // InternalMCEntity.g:569:5: (lv_elements_2_0= RULE_INT )
                    // InternalMCEntity.g:570:6: lv_elements_2_0= RULE_INT
                    {
                    lv_elements_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_elements_2_0, grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNBTIntArrayRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"com.raptor.mcentity.MCEntity.INT");
                    					

                    }


                    }

                    // InternalMCEntity.g:586:4: (otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==32) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==RULE_INT) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMCEntity.g:587:5: otherlv_3= ',' ( (lv_elements_4_0= RULE_INT ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:591:5: ( (lv_elements_4_0= RULE_INT ) )
                    	    // InternalMCEntity.g:592:6: (lv_elements_4_0= RULE_INT )
                    	    {
                    	    // InternalMCEntity.g:592:6: (lv_elements_4_0= RULE_INT )
                    	    // InternalMCEntity.g:593:7: lv_elements_4_0= RULE_INT
                    	    {
                    	    lv_elements_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    	    							newLeafNode(lv_elements_4_0, grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNBTIntArrayRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"com.raptor.mcentity.MCEntity.INT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalMCEntity.g:610:4: (otherlv_5= ',' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==32) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMCEntity.g:611:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNBTIntArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTIntArray"


    // $ANTLR start "entryRuleNBTArray"
    // InternalMCEntity.g:625:1: entryRuleNBTArray returns [EObject current=null] : iv_ruleNBTArray= ruleNBTArray EOF ;
    public final EObject entryRuleNBTArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTArray = null;


        try {
            // InternalMCEntity.g:625:49: (iv_ruleNBTArray= ruleNBTArray EOF )
            // InternalMCEntity.g:626:2: iv_ruleNBTArray= ruleNBTArray EOF
            {
             newCompositeNode(grammarAccess.getNBTArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTArray=ruleNBTArray();

            state._fsp--;

             current =iv_ruleNBTArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTArray"


    // $ANTLR start "ruleNBTArray"
    // InternalMCEntity.g:632:1: ruleNBTArray returns [EObject current=null] : (otherlv_0= '[' () ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )? otherlv_27= ']' ) ;
    public final EObject ruleNBTArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_17_1 = null;

        EObject lv_elements_17_2 = null;

        EObject lv_elements_19_1 = null;

        EObject lv_elements_19_2 = null;

        EObject lv_elements_20_0 = null;

        EObject lv_elements_22_0 = null;

        EObject lv_elements_23_0 = null;

        EObject lv_elements_25_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:638:2: ( (otherlv_0= '[' () ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )? otherlv_27= ']' ) )
            // InternalMCEntity.g:639:2: (otherlv_0= '[' () ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )? otherlv_27= ']' )
            {
            // InternalMCEntity.g:639:2: (otherlv_0= '[' () ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )? otherlv_27= ']' )
            // InternalMCEntity.g:640:3: otherlv_0= '[' () ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )? otherlv_27= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getNBTArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMCEntity.g:644:3: ()
            // InternalMCEntity.g:645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTArrayAccess().getNBTArrayAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:651:3: ( ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_JSON_TEXT_BEGIN_OBJ)||LA27_0==RULE_JSON_TEXT_BEGIN_ARRAY||LA27_0==RULE_JSON_TEXT_BEGIN_STR||LA27_0==RULE_ID||LA27_0==31||(LA27_0>=36 && LA27_0<=38)||(LA27_0>=43 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMCEntity.g:652:4: ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) ) (otherlv_26= ',' )?
                    {
                    // InternalMCEntity.g:652:4: ( ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* ) | ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* ) | ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* ) | ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* ) | ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* ) | ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* ) | ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* ) | ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* ) )
                    int alt25=8;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt25=1;
                        }
                        break;
                    case RULE_NBT_BYTE_ARRAY_START:
                        {
                        alt25=2;
                        }
                        break;
                    case RULE_NBT_LONG_ARRAY_START:
                        {
                        alt25=3;
                        }
                        break;
                    case RULE_NBT_INT_ARRAY_START:
                        {
                        alt25=4;
                        }
                        break;
                    case 36:
                        {
                        alt25=5;
                        }
                        break;
                    case RULE_BYTE:
                    case RULE_LONG:
                    case RULE_INT:
                    case RULE_FLOAT:
                    case RULE_DOUBLE:
                    case RULE_SHORT:
                    case 37:
                    case 38:
                        {
                        alt25=6;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_SINGLE_STRING:
                    case RULE_ID:
                    case 43:
                    case 44:
                    case 45:
                        {
                        alt25=7;
                        }
                        break;
                    case RULE_JSON_TEXT_BEGIN_OBJ:
                    case RULE_JSON_TEXT_BEGIN_ARRAY:
                    case RULE_JSON_TEXT_BEGIN_STR:
                        {
                        alt25=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalMCEntity.g:653:5: ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* )
                            {
                            // InternalMCEntity.g:653:5: ( ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )* )
                            // InternalMCEntity.g:654:6: ( (lv_elements_2_0= ruleNBTCompound ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )*
                            {
                            // InternalMCEntity.g:654:6: ( (lv_elements_2_0= ruleNBTCompound ) )
                            // InternalMCEntity.g:655:7: (lv_elements_2_0= ruleNBTCompound )
                            {
                            // InternalMCEntity.g:655:7: (lv_elements_2_0= ruleNBTCompound )
                            // InternalMCEntity.g:656:8: lv_elements_2_0= ruleNBTCompound
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_2_0=ruleNBTCompound();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_2_0,
                            									"com.raptor.mcentity.MCEntity.NBTCompound");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:673:6: (otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==32) ) {
                                    int LA15_1 = input.LA(2);

                                    if ( (LA15_1==31) ) {
                                        alt15=1;
                                    }


                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalMCEntity.g:674:7: otherlv_3= ',' ( (lv_elements_4_0= ruleNBTCompound ) )
                            	    {
                            	    otherlv_3=(Token)match(input,32,FOLLOW_18); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_0_1_0());
                            	    						
                            	    // InternalMCEntity.g:678:7: ( (lv_elements_4_0= ruleNBTCompound ) )
                            	    // InternalMCEntity.g:679:8: (lv_elements_4_0= ruleNBTCompound )
                            	    {
                            	    // InternalMCEntity.g:679:8: (lv_elements_4_0= ruleNBTCompound )
                            	    // InternalMCEntity.g:680:9: lv_elements_4_0= ruleNBTCompound
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_4_0=ruleNBTCompound();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_4_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTCompound");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:700:5: ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* )
                            {
                            // InternalMCEntity.g:700:5: ( ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )* )
                            // InternalMCEntity.g:701:6: ( (lv_elements_5_0= ruleNBTByteArray ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )*
                            {
                            // InternalMCEntity.g:701:6: ( (lv_elements_5_0= ruleNBTByteArray ) )
                            // InternalMCEntity.g:702:7: (lv_elements_5_0= ruleNBTByteArray )
                            {
                            // InternalMCEntity.g:702:7: (lv_elements_5_0= ruleNBTByteArray )
                            // InternalMCEntity.g:703:8: lv_elements_5_0= ruleNBTByteArray
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_5_0=ruleNBTByteArray();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_5_0,
                            									"com.raptor.mcentity.MCEntity.NBTByteArray");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:720:6: (otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==32) ) {
                                    int LA16_1 = input.LA(2);

                                    if ( (LA16_1==RULE_NBT_BYTE_ARRAY_START) ) {
                                        alt16=1;
                                    }


                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalMCEntity.g:721:7: otherlv_6= ',' ( (lv_elements_7_0= ruleNBTByteArray ) )
                            	    {
                            	    otherlv_6=(Token)match(input,32,FOLLOW_19); 

                            	    							newLeafNode(otherlv_6, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_1_1_0());
                            	    						
                            	    // InternalMCEntity.g:725:7: ( (lv_elements_7_0= ruleNBTByteArray ) )
                            	    // InternalMCEntity.g:726:8: (lv_elements_7_0= ruleNBTByteArray )
                            	    {
                            	    // InternalMCEntity.g:726:8: (lv_elements_7_0= ruleNBTByteArray )
                            	    // InternalMCEntity.g:727:9: lv_elements_7_0= ruleNBTByteArray
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_7_0=ruleNBTByteArray();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_7_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTByteArray");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // InternalMCEntity.g:747:5: ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* )
                            {
                            // InternalMCEntity.g:747:5: ( ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )* )
                            // InternalMCEntity.g:748:6: ( (lv_elements_8_0= ruleNBTLongArray ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )*
                            {
                            // InternalMCEntity.g:748:6: ( (lv_elements_8_0= ruleNBTLongArray ) )
                            // InternalMCEntity.g:749:7: (lv_elements_8_0= ruleNBTLongArray )
                            {
                            // InternalMCEntity.g:749:7: (lv_elements_8_0= ruleNBTLongArray )
                            // InternalMCEntity.g:750:8: lv_elements_8_0= ruleNBTLongArray
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_8_0=ruleNBTLongArray();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_8_0,
                            									"com.raptor.mcentity.MCEntity.NBTLongArray");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:767:6: (otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==32) ) {
                                    int LA17_1 = input.LA(2);

                                    if ( (LA17_1==RULE_NBT_LONG_ARRAY_START) ) {
                                        alt17=1;
                                    }


                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalMCEntity.g:768:7: otherlv_9= ',' ( (lv_elements_10_0= ruleNBTLongArray ) )
                            	    {
                            	    otherlv_9=(Token)match(input,32,FOLLOW_20); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_2_1_0());
                            	    						
                            	    // InternalMCEntity.g:772:7: ( (lv_elements_10_0= ruleNBTLongArray ) )
                            	    // InternalMCEntity.g:773:8: (lv_elements_10_0= ruleNBTLongArray )
                            	    {
                            	    // InternalMCEntity.g:773:8: (lv_elements_10_0= ruleNBTLongArray )
                            	    // InternalMCEntity.g:774:9: lv_elements_10_0= ruleNBTLongArray
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_10_0=ruleNBTLongArray();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_10_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTLongArray");
                            	    									afterParserOrEnumRuleCall();
                            	    								

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
                            break;
                        case 4 :
                            // InternalMCEntity.g:794:5: ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* )
                            {
                            // InternalMCEntity.g:794:5: ( ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )* )
                            // InternalMCEntity.g:795:6: ( (lv_elements_11_0= ruleNBTIntArray ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )*
                            {
                            // InternalMCEntity.g:795:6: ( (lv_elements_11_0= ruleNBTIntArray ) )
                            // InternalMCEntity.g:796:7: (lv_elements_11_0= ruleNBTIntArray )
                            {
                            // InternalMCEntity.g:796:7: (lv_elements_11_0= ruleNBTIntArray )
                            // InternalMCEntity.g:797:8: lv_elements_11_0= ruleNBTIntArray
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_11_0=ruleNBTIntArray();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_11_0,
                            									"com.raptor.mcentity.MCEntity.NBTIntArray");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:814:6: (otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==32) ) {
                                    int LA18_1 = input.LA(2);

                                    if ( (LA18_1==RULE_NBT_INT_ARRAY_START) ) {
                                        alt18=1;
                                    }


                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalMCEntity.g:815:7: otherlv_12= ',' ( (lv_elements_13_0= ruleNBTIntArray ) )
                            	    {
                            	    otherlv_12=(Token)match(input,32,FOLLOW_21); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_3_1_0());
                            	    						
                            	    // InternalMCEntity.g:819:7: ( (lv_elements_13_0= ruleNBTIntArray ) )
                            	    // InternalMCEntity.g:820:8: (lv_elements_13_0= ruleNBTIntArray )
                            	    {
                            	    // InternalMCEntity.g:820:8: (lv_elements_13_0= ruleNBTIntArray )
                            	    // InternalMCEntity.g:821:9: lv_elements_13_0= ruleNBTIntArray
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_13_0=ruleNBTIntArray();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_13_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTIntArray");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 5 :
                            // InternalMCEntity.g:841:5: ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* )
                            {
                            // InternalMCEntity.g:841:5: ( ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )* )
                            // InternalMCEntity.g:842:6: ( (lv_elements_14_0= ruleNBTArray ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )*
                            {
                            // InternalMCEntity.g:842:6: ( (lv_elements_14_0= ruleNBTArray ) )
                            // InternalMCEntity.g:843:7: (lv_elements_14_0= ruleNBTArray )
                            {
                            // InternalMCEntity.g:843:7: (lv_elements_14_0= ruleNBTArray )
                            // InternalMCEntity.g:844:8: lv_elements_14_0= ruleNBTArray
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_14_0=ruleNBTArray();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_14_0,
                            									"com.raptor.mcentity.MCEntity.NBTArray");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:861:6: (otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==32) ) {
                                    int LA19_1 = input.LA(2);

                                    if ( (LA19_1==36) ) {
                                        alt19=1;
                                    }


                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalMCEntity.g:862:7: otherlv_15= ',' ( (lv_elements_16_0= ruleNBTArray ) )
                            	    {
                            	    otherlv_15=(Token)match(input,32,FOLLOW_22); 

                            	    							newLeafNode(otherlv_15, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_4_1_0());
                            	    						
                            	    // InternalMCEntity.g:866:7: ( (lv_elements_16_0= ruleNBTArray ) )
                            	    // InternalMCEntity.g:867:8: (lv_elements_16_0= ruleNBTArray )
                            	    {
                            	    // InternalMCEntity.g:867:8: (lv_elements_16_0= ruleNBTArray )
                            	    // InternalMCEntity.g:868:9: lv_elements_16_0= ruleNBTArray
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_16_0=ruleNBTArray();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_16_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTArray");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 6 :
                            // InternalMCEntity.g:888:5: ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* )
                            {
                            // InternalMCEntity.g:888:5: ( ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )* )
                            // InternalMCEntity.g:889:6: ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) ) (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )*
                            {
                            // InternalMCEntity.g:889:6: ( ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) ) )
                            // InternalMCEntity.g:890:7: ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) )
                            {
                            // InternalMCEntity.g:890:7: ( (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber ) )
                            // InternalMCEntity.g:891:8: (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber )
                            {
                            // InternalMCEntity.g:891:8: (lv_elements_17_1= ruleNBTBool | lv_elements_17_2= ruleNBTNumber )
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                                alt20=1;
                            }
                            else if ( (LA20_0==RULE_BYTE||LA20_0==RULE_LONG||(LA20_0>=RULE_INT && LA20_0<=RULE_SHORT)) ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 0, input);

                                throw nvae;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalMCEntity.g:892:9: lv_elements_17_1= ruleNBTBool
                                    {

                                    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_0_0_0());
                                    								
                                    pushFollow(FOLLOW_10);
                                    lv_elements_17_1=ruleNBTBool();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                                    									}
                                    									add(
                                    										current,
                                    										"elements",
                                    										lv_elements_17_1,
                                    										"com.raptor.mcentity.MCEntity.NBTBool");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalMCEntity.g:908:9: lv_elements_17_2= ruleNBTNumber
                                    {

                                    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_0_0_1());
                                    								
                                    pushFollow(FOLLOW_10);
                                    lv_elements_17_2=ruleNBTNumber();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                                    									}
                                    									add(
                                    										current,
                                    										"elements",
                                    										lv_elements_17_2,
                                    										"com.raptor.mcentity.MCEntity.NBTNumber");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalMCEntity.g:926:6: (otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==32) ) {
                                    int LA22_1 = input.LA(2);

                                    if ( (LA22_1==RULE_BYTE||LA22_1==RULE_LONG||(LA22_1>=RULE_INT && LA22_1<=RULE_SHORT)||(LA22_1>=37 && LA22_1<=38)) ) {
                                        alt22=1;
                                    }


                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalMCEntity.g:927:7: otherlv_18= ',' ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) )
                            	    {
                            	    otherlv_18=(Token)match(input,32,FOLLOW_23); 

                            	    							newLeafNode(otherlv_18, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_5_1_0());
                            	    						
                            	    // InternalMCEntity.g:931:7: ( ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) ) )
                            	    // InternalMCEntity.g:932:8: ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) )
                            	    {
                            	    // InternalMCEntity.g:932:8: ( (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber ) )
                            	    // InternalMCEntity.g:933:9: (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber )
                            	    {
                            	    // InternalMCEntity.g:933:9: (lv_elements_19_1= ruleNBTBool | lv_elements_19_2= ruleNBTNumber )
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                            	        alt21=1;
                            	    }
                            	    else if ( (LA21_0==RULE_BYTE||LA21_0==RULE_LONG||(LA21_0>=RULE_INT && LA21_0<=RULE_SHORT)) ) {
                            	        alt21=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 21, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt21) {
                            	        case 1 :
                            	            // InternalMCEntity.g:934:10: lv_elements_19_1= ruleNBTBool
                            	            {

                            	            										newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_1_1_0_0());
                            	            									
                            	            pushFollow(FOLLOW_10);
                            	            lv_elements_19_1=ruleNBTBool();

                            	            state._fsp--;


                            	            										if (current==null) {
                            	            											current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	            										}
                            	            										add(
                            	            											current,
                            	            											"elements",
                            	            											lv_elements_19_1,
                            	            											"com.raptor.mcentity.MCEntity.NBTBool");
                            	            										afterParserOrEnumRuleCall();
                            	            									

                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalMCEntity.g:950:10: lv_elements_19_2= ruleNBTNumber
                            	            {

                            	            										newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_1_1_0_1());
                            	            									
                            	            pushFollow(FOLLOW_10);
                            	            lv_elements_19_2=ruleNBTNumber();

                            	            state._fsp--;


                            	            										if (current==null) {
                            	            											current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	            										}
                            	            										add(
                            	            											current,
                            	            											"elements",
                            	            											lv_elements_19_2,
                            	            											"com.raptor.mcentity.MCEntity.NBTNumber");
                            	            										afterParserOrEnumRuleCall();
                            	            									

                            	            }
                            	            break;

                            	    }


                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 7 :
                            // InternalMCEntity.g:971:5: ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* )
                            {
                            // InternalMCEntity.g:971:5: ( ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )* )
                            // InternalMCEntity.g:972:6: ( (lv_elements_20_0= ruleNBTString ) ) (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )*
                            {
                            // InternalMCEntity.g:972:6: ( (lv_elements_20_0= ruleNBTString ) )
                            // InternalMCEntity.g:973:7: (lv_elements_20_0= ruleNBTString )
                            {
                            // InternalMCEntity.g:973:7: (lv_elements_20_0= ruleNBTString )
                            // InternalMCEntity.g:974:8: lv_elements_20_0= ruleNBTString
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_20_0=ruleNBTString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_20_0,
                            									"com.raptor.mcentity.MCEntity.NBTString");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:991:6: (otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==32) ) {
                                    int LA23_1 = input.LA(2);

                                    if ( (LA23_1==RULE_STRING||LA23_1==RULE_SINGLE_STRING||LA23_1==RULE_ID||(LA23_1>=43 && LA23_1<=45)) ) {
                                        alt23=1;
                                    }


                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalMCEntity.g:992:7: otherlv_21= ',' ( (lv_elements_22_0= ruleNBTString ) )
                            	    {
                            	    otherlv_21=(Token)match(input,32,FOLLOW_8); 

                            	    							newLeafNode(otherlv_21, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_6_1_0());
                            	    						
                            	    // InternalMCEntity.g:996:7: ( (lv_elements_22_0= ruleNBTString ) )
                            	    // InternalMCEntity.g:997:8: (lv_elements_22_0= ruleNBTString )
                            	    {
                            	    // InternalMCEntity.g:997:8: (lv_elements_22_0= ruleNBTString )
                            	    // InternalMCEntity.g:998:9: lv_elements_22_0= ruleNBTString
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_22_0=ruleNBTString();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_22_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTString");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 8 :
                            // InternalMCEntity.g:1018:5: ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* )
                            {
                            // InternalMCEntity.g:1018:5: ( ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )* )
                            // InternalMCEntity.g:1019:6: ( (lv_elements_23_0= ruleNBTJSONTextComponent ) ) (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )*
                            {
                            // InternalMCEntity.g:1019:6: ( (lv_elements_23_0= ruleNBTJSONTextComponent ) )
                            // InternalMCEntity.g:1020:7: (lv_elements_23_0= ruleNBTJSONTextComponent )
                            {
                            // InternalMCEntity.g:1020:7: (lv_elements_23_0= ruleNBTJSONTextComponent )
                            // InternalMCEntity.g:1021:8: lv_elements_23_0= ruleNBTJSONTextComponent
                            {

                            								newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_0_0());
                            							
                            pushFollow(FOLLOW_10);
                            lv_elements_23_0=ruleNBTJSONTextComponent();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_23_0,
                            									"com.raptor.mcentity.MCEntity.NBTJSONTextComponent");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMCEntity.g:1038:6: (otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==32) ) {
                                    int LA24_1 = input.LA(2);

                                    if ( (LA24_1==RULE_JSON_TEXT_BEGIN_OBJ||LA24_1==RULE_JSON_TEXT_BEGIN_ARRAY||LA24_1==RULE_JSON_TEXT_BEGIN_STR) ) {
                                        alt24=1;
                                    }


                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalMCEntity.g:1039:7: otherlv_24= ',' ( (lv_elements_25_0= ruleNBTJSONTextComponent ) )
                            	    {
                            	    otherlv_24=(Token)match(input,32,FOLLOW_24); 

                            	    							newLeafNode(otherlv_24, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_7_1_0());
                            	    						
                            	    // InternalMCEntity.g:1043:7: ( (lv_elements_25_0= ruleNBTJSONTextComponent ) )
                            	    // InternalMCEntity.g:1044:8: (lv_elements_25_0= ruleNBTJSONTextComponent )
                            	    {
                            	    // InternalMCEntity.g:1044:8: (lv_elements_25_0= ruleNBTJSONTextComponent )
                            	    // InternalMCEntity.g:1045:9: lv_elements_25_0= ruleNBTJSONTextComponent
                            	    {

                            	    									newCompositeNode(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_10);
                            	    lv_elements_25_0=ruleNBTJSONTextComponent();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNBTArrayRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_25_0,
                            	    										"com.raptor.mcentity.MCEntity.NBTJSONTextComponent");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // InternalMCEntity.g:1065:4: (otherlv_26= ',' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMCEntity.g:1066:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,32,FOLLOW_12); 

                            					newLeafNode(otherlv_26, grammarAccess.getNBTArrayAccess().getCommaKeyword_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getNBTArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTArray"


    // $ANTLR start "entryRuleNBTBool"
    // InternalMCEntity.g:1080:1: entryRuleNBTBool returns [EObject current=null] : iv_ruleNBTBool= ruleNBTBool EOF ;
    public final EObject entryRuleNBTBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTBool = null;


        try {
            // InternalMCEntity.g:1080:48: (iv_ruleNBTBool= ruleNBTBool EOF )
            // InternalMCEntity.g:1081:2: iv_ruleNBTBool= ruleNBTBool EOF
            {
             newCompositeNode(grammarAccess.getNBTBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTBool=ruleNBTBool();

            state._fsp--;

             current =iv_ruleNBTBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTBool"


    // $ANTLR start "ruleNBTBool"
    // InternalMCEntity.g:1087:1: ruleNBTBool returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) ;
    public final EObject ruleNBTBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1093:2: ( ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) )
            // InternalMCEntity.g:1094:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            {
            // InternalMCEntity.g:1094:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMCEntity.g:1095:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalMCEntity.g:1095:3: ( (lv_value_0_0= 'true' ) )
                    // InternalMCEntity.g:1096:4: (lv_value_0_0= 'true' )
                    {
                    // InternalMCEntity.g:1096:4: (lv_value_0_0= 'true' )
                    // InternalMCEntity.g:1097:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getNBTBoolAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNBTBoolRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1110:3: (otherlv_1= 'false' () )
                    {
                    // InternalMCEntity.g:1110:3: (otherlv_1= 'false' () )
                    // InternalMCEntity.g:1111:4: otherlv_1= 'false' ()
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNBTBoolAccess().getFalseKeyword_1_0());
                    			
                    // InternalMCEntity.g:1115:4: ()
                    // InternalMCEntity.g:1116:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNBTBoolAccess().getNBTBoolAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTBool"


    // $ANTLR start "entryRuleNBTNumber"
    // InternalMCEntity.g:1127:1: entryRuleNBTNumber returns [EObject current=null] : iv_ruleNBTNumber= ruleNBTNumber EOF ;
    public final EObject entryRuleNBTNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTNumber = null;


        try {
            // InternalMCEntity.g:1127:50: (iv_ruleNBTNumber= ruleNBTNumber EOF )
            // InternalMCEntity.g:1128:2: iv_ruleNBTNumber= ruleNBTNumber EOF
            {
             newCompositeNode(grammarAccess.getNBTNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTNumber=ruleNBTNumber();

            state._fsp--;

             current =iv_ruleNBTNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTNumber"


    // $ANTLR start "ruleNBTNumber"
    // InternalMCEntity.g:1134:1: ruleNBTNumber returns [EObject current=null] : (this_NBTFloat_0= ruleNBTFloat | this_NBTDouble_1= ruleNBTDouble | this_NBTLong_2= ruleNBTLong | this_NBTShort_3= ruleNBTShort | this_NBTByte_4= ruleNBTByte | this_NBTInt_5= ruleNBTInt ) ;
    public final EObject ruleNBTNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NBTFloat_0 = null;

        EObject this_NBTDouble_1 = null;

        EObject this_NBTLong_2 = null;

        EObject this_NBTShort_3 = null;

        EObject this_NBTByte_4 = null;

        EObject this_NBTInt_5 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1140:2: ( (this_NBTFloat_0= ruleNBTFloat | this_NBTDouble_1= ruleNBTDouble | this_NBTLong_2= ruleNBTLong | this_NBTShort_3= ruleNBTShort | this_NBTByte_4= ruleNBTByte | this_NBTInt_5= ruleNBTInt ) )
            // InternalMCEntity.g:1141:2: (this_NBTFloat_0= ruleNBTFloat | this_NBTDouble_1= ruleNBTDouble | this_NBTLong_2= ruleNBTLong | this_NBTShort_3= ruleNBTShort | this_NBTByte_4= ruleNBTByte | this_NBTInt_5= ruleNBTInt )
            {
            // InternalMCEntity.g:1141:2: (this_NBTFloat_0= ruleNBTFloat | this_NBTDouble_1= ruleNBTDouble | this_NBTLong_2= ruleNBTLong | this_NBTShort_3= ruleNBTShort | this_NBTByte_4= ruleNBTByte | this_NBTInt_5= ruleNBTInt )
            int alt29=6;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt29=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt29=2;
                }
                break;
            case RULE_LONG:
                {
                alt29=3;
                }
                break;
            case RULE_SHORT:
                {
                alt29=4;
                }
                break;
            case RULE_BYTE:
                {
                alt29=5;
                }
                break;
            case RULE_INT:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMCEntity.g:1142:3: this_NBTFloat_0= ruleNBTFloat
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTFloatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTFloat_0=ruleNBTFloat();

                    state._fsp--;


                    			current = this_NBTFloat_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1151:3: this_NBTDouble_1= ruleNBTDouble
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTDoubleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTDouble_1=ruleNBTDouble();

                    state._fsp--;


                    			current = this_NBTDouble_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1160:3: this_NBTLong_2= ruleNBTLong
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTLongParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTLong_2=ruleNBTLong();

                    state._fsp--;


                    			current = this_NBTLong_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1169:3: this_NBTShort_3= ruleNBTShort
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTShortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTShort_3=ruleNBTShort();

                    state._fsp--;


                    			current = this_NBTShort_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1178:3: this_NBTByte_4= ruleNBTByte
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTByteParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTByte_4=ruleNBTByte();

                    state._fsp--;


                    			current = this_NBTByte_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1187:3: this_NBTInt_5= ruleNBTInt
                    {

                    			newCompositeNode(grammarAccess.getNBTNumberAccess().getNBTIntParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTInt_5=ruleNBTInt();

                    state._fsp--;


                    			current = this_NBTInt_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTNumber"


    // $ANTLR start "entryRuleNBTFloat"
    // InternalMCEntity.g:1199:1: entryRuleNBTFloat returns [EObject current=null] : iv_ruleNBTFloat= ruleNBTFloat EOF ;
    public final EObject entryRuleNBTFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTFloat = null;


        try {
            // InternalMCEntity.g:1199:49: (iv_ruleNBTFloat= ruleNBTFloat EOF )
            // InternalMCEntity.g:1200:2: iv_ruleNBTFloat= ruleNBTFloat EOF
            {
             newCompositeNode(grammarAccess.getNBTFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTFloat=ruleNBTFloat();

            state._fsp--;

             current =iv_ruleNBTFloat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTFloat"


    // $ANTLR start "ruleNBTFloat"
    // InternalMCEntity.g:1206:1: ruleNBTFloat returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleNBTFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1212:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalMCEntity.g:1213:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalMCEntity.g:1213:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalMCEntity.g:1214:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalMCEntity.g:1214:3: (lv_value_0_0= RULE_FLOAT )
            // InternalMCEntity.g:1215:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTFloatAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTFloatRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.FLOAT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTFloat"


    // $ANTLR start "entryRuleNBTDouble"
    // InternalMCEntity.g:1234:1: entryRuleNBTDouble returns [EObject current=null] : iv_ruleNBTDouble= ruleNBTDouble EOF ;
    public final EObject entryRuleNBTDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTDouble = null;


        try {
            // InternalMCEntity.g:1234:50: (iv_ruleNBTDouble= ruleNBTDouble EOF )
            // InternalMCEntity.g:1235:2: iv_ruleNBTDouble= ruleNBTDouble EOF
            {
             newCompositeNode(grammarAccess.getNBTDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTDouble=ruleNBTDouble();

            state._fsp--;

             current =iv_ruleNBTDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTDouble"


    // $ANTLR start "ruleNBTDouble"
    // InternalMCEntity.g:1241:1: ruleNBTDouble returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNBTDouble() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1247:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalMCEntity.g:1248:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalMCEntity.g:1248:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalMCEntity.g:1249:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalMCEntity.g:1249:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalMCEntity.g:1250:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTDoubleAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTDoubleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTDouble"


    // $ANTLR start "entryRuleNBTLong"
    // InternalMCEntity.g:1269:1: entryRuleNBTLong returns [EObject current=null] : iv_ruleNBTLong= ruleNBTLong EOF ;
    public final EObject entryRuleNBTLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTLong = null;


        try {
            // InternalMCEntity.g:1269:48: (iv_ruleNBTLong= ruleNBTLong EOF )
            // InternalMCEntity.g:1270:2: iv_ruleNBTLong= ruleNBTLong EOF
            {
             newCompositeNode(grammarAccess.getNBTLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTLong=ruleNBTLong();

            state._fsp--;

             current =iv_ruleNBTLong; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTLong"


    // $ANTLR start "ruleNBTLong"
    // InternalMCEntity.g:1276:1: ruleNBTLong returns [EObject current=null] : ( (lv_value_0_0= RULE_LONG ) ) ;
    public final EObject ruleNBTLong() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1282:2: ( ( (lv_value_0_0= RULE_LONG ) ) )
            // InternalMCEntity.g:1283:2: ( (lv_value_0_0= RULE_LONG ) )
            {
            // InternalMCEntity.g:1283:2: ( (lv_value_0_0= RULE_LONG ) )
            // InternalMCEntity.g:1284:3: (lv_value_0_0= RULE_LONG )
            {
            // InternalMCEntity.g:1284:3: (lv_value_0_0= RULE_LONG )
            // InternalMCEntity.g:1285:4: lv_value_0_0= RULE_LONG
            {
            lv_value_0_0=(Token)match(input,RULE_LONG,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTLongAccess().getValueLONGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTLongRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.LONG");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTLong"


    // $ANTLR start "entryRuleNBTShort"
    // InternalMCEntity.g:1304:1: entryRuleNBTShort returns [EObject current=null] : iv_ruleNBTShort= ruleNBTShort EOF ;
    public final EObject entryRuleNBTShort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTShort = null;


        try {
            // InternalMCEntity.g:1304:49: (iv_ruleNBTShort= ruleNBTShort EOF )
            // InternalMCEntity.g:1305:2: iv_ruleNBTShort= ruleNBTShort EOF
            {
             newCompositeNode(grammarAccess.getNBTShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTShort=ruleNBTShort();

            state._fsp--;

             current =iv_ruleNBTShort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTShort"


    // $ANTLR start "ruleNBTShort"
    // InternalMCEntity.g:1311:1: ruleNBTShort returns [EObject current=null] : ( (lv_value_0_0= RULE_SHORT ) ) ;
    public final EObject ruleNBTShort() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1317:2: ( ( (lv_value_0_0= RULE_SHORT ) ) )
            // InternalMCEntity.g:1318:2: ( (lv_value_0_0= RULE_SHORT ) )
            {
            // InternalMCEntity.g:1318:2: ( (lv_value_0_0= RULE_SHORT ) )
            // InternalMCEntity.g:1319:3: (lv_value_0_0= RULE_SHORT )
            {
            // InternalMCEntity.g:1319:3: (lv_value_0_0= RULE_SHORT )
            // InternalMCEntity.g:1320:4: lv_value_0_0= RULE_SHORT
            {
            lv_value_0_0=(Token)match(input,RULE_SHORT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTShortAccess().getValueSHORTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTShortRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.SHORT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTShort"


    // $ANTLR start "entryRuleNBTByte"
    // InternalMCEntity.g:1339:1: entryRuleNBTByte returns [EObject current=null] : iv_ruleNBTByte= ruleNBTByte EOF ;
    public final EObject entryRuleNBTByte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTByte = null;


        try {
            // InternalMCEntity.g:1339:48: (iv_ruleNBTByte= ruleNBTByte EOF )
            // InternalMCEntity.g:1340:2: iv_ruleNBTByte= ruleNBTByte EOF
            {
             newCompositeNode(grammarAccess.getNBTByteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTByte=ruleNBTByte();

            state._fsp--;

             current =iv_ruleNBTByte; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTByte"


    // $ANTLR start "ruleNBTByte"
    // InternalMCEntity.g:1346:1: ruleNBTByte returns [EObject current=null] : ( (lv_value_0_0= RULE_BYTE ) ) ;
    public final EObject ruleNBTByte() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1352:2: ( ( (lv_value_0_0= RULE_BYTE ) ) )
            // InternalMCEntity.g:1353:2: ( (lv_value_0_0= RULE_BYTE ) )
            {
            // InternalMCEntity.g:1353:2: ( (lv_value_0_0= RULE_BYTE ) )
            // InternalMCEntity.g:1354:3: (lv_value_0_0= RULE_BYTE )
            {
            // InternalMCEntity.g:1354:3: (lv_value_0_0= RULE_BYTE )
            // InternalMCEntity.g:1355:4: lv_value_0_0= RULE_BYTE
            {
            lv_value_0_0=(Token)match(input,RULE_BYTE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTByteAccess().getValueBYTETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTByteRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.BYTE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTByte"


    // $ANTLR start "entryRuleNBTInt"
    // InternalMCEntity.g:1374:1: entryRuleNBTInt returns [EObject current=null] : iv_ruleNBTInt= ruleNBTInt EOF ;
    public final EObject entryRuleNBTInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTInt = null;


        try {
            // InternalMCEntity.g:1374:47: (iv_ruleNBTInt= ruleNBTInt EOF )
            // InternalMCEntity.g:1375:2: iv_ruleNBTInt= ruleNBTInt EOF
            {
             newCompositeNode(grammarAccess.getNBTIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTInt=ruleNBTInt();

            state._fsp--;

             current =iv_ruleNBTInt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTInt"


    // $ANTLR start "ruleNBTInt"
    // InternalMCEntity.g:1381:1: ruleNBTInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNBTInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1387:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMCEntity.g:1388:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMCEntity.g:1388:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMCEntity.g:1389:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMCEntity.g:1389:3: (lv_value_0_0= RULE_INT )
            // InternalMCEntity.g:1390:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNBTIntAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNBTIntRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTInt"


    // $ANTLR start "entryRuleNBTString"
    // InternalMCEntity.g:1409:1: entryRuleNBTString returns [EObject current=null] : iv_ruleNBTString= ruleNBTString EOF ;
    public final EObject entryRuleNBTString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTString = null;


        try {
            // InternalMCEntity.g:1409:50: (iv_ruleNBTString= ruleNBTString EOF )
            // InternalMCEntity.g:1410:2: iv_ruleNBTString= ruleNBTString EOF
            {
             newCompositeNode(grammarAccess.getNBTStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTString=ruleNBTString();

            state._fsp--;

             current =iv_ruleNBTString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTString"


    // $ANTLR start "ruleNBTString"
    // InternalMCEntity.g:1416:1: ruleNBTString returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) ) ) ;
    public final EObject ruleNBTString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        AntlrDatatypeRuleToken lv_value_0_3 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1422:2: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) ) ) )
            // InternalMCEntity.g:1423:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) ) )
            {
            // InternalMCEntity.g:1423:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) ) )
            // InternalMCEntity.g:1424:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) )
            {
            // InternalMCEntity.g:1424:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString ) )
            // InternalMCEntity.g:1425:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString )
            {
            // InternalMCEntity.g:1425:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_SINGLE_STRING | lv_value_0_3= ruleUnquotedString )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_SINGLE_STRING:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
            case 43:
            case 44:
            case 45:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMCEntity.g:1426:5: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getNBTStringAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNBTStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"com.raptor.mcentity.MCEntity.STRING");
                    				

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1441:5: lv_value_0_2= RULE_SINGLE_STRING
                    {
                    lv_value_0_2=(Token)match(input,RULE_SINGLE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getNBTStringAccess().getValueSINGLE_STRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNBTStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"com.raptor.mcentity.MCEntity.SINGLE_STRING");
                    				

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1456:5: lv_value_0_3= ruleUnquotedString
                    {

                    					newCompositeNode(grammarAccess.getNBTStringAccess().getValueUnquotedStringParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_3=ruleUnquotedString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNBTStringRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_3,
                    						"com.raptor.mcentity.MCEntity.UnquotedString");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTString"


    // $ANTLR start "entryRuleNBTJSONTextComponent"
    // InternalMCEntity.g:1477:1: entryRuleNBTJSONTextComponent returns [EObject current=null] : iv_ruleNBTJSONTextComponent= ruleNBTJSONTextComponent EOF ;
    public final EObject entryRuleNBTJSONTextComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTJSONTextComponent = null;


        try {
            // InternalMCEntity.g:1477:61: (iv_ruleNBTJSONTextComponent= ruleNBTJSONTextComponent EOF )
            // InternalMCEntity.g:1478:2: iv_ruleNBTJSONTextComponent= ruleNBTJSONTextComponent EOF
            {
             newCompositeNode(grammarAccess.getNBTJSONTextComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTJSONTextComponent=ruleNBTJSONTextComponent();

            state._fsp--;

             current =iv_ruleNBTJSONTextComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponent"


    // $ANTLR start "ruleNBTJSONTextComponent"
    // InternalMCEntity.g:1484:1: ruleNBTJSONTextComponent returns [EObject current=null] : ( (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ ) | (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY ) | (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR ) ) ;
    public final EObject ruleNBTJSONTextComponent() throws RecognitionException {
        EObject current = null;

        Token this_JSON_TEXT_BEGIN_OBJ_0=null;
        Token this_JSON_TEXT_END_OBJ_2=null;
        Token this_JSON_TEXT_BEGIN_ARRAY_3=null;
        Token this_JSON_TEXT_END_ARRAY_5=null;
        Token this_JSON_TEXT_BEGIN_STR_6=null;
        Token this_JSON_TEXT_END_STR_8=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1490:2: ( ( (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ ) | (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY ) | (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR ) ) )
            // InternalMCEntity.g:1491:2: ( (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ ) | (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY ) | (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR ) )
            {
            // InternalMCEntity.g:1491:2: ( (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ ) | (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY ) | (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_JSON_TEXT_BEGIN_OBJ:
                {
                alt31=1;
                }
                break;
            case RULE_JSON_TEXT_BEGIN_ARRAY:
                {
                alt31=2;
                }
                break;
            case RULE_JSON_TEXT_BEGIN_STR:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMCEntity.g:1492:3: (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ )
                    {
                    // InternalMCEntity.g:1492:3: (this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ )
                    // InternalMCEntity.g:1493:4: this_JSON_TEXT_BEGIN_OBJ_0= RULE_JSON_TEXT_BEGIN_OBJ ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) ) this_JSON_TEXT_END_OBJ_2= RULE_JSON_TEXT_END_OBJ
                    {
                    this_JSON_TEXT_BEGIN_OBJ_0=(Token)match(input,RULE_JSON_TEXT_BEGIN_OBJ,FOLLOW_25); 

                    				newLeafNode(this_JSON_TEXT_BEGIN_OBJ_0, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_OBJTerminalRuleCall_0_0());
                    			
                    // InternalMCEntity.g:1497:4: ( (lv_value_1_0= ruleNBTJSONTextComponentObject ) )
                    // InternalMCEntity.g:1498:5: (lv_value_1_0= ruleNBTJSONTextComponentObject )
                    {
                    // InternalMCEntity.g:1498:5: (lv_value_1_0= ruleNBTJSONTextComponentObject )
                    // InternalMCEntity.g:1499:6: lv_value_1_0= ruleNBTJSONTextComponentObject
                    {

                    						newCompositeNode(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentObjectParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_value_1_0=ruleNBTJSONTextComponentObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"com.raptor.mcentity.MCEntity.NBTJSONTextComponentObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_JSON_TEXT_END_OBJ_2=(Token)match(input,RULE_JSON_TEXT_END_OBJ,FOLLOW_2); 

                    				newLeafNode(this_JSON_TEXT_END_OBJ_2, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_OBJTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1522:3: (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY )
                    {
                    // InternalMCEntity.g:1522:3: (this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY )
                    // InternalMCEntity.g:1523:4: this_JSON_TEXT_BEGIN_ARRAY_3= RULE_JSON_TEXT_BEGIN_ARRAY ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) ) this_JSON_TEXT_END_ARRAY_5= RULE_JSON_TEXT_END_ARRAY
                    {
                    this_JSON_TEXT_BEGIN_ARRAY_3=(Token)match(input,RULE_JSON_TEXT_BEGIN_ARRAY,FOLLOW_27); 

                    				newLeafNode(this_JSON_TEXT_BEGIN_ARRAY_3, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_ARRAYTerminalRuleCall_1_0());
                    			
                    // InternalMCEntity.g:1527:4: ( (lv_value_4_0= ruleNBTJSONTextComponentArray ) )
                    // InternalMCEntity.g:1528:5: (lv_value_4_0= ruleNBTJSONTextComponentArray )
                    {
                    // InternalMCEntity.g:1528:5: (lv_value_4_0= ruleNBTJSONTextComponentArray )
                    // InternalMCEntity.g:1529:6: lv_value_4_0= ruleNBTJSONTextComponentArray
                    {

                    						newCompositeNode(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentArrayParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_value_4_0=ruleNBTJSONTextComponentArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"com.raptor.mcentity.MCEntity.NBTJSONTextComponentArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_JSON_TEXT_END_ARRAY_5=(Token)match(input,RULE_JSON_TEXT_END_ARRAY,FOLLOW_2); 

                    				newLeafNode(this_JSON_TEXT_END_ARRAY_5, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_ARRAYTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1552:3: (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR )
                    {
                    // InternalMCEntity.g:1552:3: (this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR )
                    // InternalMCEntity.g:1553:4: this_JSON_TEXT_BEGIN_STR_6= RULE_JSON_TEXT_BEGIN_STR ( (lv_value_7_0= ruleNBTJSONTextComponentString ) ) this_JSON_TEXT_END_STR_8= RULE_JSON_TEXT_END_STR
                    {
                    this_JSON_TEXT_BEGIN_STR_6=(Token)match(input,RULE_JSON_TEXT_BEGIN_STR,FOLLOW_29); 

                    				newLeafNode(this_JSON_TEXT_BEGIN_STR_6, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_STRTerminalRuleCall_2_0());
                    			
                    // InternalMCEntity.g:1557:4: ( (lv_value_7_0= ruleNBTJSONTextComponentString ) )
                    // InternalMCEntity.g:1558:5: (lv_value_7_0= ruleNBTJSONTextComponentString )
                    {
                    // InternalMCEntity.g:1558:5: (lv_value_7_0= ruleNBTJSONTextComponentString )
                    // InternalMCEntity.g:1559:6: lv_value_7_0= ruleNBTJSONTextComponentString
                    {

                    						newCompositeNode(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_7_0=ruleNBTJSONTextComponentString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"com.raptor.mcentity.MCEntity.NBTJSONTextComponentString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_JSON_TEXT_END_STR_8=(Token)match(input,RULE_JSON_TEXT_END_STR,FOLLOW_2); 

                    				newLeafNode(this_JSON_TEXT_END_STR_8, grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_STRTerminalRuleCall_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTJSONTextComponent"


    // $ANTLR start "entryRuleNBTJSONTextComponentObject"
    // InternalMCEntity.g:1585:1: entryRuleNBTJSONTextComponentObject returns [EObject current=null] : iv_ruleNBTJSONTextComponentObject= ruleNBTJSONTextComponentObject EOF ;
    public final EObject entryRuleNBTJSONTextComponentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTJSONTextComponentObject = null;


        try {
            // InternalMCEntity.g:1585:67: (iv_ruleNBTJSONTextComponentObject= ruleNBTJSONTextComponentObject EOF )
            // InternalMCEntity.g:1586:2: iv_ruleNBTJSONTextComponentObject= ruleNBTJSONTextComponentObject EOF
            {
             newCompositeNode(grammarAccess.getNBTJSONTextComponentObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTJSONTextComponentObject=ruleNBTJSONTextComponentObject();

            state._fsp--;

             current =iv_ruleNBTJSONTextComponentObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentObject"


    // $ANTLR start "ruleNBTJSONTextComponentObject"
    // InternalMCEntity.g:1592:1: ruleNBTJSONTextComponentObject returns [EObject current=null] : ( () ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )? ) ;
    public final EObject ruleNBTJSONTextComponentObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1598:2: ( ( () ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )? ) )
            // InternalMCEntity.g:1599:2: ( () ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )? )
            {
            // InternalMCEntity.g:1599:2: ( () ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )? )
            // InternalMCEntity.g:1600:3: () ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )?
            {
            // InternalMCEntity.g:1600:3: ()
            // InternalMCEntity.g:1601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTJSONTextComponentObjectAccess().getJSONObjectAction_0(),
            					current);
            			

            }

            // InternalMCEntity.g:1607:3: ( ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMCEntity.g:1608:4: ( (lv_entries_1_0= ruleJSONEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )* (otherlv_4= ',' )?
                    {
                    // InternalMCEntity.g:1608:4: ( (lv_entries_1_0= ruleJSONEntry ) )
                    // InternalMCEntity.g:1609:5: (lv_entries_1_0= ruleJSONEntry )
                    {
                    // InternalMCEntity.g:1609:5: (lv_entries_1_0= ruleJSONEntry )
                    // InternalMCEntity.g:1610:6: lv_entries_1_0= ruleJSONEntry
                    {

                    						newCompositeNode(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_entries_1_0=ruleJSONEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentObjectRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_1_0,
                    							"com.raptor.mcentity.MCEntity.JSONEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMCEntity.g:1627:4: (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==32) ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==RULE_STRING) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMCEntity.g:1628:5: otherlv_2= ',' ( (lv_entries_3_0= ruleJSONEntry ) )
                    	    {
                    	    otherlv_2=(Token)match(input,32,FOLLOW_29); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMCEntity.g:1632:5: ( (lv_entries_3_0= ruleJSONEntry ) )
                    	    // InternalMCEntity.g:1633:6: (lv_entries_3_0= ruleJSONEntry )
                    	    {
                    	    // InternalMCEntity.g:1633:6: (lv_entries_3_0= ruleJSONEntry )
                    	    // InternalMCEntity.g:1634:7: lv_entries_3_0= ruleJSONEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_entries_3_0=ruleJSONEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_3_0,
                    	    								"com.raptor.mcentity.MCEntity.JSONEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // InternalMCEntity.g:1652:4: (otherlv_4= ',' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==32) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMCEntity.g:1653:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTJSONTextComponentObject"


    // $ANTLR start "entryRuleNBTJSONTextComponentString"
    // InternalMCEntity.g:1663:1: entryRuleNBTJSONTextComponentString returns [EObject current=null] : iv_ruleNBTJSONTextComponentString= ruleNBTJSONTextComponentString EOF ;
    public final EObject entryRuleNBTJSONTextComponentString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTJSONTextComponentString = null;


        try {
            // InternalMCEntity.g:1663:67: (iv_ruleNBTJSONTextComponentString= ruleNBTJSONTextComponentString EOF )
            // InternalMCEntity.g:1664:2: iv_ruleNBTJSONTextComponentString= ruleNBTJSONTextComponentString EOF
            {
             newCompositeNode(grammarAccess.getNBTJSONTextComponentStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTJSONTextComponentString=ruleNBTJSONTextComponentString();

            state._fsp--;

             current =iv_ruleNBTJSONTextComponentString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentString"


    // $ANTLR start "ruleNBTJSONTextComponentString"
    // InternalMCEntity.g:1670:1: ruleNBTJSONTextComponentString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNBTJSONTextComponentString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1676:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalMCEntity.g:1677:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalMCEntity.g:1677:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalMCEntity.g:1678:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalMCEntity.g:1678:3: ()
            // InternalMCEntity.g:1679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTJSONTextComponentStringAccess().getJSONStringAction_0(),
            					current);
            			

            }

            // InternalMCEntity.g:1685:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalMCEntity.g:1686:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalMCEntity.g:1686:4: (lv_value_1_0= RULE_STRING )
            // InternalMCEntity.g:1687:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNBTJSONTextComponentStringAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNBTJSONTextComponentStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"com.raptor.mcentity.MCEntity.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTJSONTextComponentString"


    // $ANTLR start "entryRuleNBTJSONTextComponentArray"
    // InternalMCEntity.g:1707:1: entryRuleNBTJSONTextComponentArray returns [EObject current=null] : iv_ruleNBTJSONTextComponentArray= ruleNBTJSONTextComponentArray EOF ;
    public final EObject entryRuleNBTJSONTextComponentArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNBTJSONTextComponentArray = null;


        try {
            // InternalMCEntity.g:1707:66: (iv_ruleNBTJSONTextComponentArray= ruleNBTJSONTextComponentArray EOF )
            // InternalMCEntity.g:1708:2: iv_ruleNBTJSONTextComponentArray= ruleNBTJSONTextComponentArray EOF
            {
             newCompositeNode(grammarAccess.getNBTJSONTextComponentArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNBTJSONTextComponentArray=ruleNBTJSONTextComponentArray();

            state._fsp--;

             current =iv_ruleNBTJSONTextComponentArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentArray"


    // $ANTLR start "ruleNBTJSONTextComponentArray"
    // InternalMCEntity.g:1714:1: ruleNBTJSONTextComponentArray returns [EObject current=null] : ( () ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )? ) ;
    public final EObject ruleNBTJSONTextComponentArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1720:2: ( ( () ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )? ) )
            // InternalMCEntity.g:1721:2: ( () ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )? )
            {
            // InternalMCEntity.g:1721:2: ( () ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )? )
            // InternalMCEntity.g:1722:3: () ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )?
            {
            // InternalMCEntity.g:1722:3: ()
            // InternalMCEntity.g:1723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNBTJSONTextComponentArrayAccess().getJSONArrayAction_0(),
            					current);
            			

            }

            // InternalMCEntity.g:1729:3: ( ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING||LA37_0==RULE_INT||LA37_0==RULE_DOUBLE||LA37_0==31||(LA37_0>=36 && LA37_0<=38)||(LA37_0>=46 && LA37_0<=50)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMCEntity.g:1730:4: ( (lv_entries_1_0= ruleJSONValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )* (otherlv_4= ',' )?
                    {
                    // InternalMCEntity.g:1730:4: ( (lv_entries_1_0= ruleJSONValue ) )
                    // InternalMCEntity.g:1731:5: (lv_entries_1_0= ruleJSONValue )
                    {
                    // InternalMCEntity.g:1731:5: (lv_entries_1_0= ruleJSONValue )
                    // InternalMCEntity.g:1732:6: lv_entries_1_0= ruleJSONValue
                    {

                    						newCompositeNode(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_entries_1_0=ruleJSONValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentArrayRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_1_0,
                    							"com.raptor.mcentity.MCEntity.JSONValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMCEntity.g:1749:4: (otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==32) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_STRING||LA35_1==RULE_INT||LA35_1==RULE_DOUBLE||LA35_1==31||(LA35_1>=36 && LA35_1<=38)||(LA35_1>=46 && LA35_1<=50)) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMCEntity.g:1750:5: otherlv_2= ',' ( (lv_entries_3_0= ruleJSONValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,32,FOLLOW_32); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMCEntity.g:1754:5: ( (lv_entries_3_0= ruleJSONValue ) )
                    	    // InternalMCEntity.g:1755:6: (lv_entries_3_0= ruleJSONValue )
                    	    {
                    	    // InternalMCEntity.g:1755:6: (lv_entries_3_0= ruleJSONValue )
                    	    // InternalMCEntity.g:1756:7: lv_entries_3_0= ruleJSONValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_entries_3_0=ruleJSONValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNBTJSONTextComponentArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_3_0,
                    	    								"com.raptor.mcentity.MCEntity.JSONValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalMCEntity.g:1774:4: (otherlv_4= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==32) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMCEntity.g:1775:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNBTJSONTextComponentArray"


    // $ANTLR start "entryRuleJSONValue"
    // InternalMCEntity.g:1785:1: entryRuleJSONValue returns [EObject current=null] : iv_ruleJSONValue= ruleJSONValue EOF ;
    public final EObject entryRuleJSONValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONValue = null;


        try {
            // InternalMCEntity.g:1785:50: (iv_ruleJSONValue= ruleJSONValue EOF )
            // InternalMCEntity.g:1786:2: iv_ruleJSONValue= ruleJSONValue EOF
            {
             newCompositeNode(grammarAccess.getJSONValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONValue=ruleJSONValue();

            state._fsp--;

             current =iv_ruleJSONValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONValue"


    // $ANTLR start "ruleJSONValue"
    // InternalMCEntity.g:1792:1: ruleJSONValue returns [EObject current=null] : (this_JSONObject_0= ruleJSONObject | this_JSONArray_1= ruleJSONArray | this_JSONString_2= ruleJSONString | this_JSONNumber_3= ruleJSONNumber | this_JSONBool_4= ruleJSONBool | this_Selector_5= ruleSelector ) ;
    public final EObject ruleJSONValue() throws RecognitionException {
        EObject current = null;

        EObject this_JSONObject_0 = null;

        EObject this_JSONArray_1 = null;

        EObject this_JSONString_2 = null;

        EObject this_JSONNumber_3 = null;

        EObject this_JSONBool_4 = null;

        EObject this_Selector_5 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1798:2: ( (this_JSONObject_0= ruleJSONObject | this_JSONArray_1= ruleJSONArray | this_JSONString_2= ruleJSONString | this_JSONNumber_3= ruleJSONNumber | this_JSONBool_4= ruleJSONBool | this_Selector_5= ruleSelector ) )
            // InternalMCEntity.g:1799:2: (this_JSONObject_0= ruleJSONObject | this_JSONArray_1= ruleJSONArray | this_JSONString_2= ruleJSONString | this_JSONNumber_3= ruleJSONNumber | this_JSONBool_4= ruleJSONBool | this_Selector_5= ruleSelector )
            {
            // InternalMCEntity.g:1799:2: (this_JSONObject_0= ruleJSONObject | this_JSONArray_1= ruleJSONArray | this_JSONString_2= ruleJSONString | this_JSONNumber_3= ruleJSONNumber | this_JSONBool_4= ruleJSONBool | this_Selector_5= ruleSelector )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt38=4;
                }
                break;
            case 37:
            case 38:
                {
                alt38=5;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMCEntity.g:1800:3: this_JSONObject_0= ruleJSONObject
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getJSONObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONObject_0=ruleJSONObject();

                    state._fsp--;


                    			current = this_JSONObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1809:3: this_JSONArray_1= ruleJSONArray
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getJSONArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONArray_1=ruleJSONArray();

                    state._fsp--;


                    			current = this_JSONArray_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1818:3: this_JSONString_2= ruleJSONString
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getJSONStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONString_2=ruleJSONString();

                    state._fsp--;


                    			current = this_JSONString_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1827:3: this_JSONNumber_3= ruleJSONNumber
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getJSONNumberParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONNumber_3=ruleJSONNumber();

                    state._fsp--;


                    			current = this_JSONNumber_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1836:3: this_JSONBool_4= ruleJSONBool
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getJSONBoolParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONBool_4=ruleJSONBool();

                    state._fsp--;


                    			current = this_JSONBool_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1845:3: this_Selector_5= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getJSONValueAccess().getSelectorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_5=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONValue"


    // $ANTLR start "entryRuleJSONBool"
    // InternalMCEntity.g:1857:1: entryRuleJSONBool returns [EObject current=null] : iv_ruleJSONBool= ruleJSONBool EOF ;
    public final EObject entryRuleJSONBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONBool = null;


        try {
            // InternalMCEntity.g:1857:49: (iv_ruleJSONBool= ruleJSONBool EOF )
            // InternalMCEntity.g:1858:2: iv_ruleJSONBool= ruleJSONBool EOF
            {
             newCompositeNode(grammarAccess.getJSONBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONBool=ruleJSONBool();

            state._fsp--;

             current =iv_ruleJSONBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONBool"


    // $ANTLR start "ruleJSONBool"
    // InternalMCEntity.g:1864:1: ruleJSONBool returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) ;
    public final EObject ruleJSONBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1870:2: ( ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) )
            // InternalMCEntity.g:1871:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            {
            // InternalMCEntity.g:1871:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            else if ( (LA39_0==38) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMCEntity.g:1872:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalMCEntity.g:1872:3: ( (lv_value_0_0= 'true' ) )
                    // InternalMCEntity.g:1873:4: (lv_value_0_0= 'true' )
                    {
                    // InternalMCEntity.g:1873:4: (lv_value_0_0= 'true' )
                    // InternalMCEntity.g:1874:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getJSONBoolAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJSONBoolRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1887:3: (otherlv_1= 'false' () )
                    {
                    // InternalMCEntity.g:1887:3: (otherlv_1= 'false' () )
                    // InternalMCEntity.g:1888:4: otherlv_1= 'false' ()
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJSONBoolAccess().getFalseKeyword_1_0());
                    			
                    // InternalMCEntity.g:1892:4: ()
                    // InternalMCEntity.g:1893:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJSONBoolAccess().getJSONBoolAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONBool"


    // $ANTLR start "entryRuleJSONNumber"
    // InternalMCEntity.g:1904:1: entryRuleJSONNumber returns [EObject current=null] : iv_ruleJSONNumber= ruleJSONNumber EOF ;
    public final EObject entryRuleJSONNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONNumber = null;


        try {
            // InternalMCEntity.g:1904:51: (iv_ruleJSONNumber= ruleJSONNumber EOF )
            // InternalMCEntity.g:1905:2: iv_ruleJSONNumber= ruleJSONNumber EOF
            {
             newCompositeNode(grammarAccess.getJSONNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONNumber=ruleJSONNumber();

            state._fsp--;

             current =iv_ruleJSONNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONNumber"


    // $ANTLR start "ruleJSONNumber"
    // InternalMCEntity.g:1911:1: ruleJSONNumber returns [EObject current=null] : (this_JSONDouble_0= ruleJSONDouble | this_JSONLong_1= ruleJSONLong ) ;
    public final EObject ruleJSONNumber() throws RecognitionException {
        EObject current = null;

        EObject this_JSONDouble_0 = null;

        EObject this_JSONLong_1 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1917:2: ( (this_JSONDouble_0= ruleJSONDouble | this_JSONLong_1= ruleJSONLong ) )
            // InternalMCEntity.g:1918:2: (this_JSONDouble_0= ruleJSONDouble | this_JSONLong_1= ruleJSONLong )
            {
            // InternalMCEntity.g:1918:2: (this_JSONDouble_0= ruleJSONDouble | this_JSONLong_1= ruleJSONLong )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DOUBLE) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_INT) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMCEntity.g:1919:3: this_JSONDouble_0= ruleJSONDouble
                    {

                    			newCompositeNode(grammarAccess.getJSONNumberAccess().getJSONDoubleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONDouble_0=ruleJSONDouble();

                    state._fsp--;


                    			current = this_JSONDouble_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1928:3: this_JSONLong_1= ruleJSONLong
                    {

                    			newCompositeNode(grammarAccess.getJSONNumberAccess().getJSONLongParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONLong_1=ruleJSONLong();

                    state._fsp--;


                    			current = this_JSONLong_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONNumber"


    // $ANTLR start "entryRuleJSONDouble"
    // InternalMCEntity.g:1940:1: entryRuleJSONDouble returns [EObject current=null] : iv_ruleJSONDouble= ruleJSONDouble EOF ;
    public final EObject entryRuleJSONDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONDouble = null;


        try {
            // InternalMCEntity.g:1940:51: (iv_ruleJSONDouble= ruleJSONDouble EOF )
            // InternalMCEntity.g:1941:2: iv_ruleJSONDouble= ruleJSONDouble EOF
            {
             newCompositeNode(grammarAccess.getJSONDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONDouble=ruleJSONDouble();

            state._fsp--;

             current =iv_ruleJSONDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONDouble"


    // $ANTLR start "ruleJSONDouble"
    // InternalMCEntity.g:1947:1: ruleJSONDouble returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleJSONDouble() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:1953:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalMCEntity.g:1954:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalMCEntity.g:1954:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalMCEntity.g:1955:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalMCEntity.g:1955:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalMCEntity.g:1956:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getJSONDoubleAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJSONDoubleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONDouble"


    // $ANTLR start "entryRuleJSONLong"
    // InternalMCEntity.g:1975:1: entryRuleJSONLong returns [EObject current=null] : iv_ruleJSONLong= ruleJSONLong EOF ;
    public final EObject entryRuleJSONLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONLong = null;


        try {
            // InternalMCEntity.g:1975:49: (iv_ruleJSONLong= ruleJSONLong EOF )
            // InternalMCEntity.g:1976:2: iv_ruleJSONLong= ruleJSONLong EOF
            {
             newCompositeNode(grammarAccess.getJSONLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONLong=ruleJSONLong();

            state._fsp--;

             current =iv_ruleJSONLong; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONLong"


    // $ANTLR start "ruleJSONLong"
    // InternalMCEntity.g:1982:1: ruleJSONLong returns [EObject current=null] : ( (lv_value_0_0= ruleINTAsLong ) ) ;
    public final EObject ruleJSONLong() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:1988:2: ( ( (lv_value_0_0= ruleINTAsLong ) ) )
            // InternalMCEntity.g:1989:2: ( (lv_value_0_0= ruleINTAsLong ) )
            {
            // InternalMCEntity.g:1989:2: ( (lv_value_0_0= ruleINTAsLong ) )
            // InternalMCEntity.g:1990:3: (lv_value_0_0= ruleINTAsLong )
            {
            // InternalMCEntity.g:1990:3: (lv_value_0_0= ruleINTAsLong )
            // InternalMCEntity.g:1991:4: lv_value_0_0= ruleINTAsLong
            {

            				newCompositeNode(grammarAccess.getJSONLongAccess().getValueINTAsLongParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleINTAsLong();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJSONLongRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.INTAsLong");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONLong"


    // $ANTLR start "entryRuleINTAsLong"
    // InternalMCEntity.g:2011:1: entryRuleINTAsLong returns [String current=null] : iv_ruleINTAsLong= ruleINTAsLong EOF ;
    public final String entryRuleINTAsLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTAsLong = null;


        try {
            // InternalMCEntity.g:2011:49: (iv_ruleINTAsLong= ruleINTAsLong EOF )
            // InternalMCEntity.g:2012:2: iv_ruleINTAsLong= ruleINTAsLong EOF
            {
             newCompositeNode(grammarAccess.getINTAsLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTAsLong=ruleINTAsLong();

            state._fsp--;

             current =iv_ruleINTAsLong.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINTAsLong"


    // $ANTLR start "ruleINTAsLong"
    // InternalMCEntity.g:2018:1: ruleINTAsLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTAsLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:2024:2: (this_INT_0= RULE_INT )
            // InternalMCEntity.g:2025:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getINTAsLongAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTAsLong"


    // $ANTLR start "entryRuleJSONObject"
    // InternalMCEntity.g:2035:1: entryRuleJSONObject returns [EObject current=null] : iv_ruleJSONObject= ruleJSONObject EOF ;
    public final EObject entryRuleJSONObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONObject = null;


        try {
            // InternalMCEntity.g:2035:51: (iv_ruleJSONObject= ruleJSONObject EOF )
            // InternalMCEntity.g:2036:2: iv_ruleJSONObject= ruleJSONObject EOF
            {
             newCompositeNode(grammarAccess.getJSONObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONObject=ruleJSONObject();

            state._fsp--;

             current =iv_ruleJSONObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONObject"


    // $ANTLR start "ruleJSONObject"
    // InternalMCEntity.g:2042:1: ruleJSONObject returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ;
    public final EObject ruleJSONObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2048:2: ( (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            // InternalMCEntity.g:2049:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            {
            // InternalMCEntity.g:2049:2: (otherlv_0= '{' () ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
            // InternalMCEntity.g:2050:3: otherlv_0= '{' () ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMCEntity.g:2054:3: ()
            // InternalMCEntity.g:2055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJSONObjectAccess().getJSONObjectAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:2061:3: ( ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMCEntity.g:2062:4: ( (lv_entries_2_0= ruleJSONEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:2062:4: ( (lv_entries_2_0= ruleJSONEntry ) )
                    // InternalMCEntity.g:2063:5: (lv_entries_2_0= ruleJSONEntry )
                    {
                    // InternalMCEntity.g:2063:5: (lv_entries_2_0= ruleJSONEntry )
                    // InternalMCEntity.g:2064:6: lv_entries_2_0= ruleJSONEntry
                    {

                    						newCompositeNode(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_entries_2_0=ruleJSONEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJSONObjectRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_2_0,
                    							"com.raptor.mcentity.MCEntity.JSONEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMCEntity.g:2081:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==32) ) {
                            int LA41_1 = input.LA(2);

                            if ( (LA41_1==RULE_STRING) ) {
                                alt41=1;
                            }


                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMCEntity.g:2082:5: otherlv_3= ',' ( (lv_entries_4_0= ruleJSONEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_29); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJSONObjectAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:2086:5: ( (lv_entries_4_0= ruleJSONEntry ) )
                    	    // InternalMCEntity.g:2087:6: (lv_entries_4_0= ruleJSONEntry )
                    	    {
                    	    // InternalMCEntity.g:2087:6: (lv_entries_4_0= ruleJSONEntry )
                    	    // InternalMCEntity.g:2088:7: lv_entries_4_0= ruleJSONEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_entries_4_0=ruleJSONEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJSONObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_4_0,
                    	    								"com.raptor.mcentity.MCEntity.JSONEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // InternalMCEntity.g:2106:4: (otherlv_5= ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==32) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMCEntity.g:2107:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getJSONObjectAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONObject"


    // $ANTLR start "entryRuleJSONEntry"
    // InternalMCEntity.g:2121:1: entryRuleJSONEntry returns [EObject current=null] : iv_ruleJSONEntry= ruleJSONEntry EOF ;
    public final EObject entryRuleJSONEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONEntry = null;


        try {
            // InternalMCEntity.g:2121:50: (iv_ruleJSONEntry= ruleJSONEntry EOF )
            // InternalMCEntity.g:2122:2: iv_ruleJSONEntry= ruleJSONEntry EOF
            {
             newCompositeNode(grammarAccess.getJSONEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONEntry=ruleJSONEntry();

            state._fsp--;

             current =iv_ruleJSONEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONEntry"


    // $ANTLR start "ruleJSONEntry"
    // InternalMCEntity.g:2128:1: ruleJSONEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJSONValue ) ) ) ;
    public final EObject ruleJSONEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2134:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJSONValue ) ) ) )
            // InternalMCEntity.g:2135:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJSONValue ) ) )
            {
            // InternalMCEntity.g:2135:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJSONValue ) ) )
            // InternalMCEntity.g:2136:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJSONValue ) )
            {
            // InternalMCEntity.g:2136:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalMCEntity.g:2137:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalMCEntity.g:2137:4: (lv_key_0_0= RULE_STRING )
            // InternalMCEntity.g:2138:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getJSONEntryAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSONEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"com.raptor.mcentity.MCEntity.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getJSONEntryAccess().getColonKeyword_1());
            		
            // InternalMCEntity.g:2158:3: ( (lv_value_2_0= ruleJSONValue ) )
            // InternalMCEntity.g:2159:4: (lv_value_2_0= ruleJSONValue )
            {
            // InternalMCEntity.g:2159:4: (lv_value_2_0= ruleJSONValue )
            // InternalMCEntity.g:2160:5: lv_value_2_0= ruleJSONValue
            {

            					newCompositeNode(grammarAccess.getJSONEntryAccess().getValueJSONValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleJSONValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSONEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.raptor.mcentity.MCEntity.JSONValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONEntry"


    // $ANTLR start "entryRuleJSONArray"
    // InternalMCEntity.g:2181:1: entryRuleJSONArray returns [EObject current=null] : iv_ruleJSONArray= ruleJSONArray EOF ;
    public final EObject entryRuleJSONArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONArray = null;


        try {
            // InternalMCEntity.g:2181:50: (iv_ruleJSONArray= ruleJSONArray EOF )
            // InternalMCEntity.g:2182:2: iv_ruleJSONArray= ruleJSONArray EOF
            {
             newCompositeNode(grammarAccess.getJSONArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONArray=ruleJSONArray();

            state._fsp--;

             current =iv_ruleJSONArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONArray"


    // $ANTLR start "ruleJSONArray"
    // InternalMCEntity.g:2188:1: ruleJSONArray returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) ;
    public final EObject ruleJSONArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2194:2: ( (otherlv_0= '[' () ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' ) )
            // InternalMCEntity.g:2195:2: (otherlv_0= '[' () ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            {
            // InternalMCEntity.g:2195:2: (otherlv_0= '[' () ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']' )
            // InternalMCEntity.g:2196:3: otherlv_0= '[' () ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMCEntity.g:2200:3: ()
            // InternalMCEntity.g:2201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJSONArrayAccess().getJSONArrayAction_1(),
            					current);
            			

            }

            // InternalMCEntity.g:2207:3: ( ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING||LA46_0==RULE_INT||LA46_0==RULE_DOUBLE||LA46_0==31||(LA46_0>=36 && LA46_0<=38)||(LA46_0>=46 && LA46_0<=50)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMCEntity.g:2208:4: ( (lv_entries_2_0= ruleJSONValue ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMCEntity.g:2208:4: ( (lv_entries_2_0= ruleJSONValue ) )
                    // InternalMCEntity.g:2209:5: (lv_entries_2_0= ruleJSONValue )
                    {
                    // InternalMCEntity.g:2209:5: (lv_entries_2_0= ruleJSONValue )
                    // InternalMCEntity.g:2210:6: lv_entries_2_0= ruleJSONValue
                    {

                    						newCompositeNode(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_entries_2_0=ruleJSONValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJSONArrayRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_2_0,
                    							"com.raptor.mcentity.MCEntity.JSONValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMCEntity.g:2227:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==32) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==RULE_STRING||LA44_1==RULE_INT||LA44_1==RULE_DOUBLE||LA44_1==31||(LA44_1>=36 && LA44_1<=38)||(LA44_1>=46 && LA44_1<=50)) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMCEntity.g:2228:5: otherlv_3= ',' ( (lv_entries_4_0= ruleJSONValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJSONArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMCEntity.g:2232:5: ( (lv_entries_4_0= ruleJSONValue ) )
                    	    // InternalMCEntity.g:2233:6: (lv_entries_4_0= ruleJSONValue )
                    	    {
                    	    // InternalMCEntity.g:2233:6: (lv_entries_4_0= ruleJSONValue )
                    	    // InternalMCEntity.g:2234:7: lv_entries_4_0= ruleJSONValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_entries_4_0=ruleJSONValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJSONArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_4_0,
                    	    								"com.raptor.mcentity.MCEntity.JSONValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // InternalMCEntity.g:2252:4: (otherlv_5= ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==32) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMCEntity.g:2253:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getJSONArrayAccess().getCommaKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONArray"


    // $ANTLR start "entryRuleJSONString"
    // InternalMCEntity.g:2267:1: entryRuleJSONString returns [EObject current=null] : iv_ruleJSONString= ruleJSONString EOF ;
    public final EObject entryRuleJSONString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONString = null;


        try {
            // InternalMCEntity.g:2267:51: (iv_ruleJSONString= ruleJSONString EOF )
            // InternalMCEntity.g:2268:2: iv_ruleJSONString= ruleJSONString EOF
            {
             newCompositeNode(grammarAccess.getJSONStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONString=ruleJSONString();

            state._fsp--;

             current =iv_ruleJSONString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONString"


    // $ANTLR start "ruleJSONString"
    // InternalMCEntity.g:2274:1: ruleJSONString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleJSONString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:2280:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMCEntity.g:2281:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMCEntity.g:2281:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMCEntity.g:2282:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMCEntity.g:2282:3: (lv_value_0_0= RULE_STRING )
            // InternalMCEntity.g:2283:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getJSONStringAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJSONStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONString"


    // $ANTLR start "entryRuleSelector"
    // InternalMCEntity.g:2302:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:2304:2: (iv_ruleSelector= ruleSelector EOF )
            // InternalMCEntity.g:2305:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMCEntity.g:2314:1: ruleSelector returns [EObject current=null] : ( ( (lv_type_0_0= ruleSelectorType ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:2321:2: ( ( ( (lv_type_0_0= ruleSelectorType ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )? ) )
            // InternalMCEntity.g:2322:2: ( ( (lv_type_0_0= ruleSelectorType ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )? )
            {
            // InternalMCEntity.g:2322:2: ( ( (lv_type_0_0= ruleSelectorType ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )? )
            // InternalMCEntity.g:2323:3: ( (lv_type_0_0= ruleSelectorType ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )?
            {
            // InternalMCEntity.g:2323:3: ( (lv_type_0_0= ruleSelectorType ) )
            // InternalMCEntity.g:2324:4: (lv_type_0_0= ruleSelectorType )
            {
            // InternalMCEntity.g:2324:4: (lv_type_0_0= ruleSelectorType )
            // InternalMCEntity.g:2325:5: lv_type_0_0= ruleSelectorType
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getTypeSelectorTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_type_0_0=ruleSelectorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.raptor.mcentity.MCEntity.SelectorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMCEntity.g:2342:3: (otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMCEntity.g:2343:4: otherlv_1= '[' ( (lv_arguments_2_0= ruleSelectorArguments ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMCEntity.g:2347:4: ( (lv_arguments_2_0= ruleSelectorArguments ) )
                    // InternalMCEntity.g:2348:5: (lv_arguments_2_0= ruleSelectorArguments )
                    {
                    // InternalMCEntity.g:2348:5: (lv_arguments_2_0= ruleSelectorArguments )
                    // InternalMCEntity.g:2349:6: lv_arguments_2_0= ruleSelectorArguments
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getArgumentsSelectorArgumentsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_arguments_2_0=ruleSelectorArguments();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"com.raptor.mcentity.MCEntity.SelectorArguments");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSelectorArguments"
    // InternalMCEntity.g:2378:1: entryRuleSelectorArguments returns [EObject current=null] : iv_ruleSelectorArguments= ruleSelectorArguments EOF ;
    public final EObject entryRuleSelectorArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorArguments = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMCEntity.g:2380:2: (iv_ruleSelectorArguments= ruleSelectorArguments EOF )
            // InternalMCEntity.g:2381:2: iv_ruleSelectorArguments= ruleSelectorArguments EOF
            {
             newCompositeNode(grammarAccess.getSelectorArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorArguments=ruleSelectorArguments();

            state._fsp--;

             current =iv_ruleSelectorArguments; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorArguments"


    // $ANTLR start "ruleSelectorArguments"
    // InternalMCEntity.g:2390:1: ruleSelectorArguments returns [EObject current=null] : ( ( (lv_filters_0_0= ruleSelectorFilter ) ) (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )* ) ;
    public final EObject ruleSelectorArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_filters_0_0 = null;

        EObject lv_filters_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMCEntity.g:2397:2: ( ( ( (lv_filters_0_0= ruleSelectorFilter ) ) (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )* ) )
            // InternalMCEntity.g:2398:2: ( ( (lv_filters_0_0= ruleSelectorFilter ) ) (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )* )
            {
            // InternalMCEntity.g:2398:2: ( ( (lv_filters_0_0= ruleSelectorFilter ) ) (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )* )
            // InternalMCEntity.g:2399:3: ( (lv_filters_0_0= ruleSelectorFilter ) ) (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )*
            {
            // InternalMCEntity.g:2399:3: ( (lv_filters_0_0= ruleSelectorFilter ) )
            // InternalMCEntity.g:2400:4: (lv_filters_0_0= ruleSelectorFilter )
            {
            // InternalMCEntity.g:2400:4: (lv_filters_0_0= ruleSelectorFilter )
            // InternalMCEntity.g:2401:5: lv_filters_0_0= ruleSelectorFilter
            {

            					newCompositeNode(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_filters_0_0=ruleSelectorFilter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorArgumentsRule());
            					}
            					add(
            						current,
            						"filters",
            						lv_filters_0_0,
            						"com.raptor.mcentity.MCEntity.SelectorFilter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMCEntity.g:2418:3: (otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==32) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMCEntity.g:2419:4: otherlv_1= ',' ( (lv_filters_2_0= ruleSelectorFilter ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_36); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectorArgumentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMCEntity.g:2423:4: ( (lv_filters_2_0= ruleSelectorFilter ) )
            	    // InternalMCEntity.g:2424:5: (lv_filters_2_0= ruleSelectorFilter )
            	    {
            	    // InternalMCEntity.g:2424:5: (lv_filters_2_0= ruleSelectorFilter )
            	    // InternalMCEntity.g:2425:6: lv_filters_2_0= ruleSelectorFilter
            	    {

            	    						newCompositeNode(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_filters_2_0=ruleSelectorFilter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectorArgumentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filters",
            	    							lv_filters_2_0,
            	    							"com.raptor.mcentity.MCEntity.SelectorFilter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleSelectorArguments"


    // $ANTLR start "entryRuleSelectorFilter"
    // InternalMCEntity.g:2450:1: entryRuleSelectorFilter returns [EObject current=null] : iv_ruleSelectorFilter= ruleSelectorFilter EOF ;
    public final EObject entryRuleSelectorFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorFilter = null;


        try {
            // InternalMCEntity.g:2450:55: (iv_ruleSelectorFilter= ruleSelectorFilter EOF )
            // InternalMCEntity.g:2451:2: iv_ruleSelectorFilter= ruleSelectorFilter EOF
            {
             newCompositeNode(grammarAccess.getSelectorFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorFilter=ruleSelectorFilter();

            state._fsp--;

             current =iv_ruleSelectorFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorFilter"


    // $ANTLR start "ruleSelectorFilter"
    // InternalMCEntity.g:2457:1: ruleSelectorFilter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_inverted_2_0= '!' ) )? ( (lv_value_3_0= ruleSelectorValue ) ) ) ;
    public final EObject ruleSelectorFilter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_inverted_2_0=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2463:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_inverted_2_0= '!' ) )? ( (lv_value_3_0= ruleSelectorValue ) ) ) )
            // InternalMCEntity.g:2464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_inverted_2_0= '!' ) )? ( (lv_value_3_0= ruleSelectorValue ) ) )
            {
            // InternalMCEntity.g:2464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_inverted_2_0= '!' ) )? ( (lv_value_3_0= ruleSelectorValue ) ) )
            // InternalMCEntity.g:2465:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_inverted_2_0= '!' ) )? ( (lv_value_3_0= ruleSelectorValue ) )
            {
            // InternalMCEntity.g:2465:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMCEntity.g:2466:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMCEntity.g:2466:4: (lv_name_0_0= RULE_ID )
            // InternalMCEntity.g:2467:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSelectorFilterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.raptor.mcentity.MCEntity.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorFilterAccess().getEqualsSignKeyword_1());
            		
            // InternalMCEntity.g:2487:3: ( (lv_inverted_2_0= '!' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMCEntity.g:2488:4: (lv_inverted_2_0= '!' )
                    {
                    // InternalMCEntity.g:2488:4: (lv_inverted_2_0= '!' )
                    // InternalMCEntity.g:2489:5: lv_inverted_2_0= '!'
                    {
                    lv_inverted_2_0=(Token)match(input,40,FOLLOW_38); 

                    					newLeafNode(lv_inverted_2_0, grammarAccess.getSelectorFilterAccess().getInvertedExclamationMarkKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorFilterRule());
                    					}
                    					setWithLastConsumed(current, "inverted", true, "!");
                    				

                    }


                    }
                    break;

            }

            // InternalMCEntity.g:2501:3: ( (lv_value_3_0= ruleSelectorValue ) )
            // InternalMCEntity.g:2502:4: (lv_value_3_0= ruleSelectorValue )
            {
            // InternalMCEntity.g:2502:4: (lv_value_3_0= ruleSelectorValue )
            // InternalMCEntity.g:2503:5: lv_value_3_0= ruleSelectorValue
            {

            					newCompositeNode(grammarAccess.getSelectorFilterAccess().getValueSelectorValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleSelectorValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorFilterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.raptor.mcentity.MCEntity.SelectorValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorFilter"


    // $ANTLR start "entryRuleSelectorValue"
    // InternalMCEntity.g:2524:1: entryRuleSelectorValue returns [EObject current=null] : iv_ruleSelectorValue= ruleSelectorValue EOF ;
    public final EObject entryRuleSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorValue = null;


        try {
            // InternalMCEntity.g:2524:54: (iv_ruleSelectorValue= ruleSelectorValue EOF )
            // InternalMCEntity.g:2525:2: iv_ruleSelectorValue= ruleSelectorValue EOF
            {
             newCompositeNode(grammarAccess.getSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorValue=ruleSelectorValue();

            state._fsp--;

             current =iv_ruleSelectorValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorValue"


    // $ANTLR start "ruleSelectorValue"
    // InternalMCEntity.g:2531:1: ruleSelectorValue returns [EObject current=null] : (this_NBTCompound_0= ruleNBTCompound | this_NamespacedKey_1= ruleNamespacedKey | this_IntRange_2= ruleIntRange | this_DoubleRange_3= ruleDoubleRange | this_IntSelectorValue_4= ruleIntSelectorValue | this_DoubleSelectorValue_5= ruleDoubleSelectorValue | this_StringSelectorValue_6= ruleStringSelectorValue | this_BoolSelectorValue_7= ruleBoolSelectorValue ) ;
    public final EObject ruleSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject this_NBTCompound_0 = null;

        EObject this_NamespacedKey_1 = null;

        EObject this_IntRange_2 = null;

        EObject this_DoubleRange_3 = null;

        EObject this_IntSelectorValue_4 = null;

        EObject this_DoubleSelectorValue_5 = null;

        EObject this_StringSelectorValue_6 = null;

        EObject this_BoolSelectorValue_7 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2537:2: ( (this_NBTCompound_0= ruleNBTCompound | this_NamespacedKey_1= ruleNamespacedKey | this_IntRange_2= ruleIntRange | this_DoubleRange_3= ruleDoubleRange | this_IntSelectorValue_4= ruleIntSelectorValue | this_DoubleSelectorValue_5= ruleDoubleSelectorValue | this_StringSelectorValue_6= ruleStringSelectorValue | this_BoolSelectorValue_7= ruleBoolSelectorValue ) )
            // InternalMCEntity.g:2538:2: (this_NBTCompound_0= ruleNBTCompound | this_NamespacedKey_1= ruleNamespacedKey | this_IntRange_2= ruleIntRange | this_DoubleRange_3= ruleDoubleRange | this_IntSelectorValue_4= ruleIntSelectorValue | this_DoubleSelectorValue_5= ruleDoubleSelectorValue | this_StringSelectorValue_6= ruleStringSelectorValue | this_BoolSelectorValue_7= ruleBoolSelectorValue )
            {
            // InternalMCEntity.g:2538:2: (this_NBTCompound_0= ruleNBTCompound | this_NamespacedKey_1= ruleNamespacedKey | this_IntRange_2= ruleIntRange | this_DoubleRange_3= ruleDoubleRange | this_IntSelectorValue_4= ruleIntSelectorValue | this_DoubleSelectorValue_5= ruleDoubleSelectorValue | this_StringSelectorValue_6= ruleStringSelectorValue | this_BoolSelectorValue_7= ruleBoolSelectorValue )
            int alt50=8;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalMCEntity.g:2539:3: this_NBTCompound_0= ruleNBTCompound
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getNBTCompoundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NBTCompound_0=ruleNBTCompound();

                    state._fsp--;


                    			current = this_NBTCompound_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:2548:3: this_NamespacedKey_1= ruleNamespacedKey
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getNamespacedKeyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamespacedKey_1=ruleNamespacedKey();

                    state._fsp--;


                    			current = this_NamespacedKey_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:2557:3: this_IntRange_2= ruleIntRange
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getIntRangeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntRange_2=ruleIntRange();

                    state._fsp--;


                    			current = this_IntRange_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:2566:3: this_DoubleRange_3= ruleDoubleRange
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getDoubleRangeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleRange_3=ruleDoubleRange();

                    state._fsp--;


                    			current = this_DoubleRange_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:2575:3: this_IntSelectorValue_4= ruleIntSelectorValue
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getIntSelectorValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntSelectorValue_4=ruleIntSelectorValue();

                    state._fsp--;


                    			current = this_IntSelectorValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:2584:3: this_DoubleSelectorValue_5= ruleDoubleSelectorValue
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getDoubleSelectorValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleSelectorValue_5=ruleDoubleSelectorValue();

                    state._fsp--;


                    			current = this_DoubleSelectorValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:2593:3: this_StringSelectorValue_6= ruleStringSelectorValue
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getStringSelectorValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringSelectorValue_6=ruleStringSelectorValue();

                    state._fsp--;


                    			current = this_StringSelectorValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:2602:3: this_BoolSelectorValue_7= ruleBoolSelectorValue
                    {

                    			newCompositeNode(grammarAccess.getSelectorValueAccess().getBoolSelectorValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolSelectorValue_7=ruleBoolSelectorValue();

                    state._fsp--;


                    			current = this_BoolSelectorValue_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorValue"


    // $ANTLR start "entryRuleIntRange"
    // InternalMCEntity.g:2614:1: entryRuleIntRange returns [EObject current=null] : iv_ruleIntRange= ruleIntRange EOF ;
    public final EObject entryRuleIntRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntRange = null;


        try {
            // InternalMCEntity.g:2614:49: (iv_ruleIntRange= ruleIntRange EOF )
            // InternalMCEntity.g:2615:2: iv_ruleIntRange= ruleIntRange EOF
            {
             newCompositeNode(grammarAccess.getIntRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntRange=ruleIntRange();

            state._fsp--;

             current =iv_ruleIntRange; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntRange"


    // $ANTLR start "ruleIntRange"
    // InternalMCEntity.g:2621:1: ruleIntRange returns [EObject current=null] : ( ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) ) | ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' ) | ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) ) ) ;
    public final EObject ruleIntRange() throws RecognitionException {
        EObject current = null;

        Token lv_begin_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token lv_begin_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_end_9_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:2627:2: ( ( ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) ) | ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' ) | ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) ) ) )
            // InternalMCEntity.g:2628:2: ( ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) ) | ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' ) | ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) ) )
            {
            // InternalMCEntity.g:2628:2: ( ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) ) | ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' ) | ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) ) )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==41) ) {
                    int LA51_3 = input.LA(3);

                    if ( (LA51_3==EOF||LA51_3==32||LA51_3==35) ) {
                        alt51=2;
                    }
                    else if ( (LA51_3==RULE_INT) ) {
                        alt51=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==41) ) {
                alt51=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMCEntity.g:2629:3: ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )
                    {
                    // InternalMCEntity.g:2629:3: ( () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )
                    // InternalMCEntity.g:2630:4: () ( (lv_begin_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) )
                    {
                    // InternalMCEntity.g:2630:4: ()
                    // InternalMCEntity.g:2631:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getIntRangeAccess().getClosedIntRangeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMCEntity.g:2637:4: ( (lv_begin_1_0= RULE_INT ) )
                    // InternalMCEntity.g:2638:5: (lv_begin_1_0= RULE_INT )
                    {
                    // InternalMCEntity.g:2638:5: (lv_begin_1_0= RULE_INT )
                    // InternalMCEntity.g:2639:6: lv_begin_1_0= RULE_INT
                    {
                    lv_begin_1_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    						newLeafNode(lv_begin_1_0, grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"begin",
                    							lv_begin_1_0,
                    							"com.raptor.mcentity.MCEntity.INT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_0_2());
                    			
                    // InternalMCEntity.g:2659:4: ( (lv_end_3_0= RULE_INT ) )
                    // InternalMCEntity.g:2660:5: (lv_end_3_0= RULE_INT )
                    {
                    // InternalMCEntity.g:2660:5: (lv_end_3_0= RULE_INT )
                    // InternalMCEntity.g:2661:6: lv_end_3_0= RULE_INT
                    {
                    lv_end_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_end_3_0, grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_3_0,
                    							"com.raptor.mcentity.MCEntity.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:2679:3: ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' )
                    {
                    // InternalMCEntity.g:2679:3: ( () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..' )
                    // InternalMCEntity.g:2680:4: () ( (lv_begin_5_0= RULE_INT ) ) otherlv_6= '..'
                    {
                    // InternalMCEntity.g:2680:4: ()
                    // InternalMCEntity.g:2681:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getIntRangeAccess().getOpenEndedIntRangeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMCEntity.g:2687:4: ( (lv_begin_5_0= RULE_INT ) )
                    // InternalMCEntity.g:2688:5: (lv_begin_5_0= RULE_INT )
                    {
                    // InternalMCEntity.g:2688:5: (lv_begin_5_0= RULE_INT )
                    // InternalMCEntity.g:2689:6: lv_begin_5_0= RULE_INT
                    {
                    lv_begin_5_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    						newLeafNode(lv_begin_5_0, grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"begin",
                    							lv_begin_5_0,
                    							"com.raptor.mcentity.MCEntity.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:2711:3: ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) )
                    {
                    // InternalMCEntity.g:2711:3: ( () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) ) )
                    // InternalMCEntity.g:2712:4: () otherlv_8= '..' ( (lv_end_9_0= RULE_INT ) )
                    {
                    // InternalMCEntity.g:2712:4: ()
                    // InternalMCEntity.g:2713:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getIntRangeAccess().getOpenBeginningIntRangeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_2_1());
                    			
                    // InternalMCEntity.g:2723:4: ( (lv_end_9_0= RULE_INT ) )
                    // InternalMCEntity.g:2724:5: (lv_end_9_0= RULE_INT )
                    {
                    // InternalMCEntity.g:2724:5: (lv_end_9_0= RULE_INT )
                    // InternalMCEntity.g:2725:6: lv_end_9_0= RULE_INT
                    {
                    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_end_9_0, grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_9_0,
                    							"com.raptor.mcentity.MCEntity.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntRange"


    // $ANTLR start "entryRuleDoubleRange"
    // InternalMCEntity.g:2746:1: entryRuleDoubleRange returns [EObject current=null] : iv_ruleDoubleRange= ruleDoubleRange EOF ;
    public final EObject entryRuleDoubleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleRange = null;


        try {
            // InternalMCEntity.g:2746:52: (iv_ruleDoubleRange= ruleDoubleRange EOF )
            // InternalMCEntity.g:2747:2: iv_ruleDoubleRange= ruleDoubleRange EOF
            {
             newCompositeNode(grammarAccess.getDoubleRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleRange=ruleDoubleRange();

            state._fsp--;

             current =iv_ruleDoubleRange; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleRange"


    // $ANTLR start "ruleDoubleRange"
    // InternalMCEntity.g:2753:1: ruleDoubleRange returns [EObject current=null] : ( ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) ) | ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' ) | ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleDoubleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token lv_begin_4_0=null;
        Token otherlv_5=null;
        Token lv_begin_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_end_12_0=null;
        AntlrDatatypeRuleToken lv_begin_1_0 = null;

        AntlrDatatypeRuleToken lv_end_6_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2759:2: ( ( ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) ) | ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' ) | ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) ) ) )
            // InternalMCEntity.g:2760:2: ( ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) ) | ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' ) | ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) ) )
            {
            // InternalMCEntity.g:2760:2: ( ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) ) | ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' ) | ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt53=1;
                }
                break;
            case RULE_DOUBLE:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==41) ) {
                    int LA53_4 = input.LA(3);

                    if ( (LA53_4==EOF||LA53_4==32||LA53_4==35) ) {
                        alt53=2;
                    }
                    else if ( (LA53_4==RULE_INT||LA53_4==RULE_DOUBLE) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMCEntity.g:2761:3: ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) )
                    {
                    // InternalMCEntity.g:2761:3: ( () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) ) )
                    // InternalMCEntity.g:2762:4: () ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) )
                    {
                    // InternalMCEntity.g:2762:4: ()
                    // InternalMCEntity.g:2763:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDoubleRangeAccess().getClosedDoubleRangeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMCEntity.g:2769:4: ( ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) ) | ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_INT) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_DOUBLE) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalMCEntity.g:2770:5: ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) )
                            {
                            // InternalMCEntity.g:2770:5: ( ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) ) )
                            // InternalMCEntity.g:2771:6: ( (lv_begin_1_0= ruleINTasDouble ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_DOUBLE ) )
                            {
                            // InternalMCEntity.g:2771:6: ( (lv_begin_1_0= ruleINTasDouble ) )
                            // InternalMCEntity.g:2772:7: (lv_begin_1_0= ruleINTasDouble )
                            {
                            // InternalMCEntity.g:2772:7: (lv_begin_1_0= ruleINTasDouble )
                            // InternalMCEntity.g:2773:8: lv_begin_1_0= ruleINTasDouble
                            {

                            								newCompositeNode(grammarAccess.getDoubleRangeAccess().getBeginINTasDoubleParserRuleCall_0_1_0_0_0());
                            							
                            pushFollow(FOLLOW_39);
                            lv_begin_1_0=ruleINTasDouble();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDoubleRangeRule());
                            								}
                            								set(
                            									current,
                            									"begin",
                            									lv_begin_1_0,
                            									"com.raptor.mcentity.MCEntity.INTasDouble");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,41,FOLLOW_40); 

                            						newLeafNode(otherlv_2, grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_0_1());
                            					
                            // InternalMCEntity.g:2794:6: ( (lv_end_3_0= RULE_DOUBLE ) )
                            // InternalMCEntity.g:2795:7: (lv_end_3_0= RULE_DOUBLE )
                            {
                            // InternalMCEntity.g:2795:7: (lv_end_3_0= RULE_DOUBLE )
                            // InternalMCEntity.g:2796:8: lv_end_3_0= RULE_DOUBLE
                            {
                            lv_end_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                            								newLeafNode(lv_end_3_0, grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_0_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDoubleRangeRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"end",
                            									lv_end_3_0,
                            									"com.raptor.mcentity.MCEntity.DOUBLE");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:2814:5: ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) )
                            {
                            // InternalMCEntity.g:2814:5: ( ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) ) )
                            // InternalMCEntity.g:2815:6: ( (lv_begin_4_0= RULE_DOUBLE ) ) otherlv_5= '..' ( (lv_end_6_0= ruleDOUBLEorINT ) )
                            {
                            // InternalMCEntity.g:2815:6: ( (lv_begin_4_0= RULE_DOUBLE ) )
                            // InternalMCEntity.g:2816:7: (lv_begin_4_0= RULE_DOUBLE )
                            {
                            // InternalMCEntity.g:2816:7: (lv_begin_4_0= RULE_DOUBLE )
                            // InternalMCEntity.g:2817:8: lv_begin_4_0= RULE_DOUBLE
                            {
                            lv_begin_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_39); 

                            								newLeafNode(lv_begin_4_0, grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_0_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDoubleRangeRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"begin",
                            									lv_begin_4_0,
                            									"com.raptor.mcentity.MCEntity.DOUBLE");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,41,FOLLOW_41); 

                            						newLeafNode(otherlv_5, grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_1_1());
                            					
                            // InternalMCEntity.g:2837:6: ( (lv_end_6_0= ruleDOUBLEorINT ) )
                            // InternalMCEntity.g:2838:7: (lv_end_6_0= ruleDOUBLEorINT )
                            {
                            // InternalMCEntity.g:2838:7: (lv_end_6_0= ruleDOUBLEorINT )
                            // InternalMCEntity.g:2839:8: lv_end_6_0= ruleDOUBLEorINT
                            {

                            								newCompositeNode(grammarAccess.getDoubleRangeAccess().getEndDOUBLEorINTParserRuleCall_0_1_1_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_end_6_0=ruleDOUBLEorINT();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDoubleRangeRule());
                            								}
                            								set(
                            									current,
                            									"end",
                            									lv_end_6_0,
                            									"com.raptor.mcentity.MCEntity.DOUBLEorINT");
                            								afterParserOrEnumRuleCall();
                            							

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
                    // InternalMCEntity.g:2860:3: ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' )
                    {
                    // InternalMCEntity.g:2860:3: ( () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..' )
                    // InternalMCEntity.g:2861:4: () ( (lv_begin_8_0= RULE_DOUBLE ) ) otherlv_9= '..'
                    {
                    // InternalMCEntity.g:2861:4: ()
                    // InternalMCEntity.g:2862:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDoubleRangeAccess().getOpenEndedDoubleRangeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMCEntity.g:2868:4: ( (lv_begin_8_0= RULE_DOUBLE ) )
                    // InternalMCEntity.g:2869:5: (lv_begin_8_0= RULE_DOUBLE )
                    {
                    // InternalMCEntity.g:2869:5: (lv_begin_8_0= RULE_DOUBLE )
                    // InternalMCEntity.g:2870:6: lv_begin_8_0= RULE_DOUBLE
                    {
                    lv_begin_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_39); 

                    						newLeafNode(lv_begin_8_0, grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoubleRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"begin",
                    							lv_begin_8_0,
                    							"com.raptor.mcentity.MCEntity.DOUBLE");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:2892:3: ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) )
                    {
                    // InternalMCEntity.g:2892:3: ( () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) ) )
                    // InternalMCEntity.g:2893:4: () otherlv_11= '..' ( (lv_end_12_0= RULE_DOUBLE ) )
                    {
                    // InternalMCEntity.g:2893:4: ()
                    // InternalMCEntity.g:2894:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDoubleRangeAccess().getOpenBeginningDoubleRangeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,41,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_2_1());
                    			
                    // InternalMCEntity.g:2904:4: ( (lv_end_12_0= RULE_DOUBLE ) )
                    // InternalMCEntity.g:2905:5: (lv_end_12_0= RULE_DOUBLE )
                    {
                    // InternalMCEntity.g:2905:5: (lv_end_12_0= RULE_DOUBLE )
                    // InternalMCEntity.g:2906:6: lv_end_12_0= RULE_DOUBLE
                    {
                    lv_end_12_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_end_12_0, grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoubleRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_12_0,
                    							"com.raptor.mcentity.MCEntity.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleRange"


    // $ANTLR start "entryRuleIntSelectorValue"
    // InternalMCEntity.g:2927:1: entryRuleIntSelectorValue returns [EObject current=null] : iv_ruleIntSelectorValue= ruleIntSelectorValue EOF ;
    public final EObject entryRuleIntSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntSelectorValue = null;


        try {
            // InternalMCEntity.g:2927:57: (iv_ruleIntSelectorValue= ruleIntSelectorValue EOF )
            // InternalMCEntity.g:2928:2: iv_ruleIntSelectorValue= ruleIntSelectorValue EOF
            {
             newCompositeNode(grammarAccess.getIntSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntSelectorValue=ruleIntSelectorValue();

            state._fsp--;

             current =iv_ruleIntSelectorValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntSelectorValue"


    // $ANTLR start "ruleIntSelectorValue"
    // InternalMCEntity.g:2934:1: ruleIntSelectorValue returns [EObject current=null] : ( (lv_value_0_0= ruleINTAsLong ) ) ;
    public final EObject ruleIntSelectorValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:2940:2: ( ( (lv_value_0_0= ruleINTAsLong ) ) )
            // InternalMCEntity.g:2941:2: ( (lv_value_0_0= ruleINTAsLong ) )
            {
            // InternalMCEntity.g:2941:2: ( (lv_value_0_0= ruleINTAsLong ) )
            // InternalMCEntity.g:2942:3: (lv_value_0_0= ruleINTAsLong )
            {
            // InternalMCEntity.g:2942:3: (lv_value_0_0= ruleINTAsLong )
            // InternalMCEntity.g:2943:4: lv_value_0_0= ruleINTAsLong
            {

            				newCompositeNode(grammarAccess.getIntSelectorValueAccess().getValueINTAsLongParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleINTAsLong();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntSelectorValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.INTAsLong");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntSelectorValue"


    // $ANTLR start "entryRuleDoubleSelectorValue"
    // InternalMCEntity.g:2963:1: entryRuleDoubleSelectorValue returns [EObject current=null] : iv_ruleDoubleSelectorValue= ruleDoubleSelectorValue EOF ;
    public final EObject entryRuleDoubleSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleSelectorValue = null;


        try {
            // InternalMCEntity.g:2963:60: (iv_ruleDoubleSelectorValue= ruleDoubleSelectorValue EOF )
            // InternalMCEntity.g:2964:2: iv_ruleDoubleSelectorValue= ruleDoubleSelectorValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleSelectorValue=ruleDoubleSelectorValue();

            state._fsp--;

             current =iv_ruleDoubleSelectorValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleSelectorValue"


    // $ANTLR start "ruleDoubleSelectorValue"
    // InternalMCEntity.g:2970:1: ruleDoubleSelectorValue returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubleSelectorValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:2976:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalMCEntity.g:2977:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalMCEntity.g:2977:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalMCEntity.g:2978:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalMCEntity.g:2978:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalMCEntity.g:2979:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDoubleSelectorValueAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDoubleSelectorValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.raptor.mcentity.MCEntity.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleSelectorValue"


    // $ANTLR start "entryRuleDOUBLEorINT"
    // InternalMCEntity.g:2998:1: entryRuleDOUBLEorINT returns [String current=null] : iv_ruleDOUBLEorINT= ruleDOUBLEorINT EOF ;
    public final String entryRuleDOUBLEorINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLEorINT = null;


        try {
            // InternalMCEntity.g:2998:51: (iv_ruleDOUBLEorINT= ruleDOUBLEorINT EOF )
            // InternalMCEntity.g:2999:2: iv_ruleDOUBLEorINT= ruleDOUBLEorINT EOF
            {
             newCompositeNode(grammarAccess.getDOUBLEorINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLEorINT=ruleDOUBLEorINT();

            state._fsp--;

             current =iv_ruleDOUBLEorINT.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLEorINT"


    // $ANTLR start "ruleDOUBLEorINT"
    // InternalMCEntity.g:3005:1: ruleDOUBLEorINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLEorINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMCEntity.g:3011:2: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // InternalMCEntity.g:3012:2: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // InternalMCEntity.g:3012:2: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_DOUBLE) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_INT) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMCEntity.g:3013:3: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_0);
                    		

                    			newLeafNode(this_DOUBLE_0, grammarAccess.getDOUBLEorINTAccess().getDOUBLETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3021:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getDOUBLEorINTAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLEorINT"


    // $ANTLR start "entryRuleINTasDouble"
    // InternalMCEntity.g:3032:1: entryRuleINTasDouble returns [String current=null] : iv_ruleINTasDouble= ruleINTasDouble EOF ;
    public final String entryRuleINTasDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTasDouble = null;


        try {
            // InternalMCEntity.g:3032:51: (iv_ruleINTasDouble= ruleINTasDouble EOF )
            // InternalMCEntity.g:3033:2: iv_ruleINTasDouble= ruleINTasDouble EOF
            {
             newCompositeNode(grammarAccess.getINTasDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTasDouble=ruleINTasDouble();

            state._fsp--;

             current =iv_ruleINTasDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINTasDouble"


    // $ANTLR start "ruleINTasDouble"
    // InternalMCEntity.g:3039:1: ruleINTasDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTasDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMCEntity.g:3045:2: (this_INT_0= RULE_INT )
            // InternalMCEntity.g:3046:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getINTasDoubleAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTasDouble"


    // $ANTLR start "entryRuleBoolSelectorValue"
    // InternalMCEntity.g:3056:1: entryRuleBoolSelectorValue returns [EObject current=null] : iv_ruleBoolSelectorValue= ruleBoolSelectorValue EOF ;
    public final EObject entryRuleBoolSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolSelectorValue = null;


        try {
            // InternalMCEntity.g:3056:58: (iv_ruleBoolSelectorValue= ruleBoolSelectorValue EOF )
            // InternalMCEntity.g:3057:2: iv_ruleBoolSelectorValue= ruleBoolSelectorValue EOF
            {
             newCompositeNode(grammarAccess.getBoolSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolSelectorValue=ruleBoolSelectorValue();

            state._fsp--;

             current =iv_ruleBoolSelectorValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolSelectorValue"


    // $ANTLR start "ruleBoolSelectorValue"
    // InternalMCEntity.g:3063:1: ruleBoolSelectorValue returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) ;
    public final EObject ruleBoolSelectorValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMCEntity.g:3069:2: ( ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) ) )
            // InternalMCEntity.g:3070:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            {
            // InternalMCEntity.g:3070:2: ( ( (lv_value_0_0= 'true' ) ) | (otherlv_1= 'false' () ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            else if ( (LA55_0==38) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalMCEntity.g:3071:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalMCEntity.g:3071:3: ( (lv_value_0_0= 'true' ) )
                    // InternalMCEntity.g:3072:4: (lv_value_0_0= 'true' )
                    {
                    // InternalMCEntity.g:3072:4: (lv_value_0_0= 'true' )
                    // InternalMCEntity.g:3073:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBoolSelectorValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolSelectorValueRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3086:3: (otherlv_1= 'false' () )
                    {
                    // InternalMCEntity.g:3086:3: (otherlv_1= 'false' () )
                    // InternalMCEntity.g:3087:4: otherlv_1= 'false' ()
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoolSelectorValueAccess().getFalseKeyword_1_0());
                    			
                    // InternalMCEntity.g:3091:4: ()
                    // InternalMCEntity.g:3092:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBoolSelectorValueAccess().getBoolSelectorValueAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolSelectorValue"


    // $ANTLR start "entryRuleStringSelectorValue"
    // InternalMCEntity.g:3103:1: entryRuleStringSelectorValue returns [EObject current=null] : iv_ruleStringSelectorValue= ruleStringSelectorValue EOF ;
    public final EObject entryRuleStringSelectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSelectorValue = null;


        try {
            // InternalMCEntity.g:3103:60: (iv_ruleStringSelectorValue= ruleStringSelectorValue EOF )
            // InternalMCEntity.g:3104:2: iv_ruleStringSelectorValue= ruleStringSelectorValue EOF
            {
             newCompositeNode(grammarAccess.getStringSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringSelectorValue=ruleStringSelectorValue();

            state._fsp--;

             current =iv_ruleStringSelectorValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringSelectorValue"


    // $ANTLR start "ruleStringSelectorValue"
    // InternalMCEntity.g:3110:1: ruleStringSelectorValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) ) ) ;
    public final EObject ruleStringSelectorValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalMCEntity.g:3116:2: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) ) ) )
            // InternalMCEntity.g:3117:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) ) )
            {
            // InternalMCEntity.g:3117:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) ) )
            // InternalMCEntity.g:3118:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) )
            {
            // InternalMCEntity.g:3118:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString ) )
            // InternalMCEntity.g:3119:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString )
            {
            // InternalMCEntity.g:3119:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= ruleUnquotedString )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID||(LA56_0>=43 && LA56_0<=45)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMCEntity.g:3120:5: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getStringSelectorValueAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringSelectorValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"com.raptor.mcentity.MCEntity.STRING");
                    				

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3135:5: lv_value_0_2= ruleUnquotedString
                    {

                    					newCompositeNode(grammarAccess.getStringSelectorValueAccess().getValueUnquotedStringParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleUnquotedString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringSelectorValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"com.raptor.mcentity.MCEntity.UnquotedString");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringSelectorValue"


    // $ANTLR start "entryRuleNamespacedKey"
    // InternalMCEntity.g:3156:1: entryRuleNamespacedKey returns [EObject current=null] : iv_ruleNamespacedKey= ruleNamespacedKey EOF ;
    public final EObject entryRuleNamespacedKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespacedKey = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3158:2: (iv_ruleNamespacedKey= ruleNamespacedKey EOF )
            // InternalMCEntity.g:3159:2: iv_ruleNamespacedKey= ruleNamespacedKey EOF
            {
             newCompositeNode(grammarAccess.getNamespacedKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespacedKey=ruleNamespacedKey();

            state._fsp--;

             current =iv_ruleNamespacedKey; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespacedKey"


    // $ANTLR start "ruleNamespacedKey"
    // InternalMCEntity.g:3168:1: ruleNamespacedKey returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleUnquotedString ) ) otherlv_1= ':' ( (lv_key_2_0= ruleNamespacedKeyKey ) ) ) ;
    public final EObject ruleNamespacedKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        AntlrDatatypeRuleToken lv_key_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3175:2: ( ( ( (lv_namespace_0_0= ruleUnquotedString ) ) otherlv_1= ':' ( (lv_key_2_0= ruleNamespacedKeyKey ) ) ) )
            // InternalMCEntity.g:3176:2: ( ( (lv_namespace_0_0= ruleUnquotedString ) ) otherlv_1= ':' ( (lv_key_2_0= ruleNamespacedKeyKey ) ) )
            {
            // InternalMCEntity.g:3176:2: ( ( (lv_namespace_0_0= ruleUnquotedString ) ) otherlv_1= ':' ( (lv_key_2_0= ruleNamespacedKeyKey ) ) )
            // InternalMCEntity.g:3177:3: ( (lv_namespace_0_0= ruleUnquotedString ) ) otherlv_1= ':' ( (lv_key_2_0= ruleNamespacedKeyKey ) )
            {
            // InternalMCEntity.g:3177:3: ( (lv_namespace_0_0= ruleUnquotedString ) )
            // InternalMCEntity.g:3178:4: (lv_namespace_0_0= ruleUnquotedString )
            {
            // InternalMCEntity.g:3178:4: (lv_namespace_0_0= ruleUnquotedString )
            // InternalMCEntity.g:3179:5: lv_namespace_0_0= ruleUnquotedString
            {

            					newCompositeNode(grammarAccess.getNamespacedKeyAccess().getNamespaceUnquotedStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_namespace_0_0=ruleUnquotedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespacedKeyRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_0_0,
            						"com.raptor.mcentity.MCEntity.UnquotedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNamespacedKeyAccess().getColonKeyword_1());
            		
            // InternalMCEntity.g:3200:3: ( (lv_key_2_0= ruleNamespacedKeyKey ) )
            // InternalMCEntity.g:3201:4: (lv_key_2_0= ruleNamespacedKeyKey )
            {
            // InternalMCEntity.g:3201:4: (lv_key_2_0= ruleNamespacedKeyKey )
            // InternalMCEntity.g:3202:5: lv_key_2_0= ruleNamespacedKeyKey
            {

            					newCompositeNode(grammarAccess.getNamespacedKeyAccess().getKeyNamespacedKeyKeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_2_0=ruleNamespacedKeyKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespacedKeyRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"com.raptor.mcentity.MCEntity.NamespacedKeyKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleNamespacedKey"


    // $ANTLR start "entryRuleNamespacedKeyKey"
    // InternalMCEntity.g:3226:1: entryRuleNamespacedKeyKey returns [String current=null] : iv_ruleNamespacedKeyKey= ruleNamespacedKeyKey EOF ;
    public final String entryRuleNamespacedKeyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedKeyKey = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3228:2: (iv_ruleNamespacedKeyKey= ruleNamespacedKeyKey EOF )
            // InternalMCEntity.g:3229:2: iv_ruleNamespacedKeyKey= ruleNamespacedKeyKey EOF
            {
             newCompositeNode(grammarAccess.getNamespacedKeyKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespacedKeyKey=ruleNamespacedKeyKey();

            state._fsp--;

             current =iv_ruleNamespacedKeyKey.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespacedKeyKey"


    // $ANTLR start "ruleNamespacedKeyKey"
    // InternalMCEntity.g:3238:1: ruleNamespacedKeyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnquotedString_0= ruleUnquotedString (kw= '/' this_UnquotedString_2= ruleUnquotedString )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedKeyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnquotedString_0 = null;

        AntlrDatatypeRuleToken this_UnquotedString_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3245:2: ( (this_UnquotedString_0= ruleUnquotedString (kw= '/' this_UnquotedString_2= ruleUnquotedString )* ) )
            // InternalMCEntity.g:3246:2: (this_UnquotedString_0= ruleUnquotedString (kw= '/' this_UnquotedString_2= ruleUnquotedString )* )
            {
            // InternalMCEntity.g:3246:2: (this_UnquotedString_0= ruleUnquotedString (kw= '/' this_UnquotedString_2= ruleUnquotedString )* )
            // InternalMCEntity.g:3247:3: this_UnquotedString_0= ruleUnquotedString (kw= '/' this_UnquotedString_2= ruleUnquotedString )*
            {

            			newCompositeNode(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_UnquotedString_0=ruleUnquotedString();

            state._fsp--;


            			current.merge(this_UnquotedString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMCEntity.g:3257:3: (kw= '/' this_UnquotedString_2= ruleUnquotedString )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==42) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMCEntity.g:3258:4: kw= '/' this_UnquotedString_2= ruleUnquotedString
            	    {
            	    kw=(Token)match(input,42,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNamespacedKeyKeyAccess().getSolidusKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_42);
            	    this_UnquotedString_2=ruleUnquotedString();

            	    state._fsp--;


            	    				current.merge(this_UnquotedString_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleNamespacedKeyKey"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalMCEntity.g:3281:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3283:2: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalMCEntity.g:3284:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
             newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;

             current =iv_ruleUnquotedString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalMCEntity.g:3293:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' ) (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;
        Token this_INT_8=null;
        Token this_FLOAT_9=null;
        Token this_DOUBLE_10=null;
        Token this_LONG_11=null;
        Token this_SHORT_12=null;
        Token this_BYTE_13=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:3300:2: ( ( (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' ) (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )* ) )
            // InternalMCEntity.g:3301:2: ( (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' ) (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )* )
            {
            // InternalMCEntity.g:3301:2: ( (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' ) (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )* )
            // InternalMCEntity.g:3302:3: (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' ) (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )*
            {
            // InternalMCEntity.g:3302:3: (this_ID_0= RULE_ID | kw= '-' | kw= '.' | kw= '+' )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt58=1;
                }
                break;
            case 43:
                {
                alt58=2;
                }
                break;
            case 44:
                {
                alt58=3;
                }
                break;
            case 45:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMCEntity.g:3303:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3311:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:3317:4: kw= '.'
                    {
                    kw=(Token)match(input,44,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:3323:4: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalMCEntity.g:3329:3: (this_ID_4= RULE_ID | kw= '-' | kw= '.' | kw= '+' | this_INT_8= RULE_INT | this_FLOAT_9= RULE_FLOAT | this_DOUBLE_10= RULE_DOUBLE | this_LONG_11= RULE_LONG | this_SHORT_12= RULE_SHORT | this_BYTE_13= RULE_BYTE )*
            loop59:
            do {
                int alt59=11;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt59=1;
                    }
                    break;
                case 43:
                    {
                    alt59=2;
                    }
                    break;
                case 44:
                    {
                    alt59=3;
                    }
                    break;
                case 45:
                    {
                    alt59=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt59=5;
                    }
                    break;
                case RULE_FLOAT:
                    {
                    alt59=6;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt59=7;
                    }
                    break;
                case RULE_LONG:
                    {
                    alt59=8;
                    }
                    break;
                case RULE_SHORT:
                    {
                    alt59=9;
                    }
                    break;
                case RULE_BYTE:
                    {
                    alt59=10;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // InternalMCEntity.g:3330:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMCEntity.g:3338:4: kw= '-'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMCEntity.g:3344:4: kw= '.'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_43); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getFullStopKeyword_1_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMCEntity.g:3350:4: kw= '+'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_43); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_1_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMCEntity.g:3356:4: this_INT_8= RULE_INT
            	    {
            	    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_43); 

            	    				current.merge(this_INT_8);
            	    			

            	    				newLeafNode(this_INT_8, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalMCEntity.g:3364:4: this_FLOAT_9= RULE_FLOAT
            	    {
            	    this_FLOAT_9=(Token)match(input,RULE_FLOAT,FOLLOW_43); 

            	    				current.merge(this_FLOAT_9);
            	    			

            	    				newLeafNode(this_FLOAT_9, grammarAccess.getUnquotedStringAccess().getFLOATTerminalRuleCall_1_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalMCEntity.g:3372:4: this_DOUBLE_10= RULE_DOUBLE
            	    {
            	    this_DOUBLE_10=(Token)match(input,RULE_DOUBLE,FOLLOW_43); 

            	    				current.merge(this_DOUBLE_10);
            	    			

            	    				newLeafNode(this_DOUBLE_10, grammarAccess.getUnquotedStringAccess().getDOUBLETerminalRuleCall_1_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalMCEntity.g:3380:4: this_LONG_11= RULE_LONG
            	    {
            	    this_LONG_11=(Token)match(input,RULE_LONG,FOLLOW_43); 

            	    				current.merge(this_LONG_11);
            	    			

            	    				newLeafNode(this_LONG_11, grammarAccess.getUnquotedStringAccess().getLONGTerminalRuleCall_1_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalMCEntity.g:3388:4: this_SHORT_12= RULE_SHORT
            	    {
            	    this_SHORT_12=(Token)match(input,RULE_SHORT,FOLLOW_43); 

            	    				current.merge(this_SHORT_12);
            	    			

            	    				newLeafNode(this_SHORT_12, grammarAccess.getUnquotedStringAccess().getSHORTTerminalRuleCall_1_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalMCEntity.g:3396:4: this_BYTE_13= RULE_BYTE
            	    {
            	    this_BYTE_13=(Token)match(input,RULE_BYTE,FOLLOW_43); 

            	    				current.merge(this_BYTE_13);
            	    			

            	    				newLeafNode(this_BYTE_13, grammarAccess.getUnquotedStringAccess().getBYTETerminalRuleCall_1_9());
            	    			

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "ruleSelectorType"
    // InternalMCEntity.g:3411:1: ruleSelectorType returns [Enumerator current=null] : ( (enumLiteral_0= '@p' ) | (enumLiteral_1= '@a' ) | (enumLiteral_2= '@s' ) | (enumLiteral_3= '@e' ) | (enumLiteral_4= '@r' ) ) ;
    public final Enumerator ruleSelectorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMCEntity.g:3417:2: ( ( (enumLiteral_0= '@p' ) | (enumLiteral_1= '@a' ) | (enumLiteral_2= '@s' ) | (enumLiteral_3= '@e' ) | (enumLiteral_4= '@r' ) ) )
            // InternalMCEntity.g:3418:2: ( (enumLiteral_0= '@p' ) | (enumLiteral_1= '@a' ) | (enumLiteral_2= '@s' ) | (enumLiteral_3= '@e' ) | (enumLiteral_4= '@r' ) )
            {
            // InternalMCEntity.g:3418:2: ( (enumLiteral_0= '@p' ) | (enumLiteral_1= '@a' ) | (enumLiteral_2= '@s' ) | (enumLiteral_3= '@e' ) | (enumLiteral_4= '@r' ) )
            int alt60=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt60=1;
                }
                break;
            case 47:
                {
                alt60=2;
                }
                break;
            case 48:
                {
                alt60=3;
                }
                break;
            case 49:
                {
                alt60=4;
                }
                break;
            case 50:
                {
                alt60=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMCEntity.g:3419:3: (enumLiteral_0= '@p' )
                    {
                    // InternalMCEntity.g:3419:3: (enumLiteral_0= '@p' )
                    // InternalMCEntity.g:3420:4: enumLiteral_0= '@p'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSelectorTypeAccess().getNEAREST_PLAYEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSelectorTypeAccess().getNEAREST_PLAYEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3427:3: (enumLiteral_1= '@a' )
                    {
                    // InternalMCEntity.g:3427:3: (enumLiteral_1= '@a' )
                    // InternalMCEntity.g:3428:4: enumLiteral_1= '@a'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSelectorTypeAccess().getALL_PLAYERSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSelectorTypeAccess().getALL_PLAYERSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:3435:3: (enumLiteral_2= '@s' )
                    {
                    // InternalMCEntity.g:3435:3: (enumLiteral_2= '@s' )
                    // InternalMCEntity.g:3436:4: enumLiteral_2= '@s'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSelectorTypeAccess().getSELFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSelectorTypeAccess().getSELFEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:3443:3: (enumLiteral_3= '@e' )
                    {
                    // InternalMCEntity.g:3443:3: (enumLiteral_3= '@e' )
                    // InternalMCEntity.g:3444:4: enumLiteral_3= '@e'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSelectorTypeAccess().getENTITIESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSelectorTypeAccess().getENTITIESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:3451:3: (enumLiteral_4= '@r' )
                    {
                    // InternalMCEntity.g:3451:3: (enumLiteral_4= '@r' )
                    // InternalMCEntity.g:3452:4: enumLiteral_4= '@r'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSelectorTypeAccess().getRANDOM_PLAYEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSelectorTypeAccess().getRANDOM_PLAYEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorType"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\11\uffff\4\15\1\uffff\12\15\1\uffff";
    static final String dfa_3s = "\1\4\10\uffff\4\6\1\uffff\12\6\1\uffff";
    static final String dfa_4s = "\1\55\10\uffff\4\55\1\uffff\12\55\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\12\12\uffff\1\11";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\1\3\1\10\1\4\1\10\1\5\4\10\1\15\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\11\11\uffff\1\2\4\uffff\1\6\2\7\4\uffff\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            "\1\27\1\uffff\1\25\1\uffff\1\22\1\23\1\24\1\26\7\uffff\1\16\12\uffff\2\15\1\30\10\uffff\1\17\1\20\1\21",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "115:2: (this_NBTJSONTextComponent_0= ruleNBTJSONTextComponent | this_NBTCompound_1= ruleNBTCompound | this_NBTByteArray_2= ruleNBTByteArray | this_NBTLongArray_3= ruleNBTLongArray | this_NBTIntArray_4= ruleNBTIntArray | this_NBTArray_5= ruleNBTArray | this_NBTBool_6= ruleNBTBool | this_NBTNumber_7= ruleNBTNumber | this_NamespacedKey_8= ruleNamespacedKey | this_NBTString_9= ruleNBTString )";
        }
    }
    static final String dfa_8s = "\33\uffff";
    static final String dfa_9s = "\2\uffff\4\11\1\27\1\uffff\1\32\2\uffff\12\11\1\uffff\1\30\4\uffff";
    static final String dfa_10s = "\1\4\1\uffff\4\6\1\40\1\12\1\40\2\uffff\12\6\1\uffff\1\12\4\uffff";
    static final String dfa_11s = "\1\55\1\uffff\4\55\1\51\1\14\1\51\2\uffff\12\55\1\uffff\1\43\4\uffff";
    static final String dfa_12s = "\1\uffff\1\1\7\uffff\1\7\1\10\12\uffff\1\2\1\uffff\1\5\1\3\1\4\1\6";
    static final String dfa_13s = "\33\uffff}>";
    static final String[] dfa_14s = {
            "\1\11\5\uffff\1\6\1\uffff\1\10\10\uffff\1\2\11\uffff\1\1\5\uffff\2\12\2\uffff\1\7\1\uffff\1\3\1\4\1\5",
            "",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\27\2\uffff\1\27\5\uffff\1\26",
            "\1\30\1\uffff\1\31",
            "\1\32\2\uffff\1\32\5\uffff\1\31",
            "",
            "",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "\1\24\1\uffff\1\22\1\uffff\1\17\1\20\1\21\1\23\7\uffff\1\13\12\uffff\1\11\1\uffff\1\25\1\11\7\uffff\1\14\1\15\1\16",
            "",
            "\1\30\1\uffff\1\31\23\uffff\1\30\2\uffff\1\30",
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

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2538:2: (this_NBTCompound_0= ruleNBTCompound | this_NamespacedKey_1= ruleNamespacedKey | this_IntRange_2= ruleIntRange | this_DoubleRange_3= ruleDoubleRange | this_IntSelectorValue_4= ruleIntSelectorValue | this_DoubleSelectorValue_5= ruleDoubleSelectorValue | this_StringSelectorValue_6= ruleStringSelectorValue | this_BoolSelectorValue_7= ruleBoolSelectorValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000380200200010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000380000200010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003870802AFFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00003878802AFFF0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000003D40L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0007C07080041410L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0007C07080001410L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0007C07880001410L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003B6080201410L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000380000203D42L});

}