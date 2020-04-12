package com.raptor.mcentity.ide.contentassist.antlr.internal;

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
import com.raptor.mcentity.services.MCEntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCEntityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_SINGLE_STRING", "RULE_DOUBLE", "RULE_ID", "RULE_FLOAT", "RULE_LONG", "RULE_SHORT", "RULE_BYTE", "RULE_NBT_BYTE_ARRAY_START", "RULE_NBT_LONG_ARRAY_START", "RULE_NBT_INT_ARRAY_START", "RULE_JSON_TEXT_BEGIN_OBJ", "RULE_JSON_TEXT_END_OBJ", "RULE_JSON_TEXT_BEGIN_ARRAY", "RULE_JSON_TEXT_END_ARRAY", "RULE_JSON_TEXT_BEGIN_STR", "RULE_JSON_TEXT_END_STR", "RULE_SIGN", "RULE_EXP", "RULE_HEX_DIGIT", "RULE_INTBASE", "RULE_SIGNEDINTBASE", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'-'", "'.'", "'+'", "'@p'", "'@a'", "'@s'", "'@e'", "'@r'", "'{'", "'}'", "','", "':'", "']'", "'['", "'false'", "'='", "'..'", "'/'", "'true'", "'!'"
    };
    public static final int RULE_EXP=23;
    public static final int T__50=50;
    public static final int RULE_SIGN=22;
    public static final int RULE_NBT_LONG_ARRAY_START=14;
    public static final int RULE_SINGLE_STRING=6;
    public static final int RULE_SIGNEDINTBASE=26;
    public static final int RULE_JSON_TEXT_BEGIN_ARRAY=18;
    public static final int RULE_NBT_INT_ARRAY_START=15;
    public static final int RULE_ID=8;
    public static final int RULE_JSON_TEXT_END_STR=21;
    public static final int RULE_SHORT=11;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=28;
    public static final int RULE_NBT_BYTE_ARRAY_START=13;
    public static final int RULE_STRING=5;
    public static final int RULE_BYTE=12;
    public static final int RULE_JSON_TEXT_BEGIN_STR=20;
    public static final int RULE_SL_COMMENT=29;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int RULE_JSON_TEXT_END_ARRAY=19;
    public static final int T__32=32;
    public static final int RULE_WS=27;
    public static final int RULE_ANY_OTHER=30;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_JSON_TEXT_BEGIN_OBJ=16;
    public static final int T__44=44;
    public static final int RULE_INTBASE=25;
    public static final int T__45=45;
    public static final int RULE_FLOAT=9;
    public static final int RULE_HEX_DIGIT=24;
    public static final int T__46=46;
    public static final int RULE_LONG=10;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_JSON_TEXT_END_OBJ=17;
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

    	public void setGrammarAccess(MCEntityGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEntityData"
    // InternalMCEntity.g:53:1: entryRuleEntityData : ruleEntityData EOF ;
    public final void entryRuleEntityData() throws RecognitionException {
        try {
            // InternalMCEntity.g:54:1: ( ruleEntityData EOF )
            // InternalMCEntity.g:55:1: ruleEntityData EOF
            {
             before(grammarAccess.getEntityDataRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityData();

            state._fsp--;

             after(grammarAccess.getEntityDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityData"


    // $ANTLR start "ruleEntityData"
    // InternalMCEntity.g:62:1: ruleEntityData : ( ( rule__EntityData__NbtAssignment ) ) ;
    public final void ruleEntityData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:66:2: ( ( ( rule__EntityData__NbtAssignment ) ) )
            // InternalMCEntity.g:67:2: ( ( rule__EntityData__NbtAssignment ) )
            {
            // InternalMCEntity.g:67:2: ( ( rule__EntityData__NbtAssignment ) )
            // InternalMCEntity.g:68:3: ( rule__EntityData__NbtAssignment )
            {
             before(grammarAccess.getEntityDataAccess().getNbtAssignment()); 
            // InternalMCEntity.g:69:3: ( rule__EntityData__NbtAssignment )
            // InternalMCEntity.g:69:4: rule__EntityData__NbtAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityData__NbtAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityDataAccess().getNbtAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityData"


    // $ANTLR start "entryRuleNBTValue"
    // InternalMCEntity.g:78:1: entryRuleNBTValue : ruleNBTValue EOF ;
    public final void entryRuleNBTValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:79:1: ( ruleNBTValue EOF )
            // InternalMCEntity.g:80:1: ruleNBTValue EOF
            {
             before(grammarAccess.getNBTValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTValue();

            state._fsp--;

             after(grammarAccess.getNBTValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTValue"


    // $ANTLR start "ruleNBTValue"
    // InternalMCEntity.g:87:1: ruleNBTValue : ( ( rule__NBTValue__Alternatives ) ) ;
    public final void ruleNBTValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:91:2: ( ( ( rule__NBTValue__Alternatives ) ) )
            // InternalMCEntity.g:92:2: ( ( rule__NBTValue__Alternatives ) )
            {
            // InternalMCEntity.g:92:2: ( ( rule__NBTValue__Alternatives ) )
            // InternalMCEntity.g:93:3: ( rule__NBTValue__Alternatives )
            {
             before(grammarAccess.getNBTValueAccess().getAlternatives()); 
            // InternalMCEntity.g:94:3: ( rule__NBTValue__Alternatives )
            // InternalMCEntity.g:94:4: rule__NBTValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NBTValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNBTValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTValue"


    // $ANTLR start "entryRuleNBTCompound"
    // InternalMCEntity.g:103:1: entryRuleNBTCompound : ruleNBTCompound EOF ;
    public final void entryRuleNBTCompound() throws RecognitionException {
        try {
            // InternalMCEntity.g:104:1: ( ruleNBTCompound EOF )
            // InternalMCEntity.g:105:1: ruleNBTCompound EOF
            {
             before(grammarAccess.getNBTCompoundRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTCompound();

            state._fsp--;

             after(grammarAccess.getNBTCompoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTCompound"


    // $ANTLR start "ruleNBTCompound"
    // InternalMCEntity.g:112:1: ruleNBTCompound : ( ( rule__NBTCompound__Group__0 ) ) ;
    public final void ruleNBTCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:116:2: ( ( ( rule__NBTCompound__Group__0 ) ) )
            // InternalMCEntity.g:117:2: ( ( rule__NBTCompound__Group__0 ) )
            {
            // InternalMCEntity.g:117:2: ( ( rule__NBTCompound__Group__0 ) )
            // InternalMCEntity.g:118:3: ( rule__NBTCompound__Group__0 )
            {
             before(grammarAccess.getNBTCompoundAccess().getGroup()); 
            // InternalMCEntity.g:119:3: ( rule__NBTCompound__Group__0 )
            // InternalMCEntity.g:119:4: rule__NBTCompound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTCompoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTCompound"


    // $ANTLR start "entryRuleNBTEntry"
    // InternalMCEntity.g:128:1: entryRuleNBTEntry : ruleNBTEntry EOF ;
    public final void entryRuleNBTEntry() throws RecognitionException {
        try {
            // InternalMCEntity.g:129:1: ( ruleNBTEntry EOF )
            // InternalMCEntity.g:130:1: ruleNBTEntry EOF
            {
             before(grammarAccess.getNBTEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTEntry();

            state._fsp--;

             after(grammarAccess.getNBTEntryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTEntry"


    // $ANTLR start "ruleNBTEntry"
    // InternalMCEntity.g:137:1: ruleNBTEntry : ( ( rule__NBTEntry__Group__0 ) ) ;
    public final void ruleNBTEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:141:2: ( ( ( rule__NBTEntry__Group__0 ) ) )
            // InternalMCEntity.g:142:2: ( ( rule__NBTEntry__Group__0 ) )
            {
            // InternalMCEntity.g:142:2: ( ( rule__NBTEntry__Group__0 ) )
            // InternalMCEntity.g:143:3: ( rule__NBTEntry__Group__0 )
            {
             before(grammarAccess.getNBTEntryAccess().getGroup()); 
            // InternalMCEntity.g:144:3: ( rule__NBTEntry__Group__0 )
            // InternalMCEntity.g:144:4: rule__NBTEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTEntry"


    // $ANTLR start "entryRuleNBTByteArray"
    // InternalMCEntity.g:153:1: entryRuleNBTByteArray : ruleNBTByteArray EOF ;
    public final void entryRuleNBTByteArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:154:1: ( ruleNBTByteArray EOF )
            // InternalMCEntity.g:155:1: ruleNBTByteArray EOF
            {
             before(grammarAccess.getNBTByteArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTByteArray();

            state._fsp--;

             after(grammarAccess.getNBTByteArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTByteArray"


    // $ANTLR start "ruleNBTByteArray"
    // InternalMCEntity.g:162:1: ruleNBTByteArray : ( ( rule__NBTByteArray__Group__0 ) ) ;
    public final void ruleNBTByteArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:166:2: ( ( ( rule__NBTByteArray__Group__0 ) ) )
            // InternalMCEntity.g:167:2: ( ( rule__NBTByteArray__Group__0 ) )
            {
            // InternalMCEntity.g:167:2: ( ( rule__NBTByteArray__Group__0 ) )
            // InternalMCEntity.g:168:3: ( rule__NBTByteArray__Group__0 )
            {
             before(grammarAccess.getNBTByteArrayAccess().getGroup()); 
            // InternalMCEntity.g:169:3: ( rule__NBTByteArray__Group__0 )
            // InternalMCEntity.g:169:4: rule__NBTByteArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTByteArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTByteArray"


    // $ANTLR start "entryRuleNBTLongArray"
    // InternalMCEntity.g:178:1: entryRuleNBTLongArray : ruleNBTLongArray EOF ;
    public final void entryRuleNBTLongArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:179:1: ( ruleNBTLongArray EOF )
            // InternalMCEntity.g:180:1: ruleNBTLongArray EOF
            {
             before(grammarAccess.getNBTLongArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTLongArray();

            state._fsp--;

             after(grammarAccess.getNBTLongArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTLongArray"


    // $ANTLR start "ruleNBTLongArray"
    // InternalMCEntity.g:187:1: ruleNBTLongArray : ( ( rule__NBTLongArray__Group__0 ) ) ;
    public final void ruleNBTLongArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:191:2: ( ( ( rule__NBTLongArray__Group__0 ) ) )
            // InternalMCEntity.g:192:2: ( ( rule__NBTLongArray__Group__0 ) )
            {
            // InternalMCEntity.g:192:2: ( ( rule__NBTLongArray__Group__0 ) )
            // InternalMCEntity.g:193:3: ( rule__NBTLongArray__Group__0 )
            {
             before(grammarAccess.getNBTLongArrayAccess().getGroup()); 
            // InternalMCEntity.g:194:3: ( rule__NBTLongArray__Group__0 )
            // InternalMCEntity.g:194:4: rule__NBTLongArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTLongArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTLongArray"


    // $ANTLR start "entryRuleNBTIntArray"
    // InternalMCEntity.g:203:1: entryRuleNBTIntArray : ruleNBTIntArray EOF ;
    public final void entryRuleNBTIntArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:204:1: ( ruleNBTIntArray EOF )
            // InternalMCEntity.g:205:1: ruleNBTIntArray EOF
            {
             before(grammarAccess.getNBTIntArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTIntArray();

            state._fsp--;

             after(grammarAccess.getNBTIntArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTIntArray"


    // $ANTLR start "ruleNBTIntArray"
    // InternalMCEntity.g:212:1: ruleNBTIntArray : ( ( rule__NBTIntArray__Group__0 ) ) ;
    public final void ruleNBTIntArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:216:2: ( ( ( rule__NBTIntArray__Group__0 ) ) )
            // InternalMCEntity.g:217:2: ( ( rule__NBTIntArray__Group__0 ) )
            {
            // InternalMCEntity.g:217:2: ( ( rule__NBTIntArray__Group__0 ) )
            // InternalMCEntity.g:218:3: ( rule__NBTIntArray__Group__0 )
            {
             before(grammarAccess.getNBTIntArrayAccess().getGroup()); 
            // InternalMCEntity.g:219:3: ( rule__NBTIntArray__Group__0 )
            // InternalMCEntity.g:219:4: rule__NBTIntArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTIntArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTIntArray"


    // $ANTLR start "entryRuleNBTArray"
    // InternalMCEntity.g:228:1: entryRuleNBTArray : ruleNBTArray EOF ;
    public final void entryRuleNBTArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:229:1: ( ruleNBTArray EOF )
            // InternalMCEntity.g:230:1: ruleNBTArray EOF
            {
             before(grammarAccess.getNBTArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTArray"


    // $ANTLR start "ruleNBTArray"
    // InternalMCEntity.g:237:1: ruleNBTArray : ( ( rule__NBTArray__Group__0 ) ) ;
    public final void ruleNBTArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:241:2: ( ( ( rule__NBTArray__Group__0 ) ) )
            // InternalMCEntity.g:242:2: ( ( rule__NBTArray__Group__0 ) )
            {
            // InternalMCEntity.g:242:2: ( ( rule__NBTArray__Group__0 ) )
            // InternalMCEntity.g:243:3: ( rule__NBTArray__Group__0 )
            {
             before(grammarAccess.getNBTArrayAccess().getGroup()); 
            // InternalMCEntity.g:244:3: ( rule__NBTArray__Group__0 )
            // InternalMCEntity.g:244:4: rule__NBTArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTArray"


    // $ANTLR start "entryRuleNBTBool"
    // InternalMCEntity.g:253:1: entryRuleNBTBool : ruleNBTBool EOF ;
    public final void entryRuleNBTBool() throws RecognitionException {
        try {
            // InternalMCEntity.g:254:1: ( ruleNBTBool EOF )
            // InternalMCEntity.g:255:1: ruleNBTBool EOF
            {
             before(grammarAccess.getNBTBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTBool();

            state._fsp--;

             after(grammarAccess.getNBTBoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTBool"


    // $ANTLR start "ruleNBTBool"
    // InternalMCEntity.g:262:1: ruleNBTBool : ( ( rule__NBTBool__Alternatives ) ) ;
    public final void ruleNBTBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:266:2: ( ( ( rule__NBTBool__Alternatives ) ) )
            // InternalMCEntity.g:267:2: ( ( rule__NBTBool__Alternatives ) )
            {
            // InternalMCEntity.g:267:2: ( ( rule__NBTBool__Alternatives ) )
            // InternalMCEntity.g:268:3: ( rule__NBTBool__Alternatives )
            {
             before(grammarAccess.getNBTBoolAccess().getAlternatives()); 
            // InternalMCEntity.g:269:3: ( rule__NBTBool__Alternatives )
            // InternalMCEntity.g:269:4: rule__NBTBool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NBTBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNBTBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTBool"


    // $ANTLR start "entryRuleNBTNumber"
    // InternalMCEntity.g:278:1: entryRuleNBTNumber : ruleNBTNumber EOF ;
    public final void entryRuleNBTNumber() throws RecognitionException {
        try {
            // InternalMCEntity.g:279:1: ( ruleNBTNumber EOF )
            // InternalMCEntity.g:280:1: ruleNBTNumber EOF
            {
             before(grammarAccess.getNBTNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTNumber();

            state._fsp--;

             after(grammarAccess.getNBTNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTNumber"


    // $ANTLR start "ruleNBTNumber"
    // InternalMCEntity.g:287:1: ruleNBTNumber : ( ( rule__NBTNumber__Alternatives ) ) ;
    public final void ruleNBTNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:291:2: ( ( ( rule__NBTNumber__Alternatives ) ) )
            // InternalMCEntity.g:292:2: ( ( rule__NBTNumber__Alternatives ) )
            {
            // InternalMCEntity.g:292:2: ( ( rule__NBTNumber__Alternatives ) )
            // InternalMCEntity.g:293:3: ( rule__NBTNumber__Alternatives )
            {
             before(grammarAccess.getNBTNumberAccess().getAlternatives()); 
            // InternalMCEntity.g:294:3: ( rule__NBTNumber__Alternatives )
            // InternalMCEntity.g:294:4: rule__NBTNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NBTNumber__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNBTNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTNumber"


    // $ANTLR start "entryRuleNBTFloat"
    // InternalMCEntity.g:303:1: entryRuleNBTFloat : ruleNBTFloat EOF ;
    public final void entryRuleNBTFloat() throws RecognitionException {
        try {
            // InternalMCEntity.g:304:1: ( ruleNBTFloat EOF )
            // InternalMCEntity.g:305:1: ruleNBTFloat EOF
            {
             before(grammarAccess.getNBTFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTFloat();

            state._fsp--;

             after(grammarAccess.getNBTFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTFloat"


    // $ANTLR start "ruleNBTFloat"
    // InternalMCEntity.g:312:1: ruleNBTFloat : ( ( rule__NBTFloat__ValueAssignment ) ) ;
    public final void ruleNBTFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:316:2: ( ( ( rule__NBTFloat__ValueAssignment ) ) )
            // InternalMCEntity.g:317:2: ( ( rule__NBTFloat__ValueAssignment ) )
            {
            // InternalMCEntity.g:317:2: ( ( rule__NBTFloat__ValueAssignment ) )
            // InternalMCEntity.g:318:3: ( rule__NBTFloat__ValueAssignment )
            {
             before(grammarAccess.getNBTFloatAccess().getValueAssignment()); 
            // InternalMCEntity.g:319:3: ( rule__NBTFloat__ValueAssignment )
            // InternalMCEntity.g:319:4: rule__NBTFloat__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTFloat__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTFloatAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTFloat"


    // $ANTLR start "entryRuleNBTDouble"
    // InternalMCEntity.g:328:1: entryRuleNBTDouble : ruleNBTDouble EOF ;
    public final void entryRuleNBTDouble() throws RecognitionException {
        try {
            // InternalMCEntity.g:329:1: ( ruleNBTDouble EOF )
            // InternalMCEntity.g:330:1: ruleNBTDouble EOF
            {
             before(grammarAccess.getNBTDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTDouble();

            state._fsp--;

             after(grammarAccess.getNBTDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTDouble"


    // $ANTLR start "ruleNBTDouble"
    // InternalMCEntity.g:337:1: ruleNBTDouble : ( ( rule__NBTDouble__ValueAssignment ) ) ;
    public final void ruleNBTDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:341:2: ( ( ( rule__NBTDouble__ValueAssignment ) ) )
            // InternalMCEntity.g:342:2: ( ( rule__NBTDouble__ValueAssignment ) )
            {
            // InternalMCEntity.g:342:2: ( ( rule__NBTDouble__ValueAssignment ) )
            // InternalMCEntity.g:343:3: ( rule__NBTDouble__ValueAssignment )
            {
             before(grammarAccess.getNBTDoubleAccess().getValueAssignment()); 
            // InternalMCEntity.g:344:3: ( rule__NBTDouble__ValueAssignment )
            // InternalMCEntity.g:344:4: rule__NBTDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTDouble"


    // $ANTLR start "entryRuleNBTLong"
    // InternalMCEntity.g:353:1: entryRuleNBTLong : ruleNBTLong EOF ;
    public final void entryRuleNBTLong() throws RecognitionException {
        try {
            // InternalMCEntity.g:354:1: ( ruleNBTLong EOF )
            // InternalMCEntity.g:355:1: ruleNBTLong EOF
            {
             before(grammarAccess.getNBTLongRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTLong();

            state._fsp--;

             after(grammarAccess.getNBTLongRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTLong"


    // $ANTLR start "ruleNBTLong"
    // InternalMCEntity.g:362:1: ruleNBTLong : ( ( rule__NBTLong__ValueAssignment ) ) ;
    public final void ruleNBTLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:366:2: ( ( ( rule__NBTLong__ValueAssignment ) ) )
            // InternalMCEntity.g:367:2: ( ( rule__NBTLong__ValueAssignment ) )
            {
            // InternalMCEntity.g:367:2: ( ( rule__NBTLong__ValueAssignment ) )
            // InternalMCEntity.g:368:3: ( rule__NBTLong__ValueAssignment )
            {
             before(grammarAccess.getNBTLongAccess().getValueAssignment()); 
            // InternalMCEntity.g:369:3: ( rule__NBTLong__ValueAssignment )
            // InternalMCEntity.g:369:4: rule__NBTLong__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTLong__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTLongAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTLong"


    // $ANTLR start "entryRuleNBTShort"
    // InternalMCEntity.g:378:1: entryRuleNBTShort : ruleNBTShort EOF ;
    public final void entryRuleNBTShort() throws RecognitionException {
        try {
            // InternalMCEntity.g:379:1: ( ruleNBTShort EOF )
            // InternalMCEntity.g:380:1: ruleNBTShort EOF
            {
             before(grammarAccess.getNBTShortRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTShort();

            state._fsp--;

             after(grammarAccess.getNBTShortRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTShort"


    // $ANTLR start "ruleNBTShort"
    // InternalMCEntity.g:387:1: ruleNBTShort : ( ( rule__NBTShort__ValueAssignment ) ) ;
    public final void ruleNBTShort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:391:2: ( ( ( rule__NBTShort__ValueAssignment ) ) )
            // InternalMCEntity.g:392:2: ( ( rule__NBTShort__ValueAssignment ) )
            {
            // InternalMCEntity.g:392:2: ( ( rule__NBTShort__ValueAssignment ) )
            // InternalMCEntity.g:393:3: ( rule__NBTShort__ValueAssignment )
            {
             before(grammarAccess.getNBTShortAccess().getValueAssignment()); 
            // InternalMCEntity.g:394:3: ( rule__NBTShort__ValueAssignment )
            // InternalMCEntity.g:394:4: rule__NBTShort__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTShort__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTShortAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTShort"


    // $ANTLR start "entryRuleNBTByte"
    // InternalMCEntity.g:403:1: entryRuleNBTByte : ruleNBTByte EOF ;
    public final void entryRuleNBTByte() throws RecognitionException {
        try {
            // InternalMCEntity.g:404:1: ( ruleNBTByte EOF )
            // InternalMCEntity.g:405:1: ruleNBTByte EOF
            {
             before(grammarAccess.getNBTByteRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTByte();

            state._fsp--;

             after(grammarAccess.getNBTByteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTByte"


    // $ANTLR start "ruleNBTByte"
    // InternalMCEntity.g:412:1: ruleNBTByte : ( ( rule__NBTByte__ValueAssignment ) ) ;
    public final void ruleNBTByte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:416:2: ( ( ( rule__NBTByte__ValueAssignment ) ) )
            // InternalMCEntity.g:417:2: ( ( rule__NBTByte__ValueAssignment ) )
            {
            // InternalMCEntity.g:417:2: ( ( rule__NBTByte__ValueAssignment ) )
            // InternalMCEntity.g:418:3: ( rule__NBTByte__ValueAssignment )
            {
             before(grammarAccess.getNBTByteAccess().getValueAssignment()); 
            // InternalMCEntity.g:419:3: ( rule__NBTByte__ValueAssignment )
            // InternalMCEntity.g:419:4: rule__NBTByte__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTByte__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTByteAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTByte"


    // $ANTLR start "entryRuleNBTInt"
    // InternalMCEntity.g:428:1: entryRuleNBTInt : ruleNBTInt EOF ;
    public final void entryRuleNBTInt() throws RecognitionException {
        try {
            // InternalMCEntity.g:429:1: ( ruleNBTInt EOF )
            // InternalMCEntity.g:430:1: ruleNBTInt EOF
            {
             before(grammarAccess.getNBTIntRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTInt();

            state._fsp--;

             after(grammarAccess.getNBTIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTInt"


    // $ANTLR start "ruleNBTInt"
    // InternalMCEntity.g:437:1: ruleNBTInt : ( ( rule__NBTInt__ValueAssignment ) ) ;
    public final void ruleNBTInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:441:2: ( ( ( rule__NBTInt__ValueAssignment ) ) )
            // InternalMCEntity.g:442:2: ( ( rule__NBTInt__ValueAssignment ) )
            {
            // InternalMCEntity.g:442:2: ( ( rule__NBTInt__ValueAssignment ) )
            // InternalMCEntity.g:443:3: ( rule__NBTInt__ValueAssignment )
            {
             before(grammarAccess.getNBTIntAccess().getValueAssignment()); 
            // InternalMCEntity.g:444:3: ( rule__NBTInt__ValueAssignment )
            // InternalMCEntity.g:444:4: rule__NBTInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTIntAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTInt"


    // $ANTLR start "entryRuleNBTString"
    // InternalMCEntity.g:453:1: entryRuleNBTString : ruleNBTString EOF ;
    public final void entryRuleNBTString() throws RecognitionException {
        try {
            // InternalMCEntity.g:454:1: ( ruleNBTString EOF )
            // InternalMCEntity.g:455:1: ruleNBTString EOF
            {
             before(grammarAccess.getNBTStringRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTString();

            state._fsp--;

             after(grammarAccess.getNBTStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTString"


    // $ANTLR start "ruleNBTString"
    // InternalMCEntity.g:462:1: ruleNBTString : ( ( rule__NBTString__ValueAssignment ) ) ;
    public final void ruleNBTString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:466:2: ( ( ( rule__NBTString__ValueAssignment ) ) )
            // InternalMCEntity.g:467:2: ( ( rule__NBTString__ValueAssignment ) )
            {
            // InternalMCEntity.g:467:2: ( ( rule__NBTString__ValueAssignment ) )
            // InternalMCEntity.g:468:3: ( rule__NBTString__ValueAssignment )
            {
             before(grammarAccess.getNBTStringAccess().getValueAssignment()); 
            // InternalMCEntity.g:469:3: ( rule__NBTString__ValueAssignment )
            // InternalMCEntity.g:469:4: rule__NBTString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NBTString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNBTStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTString"


    // $ANTLR start "entryRuleNBTJSONTextComponent"
    // InternalMCEntity.g:478:1: entryRuleNBTJSONTextComponent : ruleNBTJSONTextComponent EOF ;
    public final void entryRuleNBTJSONTextComponent() throws RecognitionException {
        try {
            // InternalMCEntity.g:479:1: ( ruleNBTJSONTextComponent EOF )
            // InternalMCEntity.g:480:1: ruleNBTJSONTextComponent EOF
            {
             before(grammarAccess.getNBTJSONTextComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTJSONTextComponent();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponent"


    // $ANTLR start "ruleNBTJSONTextComponent"
    // InternalMCEntity.g:487:1: ruleNBTJSONTextComponent : ( ( rule__NBTJSONTextComponent__Alternatives ) ) ;
    public final void ruleNBTJSONTextComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:491:2: ( ( ( rule__NBTJSONTextComponent__Alternatives ) ) )
            // InternalMCEntity.g:492:2: ( ( rule__NBTJSONTextComponent__Alternatives ) )
            {
            // InternalMCEntity.g:492:2: ( ( rule__NBTJSONTextComponent__Alternatives ) )
            // InternalMCEntity.g:493:3: ( rule__NBTJSONTextComponent__Alternatives )
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getAlternatives()); 
            // InternalMCEntity.g:494:3: ( rule__NBTJSONTextComponent__Alternatives )
            // InternalMCEntity.g:494:4: rule__NBTJSONTextComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTJSONTextComponent"


    // $ANTLR start "entryRuleNBTJSONTextComponentObject"
    // InternalMCEntity.g:503:1: entryRuleNBTJSONTextComponentObject : ruleNBTJSONTextComponentObject EOF ;
    public final void entryRuleNBTJSONTextComponentObject() throws RecognitionException {
        try {
            // InternalMCEntity.g:504:1: ( ruleNBTJSONTextComponentObject EOF )
            // InternalMCEntity.g:505:1: ruleNBTJSONTextComponentObject EOF
            {
             before(grammarAccess.getNBTJSONTextComponentObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTJSONTextComponentObject();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentObject"


    // $ANTLR start "ruleNBTJSONTextComponentObject"
    // InternalMCEntity.g:512:1: ruleNBTJSONTextComponentObject : ( ( rule__NBTJSONTextComponentObject__Group__0 ) ) ;
    public final void ruleNBTJSONTextComponentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:516:2: ( ( ( rule__NBTJSONTextComponentObject__Group__0 ) ) )
            // InternalMCEntity.g:517:2: ( ( rule__NBTJSONTextComponentObject__Group__0 ) )
            {
            // InternalMCEntity.g:517:2: ( ( rule__NBTJSONTextComponentObject__Group__0 ) )
            // InternalMCEntity.g:518:3: ( rule__NBTJSONTextComponentObject__Group__0 )
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup()); 
            // InternalMCEntity.g:519:3: ( rule__NBTJSONTextComponentObject__Group__0 )
            // InternalMCEntity.g:519:4: rule__NBTJSONTextComponentObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTJSONTextComponentObject"


    // $ANTLR start "entryRuleNBTJSONTextComponentString"
    // InternalMCEntity.g:528:1: entryRuleNBTJSONTextComponentString : ruleNBTJSONTextComponentString EOF ;
    public final void entryRuleNBTJSONTextComponentString() throws RecognitionException {
        try {
            // InternalMCEntity.g:529:1: ( ruleNBTJSONTextComponentString EOF )
            // InternalMCEntity.g:530:1: ruleNBTJSONTextComponentString EOF
            {
             before(grammarAccess.getNBTJSONTextComponentStringRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTJSONTextComponentString();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentString"


    // $ANTLR start "ruleNBTJSONTextComponentString"
    // InternalMCEntity.g:537:1: ruleNBTJSONTextComponentString : ( ( rule__NBTJSONTextComponentString__Group__0 ) ) ;
    public final void ruleNBTJSONTextComponentString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:541:2: ( ( ( rule__NBTJSONTextComponentString__Group__0 ) ) )
            // InternalMCEntity.g:542:2: ( ( rule__NBTJSONTextComponentString__Group__0 ) )
            {
            // InternalMCEntity.g:542:2: ( ( rule__NBTJSONTextComponentString__Group__0 ) )
            // InternalMCEntity.g:543:3: ( rule__NBTJSONTextComponentString__Group__0 )
            {
             before(grammarAccess.getNBTJSONTextComponentStringAccess().getGroup()); 
            // InternalMCEntity.g:544:3: ( rule__NBTJSONTextComponentString__Group__0 )
            // InternalMCEntity.g:544:4: rule__NBTJSONTextComponentString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTJSONTextComponentString"


    // $ANTLR start "entryRuleNBTJSONTextComponentArray"
    // InternalMCEntity.g:553:1: entryRuleNBTJSONTextComponentArray : ruleNBTJSONTextComponentArray EOF ;
    public final void entryRuleNBTJSONTextComponentArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:554:1: ( ruleNBTJSONTextComponentArray EOF )
            // InternalMCEntity.g:555:1: ruleNBTJSONTextComponentArray EOF
            {
             before(grammarAccess.getNBTJSONTextComponentArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleNBTJSONTextComponentArray();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNBTJSONTextComponentArray"


    // $ANTLR start "ruleNBTJSONTextComponentArray"
    // InternalMCEntity.g:562:1: ruleNBTJSONTextComponentArray : ( ( rule__NBTJSONTextComponentArray__Group__0 ) ) ;
    public final void ruleNBTJSONTextComponentArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:566:2: ( ( ( rule__NBTJSONTextComponentArray__Group__0 ) ) )
            // InternalMCEntity.g:567:2: ( ( rule__NBTJSONTextComponentArray__Group__0 ) )
            {
            // InternalMCEntity.g:567:2: ( ( rule__NBTJSONTextComponentArray__Group__0 ) )
            // InternalMCEntity.g:568:3: ( rule__NBTJSONTextComponentArray__Group__0 )
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup()); 
            // InternalMCEntity.g:569:3: ( rule__NBTJSONTextComponentArray__Group__0 )
            // InternalMCEntity.g:569:4: rule__NBTJSONTextComponentArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNBTJSONTextComponentArray"


    // $ANTLR start "entryRuleJSONValue"
    // InternalMCEntity.g:578:1: entryRuleJSONValue : ruleJSONValue EOF ;
    public final void entryRuleJSONValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:579:1: ( ruleJSONValue EOF )
            // InternalMCEntity.g:580:1: ruleJSONValue EOF
            {
             before(grammarAccess.getJSONValueRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getJSONValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONValue"


    // $ANTLR start "ruleJSONValue"
    // InternalMCEntity.g:587:1: ruleJSONValue : ( ( rule__JSONValue__Alternatives ) ) ;
    public final void ruleJSONValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:591:2: ( ( ( rule__JSONValue__Alternatives ) ) )
            // InternalMCEntity.g:592:2: ( ( rule__JSONValue__Alternatives ) )
            {
            // InternalMCEntity.g:592:2: ( ( rule__JSONValue__Alternatives ) )
            // InternalMCEntity.g:593:3: ( rule__JSONValue__Alternatives )
            {
             before(grammarAccess.getJSONValueAccess().getAlternatives()); 
            // InternalMCEntity.g:594:3: ( rule__JSONValue__Alternatives )
            // InternalMCEntity.g:594:4: rule__JSONValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JSONValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJSONValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONValue"


    // $ANTLR start "entryRuleJSONBool"
    // InternalMCEntity.g:603:1: entryRuleJSONBool : ruleJSONBool EOF ;
    public final void entryRuleJSONBool() throws RecognitionException {
        try {
            // InternalMCEntity.g:604:1: ( ruleJSONBool EOF )
            // InternalMCEntity.g:605:1: ruleJSONBool EOF
            {
             before(grammarAccess.getJSONBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONBool();

            state._fsp--;

             after(grammarAccess.getJSONBoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONBool"


    // $ANTLR start "ruleJSONBool"
    // InternalMCEntity.g:612:1: ruleJSONBool : ( ( rule__JSONBool__Alternatives ) ) ;
    public final void ruleJSONBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:616:2: ( ( ( rule__JSONBool__Alternatives ) ) )
            // InternalMCEntity.g:617:2: ( ( rule__JSONBool__Alternatives ) )
            {
            // InternalMCEntity.g:617:2: ( ( rule__JSONBool__Alternatives ) )
            // InternalMCEntity.g:618:3: ( rule__JSONBool__Alternatives )
            {
             before(grammarAccess.getJSONBoolAccess().getAlternatives()); 
            // InternalMCEntity.g:619:3: ( rule__JSONBool__Alternatives )
            // InternalMCEntity.g:619:4: rule__JSONBool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JSONBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJSONBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONBool"


    // $ANTLR start "entryRuleJSONNumber"
    // InternalMCEntity.g:628:1: entryRuleJSONNumber : ruleJSONNumber EOF ;
    public final void entryRuleJSONNumber() throws RecognitionException {
        try {
            // InternalMCEntity.g:629:1: ( ruleJSONNumber EOF )
            // InternalMCEntity.g:630:1: ruleJSONNumber EOF
            {
             before(grammarAccess.getJSONNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONNumber();

            state._fsp--;

             after(grammarAccess.getJSONNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONNumber"


    // $ANTLR start "ruleJSONNumber"
    // InternalMCEntity.g:637:1: ruleJSONNumber : ( ( rule__JSONNumber__Alternatives ) ) ;
    public final void ruleJSONNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:641:2: ( ( ( rule__JSONNumber__Alternatives ) ) )
            // InternalMCEntity.g:642:2: ( ( rule__JSONNumber__Alternatives ) )
            {
            // InternalMCEntity.g:642:2: ( ( rule__JSONNumber__Alternatives ) )
            // InternalMCEntity.g:643:3: ( rule__JSONNumber__Alternatives )
            {
             before(grammarAccess.getJSONNumberAccess().getAlternatives()); 
            // InternalMCEntity.g:644:3: ( rule__JSONNumber__Alternatives )
            // InternalMCEntity.g:644:4: rule__JSONNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JSONNumber__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJSONNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONNumber"


    // $ANTLR start "entryRuleJSONDouble"
    // InternalMCEntity.g:653:1: entryRuleJSONDouble : ruleJSONDouble EOF ;
    public final void entryRuleJSONDouble() throws RecognitionException {
        try {
            // InternalMCEntity.g:654:1: ( ruleJSONDouble EOF )
            // InternalMCEntity.g:655:1: ruleJSONDouble EOF
            {
             before(grammarAccess.getJSONDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONDouble();

            state._fsp--;

             after(grammarAccess.getJSONDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONDouble"


    // $ANTLR start "ruleJSONDouble"
    // InternalMCEntity.g:662:1: ruleJSONDouble : ( ( rule__JSONDouble__ValueAssignment ) ) ;
    public final void ruleJSONDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:666:2: ( ( ( rule__JSONDouble__ValueAssignment ) ) )
            // InternalMCEntity.g:667:2: ( ( rule__JSONDouble__ValueAssignment ) )
            {
            // InternalMCEntity.g:667:2: ( ( rule__JSONDouble__ValueAssignment ) )
            // InternalMCEntity.g:668:3: ( rule__JSONDouble__ValueAssignment )
            {
             before(grammarAccess.getJSONDoubleAccess().getValueAssignment()); 
            // InternalMCEntity.g:669:3: ( rule__JSONDouble__ValueAssignment )
            // InternalMCEntity.g:669:4: rule__JSONDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSONDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSONDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONDouble"


    // $ANTLR start "entryRuleJSONLong"
    // InternalMCEntity.g:678:1: entryRuleJSONLong : ruleJSONLong EOF ;
    public final void entryRuleJSONLong() throws RecognitionException {
        try {
            // InternalMCEntity.g:679:1: ( ruleJSONLong EOF )
            // InternalMCEntity.g:680:1: ruleJSONLong EOF
            {
             before(grammarAccess.getJSONLongRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONLong();

            state._fsp--;

             after(grammarAccess.getJSONLongRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONLong"


    // $ANTLR start "ruleJSONLong"
    // InternalMCEntity.g:687:1: ruleJSONLong : ( ( rule__JSONLong__ValueAssignment ) ) ;
    public final void ruleJSONLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:691:2: ( ( ( rule__JSONLong__ValueAssignment ) ) )
            // InternalMCEntity.g:692:2: ( ( rule__JSONLong__ValueAssignment ) )
            {
            // InternalMCEntity.g:692:2: ( ( rule__JSONLong__ValueAssignment ) )
            // InternalMCEntity.g:693:3: ( rule__JSONLong__ValueAssignment )
            {
             before(grammarAccess.getJSONLongAccess().getValueAssignment()); 
            // InternalMCEntity.g:694:3: ( rule__JSONLong__ValueAssignment )
            // InternalMCEntity.g:694:4: rule__JSONLong__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSONLong__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSONLongAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONLong"


    // $ANTLR start "entryRuleINTAsLong"
    // InternalMCEntity.g:703:1: entryRuleINTAsLong : ruleINTAsLong EOF ;
    public final void entryRuleINTAsLong() throws RecognitionException {
        try {
            // InternalMCEntity.g:704:1: ( ruleINTAsLong EOF )
            // InternalMCEntity.g:705:1: ruleINTAsLong EOF
            {
             before(grammarAccess.getINTAsLongRule()); 
            pushFollow(FOLLOW_1);
            ruleINTAsLong();

            state._fsp--;

             after(grammarAccess.getINTAsLongRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINTAsLong"


    // $ANTLR start "ruleINTAsLong"
    // InternalMCEntity.g:712:1: ruleINTAsLong : ( RULE_INT ) ;
    public final void ruleINTAsLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:716:2: ( ( RULE_INT ) )
            // InternalMCEntity.g:717:2: ( RULE_INT )
            {
            // InternalMCEntity.g:717:2: ( RULE_INT )
            // InternalMCEntity.g:718:3: RULE_INT
            {
             before(grammarAccess.getINTAsLongAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTAsLongAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTAsLong"


    // $ANTLR start "entryRuleJSONObject"
    // InternalMCEntity.g:728:1: entryRuleJSONObject : ruleJSONObject EOF ;
    public final void entryRuleJSONObject() throws RecognitionException {
        try {
            // InternalMCEntity.g:729:1: ( ruleJSONObject EOF )
            // InternalMCEntity.g:730:1: ruleJSONObject EOF
            {
             before(grammarAccess.getJSONObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONObject();

            state._fsp--;

             after(grammarAccess.getJSONObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONObject"


    // $ANTLR start "ruleJSONObject"
    // InternalMCEntity.g:737:1: ruleJSONObject : ( ( rule__JSONObject__Group__0 ) ) ;
    public final void ruleJSONObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:741:2: ( ( ( rule__JSONObject__Group__0 ) ) )
            // InternalMCEntity.g:742:2: ( ( rule__JSONObject__Group__0 ) )
            {
            // InternalMCEntity.g:742:2: ( ( rule__JSONObject__Group__0 ) )
            // InternalMCEntity.g:743:3: ( rule__JSONObject__Group__0 )
            {
             before(grammarAccess.getJSONObjectAccess().getGroup()); 
            // InternalMCEntity.g:744:3: ( rule__JSONObject__Group__0 )
            // InternalMCEntity.g:744:4: rule__JSONObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONObject"


    // $ANTLR start "entryRuleJSONEntry"
    // InternalMCEntity.g:753:1: entryRuleJSONEntry : ruleJSONEntry EOF ;
    public final void entryRuleJSONEntry() throws RecognitionException {
        try {
            // InternalMCEntity.g:754:1: ( ruleJSONEntry EOF )
            // InternalMCEntity.g:755:1: ruleJSONEntry EOF
            {
             before(grammarAccess.getJSONEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONEntry();

            state._fsp--;

             after(grammarAccess.getJSONEntryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONEntry"


    // $ANTLR start "ruleJSONEntry"
    // InternalMCEntity.g:762:1: ruleJSONEntry : ( ( rule__JSONEntry__Group__0 ) ) ;
    public final void ruleJSONEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:766:2: ( ( ( rule__JSONEntry__Group__0 ) ) )
            // InternalMCEntity.g:767:2: ( ( rule__JSONEntry__Group__0 ) )
            {
            // InternalMCEntity.g:767:2: ( ( rule__JSONEntry__Group__0 ) )
            // InternalMCEntity.g:768:3: ( rule__JSONEntry__Group__0 )
            {
             before(grammarAccess.getJSONEntryAccess().getGroup()); 
            // InternalMCEntity.g:769:3: ( rule__JSONEntry__Group__0 )
            // InternalMCEntity.g:769:4: rule__JSONEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONEntry"


    // $ANTLR start "entryRuleJSONArray"
    // InternalMCEntity.g:778:1: entryRuleJSONArray : ruleJSONArray EOF ;
    public final void entryRuleJSONArray() throws RecognitionException {
        try {
            // InternalMCEntity.g:779:1: ( ruleJSONArray EOF )
            // InternalMCEntity.g:780:1: ruleJSONArray EOF
            {
             before(grammarAccess.getJSONArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONArray();

            state._fsp--;

             after(grammarAccess.getJSONArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONArray"


    // $ANTLR start "ruleJSONArray"
    // InternalMCEntity.g:787:1: ruleJSONArray : ( ( rule__JSONArray__Group__0 ) ) ;
    public final void ruleJSONArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:791:2: ( ( ( rule__JSONArray__Group__0 ) ) )
            // InternalMCEntity.g:792:2: ( ( rule__JSONArray__Group__0 ) )
            {
            // InternalMCEntity.g:792:2: ( ( rule__JSONArray__Group__0 ) )
            // InternalMCEntity.g:793:3: ( rule__JSONArray__Group__0 )
            {
             before(grammarAccess.getJSONArrayAccess().getGroup()); 
            // InternalMCEntity.g:794:3: ( rule__JSONArray__Group__0 )
            // InternalMCEntity.g:794:4: rule__JSONArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONArray"


    // $ANTLR start "entryRuleJSONString"
    // InternalMCEntity.g:803:1: entryRuleJSONString : ruleJSONString EOF ;
    public final void entryRuleJSONString() throws RecognitionException {
        try {
            // InternalMCEntity.g:804:1: ( ruleJSONString EOF )
            // InternalMCEntity.g:805:1: ruleJSONString EOF
            {
             before(grammarAccess.getJSONStringRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONString();

            state._fsp--;

             after(grammarAccess.getJSONStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJSONString"


    // $ANTLR start "ruleJSONString"
    // InternalMCEntity.g:812:1: ruleJSONString : ( ( rule__JSONString__ValueAssignment ) ) ;
    public final void ruleJSONString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:816:2: ( ( ( rule__JSONString__ValueAssignment ) ) )
            // InternalMCEntity.g:817:2: ( ( rule__JSONString__ValueAssignment ) )
            {
            // InternalMCEntity.g:817:2: ( ( rule__JSONString__ValueAssignment ) )
            // InternalMCEntity.g:818:3: ( rule__JSONString__ValueAssignment )
            {
             before(grammarAccess.getJSONStringAccess().getValueAssignment()); 
            // InternalMCEntity.g:819:3: ( rule__JSONString__ValueAssignment )
            // InternalMCEntity.g:819:4: rule__JSONString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSONString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSONStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONString"


    // $ANTLR start "entryRuleSelector"
    // InternalMCEntity.g:828:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:832:1: ( ruleSelector EOF )
            // InternalMCEntity.g:833:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMCEntity.g:843:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:848:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMCEntity.g:849:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMCEntity.g:849:2: ( ( rule__Selector__Group__0 ) )
            // InternalMCEntity.g:850:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMCEntity.g:851:3: ( rule__Selector__Group__0 )
            // InternalMCEntity.g:851:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSelectorArguments"
    // InternalMCEntity.g:861:1: entryRuleSelectorArguments : ruleSelectorArguments EOF ;
    public final void entryRuleSelectorArguments() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMCEntity.g:865:1: ( ruleSelectorArguments EOF )
            // InternalMCEntity.g:866:1: ruleSelectorArguments EOF
            {
             before(grammarAccess.getSelectorArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorArguments();

            state._fsp--;

             after(grammarAccess.getSelectorArgumentsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorArguments"


    // $ANTLR start "ruleSelectorArguments"
    // InternalMCEntity.g:876:1: ruleSelectorArguments : ( ( rule__SelectorArguments__Group__0 ) ) ;
    public final void ruleSelectorArguments() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:881:2: ( ( ( rule__SelectorArguments__Group__0 ) ) )
            // InternalMCEntity.g:882:2: ( ( rule__SelectorArguments__Group__0 ) )
            {
            // InternalMCEntity.g:882:2: ( ( rule__SelectorArguments__Group__0 ) )
            // InternalMCEntity.g:883:3: ( rule__SelectorArguments__Group__0 )
            {
             before(grammarAccess.getSelectorArgumentsAccess().getGroup()); 
            // InternalMCEntity.g:884:3: ( rule__SelectorArguments__Group__0 )
            // InternalMCEntity.g:884:4: rule__SelectorArguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorArguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorArgumentsAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectorArguments"


    // $ANTLR start "entryRuleSelectorFilter"
    // InternalMCEntity.g:894:1: entryRuleSelectorFilter : ruleSelectorFilter EOF ;
    public final void entryRuleSelectorFilter() throws RecognitionException {
        try {
            // InternalMCEntity.g:895:1: ( ruleSelectorFilter EOF )
            // InternalMCEntity.g:896:1: ruleSelectorFilter EOF
            {
             before(grammarAccess.getSelectorFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorFilter();

            state._fsp--;

             after(grammarAccess.getSelectorFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorFilter"


    // $ANTLR start "ruleSelectorFilter"
    // InternalMCEntity.g:903:1: ruleSelectorFilter : ( ( rule__SelectorFilter__Group__0 ) ) ;
    public final void ruleSelectorFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:907:2: ( ( ( rule__SelectorFilter__Group__0 ) ) )
            // InternalMCEntity.g:908:2: ( ( rule__SelectorFilter__Group__0 ) )
            {
            // InternalMCEntity.g:908:2: ( ( rule__SelectorFilter__Group__0 ) )
            // InternalMCEntity.g:909:3: ( rule__SelectorFilter__Group__0 )
            {
             before(grammarAccess.getSelectorFilterAccess().getGroup()); 
            // InternalMCEntity.g:910:3: ( rule__SelectorFilter__Group__0 )
            // InternalMCEntity.g:910:4: rule__SelectorFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorFilter"


    // $ANTLR start "entryRuleSelectorValue"
    // InternalMCEntity.g:919:1: entryRuleSelectorValue : ruleSelectorValue EOF ;
    public final void entryRuleSelectorValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:920:1: ( ruleSelectorValue EOF )
            // InternalMCEntity.g:921:1: ruleSelectorValue EOF
            {
             before(grammarAccess.getSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorValue();

            state._fsp--;

             after(grammarAccess.getSelectorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorValue"


    // $ANTLR start "ruleSelectorValue"
    // InternalMCEntity.g:928:1: ruleSelectorValue : ( ( rule__SelectorValue__Alternatives ) ) ;
    public final void ruleSelectorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:932:2: ( ( ( rule__SelectorValue__Alternatives ) ) )
            // InternalMCEntity.g:933:2: ( ( rule__SelectorValue__Alternatives ) )
            {
            // InternalMCEntity.g:933:2: ( ( rule__SelectorValue__Alternatives ) )
            // InternalMCEntity.g:934:3: ( rule__SelectorValue__Alternatives )
            {
             before(grammarAccess.getSelectorValueAccess().getAlternatives()); 
            // InternalMCEntity.g:935:3: ( rule__SelectorValue__Alternatives )
            // InternalMCEntity.g:935:4: rule__SelectorValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectorValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorValue"


    // $ANTLR start "entryRuleIntRange"
    // InternalMCEntity.g:944:1: entryRuleIntRange : ruleIntRange EOF ;
    public final void entryRuleIntRange() throws RecognitionException {
        try {
            // InternalMCEntity.g:945:1: ( ruleIntRange EOF )
            // InternalMCEntity.g:946:1: ruleIntRange EOF
            {
             before(grammarAccess.getIntRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntRange();

            state._fsp--;

             after(grammarAccess.getIntRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntRange"


    // $ANTLR start "ruleIntRange"
    // InternalMCEntity.g:953:1: ruleIntRange : ( ( rule__IntRange__Alternatives ) ) ;
    public final void ruleIntRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:957:2: ( ( ( rule__IntRange__Alternatives ) ) )
            // InternalMCEntity.g:958:2: ( ( rule__IntRange__Alternatives ) )
            {
            // InternalMCEntity.g:958:2: ( ( rule__IntRange__Alternatives ) )
            // InternalMCEntity.g:959:3: ( rule__IntRange__Alternatives )
            {
             before(grammarAccess.getIntRangeAccess().getAlternatives()); 
            // InternalMCEntity.g:960:3: ( rule__IntRange__Alternatives )
            // InternalMCEntity.g:960:4: rule__IntRange__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntRange"


    // $ANTLR start "entryRuleDoubleRange"
    // InternalMCEntity.g:969:1: entryRuleDoubleRange : ruleDoubleRange EOF ;
    public final void entryRuleDoubleRange() throws RecognitionException {
        try {
            // InternalMCEntity.g:970:1: ( ruleDoubleRange EOF )
            // InternalMCEntity.g:971:1: ruleDoubleRange EOF
            {
             before(grammarAccess.getDoubleRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleRange();

            state._fsp--;

             after(grammarAccess.getDoubleRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleRange"


    // $ANTLR start "ruleDoubleRange"
    // InternalMCEntity.g:978:1: ruleDoubleRange : ( ( rule__DoubleRange__Alternatives ) ) ;
    public final void ruleDoubleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:982:2: ( ( ( rule__DoubleRange__Alternatives ) ) )
            // InternalMCEntity.g:983:2: ( ( rule__DoubleRange__Alternatives ) )
            {
            // InternalMCEntity.g:983:2: ( ( rule__DoubleRange__Alternatives ) )
            // InternalMCEntity.g:984:3: ( rule__DoubleRange__Alternatives )
            {
             before(grammarAccess.getDoubleRangeAccess().getAlternatives()); 
            // InternalMCEntity.g:985:3: ( rule__DoubleRange__Alternatives )
            // InternalMCEntity.g:985:4: rule__DoubleRange__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleRange"


    // $ANTLR start "entryRuleIntSelectorValue"
    // InternalMCEntity.g:994:1: entryRuleIntSelectorValue : ruleIntSelectorValue EOF ;
    public final void entryRuleIntSelectorValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:995:1: ( ruleIntSelectorValue EOF )
            // InternalMCEntity.g:996:1: ruleIntSelectorValue EOF
            {
             before(grammarAccess.getIntSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntSelectorValue();

            state._fsp--;

             after(grammarAccess.getIntSelectorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntSelectorValue"


    // $ANTLR start "ruleIntSelectorValue"
    // InternalMCEntity.g:1003:1: ruleIntSelectorValue : ( ( rule__IntSelectorValue__ValueAssignment ) ) ;
    public final void ruleIntSelectorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1007:2: ( ( ( rule__IntSelectorValue__ValueAssignment ) ) )
            // InternalMCEntity.g:1008:2: ( ( rule__IntSelectorValue__ValueAssignment ) )
            {
            // InternalMCEntity.g:1008:2: ( ( rule__IntSelectorValue__ValueAssignment ) )
            // InternalMCEntity.g:1009:3: ( rule__IntSelectorValue__ValueAssignment )
            {
             before(grammarAccess.getIntSelectorValueAccess().getValueAssignment()); 
            // InternalMCEntity.g:1010:3: ( rule__IntSelectorValue__ValueAssignment )
            // InternalMCEntity.g:1010:4: rule__IntSelectorValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntSelectorValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntSelectorValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntSelectorValue"


    // $ANTLR start "entryRuleDoubleSelectorValue"
    // InternalMCEntity.g:1019:1: entryRuleDoubleSelectorValue : ruleDoubleSelectorValue EOF ;
    public final void entryRuleDoubleSelectorValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:1020:1: ( ruleDoubleSelectorValue EOF )
            // InternalMCEntity.g:1021:1: ruleDoubleSelectorValue EOF
            {
             before(grammarAccess.getDoubleSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleSelectorValue();

            state._fsp--;

             after(grammarAccess.getDoubleSelectorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleSelectorValue"


    // $ANTLR start "ruleDoubleSelectorValue"
    // InternalMCEntity.g:1028:1: ruleDoubleSelectorValue : ( ( rule__DoubleSelectorValue__ValueAssignment ) ) ;
    public final void ruleDoubleSelectorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1032:2: ( ( ( rule__DoubleSelectorValue__ValueAssignment ) ) )
            // InternalMCEntity.g:1033:2: ( ( rule__DoubleSelectorValue__ValueAssignment ) )
            {
            // InternalMCEntity.g:1033:2: ( ( rule__DoubleSelectorValue__ValueAssignment ) )
            // InternalMCEntity.g:1034:3: ( rule__DoubleSelectorValue__ValueAssignment )
            {
             before(grammarAccess.getDoubleSelectorValueAccess().getValueAssignment()); 
            // InternalMCEntity.g:1035:3: ( rule__DoubleSelectorValue__ValueAssignment )
            // InternalMCEntity.g:1035:4: rule__DoubleSelectorValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DoubleSelectorValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleSelectorValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleSelectorValue"


    // $ANTLR start "entryRuleDOUBLEorINT"
    // InternalMCEntity.g:1044:1: entryRuleDOUBLEorINT : ruleDOUBLEorINT EOF ;
    public final void entryRuleDOUBLEorINT() throws RecognitionException {
        try {
            // InternalMCEntity.g:1045:1: ( ruleDOUBLEorINT EOF )
            // InternalMCEntity.g:1046:1: ruleDOUBLEorINT EOF
            {
             before(grammarAccess.getDOUBLEorINTRule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLEorINT();

            state._fsp--;

             after(grammarAccess.getDOUBLEorINTRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLEorINT"


    // $ANTLR start "ruleDOUBLEorINT"
    // InternalMCEntity.g:1053:1: ruleDOUBLEorINT : ( ( rule__DOUBLEorINT__Alternatives ) ) ;
    public final void ruleDOUBLEorINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1057:2: ( ( ( rule__DOUBLEorINT__Alternatives ) ) )
            // InternalMCEntity.g:1058:2: ( ( rule__DOUBLEorINT__Alternatives ) )
            {
            // InternalMCEntity.g:1058:2: ( ( rule__DOUBLEorINT__Alternatives ) )
            // InternalMCEntity.g:1059:3: ( rule__DOUBLEorINT__Alternatives )
            {
             before(grammarAccess.getDOUBLEorINTAccess().getAlternatives()); 
            // InternalMCEntity.g:1060:3: ( rule__DOUBLEorINT__Alternatives )
            // InternalMCEntity.g:1060:4: rule__DOUBLEorINT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLEorINT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEorINTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLEorINT"


    // $ANTLR start "entryRuleINTasDouble"
    // InternalMCEntity.g:1069:1: entryRuleINTasDouble : ruleINTasDouble EOF ;
    public final void entryRuleINTasDouble() throws RecognitionException {
        try {
            // InternalMCEntity.g:1070:1: ( ruleINTasDouble EOF )
            // InternalMCEntity.g:1071:1: ruleINTasDouble EOF
            {
             before(grammarAccess.getINTasDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleINTasDouble();

            state._fsp--;

             after(grammarAccess.getINTasDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINTasDouble"


    // $ANTLR start "ruleINTasDouble"
    // InternalMCEntity.g:1078:1: ruleINTasDouble : ( RULE_INT ) ;
    public final void ruleINTasDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1082:2: ( ( RULE_INT ) )
            // InternalMCEntity.g:1083:2: ( RULE_INT )
            {
            // InternalMCEntity.g:1083:2: ( RULE_INT )
            // InternalMCEntity.g:1084:3: RULE_INT
            {
             before(grammarAccess.getINTasDoubleAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTasDoubleAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTasDouble"


    // $ANTLR start "entryRuleBoolSelectorValue"
    // InternalMCEntity.g:1094:1: entryRuleBoolSelectorValue : ruleBoolSelectorValue EOF ;
    public final void entryRuleBoolSelectorValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:1095:1: ( ruleBoolSelectorValue EOF )
            // InternalMCEntity.g:1096:1: ruleBoolSelectorValue EOF
            {
             before(grammarAccess.getBoolSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolSelectorValue();

            state._fsp--;

             after(grammarAccess.getBoolSelectorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolSelectorValue"


    // $ANTLR start "ruleBoolSelectorValue"
    // InternalMCEntity.g:1103:1: ruleBoolSelectorValue : ( ( rule__BoolSelectorValue__Alternatives ) ) ;
    public final void ruleBoolSelectorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1107:2: ( ( ( rule__BoolSelectorValue__Alternatives ) ) )
            // InternalMCEntity.g:1108:2: ( ( rule__BoolSelectorValue__Alternatives ) )
            {
            // InternalMCEntity.g:1108:2: ( ( rule__BoolSelectorValue__Alternatives ) )
            // InternalMCEntity.g:1109:3: ( rule__BoolSelectorValue__Alternatives )
            {
             before(grammarAccess.getBoolSelectorValueAccess().getAlternatives()); 
            // InternalMCEntity.g:1110:3: ( rule__BoolSelectorValue__Alternatives )
            // InternalMCEntity.g:1110:4: rule__BoolSelectorValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolSelectorValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolSelectorValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolSelectorValue"


    // $ANTLR start "entryRuleStringSelectorValue"
    // InternalMCEntity.g:1119:1: entryRuleStringSelectorValue : ruleStringSelectorValue EOF ;
    public final void entryRuleStringSelectorValue() throws RecognitionException {
        try {
            // InternalMCEntity.g:1120:1: ( ruleStringSelectorValue EOF )
            // InternalMCEntity.g:1121:1: ruleStringSelectorValue EOF
            {
             before(grammarAccess.getStringSelectorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringSelectorValue();

            state._fsp--;

             after(grammarAccess.getStringSelectorValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringSelectorValue"


    // $ANTLR start "ruleStringSelectorValue"
    // InternalMCEntity.g:1128:1: ruleStringSelectorValue : ( ( rule__StringSelectorValue__ValueAssignment ) ) ;
    public final void ruleStringSelectorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1132:2: ( ( ( rule__StringSelectorValue__ValueAssignment ) ) )
            // InternalMCEntity.g:1133:2: ( ( rule__StringSelectorValue__ValueAssignment ) )
            {
            // InternalMCEntity.g:1133:2: ( ( rule__StringSelectorValue__ValueAssignment ) )
            // InternalMCEntity.g:1134:3: ( rule__StringSelectorValue__ValueAssignment )
            {
             before(grammarAccess.getStringSelectorValueAccess().getValueAssignment()); 
            // InternalMCEntity.g:1135:3: ( rule__StringSelectorValue__ValueAssignment )
            // InternalMCEntity.g:1135:4: rule__StringSelectorValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringSelectorValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringSelectorValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringSelectorValue"


    // $ANTLR start "entryRuleNamespacedKey"
    // InternalMCEntity.g:1144:1: entryRuleNamespacedKey : ruleNamespacedKey EOF ;
    public final void entryRuleNamespacedKey() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:1148:1: ( ruleNamespacedKey EOF )
            // InternalMCEntity.g:1149:1: ruleNamespacedKey EOF
            {
             before(grammarAccess.getNamespacedKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespacedKey();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespacedKey"


    // $ANTLR start "ruleNamespacedKey"
    // InternalMCEntity.g:1159:1: ruleNamespacedKey : ( ( rule__NamespacedKey__Group__0 ) ) ;
    public final void ruleNamespacedKey() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1164:2: ( ( ( rule__NamespacedKey__Group__0 ) ) )
            // InternalMCEntity.g:1165:2: ( ( rule__NamespacedKey__Group__0 ) )
            {
            // InternalMCEntity.g:1165:2: ( ( rule__NamespacedKey__Group__0 ) )
            // InternalMCEntity.g:1166:3: ( rule__NamespacedKey__Group__0 )
            {
             before(grammarAccess.getNamespacedKeyAccess().getGroup()); 
            // InternalMCEntity.g:1167:3: ( rule__NamespacedKey__Group__0 )
            // InternalMCEntity.g:1167:4: rule__NamespacedKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespacedKeyAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespacedKey"


    // $ANTLR start "entryRuleNamespacedKeyKey"
    // InternalMCEntity.g:1177:1: entryRuleNamespacedKeyKey : ruleNamespacedKeyKey EOF ;
    public final void entryRuleNamespacedKeyKey() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:1181:1: ( ruleNamespacedKeyKey EOF )
            // InternalMCEntity.g:1182:1: ruleNamespacedKeyKey EOF
            {
             before(grammarAccess.getNamespacedKeyKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespacedKeyKey();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyKeyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespacedKeyKey"


    // $ANTLR start "ruleNamespacedKeyKey"
    // InternalMCEntity.g:1192:1: ruleNamespacedKeyKey : ( ( rule__NamespacedKeyKey__Group__0 ) ) ;
    public final void ruleNamespacedKeyKey() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1197:2: ( ( ( rule__NamespacedKeyKey__Group__0 ) ) )
            // InternalMCEntity.g:1198:2: ( ( rule__NamespacedKeyKey__Group__0 ) )
            {
            // InternalMCEntity.g:1198:2: ( ( rule__NamespacedKeyKey__Group__0 ) )
            // InternalMCEntity.g:1199:3: ( rule__NamespacedKeyKey__Group__0 )
            {
             before(grammarAccess.getNamespacedKeyKeyAccess().getGroup()); 
            // InternalMCEntity.g:1200:3: ( rule__NamespacedKeyKey__Group__0 )
            // InternalMCEntity.g:1200:4: rule__NamespacedKeyKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKeyKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespacedKeyKeyAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespacedKeyKey"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalMCEntity.g:1210:1: entryRuleUnquotedString : ruleUnquotedString EOF ;
    public final void entryRuleUnquotedString() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMCEntity.g:1214:1: ( ruleUnquotedString EOF )
            // InternalMCEntity.g:1215:1: ruleUnquotedString EOF
            {
             before(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_1);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getUnquotedStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalMCEntity.g:1225:1: ruleUnquotedString : ( ( rule__UnquotedString__Group__0 ) ) ;
    public final void ruleUnquotedString() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1230:2: ( ( ( rule__UnquotedString__Group__0 ) ) )
            // InternalMCEntity.g:1231:2: ( ( rule__UnquotedString__Group__0 ) )
            {
            // InternalMCEntity.g:1231:2: ( ( rule__UnquotedString__Group__0 ) )
            // InternalMCEntity.g:1232:3: ( rule__UnquotedString__Group__0 )
            {
             before(grammarAccess.getUnquotedStringAccess().getGroup()); 
            // InternalMCEntity.g:1233:3: ( rule__UnquotedString__Group__0 )
            // InternalMCEntity.g:1233:4: rule__UnquotedString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnquotedStringAccess().getGroup()); 

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
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "ruleSelectorType"
    // InternalMCEntity.g:1243:1: ruleSelectorType : ( ( rule__SelectorType__Alternatives ) ) ;
    public final void ruleSelectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1247:1: ( ( ( rule__SelectorType__Alternatives ) ) )
            // InternalMCEntity.g:1248:2: ( ( rule__SelectorType__Alternatives ) )
            {
            // InternalMCEntity.g:1248:2: ( ( rule__SelectorType__Alternatives ) )
            // InternalMCEntity.g:1249:3: ( rule__SelectorType__Alternatives )
            {
             before(grammarAccess.getSelectorTypeAccess().getAlternatives()); 
            // InternalMCEntity.g:1250:3: ( rule__SelectorType__Alternatives )
            // InternalMCEntity.g:1250:4: rule__SelectorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorType"


    // $ANTLR start "rule__NBTValue__Alternatives"
    // InternalMCEntity.g:1258:1: rule__NBTValue__Alternatives : ( ( ruleNBTJSONTextComponent ) | ( ruleNBTCompound ) | ( ruleNBTByteArray ) | ( ruleNBTLongArray ) | ( ruleNBTIntArray ) | ( ruleNBTArray ) | ( ruleNBTBool ) | ( ruleNBTNumber ) | ( ruleNamespacedKey ) | ( ruleNBTString ) );
    public final void rule__NBTValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1262:1: ( ( ruleNBTJSONTextComponent ) | ( ruleNBTCompound ) | ( ruleNBTByteArray ) | ( ruleNBTLongArray ) | ( ruleNBTIntArray ) | ( ruleNBTArray ) | ( ruleNBTBool ) | ( ruleNBTNumber ) | ( ruleNamespacedKey ) | ( ruleNBTString ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMCEntity.g:1263:2: ( ruleNBTJSONTextComponent )
                    {
                    // InternalMCEntity.g:1263:2: ( ruleNBTJSONTextComponent )
                    // InternalMCEntity.g:1264:3: ruleNBTJSONTextComponent
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTJSONTextComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTJSONTextComponent();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTJSONTextComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1269:2: ( ruleNBTCompound )
                    {
                    // InternalMCEntity.g:1269:2: ( ruleNBTCompound )
                    // InternalMCEntity.g:1270:3: ruleNBTCompound
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTCompoundParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTCompound();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTCompoundParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1275:2: ( ruleNBTByteArray )
                    {
                    // InternalMCEntity.g:1275:2: ( ruleNBTByteArray )
                    // InternalMCEntity.g:1276:3: ruleNBTByteArray
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTByteArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTByteArray();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTByteArrayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1281:2: ( ruleNBTLongArray )
                    {
                    // InternalMCEntity.g:1281:2: ( ruleNBTLongArray )
                    // InternalMCEntity.g:1282:3: ruleNBTLongArray
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTLongArrayParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTLongArray();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTLongArrayParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1287:2: ( ruleNBTIntArray )
                    {
                    // InternalMCEntity.g:1287:2: ( ruleNBTIntArray )
                    // InternalMCEntity.g:1288:3: ruleNBTIntArray
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTIntArrayParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTIntArray();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTIntArrayParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1293:2: ( ruleNBTArray )
                    {
                    // InternalMCEntity.g:1293:2: ( ruleNBTArray )
                    // InternalMCEntity.g:1294:3: ruleNBTArray
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTArrayParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTArray();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTArrayParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:1299:2: ( ruleNBTBool )
                    {
                    // InternalMCEntity.g:1299:2: ( ruleNBTBool )
                    // InternalMCEntity.g:1300:3: ruleNBTBool
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTBoolParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTBool();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTBoolParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:1305:2: ( ruleNBTNumber )
                    {
                    // InternalMCEntity.g:1305:2: ( ruleNBTNumber )
                    // InternalMCEntity.g:1306:3: ruleNBTNumber
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTNumberParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTNumber();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTNumberParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMCEntity.g:1311:2: ( ruleNamespacedKey )
                    {
                    // InternalMCEntity.g:1311:2: ( ruleNamespacedKey )
                    // InternalMCEntity.g:1312:3: ruleNamespacedKey
                    {
                     before(grammarAccess.getNBTValueAccess().getNamespacedKeyParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleNamespacedKey();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNamespacedKeyParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMCEntity.g:1317:2: ( ruleNBTString )
                    {
                    // InternalMCEntity.g:1317:2: ( ruleNBTString )
                    // InternalMCEntity.g:1318:3: ruleNBTString
                    {
                     before(grammarAccess.getNBTValueAccess().getNBTStringParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTString();

                    state._fsp--;

                     after(grammarAccess.getNBTValueAccess().getNBTStringParserRuleCall_9()); 

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
    // $ANTLR end "rule__NBTValue__Alternatives"


    // $ANTLR start "rule__NBTEntry__KeyAlternatives_0_0"
    // InternalMCEntity.g:1327:1: rule__NBTEntry__KeyAlternatives_0_0 : ( ( RULE_STRING ) | ( ruleUnquotedString ) );
    public final void rule__NBTEntry__KeyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1331:1: ( ( RULE_STRING ) | ( ruleUnquotedString ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=31 && LA2_0<=33)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMCEntity.g:1332:2: ( RULE_STRING )
                    {
                    // InternalMCEntity.g:1332:2: ( RULE_STRING )
                    // InternalMCEntity.g:1333:3: RULE_STRING
                    {
                     before(grammarAccess.getNBTEntryAccess().getKeySTRINGTerminalRuleCall_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNBTEntryAccess().getKeySTRINGTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1338:2: ( ruleUnquotedString )
                    {
                    // InternalMCEntity.g:1338:2: ( ruleUnquotedString )
                    // InternalMCEntity.g:1339:3: ruleUnquotedString
                    {
                     before(grammarAccess.getNBTEntryAccess().getKeyUnquotedStringParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnquotedString();

                    state._fsp--;

                     after(grammarAccess.getNBTEntryAccess().getKeyUnquotedStringParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__NBTEntry__KeyAlternatives_0_0"


    // $ANTLR start "rule__NBTArray__Alternatives_2_0"
    // InternalMCEntity.g:1348:1: rule__NBTArray__Alternatives_2_0 : ( ( ( rule__NBTArray__Group_2_0_0__0 ) ) | ( ( rule__NBTArray__Group_2_0_1__0 ) ) | ( ( rule__NBTArray__Group_2_0_2__0 ) ) | ( ( rule__NBTArray__Group_2_0_3__0 ) ) | ( ( rule__NBTArray__Group_2_0_4__0 ) ) | ( ( rule__NBTArray__Group_2_0_5__0 ) ) | ( ( rule__NBTArray__Group_2_0_6__0 ) ) | ( ( rule__NBTArray__Group_2_0_7__0 ) ) );
    public final void rule__NBTArray__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1352:1: ( ( ( rule__NBTArray__Group_2_0_0__0 ) ) | ( ( rule__NBTArray__Group_2_0_1__0 ) ) | ( ( rule__NBTArray__Group_2_0_2__0 ) ) | ( ( rule__NBTArray__Group_2_0_3__0 ) ) | ( ( rule__NBTArray__Group_2_0_4__0 ) ) | ( ( rule__NBTArray__Group_2_0_5__0 ) ) | ( ( rule__NBTArray__Group_2_0_6__0 ) ) | ( ( rule__NBTArray__Group_2_0_7__0 ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case RULE_NBT_BYTE_ARRAY_START:
                {
                alt3=2;
                }
                break;
            case RULE_NBT_LONG_ARRAY_START:
                {
                alt3=3;
                }
                break;
            case RULE_NBT_INT_ARRAY_START:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_FLOAT:
            case RULE_LONG:
            case RULE_SHORT:
            case RULE_BYTE:
            case 45:
            case 49:
                {
                alt3=6;
                }
                break;
            case RULE_STRING:
            case RULE_SINGLE_STRING:
            case RULE_ID:
            case 31:
            case 32:
            case 33:
                {
                alt3=7;
                }
                break;
            case RULE_JSON_TEXT_BEGIN_OBJ:
            case RULE_JSON_TEXT_BEGIN_ARRAY:
            case RULE_JSON_TEXT_BEGIN_STR:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMCEntity.g:1353:2: ( ( rule__NBTArray__Group_2_0_0__0 ) )
                    {
                    // InternalMCEntity.g:1353:2: ( ( rule__NBTArray__Group_2_0_0__0 ) )
                    // InternalMCEntity.g:1354:3: ( rule__NBTArray__Group_2_0_0__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_0()); 
                    // InternalMCEntity.g:1355:3: ( rule__NBTArray__Group_2_0_0__0 )
                    // InternalMCEntity.g:1355:4: rule__NBTArray__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1359:2: ( ( rule__NBTArray__Group_2_0_1__0 ) )
                    {
                    // InternalMCEntity.g:1359:2: ( ( rule__NBTArray__Group_2_0_1__0 ) )
                    // InternalMCEntity.g:1360:3: ( rule__NBTArray__Group_2_0_1__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_1()); 
                    // InternalMCEntity.g:1361:3: ( rule__NBTArray__Group_2_0_1__0 )
                    // InternalMCEntity.g:1361:4: rule__NBTArray__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1365:2: ( ( rule__NBTArray__Group_2_0_2__0 ) )
                    {
                    // InternalMCEntity.g:1365:2: ( ( rule__NBTArray__Group_2_0_2__0 ) )
                    // InternalMCEntity.g:1366:3: ( rule__NBTArray__Group_2_0_2__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_2()); 
                    // InternalMCEntity.g:1367:3: ( rule__NBTArray__Group_2_0_2__0 )
                    // InternalMCEntity.g:1367:4: rule__NBTArray__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1371:2: ( ( rule__NBTArray__Group_2_0_3__0 ) )
                    {
                    // InternalMCEntity.g:1371:2: ( ( rule__NBTArray__Group_2_0_3__0 ) )
                    // InternalMCEntity.g:1372:3: ( rule__NBTArray__Group_2_0_3__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_3()); 
                    // InternalMCEntity.g:1373:3: ( rule__NBTArray__Group_2_0_3__0 )
                    // InternalMCEntity.g:1373:4: rule__NBTArray__Group_2_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1377:2: ( ( rule__NBTArray__Group_2_0_4__0 ) )
                    {
                    // InternalMCEntity.g:1377:2: ( ( rule__NBTArray__Group_2_0_4__0 ) )
                    // InternalMCEntity.g:1378:3: ( rule__NBTArray__Group_2_0_4__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_4()); 
                    // InternalMCEntity.g:1379:3: ( rule__NBTArray__Group_2_0_4__0 )
                    // InternalMCEntity.g:1379:4: rule__NBTArray__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1383:2: ( ( rule__NBTArray__Group_2_0_5__0 ) )
                    {
                    // InternalMCEntity.g:1383:2: ( ( rule__NBTArray__Group_2_0_5__0 ) )
                    // InternalMCEntity.g:1384:3: ( rule__NBTArray__Group_2_0_5__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_5()); 
                    // InternalMCEntity.g:1385:3: ( rule__NBTArray__Group_2_0_5__0 )
                    // InternalMCEntity.g:1385:4: rule__NBTArray__Group_2_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:1389:2: ( ( rule__NBTArray__Group_2_0_6__0 ) )
                    {
                    // InternalMCEntity.g:1389:2: ( ( rule__NBTArray__Group_2_0_6__0 ) )
                    // InternalMCEntity.g:1390:3: ( rule__NBTArray__Group_2_0_6__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_6()); 
                    // InternalMCEntity.g:1391:3: ( rule__NBTArray__Group_2_0_6__0 )
                    // InternalMCEntity.g:1391:4: rule__NBTArray__Group_2_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:1395:2: ( ( rule__NBTArray__Group_2_0_7__0 ) )
                    {
                    // InternalMCEntity.g:1395:2: ( ( rule__NBTArray__Group_2_0_7__0 ) )
                    // InternalMCEntity.g:1396:3: ( rule__NBTArray__Group_2_0_7__0 )
                    {
                     before(grammarAccess.getNBTArrayAccess().getGroup_2_0_7()); 
                    // InternalMCEntity.g:1397:3: ( rule__NBTArray__Group_2_0_7__0 )
                    // InternalMCEntity.g:1397:4: rule__NBTArray__Group_2_0_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2_0_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTArrayAccess().getGroup_2_0_7()); 

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
    // $ANTLR end "rule__NBTArray__Alternatives_2_0"


    // $ANTLR start "rule__NBTArray__ElementsAlternatives_2_0_5_0_0"
    // InternalMCEntity.g:1405:1: rule__NBTArray__ElementsAlternatives_2_0_5_0_0 : ( ( ruleNBTBool ) | ( ruleNBTNumber ) );
    public final void rule__NBTArray__ElementsAlternatives_2_0_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1409:1: ( ( ruleNBTBool ) | ( ruleNBTNumber ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45||LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==RULE_DOUBLE||(LA4_0>=RULE_FLOAT && LA4_0<=RULE_BYTE)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMCEntity.g:1410:2: ( ruleNBTBool )
                    {
                    // InternalMCEntity.g:1410:2: ( ruleNBTBool )
                    // InternalMCEntity.g:1411:3: ruleNBTBool
                    {
                     before(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTBool();

                    state._fsp--;

                     after(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1416:2: ( ruleNBTNumber )
                    {
                    // InternalMCEntity.g:1416:2: ( ruleNBTNumber )
                    // InternalMCEntity.g:1417:3: ruleNBTNumber
                    {
                     before(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTNumber();

                    state._fsp--;

                     after(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_0_0_1()); 

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
    // $ANTLR end "rule__NBTArray__ElementsAlternatives_2_0_5_0_0"


    // $ANTLR start "rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0"
    // InternalMCEntity.g:1426:1: rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 : ( ( ruleNBTBool ) | ( ruleNBTNumber ) );
    public final void rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1430:1: ( ( ruleNBTBool ) | ( ruleNBTNumber ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45||LA5_0==49) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==RULE_DOUBLE||(LA5_0>=RULE_FLOAT && LA5_0<=RULE_BYTE)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMCEntity.g:1431:2: ( ruleNBTBool )
                    {
                    // InternalMCEntity.g:1431:2: ( ruleNBTBool )
                    // InternalMCEntity.g:1432:3: ruleNBTBool
                    {
                     before(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTBool();

                    state._fsp--;

                     after(grammarAccess.getNBTArrayAccess().getElementsNBTBoolParserRuleCall_2_0_5_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1437:2: ( ruleNBTNumber )
                    {
                    // InternalMCEntity.g:1437:2: ( ruleNBTNumber )
                    // InternalMCEntity.g:1438:3: ruleNBTNumber
                    {
                     before(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTNumber();

                    state._fsp--;

                     after(grammarAccess.getNBTArrayAccess().getElementsNBTNumberParserRuleCall_2_0_5_1_1_0_1()); 

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
    // $ANTLR end "rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0"


    // $ANTLR start "rule__NBTBool__Alternatives"
    // InternalMCEntity.g:1447:1: rule__NBTBool__Alternatives : ( ( ( rule__NBTBool__ValueAssignment_0 ) ) | ( ( rule__NBTBool__Group_1__0 ) ) );
    public final void rule__NBTBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1451:1: ( ( ( rule__NBTBool__ValueAssignment_0 ) ) | ( ( rule__NBTBool__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMCEntity.g:1452:2: ( ( rule__NBTBool__ValueAssignment_0 ) )
                    {
                    // InternalMCEntity.g:1452:2: ( ( rule__NBTBool__ValueAssignment_0 ) )
                    // InternalMCEntity.g:1453:3: ( rule__NBTBool__ValueAssignment_0 )
                    {
                     before(grammarAccess.getNBTBoolAccess().getValueAssignment_0()); 
                    // InternalMCEntity.g:1454:3: ( rule__NBTBool__ValueAssignment_0 )
                    // InternalMCEntity.g:1454:4: rule__NBTBool__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTBool__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTBoolAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1458:2: ( ( rule__NBTBool__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1458:2: ( ( rule__NBTBool__Group_1__0 ) )
                    // InternalMCEntity.g:1459:3: ( rule__NBTBool__Group_1__0 )
                    {
                     before(grammarAccess.getNBTBoolAccess().getGroup_1()); 
                    // InternalMCEntity.g:1460:3: ( rule__NBTBool__Group_1__0 )
                    // InternalMCEntity.g:1460:4: rule__NBTBool__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTBool__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTBoolAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NBTBool__Alternatives"


    // $ANTLR start "rule__NBTNumber__Alternatives"
    // InternalMCEntity.g:1468:1: rule__NBTNumber__Alternatives : ( ( ruleNBTFloat ) | ( ruleNBTDouble ) | ( ruleNBTLong ) | ( ruleNBTShort ) | ( ruleNBTByte ) | ( ruleNBTInt ) );
    public final void rule__NBTNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1472:1: ( ( ruleNBTFloat ) | ( ruleNBTDouble ) | ( ruleNBTLong ) | ( ruleNBTShort ) | ( ruleNBTByte ) | ( ruleNBTInt ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt7=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=2;
                }
                break;
            case RULE_LONG:
                {
                alt7=3;
                }
                break;
            case RULE_SHORT:
                {
                alt7=4;
                }
                break;
            case RULE_BYTE:
                {
                alt7=5;
                }
                break;
            case RULE_INT:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMCEntity.g:1473:2: ( ruleNBTFloat )
                    {
                    // InternalMCEntity.g:1473:2: ( ruleNBTFloat )
                    // InternalMCEntity.g:1474:3: ruleNBTFloat
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTFloatParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTFloat();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTFloatParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1479:2: ( ruleNBTDouble )
                    {
                    // InternalMCEntity.g:1479:2: ( ruleNBTDouble )
                    // InternalMCEntity.g:1480:3: ruleNBTDouble
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTDoubleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTDouble();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTDoubleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1485:2: ( ruleNBTLong )
                    {
                    // InternalMCEntity.g:1485:2: ( ruleNBTLong )
                    // InternalMCEntity.g:1486:3: ruleNBTLong
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTLongParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTLong();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTLongParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1491:2: ( ruleNBTShort )
                    {
                    // InternalMCEntity.g:1491:2: ( ruleNBTShort )
                    // InternalMCEntity.g:1492:3: ruleNBTShort
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTShortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTShort();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTShortParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1497:2: ( ruleNBTByte )
                    {
                    // InternalMCEntity.g:1497:2: ( ruleNBTByte )
                    // InternalMCEntity.g:1498:3: ruleNBTByte
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTByteParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTByte();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTByteParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1503:2: ( ruleNBTInt )
                    {
                    // InternalMCEntity.g:1503:2: ( ruleNBTInt )
                    // InternalMCEntity.g:1504:3: ruleNBTInt
                    {
                     before(grammarAccess.getNBTNumberAccess().getNBTIntParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTInt();

                    state._fsp--;

                     after(grammarAccess.getNBTNumberAccess().getNBTIntParserRuleCall_5()); 

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
    // $ANTLR end "rule__NBTNumber__Alternatives"


    // $ANTLR start "rule__NBTString__ValueAlternatives_0"
    // InternalMCEntity.g:1513:1: rule__NBTString__ValueAlternatives_0 : ( ( RULE_STRING ) | ( RULE_SINGLE_STRING ) | ( ruleUnquotedString ) );
    public final void rule__NBTString__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1517:1: ( ( RULE_STRING ) | ( RULE_SINGLE_STRING ) | ( ruleUnquotedString ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_SINGLE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case 31:
            case 32:
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMCEntity.g:1518:2: ( RULE_STRING )
                    {
                    // InternalMCEntity.g:1518:2: ( RULE_STRING )
                    // InternalMCEntity.g:1519:3: RULE_STRING
                    {
                     before(grammarAccess.getNBTStringAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNBTStringAccess().getValueSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1524:2: ( RULE_SINGLE_STRING )
                    {
                    // InternalMCEntity.g:1524:2: ( RULE_SINGLE_STRING )
                    // InternalMCEntity.g:1525:3: RULE_SINGLE_STRING
                    {
                     before(grammarAccess.getNBTStringAccess().getValueSINGLE_STRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_SINGLE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNBTStringAccess().getValueSINGLE_STRINGTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1530:2: ( ruleUnquotedString )
                    {
                    // InternalMCEntity.g:1530:2: ( ruleUnquotedString )
                    // InternalMCEntity.g:1531:3: ruleUnquotedString
                    {
                     before(grammarAccess.getNBTStringAccess().getValueUnquotedStringParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnquotedString();

                    state._fsp--;

                     after(grammarAccess.getNBTStringAccess().getValueUnquotedStringParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__NBTString__ValueAlternatives_0"


    // $ANTLR start "rule__NBTJSONTextComponent__Alternatives"
    // InternalMCEntity.g:1540:1: rule__NBTJSONTextComponent__Alternatives : ( ( ( rule__NBTJSONTextComponent__Group_0__0 ) ) | ( ( rule__NBTJSONTextComponent__Group_1__0 ) ) | ( ( rule__NBTJSONTextComponent__Group_2__0 ) ) );
    public final void rule__NBTJSONTextComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1544:1: ( ( ( rule__NBTJSONTextComponent__Group_0__0 ) ) | ( ( rule__NBTJSONTextComponent__Group_1__0 ) ) | ( ( rule__NBTJSONTextComponent__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_JSON_TEXT_BEGIN_OBJ:
                {
                alt9=1;
                }
                break;
            case RULE_JSON_TEXT_BEGIN_ARRAY:
                {
                alt9=2;
                }
                break;
            case RULE_JSON_TEXT_BEGIN_STR:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMCEntity.g:1545:2: ( ( rule__NBTJSONTextComponent__Group_0__0 ) )
                    {
                    // InternalMCEntity.g:1545:2: ( ( rule__NBTJSONTextComponent__Group_0__0 ) )
                    // InternalMCEntity.g:1546:3: ( rule__NBTJSONTextComponent__Group_0__0 )
                    {
                     before(grammarAccess.getNBTJSONTextComponentAccess().getGroup_0()); 
                    // InternalMCEntity.g:1547:3: ( rule__NBTJSONTextComponent__Group_0__0 )
                    // InternalMCEntity.g:1547:4: rule__NBTJSONTextComponent__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTJSONTextComponent__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTJSONTextComponentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1551:2: ( ( rule__NBTJSONTextComponent__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1551:2: ( ( rule__NBTJSONTextComponent__Group_1__0 ) )
                    // InternalMCEntity.g:1552:3: ( rule__NBTJSONTextComponent__Group_1__0 )
                    {
                     before(grammarAccess.getNBTJSONTextComponentAccess().getGroup_1()); 
                    // InternalMCEntity.g:1553:3: ( rule__NBTJSONTextComponent__Group_1__0 )
                    // InternalMCEntity.g:1553:4: rule__NBTJSONTextComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTJSONTextComponent__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTJSONTextComponentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1557:2: ( ( rule__NBTJSONTextComponent__Group_2__0 ) )
                    {
                    // InternalMCEntity.g:1557:2: ( ( rule__NBTJSONTextComponent__Group_2__0 ) )
                    // InternalMCEntity.g:1558:3: ( rule__NBTJSONTextComponent__Group_2__0 )
                    {
                     before(grammarAccess.getNBTJSONTextComponentAccess().getGroup_2()); 
                    // InternalMCEntity.g:1559:3: ( rule__NBTJSONTextComponent__Group_2__0 )
                    // InternalMCEntity.g:1559:4: rule__NBTJSONTextComponent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTJSONTextComponent__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNBTJSONTextComponentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NBTJSONTextComponent__Alternatives"


    // $ANTLR start "rule__JSONValue__Alternatives"
    // InternalMCEntity.g:1567:1: rule__JSONValue__Alternatives : ( ( ruleJSONObject ) | ( ruleJSONArray ) | ( ruleJSONString ) | ( ruleJSONNumber ) | ( ruleJSONBool ) | ( ruleSelector ) );
    public final void rule__JSONValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1571:1: ( ( ruleJSONObject ) | ( ruleJSONArray ) | ( ruleJSONString ) | ( ruleJSONNumber ) | ( ruleJSONBool ) | ( ruleSelector ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt10=4;
                }
                break;
            case 45:
            case 49:
                {
                alt10=5;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMCEntity.g:1572:2: ( ruleJSONObject )
                    {
                    // InternalMCEntity.g:1572:2: ( ruleJSONObject )
                    // InternalMCEntity.g:1573:3: ruleJSONObject
                    {
                     before(grammarAccess.getJSONValueAccess().getJSONObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONObject();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getJSONObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1578:2: ( ruleJSONArray )
                    {
                    // InternalMCEntity.g:1578:2: ( ruleJSONArray )
                    // InternalMCEntity.g:1579:3: ruleJSONArray
                    {
                     before(grammarAccess.getJSONValueAccess().getJSONArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONArray();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getJSONArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1584:2: ( ruleJSONString )
                    {
                    // InternalMCEntity.g:1584:2: ( ruleJSONString )
                    // InternalMCEntity.g:1585:3: ruleJSONString
                    {
                     before(grammarAccess.getJSONValueAccess().getJSONStringParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONString();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getJSONStringParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1590:2: ( ruleJSONNumber )
                    {
                    // InternalMCEntity.g:1590:2: ( ruleJSONNumber )
                    // InternalMCEntity.g:1591:3: ruleJSONNumber
                    {
                     before(grammarAccess.getJSONValueAccess().getJSONNumberParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONNumber();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getJSONNumberParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1596:2: ( ruleJSONBool )
                    {
                    // InternalMCEntity.g:1596:2: ( ruleJSONBool )
                    // InternalMCEntity.g:1597:3: ruleJSONBool
                    {
                     before(grammarAccess.getJSONValueAccess().getJSONBoolParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONBool();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getJSONBoolParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1602:2: ( ruleSelector )
                    {
                    // InternalMCEntity.g:1602:2: ( ruleSelector )
                    // InternalMCEntity.g:1603:3: ruleSelector
                    {
                     before(grammarAccess.getJSONValueAccess().getSelectorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSelector();

                    state._fsp--;

                     after(grammarAccess.getJSONValueAccess().getSelectorParserRuleCall_5()); 

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
    // $ANTLR end "rule__JSONValue__Alternatives"


    // $ANTLR start "rule__JSONBool__Alternatives"
    // InternalMCEntity.g:1612:1: rule__JSONBool__Alternatives : ( ( ( rule__JSONBool__ValueAssignment_0 ) ) | ( ( rule__JSONBool__Group_1__0 ) ) );
    public final void rule__JSONBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1616:1: ( ( ( rule__JSONBool__ValueAssignment_0 ) ) | ( ( rule__JSONBool__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCEntity.g:1617:2: ( ( rule__JSONBool__ValueAssignment_0 ) )
                    {
                    // InternalMCEntity.g:1617:2: ( ( rule__JSONBool__ValueAssignment_0 ) )
                    // InternalMCEntity.g:1618:3: ( rule__JSONBool__ValueAssignment_0 )
                    {
                     before(grammarAccess.getJSONBoolAccess().getValueAssignment_0()); 
                    // InternalMCEntity.g:1619:3: ( rule__JSONBool__ValueAssignment_0 )
                    // InternalMCEntity.g:1619:4: rule__JSONBool__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONBool__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJSONBoolAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1623:2: ( ( rule__JSONBool__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1623:2: ( ( rule__JSONBool__Group_1__0 ) )
                    // InternalMCEntity.g:1624:3: ( rule__JSONBool__Group_1__0 )
                    {
                     before(grammarAccess.getJSONBoolAccess().getGroup_1()); 
                    // InternalMCEntity.g:1625:3: ( rule__JSONBool__Group_1__0 )
                    // InternalMCEntity.g:1625:4: rule__JSONBool__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONBool__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJSONBoolAccess().getGroup_1()); 

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
    // $ANTLR end "rule__JSONBool__Alternatives"


    // $ANTLR start "rule__JSONNumber__Alternatives"
    // InternalMCEntity.g:1633:1: rule__JSONNumber__Alternatives : ( ( ruleJSONDouble ) | ( ruleJSONLong ) );
    public final void rule__JSONNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1637:1: ( ( ruleJSONDouble ) | ( ruleJSONLong ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOUBLE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMCEntity.g:1638:2: ( ruleJSONDouble )
                    {
                    // InternalMCEntity.g:1638:2: ( ruleJSONDouble )
                    // InternalMCEntity.g:1639:3: ruleJSONDouble
                    {
                     before(grammarAccess.getJSONNumberAccess().getJSONDoubleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONDouble();

                    state._fsp--;

                     after(grammarAccess.getJSONNumberAccess().getJSONDoubleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1644:2: ( ruleJSONLong )
                    {
                    // InternalMCEntity.g:1644:2: ( ruleJSONLong )
                    // InternalMCEntity.g:1645:3: ruleJSONLong
                    {
                     before(grammarAccess.getJSONNumberAccess().getJSONLongParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONLong();

                    state._fsp--;

                     after(grammarAccess.getJSONNumberAccess().getJSONLongParserRuleCall_1()); 

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
    // $ANTLR end "rule__JSONNumber__Alternatives"


    // $ANTLR start "rule__SelectorValue__Alternatives"
    // InternalMCEntity.g:1654:1: rule__SelectorValue__Alternatives : ( ( ruleNBTCompound ) | ( ruleNamespacedKey ) | ( ruleIntRange ) | ( ruleDoubleRange ) | ( ruleIntSelectorValue ) | ( ruleDoubleSelectorValue ) | ( ruleStringSelectorValue ) | ( ruleBoolSelectorValue ) );
    public final void rule__SelectorValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1658:1: ( ( ruleNBTCompound ) | ( ruleNamespacedKey ) | ( ruleIntRange ) | ( ruleDoubleRange ) | ( ruleIntSelectorValue ) | ( ruleDoubleSelectorValue ) | ( ruleStringSelectorValue ) | ( ruleBoolSelectorValue ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalMCEntity.g:1659:2: ( ruleNBTCompound )
                    {
                    // InternalMCEntity.g:1659:2: ( ruleNBTCompound )
                    // InternalMCEntity.g:1660:3: ruleNBTCompound
                    {
                     before(grammarAccess.getSelectorValueAccess().getNBTCompoundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNBTCompound();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getNBTCompoundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1665:2: ( ruleNamespacedKey )
                    {
                    // InternalMCEntity.g:1665:2: ( ruleNamespacedKey )
                    // InternalMCEntity.g:1666:3: ruleNamespacedKey
                    {
                     before(grammarAccess.getSelectorValueAccess().getNamespacedKeyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNamespacedKey();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getNamespacedKeyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1671:2: ( ruleIntRange )
                    {
                    // InternalMCEntity.g:1671:2: ( ruleIntRange )
                    // InternalMCEntity.g:1672:3: ruleIntRange
                    {
                     before(grammarAccess.getSelectorValueAccess().getIntRangeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntRange();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getIntRangeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1677:2: ( ruleDoubleRange )
                    {
                    // InternalMCEntity.g:1677:2: ( ruleDoubleRange )
                    // InternalMCEntity.g:1678:3: ruleDoubleRange
                    {
                     before(grammarAccess.getSelectorValueAccess().getDoubleRangeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleRange();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getDoubleRangeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1683:2: ( ruleIntSelectorValue )
                    {
                    // InternalMCEntity.g:1683:2: ( ruleIntSelectorValue )
                    // InternalMCEntity.g:1684:3: ruleIntSelectorValue
                    {
                     before(grammarAccess.getSelectorValueAccess().getIntSelectorValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleIntSelectorValue();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getIntSelectorValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1689:2: ( ruleDoubleSelectorValue )
                    {
                    // InternalMCEntity.g:1689:2: ( ruleDoubleSelectorValue )
                    // InternalMCEntity.g:1690:3: ruleDoubleSelectorValue
                    {
                     before(grammarAccess.getSelectorValueAccess().getDoubleSelectorValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleSelectorValue();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getDoubleSelectorValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:1695:2: ( ruleStringSelectorValue )
                    {
                    // InternalMCEntity.g:1695:2: ( ruleStringSelectorValue )
                    // InternalMCEntity.g:1696:3: ruleStringSelectorValue
                    {
                     before(grammarAccess.getSelectorValueAccess().getStringSelectorValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStringSelectorValue();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getStringSelectorValueParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:1701:2: ( ruleBoolSelectorValue )
                    {
                    // InternalMCEntity.g:1701:2: ( ruleBoolSelectorValue )
                    // InternalMCEntity.g:1702:3: ruleBoolSelectorValue
                    {
                     before(grammarAccess.getSelectorValueAccess().getBoolSelectorValueParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolSelectorValue();

                    state._fsp--;

                     after(grammarAccess.getSelectorValueAccess().getBoolSelectorValueParserRuleCall_7()); 

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
    // $ANTLR end "rule__SelectorValue__Alternatives"


    // $ANTLR start "rule__IntRange__Alternatives"
    // InternalMCEntity.g:1711:1: rule__IntRange__Alternatives : ( ( ( rule__IntRange__Group_0__0 ) ) | ( ( rule__IntRange__Group_1__0 ) ) | ( ( rule__IntRange__Group_2__0 ) ) );
    public final void rule__IntRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1715:1: ( ( ( rule__IntRange__Group_0__0 ) ) | ( ( rule__IntRange__Group_1__0 ) ) | ( ( rule__IntRange__Group_2__0 ) ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==47) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==EOF||LA14_3==41||LA14_3==43) ) {
                        alt14=2;
                    }
                    else if ( (LA14_3==RULE_INT) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==47) ) {
                alt14=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMCEntity.g:1716:2: ( ( rule__IntRange__Group_0__0 ) )
                    {
                    // InternalMCEntity.g:1716:2: ( ( rule__IntRange__Group_0__0 ) )
                    // InternalMCEntity.g:1717:3: ( rule__IntRange__Group_0__0 )
                    {
                     before(grammarAccess.getIntRangeAccess().getGroup_0()); 
                    // InternalMCEntity.g:1718:3: ( rule__IntRange__Group_0__0 )
                    // InternalMCEntity.g:1718:4: rule__IntRange__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntRange__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntRangeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1722:2: ( ( rule__IntRange__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1722:2: ( ( rule__IntRange__Group_1__0 ) )
                    // InternalMCEntity.g:1723:3: ( rule__IntRange__Group_1__0 )
                    {
                     before(grammarAccess.getIntRangeAccess().getGroup_1()); 
                    // InternalMCEntity.g:1724:3: ( rule__IntRange__Group_1__0 )
                    // InternalMCEntity.g:1724:4: rule__IntRange__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntRange__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntRangeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1728:2: ( ( rule__IntRange__Group_2__0 ) )
                    {
                    // InternalMCEntity.g:1728:2: ( ( rule__IntRange__Group_2__0 ) )
                    // InternalMCEntity.g:1729:3: ( rule__IntRange__Group_2__0 )
                    {
                     before(grammarAccess.getIntRangeAccess().getGroup_2()); 
                    // InternalMCEntity.g:1730:3: ( rule__IntRange__Group_2__0 )
                    // InternalMCEntity.g:1730:4: rule__IntRange__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntRange__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntRangeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__IntRange__Alternatives"


    // $ANTLR start "rule__DoubleRange__Alternatives"
    // InternalMCEntity.g:1738:1: rule__DoubleRange__Alternatives : ( ( ( rule__DoubleRange__Group_0__0 ) ) | ( ( rule__DoubleRange__Group_1__0 ) ) | ( ( rule__DoubleRange__Group_2__0 ) ) );
    public final void rule__DoubleRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1742:1: ( ( ( rule__DoubleRange__Group_0__0 ) ) | ( ( rule__DoubleRange__Group_1__0 ) ) | ( ( rule__DoubleRange__Group_2__0 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case RULE_DOUBLE:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==47) ) {
                    int LA15_4 = input.LA(3);

                    if ( (LA15_4==EOF||LA15_4==41||LA15_4==43) ) {
                        alt15=2;
                    }
                    else if ( (LA15_4==RULE_INT||LA15_4==RULE_DOUBLE) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMCEntity.g:1743:2: ( ( rule__DoubleRange__Group_0__0 ) )
                    {
                    // InternalMCEntity.g:1743:2: ( ( rule__DoubleRange__Group_0__0 ) )
                    // InternalMCEntity.g:1744:3: ( rule__DoubleRange__Group_0__0 )
                    {
                     before(grammarAccess.getDoubleRangeAccess().getGroup_0()); 
                    // InternalMCEntity.g:1745:3: ( rule__DoubleRange__Group_0__0 )
                    // InternalMCEntity.g:1745:4: rule__DoubleRange__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleRange__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleRangeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1749:2: ( ( rule__DoubleRange__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1749:2: ( ( rule__DoubleRange__Group_1__0 ) )
                    // InternalMCEntity.g:1750:3: ( rule__DoubleRange__Group_1__0 )
                    {
                     before(grammarAccess.getDoubleRangeAccess().getGroup_1()); 
                    // InternalMCEntity.g:1751:3: ( rule__DoubleRange__Group_1__0 )
                    // InternalMCEntity.g:1751:4: rule__DoubleRange__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleRange__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleRangeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1755:2: ( ( rule__DoubleRange__Group_2__0 ) )
                    {
                    // InternalMCEntity.g:1755:2: ( ( rule__DoubleRange__Group_2__0 ) )
                    // InternalMCEntity.g:1756:3: ( rule__DoubleRange__Group_2__0 )
                    {
                     before(grammarAccess.getDoubleRangeAccess().getGroup_2()); 
                    // InternalMCEntity.g:1757:3: ( rule__DoubleRange__Group_2__0 )
                    // InternalMCEntity.g:1757:4: rule__DoubleRange__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleRange__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleRangeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DoubleRange__Alternatives"


    // $ANTLR start "rule__DoubleRange__Alternatives_0_1"
    // InternalMCEntity.g:1765:1: rule__DoubleRange__Alternatives_0_1 : ( ( ( rule__DoubleRange__Group_0_1_0__0 ) ) | ( ( rule__DoubleRange__Group_0_1_1__0 ) ) );
    public final void rule__DoubleRange__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1769:1: ( ( ( rule__DoubleRange__Group_0_1_0__0 ) ) | ( ( rule__DoubleRange__Group_0_1_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_DOUBLE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMCEntity.g:1770:2: ( ( rule__DoubleRange__Group_0_1_0__0 ) )
                    {
                    // InternalMCEntity.g:1770:2: ( ( rule__DoubleRange__Group_0_1_0__0 ) )
                    // InternalMCEntity.g:1771:3: ( rule__DoubleRange__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getDoubleRangeAccess().getGroup_0_1_0()); 
                    // InternalMCEntity.g:1772:3: ( rule__DoubleRange__Group_0_1_0__0 )
                    // InternalMCEntity.g:1772:4: rule__DoubleRange__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleRange__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleRangeAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1776:2: ( ( rule__DoubleRange__Group_0_1_1__0 ) )
                    {
                    // InternalMCEntity.g:1776:2: ( ( rule__DoubleRange__Group_0_1_1__0 ) )
                    // InternalMCEntity.g:1777:3: ( rule__DoubleRange__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getDoubleRangeAccess().getGroup_0_1_1()); 
                    // InternalMCEntity.g:1778:3: ( rule__DoubleRange__Group_0_1_1__0 )
                    // InternalMCEntity.g:1778:4: rule__DoubleRange__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleRange__Group_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleRangeAccess().getGroup_0_1_1()); 

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
    // $ANTLR end "rule__DoubleRange__Alternatives_0_1"


    // $ANTLR start "rule__DOUBLEorINT__Alternatives"
    // InternalMCEntity.g:1786:1: rule__DOUBLEorINT__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__DOUBLEorINT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1790:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOUBLE) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMCEntity.g:1791:2: ( RULE_DOUBLE )
                    {
                    // InternalMCEntity.g:1791:2: ( RULE_DOUBLE )
                    // InternalMCEntity.g:1792:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getDOUBLEorINTAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getDOUBLEorINTAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1797:2: ( RULE_INT )
                    {
                    // InternalMCEntity.g:1797:2: ( RULE_INT )
                    // InternalMCEntity.g:1798:3: RULE_INT
                    {
                     before(grammarAccess.getDOUBLEorINTAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDOUBLEorINTAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DOUBLEorINT__Alternatives"


    // $ANTLR start "rule__BoolSelectorValue__Alternatives"
    // InternalMCEntity.g:1807:1: rule__BoolSelectorValue__Alternatives : ( ( ( rule__BoolSelectorValue__ValueAssignment_0 ) ) | ( ( rule__BoolSelectorValue__Group_1__0 ) ) );
    public final void rule__BoolSelectorValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1811:1: ( ( ( rule__BoolSelectorValue__ValueAssignment_0 ) ) | ( ( rule__BoolSelectorValue__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            else if ( (LA18_0==45) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMCEntity.g:1812:2: ( ( rule__BoolSelectorValue__ValueAssignment_0 ) )
                    {
                    // InternalMCEntity.g:1812:2: ( ( rule__BoolSelectorValue__ValueAssignment_0 ) )
                    // InternalMCEntity.g:1813:3: ( rule__BoolSelectorValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBoolSelectorValueAccess().getValueAssignment_0()); 
                    // InternalMCEntity.g:1814:3: ( rule__BoolSelectorValue__ValueAssignment_0 )
                    // InternalMCEntity.g:1814:4: rule__BoolSelectorValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolSelectorValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolSelectorValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1818:2: ( ( rule__BoolSelectorValue__Group_1__0 ) )
                    {
                    // InternalMCEntity.g:1818:2: ( ( rule__BoolSelectorValue__Group_1__0 ) )
                    // InternalMCEntity.g:1819:3: ( rule__BoolSelectorValue__Group_1__0 )
                    {
                     before(grammarAccess.getBoolSelectorValueAccess().getGroup_1()); 
                    // InternalMCEntity.g:1820:3: ( rule__BoolSelectorValue__Group_1__0 )
                    // InternalMCEntity.g:1820:4: rule__BoolSelectorValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolSelectorValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolSelectorValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BoolSelectorValue__Alternatives"


    // $ANTLR start "rule__StringSelectorValue__ValueAlternatives_0"
    // InternalMCEntity.g:1828:1: rule__StringSelectorValue__ValueAlternatives_0 : ( ( RULE_STRING ) | ( ruleUnquotedString ) );
    public final void rule__StringSelectorValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1832:1: ( ( RULE_STRING ) | ( ruleUnquotedString ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID||(LA19_0>=31 && LA19_0<=33)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMCEntity.g:1833:2: ( RULE_STRING )
                    {
                    // InternalMCEntity.g:1833:2: ( RULE_STRING )
                    // InternalMCEntity.g:1834:3: RULE_STRING
                    {
                     before(grammarAccess.getStringSelectorValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringSelectorValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1839:2: ( ruleUnquotedString )
                    {
                    // InternalMCEntity.g:1839:2: ( ruleUnquotedString )
                    // InternalMCEntity.g:1840:3: ruleUnquotedString
                    {
                     before(grammarAccess.getStringSelectorValueAccess().getValueUnquotedStringParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnquotedString();

                    state._fsp--;

                     after(grammarAccess.getStringSelectorValueAccess().getValueUnquotedStringParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__StringSelectorValue__ValueAlternatives_0"


    // $ANTLR start "rule__UnquotedString__Alternatives_0"
    // InternalMCEntity.g:1849:1: rule__UnquotedString__Alternatives_0 : ( ( RULE_ID ) | ( '-' ) | ( '.' ) | ( '+' ) );
    public final void rule__UnquotedString__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1853:1: ( ( RULE_ID ) | ( '-' ) | ( '.' ) | ( '+' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            case 33:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMCEntity.g:1854:2: ( RULE_ID )
                    {
                    // InternalMCEntity.g:1854:2: ( RULE_ID )
                    // InternalMCEntity.g:1855:3: RULE_ID
                    {
                     before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1860:2: ( '-' )
                    {
                    // InternalMCEntity.g:1860:2: ( '-' )
                    // InternalMCEntity.g:1861:3: '-'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1866:2: ( '.' )
                    {
                    // InternalMCEntity.g:1866:2: ( '.' )
                    // InternalMCEntity.g:1867:3: '.'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getFullStopKeyword_0_2()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getFullStopKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1872:2: ( '+' )
                    {
                    // InternalMCEntity.g:1872:2: ( '+' )
                    // InternalMCEntity.g:1873:3: '+'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_0_3()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_0_3()); 

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
    // $ANTLR end "rule__UnquotedString__Alternatives_0"


    // $ANTLR start "rule__UnquotedString__Alternatives_1"
    // InternalMCEntity.g:1882:1: rule__UnquotedString__Alternatives_1 : ( ( RULE_ID ) | ( '-' ) | ( '.' ) | ( '+' ) | ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_DOUBLE ) | ( RULE_LONG ) | ( RULE_SHORT ) | ( RULE_BYTE ) );
    public final void rule__UnquotedString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1886:1: ( ( RULE_ID ) | ( '-' ) | ( '.' ) | ( '+' ) | ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_DOUBLE ) | ( RULE_LONG ) | ( RULE_SHORT ) | ( RULE_BYTE ) )
            int alt21=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            case RULE_INT:
                {
                alt21=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt21=6;
                }
                break;
            case RULE_DOUBLE:
                {
                alt21=7;
                }
                break;
            case RULE_LONG:
                {
                alt21=8;
                }
                break;
            case RULE_SHORT:
                {
                alt21=9;
                }
                break;
            case RULE_BYTE:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMCEntity.g:1887:2: ( RULE_ID )
                    {
                    // InternalMCEntity.g:1887:2: ( RULE_ID )
                    // InternalMCEntity.g:1888:3: RULE_ID
                    {
                     before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1893:2: ( '-' )
                    {
                    // InternalMCEntity.g:1893:2: ( '-' )
                    // InternalMCEntity.g:1894:3: '-'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_1_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getHyphenMinusKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1899:2: ( '.' )
                    {
                    // InternalMCEntity.g:1899:2: ( '.' )
                    // InternalMCEntity.g:1900:3: '.'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getFullStopKeyword_1_2()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getFullStopKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1905:2: ( '+' )
                    {
                    // InternalMCEntity.g:1905:2: ( '+' )
                    // InternalMCEntity.g:1906:3: '+'
                    {
                     before(grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_1_3()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getPlusSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1911:2: ( RULE_INT )
                    {
                    // InternalMCEntity.g:1911:2: ( RULE_INT )
                    // InternalMCEntity.g:1912:3: RULE_INT
                    {
                     before(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:1917:2: ( RULE_FLOAT )
                    {
                    // InternalMCEntity.g:1917:2: ( RULE_FLOAT )
                    // InternalMCEntity.g:1918:3: RULE_FLOAT
                    {
                     before(grammarAccess.getUnquotedStringAccess().getFLOATTerminalRuleCall_1_5()); 
                    match(input,RULE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getFLOATTerminalRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCEntity.g:1923:2: ( RULE_DOUBLE )
                    {
                    // InternalMCEntity.g:1923:2: ( RULE_DOUBLE )
                    // InternalMCEntity.g:1924:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getUnquotedStringAccess().getDOUBLETerminalRuleCall_1_6()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getDOUBLETerminalRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCEntity.g:1929:2: ( RULE_LONG )
                    {
                    // InternalMCEntity.g:1929:2: ( RULE_LONG )
                    // InternalMCEntity.g:1930:3: RULE_LONG
                    {
                     before(grammarAccess.getUnquotedStringAccess().getLONGTerminalRuleCall_1_7()); 
                    match(input,RULE_LONG,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getLONGTerminalRuleCall_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMCEntity.g:1935:2: ( RULE_SHORT )
                    {
                    // InternalMCEntity.g:1935:2: ( RULE_SHORT )
                    // InternalMCEntity.g:1936:3: RULE_SHORT
                    {
                     before(grammarAccess.getUnquotedStringAccess().getSHORTTerminalRuleCall_1_8()); 
                    match(input,RULE_SHORT,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getSHORTTerminalRuleCall_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMCEntity.g:1941:2: ( RULE_BYTE )
                    {
                    // InternalMCEntity.g:1941:2: ( RULE_BYTE )
                    // InternalMCEntity.g:1942:3: RULE_BYTE
                    {
                     before(grammarAccess.getUnquotedStringAccess().getBYTETerminalRuleCall_1_9()); 
                    match(input,RULE_BYTE,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getBYTETerminalRuleCall_1_9()); 

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
    // $ANTLR end "rule__UnquotedString__Alternatives_1"


    // $ANTLR start "rule__SelectorType__Alternatives"
    // InternalMCEntity.g:1951:1: rule__SelectorType__Alternatives : ( ( ( '@p' ) ) | ( ( '@a' ) ) | ( ( '@s' ) ) | ( ( '@e' ) ) | ( ( '@r' ) ) );
    public final void rule__SelectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1955:1: ( ( ( '@p' ) ) | ( ( '@a' ) ) | ( ( '@s' ) ) | ( ( '@e' ) ) | ( ( '@r' ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 38:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMCEntity.g:1956:2: ( ( '@p' ) )
                    {
                    // InternalMCEntity.g:1956:2: ( ( '@p' ) )
                    // InternalMCEntity.g:1957:3: ( '@p' )
                    {
                     before(grammarAccess.getSelectorTypeAccess().getNEAREST_PLAYEREnumLiteralDeclaration_0()); 
                    // InternalMCEntity.g:1958:3: ( '@p' )
                    // InternalMCEntity.g:1958:4: '@p'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getSelectorTypeAccess().getNEAREST_PLAYEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:1962:2: ( ( '@a' ) )
                    {
                    // InternalMCEntity.g:1962:2: ( ( '@a' ) )
                    // InternalMCEntity.g:1963:3: ( '@a' )
                    {
                     before(grammarAccess.getSelectorTypeAccess().getALL_PLAYERSEnumLiteralDeclaration_1()); 
                    // InternalMCEntity.g:1964:3: ( '@a' )
                    // InternalMCEntity.g:1964:4: '@a'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getSelectorTypeAccess().getALL_PLAYERSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:1968:2: ( ( '@s' ) )
                    {
                    // InternalMCEntity.g:1968:2: ( ( '@s' ) )
                    // InternalMCEntity.g:1969:3: ( '@s' )
                    {
                     before(grammarAccess.getSelectorTypeAccess().getSELFEnumLiteralDeclaration_2()); 
                    // InternalMCEntity.g:1970:3: ( '@s' )
                    // InternalMCEntity.g:1970:4: '@s'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getSelectorTypeAccess().getSELFEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:1974:2: ( ( '@e' ) )
                    {
                    // InternalMCEntity.g:1974:2: ( ( '@e' ) )
                    // InternalMCEntity.g:1975:3: ( '@e' )
                    {
                     before(grammarAccess.getSelectorTypeAccess().getENTITIESEnumLiteralDeclaration_3()); 
                    // InternalMCEntity.g:1976:3: ( '@e' )
                    // InternalMCEntity.g:1976:4: '@e'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getSelectorTypeAccess().getENTITIESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:1980:2: ( ( '@r' ) )
                    {
                    // InternalMCEntity.g:1980:2: ( ( '@r' ) )
                    // InternalMCEntity.g:1981:3: ( '@r' )
                    {
                     before(grammarAccess.getSelectorTypeAccess().getRANDOM_PLAYEREnumLiteralDeclaration_4()); 
                    // InternalMCEntity.g:1982:3: ( '@r' )
                    // InternalMCEntity.g:1982:4: '@r'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getSelectorTypeAccess().getRANDOM_PLAYEREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__SelectorType__Alternatives"


    // $ANTLR start "rule__NBTCompound__Group__0"
    // InternalMCEntity.g:1990:1: rule__NBTCompound__Group__0 : rule__NBTCompound__Group__0__Impl rule__NBTCompound__Group__1 ;
    public final void rule__NBTCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:1994:1: ( rule__NBTCompound__Group__0__Impl rule__NBTCompound__Group__1 )
            // InternalMCEntity.g:1995:2: rule__NBTCompound__Group__0__Impl rule__NBTCompound__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NBTCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__0"


    // $ANTLR start "rule__NBTCompound__Group__0__Impl"
    // InternalMCEntity.g:2002:1: rule__NBTCompound__Group__0__Impl : ( '{' ) ;
    public final void rule__NBTCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2006:1: ( ( '{' ) )
            // InternalMCEntity.g:2007:1: ( '{' )
            {
            // InternalMCEntity.g:2007:1: ( '{' )
            // InternalMCEntity.g:2008:2: '{'
            {
             before(grammarAccess.getNBTCompoundAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNBTCompoundAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__0__Impl"


    // $ANTLR start "rule__NBTCompound__Group__1"
    // InternalMCEntity.g:2017:1: rule__NBTCompound__Group__1 : rule__NBTCompound__Group__1__Impl rule__NBTCompound__Group__2 ;
    public final void rule__NBTCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2021:1: ( rule__NBTCompound__Group__1__Impl rule__NBTCompound__Group__2 )
            // InternalMCEntity.g:2022:2: rule__NBTCompound__Group__1__Impl rule__NBTCompound__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NBTCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__1"


    // $ANTLR start "rule__NBTCompound__Group__1__Impl"
    // InternalMCEntity.g:2029:1: rule__NBTCompound__Group__1__Impl : ( () ) ;
    public final void rule__NBTCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2033:1: ( ( () ) )
            // InternalMCEntity.g:2034:1: ( () )
            {
            // InternalMCEntity.g:2034:1: ( () )
            // InternalMCEntity.g:2035:2: ()
            {
             before(grammarAccess.getNBTCompoundAccess().getNBTCompoundAction_1()); 
            // InternalMCEntity.g:2036:2: ()
            // InternalMCEntity.g:2036:3: 
            {
            }

             after(grammarAccess.getNBTCompoundAccess().getNBTCompoundAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__1__Impl"


    // $ANTLR start "rule__NBTCompound__Group__2"
    // InternalMCEntity.g:2044:1: rule__NBTCompound__Group__2 : rule__NBTCompound__Group__2__Impl rule__NBTCompound__Group__3 ;
    public final void rule__NBTCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2048:1: ( rule__NBTCompound__Group__2__Impl rule__NBTCompound__Group__3 )
            // InternalMCEntity.g:2049:2: rule__NBTCompound__Group__2__Impl rule__NBTCompound__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__NBTCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__2"


    // $ANTLR start "rule__NBTCompound__Group__2__Impl"
    // InternalMCEntity.g:2056:1: rule__NBTCompound__Group__2__Impl : ( ( rule__NBTCompound__Group_2__0 )? ) ;
    public final void rule__NBTCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2060:1: ( ( ( rule__NBTCompound__Group_2__0 )? ) )
            // InternalMCEntity.g:2061:1: ( ( rule__NBTCompound__Group_2__0 )? )
            {
            // InternalMCEntity.g:2061:1: ( ( rule__NBTCompound__Group_2__0 )? )
            // InternalMCEntity.g:2062:2: ( rule__NBTCompound__Group_2__0 )?
            {
             before(grammarAccess.getNBTCompoundAccess().getGroup_2()); 
            // InternalMCEntity.g:2063:2: ( rule__NBTCompound__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING||LA23_0==RULE_ID||(LA23_0>=31 && LA23_0<=33)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMCEntity.g:2063:3: rule__NBTCompound__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTCompound__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTCompoundAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__2__Impl"


    // $ANTLR start "rule__NBTCompound__Group__3"
    // InternalMCEntity.g:2071:1: rule__NBTCompound__Group__3 : rule__NBTCompound__Group__3__Impl ;
    public final void rule__NBTCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2075:1: ( rule__NBTCompound__Group__3__Impl )
            // InternalMCEntity.g:2076:2: rule__NBTCompound__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__3"


    // $ANTLR start "rule__NBTCompound__Group__3__Impl"
    // InternalMCEntity.g:2082:1: rule__NBTCompound__Group__3__Impl : ( '}' ) ;
    public final void rule__NBTCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2086:1: ( ( '}' ) )
            // InternalMCEntity.g:2087:1: ( '}' )
            {
            // InternalMCEntity.g:2087:1: ( '}' )
            // InternalMCEntity.g:2088:2: '}'
            {
             before(grammarAccess.getNBTCompoundAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNBTCompoundAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group__3__Impl"


    // $ANTLR start "rule__NBTCompound__Group_2__0"
    // InternalMCEntity.g:2098:1: rule__NBTCompound__Group_2__0 : rule__NBTCompound__Group_2__0__Impl rule__NBTCompound__Group_2__1 ;
    public final void rule__NBTCompound__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2102:1: ( rule__NBTCompound__Group_2__0__Impl rule__NBTCompound__Group_2__1 )
            // InternalMCEntity.g:2103:2: rule__NBTCompound__Group_2__0__Impl rule__NBTCompound__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTCompound__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__0"


    // $ANTLR start "rule__NBTCompound__Group_2__0__Impl"
    // InternalMCEntity.g:2110:1: rule__NBTCompound__Group_2__0__Impl : ( ( rule__NBTCompound__EntriesAssignment_2_0 ) ) ;
    public final void rule__NBTCompound__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2114:1: ( ( ( rule__NBTCompound__EntriesAssignment_2_0 ) ) )
            // InternalMCEntity.g:2115:1: ( ( rule__NBTCompound__EntriesAssignment_2_0 ) )
            {
            // InternalMCEntity.g:2115:1: ( ( rule__NBTCompound__EntriesAssignment_2_0 ) )
            // InternalMCEntity.g:2116:2: ( rule__NBTCompound__EntriesAssignment_2_0 )
            {
             before(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_0()); 
            // InternalMCEntity.g:2117:2: ( rule__NBTCompound__EntriesAssignment_2_0 )
            // InternalMCEntity.g:2117:3: rule__NBTCompound__EntriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__EntriesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__0__Impl"


    // $ANTLR start "rule__NBTCompound__Group_2__1"
    // InternalMCEntity.g:2125:1: rule__NBTCompound__Group_2__1 : rule__NBTCompound__Group_2__1__Impl rule__NBTCompound__Group_2__2 ;
    public final void rule__NBTCompound__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2129:1: ( rule__NBTCompound__Group_2__1__Impl rule__NBTCompound__Group_2__2 )
            // InternalMCEntity.g:2130:2: rule__NBTCompound__Group_2__1__Impl rule__NBTCompound__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTCompound__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__1"


    // $ANTLR start "rule__NBTCompound__Group_2__1__Impl"
    // InternalMCEntity.g:2137:1: rule__NBTCompound__Group_2__1__Impl : ( ( rule__NBTCompound__Group_2_1__0 )* ) ;
    public final void rule__NBTCompound__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2141:1: ( ( ( rule__NBTCompound__Group_2_1__0 )* ) )
            // InternalMCEntity.g:2142:1: ( ( rule__NBTCompound__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:2142:1: ( ( rule__NBTCompound__Group_2_1__0 )* )
            // InternalMCEntity.g:2143:2: ( rule__NBTCompound__Group_2_1__0 )*
            {
             before(grammarAccess.getNBTCompoundAccess().getGroup_2_1()); 
            // InternalMCEntity.g:2144:2: ( rule__NBTCompound__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_STRING||LA24_1==RULE_ID||(LA24_1>=31 && LA24_1<=33)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalMCEntity.g:2144:3: rule__NBTCompound__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTCompound__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getNBTCompoundAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__1__Impl"


    // $ANTLR start "rule__NBTCompound__Group_2__2"
    // InternalMCEntity.g:2152:1: rule__NBTCompound__Group_2__2 : rule__NBTCompound__Group_2__2__Impl ;
    public final void rule__NBTCompound__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2156:1: ( rule__NBTCompound__Group_2__2__Impl )
            // InternalMCEntity.g:2157:2: rule__NBTCompound__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__2"


    // $ANTLR start "rule__NBTCompound__Group_2__2__Impl"
    // InternalMCEntity.g:2163:1: rule__NBTCompound__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTCompound__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2167:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:2168:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:2168:1: ( ( ',' )? )
            // InternalMCEntity.g:2169:2: ( ',' )?
            {
             before(grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:2170:2: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMCEntity.g:2170:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2__2__Impl"


    // $ANTLR start "rule__NBTCompound__Group_2_1__0"
    // InternalMCEntity.g:2179:1: rule__NBTCompound__Group_2_1__0 : rule__NBTCompound__Group_2_1__0__Impl rule__NBTCompound__Group_2_1__1 ;
    public final void rule__NBTCompound__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2183:1: ( rule__NBTCompound__Group_2_1__0__Impl rule__NBTCompound__Group_2_1__1 )
            // InternalMCEntity.g:2184:2: rule__NBTCompound__Group_2_1__0__Impl rule__NBTCompound__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__NBTCompound__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2_1__0"


    // $ANTLR start "rule__NBTCompound__Group_2_1__0__Impl"
    // InternalMCEntity.g:2191:1: rule__NBTCompound__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__NBTCompound__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2195:1: ( ( ',' ) )
            // InternalMCEntity.g:2196:1: ( ',' )
            {
            // InternalMCEntity.g:2196:1: ( ',' )
            // InternalMCEntity.g:2197:2: ','
            {
             before(grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTCompoundAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2_1__0__Impl"


    // $ANTLR start "rule__NBTCompound__Group_2_1__1"
    // InternalMCEntity.g:2206:1: rule__NBTCompound__Group_2_1__1 : rule__NBTCompound__Group_2_1__1__Impl ;
    public final void rule__NBTCompound__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2210:1: ( rule__NBTCompound__Group_2_1__1__Impl )
            // InternalMCEntity.g:2211:2: rule__NBTCompound__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2_1__1"


    // $ANTLR start "rule__NBTCompound__Group_2_1__1__Impl"
    // InternalMCEntity.g:2217:1: rule__NBTCompound__Group_2_1__1__Impl : ( ( rule__NBTCompound__EntriesAssignment_2_1_1 ) ) ;
    public final void rule__NBTCompound__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2221:1: ( ( ( rule__NBTCompound__EntriesAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:2222:1: ( ( rule__NBTCompound__EntriesAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:2222:1: ( ( rule__NBTCompound__EntriesAssignment_2_1_1 ) )
            // InternalMCEntity.g:2223:2: ( rule__NBTCompound__EntriesAssignment_2_1_1 )
            {
             before(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_1_1()); 
            // InternalMCEntity.g:2224:2: ( rule__NBTCompound__EntriesAssignment_2_1_1 )
            // InternalMCEntity.g:2224:3: rule__NBTCompound__EntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTCompound__EntriesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTCompoundAccess().getEntriesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__Group_2_1__1__Impl"


    // $ANTLR start "rule__NBTEntry__Group__0"
    // InternalMCEntity.g:2233:1: rule__NBTEntry__Group__0 : rule__NBTEntry__Group__0__Impl rule__NBTEntry__Group__1 ;
    public final void rule__NBTEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2237:1: ( rule__NBTEntry__Group__0__Impl rule__NBTEntry__Group__1 )
            // InternalMCEntity.g:2238:2: rule__NBTEntry__Group__0__Impl rule__NBTEntry__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NBTEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__0"


    // $ANTLR start "rule__NBTEntry__Group__0__Impl"
    // InternalMCEntity.g:2245:1: rule__NBTEntry__Group__0__Impl : ( ( rule__NBTEntry__KeyAssignment_0 ) ) ;
    public final void rule__NBTEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2249:1: ( ( ( rule__NBTEntry__KeyAssignment_0 ) ) )
            // InternalMCEntity.g:2250:1: ( ( rule__NBTEntry__KeyAssignment_0 ) )
            {
            // InternalMCEntity.g:2250:1: ( ( rule__NBTEntry__KeyAssignment_0 ) )
            // InternalMCEntity.g:2251:2: ( rule__NBTEntry__KeyAssignment_0 )
            {
             before(grammarAccess.getNBTEntryAccess().getKeyAssignment_0()); 
            // InternalMCEntity.g:2252:2: ( rule__NBTEntry__KeyAssignment_0 )
            // InternalMCEntity.g:2252:3: rule__NBTEntry__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTEntry__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTEntryAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__0__Impl"


    // $ANTLR start "rule__NBTEntry__Group__1"
    // InternalMCEntity.g:2260:1: rule__NBTEntry__Group__1 : rule__NBTEntry__Group__1__Impl rule__NBTEntry__Group__2 ;
    public final void rule__NBTEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2264:1: ( rule__NBTEntry__Group__1__Impl rule__NBTEntry__Group__2 )
            // InternalMCEntity.g:2265:2: rule__NBTEntry__Group__1__Impl rule__NBTEntry__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NBTEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__1"


    // $ANTLR start "rule__NBTEntry__Group__1__Impl"
    // InternalMCEntity.g:2272:1: rule__NBTEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__NBTEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2276:1: ( ( ':' ) )
            // InternalMCEntity.g:2277:1: ( ':' )
            {
            // InternalMCEntity.g:2277:1: ( ':' )
            // InternalMCEntity.g:2278:2: ':'
            {
             before(grammarAccess.getNBTEntryAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNBTEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__1__Impl"


    // $ANTLR start "rule__NBTEntry__Group__2"
    // InternalMCEntity.g:2287:1: rule__NBTEntry__Group__2 : rule__NBTEntry__Group__2__Impl ;
    public final void rule__NBTEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2291:1: ( rule__NBTEntry__Group__2__Impl )
            // InternalMCEntity.g:2292:2: rule__NBTEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTEntry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__2"


    // $ANTLR start "rule__NBTEntry__Group__2__Impl"
    // InternalMCEntity.g:2298:1: rule__NBTEntry__Group__2__Impl : ( ( rule__NBTEntry__ValueAssignment_2 ) ) ;
    public final void rule__NBTEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2302:1: ( ( ( rule__NBTEntry__ValueAssignment_2 ) ) )
            // InternalMCEntity.g:2303:1: ( ( rule__NBTEntry__ValueAssignment_2 ) )
            {
            // InternalMCEntity.g:2303:1: ( ( rule__NBTEntry__ValueAssignment_2 ) )
            // InternalMCEntity.g:2304:2: ( rule__NBTEntry__ValueAssignment_2 )
            {
             before(grammarAccess.getNBTEntryAccess().getValueAssignment_2()); 
            // InternalMCEntity.g:2305:2: ( rule__NBTEntry__ValueAssignment_2 )
            // InternalMCEntity.g:2305:3: rule__NBTEntry__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NBTEntry__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNBTEntryAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__Group__2__Impl"


    // $ANTLR start "rule__NBTByteArray__Group__0"
    // InternalMCEntity.g:2314:1: rule__NBTByteArray__Group__0 : rule__NBTByteArray__Group__0__Impl rule__NBTByteArray__Group__1 ;
    public final void rule__NBTByteArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2318:1: ( rule__NBTByteArray__Group__0__Impl rule__NBTByteArray__Group__1 )
            // InternalMCEntity.g:2319:2: rule__NBTByteArray__Group__0__Impl rule__NBTByteArray__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NBTByteArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__0"


    // $ANTLR start "rule__NBTByteArray__Group__0__Impl"
    // InternalMCEntity.g:2326:1: rule__NBTByteArray__Group__0__Impl : ( RULE_NBT_BYTE_ARRAY_START ) ;
    public final void rule__NBTByteArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2330:1: ( ( RULE_NBT_BYTE_ARRAY_START ) )
            // InternalMCEntity.g:2331:1: ( RULE_NBT_BYTE_ARRAY_START )
            {
            // InternalMCEntity.g:2331:1: ( RULE_NBT_BYTE_ARRAY_START )
            // InternalMCEntity.g:2332:2: RULE_NBT_BYTE_ARRAY_START
            {
             before(grammarAccess.getNBTByteArrayAccess().getNBT_BYTE_ARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_NBT_BYTE_ARRAY_START,FOLLOW_2); 
             after(grammarAccess.getNBTByteArrayAccess().getNBT_BYTE_ARRAY_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__0__Impl"


    // $ANTLR start "rule__NBTByteArray__Group__1"
    // InternalMCEntity.g:2341:1: rule__NBTByteArray__Group__1 : rule__NBTByteArray__Group__1__Impl rule__NBTByteArray__Group__2 ;
    public final void rule__NBTByteArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2345:1: ( rule__NBTByteArray__Group__1__Impl rule__NBTByteArray__Group__2 )
            // InternalMCEntity.g:2346:2: rule__NBTByteArray__Group__1__Impl rule__NBTByteArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__NBTByteArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__1"


    // $ANTLR start "rule__NBTByteArray__Group__1__Impl"
    // InternalMCEntity.g:2353:1: rule__NBTByteArray__Group__1__Impl : ( () ) ;
    public final void rule__NBTByteArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2357:1: ( ( () ) )
            // InternalMCEntity.g:2358:1: ( () )
            {
            // InternalMCEntity.g:2358:1: ( () )
            // InternalMCEntity.g:2359:2: ()
            {
             before(grammarAccess.getNBTByteArrayAccess().getNBTByteArrayAction_1()); 
            // InternalMCEntity.g:2360:2: ()
            // InternalMCEntity.g:2360:3: 
            {
            }

             after(grammarAccess.getNBTByteArrayAccess().getNBTByteArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__1__Impl"


    // $ANTLR start "rule__NBTByteArray__Group__2"
    // InternalMCEntity.g:2368:1: rule__NBTByteArray__Group__2 : rule__NBTByteArray__Group__2__Impl rule__NBTByteArray__Group__3 ;
    public final void rule__NBTByteArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2372:1: ( rule__NBTByteArray__Group__2__Impl rule__NBTByteArray__Group__3 )
            // InternalMCEntity.g:2373:2: rule__NBTByteArray__Group__2__Impl rule__NBTByteArray__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NBTByteArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__2"


    // $ANTLR start "rule__NBTByteArray__Group__2__Impl"
    // InternalMCEntity.g:2380:1: rule__NBTByteArray__Group__2__Impl : ( ( rule__NBTByteArray__Group_2__0 )? ) ;
    public final void rule__NBTByteArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2384:1: ( ( ( rule__NBTByteArray__Group_2__0 )? ) )
            // InternalMCEntity.g:2385:1: ( ( rule__NBTByteArray__Group_2__0 )? )
            {
            // InternalMCEntity.g:2385:1: ( ( rule__NBTByteArray__Group_2__0 )? )
            // InternalMCEntity.g:2386:2: ( rule__NBTByteArray__Group_2__0 )?
            {
             before(grammarAccess.getNBTByteArrayAccess().getGroup_2()); 
            // InternalMCEntity.g:2387:2: ( rule__NBTByteArray__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BYTE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMCEntity.g:2387:3: rule__NBTByteArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTByteArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTByteArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__2__Impl"


    // $ANTLR start "rule__NBTByteArray__Group__3"
    // InternalMCEntity.g:2395:1: rule__NBTByteArray__Group__3 : rule__NBTByteArray__Group__3__Impl ;
    public final void rule__NBTByteArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2399:1: ( rule__NBTByteArray__Group__3__Impl )
            // InternalMCEntity.g:2400:2: rule__NBTByteArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__3"


    // $ANTLR start "rule__NBTByteArray__Group__3__Impl"
    // InternalMCEntity.g:2406:1: rule__NBTByteArray__Group__3__Impl : ( ']' ) ;
    public final void rule__NBTByteArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2410:1: ( ( ']' ) )
            // InternalMCEntity.g:2411:1: ( ']' )
            {
            // InternalMCEntity.g:2411:1: ( ']' )
            // InternalMCEntity.g:2412:2: ']'
            {
             before(grammarAccess.getNBTByteArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNBTByteArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group__3__Impl"


    // $ANTLR start "rule__NBTByteArray__Group_2__0"
    // InternalMCEntity.g:2422:1: rule__NBTByteArray__Group_2__0 : rule__NBTByteArray__Group_2__0__Impl rule__NBTByteArray__Group_2__1 ;
    public final void rule__NBTByteArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2426:1: ( rule__NBTByteArray__Group_2__0__Impl rule__NBTByteArray__Group_2__1 )
            // InternalMCEntity.g:2427:2: rule__NBTByteArray__Group_2__0__Impl rule__NBTByteArray__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTByteArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__0"


    // $ANTLR start "rule__NBTByteArray__Group_2__0__Impl"
    // InternalMCEntity.g:2434:1: rule__NBTByteArray__Group_2__0__Impl : ( ( rule__NBTByteArray__ElementsAssignment_2_0 ) ) ;
    public final void rule__NBTByteArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2438:1: ( ( ( rule__NBTByteArray__ElementsAssignment_2_0 ) ) )
            // InternalMCEntity.g:2439:1: ( ( rule__NBTByteArray__ElementsAssignment_2_0 ) )
            {
            // InternalMCEntity.g:2439:1: ( ( rule__NBTByteArray__ElementsAssignment_2_0 ) )
            // InternalMCEntity.g:2440:2: ( rule__NBTByteArray__ElementsAssignment_2_0 )
            {
             before(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_0()); 
            // InternalMCEntity.g:2441:2: ( rule__NBTByteArray__ElementsAssignment_2_0 )
            // InternalMCEntity.g:2441:3: rule__NBTByteArray__ElementsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__ElementsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__0__Impl"


    // $ANTLR start "rule__NBTByteArray__Group_2__1"
    // InternalMCEntity.g:2449:1: rule__NBTByteArray__Group_2__1 : rule__NBTByteArray__Group_2__1__Impl rule__NBTByteArray__Group_2__2 ;
    public final void rule__NBTByteArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2453:1: ( rule__NBTByteArray__Group_2__1__Impl rule__NBTByteArray__Group_2__2 )
            // InternalMCEntity.g:2454:2: rule__NBTByteArray__Group_2__1__Impl rule__NBTByteArray__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTByteArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__1"


    // $ANTLR start "rule__NBTByteArray__Group_2__1__Impl"
    // InternalMCEntity.g:2461:1: rule__NBTByteArray__Group_2__1__Impl : ( ( rule__NBTByteArray__Group_2_1__0 )* ) ;
    public final void rule__NBTByteArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2465:1: ( ( ( rule__NBTByteArray__Group_2_1__0 )* ) )
            // InternalMCEntity.g:2466:1: ( ( rule__NBTByteArray__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:2466:1: ( ( rule__NBTByteArray__Group_2_1__0 )* )
            // InternalMCEntity.g:2467:2: ( rule__NBTByteArray__Group_2_1__0 )*
            {
             before(grammarAccess.getNBTByteArrayAccess().getGroup_2_1()); 
            // InternalMCEntity.g:2468:2: ( rule__NBTByteArray__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_BYTE) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalMCEntity.g:2468:3: rule__NBTByteArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTByteArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getNBTByteArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__1__Impl"


    // $ANTLR start "rule__NBTByteArray__Group_2__2"
    // InternalMCEntity.g:2476:1: rule__NBTByteArray__Group_2__2 : rule__NBTByteArray__Group_2__2__Impl ;
    public final void rule__NBTByteArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2480:1: ( rule__NBTByteArray__Group_2__2__Impl )
            // InternalMCEntity.g:2481:2: rule__NBTByteArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__2"


    // $ANTLR start "rule__NBTByteArray__Group_2__2__Impl"
    // InternalMCEntity.g:2487:1: rule__NBTByteArray__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTByteArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2491:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:2492:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:2492:1: ( ( ',' )? )
            // InternalMCEntity.g:2493:2: ( ',' )?
            {
             before(grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:2494:2: ( ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMCEntity.g:2494:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2__2__Impl"


    // $ANTLR start "rule__NBTByteArray__Group_2_1__0"
    // InternalMCEntity.g:2503:1: rule__NBTByteArray__Group_2_1__0 : rule__NBTByteArray__Group_2_1__0__Impl rule__NBTByteArray__Group_2_1__1 ;
    public final void rule__NBTByteArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2507:1: ( rule__NBTByteArray__Group_2_1__0__Impl rule__NBTByteArray__Group_2_1__1 )
            // InternalMCEntity.g:2508:2: rule__NBTByteArray__Group_2_1__0__Impl rule__NBTByteArray__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__NBTByteArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2_1__0"


    // $ANTLR start "rule__NBTByteArray__Group_2_1__0__Impl"
    // InternalMCEntity.g:2515:1: rule__NBTByteArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__NBTByteArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2519:1: ( ( ',' ) )
            // InternalMCEntity.g:2520:1: ( ',' )
            {
            // InternalMCEntity.g:2520:1: ( ',' )
            // InternalMCEntity.g:2521:2: ','
            {
             before(grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTByteArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__NBTByteArray__Group_2_1__1"
    // InternalMCEntity.g:2530:1: rule__NBTByteArray__Group_2_1__1 : rule__NBTByteArray__Group_2_1__1__Impl ;
    public final void rule__NBTByteArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2534:1: ( rule__NBTByteArray__Group_2_1__1__Impl )
            // InternalMCEntity.g:2535:2: rule__NBTByteArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2_1__1"


    // $ANTLR start "rule__NBTByteArray__Group_2_1__1__Impl"
    // InternalMCEntity.g:2541:1: rule__NBTByteArray__Group_2_1__1__Impl : ( ( rule__NBTByteArray__ElementsAssignment_2_1_1 ) ) ;
    public final void rule__NBTByteArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2545:1: ( ( ( rule__NBTByteArray__ElementsAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:2546:1: ( ( rule__NBTByteArray__ElementsAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:2546:1: ( ( rule__NBTByteArray__ElementsAssignment_2_1_1 ) )
            // InternalMCEntity.g:2547:2: ( rule__NBTByteArray__ElementsAssignment_2_1_1 )
            {
             before(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_1_1()); 
            // InternalMCEntity.g:2548:2: ( rule__NBTByteArray__ElementsAssignment_2_1_1 )
            // InternalMCEntity.g:2548:3: rule__NBTByteArray__ElementsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTByteArray__ElementsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTByteArrayAccess().getElementsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__NBTLongArray__Group__0"
    // InternalMCEntity.g:2557:1: rule__NBTLongArray__Group__0 : rule__NBTLongArray__Group__0__Impl rule__NBTLongArray__Group__1 ;
    public final void rule__NBTLongArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2561:1: ( rule__NBTLongArray__Group__0__Impl rule__NBTLongArray__Group__1 )
            // InternalMCEntity.g:2562:2: rule__NBTLongArray__Group__0__Impl rule__NBTLongArray__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__NBTLongArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__0"


    // $ANTLR start "rule__NBTLongArray__Group__0__Impl"
    // InternalMCEntity.g:2569:1: rule__NBTLongArray__Group__0__Impl : ( RULE_NBT_LONG_ARRAY_START ) ;
    public final void rule__NBTLongArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2573:1: ( ( RULE_NBT_LONG_ARRAY_START ) )
            // InternalMCEntity.g:2574:1: ( RULE_NBT_LONG_ARRAY_START )
            {
            // InternalMCEntity.g:2574:1: ( RULE_NBT_LONG_ARRAY_START )
            // InternalMCEntity.g:2575:2: RULE_NBT_LONG_ARRAY_START
            {
             before(grammarAccess.getNBTLongArrayAccess().getNBT_LONG_ARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_NBT_LONG_ARRAY_START,FOLLOW_2); 
             after(grammarAccess.getNBTLongArrayAccess().getNBT_LONG_ARRAY_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__0__Impl"


    // $ANTLR start "rule__NBTLongArray__Group__1"
    // InternalMCEntity.g:2584:1: rule__NBTLongArray__Group__1 : rule__NBTLongArray__Group__1__Impl rule__NBTLongArray__Group__2 ;
    public final void rule__NBTLongArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2588:1: ( rule__NBTLongArray__Group__1__Impl rule__NBTLongArray__Group__2 )
            // InternalMCEntity.g:2589:2: rule__NBTLongArray__Group__1__Impl rule__NBTLongArray__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NBTLongArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__1"


    // $ANTLR start "rule__NBTLongArray__Group__1__Impl"
    // InternalMCEntity.g:2596:1: rule__NBTLongArray__Group__1__Impl : ( () ) ;
    public final void rule__NBTLongArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2600:1: ( ( () ) )
            // InternalMCEntity.g:2601:1: ( () )
            {
            // InternalMCEntity.g:2601:1: ( () )
            // InternalMCEntity.g:2602:2: ()
            {
             before(grammarAccess.getNBTLongArrayAccess().getNBTLongArrayAction_1()); 
            // InternalMCEntity.g:2603:2: ()
            // InternalMCEntity.g:2603:3: 
            {
            }

             after(grammarAccess.getNBTLongArrayAccess().getNBTLongArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__1__Impl"


    // $ANTLR start "rule__NBTLongArray__Group__2"
    // InternalMCEntity.g:2611:1: rule__NBTLongArray__Group__2 : rule__NBTLongArray__Group__2__Impl rule__NBTLongArray__Group__3 ;
    public final void rule__NBTLongArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2615:1: ( rule__NBTLongArray__Group__2__Impl rule__NBTLongArray__Group__3 )
            // InternalMCEntity.g:2616:2: rule__NBTLongArray__Group__2__Impl rule__NBTLongArray__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NBTLongArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__2"


    // $ANTLR start "rule__NBTLongArray__Group__2__Impl"
    // InternalMCEntity.g:2623:1: rule__NBTLongArray__Group__2__Impl : ( ( rule__NBTLongArray__Group_2__0 )? ) ;
    public final void rule__NBTLongArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2627:1: ( ( ( rule__NBTLongArray__Group_2__0 )? ) )
            // InternalMCEntity.g:2628:1: ( ( rule__NBTLongArray__Group_2__0 )? )
            {
            // InternalMCEntity.g:2628:1: ( ( rule__NBTLongArray__Group_2__0 )? )
            // InternalMCEntity.g:2629:2: ( rule__NBTLongArray__Group_2__0 )?
            {
             before(grammarAccess.getNBTLongArrayAccess().getGroup_2()); 
            // InternalMCEntity.g:2630:2: ( rule__NBTLongArray__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LONG) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMCEntity.g:2630:3: rule__NBTLongArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTLongArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTLongArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__2__Impl"


    // $ANTLR start "rule__NBTLongArray__Group__3"
    // InternalMCEntity.g:2638:1: rule__NBTLongArray__Group__3 : rule__NBTLongArray__Group__3__Impl ;
    public final void rule__NBTLongArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2642:1: ( rule__NBTLongArray__Group__3__Impl )
            // InternalMCEntity.g:2643:2: rule__NBTLongArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__3"


    // $ANTLR start "rule__NBTLongArray__Group__3__Impl"
    // InternalMCEntity.g:2649:1: rule__NBTLongArray__Group__3__Impl : ( ']' ) ;
    public final void rule__NBTLongArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2653:1: ( ( ']' ) )
            // InternalMCEntity.g:2654:1: ( ']' )
            {
            // InternalMCEntity.g:2654:1: ( ']' )
            // InternalMCEntity.g:2655:2: ']'
            {
             before(grammarAccess.getNBTLongArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNBTLongArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group__3__Impl"


    // $ANTLR start "rule__NBTLongArray__Group_2__0"
    // InternalMCEntity.g:2665:1: rule__NBTLongArray__Group_2__0 : rule__NBTLongArray__Group_2__0__Impl rule__NBTLongArray__Group_2__1 ;
    public final void rule__NBTLongArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2669:1: ( rule__NBTLongArray__Group_2__0__Impl rule__NBTLongArray__Group_2__1 )
            // InternalMCEntity.g:2670:2: rule__NBTLongArray__Group_2__0__Impl rule__NBTLongArray__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTLongArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__0"


    // $ANTLR start "rule__NBTLongArray__Group_2__0__Impl"
    // InternalMCEntity.g:2677:1: rule__NBTLongArray__Group_2__0__Impl : ( ( rule__NBTLongArray__ElementsAssignment_2_0 ) ) ;
    public final void rule__NBTLongArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2681:1: ( ( ( rule__NBTLongArray__ElementsAssignment_2_0 ) ) )
            // InternalMCEntity.g:2682:1: ( ( rule__NBTLongArray__ElementsAssignment_2_0 ) )
            {
            // InternalMCEntity.g:2682:1: ( ( rule__NBTLongArray__ElementsAssignment_2_0 ) )
            // InternalMCEntity.g:2683:2: ( rule__NBTLongArray__ElementsAssignment_2_0 )
            {
             before(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_0()); 
            // InternalMCEntity.g:2684:2: ( rule__NBTLongArray__ElementsAssignment_2_0 )
            // InternalMCEntity.g:2684:3: rule__NBTLongArray__ElementsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__ElementsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__0__Impl"


    // $ANTLR start "rule__NBTLongArray__Group_2__1"
    // InternalMCEntity.g:2692:1: rule__NBTLongArray__Group_2__1 : rule__NBTLongArray__Group_2__1__Impl rule__NBTLongArray__Group_2__2 ;
    public final void rule__NBTLongArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2696:1: ( rule__NBTLongArray__Group_2__1__Impl rule__NBTLongArray__Group_2__2 )
            // InternalMCEntity.g:2697:2: rule__NBTLongArray__Group_2__1__Impl rule__NBTLongArray__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTLongArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__1"


    // $ANTLR start "rule__NBTLongArray__Group_2__1__Impl"
    // InternalMCEntity.g:2704:1: rule__NBTLongArray__Group_2__1__Impl : ( ( rule__NBTLongArray__Group_2_1__0 )* ) ;
    public final void rule__NBTLongArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2708:1: ( ( ( rule__NBTLongArray__Group_2_1__0 )* ) )
            // InternalMCEntity.g:2709:1: ( ( rule__NBTLongArray__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:2709:1: ( ( rule__NBTLongArray__Group_2_1__0 )* )
            // InternalMCEntity.g:2710:2: ( rule__NBTLongArray__Group_2_1__0 )*
            {
             before(grammarAccess.getNBTLongArrayAccess().getGroup_2_1()); 
            // InternalMCEntity.g:2711:2: ( rule__NBTLongArray__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_LONG) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalMCEntity.g:2711:3: rule__NBTLongArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTLongArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getNBTLongArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__1__Impl"


    // $ANTLR start "rule__NBTLongArray__Group_2__2"
    // InternalMCEntity.g:2719:1: rule__NBTLongArray__Group_2__2 : rule__NBTLongArray__Group_2__2__Impl ;
    public final void rule__NBTLongArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2723:1: ( rule__NBTLongArray__Group_2__2__Impl )
            // InternalMCEntity.g:2724:2: rule__NBTLongArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__2"


    // $ANTLR start "rule__NBTLongArray__Group_2__2__Impl"
    // InternalMCEntity.g:2730:1: rule__NBTLongArray__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTLongArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2734:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:2735:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:2735:1: ( ( ',' )? )
            // InternalMCEntity.g:2736:2: ( ',' )?
            {
             before(grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:2737:2: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMCEntity.g:2737:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2__2__Impl"


    // $ANTLR start "rule__NBTLongArray__Group_2_1__0"
    // InternalMCEntity.g:2746:1: rule__NBTLongArray__Group_2_1__0 : rule__NBTLongArray__Group_2_1__0__Impl rule__NBTLongArray__Group_2_1__1 ;
    public final void rule__NBTLongArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2750:1: ( rule__NBTLongArray__Group_2_1__0__Impl rule__NBTLongArray__Group_2_1__1 )
            // InternalMCEntity.g:2751:2: rule__NBTLongArray__Group_2_1__0__Impl rule__NBTLongArray__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__NBTLongArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2_1__0"


    // $ANTLR start "rule__NBTLongArray__Group_2_1__0__Impl"
    // InternalMCEntity.g:2758:1: rule__NBTLongArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__NBTLongArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2762:1: ( ( ',' ) )
            // InternalMCEntity.g:2763:1: ( ',' )
            {
            // InternalMCEntity.g:2763:1: ( ',' )
            // InternalMCEntity.g:2764:2: ','
            {
             before(grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTLongArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__NBTLongArray__Group_2_1__1"
    // InternalMCEntity.g:2773:1: rule__NBTLongArray__Group_2_1__1 : rule__NBTLongArray__Group_2_1__1__Impl ;
    public final void rule__NBTLongArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2777:1: ( rule__NBTLongArray__Group_2_1__1__Impl )
            // InternalMCEntity.g:2778:2: rule__NBTLongArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2_1__1"


    // $ANTLR start "rule__NBTLongArray__Group_2_1__1__Impl"
    // InternalMCEntity.g:2784:1: rule__NBTLongArray__Group_2_1__1__Impl : ( ( rule__NBTLongArray__ElementsAssignment_2_1_1 ) ) ;
    public final void rule__NBTLongArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2788:1: ( ( ( rule__NBTLongArray__ElementsAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:2789:1: ( ( rule__NBTLongArray__ElementsAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:2789:1: ( ( rule__NBTLongArray__ElementsAssignment_2_1_1 ) )
            // InternalMCEntity.g:2790:2: ( rule__NBTLongArray__ElementsAssignment_2_1_1 )
            {
             before(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_1_1()); 
            // InternalMCEntity.g:2791:2: ( rule__NBTLongArray__ElementsAssignment_2_1_1 )
            // InternalMCEntity.g:2791:3: rule__NBTLongArray__ElementsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTLongArray__ElementsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTLongArrayAccess().getElementsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__NBTIntArray__Group__0"
    // InternalMCEntity.g:2800:1: rule__NBTIntArray__Group__0 : rule__NBTIntArray__Group__0__Impl rule__NBTIntArray__Group__1 ;
    public final void rule__NBTIntArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2804:1: ( rule__NBTIntArray__Group__0__Impl rule__NBTIntArray__Group__1 )
            // InternalMCEntity.g:2805:2: rule__NBTIntArray__Group__0__Impl rule__NBTIntArray__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NBTIntArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__0"


    // $ANTLR start "rule__NBTIntArray__Group__0__Impl"
    // InternalMCEntity.g:2812:1: rule__NBTIntArray__Group__0__Impl : ( RULE_NBT_INT_ARRAY_START ) ;
    public final void rule__NBTIntArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2816:1: ( ( RULE_NBT_INT_ARRAY_START ) )
            // InternalMCEntity.g:2817:1: ( RULE_NBT_INT_ARRAY_START )
            {
            // InternalMCEntity.g:2817:1: ( RULE_NBT_INT_ARRAY_START )
            // InternalMCEntity.g:2818:2: RULE_NBT_INT_ARRAY_START
            {
             before(grammarAccess.getNBTIntArrayAccess().getNBT_INT_ARRAY_STARTTerminalRuleCall_0()); 
            match(input,RULE_NBT_INT_ARRAY_START,FOLLOW_2); 
             after(grammarAccess.getNBTIntArrayAccess().getNBT_INT_ARRAY_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__0__Impl"


    // $ANTLR start "rule__NBTIntArray__Group__1"
    // InternalMCEntity.g:2827:1: rule__NBTIntArray__Group__1 : rule__NBTIntArray__Group__1__Impl rule__NBTIntArray__Group__2 ;
    public final void rule__NBTIntArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2831:1: ( rule__NBTIntArray__Group__1__Impl rule__NBTIntArray__Group__2 )
            // InternalMCEntity.g:2832:2: rule__NBTIntArray__Group__1__Impl rule__NBTIntArray__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__NBTIntArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__1"


    // $ANTLR start "rule__NBTIntArray__Group__1__Impl"
    // InternalMCEntity.g:2839:1: rule__NBTIntArray__Group__1__Impl : ( () ) ;
    public final void rule__NBTIntArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2843:1: ( ( () ) )
            // InternalMCEntity.g:2844:1: ( () )
            {
            // InternalMCEntity.g:2844:1: ( () )
            // InternalMCEntity.g:2845:2: ()
            {
             before(grammarAccess.getNBTIntArrayAccess().getNBTIntArrayAction_1()); 
            // InternalMCEntity.g:2846:2: ()
            // InternalMCEntity.g:2846:3: 
            {
            }

             after(grammarAccess.getNBTIntArrayAccess().getNBTIntArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__1__Impl"


    // $ANTLR start "rule__NBTIntArray__Group__2"
    // InternalMCEntity.g:2854:1: rule__NBTIntArray__Group__2 : rule__NBTIntArray__Group__2__Impl rule__NBTIntArray__Group__3 ;
    public final void rule__NBTIntArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2858:1: ( rule__NBTIntArray__Group__2__Impl rule__NBTIntArray__Group__3 )
            // InternalMCEntity.g:2859:2: rule__NBTIntArray__Group__2__Impl rule__NBTIntArray__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NBTIntArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__2"


    // $ANTLR start "rule__NBTIntArray__Group__2__Impl"
    // InternalMCEntity.g:2866:1: rule__NBTIntArray__Group__2__Impl : ( ( rule__NBTIntArray__Group_2__0 )? ) ;
    public final void rule__NBTIntArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2870:1: ( ( ( rule__NBTIntArray__Group_2__0 )? ) )
            // InternalMCEntity.g:2871:1: ( ( rule__NBTIntArray__Group_2__0 )? )
            {
            // InternalMCEntity.g:2871:1: ( ( rule__NBTIntArray__Group_2__0 )? )
            // InternalMCEntity.g:2872:2: ( rule__NBTIntArray__Group_2__0 )?
            {
             before(grammarAccess.getNBTIntArrayAccess().getGroup_2()); 
            // InternalMCEntity.g:2873:2: ( rule__NBTIntArray__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMCEntity.g:2873:3: rule__NBTIntArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTIntArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTIntArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__2__Impl"


    // $ANTLR start "rule__NBTIntArray__Group__3"
    // InternalMCEntity.g:2881:1: rule__NBTIntArray__Group__3 : rule__NBTIntArray__Group__3__Impl ;
    public final void rule__NBTIntArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2885:1: ( rule__NBTIntArray__Group__3__Impl )
            // InternalMCEntity.g:2886:2: rule__NBTIntArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__3"


    // $ANTLR start "rule__NBTIntArray__Group__3__Impl"
    // InternalMCEntity.g:2892:1: rule__NBTIntArray__Group__3__Impl : ( ']' ) ;
    public final void rule__NBTIntArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2896:1: ( ( ']' ) )
            // InternalMCEntity.g:2897:1: ( ']' )
            {
            // InternalMCEntity.g:2897:1: ( ']' )
            // InternalMCEntity.g:2898:2: ']'
            {
             before(grammarAccess.getNBTIntArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNBTIntArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group__3__Impl"


    // $ANTLR start "rule__NBTIntArray__Group_2__0"
    // InternalMCEntity.g:2908:1: rule__NBTIntArray__Group_2__0 : rule__NBTIntArray__Group_2__0__Impl rule__NBTIntArray__Group_2__1 ;
    public final void rule__NBTIntArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2912:1: ( rule__NBTIntArray__Group_2__0__Impl rule__NBTIntArray__Group_2__1 )
            // InternalMCEntity.g:2913:2: rule__NBTIntArray__Group_2__0__Impl rule__NBTIntArray__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTIntArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__0"


    // $ANTLR start "rule__NBTIntArray__Group_2__0__Impl"
    // InternalMCEntity.g:2920:1: rule__NBTIntArray__Group_2__0__Impl : ( ( rule__NBTIntArray__ElementsAssignment_2_0 ) ) ;
    public final void rule__NBTIntArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2924:1: ( ( ( rule__NBTIntArray__ElementsAssignment_2_0 ) ) )
            // InternalMCEntity.g:2925:1: ( ( rule__NBTIntArray__ElementsAssignment_2_0 ) )
            {
            // InternalMCEntity.g:2925:1: ( ( rule__NBTIntArray__ElementsAssignment_2_0 ) )
            // InternalMCEntity.g:2926:2: ( rule__NBTIntArray__ElementsAssignment_2_0 )
            {
             before(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_0()); 
            // InternalMCEntity.g:2927:2: ( rule__NBTIntArray__ElementsAssignment_2_0 )
            // InternalMCEntity.g:2927:3: rule__NBTIntArray__ElementsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__ElementsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__0__Impl"


    // $ANTLR start "rule__NBTIntArray__Group_2__1"
    // InternalMCEntity.g:2935:1: rule__NBTIntArray__Group_2__1 : rule__NBTIntArray__Group_2__1__Impl rule__NBTIntArray__Group_2__2 ;
    public final void rule__NBTIntArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2939:1: ( rule__NBTIntArray__Group_2__1__Impl rule__NBTIntArray__Group_2__2 )
            // InternalMCEntity.g:2940:2: rule__NBTIntArray__Group_2__1__Impl rule__NBTIntArray__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTIntArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__1"


    // $ANTLR start "rule__NBTIntArray__Group_2__1__Impl"
    // InternalMCEntity.g:2947:1: rule__NBTIntArray__Group_2__1__Impl : ( ( rule__NBTIntArray__Group_2_1__0 )* ) ;
    public final void rule__NBTIntArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2951:1: ( ( ( rule__NBTIntArray__Group_2_1__0 )* ) )
            // InternalMCEntity.g:2952:1: ( ( rule__NBTIntArray__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:2952:1: ( ( rule__NBTIntArray__Group_2_1__0 )* )
            // InternalMCEntity.g:2953:2: ( rule__NBTIntArray__Group_2_1__0 )*
            {
             before(grammarAccess.getNBTIntArrayAccess().getGroup_2_1()); 
            // InternalMCEntity.g:2954:2: ( rule__NBTIntArray__Group_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==41) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_INT) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMCEntity.g:2954:3: rule__NBTIntArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTIntArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getNBTIntArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__1__Impl"


    // $ANTLR start "rule__NBTIntArray__Group_2__2"
    // InternalMCEntity.g:2962:1: rule__NBTIntArray__Group_2__2 : rule__NBTIntArray__Group_2__2__Impl ;
    public final void rule__NBTIntArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2966:1: ( rule__NBTIntArray__Group_2__2__Impl )
            // InternalMCEntity.g:2967:2: rule__NBTIntArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__2"


    // $ANTLR start "rule__NBTIntArray__Group_2__2__Impl"
    // InternalMCEntity.g:2973:1: rule__NBTIntArray__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTIntArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2977:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:2978:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:2978:1: ( ( ',' )? )
            // InternalMCEntity.g:2979:2: ( ',' )?
            {
             before(grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:2980:2: ( ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMCEntity.g:2980:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2__2__Impl"


    // $ANTLR start "rule__NBTIntArray__Group_2_1__0"
    // InternalMCEntity.g:2989:1: rule__NBTIntArray__Group_2_1__0 : rule__NBTIntArray__Group_2_1__0__Impl rule__NBTIntArray__Group_2_1__1 ;
    public final void rule__NBTIntArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:2993:1: ( rule__NBTIntArray__Group_2_1__0__Impl rule__NBTIntArray__Group_2_1__1 )
            // InternalMCEntity.g:2994:2: rule__NBTIntArray__Group_2_1__0__Impl rule__NBTIntArray__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__NBTIntArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2_1__0"


    // $ANTLR start "rule__NBTIntArray__Group_2_1__0__Impl"
    // InternalMCEntity.g:3001:1: rule__NBTIntArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__NBTIntArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3005:1: ( ( ',' ) )
            // InternalMCEntity.g:3006:1: ( ',' )
            {
            // InternalMCEntity.g:3006:1: ( ',' )
            // InternalMCEntity.g:3007:2: ','
            {
             before(grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTIntArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__NBTIntArray__Group_2_1__1"
    // InternalMCEntity.g:3016:1: rule__NBTIntArray__Group_2_1__1 : rule__NBTIntArray__Group_2_1__1__Impl ;
    public final void rule__NBTIntArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3020:1: ( rule__NBTIntArray__Group_2_1__1__Impl )
            // InternalMCEntity.g:3021:2: rule__NBTIntArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2_1__1"


    // $ANTLR start "rule__NBTIntArray__Group_2_1__1__Impl"
    // InternalMCEntity.g:3027:1: rule__NBTIntArray__Group_2_1__1__Impl : ( ( rule__NBTIntArray__ElementsAssignment_2_1_1 ) ) ;
    public final void rule__NBTIntArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3031:1: ( ( ( rule__NBTIntArray__ElementsAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:3032:1: ( ( rule__NBTIntArray__ElementsAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:3032:1: ( ( rule__NBTIntArray__ElementsAssignment_2_1_1 ) )
            // InternalMCEntity.g:3033:2: ( rule__NBTIntArray__ElementsAssignment_2_1_1 )
            {
             before(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_1_1()); 
            // InternalMCEntity.g:3034:2: ( rule__NBTIntArray__ElementsAssignment_2_1_1 )
            // InternalMCEntity.g:3034:3: rule__NBTIntArray__ElementsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTIntArray__ElementsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTIntArrayAccess().getElementsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group__0"
    // InternalMCEntity.g:3043:1: rule__NBTArray__Group__0 : rule__NBTArray__Group__0__Impl rule__NBTArray__Group__1 ;
    public final void rule__NBTArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3047:1: ( rule__NBTArray__Group__0__Impl rule__NBTArray__Group__1 )
            // InternalMCEntity.g:3048:2: rule__NBTArray__Group__0__Impl rule__NBTArray__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__NBTArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__0"


    // $ANTLR start "rule__NBTArray__Group__0__Impl"
    // InternalMCEntity.g:3055:1: rule__NBTArray__Group__0__Impl : ( '[' ) ;
    public final void rule__NBTArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3059:1: ( ( '[' ) )
            // InternalMCEntity.g:3060:1: ( '[' )
            {
            // InternalMCEntity.g:3060:1: ( '[' )
            // InternalMCEntity.g:3061:2: '['
            {
             before(grammarAccess.getNBTArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__0__Impl"


    // $ANTLR start "rule__NBTArray__Group__1"
    // InternalMCEntity.g:3070:1: rule__NBTArray__Group__1 : rule__NBTArray__Group__1__Impl rule__NBTArray__Group__2 ;
    public final void rule__NBTArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3074:1: ( rule__NBTArray__Group__1__Impl rule__NBTArray__Group__2 )
            // InternalMCEntity.g:3075:2: rule__NBTArray__Group__1__Impl rule__NBTArray__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__NBTArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__1"


    // $ANTLR start "rule__NBTArray__Group__1__Impl"
    // InternalMCEntity.g:3082:1: rule__NBTArray__Group__1__Impl : ( () ) ;
    public final void rule__NBTArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3086:1: ( ( () ) )
            // InternalMCEntity.g:3087:1: ( () )
            {
            // InternalMCEntity.g:3087:1: ( () )
            // InternalMCEntity.g:3088:2: ()
            {
             before(grammarAccess.getNBTArrayAccess().getNBTArrayAction_1()); 
            // InternalMCEntity.g:3089:2: ()
            // InternalMCEntity.g:3089:3: 
            {
            }

             after(grammarAccess.getNBTArrayAccess().getNBTArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__1__Impl"


    // $ANTLR start "rule__NBTArray__Group__2"
    // InternalMCEntity.g:3097:1: rule__NBTArray__Group__2 : rule__NBTArray__Group__2__Impl rule__NBTArray__Group__3 ;
    public final void rule__NBTArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3101:1: ( rule__NBTArray__Group__2__Impl rule__NBTArray__Group__3 )
            // InternalMCEntity.g:3102:2: rule__NBTArray__Group__2__Impl rule__NBTArray__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__NBTArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__2"


    // $ANTLR start "rule__NBTArray__Group__2__Impl"
    // InternalMCEntity.g:3109:1: rule__NBTArray__Group__2__Impl : ( ( rule__NBTArray__Group_2__0 )? ) ;
    public final void rule__NBTArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3113:1: ( ( ( rule__NBTArray__Group_2__0 )? ) )
            // InternalMCEntity.g:3114:1: ( ( rule__NBTArray__Group_2__0 )? )
            {
            // InternalMCEntity.g:3114:1: ( ( rule__NBTArray__Group_2__0 )? )
            // InternalMCEntity.g:3115:2: ( rule__NBTArray__Group_2__0 )?
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2()); 
            // InternalMCEntity.g:3116:2: ( rule__NBTArray__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_JSON_TEXT_BEGIN_OBJ)||LA35_0==RULE_JSON_TEXT_BEGIN_ARRAY||LA35_0==RULE_JSON_TEXT_BEGIN_STR||(LA35_0>=31 && LA35_0<=33)||LA35_0==39||(LA35_0>=44 && LA35_0<=45)||LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMCEntity.g:3116:3: rule__NBTArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__2__Impl"


    // $ANTLR start "rule__NBTArray__Group__3"
    // InternalMCEntity.g:3124:1: rule__NBTArray__Group__3 : rule__NBTArray__Group__3__Impl ;
    public final void rule__NBTArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3128:1: ( rule__NBTArray__Group__3__Impl )
            // InternalMCEntity.g:3129:2: rule__NBTArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__3"


    // $ANTLR start "rule__NBTArray__Group__3__Impl"
    // InternalMCEntity.g:3135:1: rule__NBTArray__Group__3__Impl : ( ']' ) ;
    public final void rule__NBTArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3139:1: ( ( ']' ) )
            // InternalMCEntity.g:3140:1: ( ']' )
            {
            // InternalMCEntity.g:3140:1: ( ']' )
            // InternalMCEntity.g:3141:2: ']'
            {
             before(grammarAccess.getNBTArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group__3__Impl"


    // $ANTLR start "rule__NBTArray__Group_2__0"
    // InternalMCEntity.g:3151:1: rule__NBTArray__Group_2__0 : rule__NBTArray__Group_2__0__Impl rule__NBTArray__Group_2__1 ;
    public final void rule__NBTArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3155:1: ( rule__NBTArray__Group_2__0__Impl rule__NBTArray__Group_2__1 )
            // InternalMCEntity.g:3156:2: rule__NBTArray__Group_2__0__Impl rule__NBTArray__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2__0"


    // $ANTLR start "rule__NBTArray__Group_2__0__Impl"
    // InternalMCEntity.g:3163:1: rule__NBTArray__Group_2__0__Impl : ( ( rule__NBTArray__Alternatives_2_0 ) ) ;
    public final void rule__NBTArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3167:1: ( ( ( rule__NBTArray__Alternatives_2_0 ) ) )
            // InternalMCEntity.g:3168:1: ( ( rule__NBTArray__Alternatives_2_0 ) )
            {
            // InternalMCEntity.g:3168:1: ( ( rule__NBTArray__Alternatives_2_0 ) )
            // InternalMCEntity.g:3169:2: ( rule__NBTArray__Alternatives_2_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getAlternatives_2_0()); 
            // InternalMCEntity.g:3170:2: ( rule__NBTArray__Alternatives_2_0 )
            // InternalMCEntity.g:3170:3: rule__NBTArray__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2__1"
    // InternalMCEntity.g:3178:1: rule__NBTArray__Group_2__1 : rule__NBTArray__Group_2__1__Impl ;
    public final void rule__NBTArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3182:1: ( rule__NBTArray__Group_2__1__Impl )
            // InternalMCEntity.g:3183:2: rule__NBTArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2__1"


    // $ANTLR start "rule__NBTArray__Group_2__1__Impl"
    // InternalMCEntity.g:3189:1: rule__NBTArray__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__NBTArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3193:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:3194:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:3194:1: ( ( ',' )? )
            // InternalMCEntity.g:3195:2: ( ',' )?
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_1()); 
            // InternalMCEntity.g:3196:2: ( ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMCEntity.g:3196:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_0__0"
    // InternalMCEntity.g:3205:1: rule__NBTArray__Group_2_0_0__0 : rule__NBTArray__Group_2_0_0__0__Impl rule__NBTArray__Group_2_0_0__1 ;
    public final void rule__NBTArray__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3209:1: ( rule__NBTArray__Group_2_0_0__0__Impl rule__NBTArray__Group_2_0_0__1 )
            // InternalMCEntity.g:3210:2: rule__NBTArray__Group_2_0_0__0__Impl rule__NBTArray__Group_2_0_0__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_0__0__Impl"
    // InternalMCEntity.g:3217:1: rule__NBTArray__Group_2_0_0__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_0_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3221:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_0_0 ) ) )
            // InternalMCEntity.g:3222:1: ( ( rule__NBTArray__ElementsAssignment_2_0_0_0 ) )
            {
            // InternalMCEntity.g:3222:1: ( ( rule__NBTArray__ElementsAssignment_2_0_0_0 ) )
            // InternalMCEntity.g:3223:2: ( rule__NBTArray__ElementsAssignment_2_0_0_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_0()); 
            // InternalMCEntity.g:3224:2: ( rule__NBTArray__ElementsAssignment_2_0_0_0 )
            // InternalMCEntity.g:3224:3: rule__NBTArray__ElementsAssignment_2_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_0__1"
    // InternalMCEntity.g:3232:1: rule__NBTArray__Group_2_0_0__1 : rule__NBTArray__Group_2_0_0__1__Impl ;
    public final void rule__NBTArray__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3236:1: ( rule__NBTArray__Group_2_0_0__1__Impl )
            // InternalMCEntity.g:3237:2: rule__NBTArray__Group_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_0__1__Impl"
    // InternalMCEntity.g:3243:1: rule__NBTArray__Group_2_0_0__1__Impl : ( ( rule__NBTArray__Group_2_0_0_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3247:1: ( ( ( rule__NBTArray__Group_2_0_0_1__0 )* ) )
            // InternalMCEntity.g:3248:1: ( ( rule__NBTArray__Group_2_0_0_1__0 )* )
            {
            // InternalMCEntity.g:3248:1: ( ( rule__NBTArray__Group_2_0_0_1__0 )* )
            // InternalMCEntity.g:3249:2: ( rule__NBTArray__Group_2_0_0_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_0_1()); 
            // InternalMCEntity.g:3250:2: ( rule__NBTArray__Group_2_0_0_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==41) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==39) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalMCEntity.g:3250:3: rule__NBTArray__Group_2_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_0_1__0"
    // InternalMCEntity.g:3259:1: rule__NBTArray__Group_2_0_0_1__0 : rule__NBTArray__Group_2_0_0_1__0__Impl rule__NBTArray__Group_2_0_0_1__1 ;
    public final void rule__NBTArray__Group_2_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3263:1: ( rule__NBTArray__Group_2_0_0_1__0__Impl rule__NBTArray__Group_2_0_0_1__1 )
            // InternalMCEntity.g:3264:2: rule__NBTArray__Group_2_0_0_1__0__Impl rule__NBTArray__Group_2_0_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__NBTArray__Group_2_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_0_1__0__Impl"
    // InternalMCEntity.g:3271:1: rule__NBTArray__Group_2_0_0_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3275:1: ( ( ',' ) )
            // InternalMCEntity.g:3276:1: ( ',' )
            {
            // InternalMCEntity.g:3276:1: ( ',' )
            // InternalMCEntity.g:3277:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_0_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_0_1__1"
    // InternalMCEntity.g:3286:1: rule__NBTArray__Group_2_0_0_1__1 : rule__NBTArray__Group_2_0_0_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3290:1: ( rule__NBTArray__Group_2_0_0_1__1__Impl )
            // InternalMCEntity.g:3291:2: rule__NBTArray__Group_2_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_0_1__1__Impl"
    // InternalMCEntity.g:3297:1: rule__NBTArray__Group_2_0_0_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3301:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 ) ) )
            // InternalMCEntity.g:3302:1: ( ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 ) )
            {
            // InternalMCEntity.g:3302:1: ( ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 ) )
            // InternalMCEntity.g:3303:2: ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_1_1()); 
            // InternalMCEntity.g:3304:2: ( rule__NBTArray__ElementsAssignment_2_0_0_1_1 )
            // InternalMCEntity.g:3304:3: rule__NBTArray__ElementsAssignment_2_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_0_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_1__0"
    // InternalMCEntity.g:3313:1: rule__NBTArray__Group_2_0_1__0 : rule__NBTArray__Group_2_0_1__0__Impl rule__NBTArray__Group_2_0_1__1 ;
    public final void rule__NBTArray__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3317:1: ( rule__NBTArray__Group_2_0_1__0__Impl rule__NBTArray__Group_2_0_1__1 )
            // InternalMCEntity.g:3318:2: rule__NBTArray__Group_2_0_1__0__Impl rule__NBTArray__Group_2_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_1__0__Impl"
    // InternalMCEntity.g:3325:1: rule__NBTArray__Group_2_0_1__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_1_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3329:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_1_0 ) ) )
            // InternalMCEntity.g:3330:1: ( ( rule__NBTArray__ElementsAssignment_2_0_1_0 ) )
            {
            // InternalMCEntity.g:3330:1: ( ( rule__NBTArray__ElementsAssignment_2_0_1_0 ) )
            // InternalMCEntity.g:3331:2: ( rule__NBTArray__ElementsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_0()); 
            // InternalMCEntity.g:3332:2: ( rule__NBTArray__ElementsAssignment_2_0_1_0 )
            // InternalMCEntity.g:3332:3: rule__NBTArray__ElementsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_1__1"
    // InternalMCEntity.g:3340:1: rule__NBTArray__Group_2_0_1__1 : rule__NBTArray__Group_2_0_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3344:1: ( rule__NBTArray__Group_2_0_1__1__Impl )
            // InternalMCEntity.g:3345:2: rule__NBTArray__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_1__1__Impl"
    // InternalMCEntity.g:3351:1: rule__NBTArray__Group_2_0_1__1__Impl : ( ( rule__NBTArray__Group_2_0_1_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3355:1: ( ( ( rule__NBTArray__Group_2_0_1_1__0 )* ) )
            // InternalMCEntity.g:3356:1: ( ( rule__NBTArray__Group_2_0_1_1__0 )* )
            {
            // InternalMCEntity.g:3356:1: ( ( rule__NBTArray__Group_2_0_1_1__0 )* )
            // InternalMCEntity.g:3357:2: ( rule__NBTArray__Group_2_0_1_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_1_1()); 
            // InternalMCEntity.g:3358:2: ( rule__NBTArray__Group_2_0_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==41) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_NBT_BYTE_ARRAY_START) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalMCEntity.g:3358:3: rule__NBTArray__Group_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_1_1__0"
    // InternalMCEntity.g:3367:1: rule__NBTArray__Group_2_0_1_1__0 : rule__NBTArray__Group_2_0_1_1__0__Impl rule__NBTArray__Group_2_0_1_1__1 ;
    public final void rule__NBTArray__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3371:1: ( rule__NBTArray__Group_2_0_1_1__0__Impl rule__NBTArray__Group_2_0_1_1__1 )
            // InternalMCEntity.g:3372:2: rule__NBTArray__Group_2_0_1_1__0__Impl rule__NBTArray__Group_2_0_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__NBTArray__Group_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_1_1__0__Impl"
    // InternalMCEntity.g:3379:1: rule__NBTArray__Group_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3383:1: ( ( ',' ) )
            // InternalMCEntity.g:3384:1: ( ',' )
            {
            // InternalMCEntity.g:3384:1: ( ',' )
            // InternalMCEntity.g:3385:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_1_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_1_1__1"
    // InternalMCEntity.g:3394:1: rule__NBTArray__Group_2_0_1_1__1 : rule__NBTArray__Group_2_0_1_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3398:1: ( rule__NBTArray__Group_2_0_1_1__1__Impl )
            // InternalMCEntity.g:3399:2: rule__NBTArray__Group_2_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_1_1__1__Impl"
    // InternalMCEntity.g:3405:1: rule__NBTArray__Group_2_0_1_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3409:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 ) ) )
            // InternalMCEntity.g:3410:1: ( ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 ) )
            {
            // InternalMCEntity.g:3410:1: ( ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 ) )
            // InternalMCEntity.g:3411:2: ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_1_1()); 
            // InternalMCEntity.g:3412:2: ( rule__NBTArray__ElementsAssignment_2_0_1_1_1 )
            // InternalMCEntity.g:3412:3: rule__NBTArray__ElementsAssignment_2_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_1_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_2__0"
    // InternalMCEntity.g:3421:1: rule__NBTArray__Group_2_0_2__0 : rule__NBTArray__Group_2_0_2__0__Impl rule__NBTArray__Group_2_0_2__1 ;
    public final void rule__NBTArray__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3425:1: ( rule__NBTArray__Group_2_0_2__0__Impl rule__NBTArray__Group_2_0_2__1 )
            // InternalMCEntity.g:3426:2: rule__NBTArray__Group_2_0_2__0__Impl rule__NBTArray__Group_2_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_2__0__Impl"
    // InternalMCEntity.g:3433:1: rule__NBTArray__Group_2_0_2__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_2_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3437:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_2_0 ) ) )
            // InternalMCEntity.g:3438:1: ( ( rule__NBTArray__ElementsAssignment_2_0_2_0 ) )
            {
            // InternalMCEntity.g:3438:1: ( ( rule__NBTArray__ElementsAssignment_2_0_2_0 ) )
            // InternalMCEntity.g:3439:2: ( rule__NBTArray__ElementsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_0()); 
            // InternalMCEntity.g:3440:2: ( rule__NBTArray__ElementsAssignment_2_0_2_0 )
            // InternalMCEntity.g:3440:3: rule__NBTArray__ElementsAssignment_2_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_2__1"
    // InternalMCEntity.g:3448:1: rule__NBTArray__Group_2_0_2__1 : rule__NBTArray__Group_2_0_2__1__Impl ;
    public final void rule__NBTArray__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3452:1: ( rule__NBTArray__Group_2_0_2__1__Impl )
            // InternalMCEntity.g:3453:2: rule__NBTArray__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_2__1__Impl"
    // InternalMCEntity.g:3459:1: rule__NBTArray__Group_2_0_2__1__Impl : ( ( rule__NBTArray__Group_2_0_2_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3463:1: ( ( ( rule__NBTArray__Group_2_0_2_1__0 )* ) )
            // InternalMCEntity.g:3464:1: ( ( rule__NBTArray__Group_2_0_2_1__0 )* )
            {
            // InternalMCEntity.g:3464:1: ( ( rule__NBTArray__Group_2_0_2_1__0 )* )
            // InternalMCEntity.g:3465:2: ( rule__NBTArray__Group_2_0_2_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_2_1()); 
            // InternalMCEntity.g:3466:2: ( rule__NBTArray__Group_2_0_2_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==41) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==RULE_NBT_LONG_ARRAY_START) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalMCEntity.g:3466:3: rule__NBTArray__Group_2_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_2_1__0"
    // InternalMCEntity.g:3475:1: rule__NBTArray__Group_2_0_2_1__0 : rule__NBTArray__Group_2_0_2_1__0__Impl rule__NBTArray__Group_2_0_2_1__1 ;
    public final void rule__NBTArray__Group_2_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3479:1: ( rule__NBTArray__Group_2_0_2_1__0__Impl rule__NBTArray__Group_2_0_2_1__1 )
            // InternalMCEntity.g:3480:2: rule__NBTArray__Group_2_0_2_1__0__Impl rule__NBTArray__Group_2_0_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__NBTArray__Group_2_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_2_1__0__Impl"
    // InternalMCEntity.g:3487:1: rule__NBTArray__Group_2_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3491:1: ( ( ',' ) )
            // InternalMCEntity.g:3492:1: ( ',' )
            {
            // InternalMCEntity.g:3492:1: ( ',' )
            // InternalMCEntity.g:3493:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_2_1__1"
    // InternalMCEntity.g:3502:1: rule__NBTArray__Group_2_0_2_1__1 : rule__NBTArray__Group_2_0_2_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3506:1: ( rule__NBTArray__Group_2_0_2_1__1__Impl )
            // InternalMCEntity.g:3507:2: rule__NBTArray__Group_2_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_2_1__1__Impl"
    // InternalMCEntity.g:3513:1: rule__NBTArray__Group_2_0_2_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3517:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 ) ) )
            // InternalMCEntity.g:3518:1: ( ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 ) )
            {
            // InternalMCEntity.g:3518:1: ( ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 ) )
            // InternalMCEntity.g:3519:2: ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_1_1()); 
            // InternalMCEntity.g:3520:2: ( rule__NBTArray__ElementsAssignment_2_0_2_1_1 )
            // InternalMCEntity.g:3520:3: rule__NBTArray__ElementsAssignment_2_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_2_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_3__0"
    // InternalMCEntity.g:3529:1: rule__NBTArray__Group_2_0_3__0 : rule__NBTArray__Group_2_0_3__0__Impl rule__NBTArray__Group_2_0_3__1 ;
    public final void rule__NBTArray__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3533:1: ( rule__NBTArray__Group_2_0_3__0__Impl rule__NBTArray__Group_2_0_3__1 )
            // InternalMCEntity.g:3534:2: rule__NBTArray__Group_2_0_3__0__Impl rule__NBTArray__Group_2_0_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_3__0__Impl"
    // InternalMCEntity.g:3541:1: rule__NBTArray__Group_2_0_3__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_3_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3545:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_3_0 ) ) )
            // InternalMCEntity.g:3546:1: ( ( rule__NBTArray__ElementsAssignment_2_0_3_0 ) )
            {
            // InternalMCEntity.g:3546:1: ( ( rule__NBTArray__ElementsAssignment_2_0_3_0 ) )
            // InternalMCEntity.g:3547:2: ( rule__NBTArray__ElementsAssignment_2_0_3_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_0()); 
            // InternalMCEntity.g:3548:2: ( rule__NBTArray__ElementsAssignment_2_0_3_0 )
            // InternalMCEntity.g:3548:3: rule__NBTArray__ElementsAssignment_2_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_3__1"
    // InternalMCEntity.g:3556:1: rule__NBTArray__Group_2_0_3__1 : rule__NBTArray__Group_2_0_3__1__Impl ;
    public final void rule__NBTArray__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3560:1: ( rule__NBTArray__Group_2_0_3__1__Impl )
            // InternalMCEntity.g:3561:2: rule__NBTArray__Group_2_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_3__1__Impl"
    // InternalMCEntity.g:3567:1: rule__NBTArray__Group_2_0_3__1__Impl : ( ( rule__NBTArray__Group_2_0_3_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3571:1: ( ( ( rule__NBTArray__Group_2_0_3_1__0 )* ) )
            // InternalMCEntity.g:3572:1: ( ( rule__NBTArray__Group_2_0_3_1__0 )* )
            {
            // InternalMCEntity.g:3572:1: ( ( rule__NBTArray__Group_2_0_3_1__0 )* )
            // InternalMCEntity.g:3573:2: ( rule__NBTArray__Group_2_0_3_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_3_1()); 
            // InternalMCEntity.g:3574:2: ( rule__NBTArray__Group_2_0_3_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==41) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==RULE_NBT_INT_ARRAY_START) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalMCEntity.g:3574:3: rule__NBTArray__Group_2_0_3_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_3_1__0"
    // InternalMCEntity.g:3583:1: rule__NBTArray__Group_2_0_3_1__0 : rule__NBTArray__Group_2_0_3_1__0__Impl rule__NBTArray__Group_2_0_3_1__1 ;
    public final void rule__NBTArray__Group_2_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3587:1: ( rule__NBTArray__Group_2_0_3_1__0__Impl rule__NBTArray__Group_2_0_3_1__1 )
            // InternalMCEntity.g:3588:2: rule__NBTArray__Group_2_0_3_1__0__Impl rule__NBTArray__Group_2_0_3_1__1
            {
            pushFollow(FOLLOW_19);
            rule__NBTArray__Group_2_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_3_1__0__Impl"
    // InternalMCEntity.g:3595:1: rule__NBTArray__Group_2_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3599:1: ( ( ',' ) )
            // InternalMCEntity.g:3600:1: ( ',' )
            {
            // InternalMCEntity.g:3600:1: ( ',' )
            // InternalMCEntity.g:3601:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_3_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_3_1__1"
    // InternalMCEntity.g:3610:1: rule__NBTArray__Group_2_0_3_1__1 : rule__NBTArray__Group_2_0_3_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3614:1: ( rule__NBTArray__Group_2_0_3_1__1__Impl )
            // InternalMCEntity.g:3615:2: rule__NBTArray__Group_2_0_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_3_1__1__Impl"
    // InternalMCEntity.g:3621:1: rule__NBTArray__Group_2_0_3_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3625:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 ) ) )
            // InternalMCEntity.g:3626:1: ( ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 ) )
            {
            // InternalMCEntity.g:3626:1: ( ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 ) )
            // InternalMCEntity.g:3627:2: ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_1_1()); 
            // InternalMCEntity.g:3628:2: ( rule__NBTArray__ElementsAssignment_2_0_3_1_1 )
            // InternalMCEntity.g:3628:3: rule__NBTArray__ElementsAssignment_2_0_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_3_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_4__0"
    // InternalMCEntity.g:3637:1: rule__NBTArray__Group_2_0_4__0 : rule__NBTArray__Group_2_0_4__0__Impl rule__NBTArray__Group_2_0_4__1 ;
    public final void rule__NBTArray__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3641:1: ( rule__NBTArray__Group_2_0_4__0__Impl rule__NBTArray__Group_2_0_4__1 )
            // InternalMCEntity.g:3642:2: rule__NBTArray__Group_2_0_4__0__Impl rule__NBTArray__Group_2_0_4__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_4__0__Impl"
    // InternalMCEntity.g:3649:1: rule__NBTArray__Group_2_0_4__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_4_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3653:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_4_0 ) ) )
            // InternalMCEntity.g:3654:1: ( ( rule__NBTArray__ElementsAssignment_2_0_4_0 ) )
            {
            // InternalMCEntity.g:3654:1: ( ( rule__NBTArray__ElementsAssignment_2_0_4_0 ) )
            // InternalMCEntity.g:3655:2: ( rule__NBTArray__ElementsAssignment_2_0_4_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_0()); 
            // InternalMCEntity.g:3656:2: ( rule__NBTArray__ElementsAssignment_2_0_4_0 )
            // InternalMCEntity.g:3656:3: rule__NBTArray__ElementsAssignment_2_0_4_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_4__1"
    // InternalMCEntity.g:3664:1: rule__NBTArray__Group_2_0_4__1 : rule__NBTArray__Group_2_0_4__1__Impl ;
    public final void rule__NBTArray__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3668:1: ( rule__NBTArray__Group_2_0_4__1__Impl )
            // InternalMCEntity.g:3669:2: rule__NBTArray__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_4__1__Impl"
    // InternalMCEntity.g:3675:1: rule__NBTArray__Group_2_0_4__1__Impl : ( ( rule__NBTArray__Group_2_0_4_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3679:1: ( ( ( rule__NBTArray__Group_2_0_4_1__0 )* ) )
            // InternalMCEntity.g:3680:1: ( ( rule__NBTArray__Group_2_0_4_1__0 )* )
            {
            // InternalMCEntity.g:3680:1: ( ( rule__NBTArray__Group_2_0_4_1__0 )* )
            // InternalMCEntity.g:3681:2: ( rule__NBTArray__Group_2_0_4_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_4_1()); 
            // InternalMCEntity.g:3682:2: ( rule__NBTArray__Group_2_0_4_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==41) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==44) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalMCEntity.g:3682:3: rule__NBTArray__Group_2_0_4_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_4_1__0"
    // InternalMCEntity.g:3691:1: rule__NBTArray__Group_2_0_4_1__0 : rule__NBTArray__Group_2_0_4_1__0__Impl rule__NBTArray__Group_2_0_4_1__1 ;
    public final void rule__NBTArray__Group_2_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3695:1: ( rule__NBTArray__Group_2_0_4_1__0__Impl rule__NBTArray__Group_2_0_4_1__1 )
            // InternalMCEntity.g:3696:2: rule__NBTArray__Group_2_0_4_1__0__Impl rule__NBTArray__Group_2_0_4_1__1
            {
            pushFollow(FOLLOW_20);
            rule__NBTArray__Group_2_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_4_1__0__Impl"
    // InternalMCEntity.g:3703:1: rule__NBTArray__Group_2_0_4_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3707:1: ( ( ',' ) )
            // InternalMCEntity.g:3708:1: ( ',' )
            {
            // InternalMCEntity.g:3708:1: ( ',' )
            // InternalMCEntity.g:3709:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_4_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_4_1__1"
    // InternalMCEntity.g:3718:1: rule__NBTArray__Group_2_0_4_1__1 : rule__NBTArray__Group_2_0_4_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3722:1: ( rule__NBTArray__Group_2_0_4_1__1__Impl )
            // InternalMCEntity.g:3723:2: rule__NBTArray__Group_2_0_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_4_1__1__Impl"
    // InternalMCEntity.g:3729:1: rule__NBTArray__Group_2_0_4_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3733:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 ) ) )
            // InternalMCEntity.g:3734:1: ( ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 ) )
            {
            // InternalMCEntity.g:3734:1: ( ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 ) )
            // InternalMCEntity.g:3735:2: ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_1_1()); 
            // InternalMCEntity.g:3736:2: ( rule__NBTArray__ElementsAssignment_2_0_4_1_1 )
            // InternalMCEntity.g:3736:3: rule__NBTArray__ElementsAssignment_2_0_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_4_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_5__0"
    // InternalMCEntity.g:3745:1: rule__NBTArray__Group_2_0_5__0 : rule__NBTArray__Group_2_0_5__0__Impl rule__NBTArray__Group_2_0_5__1 ;
    public final void rule__NBTArray__Group_2_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3749:1: ( rule__NBTArray__Group_2_0_5__0__Impl rule__NBTArray__Group_2_0_5__1 )
            // InternalMCEntity.g:3750:2: rule__NBTArray__Group_2_0_5__0__Impl rule__NBTArray__Group_2_0_5__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_5__0__Impl"
    // InternalMCEntity.g:3757:1: rule__NBTArray__Group_2_0_5__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_5_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3761:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_5_0 ) ) )
            // InternalMCEntity.g:3762:1: ( ( rule__NBTArray__ElementsAssignment_2_0_5_0 ) )
            {
            // InternalMCEntity.g:3762:1: ( ( rule__NBTArray__ElementsAssignment_2_0_5_0 ) )
            // InternalMCEntity.g:3763:2: ( rule__NBTArray__ElementsAssignment_2_0_5_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_0()); 
            // InternalMCEntity.g:3764:2: ( rule__NBTArray__ElementsAssignment_2_0_5_0 )
            // InternalMCEntity.g:3764:3: rule__NBTArray__ElementsAssignment_2_0_5_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_5_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_5__1"
    // InternalMCEntity.g:3772:1: rule__NBTArray__Group_2_0_5__1 : rule__NBTArray__Group_2_0_5__1__Impl ;
    public final void rule__NBTArray__Group_2_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3776:1: ( rule__NBTArray__Group_2_0_5__1__Impl )
            // InternalMCEntity.g:3777:2: rule__NBTArray__Group_2_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_5__1__Impl"
    // InternalMCEntity.g:3783:1: rule__NBTArray__Group_2_0_5__1__Impl : ( ( rule__NBTArray__Group_2_0_5_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3787:1: ( ( ( rule__NBTArray__Group_2_0_5_1__0 )* ) )
            // InternalMCEntity.g:3788:1: ( ( rule__NBTArray__Group_2_0_5_1__0 )* )
            {
            // InternalMCEntity.g:3788:1: ( ( rule__NBTArray__Group_2_0_5_1__0 )* )
            // InternalMCEntity.g:3789:2: ( rule__NBTArray__Group_2_0_5_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_5_1()); 
            // InternalMCEntity.g:3790:2: ( rule__NBTArray__Group_2_0_5_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==41) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==RULE_INT||LA42_1==RULE_DOUBLE||(LA42_1>=RULE_FLOAT && LA42_1<=RULE_BYTE)||LA42_1==45||LA42_1==49) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalMCEntity.g:3790:3: rule__NBTArray__Group_2_0_5_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_5_1__0"
    // InternalMCEntity.g:3799:1: rule__NBTArray__Group_2_0_5_1__0 : rule__NBTArray__Group_2_0_5_1__0__Impl rule__NBTArray__Group_2_0_5_1__1 ;
    public final void rule__NBTArray__Group_2_0_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3803:1: ( rule__NBTArray__Group_2_0_5_1__0__Impl rule__NBTArray__Group_2_0_5_1__1 )
            // InternalMCEntity.g:3804:2: rule__NBTArray__Group_2_0_5_1__0__Impl rule__NBTArray__Group_2_0_5_1__1
            {
            pushFollow(FOLLOW_21);
            rule__NBTArray__Group_2_0_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_5_1__0__Impl"
    // InternalMCEntity.g:3811:1: rule__NBTArray__Group_2_0_5_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3815:1: ( ( ',' ) )
            // InternalMCEntity.g:3816:1: ( ',' )
            {
            // InternalMCEntity.g:3816:1: ( ',' )
            // InternalMCEntity.g:3817:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_5_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_5_1__1"
    // InternalMCEntity.g:3826:1: rule__NBTArray__Group_2_0_5_1__1 : rule__NBTArray__Group_2_0_5_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3830:1: ( rule__NBTArray__Group_2_0_5_1__1__Impl )
            // InternalMCEntity.g:3831:2: rule__NBTArray__Group_2_0_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_5_1__1__Impl"
    // InternalMCEntity.g:3837:1: rule__NBTArray__Group_2_0_5_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3841:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 ) ) )
            // InternalMCEntity.g:3842:1: ( ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 ) )
            {
            // InternalMCEntity.g:3842:1: ( ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 ) )
            // InternalMCEntity.g:3843:2: ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_1_1()); 
            // InternalMCEntity.g:3844:2: ( rule__NBTArray__ElementsAssignment_2_0_5_1_1 )
            // InternalMCEntity.g:3844:3: rule__NBTArray__ElementsAssignment_2_0_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_5_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_6__0"
    // InternalMCEntity.g:3853:1: rule__NBTArray__Group_2_0_6__0 : rule__NBTArray__Group_2_0_6__0__Impl rule__NBTArray__Group_2_0_6__1 ;
    public final void rule__NBTArray__Group_2_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3857:1: ( rule__NBTArray__Group_2_0_6__0__Impl rule__NBTArray__Group_2_0_6__1 )
            // InternalMCEntity.g:3858:2: rule__NBTArray__Group_2_0_6__0__Impl rule__NBTArray__Group_2_0_6__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_6__0__Impl"
    // InternalMCEntity.g:3865:1: rule__NBTArray__Group_2_0_6__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_6_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3869:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_6_0 ) ) )
            // InternalMCEntity.g:3870:1: ( ( rule__NBTArray__ElementsAssignment_2_0_6_0 ) )
            {
            // InternalMCEntity.g:3870:1: ( ( rule__NBTArray__ElementsAssignment_2_0_6_0 ) )
            // InternalMCEntity.g:3871:2: ( rule__NBTArray__ElementsAssignment_2_0_6_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_0()); 
            // InternalMCEntity.g:3872:2: ( rule__NBTArray__ElementsAssignment_2_0_6_0 )
            // InternalMCEntity.g:3872:3: rule__NBTArray__ElementsAssignment_2_0_6_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_6_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_6__1"
    // InternalMCEntity.g:3880:1: rule__NBTArray__Group_2_0_6__1 : rule__NBTArray__Group_2_0_6__1__Impl ;
    public final void rule__NBTArray__Group_2_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3884:1: ( rule__NBTArray__Group_2_0_6__1__Impl )
            // InternalMCEntity.g:3885:2: rule__NBTArray__Group_2_0_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_6__1__Impl"
    // InternalMCEntity.g:3891:1: rule__NBTArray__Group_2_0_6__1__Impl : ( ( rule__NBTArray__Group_2_0_6_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3895:1: ( ( ( rule__NBTArray__Group_2_0_6_1__0 )* ) )
            // InternalMCEntity.g:3896:1: ( ( rule__NBTArray__Group_2_0_6_1__0 )* )
            {
            // InternalMCEntity.g:3896:1: ( ( rule__NBTArray__Group_2_0_6_1__0 )* )
            // InternalMCEntity.g:3897:2: ( rule__NBTArray__Group_2_0_6_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_6_1()); 
            // InternalMCEntity.g:3898:2: ( rule__NBTArray__Group_2_0_6_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==41) ) {
                    int LA43_1 = input.LA(2);

                    if ( ((LA43_1>=RULE_STRING && LA43_1<=RULE_SINGLE_STRING)||LA43_1==RULE_ID||(LA43_1>=31 && LA43_1<=33)) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalMCEntity.g:3898:3: rule__NBTArray__Group_2_0_6_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_6_1__0"
    // InternalMCEntity.g:3907:1: rule__NBTArray__Group_2_0_6_1__0 : rule__NBTArray__Group_2_0_6_1__0__Impl rule__NBTArray__Group_2_0_6_1__1 ;
    public final void rule__NBTArray__Group_2_0_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3911:1: ( rule__NBTArray__Group_2_0_6_1__0__Impl rule__NBTArray__Group_2_0_6_1__1 )
            // InternalMCEntity.g:3912:2: rule__NBTArray__Group_2_0_6_1__0__Impl rule__NBTArray__Group_2_0_6_1__1
            {
            pushFollow(FOLLOW_8);
            rule__NBTArray__Group_2_0_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_6_1__0__Impl"
    // InternalMCEntity.g:3919:1: rule__NBTArray__Group_2_0_6_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3923:1: ( ( ',' ) )
            // InternalMCEntity.g:3924:1: ( ',' )
            {
            // InternalMCEntity.g:3924:1: ( ',' )
            // InternalMCEntity.g:3925:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_6_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_6_1__1"
    // InternalMCEntity.g:3934:1: rule__NBTArray__Group_2_0_6_1__1 : rule__NBTArray__Group_2_0_6_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3938:1: ( rule__NBTArray__Group_2_0_6_1__1__Impl )
            // InternalMCEntity.g:3939:2: rule__NBTArray__Group_2_0_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_6_1__1__Impl"
    // InternalMCEntity.g:3945:1: rule__NBTArray__Group_2_0_6_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3949:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 ) ) )
            // InternalMCEntity.g:3950:1: ( ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 ) )
            {
            // InternalMCEntity.g:3950:1: ( ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 ) )
            // InternalMCEntity.g:3951:2: ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_1_1()); 
            // InternalMCEntity.g:3952:2: ( rule__NBTArray__ElementsAssignment_2_0_6_1_1 )
            // InternalMCEntity.g:3952:3: rule__NBTArray__ElementsAssignment_2_0_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_6_1__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_7__0"
    // InternalMCEntity.g:3961:1: rule__NBTArray__Group_2_0_7__0 : rule__NBTArray__Group_2_0_7__0__Impl rule__NBTArray__Group_2_0_7__1 ;
    public final void rule__NBTArray__Group_2_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3965:1: ( rule__NBTArray__Group_2_0_7__0__Impl rule__NBTArray__Group_2_0_7__1 )
            // InternalMCEntity.g:3966:2: rule__NBTArray__Group_2_0_7__0__Impl rule__NBTArray__Group_2_0_7__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTArray__Group_2_0_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_7__0__Impl"
    // InternalMCEntity.g:3973:1: rule__NBTArray__Group_2_0_7__0__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_7_0 ) ) ;
    public final void rule__NBTArray__Group_2_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3977:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_7_0 ) ) )
            // InternalMCEntity.g:3978:1: ( ( rule__NBTArray__ElementsAssignment_2_0_7_0 ) )
            {
            // InternalMCEntity.g:3978:1: ( ( rule__NBTArray__ElementsAssignment_2_0_7_0 ) )
            // InternalMCEntity.g:3979:2: ( rule__NBTArray__ElementsAssignment_2_0_7_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_0()); 
            // InternalMCEntity.g:3980:2: ( rule__NBTArray__ElementsAssignment_2_0_7_0 )
            // InternalMCEntity.g:3980:3: rule__NBTArray__ElementsAssignment_2_0_7_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_7_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_7__1"
    // InternalMCEntity.g:3988:1: rule__NBTArray__Group_2_0_7__1 : rule__NBTArray__Group_2_0_7__1__Impl ;
    public final void rule__NBTArray__Group_2_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:3992:1: ( rule__NBTArray__Group_2_0_7__1__Impl )
            // InternalMCEntity.g:3993:2: rule__NBTArray__Group_2_0_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_7__1__Impl"
    // InternalMCEntity.g:3999:1: rule__NBTArray__Group_2_0_7__1__Impl : ( ( rule__NBTArray__Group_2_0_7_1__0 )* ) ;
    public final void rule__NBTArray__Group_2_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4003:1: ( ( ( rule__NBTArray__Group_2_0_7_1__0 )* ) )
            // InternalMCEntity.g:4004:1: ( ( rule__NBTArray__Group_2_0_7_1__0 )* )
            {
            // InternalMCEntity.g:4004:1: ( ( rule__NBTArray__Group_2_0_7_1__0 )* )
            // InternalMCEntity.g:4005:2: ( rule__NBTArray__Group_2_0_7_1__0 )*
            {
             before(grammarAccess.getNBTArrayAccess().getGroup_2_0_7_1()); 
            // InternalMCEntity.g:4006:2: ( rule__NBTArray__Group_2_0_7_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==41) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_JSON_TEXT_BEGIN_OBJ||LA44_1==RULE_JSON_TEXT_BEGIN_ARRAY||LA44_1==RULE_JSON_TEXT_BEGIN_STR) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalMCEntity.g:4006:3: rule__NBTArray__Group_2_0_7_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTArray__Group_2_0_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getNBTArrayAccess().getGroup_2_0_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7__1__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_7_1__0"
    // InternalMCEntity.g:4015:1: rule__NBTArray__Group_2_0_7_1__0 : rule__NBTArray__Group_2_0_7_1__0__Impl rule__NBTArray__Group_2_0_7_1__1 ;
    public final void rule__NBTArray__Group_2_0_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4019:1: ( rule__NBTArray__Group_2_0_7_1__0__Impl rule__NBTArray__Group_2_0_7_1__1 )
            // InternalMCEntity.g:4020:2: rule__NBTArray__Group_2_0_7_1__0__Impl rule__NBTArray__Group_2_0_7_1__1
            {
            pushFollow(FOLLOW_22);
            rule__NBTArray__Group_2_0_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7_1__0"


    // $ANTLR start "rule__NBTArray__Group_2_0_7_1__0__Impl"
    // InternalMCEntity.g:4027:1: rule__NBTArray__Group_2_0_7_1__0__Impl : ( ',' ) ;
    public final void rule__NBTArray__Group_2_0_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4031:1: ( ( ',' ) )
            // InternalMCEntity.g:4032:1: ( ',' )
            {
            // InternalMCEntity.g:4032:1: ( ',' )
            // InternalMCEntity.g:4033:2: ','
            {
             before(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_7_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTArrayAccess().getCommaKeyword_2_0_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7_1__0__Impl"


    // $ANTLR start "rule__NBTArray__Group_2_0_7_1__1"
    // InternalMCEntity.g:4042:1: rule__NBTArray__Group_2_0_7_1__1 : rule__NBTArray__Group_2_0_7_1__1__Impl ;
    public final void rule__NBTArray__Group_2_0_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4046:1: ( rule__NBTArray__Group_2_0_7_1__1__Impl )
            // InternalMCEntity.g:4047:2: rule__NBTArray__Group_2_0_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__Group_2_0_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7_1__1"


    // $ANTLR start "rule__NBTArray__Group_2_0_7_1__1__Impl"
    // InternalMCEntity.g:4053:1: rule__NBTArray__Group_2_0_7_1__1__Impl : ( ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 ) ) ;
    public final void rule__NBTArray__Group_2_0_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4057:1: ( ( ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 ) ) )
            // InternalMCEntity.g:4058:1: ( ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 ) )
            {
            // InternalMCEntity.g:4058:1: ( ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 ) )
            // InternalMCEntity.g:4059:2: ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_1_1()); 
            // InternalMCEntity.g:4060:2: ( rule__NBTArray__ElementsAssignment_2_0_7_1_1 )
            // InternalMCEntity.g:4060:3: rule__NBTArray__ElementsAssignment_2_0_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAssignment_2_0_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAssignment_2_0_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__Group_2_0_7_1__1__Impl"


    // $ANTLR start "rule__NBTBool__Group_1__0"
    // InternalMCEntity.g:4069:1: rule__NBTBool__Group_1__0 : rule__NBTBool__Group_1__0__Impl rule__NBTBool__Group_1__1 ;
    public final void rule__NBTBool__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4073:1: ( rule__NBTBool__Group_1__0__Impl rule__NBTBool__Group_1__1 )
            // InternalMCEntity.g:4074:2: rule__NBTBool__Group_1__0__Impl rule__NBTBool__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__NBTBool__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTBool__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTBool__Group_1__0"


    // $ANTLR start "rule__NBTBool__Group_1__0__Impl"
    // InternalMCEntity.g:4081:1: rule__NBTBool__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__NBTBool__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4085:1: ( ( 'false' ) )
            // InternalMCEntity.g:4086:1: ( 'false' )
            {
            // InternalMCEntity.g:4086:1: ( 'false' )
            // InternalMCEntity.g:4087:2: 'false'
            {
             before(grammarAccess.getNBTBoolAccess().getFalseKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNBTBoolAccess().getFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTBool__Group_1__0__Impl"


    // $ANTLR start "rule__NBTBool__Group_1__1"
    // InternalMCEntity.g:4096:1: rule__NBTBool__Group_1__1 : rule__NBTBool__Group_1__1__Impl ;
    public final void rule__NBTBool__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4100:1: ( rule__NBTBool__Group_1__1__Impl )
            // InternalMCEntity.g:4101:2: rule__NBTBool__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTBool__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTBool__Group_1__1"


    // $ANTLR start "rule__NBTBool__Group_1__1__Impl"
    // InternalMCEntity.g:4107:1: rule__NBTBool__Group_1__1__Impl : ( () ) ;
    public final void rule__NBTBool__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4111:1: ( ( () ) )
            // InternalMCEntity.g:4112:1: ( () )
            {
            // InternalMCEntity.g:4112:1: ( () )
            // InternalMCEntity.g:4113:2: ()
            {
             before(grammarAccess.getNBTBoolAccess().getNBTBoolAction_1_1()); 
            // InternalMCEntity.g:4114:2: ()
            // InternalMCEntity.g:4114:3: 
            {
            }

             after(grammarAccess.getNBTBoolAccess().getNBTBoolAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTBool__Group_1__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__0"
    // InternalMCEntity.g:4123:1: rule__NBTJSONTextComponent__Group_0__0 : rule__NBTJSONTextComponent__Group_0__0__Impl rule__NBTJSONTextComponent__Group_0__1 ;
    public final void rule__NBTJSONTextComponent__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4127:1: ( rule__NBTJSONTextComponent__Group_0__0__Impl rule__NBTJSONTextComponent__Group_0__1 )
            // InternalMCEntity.g:4128:2: rule__NBTJSONTextComponent__Group_0__0__Impl rule__NBTJSONTextComponent__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__NBTJSONTextComponent__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__0"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__0__Impl"
    // InternalMCEntity.g:4135:1: rule__NBTJSONTextComponent__Group_0__0__Impl : ( RULE_JSON_TEXT_BEGIN_OBJ ) ;
    public final void rule__NBTJSONTextComponent__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4139:1: ( ( RULE_JSON_TEXT_BEGIN_OBJ ) )
            // InternalMCEntity.g:4140:1: ( RULE_JSON_TEXT_BEGIN_OBJ )
            {
            // InternalMCEntity.g:4140:1: ( RULE_JSON_TEXT_BEGIN_OBJ )
            // InternalMCEntity.g:4141:2: RULE_JSON_TEXT_BEGIN_OBJ
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_OBJTerminalRuleCall_0_0()); 
            match(input,RULE_JSON_TEXT_BEGIN_OBJ,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_OBJTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__1"
    // InternalMCEntity.g:4150:1: rule__NBTJSONTextComponent__Group_0__1 : rule__NBTJSONTextComponent__Group_0__1__Impl rule__NBTJSONTextComponent__Group_0__2 ;
    public final void rule__NBTJSONTextComponent__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4154:1: ( rule__NBTJSONTextComponent__Group_0__1__Impl rule__NBTJSONTextComponent__Group_0__2 )
            // InternalMCEntity.g:4155:2: rule__NBTJSONTextComponent__Group_0__1__Impl rule__NBTJSONTextComponent__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__NBTJSONTextComponent__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__1"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__1__Impl"
    // InternalMCEntity.g:4162:1: rule__NBTJSONTextComponent__Group_0__1__Impl : ( ( rule__NBTJSONTextComponent__ValueAssignment_0_1 ) ) ;
    public final void rule__NBTJSONTextComponent__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4166:1: ( ( ( rule__NBTJSONTextComponent__ValueAssignment_0_1 ) ) )
            // InternalMCEntity.g:4167:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_0_1 ) )
            {
            // InternalMCEntity.g:4167:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_0_1 ) )
            // InternalMCEntity.g:4168:2: ( rule__NBTJSONTextComponent__ValueAssignment_0_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_0_1()); 
            // InternalMCEntity.g:4169:2: ( rule__NBTJSONTextComponent__ValueAssignment_0_1 )
            // InternalMCEntity.g:4169:3: rule__NBTJSONTextComponent__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__2"
    // InternalMCEntity.g:4177:1: rule__NBTJSONTextComponent__Group_0__2 : rule__NBTJSONTextComponent__Group_0__2__Impl ;
    public final void rule__NBTJSONTextComponent__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4181:1: ( rule__NBTJSONTextComponent__Group_0__2__Impl )
            // InternalMCEntity.g:4182:2: rule__NBTJSONTextComponent__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__2"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_0__2__Impl"
    // InternalMCEntity.g:4188:1: rule__NBTJSONTextComponent__Group_0__2__Impl : ( RULE_JSON_TEXT_END_OBJ ) ;
    public final void rule__NBTJSONTextComponent__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4192:1: ( ( RULE_JSON_TEXT_END_OBJ ) )
            // InternalMCEntity.g:4193:1: ( RULE_JSON_TEXT_END_OBJ )
            {
            // InternalMCEntity.g:4193:1: ( RULE_JSON_TEXT_END_OBJ )
            // InternalMCEntity.g:4194:2: RULE_JSON_TEXT_END_OBJ
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_OBJTerminalRuleCall_0_2()); 
            match(input,RULE_JSON_TEXT_END_OBJ,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_OBJTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_0__2__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__0"
    // InternalMCEntity.g:4204:1: rule__NBTJSONTextComponent__Group_1__0 : rule__NBTJSONTextComponent__Group_1__0__Impl rule__NBTJSONTextComponent__Group_1__1 ;
    public final void rule__NBTJSONTextComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4208:1: ( rule__NBTJSONTextComponent__Group_1__0__Impl rule__NBTJSONTextComponent__Group_1__1 )
            // InternalMCEntity.g:4209:2: rule__NBTJSONTextComponent__Group_1__0__Impl rule__NBTJSONTextComponent__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__NBTJSONTextComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__0"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__0__Impl"
    // InternalMCEntity.g:4216:1: rule__NBTJSONTextComponent__Group_1__0__Impl : ( RULE_JSON_TEXT_BEGIN_ARRAY ) ;
    public final void rule__NBTJSONTextComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4220:1: ( ( RULE_JSON_TEXT_BEGIN_ARRAY ) )
            // InternalMCEntity.g:4221:1: ( RULE_JSON_TEXT_BEGIN_ARRAY )
            {
            // InternalMCEntity.g:4221:1: ( RULE_JSON_TEXT_BEGIN_ARRAY )
            // InternalMCEntity.g:4222:2: RULE_JSON_TEXT_BEGIN_ARRAY
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_ARRAYTerminalRuleCall_1_0()); 
            match(input,RULE_JSON_TEXT_BEGIN_ARRAY,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_ARRAYTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__1"
    // InternalMCEntity.g:4231:1: rule__NBTJSONTextComponent__Group_1__1 : rule__NBTJSONTextComponent__Group_1__1__Impl rule__NBTJSONTextComponent__Group_1__2 ;
    public final void rule__NBTJSONTextComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4235:1: ( rule__NBTJSONTextComponent__Group_1__1__Impl rule__NBTJSONTextComponent__Group_1__2 )
            // InternalMCEntity.g:4236:2: rule__NBTJSONTextComponent__Group_1__1__Impl rule__NBTJSONTextComponent__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__NBTJSONTextComponent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__1"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__1__Impl"
    // InternalMCEntity.g:4243:1: rule__NBTJSONTextComponent__Group_1__1__Impl : ( ( rule__NBTJSONTextComponent__ValueAssignment_1_1 ) ) ;
    public final void rule__NBTJSONTextComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4247:1: ( ( ( rule__NBTJSONTextComponent__ValueAssignment_1_1 ) ) )
            // InternalMCEntity.g:4248:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_1_1 ) )
            {
            // InternalMCEntity.g:4248:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_1_1 ) )
            // InternalMCEntity.g:4249:2: ( rule__NBTJSONTextComponent__ValueAssignment_1_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_1_1()); 
            // InternalMCEntity.g:4250:2: ( rule__NBTJSONTextComponent__ValueAssignment_1_1 )
            // InternalMCEntity.g:4250:3: rule__NBTJSONTextComponent__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__2"
    // InternalMCEntity.g:4258:1: rule__NBTJSONTextComponent__Group_1__2 : rule__NBTJSONTextComponent__Group_1__2__Impl ;
    public final void rule__NBTJSONTextComponent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4262:1: ( rule__NBTJSONTextComponent__Group_1__2__Impl )
            // InternalMCEntity.g:4263:2: rule__NBTJSONTextComponent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__2"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_1__2__Impl"
    // InternalMCEntity.g:4269:1: rule__NBTJSONTextComponent__Group_1__2__Impl : ( RULE_JSON_TEXT_END_ARRAY ) ;
    public final void rule__NBTJSONTextComponent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4273:1: ( ( RULE_JSON_TEXT_END_ARRAY ) )
            // InternalMCEntity.g:4274:1: ( RULE_JSON_TEXT_END_ARRAY )
            {
            // InternalMCEntity.g:4274:1: ( RULE_JSON_TEXT_END_ARRAY )
            // InternalMCEntity.g:4275:2: RULE_JSON_TEXT_END_ARRAY
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_ARRAYTerminalRuleCall_1_2()); 
            match(input,RULE_JSON_TEXT_END_ARRAY,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_ARRAYTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_1__2__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__0"
    // InternalMCEntity.g:4285:1: rule__NBTJSONTextComponent__Group_2__0 : rule__NBTJSONTextComponent__Group_2__0__Impl rule__NBTJSONTextComponent__Group_2__1 ;
    public final void rule__NBTJSONTextComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4289:1: ( rule__NBTJSONTextComponent__Group_2__0__Impl rule__NBTJSONTextComponent__Group_2__1 )
            // InternalMCEntity.g:4290:2: rule__NBTJSONTextComponent__Group_2__0__Impl rule__NBTJSONTextComponent__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__NBTJSONTextComponent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__0"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__0__Impl"
    // InternalMCEntity.g:4297:1: rule__NBTJSONTextComponent__Group_2__0__Impl : ( RULE_JSON_TEXT_BEGIN_STR ) ;
    public final void rule__NBTJSONTextComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4301:1: ( ( RULE_JSON_TEXT_BEGIN_STR ) )
            // InternalMCEntity.g:4302:1: ( RULE_JSON_TEXT_BEGIN_STR )
            {
            // InternalMCEntity.g:4302:1: ( RULE_JSON_TEXT_BEGIN_STR )
            // InternalMCEntity.g:4303:2: RULE_JSON_TEXT_BEGIN_STR
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_STRTerminalRuleCall_2_0()); 
            match(input,RULE_JSON_TEXT_BEGIN_STR,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_BEGIN_STRTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__1"
    // InternalMCEntity.g:4312:1: rule__NBTJSONTextComponent__Group_2__1 : rule__NBTJSONTextComponent__Group_2__1__Impl rule__NBTJSONTextComponent__Group_2__2 ;
    public final void rule__NBTJSONTextComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4316:1: ( rule__NBTJSONTextComponent__Group_2__1__Impl rule__NBTJSONTextComponent__Group_2__2 )
            // InternalMCEntity.g:4317:2: rule__NBTJSONTextComponent__Group_2__1__Impl rule__NBTJSONTextComponent__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__NBTJSONTextComponent__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__1"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__1__Impl"
    // InternalMCEntity.g:4324:1: rule__NBTJSONTextComponent__Group_2__1__Impl : ( ( rule__NBTJSONTextComponent__ValueAssignment_2_1 ) ) ;
    public final void rule__NBTJSONTextComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4328:1: ( ( ( rule__NBTJSONTextComponent__ValueAssignment_2_1 ) ) )
            // InternalMCEntity.g:4329:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_2_1 ) )
            {
            // InternalMCEntity.g:4329:1: ( ( rule__NBTJSONTextComponent__ValueAssignment_2_1 ) )
            // InternalMCEntity.g:4330:2: ( rule__NBTJSONTextComponent__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_2_1()); 
            // InternalMCEntity.g:4331:2: ( rule__NBTJSONTextComponent__ValueAssignment_2_1 )
            // InternalMCEntity.g:4331:3: rule__NBTJSONTextComponent__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__2"
    // InternalMCEntity.g:4339:1: rule__NBTJSONTextComponent__Group_2__2 : rule__NBTJSONTextComponent__Group_2__2__Impl ;
    public final void rule__NBTJSONTextComponent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4343:1: ( rule__NBTJSONTextComponent__Group_2__2__Impl )
            // InternalMCEntity.g:4344:2: rule__NBTJSONTextComponent__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponent__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__2"


    // $ANTLR start "rule__NBTJSONTextComponent__Group_2__2__Impl"
    // InternalMCEntity.g:4350:1: rule__NBTJSONTextComponent__Group_2__2__Impl : ( RULE_JSON_TEXT_END_STR ) ;
    public final void rule__NBTJSONTextComponent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4354:1: ( ( RULE_JSON_TEXT_END_STR ) )
            // InternalMCEntity.g:4355:1: ( RULE_JSON_TEXT_END_STR )
            {
            // InternalMCEntity.g:4355:1: ( RULE_JSON_TEXT_END_STR )
            // InternalMCEntity.g:4356:2: RULE_JSON_TEXT_END_STR
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_STRTerminalRuleCall_2_2()); 
            match(input,RULE_JSON_TEXT_END_STR,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentAccess().getJSON_TEXT_END_STRTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__Group_2__2__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group__0"
    // InternalMCEntity.g:4366:1: rule__NBTJSONTextComponentObject__Group__0 : rule__NBTJSONTextComponentObject__Group__0__Impl rule__NBTJSONTextComponentObject__Group__1 ;
    public final void rule__NBTJSONTextComponentObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4370:1: ( rule__NBTJSONTextComponentObject__Group__0__Impl rule__NBTJSONTextComponentObject__Group__1 )
            // InternalMCEntity.g:4371:2: rule__NBTJSONTextComponentObject__Group__0__Impl rule__NBTJSONTextComponentObject__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__NBTJSONTextComponentObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group__0"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group__0__Impl"
    // InternalMCEntity.g:4378:1: rule__NBTJSONTextComponentObject__Group__0__Impl : ( () ) ;
    public final void rule__NBTJSONTextComponentObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4382:1: ( ( () ) )
            // InternalMCEntity.g:4383:1: ( () )
            {
            // InternalMCEntity.g:4383:1: ( () )
            // InternalMCEntity.g:4384:2: ()
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getJSONObjectAction_0()); 
            // InternalMCEntity.g:4385:2: ()
            // InternalMCEntity.g:4385:3: 
            {
            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getJSONObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group__1"
    // InternalMCEntity.g:4393:1: rule__NBTJSONTextComponentObject__Group__1 : rule__NBTJSONTextComponentObject__Group__1__Impl ;
    public final void rule__NBTJSONTextComponentObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4397:1: ( rule__NBTJSONTextComponentObject__Group__1__Impl )
            // InternalMCEntity.g:4398:2: rule__NBTJSONTextComponentObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group__1"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group__1__Impl"
    // InternalMCEntity.g:4404:1: rule__NBTJSONTextComponentObject__Group__1__Impl : ( ( rule__NBTJSONTextComponentObject__Group_1__0 )? ) ;
    public final void rule__NBTJSONTextComponentObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4408:1: ( ( ( rule__NBTJSONTextComponentObject__Group_1__0 )? ) )
            // InternalMCEntity.g:4409:1: ( ( rule__NBTJSONTextComponentObject__Group_1__0 )? )
            {
            // InternalMCEntity.g:4409:1: ( ( rule__NBTJSONTextComponentObject__Group_1__0 )? )
            // InternalMCEntity.g:4410:2: ( rule__NBTJSONTextComponentObject__Group_1__0 )?
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1()); 
            // InternalMCEntity.g:4411:2: ( rule__NBTJSONTextComponentObject__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMCEntity.g:4411:3: rule__NBTJSONTextComponentObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTJSONTextComponentObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__0"
    // InternalMCEntity.g:4420:1: rule__NBTJSONTextComponentObject__Group_1__0 : rule__NBTJSONTextComponentObject__Group_1__0__Impl rule__NBTJSONTextComponentObject__Group_1__1 ;
    public final void rule__NBTJSONTextComponentObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4424:1: ( rule__NBTJSONTextComponentObject__Group_1__0__Impl rule__NBTJSONTextComponentObject__Group_1__1 )
            // InternalMCEntity.g:4425:2: rule__NBTJSONTextComponentObject__Group_1__0__Impl rule__NBTJSONTextComponentObject__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTJSONTextComponentObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__0"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__0__Impl"
    // InternalMCEntity.g:4432:1: rule__NBTJSONTextComponentObject__Group_1__0__Impl : ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 ) ) ;
    public final void rule__NBTJSONTextComponentObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4436:1: ( ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 ) ) )
            // InternalMCEntity.g:4437:1: ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 ) )
            {
            // InternalMCEntity.g:4437:1: ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 ) )
            // InternalMCEntity.g:4438:2: ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 )
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_0()); 
            // InternalMCEntity.g:4439:2: ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 )
            // InternalMCEntity.g:4439:3: rule__NBTJSONTextComponentObject__EntriesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__EntriesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__1"
    // InternalMCEntity.g:4447:1: rule__NBTJSONTextComponentObject__Group_1__1 : rule__NBTJSONTextComponentObject__Group_1__1__Impl rule__NBTJSONTextComponentObject__Group_1__2 ;
    public final void rule__NBTJSONTextComponentObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4451:1: ( rule__NBTJSONTextComponentObject__Group_1__1__Impl rule__NBTJSONTextComponentObject__Group_1__2 )
            // InternalMCEntity.g:4452:2: rule__NBTJSONTextComponentObject__Group_1__1__Impl rule__NBTJSONTextComponentObject__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTJSONTextComponentObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__1"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__1__Impl"
    // InternalMCEntity.g:4459:1: rule__NBTJSONTextComponentObject__Group_1__1__Impl : ( ( rule__NBTJSONTextComponentObject__Group_1_1__0 )* ) ;
    public final void rule__NBTJSONTextComponentObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4463:1: ( ( ( rule__NBTJSONTextComponentObject__Group_1_1__0 )* ) )
            // InternalMCEntity.g:4464:1: ( ( rule__NBTJSONTextComponentObject__Group_1_1__0 )* )
            {
            // InternalMCEntity.g:4464:1: ( ( rule__NBTJSONTextComponentObject__Group_1_1__0 )* )
            // InternalMCEntity.g:4465:2: ( rule__NBTJSONTextComponentObject__Group_1_1__0 )*
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1_1()); 
            // InternalMCEntity.g:4466:2: ( rule__NBTJSONTextComponentObject__Group_1_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==41) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==RULE_STRING) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalMCEntity.g:4466:3: rule__NBTJSONTextComponentObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTJSONTextComponentObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__2"
    // InternalMCEntity.g:4474:1: rule__NBTJSONTextComponentObject__Group_1__2 : rule__NBTJSONTextComponentObject__Group_1__2__Impl ;
    public final void rule__NBTJSONTextComponentObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4478:1: ( rule__NBTJSONTextComponentObject__Group_1__2__Impl )
            // InternalMCEntity.g:4479:2: rule__NBTJSONTextComponentObject__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__2"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1__2__Impl"
    // InternalMCEntity.g:4485:1: rule__NBTJSONTextComponentObject__Group_1__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTJSONTextComponentObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4489:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:4490:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:4490:1: ( ( ',' )? )
            // InternalMCEntity.g:4491:2: ( ',' )?
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_2()); 
            // InternalMCEntity.g:4492:2: ( ',' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMCEntity.g:4492:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1__2__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1_1__0"
    // InternalMCEntity.g:4501:1: rule__NBTJSONTextComponentObject__Group_1_1__0 : rule__NBTJSONTextComponentObject__Group_1_1__0__Impl rule__NBTJSONTextComponentObject__Group_1_1__1 ;
    public final void rule__NBTJSONTextComponentObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4505:1: ( rule__NBTJSONTextComponentObject__Group_1_1__0__Impl rule__NBTJSONTextComponentObject__Group_1_1__1 )
            // InternalMCEntity.g:4506:2: rule__NBTJSONTextComponentObject__Group_1_1__0__Impl rule__NBTJSONTextComponentObject__Group_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__NBTJSONTextComponentObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1_1__0"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1_1__0__Impl"
    // InternalMCEntity.g:4513:1: rule__NBTJSONTextComponentObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__NBTJSONTextComponentObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4517:1: ( ( ',' ) )
            // InternalMCEntity.g:4518:1: ( ',' )
            {
            // InternalMCEntity.g:4518:1: ( ',' )
            // InternalMCEntity.g:4519:2: ','
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1_1__1"
    // InternalMCEntity.g:4528:1: rule__NBTJSONTextComponentObject__Group_1_1__1 : rule__NBTJSONTextComponentObject__Group_1_1__1__Impl ;
    public final void rule__NBTJSONTextComponentObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4532:1: ( rule__NBTJSONTextComponentObject__Group_1_1__1__Impl )
            // InternalMCEntity.g:4533:2: rule__NBTJSONTextComponentObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1_1__1"


    // $ANTLR start "rule__NBTJSONTextComponentObject__Group_1_1__1__Impl"
    // InternalMCEntity.g:4539:1: rule__NBTJSONTextComponentObject__Group_1_1__1__Impl : ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__NBTJSONTextComponentObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4543:1: ( ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 ) ) )
            // InternalMCEntity.g:4544:1: ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 ) )
            {
            // InternalMCEntity.g:4544:1: ( ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 ) )
            // InternalMCEntity.g:4545:2: ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_1_1()); 
            // InternalMCEntity.g:4546:2: ( rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 )
            // InternalMCEntity.g:4546:3: rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentString__Group__0"
    // InternalMCEntity.g:4555:1: rule__NBTJSONTextComponentString__Group__0 : rule__NBTJSONTextComponentString__Group__0__Impl rule__NBTJSONTextComponentString__Group__1 ;
    public final void rule__NBTJSONTextComponentString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4559:1: ( rule__NBTJSONTextComponentString__Group__0__Impl rule__NBTJSONTextComponentString__Group__1 )
            // InternalMCEntity.g:4560:2: rule__NBTJSONTextComponentString__Group__0__Impl rule__NBTJSONTextComponentString__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__NBTJSONTextComponentString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentString__Group__0"


    // $ANTLR start "rule__NBTJSONTextComponentString__Group__0__Impl"
    // InternalMCEntity.g:4567:1: rule__NBTJSONTextComponentString__Group__0__Impl : ( () ) ;
    public final void rule__NBTJSONTextComponentString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4571:1: ( ( () ) )
            // InternalMCEntity.g:4572:1: ( () )
            {
            // InternalMCEntity.g:4572:1: ( () )
            // InternalMCEntity.g:4573:2: ()
            {
             before(grammarAccess.getNBTJSONTextComponentStringAccess().getJSONStringAction_0()); 
            // InternalMCEntity.g:4574:2: ()
            // InternalMCEntity.g:4574:3: 
            {
            }

             after(grammarAccess.getNBTJSONTextComponentStringAccess().getJSONStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentString__Group__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentString__Group__1"
    // InternalMCEntity.g:4582:1: rule__NBTJSONTextComponentString__Group__1 : rule__NBTJSONTextComponentString__Group__1__Impl ;
    public final void rule__NBTJSONTextComponentString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4586:1: ( rule__NBTJSONTextComponentString__Group__1__Impl )
            // InternalMCEntity.g:4587:2: rule__NBTJSONTextComponentString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentString__Group__1"


    // $ANTLR start "rule__NBTJSONTextComponentString__Group__1__Impl"
    // InternalMCEntity.g:4593:1: rule__NBTJSONTextComponentString__Group__1__Impl : ( ( rule__NBTJSONTextComponentString__ValueAssignment_1 ) ) ;
    public final void rule__NBTJSONTextComponentString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4597:1: ( ( ( rule__NBTJSONTextComponentString__ValueAssignment_1 ) ) )
            // InternalMCEntity.g:4598:1: ( ( rule__NBTJSONTextComponentString__ValueAssignment_1 ) )
            {
            // InternalMCEntity.g:4598:1: ( ( rule__NBTJSONTextComponentString__ValueAssignment_1 ) )
            // InternalMCEntity.g:4599:2: ( rule__NBTJSONTextComponentString__ValueAssignment_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentStringAccess().getValueAssignment_1()); 
            // InternalMCEntity.g:4600:2: ( rule__NBTJSONTextComponentString__ValueAssignment_1 )
            // InternalMCEntity.g:4600:3: rule__NBTJSONTextComponentString__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentString__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentStringAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentString__Group__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group__0"
    // InternalMCEntity.g:4609:1: rule__NBTJSONTextComponentArray__Group__0 : rule__NBTJSONTextComponentArray__Group__0__Impl rule__NBTJSONTextComponentArray__Group__1 ;
    public final void rule__NBTJSONTextComponentArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4613:1: ( rule__NBTJSONTextComponentArray__Group__0__Impl rule__NBTJSONTextComponentArray__Group__1 )
            // InternalMCEntity.g:4614:2: rule__NBTJSONTextComponentArray__Group__0__Impl rule__NBTJSONTextComponentArray__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__NBTJSONTextComponentArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group__0"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group__0__Impl"
    // InternalMCEntity.g:4621:1: rule__NBTJSONTextComponentArray__Group__0__Impl : ( () ) ;
    public final void rule__NBTJSONTextComponentArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4625:1: ( ( () ) )
            // InternalMCEntity.g:4626:1: ( () )
            {
            // InternalMCEntity.g:4626:1: ( () )
            // InternalMCEntity.g:4627:2: ()
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getJSONArrayAction_0()); 
            // InternalMCEntity.g:4628:2: ()
            // InternalMCEntity.g:4628:3: 
            {
            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getJSONArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group__1"
    // InternalMCEntity.g:4636:1: rule__NBTJSONTextComponentArray__Group__1 : rule__NBTJSONTextComponentArray__Group__1__Impl ;
    public final void rule__NBTJSONTextComponentArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4640:1: ( rule__NBTJSONTextComponentArray__Group__1__Impl )
            // InternalMCEntity.g:4641:2: rule__NBTJSONTextComponentArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group__1"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group__1__Impl"
    // InternalMCEntity.g:4647:1: rule__NBTJSONTextComponentArray__Group__1__Impl : ( ( rule__NBTJSONTextComponentArray__Group_1__0 )? ) ;
    public final void rule__NBTJSONTextComponentArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4651:1: ( ( ( rule__NBTJSONTextComponentArray__Group_1__0 )? ) )
            // InternalMCEntity.g:4652:1: ( ( rule__NBTJSONTextComponentArray__Group_1__0 )? )
            {
            // InternalMCEntity.g:4652:1: ( ( rule__NBTJSONTextComponentArray__Group_1__0 )? )
            // InternalMCEntity.g:4653:2: ( rule__NBTJSONTextComponentArray__Group_1__0 )?
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1()); 
            // InternalMCEntity.g:4654:2: ( rule__NBTJSONTextComponentArray__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_STRING)||LA48_0==RULE_DOUBLE||(LA48_0>=34 && LA48_0<=39)||(LA48_0>=44 && LA48_0<=45)||LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMCEntity.g:4654:3: rule__NBTJSONTextComponentArray__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NBTJSONTextComponentArray__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__0"
    // InternalMCEntity.g:4663:1: rule__NBTJSONTextComponentArray__Group_1__0 : rule__NBTJSONTextComponentArray__Group_1__0__Impl rule__NBTJSONTextComponentArray__Group_1__1 ;
    public final void rule__NBTJSONTextComponentArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4667:1: ( rule__NBTJSONTextComponentArray__Group_1__0__Impl rule__NBTJSONTextComponentArray__Group_1__1 )
            // InternalMCEntity.g:4668:2: rule__NBTJSONTextComponentArray__Group_1__0__Impl rule__NBTJSONTextComponentArray__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__NBTJSONTextComponentArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__0"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__0__Impl"
    // InternalMCEntity.g:4675:1: rule__NBTJSONTextComponentArray__Group_1__0__Impl : ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 ) ) ;
    public final void rule__NBTJSONTextComponentArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4679:1: ( ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 ) ) )
            // InternalMCEntity.g:4680:1: ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 ) )
            {
            // InternalMCEntity.g:4680:1: ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 ) )
            // InternalMCEntity.g:4681:2: ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 )
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_0()); 
            // InternalMCEntity.g:4682:2: ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 )
            // InternalMCEntity.g:4682:3: rule__NBTJSONTextComponentArray__EntriesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__EntriesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__1"
    // InternalMCEntity.g:4690:1: rule__NBTJSONTextComponentArray__Group_1__1 : rule__NBTJSONTextComponentArray__Group_1__1__Impl rule__NBTJSONTextComponentArray__Group_1__2 ;
    public final void rule__NBTJSONTextComponentArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4694:1: ( rule__NBTJSONTextComponentArray__Group_1__1__Impl rule__NBTJSONTextComponentArray__Group_1__2 )
            // InternalMCEntity.g:4695:2: rule__NBTJSONTextComponentArray__Group_1__1__Impl rule__NBTJSONTextComponentArray__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__NBTJSONTextComponentArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__1"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__1__Impl"
    // InternalMCEntity.g:4702:1: rule__NBTJSONTextComponentArray__Group_1__1__Impl : ( ( rule__NBTJSONTextComponentArray__Group_1_1__0 )* ) ;
    public final void rule__NBTJSONTextComponentArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4706:1: ( ( ( rule__NBTJSONTextComponentArray__Group_1_1__0 )* ) )
            // InternalMCEntity.g:4707:1: ( ( rule__NBTJSONTextComponentArray__Group_1_1__0 )* )
            {
            // InternalMCEntity.g:4707:1: ( ( rule__NBTJSONTextComponentArray__Group_1_1__0 )* )
            // InternalMCEntity.g:4708:2: ( rule__NBTJSONTextComponentArray__Group_1_1__0 )*
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1_1()); 
            // InternalMCEntity.g:4709:2: ( rule__NBTJSONTextComponentArray__Group_1_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==41) ) {
                    int LA49_1 = input.LA(2);

                    if ( ((LA49_1>=RULE_INT && LA49_1<=RULE_STRING)||LA49_1==RULE_DOUBLE||(LA49_1>=34 && LA49_1<=39)||(LA49_1>=44 && LA49_1<=45)||LA49_1==49) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalMCEntity.g:4709:3: rule__NBTJSONTextComponentArray__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NBTJSONTextComponentArray__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__1__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__2"
    // InternalMCEntity.g:4717:1: rule__NBTJSONTextComponentArray__Group_1__2 : rule__NBTJSONTextComponentArray__Group_1__2__Impl ;
    public final void rule__NBTJSONTextComponentArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4721:1: ( rule__NBTJSONTextComponentArray__Group_1__2__Impl )
            // InternalMCEntity.g:4722:2: rule__NBTJSONTextComponentArray__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__2"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1__2__Impl"
    // InternalMCEntity.g:4728:1: rule__NBTJSONTextComponentArray__Group_1__2__Impl : ( ( ',' )? ) ;
    public final void rule__NBTJSONTextComponentArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4732:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:4733:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:4733:1: ( ( ',' )? )
            // InternalMCEntity.g:4734:2: ( ',' )?
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_2()); 
            // InternalMCEntity.g:4735:2: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMCEntity.g:4735:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1__2__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1_1__0"
    // InternalMCEntity.g:4744:1: rule__NBTJSONTextComponentArray__Group_1_1__0 : rule__NBTJSONTextComponentArray__Group_1_1__0__Impl rule__NBTJSONTextComponentArray__Group_1_1__1 ;
    public final void rule__NBTJSONTextComponentArray__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4748:1: ( rule__NBTJSONTextComponentArray__Group_1_1__0__Impl rule__NBTJSONTextComponentArray__Group_1_1__1 )
            // InternalMCEntity.g:4749:2: rule__NBTJSONTextComponentArray__Group_1_1__0__Impl rule__NBTJSONTextComponentArray__Group_1_1__1
            {
            pushFollow(FOLLOW_25);
            rule__NBTJSONTextComponentArray__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1_1__0"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1_1__0__Impl"
    // InternalMCEntity.g:4756:1: rule__NBTJSONTextComponentArray__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__NBTJSONTextComponentArray__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4760:1: ( ( ',' ) )
            // InternalMCEntity.g:4761:1: ( ',' )
            {
            // InternalMCEntity.g:4761:1: ( ',' )
            // InternalMCEntity.g:4762:2: ','
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1_1__0__Impl"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1_1__1"
    // InternalMCEntity.g:4771:1: rule__NBTJSONTextComponentArray__Group_1_1__1 : rule__NBTJSONTextComponentArray__Group_1_1__1__Impl ;
    public final void rule__NBTJSONTextComponentArray__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4775:1: ( rule__NBTJSONTextComponentArray__Group_1_1__1__Impl )
            // InternalMCEntity.g:4776:2: rule__NBTJSONTextComponentArray__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1_1__1"


    // $ANTLR start "rule__NBTJSONTextComponentArray__Group_1_1__1__Impl"
    // InternalMCEntity.g:4782:1: rule__NBTJSONTextComponentArray__Group_1_1__1__Impl : ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__NBTJSONTextComponentArray__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4786:1: ( ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 ) ) )
            // InternalMCEntity.g:4787:1: ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 ) )
            {
            // InternalMCEntity.g:4787:1: ( ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 ) )
            // InternalMCEntity.g:4788:2: ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_1_1()); 
            // InternalMCEntity.g:4789:2: ( rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 )
            // InternalMCEntity.g:4789:3: rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__Group_1_1__1__Impl"


    // $ANTLR start "rule__JSONBool__Group_1__0"
    // InternalMCEntity.g:4798:1: rule__JSONBool__Group_1__0 : rule__JSONBool__Group_1__0__Impl rule__JSONBool__Group_1__1 ;
    public final void rule__JSONBool__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4802:1: ( rule__JSONBool__Group_1__0__Impl rule__JSONBool__Group_1__1 )
            // InternalMCEntity.g:4803:2: rule__JSONBool__Group_1__0__Impl rule__JSONBool__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__JSONBool__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONBool__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONBool__Group_1__0"


    // $ANTLR start "rule__JSONBool__Group_1__0__Impl"
    // InternalMCEntity.g:4810:1: rule__JSONBool__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__JSONBool__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4814:1: ( ( 'false' ) )
            // InternalMCEntity.g:4815:1: ( 'false' )
            {
            // InternalMCEntity.g:4815:1: ( 'false' )
            // InternalMCEntity.g:4816:2: 'false'
            {
             before(grammarAccess.getJSONBoolAccess().getFalseKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJSONBoolAccess().getFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONBool__Group_1__0__Impl"


    // $ANTLR start "rule__JSONBool__Group_1__1"
    // InternalMCEntity.g:4825:1: rule__JSONBool__Group_1__1 : rule__JSONBool__Group_1__1__Impl ;
    public final void rule__JSONBool__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4829:1: ( rule__JSONBool__Group_1__1__Impl )
            // InternalMCEntity.g:4830:2: rule__JSONBool__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONBool__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONBool__Group_1__1"


    // $ANTLR start "rule__JSONBool__Group_1__1__Impl"
    // InternalMCEntity.g:4836:1: rule__JSONBool__Group_1__1__Impl : ( () ) ;
    public final void rule__JSONBool__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4840:1: ( ( () ) )
            // InternalMCEntity.g:4841:1: ( () )
            {
            // InternalMCEntity.g:4841:1: ( () )
            // InternalMCEntity.g:4842:2: ()
            {
             before(grammarAccess.getJSONBoolAccess().getJSONBoolAction_1_1()); 
            // InternalMCEntity.g:4843:2: ()
            // InternalMCEntity.g:4843:3: 
            {
            }

             after(grammarAccess.getJSONBoolAccess().getJSONBoolAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONBool__Group_1__1__Impl"


    // $ANTLR start "rule__JSONObject__Group__0"
    // InternalMCEntity.g:4852:1: rule__JSONObject__Group__0 : rule__JSONObject__Group__0__Impl rule__JSONObject__Group__1 ;
    public final void rule__JSONObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4856:1: ( rule__JSONObject__Group__0__Impl rule__JSONObject__Group__1 )
            // InternalMCEntity.g:4857:2: rule__JSONObject__Group__0__Impl rule__JSONObject__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__JSONObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__0"


    // $ANTLR start "rule__JSONObject__Group__0__Impl"
    // InternalMCEntity.g:4864:1: rule__JSONObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JSONObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4868:1: ( ( '{' ) )
            // InternalMCEntity.g:4869:1: ( '{' )
            {
            // InternalMCEntity.g:4869:1: ( '{' )
            // InternalMCEntity.g:4870:2: '{'
            {
             before(grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__0__Impl"


    // $ANTLR start "rule__JSONObject__Group__1"
    // InternalMCEntity.g:4879:1: rule__JSONObject__Group__1 : rule__JSONObject__Group__1__Impl rule__JSONObject__Group__2 ;
    public final void rule__JSONObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4883:1: ( rule__JSONObject__Group__1__Impl rule__JSONObject__Group__2 )
            // InternalMCEntity.g:4884:2: rule__JSONObject__Group__1__Impl rule__JSONObject__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__JSONObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__1"


    // $ANTLR start "rule__JSONObject__Group__1__Impl"
    // InternalMCEntity.g:4891:1: rule__JSONObject__Group__1__Impl : ( () ) ;
    public final void rule__JSONObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4895:1: ( ( () ) )
            // InternalMCEntity.g:4896:1: ( () )
            {
            // InternalMCEntity.g:4896:1: ( () )
            // InternalMCEntity.g:4897:2: ()
            {
             before(grammarAccess.getJSONObjectAccess().getJSONObjectAction_1()); 
            // InternalMCEntity.g:4898:2: ()
            // InternalMCEntity.g:4898:3: 
            {
            }

             after(grammarAccess.getJSONObjectAccess().getJSONObjectAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__1__Impl"


    // $ANTLR start "rule__JSONObject__Group__2"
    // InternalMCEntity.g:4906:1: rule__JSONObject__Group__2 : rule__JSONObject__Group__2__Impl rule__JSONObject__Group__3 ;
    public final void rule__JSONObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4910:1: ( rule__JSONObject__Group__2__Impl rule__JSONObject__Group__3 )
            // InternalMCEntity.g:4911:2: rule__JSONObject__Group__2__Impl rule__JSONObject__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__JSONObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__2"


    // $ANTLR start "rule__JSONObject__Group__2__Impl"
    // InternalMCEntity.g:4918:1: rule__JSONObject__Group__2__Impl : ( ( rule__JSONObject__Group_2__0 )? ) ;
    public final void rule__JSONObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4922:1: ( ( ( rule__JSONObject__Group_2__0 )? ) )
            // InternalMCEntity.g:4923:1: ( ( rule__JSONObject__Group_2__0 )? )
            {
            // InternalMCEntity.g:4923:1: ( ( rule__JSONObject__Group_2__0 )? )
            // InternalMCEntity.g:4924:2: ( rule__JSONObject__Group_2__0 )?
            {
             before(grammarAccess.getJSONObjectAccess().getGroup_2()); 
            // InternalMCEntity.g:4925:2: ( rule__JSONObject__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMCEntity.g:4925:3: rule__JSONObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSONObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__2__Impl"


    // $ANTLR start "rule__JSONObject__Group__3"
    // InternalMCEntity.g:4933:1: rule__JSONObject__Group__3 : rule__JSONObject__Group__3__Impl ;
    public final void rule__JSONObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4937:1: ( rule__JSONObject__Group__3__Impl )
            // InternalMCEntity.g:4938:2: rule__JSONObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__3"


    // $ANTLR start "rule__JSONObject__Group__3__Impl"
    // InternalMCEntity.g:4944:1: rule__JSONObject__Group__3__Impl : ( '}' ) ;
    public final void rule__JSONObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4948:1: ( ( '}' ) )
            // InternalMCEntity.g:4949:1: ( '}' )
            {
            // InternalMCEntity.g:4949:1: ( '}' )
            // InternalMCEntity.g:4950:2: '}'
            {
             before(grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group__3__Impl"


    // $ANTLR start "rule__JSONObject__Group_2__0"
    // InternalMCEntity.g:4960:1: rule__JSONObject__Group_2__0 : rule__JSONObject__Group_2__0__Impl rule__JSONObject__Group_2__1 ;
    public final void rule__JSONObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4964:1: ( rule__JSONObject__Group_2__0__Impl rule__JSONObject__Group_2__1 )
            // InternalMCEntity.g:4965:2: rule__JSONObject__Group_2__0__Impl rule__JSONObject__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__JSONObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__0"


    // $ANTLR start "rule__JSONObject__Group_2__0__Impl"
    // InternalMCEntity.g:4972:1: rule__JSONObject__Group_2__0__Impl : ( ( rule__JSONObject__EntriesAssignment_2_0 ) ) ;
    public final void rule__JSONObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4976:1: ( ( ( rule__JSONObject__EntriesAssignment_2_0 ) ) )
            // InternalMCEntity.g:4977:1: ( ( rule__JSONObject__EntriesAssignment_2_0 ) )
            {
            // InternalMCEntity.g:4977:1: ( ( rule__JSONObject__EntriesAssignment_2_0 ) )
            // InternalMCEntity.g:4978:2: ( rule__JSONObject__EntriesAssignment_2_0 )
            {
             before(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_0()); 
            // InternalMCEntity.g:4979:2: ( rule__JSONObject__EntriesAssignment_2_0 )
            // InternalMCEntity.g:4979:3: rule__JSONObject__EntriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__EntriesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__0__Impl"


    // $ANTLR start "rule__JSONObject__Group_2__1"
    // InternalMCEntity.g:4987:1: rule__JSONObject__Group_2__1 : rule__JSONObject__Group_2__1__Impl rule__JSONObject__Group_2__2 ;
    public final void rule__JSONObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:4991:1: ( rule__JSONObject__Group_2__1__Impl rule__JSONObject__Group_2__2 )
            // InternalMCEntity.g:4992:2: rule__JSONObject__Group_2__1__Impl rule__JSONObject__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__JSONObject__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__1"


    // $ANTLR start "rule__JSONObject__Group_2__1__Impl"
    // InternalMCEntity.g:4999:1: rule__JSONObject__Group_2__1__Impl : ( ( rule__JSONObject__Group_2_1__0 )* ) ;
    public final void rule__JSONObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5003:1: ( ( ( rule__JSONObject__Group_2_1__0 )* ) )
            // InternalMCEntity.g:5004:1: ( ( rule__JSONObject__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:5004:1: ( ( rule__JSONObject__Group_2_1__0 )* )
            // InternalMCEntity.g:5005:2: ( rule__JSONObject__Group_2_1__0 )*
            {
             before(grammarAccess.getJSONObjectAccess().getGroup_2_1()); 
            // InternalMCEntity.g:5006:2: ( rule__JSONObject__Group_2_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==41) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==RULE_STRING) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalMCEntity.g:5006:3: rule__JSONObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSONObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getJSONObjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__1__Impl"


    // $ANTLR start "rule__JSONObject__Group_2__2"
    // InternalMCEntity.g:5014:1: rule__JSONObject__Group_2__2 : rule__JSONObject__Group_2__2__Impl ;
    public final void rule__JSONObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5018:1: ( rule__JSONObject__Group_2__2__Impl )
            // InternalMCEntity.g:5019:2: rule__JSONObject__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__2"


    // $ANTLR start "rule__JSONObject__Group_2__2__Impl"
    // InternalMCEntity.g:5025:1: rule__JSONObject__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__JSONObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5029:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:5030:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:5030:1: ( ( ',' )? )
            // InternalMCEntity.g:5031:2: ( ',' )?
            {
             before(grammarAccess.getJSONObjectAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:5032:2: ( ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMCEntity.g:5032:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJSONObjectAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2__2__Impl"


    // $ANTLR start "rule__JSONObject__Group_2_1__0"
    // InternalMCEntity.g:5041:1: rule__JSONObject__Group_2_1__0 : rule__JSONObject__Group_2_1__0__Impl rule__JSONObject__Group_2_1__1 ;
    public final void rule__JSONObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5045:1: ( rule__JSONObject__Group_2_1__0__Impl rule__JSONObject__Group_2_1__1 )
            // InternalMCEntity.g:5046:2: rule__JSONObject__Group_2_1__0__Impl rule__JSONObject__Group_2_1__1
            {
            pushFollow(FOLLOW_23);
            rule__JSONObject__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONObject__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2_1__0"


    // $ANTLR start "rule__JSONObject__Group_2_1__0__Impl"
    // InternalMCEntity.g:5053:1: rule__JSONObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__JSONObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5057:1: ( ( ',' ) )
            // InternalMCEntity.g:5058:1: ( ',' )
            {
            // InternalMCEntity.g:5058:1: ( ',' )
            // InternalMCEntity.g:5059:2: ','
            {
             before(grammarAccess.getJSONObjectAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getJSONObjectAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__JSONObject__Group_2_1__1"
    // InternalMCEntity.g:5068:1: rule__JSONObject__Group_2_1__1 : rule__JSONObject__Group_2_1__1__Impl ;
    public final void rule__JSONObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5072:1: ( rule__JSONObject__Group_2_1__1__Impl )
            // InternalMCEntity.g:5073:2: rule__JSONObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2_1__1"


    // $ANTLR start "rule__JSONObject__Group_2_1__1__Impl"
    // InternalMCEntity.g:5079:1: rule__JSONObject__Group_2_1__1__Impl : ( ( rule__JSONObject__EntriesAssignment_2_1_1 ) ) ;
    public final void rule__JSONObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5083:1: ( ( ( rule__JSONObject__EntriesAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:5084:1: ( ( rule__JSONObject__EntriesAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:5084:1: ( ( rule__JSONObject__EntriesAssignment_2_1_1 ) )
            // InternalMCEntity.g:5085:2: ( rule__JSONObject__EntriesAssignment_2_1_1 )
            {
             before(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_1_1()); 
            // InternalMCEntity.g:5086:2: ( rule__JSONObject__EntriesAssignment_2_1_1 )
            // InternalMCEntity.g:5086:3: rule__JSONObject__EntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JSONObject__EntriesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJSONObjectAccess().getEntriesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__JSONEntry__Group__0"
    // InternalMCEntity.g:5095:1: rule__JSONEntry__Group__0 : rule__JSONEntry__Group__0__Impl rule__JSONEntry__Group__1 ;
    public final void rule__JSONEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5099:1: ( rule__JSONEntry__Group__0__Impl rule__JSONEntry__Group__1 )
            // InternalMCEntity.g:5100:2: rule__JSONEntry__Group__0__Impl rule__JSONEntry__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__JSONEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__0"


    // $ANTLR start "rule__JSONEntry__Group__0__Impl"
    // InternalMCEntity.g:5107:1: rule__JSONEntry__Group__0__Impl : ( ( rule__JSONEntry__KeyAssignment_0 ) ) ;
    public final void rule__JSONEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5111:1: ( ( ( rule__JSONEntry__KeyAssignment_0 ) ) )
            // InternalMCEntity.g:5112:1: ( ( rule__JSONEntry__KeyAssignment_0 ) )
            {
            // InternalMCEntity.g:5112:1: ( ( rule__JSONEntry__KeyAssignment_0 ) )
            // InternalMCEntity.g:5113:2: ( rule__JSONEntry__KeyAssignment_0 )
            {
             before(grammarAccess.getJSONEntryAccess().getKeyAssignment_0()); 
            // InternalMCEntity.g:5114:2: ( rule__JSONEntry__KeyAssignment_0 )
            // InternalMCEntity.g:5114:3: rule__JSONEntry__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JSONEntry__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJSONEntryAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__0__Impl"


    // $ANTLR start "rule__JSONEntry__Group__1"
    // InternalMCEntity.g:5122:1: rule__JSONEntry__Group__1 : rule__JSONEntry__Group__1__Impl rule__JSONEntry__Group__2 ;
    public final void rule__JSONEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5126:1: ( rule__JSONEntry__Group__1__Impl rule__JSONEntry__Group__2 )
            // InternalMCEntity.g:5127:2: rule__JSONEntry__Group__1__Impl rule__JSONEntry__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__JSONEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__1"


    // $ANTLR start "rule__JSONEntry__Group__1__Impl"
    // InternalMCEntity.g:5134:1: rule__JSONEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__JSONEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5138:1: ( ( ':' ) )
            // InternalMCEntity.g:5139:1: ( ':' )
            {
            // InternalMCEntity.g:5139:1: ( ':' )
            // InternalMCEntity.g:5140:2: ':'
            {
             before(grammarAccess.getJSONEntryAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getJSONEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__1__Impl"


    // $ANTLR start "rule__JSONEntry__Group__2"
    // InternalMCEntity.g:5149:1: rule__JSONEntry__Group__2 : rule__JSONEntry__Group__2__Impl ;
    public final void rule__JSONEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5153:1: ( rule__JSONEntry__Group__2__Impl )
            // InternalMCEntity.g:5154:2: rule__JSONEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONEntry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__2"


    // $ANTLR start "rule__JSONEntry__Group__2__Impl"
    // InternalMCEntity.g:5160:1: rule__JSONEntry__Group__2__Impl : ( ( rule__JSONEntry__ValueAssignment_2 ) ) ;
    public final void rule__JSONEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5164:1: ( ( ( rule__JSONEntry__ValueAssignment_2 ) ) )
            // InternalMCEntity.g:5165:1: ( ( rule__JSONEntry__ValueAssignment_2 ) )
            {
            // InternalMCEntity.g:5165:1: ( ( rule__JSONEntry__ValueAssignment_2 ) )
            // InternalMCEntity.g:5166:2: ( rule__JSONEntry__ValueAssignment_2 )
            {
             before(grammarAccess.getJSONEntryAccess().getValueAssignment_2()); 
            // InternalMCEntity.g:5167:2: ( rule__JSONEntry__ValueAssignment_2 )
            // InternalMCEntity.g:5167:3: rule__JSONEntry__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JSONEntry__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJSONEntryAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__Group__2__Impl"


    // $ANTLR start "rule__JSONArray__Group__0"
    // InternalMCEntity.g:5176:1: rule__JSONArray__Group__0 : rule__JSONArray__Group__0__Impl rule__JSONArray__Group__1 ;
    public final void rule__JSONArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5180:1: ( rule__JSONArray__Group__0__Impl rule__JSONArray__Group__1 )
            // InternalMCEntity.g:5181:2: rule__JSONArray__Group__0__Impl rule__JSONArray__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__JSONArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__0"


    // $ANTLR start "rule__JSONArray__Group__0__Impl"
    // InternalMCEntity.g:5188:1: rule__JSONArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JSONArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5192:1: ( ( '[' ) )
            // InternalMCEntity.g:5193:1: ( '[' )
            {
            // InternalMCEntity.g:5193:1: ( '[' )
            // InternalMCEntity.g:5194:2: '['
            {
             before(grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__0__Impl"


    // $ANTLR start "rule__JSONArray__Group__1"
    // InternalMCEntity.g:5203:1: rule__JSONArray__Group__1 : rule__JSONArray__Group__1__Impl rule__JSONArray__Group__2 ;
    public final void rule__JSONArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5207:1: ( rule__JSONArray__Group__1__Impl rule__JSONArray__Group__2 )
            // InternalMCEntity.g:5208:2: rule__JSONArray__Group__1__Impl rule__JSONArray__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__JSONArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__1"


    // $ANTLR start "rule__JSONArray__Group__1__Impl"
    // InternalMCEntity.g:5215:1: rule__JSONArray__Group__1__Impl : ( () ) ;
    public final void rule__JSONArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5219:1: ( ( () ) )
            // InternalMCEntity.g:5220:1: ( () )
            {
            // InternalMCEntity.g:5220:1: ( () )
            // InternalMCEntity.g:5221:2: ()
            {
             before(grammarAccess.getJSONArrayAccess().getJSONArrayAction_1()); 
            // InternalMCEntity.g:5222:2: ()
            // InternalMCEntity.g:5222:3: 
            {
            }

             after(grammarAccess.getJSONArrayAccess().getJSONArrayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__1__Impl"


    // $ANTLR start "rule__JSONArray__Group__2"
    // InternalMCEntity.g:5230:1: rule__JSONArray__Group__2 : rule__JSONArray__Group__2__Impl rule__JSONArray__Group__3 ;
    public final void rule__JSONArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5234:1: ( rule__JSONArray__Group__2__Impl rule__JSONArray__Group__3 )
            // InternalMCEntity.g:5235:2: rule__JSONArray__Group__2__Impl rule__JSONArray__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__JSONArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__2"


    // $ANTLR start "rule__JSONArray__Group__2__Impl"
    // InternalMCEntity.g:5242:1: rule__JSONArray__Group__2__Impl : ( ( rule__JSONArray__Group_2__0 )? ) ;
    public final void rule__JSONArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5246:1: ( ( ( rule__JSONArray__Group_2__0 )? ) )
            // InternalMCEntity.g:5247:1: ( ( rule__JSONArray__Group_2__0 )? )
            {
            // InternalMCEntity.g:5247:1: ( ( rule__JSONArray__Group_2__0 )? )
            // InternalMCEntity.g:5248:2: ( rule__JSONArray__Group_2__0 )?
            {
             before(grammarAccess.getJSONArrayAccess().getGroup_2()); 
            // InternalMCEntity.g:5249:2: ( rule__JSONArray__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_STRING)||LA54_0==RULE_DOUBLE||(LA54_0>=34 && LA54_0<=39)||(LA54_0>=44 && LA54_0<=45)||LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMCEntity.g:5249:3: rule__JSONArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSONArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__2__Impl"


    // $ANTLR start "rule__JSONArray__Group__3"
    // InternalMCEntity.g:5257:1: rule__JSONArray__Group__3 : rule__JSONArray__Group__3__Impl ;
    public final void rule__JSONArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5261:1: ( rule__JSONArray__Group__3__Impl )
            // InternalMCEntity.g:5262:2: rule__JSONArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__3"


    // $ANTLR start "rule__JSONArray__Group__3__Impl"
    // InternalMCEntity.g:5268:1: rule__JSONArray__Group__3__Impl : ( ']' ) ;
    public final void rule__JSONArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5272:1: ( ( ']' ) )
            // InternalMCEntity.g:5273:1: ( ']' )
            {
            // InternalMCEntity.g:5273:1: ( ']' )
            // InternalMCEntity.g:5274:2: ']'
            {
             before(grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group__3__Impl"


    // $ANTLR start "rule__JSONArray__Group_2__0"
    // InternalMCEntity.g:5284:1: rule__JSONArray__Group_2__0 : rule__JSONArray__Group_2__0__Impl rule__JSONArray__Group_2__1 ;
    public final void rule__JSONArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5288:1: ( rule__JSONArray__Group_2__0__Impl rule__JSONArray__Group_2__1 )
            // InternalMCEntity.g:5289:2: rule__JSONArray__Group_2__0__Impl rule__JSONArray__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__JSONArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__0"


    // $ANTLR start "rule__JSONArray__Group_2__0__Impl"
    // InternalMCEntity.g:5296:1: rule__JSONArray__Group_2__0__Impl : ( ( rule__JSONArray__EntriesAssignment_2_0 ) ) ;
    public final void rule__JSONArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5300:1: ( ( ( rule__JSONArray__EntriesAssignment_2_0 ) ) )
            // InternalMCEntity.g:5301:1: ( ( rule__JSONArray__EntriesAssignment_2_0 ) )
            {
            // InternalMCEntity.g:5301:1: ( ( rule__JSONArray__EntriesAssignment_2_0 ) )
            // InternalMCEntity.g:5302:2: ( rule__JSONArray__EntriesAssignment_2_0 )
            {
             before(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_0()); 
            // InternalMCEntity.g:5303:2: ( rule__JSONArray__EntriesAssignment_2_0 )
            // InternalMCEntity.g:5303:3: rule__JSONArray__EntriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__EntriesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__0__Impl"


    // $ANTLR start "rule__JSONArray__Group_2__1"
    // InternalMCEntity.g:5311:1: rule__JSONArray__Group_2__1 : rule__JSONArray__Group_2__1__Impl rule__JSONArray__Group_2__2 ;
    public final void rule__JSONArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5315:1: ( rule__JSONArray__Group_2__1__Impl rule__JSONArray__Group_2__2 )
            // InternalMCEntity.g:5316:2: rule__JSONArray__Group_2__1__Impl rule__JSONArray__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__JSONArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__1"


    // $ANTLR start "rule__JSONArray__Group_2__1__Impl"
    // InternalMCEntity.g:5323:1: rule__JSONArray__Group_2__1__Impl : ( ( rule__JSONArray__Group_2_1__0 )* ) ;
    public final void rule__JSONArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5327:1: ( ( ( rule__JSONArray__Group_2_1__0 )* ) )
            // InternalMCEntity.g:5328:1: ( ( rule__JSONArray__Group_2_1__0 )* )
            {
            // InternalMCEntity.g:5328:1: ( ( rule__JSONArray__Group_2_1__0 )* )
            // InternalMCEntity.g:5329:2: ( rule__JSONArray__Group_2_1__0 )*
            {
             before(grammarAccess.getJSONArrayAccess().getGroup_2_1()); 
            // InternalMCEntity.g:5330:2: ( rule__JSONArray__Group_2_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==41) ) {
                    int LA55_1 = input.LA(2);

                    if ( ((LA55_1>=RULE_INT && LA55_1<=RULE_STRING)||LA55_1==RULE_DOUBLE||(LA55_1>=34 && LA55_1<=39)||(LA55_1>=44 && LA55_1<=45)||LA55_1==49) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalMCEntity.g:5330:3: rule__JSONArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSONArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getJSONArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__1__Impl"


    // $ANTLR start "rule__JSONArray__Group_2__2"
    // InternalMCEntity.g:5338:1: rule__JSONArray__Group_2__2 : rule__JSONArray__Group_2__2__Impl ;
    public final void rule__JSONArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5342:1: ( rule__JSONArray__Group_2__2__Impl )
            // InternalMCEntity.g:5343:2: rule__JSONArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__2"


    // $ANTLR start "rule__JSONArray__Group_2__2__Impl"
    // InternalMCEntity.g:5349:1: rule__JSONArray__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__JSONArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5353:1: ( ( ( ',' )? ) )
            // InternalMCEntity.g:5354:1: ( ( ',' )? )
            {
            // InternalMCEntity.g:5354:1: ( ( ',' )? )
            // InternalMCEntity.g:5355:2: ( ',' )?
            {
             before(grammarAccess.getJSONArrayAccess().getCommaKeyword_2_2()); 
            // InternalMCEntity.g:5356:2: ( ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMCEntity.g:5356:3: ','
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJSONArrayAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2__2__Impl"


    // $ANTLR start "rule__JSONArray__Group_2_1__0"
    // InternalMCEntity.g:5365:1: rule__JSONArray__Group_2_1__0 : rule__JSONArray__Group_2_1__0__Impl rule__JSONArray__Group_2_1__1 ;
    public final void rule__JSONArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5369:1: ( rule__JSONArray__Group_2_1__0__Impl rule__JSONArray__Group_2_1__1 )
            // InternalMCEntity.g:5370:2: rule__JSONArray__Group_2_1__0__Impl rule__JSONArray__Group_2_1__1
            {
            pushFollow(FOLLOW_25);
            rule__JSONArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2_1__0"


    // $ANTLR start "rule__JSONArray__Group_2_1__0__Impl"
    // InternalMCEntity.g:5377:1: rule__JSONArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__JSONArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5381:1: ( ( ',' ) )
            // InternalMCEntity.g:5382:1: ( ',' )
            {
            // InternalMCEntity.g:5382:1: ( ',' )
            // InternalMCEntity.g:5383:2: ','
            {
             before(grammarAccess.getJSONArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getJSONArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__JSONArray__Group_2_1__1"
    // InternalMCEntity.g:5392:1: rule__JSONArray__Group_2_1__1 : rule__JSONArray__Group_2_1__1__Impl ;
    public final void rule__JSONArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5396:1: ( rule__JSONArray__Group_2_1__1__Impl )
            // InternalMCEntity.g:5397:2: rule__JSONArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2_1__1"


    // $ANTLR start "rule__JSONArray__Group_2_1__1__Impl"
    // InternalMCEntity.g:5403:1: rule__JSONArray__Group_2_1__1__Impl : ( ( rule__JSONArray__EntriesAssignment_2_1_1 ) ) ;
    public final void rule__JSONArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5407:1: ( ( ( rule__JSONArray__EntriesAssignment_2_1_1 ) ) )
            // InternalMCEntity.g:5408:1: ( ( rule__JSONArray__EntriesAssignment_2_1_1 ) )
            {
            // InternalMCEntity.g:5408:1: ( ( rule__JSONArray__EntriesAssignment_2_1_1 ) )
            // InternalMCEntity.g:5409:2: ( rule__JSONArray__EntriesAssignment_2_1_1 )
            {
             before(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_1_1()); 
            // InternalMCEntity.g:5410:2: ( rule__JSONArray__EntriesAssignment_2_1_1 )
            // InternalMCEntity.g:5410:3: rule__JSONArray__EntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JSONArray__EntriesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJSONArrayAccess().getEntriesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalMCEntity.g:5419:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5423:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMCEntity.g:5424:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalMCEntity.g:5431:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__TypeAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5435:1: ( ( ( rule__Selector__TypeAssignment_0 ) ) )
            // InternalMCEntity.g:5436:1: ( ( rule__Selector__TypeAssignment_0 ) )
            {
            // InternalMCEntity.g:5436:1: ( ( rule__Selector__TypeAssignment_0 ) )
            // InternalMCEntity.g:5437:2: ( rule__Selector__TypeAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 
            // InternalMCEntity.g:5438:2: ( rule__Selector__TypeAssignment_0 )
            // InternalMCEntity.g:5438:3: rule__Selector__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalMCEntity.g:5446:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5450:1: ( rule__Selector__Group__1__Impl )
            // InternalMCEntity.g:5451:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalMCEntity.g:5457:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Group_1__0 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5461:1: ( ( ( rule__Selector__Group_1__0 )? ) )
            // InternalMCEntity.g:5462:1: ( ( rule__Selector__Group_1__0 )? )
            {
            // InternalMCEntity.g:5462:1: ( ( rule__Selector__Group_1__0 )? )
            // InternalMCEntity.g:5463:2: ( rule__Selector__Group_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1()); 
            // InternalMCEntity.g:5464:2: ( rule__Selector__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMCEntity.g:5464:3: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // InternalMCEntity.g:5473:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5477:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalMCEntity.g:5478:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // InternalMCEntity.g:5485:1: rule__Selector__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5489:1: ( ( '[' ) )
            // InternalMCEntity.g:5490:1: ( '[' )
            {
            // InternalMCEntity.g:5490:1: ( '[' )
            // InternalMCEntity.g:5491:2: '['
            {
             before(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // InternalMCEntity.g:5500:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl rule__Selector__Group_1__2 ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5504:1: ( rule__Selector__Group_1__1__Impl rule__Selector__Group_1__2 )
            // InternalMCEntity.g:5505:2: rule__Selector__Group_1__1__Impl rule__Selector__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Selector__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // InternalMCEntity.g:5512:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5516:1: ( ( ( rule__Selector__ArgumentsAssignment_1_1 ) ) )
            // InternalMCEntity.g:5517:1: ( ( rule__Selector__ArgumentsAssignment_1_1 ) )
            {
            // InternalMCEntity.g:5517:1: ( ( rule__Selector__ArgumentsAssignment_1_1 ) )
            // InternalMCEntity.g:5518:2: ( rule__Selector__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getArgumentsAssignment_1_1()); 
            // InternalMCEntity.g:5519:2: ( rule__Selector__ArgumentsAssignment_1_1 )
            // InternalMCEntity.g:5519:3: rule__Selector__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__2"
    // InternalMCEntity.g:5527:1: rule__Selector__Group_1__2 : rule__Selector__Group_1__2__Impl ;
    public final void rule__Selector__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5531:1: ( rule__Selector__Group_1__2__Impl )
            // InternalMCEntity.g:5532:2: rule__Selector__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__2"


    // $ANTLR start "rule__Selector__Group_1__2__Impl"
    // InternalMCEntity.g:5538:1: rule__Selector__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Selector__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5542:1: ( ( ']' ) )
            // InternalMCEntity.g:5543:1: ( ']' )
            {
            // InternalMCEntity.g:5543:1: ( ']' )
            // InternalMCEntity.g:5544:2: ']'
            {
             before(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__2__Impl"


    // $ANTLR start "rule__SelectorArguments__Group__0"
    // InternalMCEntity.g:5554:1: rule__SelectorArguments__Group__0 : rule__SelectorArguments__Group__0__Impl rule__SelectorArguments__Group__1 ;
    public final void rule__SelectorArguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5558:1: ( rule__SelectorArguments__Group__0__Impl rule__SelectorArguments__Group__1 )
            // InternalMCEntity.g:5559:2: rule__SelectorArguments__Group__0__Impl rule__SelectorArguments__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectorArguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorArguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group__0"


    // $ANTLR start "rule__SelectorArguments__Group__0__Impl"
    // InternalMCEntity.g:5566:1: rule__SelectorArguments__Group__0__Impl : ( ( rule__SelectorArguments__FiltersAssignment_0 ) ) ;
    public final void rule__SelectorArguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5570:1: ( ( ( rule__SelectorArguments__FiltersAssignment_0 ) ) )
            // InternalMCEntity.g:5571:1: ( ( rule__SelectorArguments__FiltersAssignment_0 ) )
            {
            // InternalMCEntity.g:5571:1: ( ( rule__SelectorArguments__FiltersAssignment_0 ) )
            // InternalMCEntity.g:5572:2: ( rule__SelectorArguments__FiltersAssignment_0 )
            {
             before(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_0()); 
            // InternalMCEntity.g:5573:2: ( rule__SelectorArguments__FiltersAssignment_0 )
            // InternalMCEntity.g:5573:3: rule__SelectorArguments__FiltersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorArguments__FiltersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group__0__Impl"


    // $ANTLR start "rule__SelectorArguments__Group__1"
    // InternalMCEntity.g:5581:1: rule__SelectorArguments__Group__1 : rule__SelectorArguments__Group__1__Impl ;
    public final void rule__SelectorArguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5585:1: ( rule__SelectorArguments__Group__1__Impl )
            // InternalMCEntity.g:5586:2: rule__SelectorArguments__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorArguments__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group__1"


    // $ANTLR start "rule__SelectorArguments__Group__1__Impl"
    // InternalMCEntity.g:5592:1: rule__SelectorArguments__Group__1__Impl : ( ( rule__SelectorArguments__Group_1__0 )* ) ;
    public final void rule__SelectorArguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5596:1: ( ( ( rule__SelectorArguments__Group_1__0 )* ) )
            // InternalMCEntity.g:5597:1: ( ( rule__SelectorArguments__Group_1__0 )* )
            {
            // InternalMCEntity.g:5597:1: ( ( rule__SelectorArguments__Group_1__0 )* )
            // InternalMCEntity.g:5598:2: ( rule__SelectorArguments__Group_1__0 )*
            {
             before(grammarAccess.getSelectorArgumentsAccess().getGroup_1()); 
            // InternalMCEntity.g:5599:2: ( rule__SelectorArguments__Group_1__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==41) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMCEntity.g:5599:3: rule__SelectorArguments__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SelectorArguments__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getSelectorArgumentsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group__1__Impl"


    // $ANTLR start "rule__SelectorArguments__Group_1__0"
    // InternalMCEntity.g:5608:1: rule__SelectorArguments__Group_1__0 : rule__SelectorArguments__Group_1__0__Impl rule__SelectorArguments__Group_1__1 ;
    public final void rule__SelectorArguments__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5612:1: ( rule__SelectorArguments__Group_1__0__Impl rule__SelectorArguments__Group_1__1 )
            // InternalMCEntity.g:5613:2: rule__SelectorArguments__Group_1__0__Impl rule__SelectorArguments__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__SelectorArguments__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorArguments__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group_1__0"


    // $ANTLR start "rule__SelectorArguments__Group_1__0__Impl"
    // InternalMCEntity.g:5620:1: rule__SelectorArguments__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectorArguments__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5624:1: ( ( ',' ) )
            // InternalMCEntity.g:5625:1: ( ',' )
            {
            // InternalMCEntity.g:5625:1: ( ',' )
            // InternalMCEntity.g:5626:2: ','
            {
             before(grammarAccess.getSelectorArgumentsAccess().getCommaKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectorArgumentsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group_1__0__Impl"


    // $ANTLR start "rule__SelectorArguments__Group_1__1"
    // InternalMCEntity.g:5635:1: rule__SelectorArguments__Group_1__1 : rule__SelectorArguments__Group_1__1__Impl ;
    public final void rule__SelectorArguments__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5639:1: ( rule__SelectorArguments__Group_1__1__Impl )
            // InternalMCEntity.g:5640:2: rule__SelectorArguments__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorArguments__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group_1__1"


    // $ANTLR start "rule__SelectorArguments__Group_1__1__Impl"
    // InternalMCEntity.g:5646:1: rule__SelectorArguments__Group_1__1__Impl : ( ( rule__SelectorArguments__FiltersAssignment_1_1 ) ) ;
    public final void rule__SelectorArguments__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5650:1: ( ( ( rule__SelectorArguments__FiltersAssignment_1_1 ) ) )
            // InternalMCEntity.g:5651:1: ( ( rule__SelectorArguments__FiltersAssignment_1_1 ) )
            {
            // InternalMCEntity.g:5651:1: ( ( rule__SelectorArguments__FiltersAssignment_1_1 ) )
            // InternalMCEntity.g:5652:2: ( rule__SelectorArguments__FiltersAssignment_1_1 )
            {
             before(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_1_1()); 
            // InternalMCEntity.g:5653:2: ( rule__SelectorArguments__FiltersAssignment_1_1 )
            // InternalMCEntity.g:5653:3: rule__SelectorArguments__FiltersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectorArguments__FiltersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorArgumentsAccess().getFiltersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__Group_1__1__Impl"


    // $ANTLR start "rule__SelectorFilter__Group__0"
    // InternalMCEntity.g:5662:1: rule__SelectorFilter__Group__0 : rule__SelectorFilter__Group__0__Impl rule__SelectorFilter__Group__1 ;
    public final void rule__SelectorFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5666:1: ( rule__SelectorFilter__Group__0__Impl rule__SelectorFilter__Group__1 )
            // InternalMCEntity.g:5667:2: rule__SelectorFilter__Group__0__Impl rule__SelectorFilter__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SelectorFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__0"


    // $ANTLR start "rule__SelectorFilter__Group__0__Impl"
    // InternalMCEntity.g:5674:1: rule__SelectorFilter__Group__0__Impl : ( ( rule__SelectorFilter__NameAssignment_0 ) ) ;
    public final void rule__SelectorFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5678:1: ( ( ( rule__SelectorFilter__NameAssignment_0 ) ) )
            // InternalMCEntity.g:5679:1: ( ( rule__SelectorFilter__NameAssignment_0 ) )
            {
            // InternalMCEntity.g:5679:1: ( ( rule__SelectorFilter__NameAssignment_0 ) )
            // InternalMCEntity.g:5680:2: ( rule__SelectorFilter__NameAssignment_0 )
            {
             before(grammarAccess.getSelectorFilterAccess().getNameAssignment_0()); 
            // InternalMCEntity.g:5681:2: ( rule__SelectorFilter__NameAssignment_0 )
            // InternalMCEntity.g:5681:3: rule__SelectorFilter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorFilter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorFilterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__0__Impl"


    // $ANTLR start "rule__SelectorFilter__Group__1"
    // InternalMCEntity.g:5689:1: rule__SelectorFilter__Group__1 : rule__SelectorFilter__Group__1__Impl rule__SelectorFilter__Group__2 ;
    public final void rule__SelectorFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5693:1: ( rule__SelectorFilter__Group__1__Impl rule__SelectorFilter__Group__2 )
            // InternalMCEntity.g:5694:2: rule__SelectorFilter__Group__1__Impl rule__SelectorFilter__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SelectorFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__1"


    // $ANTLR start "rule__SelectorFilter__Group__1__Impl"
    // InternalMCEntity.g:5701:1: rule__SelectorFilter__Group__1__Impl : ( '=' ) ;
    public final void rule__SelectorFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5705:1: ( ( '=' ) )
            // InternalMCEntity.g:5706:1: ( '=' )
            {
            // InternalMCEntity.g:5706:1: ( '=' )
            // InternalMCEntity.g:5707:2: '='
            {
             before(grammarAccess.getSelectorFilterAccess().getEqualsSignKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectorFilterAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__1__Impl"


    // $ANTLR start "rule__SelectorFilter__Group__2"
    // InternalMCEntity.g:5716:1: rule__SelectorFilter__Group__2 : rule__SelectorFilter__Group__2__Impl rule__SelectorFilter__Group__3 ;
    public final void rule__SelectorFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5720:1: ( rule__SelectorFilter__Group__2__Impl rule__SelectorFilter__Group__3 )
            // InternalMCEntity.g:5721:2: rule__SelectorFilter__Group__2__Impl rule__SelectorFilter__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SelectorFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__2"


    // $ANTLR start "rule__SelectorFilter__Group__2__Impl"
    // InternalMCEntity.g:5728:1: rule__SelectorFilter__Group__2__Impl : ( ( rule__SelectorFilter__InvertedAssignment_2 )? ) ;
    public final void rule__SelectorFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5732:1: ( ( ( rule__SelectorFilter__InvertedAssignment_2 )? ) )
            // InternalMCEntity.g:5733:1: ( ( rule__SelectorFilter__InvertedAssignment_2 )? )
            {
            // InternalMCEntity.g:5733:1: ( ( rule__SelectorFilter__InvertedAssignment_2 )? )
            // InternalMCEntity.g:5734:2: ( rule__SelectorFilter__InvertedAssignment_2 )?
            {
             before(grammarAccess.getSelectorFilterAccess().getInvertedAssignment_2()); 
            // InternalMCEntity.g:5735:2: ( rule__SelectorFilter__InvertedAssignment_2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==50) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMCEntity.g:5735:3: rule__SelectorFilter__InvertedAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectorFilter__InvertedAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorFilterAccess().getInvertedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__2__Impl"


    // $ANTLR start "rule__SelectorFilter__Group__3"
    // InternalMCEntity.g:5743:1: rule__SelectorFilter__Group__3 : rule__SelectorFilter__Group__3__Impl ;
    public final void rule__SelectorFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5747:1: ( rule__SelectorFilter__Group__3__Impl )
            // InternalMCEntity.g:5748:2: rule__SelectorFilter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorFilter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__3"


    // $ANTLR start "rule__SelectorFilter__Group__3__Impl"
    // InternalMCEntity.g:5754:1: rule__SelectorFilter__Group__3__Impl : ( ( rule__SelectorFilter__ValueAssignment_3 ) ) ;
    public final void rule__SelectorFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5758:1: ( ( ( rule__SelectorFilter__ValueAssignment_3 ) ) )
            // InternalMCEntity.g:5759:1: ( ( rule__SelectorFilter__ValueAssignment_3 ) )
            {
            // InternalMCEntity.g:5759:1: ( ( rule__SelectorFilter__ValueAssignment_3 ) )
            // InternalMCEntity.g:5760:2: ( rule__SelectorFilter__ValueAssignment_3 )
            {
             before(grammarAccess.getSelectorFilterAccess().getValueAssignment_3()); 
            // InternalMCEntity.g:5761:2: ( rule__SelectorFilter__ValueAssignment_3 )
            // InternalMCEntity.g:5761:3: rule__SelectorFilter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectorFilter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectorFilterAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__Group__3__Impl"


    // $ANTLR start "rule__IntRange__Group_0__0"
    // InternalMCEntity.g:5770:1: rule__IntRange__Group_0__0 : rule__IntRange__Group_0__0__Impl rule__IntRange__Group_0__1 ;
    public final void rule__IntRange__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5774:1: ( rule__IntRange__Group_0__0__Impl rule__IntRange__Group_0__1 )
            // InternalMCEntity.g:5775:2: rule__IntRange__Group_0__0__Impl rule__IntRange__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__IntRange__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__0"


    // $ANTLR start "rule__IntRange__Group_0__0__Impl"
    // InternalMCEntity.g:5782:1: rule__IntRange__Group_0__0__Impl : ( () ) ;
    public final void rule__IntRange__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5786:1: ( ( () ) )
            // InternalMCEntity.g:5787:1: ( () )
            {
            // InternalMCEntity.g:5787:1: ( () )
            // InternalMCEntity.g:5788:2: ()
            {
             before(grammarAccess.getIntRangeAccess().getClosedIntRangeAction_0_0()); 
            // InternalMCEntity.g:5789:2: ()
            // InternalMCEntity.g:5789:3: 
            {
            }

             after(grammarAccess.getIntRangeAccess().getClosedIntRangeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__0__Impl"


    // $ANTLR start "rule__IntRange__Group_0__1"
    // InternalMCEntity.g:5797:1: rule__IntRange__Group_0__1 : rule__IntRange__Group_0__1__Impl rule__IntRange__Group_0__2 ;
    public final void rule__IntRange__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5801:1: ( rule__IntRange__Group_0__1__Impl rule__IntRange__Group_0__2 )
            // InternalMCEntity.g:5802:2: rule__IntRange__Group_0__1__Impl rule__IntRange__Group_0__2
            {
            pushFollow(FOLLOW_34);
            rule__IntRange__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__1"


    // $ANTLR start "rule__IntRange__Group_0__1__Impl"
    // InternalMCEntity.g:5809:1: rule__IntRange__Group_0__1__Impl : ( ( rule__IntRange__BeginAssignment_0_1 ) ) ;
    public final void rule__IntRange__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5813:1: ( ( ( rule__IntRange__BeginAssignment_0_1 ) ) )
            // InternalMCEntity.g:5814:1: ( ( rule__IntRange__BeginAssignment_0_1 ) )
            {
            // InternalMCEntity.g:5814:1: ( ( rule__IntRange__BeginAssignment_0_1 ) )
            // InternalMCEntity.g:5815:2: ( rule__IntRange__BeginAssignment_0_1 )
            {
             before(grammarAccess.getIntRangeAccess().getBeginAssignment_0_1()); 
            // InternalMCEntity.g:5816:2: ( rule__IntRange__BeginAssignment_0_1 )
            // InternalMCEntity.g:5816:3: rule__IntRange__BeginAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__BeginAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIntRangeAccess().getBeginAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__1__Impl"


    // $ANTLR start "rule__IntRange__Group_0__2"
    // InternalMCEntity.g:5824:1: rule__IntRange__Group_0__2 : rule__IntRange__Group_0__2__Impl rule__IntRange__Group_0__3 ;
    public final void rule__IntRange__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5828:1: ( rule__IntRange__Group_0__2__Impl rule__IntRange__Group_0__3 )
            // InternalMCEntity.g:5829:2: rule__IntRange__Group_0__2__Impl rule__IntRange__Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__IntRange__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__2"


    // $ANTLR start "rule__IntRange__Group_0__2__Impl"
    // InternalMCEntity.g:5836:1: rule__IntRange__Group_0__2__Impl : ( '..' ) ;
    public final void rule__IntRange__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5840:1: ( ( '..' ) )
            // InternalMCEntity.g:5841:1: ( '..' )
            {
            // InternalMCEntity.g:5841:1: ( '..' )
            // InternalMCEntity.g:5842:2: '..'
            {
             before(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_0_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__2__Impl"


    // $ANTLR start "rule__IntRange__Group_0__3"
    // InternalMCEntity.g:5851:1: rule__IntRange__Group_0__3 : rule__IntRange__Group_0__3__Impl ;
    public final void rule__IntRange__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5855:1: ( rule__IntRange__Group_0__3__Impl )
            // InternalMCEntity.g:5856:2: rule__IntRange__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__3"


    // $ANTLR start "rule__IntRange__Group_0__3__Impl"
    // InternalMCEntity.g:5862:1: rule__IntRange__Group_0__3__Impl : ( ( rule__IntRange__EndAssignment_0_3 ) ) ;
    public final void rule__IntRange__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5866:1: ( ( ( rule__IntRange__EndAssignment_0_3 ) ) )
            // InternalMCEntity.g:5867:1: ( ( rule__IntRange__EndAssignment_0_3 ) )
            {
            // InternalMCEntity.g:5867:1: ( ( rule__IntRange__EndAssignment_0_3 ) )
            // InternalMCEntity.g:5868:2: ( rule__IntRange__EndAssignment_0_3 )
            {
             before(grammarAccess.getIntRangeAccess().getEndAssignment_0_3()); 
            // InternalMCEntity.g:5869:2: ( rule__IntRange__EndAssignment_0_3 )
            // InternalMCEntity.g:5869:3: rule__IntRange__EndAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__EndAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getIntRangeAccess().getEndAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_0__3__Impl"


    // $ANTLR start "rule__IntRange__Group_1__0"
    // InternalMCEntity.g:5878:1: rule__IntRange__Group_1__0 : rule__IntRange__Group_1__0__Impl rule__IntRange__Group_1__1 ;
    public final void rule__IntRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5882:1: ( rule__IntRange__Group_1__0__Impl rule__IntRange__Group_1__1 )
            // InternalMCEntity.g:5883:2: rule__IntRange__Group_1__0__Impl rule__IntRange__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__IntRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__0"


    // $ANTLR start "rule__IntRange__Group_1__0__Impl"
    // InternalMCEntity.g:5890:1: rule__IntRange__Group_1__0__Impl : ( () ) ;
    public final void rule__IntRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5894:1: ( ( () ) )
            // InternalMCEntity.g:5895:1: ( () )
            {
            // InternalMCEntity.g:5895:1: ( () )
            // InternalMCEntity.g:5896:2: ()
            {
             before(grammarAccess.getIntRangeAccess().getOpenEndedIntRangeAction_1_0()); 
            // InternalMCEntity.g:5897:2: ()
            // InternalMCEntity.g:5897:3: 
            {
            }

             after(grammarAccess.getIntRangeAccess().getOpenEndedIntRangeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__0__Impl"


    // $ANTLR start "rule__IntRange__Group_1__1"
    // InternalMCEntity.g:5905:1: rule__IntRange__Group_1__1 : rule__IntRange__Group_1__1__Impl rule__IntRange__Group_1__2 ;
    public final void rule__IntRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5909:1: ( rule__IntRange__Group_1__1__Impl rule__IntRange__Group_1__2 )
            // InternalMCEntity.g:5910:2: rule__IntRange__Group_1__1__Impl rule__IntRange__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__IntRange__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__1"


    // $ANTLR start "rule__IntRange__Group_1__1__Impl"
    // InternalMCEntity.g:5917:1: rule__IntRange__Group_1__1__Impl : ( ( rule__IntRange__BeginAssignment_1_1 ) ) ;
    public final void rule__IntRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5921:1: ( ( ( rule__IntRange__BeginAssignment_1_1 ) ) )
            // InternalMCEntity.g:5922:1: ( ( rule__IntRange__BeginAssignment_1_1 ) )
            {
            // InternalMCEntity.g:5922:1: ( ( rule__IntRange__BeginAssignment_1_1 ) )
            // InternalMCEntity.g:5923:2: ( rule__IntRange__BeginAssignment_1_1 )
            {
             before(grammarAccess.getIntRangeAccess().getBeginAssignment_1_1()); 
            // InternalMCEntity.g:5924:2: ( rule__IntRange__BeginAssignment_1_1 )
            // InternalMCEntity.g:5924:3: rule__IntRange__BeginAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__BeginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntRangeAccess().getBeginAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__1__Impl"


    // $ANTLR start "rule__IntRange__Group_1__2"
    // InternalMCEntity.g:5932:1: rule__IntRange__Group_1__2 : rule__IntRange__Group_1__2__Impl ;
    public final void rule__IntRange__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5936:1: ( rule__IntRange__Group_1__2__Impl )
            // InternalMCEntity.g:5937:2: rule__IntRange__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__2"


    // $ANTLR start "rule__IntRange__Group_1__2__Impl"
    // InternalMCEntity.g:5943:1: rule__IntRange__Group_1__2__Impl : ( '..' ) ;
    public final void rule__IntRange__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5947:1: ( ( '..' ) )
            // InternalMCEntity.g:5948:1: ( '..' )
            {
            // InternalMCEntity.g:5948:1: ( '..' )
            // InternalMCEntity.g:5949:2: '..'
            {
             before(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_1_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_1__2__Impl"


    // $ANTLR start "rule__IntRange__Group_2__0"
    // InternalMCEntity.g:5959:1: rule__IntRange__Group_2__0 : rule__IntRange__Group_2__0__Impl rule__IntRange__Group_2__1 ;
    public final void rule__IntRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5963:1: ( rule__IntRange__Group_2__0__Impl rule__IntRange__Group_2__1 )
            // InternalMCEntity.g:5964:2: rule__IntRange__Group_2__0__Impl rule__IntRange__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__IntRange__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__0"


    // $ANTLR start "rule__IntRange__Group_2__0__Impl"
    // InternalMCEntity.g:5971:1: rule__IntRange__Group_2__0__Impl : ( () ) ;
    public final void rule__IntRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5975:1: ( ( () ) )
            // InternalMCEntity.g:5976:1: ( () )
            {
            // InternalMCEntity.g:5976:1: ( () )
            // InternalMCEntity.g:5977:2: ()
            {
             before(grammarAccess.getIntRangeAccess().getOpenBeginningIntRangeAction_2_0()); 
            // InternalMCEntity.g:5978:2: ()
            // InternalMCEntity.g:5978:3: 
            {
            }

             after(grammarAccess.getIntRangeAccess().getOpenBeginningIntRangeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__0__Impl"


    // $ANTLR start "rule__IntRange__Group_2__1"
    // InternalMCEntity.g:5986:1: rule__IntRange__Group_2__1 : rule__IntRange__Group_2__1__Impl rule__IntRange__Group_2__2 ;
    public final void rule__IntRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:5990:1: ( rule__IntRange__Group_2__1__Impl rule__IntRange__Group_2__2 )
            // InternalMCEntity.g:5991:2: rule__IntRange__Group_2__1__Impl rule__IntRange__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__IntRange__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntRange__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__1"


    // $ANTLR start "rule__IntRange__Group_2__1__Impl"
    // InternalMCEntity.g:5998:1: rule__IntRange__Group_2__1__Impl : ( '..' ) ;
    public final void rule__IntRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6002:1: ( ( '..' ) )
            // InternalMCEntity.g:6003:1: ( '..' )
            {
            // InternalMCEntity.g:6003:1: ( '..' )
            // InternalMCEntity.g:6004:2: '..'
            {
             before(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_2_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getFullStopFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__1__Impl"


    // $ANTLR start "rule__IntRange__Group_2__2"
    // InternalMCEntity.g:6013:1: rule__IntRange__Group_2__2 : rule__IntRange__Group_2__2__Impl ;
    public final void rule__IntRange__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6017:1: ( rule__IntRange__Group_2__2__Impl )
            // InternalMCEntity.g:6018:2: rule__IntRange__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__2"


    // $ANTLR start "rule__IntRange__Group_2__2__Impl"
    // InternalMCEntity.g:6024:1: rule__IntRange__Group_2__2__Impl : ( ( rule__IntRange__EndAssignment_2_2 ) ) ;
    public final void rule__IntRange__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6028:1: ( ( ( rule__IntRange__EndAssignment_2_2 ) ) )
            // InternalMCEntity.g:6029:1: ( ( rule__IntRange__EndAssignment_2_2 ) )
            {
            // InternalMCEntity.g:6029:1: ( ( rule__IntRange__EndAssignment_2_2 ) )
            // InternalMCEntity.g:6030:2: ( rule__IntRange__EndAssignment_2_2 )
            {
             before(grammarAccess.getIntRangeAccess().getEndAssignment_2_2()); 
            // InternalMCEntity.g:6031:2: ( rule__IntRange__EndAssignment_2_2 )
            // InternalMCEntity.g:6031:3: rule__IntRange__EndAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__IntRange__EndAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIntRangeAccess().getEndAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__Group_2__2__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0__0"
    // InternalMCEntity.g:6040:1: rule__DoubleRange__Group_0__0 : rule__DoubleRange__Group_0__0__Impl rule__DoubleRange__Group_0__1 ;
    public final void rule__DoubleRange__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6044:1: ( rule__DoubleRange__Group_0__0__Impl rule__DoubleRange__Group_0__1 )
            // InternalMCEntity.g:6045:2: rule__DoubleRange__Group_0__0__Impl rule__DoubleRange__Group_0__1
            {
            pushFollow(FOLLOW_36);
            rule__DoubleRange__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0__0"


    // $ANTLR start "rule__DoubleRange__Group_0__0__Impl"
    // InternalMCEntity.g:6052:1: rule__DoubleRange__Group_0__0__Impl : ( () ) ;
    public final void rule__DoubleRange__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6056:1: ( ( () ) )
            // InternalMCEntity.g:6057:1: ( () )
            {
            // InternalMCEntity.g:6057:1: ( () )
            // InternalMCEntity.g:6058:2: ()
            {
             before(grammarAccess.getDoubleRangeAccess().getClosedDoubleRangeAction_0_0()); 
            // InternalMCEntity.g:6059:2: ()
            // InternalMCEntity.g:6059:3: 
            {
            }

             after(grammarAccess.getDoubleRangeAccess().getClosedDoubleRangeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0__0__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0__1"
    // InternalMCEntity.g:6067:1: rule__DoubleRange__Group_0__1 : rule__DoubleRange__Group_0__1__Impl ;
    public final void rule__DoubleRange__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6071:1: ( rule__DoubleRange__Group_0__1__Impl )
            // InternalMCEntity.g:6072:2: rule__DoubleRange__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0__1"


    // $ANTLR start "rule__DoubleRange__Group_0__1__Impl"
    // InternalMCEntity.g:6078:1: rule__DoubleRange__Group_0__1__Impl : ( ( rule__DoubleRange__Alternatives_0_1 ) ) ;
    public final void rule__DoubleRange__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6082:1: ( ( ( rule__DoubleRange__Alternatives_0_1 ) ) )
            // InternalMCEntity.g:6083:1: ( ( rule__DoubleRange__Alternatives_0_1 ) )
            {
            // InternalMCEntity.g:6083:1: ( ( rule__DoubleRange__Alternatives_0_1 ) )
            // InternalMCEntity.g:6084:2: ( rule__DoubleRange__Alternatives_0_1 )
            {
             before(grammarAccess.getDoubleRangeAccess().getAlternatives_0_1()); 
            // InternalMCEntity.g:6085:2: ( rule__DoubleRange__Alternatives_0_1 )
            // InternalMCEntity.g:6085:3: rule__DoubleRange__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0__1__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__0"
    // InternalMCEntity.g:6094:1: rule__DoubleRange__Group_0_1_0__0 : rule__DoubleRange__Group_0_1_0__0__Impl rule__DoubleRange__Group_0_1_0__1 ;
    public final void rule__DoubleRange__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6098:1: ( rule__DoubleRange__Group_0_1_0__0__Impl rule__DoubleRange__Group_0_1_0__1 )
            // InternalMCEntity.g:6099:2: rule__DoubleRange__Group_0_1_0__0__Impl rule__DoubleRange__Group_0_1_0__1
            {
            pushFollow(FOLLOW_34);
            rule__DoubleRange__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__0"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__0__Impl"
    // InternalMCEntity.g:6106:1: rule__DoubleRange__Group_0_1_0__0__Impl : ( ( rule__DoubleRange__BeginAssignment_0_1_0_0 ) ) ;
    public final void rule__DoubleRange__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6110:1: ( ( ( rule__DoubleRange__BeginAssignment_0_1_0_0 ) ) )
            // InternalMCEntity.g:6111:1: ( ( rule__DoubleRange__BeginAssignment_0_1_0_0 ) )
            {
            // InternalMCEntity.g:6111:1: ( ( rule__DoubleRange__BeginAssignment_0_1_0_0 ) )
            // InternalMCEntity.g:6112:2: ( rule__DoubleRange__BeginAssignment_0_1_0_0 )
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_0_0()); 
            // InternalMCEntity.g:6113:2: ( rule__DoubleRange__BeginAssignment_0_1_0_0 )
            // InternalMCEntity.g:6113:3: rule__DoubleRange__BeginAssignment_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__BeginAssignment_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__1"
    // InternalMCEntity.g:6121:1: rule__DoubleRange__Group_0_1_0__1 : rule__DoubleRange__Group_0_1_0__1__Impl rule__DoubleRange__Group_0_1_0__2 ;
    public final void rule__DoubleRange__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6125:1: ( rule__DoubleRange__Group_0_1_0__1__Impl rule__DoubleRange__Group_0_1_0__2 )
            // InternalMCEntity.g:6126:2: rule__DoubleRange__Group_0_1_0__1__Impl rule__DoubleRange__Group_0_1_0__2
            {
            pushFollow(FOLLOW_37);
            rule__DoubleRange__Group_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__1"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__1__Impl"
    // InternalMCEntity.g:6133:1: rule__DoubleRange__Group_0_1_0__1__Impl : ( '..' ) ;
    public final void rule__DoubleRange__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6137:1: ( ( '..' ) )
            // InternalMCEntity.g:6138:1: ( '..' )
            {
            // InternalMCEntity.g:6138:1: ( '..' )
            // InternalMCEntity.g:6139:2: '..'
            {
             before(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_0_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__2"
    // InternalMCEntity.g:6148:1: rule__DoubleRange__Group_0_1_0__2 : rule__DoubleRange__Group_0_1_0__2__Impl ;
    public final void rule__DoubleRange__Group_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6152:1: ( rule__DoubleRange__Group_0_1_0__2__Impl )
            // InternalMCEntity.g:6153:2: rule__DoubleRange__Group_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__2"


    // $ANTLR start "rule__DoubleRange__Group_0_1_0__2__Impl"
    // InternalMCEntity.g:6159:1: rule__DoubleRange__Group_0_1_0__2__Impl : ( ( rule__DoubleRange__EndAssignment_0_1_0_2 ) ) ;
    public final void rule__DoubleRange__Group_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6163:1: ( ( ( rule__DoubleRange__EndAssignment_0_1_0_2 ) ) )
            // InternalMCEntity.g:6164:1: ( ( rule__DoubleRange__EndAssignment_0_1_0_2 ) )
            {
            // InternalMCEntity.g:6164:1: ( ( rule__DoubleRange__EndAssignment_0_1_0_2 ) )
            // InternalMCEntity.g:6165:2: ( rule__DoubleRange__EndAssignment_0_1_0_2 )
            {
             before(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_0_2()); 
            // InternalMCEntity.g:6166:2: ( rule__DoubleRange__EndAssignment_0_1_0_2 )
            // InternalMCEntity.g:6166:3: rule__DoubleRange__EndAssignment_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__EndAssignment_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_0__2__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__0"
    // InternalMCEntity.g:6175:1: rule__DoubleRange__Group_0_1_1__0 : rule__DoubleRange__Group_0_1_1__0__Impl rule__DoubleRange__Group_0_1_1__1 ;
    public final void rule__DoubleRange__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6179:1: ( rule__DoubleRange__Group_0_1_1__0__Impl rule__DoubleRange__Group_0_1_1__1 )
            // InternalMCEntity.g:6180:2: rule__DoubleRange__Group_0_1_1__0__Impl rule__DoubleRange__Group_0_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__DoubleRange__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__0"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__0__Impl"
    // InternalMCEntity.g:6187:1: rule__DoubleRange__Group_0_1_1__0__Impl : ( ( rule__DoubleRange__BeginAssignment_0_1_1_0 ) ) ;
    public final void rule__DoubleRange__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6191:1: ( ( ( rule__DoubleRange__BeginAssignment_0_1_1_0 ) ) )
            // InternalMCEntity.g:6192:1: ( ( rule__DoubleRange__BeginAssignment_0_1_1_0 ) )
            {
            // InternalMCEntity.g:6192:1: ( ( rule__DoubleRange__BeginAssignment_0_1_1_0 ) )
            // InternalMCEntity.g:6193:2: ( rule__DoubleRange__BeginAssignment_0_1_1_0 )
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_1_0()); 
            // InternalMCEntity.g:6194:2: ( rule__DoubleRange__BeginAssignment_0_1_1_0 )
            // InternalMCEntity.g:6194:3: rule__DoubleRange__BeginAssignment_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__BeginAssignment_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getBeginAssignment_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__1"
    // InternalMCEntity.g:6202:1: rule__DoubleRange__Group_0_1_1__1 : rule__DoubleRange__Group_0_1_1__1__Impl rule__DoubleRange__Group_0_1_1__2 ;
    public final void rule__DoubleRange__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6206:1: ( rule__DoubleRange__Group_0_1_1__1__Impl rule__DoubleRange__Group_0_1_1__2 )
            // InternalMCEntity.g:6207:2: rule__DoubleRange__Group_0_1_1__1__Impl rule__DoubleRange__Group_0_1_1__2
            {
            pushFollow(FOLLOW_36);
            rule__DoubleRange__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__1"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__1__Impl"
    // InternalMCEntity.g:6214:1: rule__DoubleRange__Group_0_1_1__1__Impl : ( '..' ) ;
    public final void rule__DoubleRange__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6218:1: ( ( '..' ) )
            // InternalMCEntity.g:6219:1: ( '..' )
            {
            // InternalMCEntity.g:6219:1: ( '..' )
            // InternalMCEntity.g:6220:2: '..'
            {
             before(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__2"
    // InternalMCEntity.g:6229:1: rule__DoubleRange__Group_0_1_1__2 : rule__DoubleRange__Group_0_1_1__2__Impl ;
    public final void rule__DoubleRange__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6233:1: ( rule__DoubleRange__Group_0_1_1__2__Impl )
            // InternalMCEntity.g:6234:2: rule__DoubleRange__Group_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__2"


    // $ANTLR start "rule__DoubleRange__Group_0_1_1__2__Impl"
    // InternalMCEntity.g:6240:1: rule__DoubleRange__Group_0_1_1__2__Impl : ( ( rule__DoubleRange__EndAssignment_0_1_1_2 ) ) ;
    public final void rule__DoubleRange__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6244:1: ( ( ( rule__DoubleRange__EndAssignment_0_1_1_2 ) ) )
            // InternalMCEntity.g:6245:1: ( ( rule__DoubleRange__EndAssignment_0_1_1_2 ) )
            {
            // InternalMCEntity.g:6245:1: ( ( rule__DoubleRange__EndAssignment_0_1_1_2 ) )
            // InternalMCEntity.g:6246:2: ( rule__DoubleRange__EndAssignment_0_1_1_2 )
            {
             before(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_1_2()); 
            // InternalMCEntity.g:6247:2: ( rule__DoubleRange__EndAssignment_0_1_1_2 )
            // InternalMCEntity.g:6247:3: rule__DoubleRange__EndAssignment_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__EndAssignment_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getEndAssignment_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_0_1_1__2__Impl"


    // $ANTLR start "rule__DoubleRange__Group_1__0"
    // InternalMCEntity.g:6256:1: rule__DoubleRange__Group_1__0 : rule__DoubleRange__Group_1__0__Impl rule__DoubleRange__Group_1__1 ;
    public final void rule__DoubleRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6260:1: ( rule__DoubleRange__Group_1__0__Impl rule__DoubleRange__Group_1__1 )
            // InternalMCEntity.g:6261:2: rule__DoubleRange__Group_1__0__Impl rule__DoubleRange__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__DoubleRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__0"


    // $ANTLR start "rule__DoubleRange__Group_1__0__Impl"
    // InternalMCEntity.g:6268:1: rule__DoubleRange__Group_1__0__Impl : ( () ) ;
    public final void rule__DoubleRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6272:1: ( ( () ) )
            // InternalMCEntity.g:6273:1: ( () )
            {
            // InternalMCEntity.g:6273:1: ( () )
            // InternalMCEntity.g:6274:2: ()
            {
             before(grammarAccess.getDoubleRangeAccess().getOpenEndedDoubleRangeAction_1_0()); 
            // InternalMCEntity.g:6275:2: ()
            // InternalMCEntity.g:6275:3: 
            {
            }

             after(grammarAccess.getDoubleRangeAccess().getOpenEndedDoubleRangeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__0__Impl"


    // $ANTLR start "rule__DoubleRange__Group_1__1"
    // InternalMCEntity.g:6283:1: rule__DoubleRange__Group_1__1 : rule__DoubleRange__Group_1__1__Impl rule__DoubleRange__Group_1__2 ;
    public final void rule__DoubleRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6287:1: ( rule__DoubleRange__Group_1__1__Impl rule__DoubleRange__Group_1__2 )
            // InternalMCEntity.g:6288:2: rule__DoubleRange__Group_1__1__Impl rule__DoubleRange__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__DoubleRange__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__1"


    // $ANTLR start "rule__DoubleRange__Group_1__1__Impl"
    // InternalMCEntity.g:6295:1: rule__DoubleRange__Group_1__1__Impl : ( ( rule__DoubleRange__BeginAssignment_1_1 ) ) ;
    public final void rule__DoubleRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6299:1: ( ( ( rule__DoubleRange__BeginAssignment_1_1 ) ) )
            // InternalMCEntity.g:6300:1: ( ( rule__DoubleRange__BeginAssignment_1_1 ) )
            {
            // InternalMCEntity.g:6300:1: ( ( rule__DoubleRange__BeginAssignment_1_1 ) )
            // InternalMCEntity.g:6301:2: ( rule__DoubleRange__BeginAssignment_1_1 )
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginAssignment_1_1()); 
            // InternalMCEntity.g:6302:2: ( rule__DoubleRange__BeginAssignment_1_1 )
            // InternalMCEntity.g:6302:3: rule__DoubleRange__BeginAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__BeginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getBeginAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__1__Impl"


    // $ANTLR start "rule__DoubleRange__Group_1__2"
    // InternalMCEntity.g:6310:1: rule__DoubleRange__Group_1__2 : rule__DoubleRange__Group_1__2__Impl ;
    public final void rule__DoubleRange__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6314:1: ( rule__DoubleRange__Group_1__2__Impl )
            // InternalMCEntity.g:6315:2: rule__DoubleRange__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__2"


    // $ANTLR start "rule__DoubleRange__Group_1__2__Impl"
    // InternalMCEntity.g:6321:1: rule__DoubleRange__Group_1__2__Impl : ( '..' ) ;
    public final void rule__DoubleRange__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6325:1: ( ( '..' ) )
            // InternalMCEntity.g:6326:1: ( '..' )
            {
            // InternalMCEntity.g:6326:1: ( '..' )
            // InternalMCEntity.g:6327:2: '..'
            {
             before(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_1_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_1__2__Impl"


    // $ANTLR start "rule__DoubleRange__Group_2__0"
    // InternalMCEntity.g:6337:1: rule__DoubleRange__Group_2__0 : rule__DoubleRange__Group_2__0__Impl rule__DoubleRange__Group_2__1 ;
    public final void rule__DoubleRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6341:1: ( rule__DoubleRange__Group_2__0__Impl rule__DoubleRange__Group_2__1 )
            // InternalMCEntity.g:6342:2: rule__DoubleRange__Group_2__0__Impl rule__DoubleRange__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__DoubleRange__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__0"


    // $ANTLR start "rule__DoubleRange__Group_2__0__Impl"
    // InternalMCEntity.g:6349:1: rule__DoubleRange__Group_2__0__Impl : ( () ) ;
    public final void rule__DoubleRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6353:1: ( ( () ) )
            // InternalMCEntity.g:6354:1: ( () )
            {
            // InternalMCEntity.g:6354:1: ( () )
            // InternalMCEntity.g:6355:2: ()
            {
             before(grammarAccess.getDoubleRangeAccess().getOpenBeginningDoubleRangeAction_2_0()); 
            // InternalMCEntity.g:6356:2: ()
            // InternalMCEntity.g:6356:3: 
            {
            }

             after(grammarAccess.getDoubleRangeAccess().getOpenBeginningDoubleRangeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__0__Impl"


    // $ANTLR start "rule__DoubleRange__Group_2__1"
    // InternalMCEntity.g:6364:1: rule__DoubleRange__Group_2__1 : rule__DoubleRange__Group_2__1__Impl rule__DoubleRange__Group_2__2 ;
    public final void rule__DoubleRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6368:1: ( rule__DoubleRange__Group_2__1__Impl rule__DoubleRange__Group_2__2 )
            // InternalMCEntity.g:6369:2: rule__DoubleRange__Group_2__1__Impl rule__DoubleRange__Group_2__2
            {
            pushFollow(FOLLOW_37);
            rule__DoubleRange__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__1"


    // $ANTLR start "rule__DoubleRange__Group_2__1__Impl"
    // InternalMCEntity.g:6376:1: rule__DoubleRange__Group_2__1__Impl : ( '..' ) ;
    public final void rule__DoubleRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6380:1: ( ( '..' ) )
            // InternalMCEntity.g:6381:1: ( '..' )
            {
            // InternalMCEntity.g:6381:1: ( '..' )
            // InternalMCEntity.g:6382:2: '..'
            {
             before(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_2_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getFullStopFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__1__Impl"


    // $ANTLR start "rule__DoubleRange__Group_2__2"
    // InternalMCEntity.g:6391:1: rule__DoubleRange__Group_2__2 : rule__DoubleRange__Group_2__2__Impl ;
    public final void rule__DoubleRange__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6395:1: ( rule__DoubleRange__Group_2__2__Impl )
            // InternalMCEntity.g:6396:2: rule__DoubleRange__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__2"


    // $ANTLR start "rule__DoubleRange__Group_2__2__Impl"
    // InternalMCEntity.g:6402:1: rule__DoubleRange__Group_2__2__Impl : ( ( rule__DoubleRange__EndAssignment_2_2 ) ) ;
    public final void rule__DoubleRange__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6406:1: ( ( ( rule__DoubleRange__EndAssignment_2_2 ) ) )
            // InternalMCEntity.g:6407:1: ( ( rule__DoubleRange__EndAssignment_2_2 ) )
            {
            // InternalMCEntity.g:6407:1: ( ( rule__DoubleRange__EndAssignment_2_2 ) )
            // InternalMCEntity.g:6408:2: ( rule__DoubleRange__EndAssignment_2_2 )
            {
             before(grammarAccess.getDoubleRangeAccess().getEndAssignment_2_2()); 
            // InternalMCEntity.g:6409:2: ( rule__DoubleRange__EndAssignment_2_2 )
            // InternalMCEntity.g:6409:3: rule__DoubleRange__EndAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleRange__EndAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleRangeAccess().getEndAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__Group_2__2__Impl"


    // $ANTLR start "rule__BoolSelectorValue__Group_1__0"
    // InternalMCEntity.g:6418:1: rule__BoolSelectorValue__Group_1__0 : rule__BoolSelectorValue__Group_1__0__Impl rule__BoolSelectorValue__Group_1__1 ;
    public final void rule__BoolSelectorValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6422:1: ( rule__BoolSelectorValue__Group_1__0__Impl rule__BoolSelectorValue__Group_1__1 )
            // InternalMCEntity.g:6423:2: rule__BoolSelectorValue__Group_1__0__Impl rule__BoolSelectorValue__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__BoolSelectorValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolSelectorValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolSelectorValue__Group_1__0"


    // $ANTLR start "rule__BoolSelectorValue__Group_1__0__Impl"
    // InternalMCEntity.g:6430:1: rule__BoolSelectorValue__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__BoolSelectorValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6434:1: ( ( 'false' ) )
            // InternalMCEntity.g:6435:1: ( 'false' )
            {
            // InternalMCEntity.g:6435:1: ( 'false' )
            // InternalMCEntity.g:6436:2: 'false'
            {
             before(grammarAccess.getBoolSelectorValueAccess().getFalseKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBoolSelectorValueAccess().getFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolSelectorValue__Group_1__0__Impl"


    // $ANTLR start "rule__BoolSelectorValue__Group_1__1"
    // InternalMCEntity.g:6445:1: rule__BoolSelectorValue__Group_1__1 : rule__BoolSelectorValue__Group_1__1__Impl ;
    public final void rule__BoolSelectorValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6449:1: ( rule__BoolSelectorValue__Group_1__1__Impl )
            // InternalMCEntity.g:6450:2: rule__BoolSelectorValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolSelectorValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolSelectorValue__Group_1__1"


    // $ANTLR start "rule__BoolSelectorValue__Group_1__1__Impl"
    // InternalMCEntity.g:6456:1: rule__BoolSelectorValue__Group_1__1__Impl : ( () ) ;
    public final void rule__BoolSelectorValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6460:1: ( ( () ) )
            // InternalMCEntity.g:6461:1: ( () )
            {
            // InternalMCEntity.g:6461:1: ( () )
            // InternalMCEntity.g:6462:2: ()
            {
             before(grammarAccess.getBoolSelectorValueAccess().getBoolSelectorValueAction_1_1()); 
            // InternalMCEntity.g:6463:2: ()
            // InternalMCEntity.g:6463:3: 
            {
            }

             after(grammarAccess.getBoolSelectorValueAccess().getBoolSelectorValueAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolSelectorValue__Group_1__1__Impl"


    // $ANTLR start "rule__NamespacedKey__Group__0"
    // InternalMCEntity.g:6472:1: rule__NamespacedKey__Group__0 : rule__NamespacedKey__Group__0__Impl rule__NamespacedKey__Group__1 ;
    public final void rule__NamespacedKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6476:1: ( rule__NamespacedKey__Group__0__Impl rule__NamespacedKey__Group__1 )
            // InternalMCEntity.g:6477:2: rule__NamespacedKey__Group__0__Impl rule__NamespacedKey__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NamespacedKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__0"


    // $ANTLR start "rule__NamespacedKey__Group__0__Impl"
    // InternalMCEntity.g:6484:1: rule__NamespacedKey__Group__0__Impl : ( ( rule__NamespacedKey__NamespaceAssignment_0 ) ) ;
    public final void rule__NamespacedKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6488:1: ( ( ( rule__NamespacedKey__NamespaceAssignment_0 ) ) )
            // InternalMCEntity.g:6489:1: ( ( rule__NamespacedKey__NamespaceAssignment_0 ) )
            {
            // InternalMCEntity.g:6489:1: ( ( rule__NamespacedKey__NamespaceAssignment_0 ) )
            // InternalMCEntity.g:6490:2: ( rule__NamespacedKey__NamespaceAssignment_0 )
            {
             before(grammarAccess.getNamespacedKeyAccess().getNamespaceAssignment_0()); 
            // InternalMCEntity.g:6491:2: ( rule__NamespacedKey__NamespaceAssignment_0 )
            // InternalMCEntity.g:6491:3: rule__NamespacedKey__NamespaceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKey__NamespaceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespacedKeyAccess().getNamespaceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__0__Impl"


    // $ANTLR start "rule__NamespacedKey__Group__1"
    // InternalMCEntity.g:6499:1: rule__NamespacedKey__Group__1 : rule__NamespacedKey__Group__1__Impl rule__NamespacedKey__Group__2 ;
    public final void rule__NamespacedKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6503:1: ( rule__NamespacedKey__Group__1__Impl rule__NamespacedKey__Group__2 )
            // InternalMCEntity.g:6504:2: rule__NamespacedKey__Group__1__Impl rule__NamespacedKey__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NamespacedKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__1"


    // $ANTLR start "rule__NamespacedKey__Group__1__Impl"
    // InternalMCEntity.g:6511:1: rule__NamespacedKey__Group__1__Impl : ( ':' ) ;
    public final void rule__NamespacedKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6515:1: ( ( ':' ) )
            // InternalMCEntity.g:6516:1: ( ':' )
            {
            // InternalMCEntity.g:6516:1: ( ':' )
            // InternalMCEntity.g:6517:2: ':'
            {
             before(grammarAccess.getNamespacedKeyAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNamespacedKeyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__1__Impl"


    // $ANTLR start "rule__NamespacedKey__Group__2"
    // InternalMCEntity.g:6526:1: rule__NamespacedKey__Group__2 : rule__NamespacedKey__Group__2__Impl ;
    public final void rule__NamespacedKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6530:1: ( rule__NamespacedKey__Group__2__Impl )
            // InternalMCEntity.g:6531:2: rule__NamespacedKey__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKey__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__2"


    // $ANTLR start "rule__NamespacedKey__Group__2__Impl"
    // InternalMCEntity.g:6537:1: rule__NamespacedKey__Group__2__Impl : ( ( rule__NamespacedKey__KeyAssignment_2 ) ) ;
    public final void rule__NamespacedKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6541:1: ( ( ( rule__NamespacedKey__KeyAssignment_2 ) ) )
            // InternalMCEntity.g:6542:1: ( ( rule__NamespacedKey__KeyAssignment_2 ) )
            {
            // InternalMCEntity.g:6542:1: ( ( rule__NamespacedKey__KeyAssignment_2 ) )
            // InternalMCEntity.g:6543:2: ( rule__NamespacedKey__KeyAssignment_2 )
            {
             before(grammarAccess.getNamespacedKeyAccess().getKeyAssignment_2()); 
            // InternalMCEntity.g:6544:2: ( rule__NamespacedKey__KeyAssignment_2 )
            // InternalMCEntity.g:6544:3: rule__NamespacedKey__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKey__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespacedKeyAccess().getKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__Group__2__Impl"


    // $ANTLR start "rule__NamespacedKeyKey__Group__0"
    // InternalMCEntity.g:6553:1: rule__NamespacedKeyKey__Group__0 : rule__NamespacedKeyKey__Group__0__Impl rule__NamespacedKeyKey__Group__1 ;
    public final void rule__NamespacedKeyKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6557:1: ( rule__NamespacedKeyKey__Group__0__Impl rule__NamespacedKeyKey__Group__1 )
            // InternalMCEntity.g:6558:2: rule__NamespacedKeyKey__Group__0__Impl rule__NamespacedKeyKey__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__NamespacedKeyKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedKeyKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group__0"


    // $ANTLR start "rule__NamespacedKeyKey__Group__0__Impl"
    // InternalMCEntity.g:6565:1: rule__NamespacedKeyKey__Group__0__Impl : ( ruleUnquotedString ) ;
    public final void rule__NamespacedKeyKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6569:1: ( ( ruleUnquotedString ) )
            // InternalMCEntity.g:6570:1: ( ruleUnquotedString )
            {
            // InternalMCEntity.g:6570:1: ( ruleUnquotedString )
            // InternalMCEntity.g:6571:2: ruleUnquotedString
            {
             before(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group__0__Impl"


    // $ANTLR start "rule__NamespacedKeyKey__Group__1"
    // InternalMCEntity.g:6580:1: rule__NamespacedKeyKey__Group__1 : rule__NamespacedKeyKey__Group__1__Impl ;
    public final void rule__NamespacedKeyKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6584:1: ( rule__NamespacedKeyKey__Group__1__Impl )
            // InternalMCEntity.g:6585:2: rule__NamespacedKeyKey__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKeyKey__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group__1"


    // $ANTLR start "rule__NamespacedKeyKey__Group__1__Impl"
    // InternalMCEntity.g:6591:1: rule__NamespacedKeyKey__Group__1__Impl : ( ( rule__NamespacedKeyKey__Group_1__0 )* ) ;
    public final void rule__NamespacedKeyKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6595:1: ( ( ( rule__NamespacedKeyKey__Group_1__0 )* ) )
            // InternalMCEntity.g:6596:1: ( ( rule__NamespacedKeyKey__Group_1__0 )* )
            {
            // InternalMCEntity.g:6596:1: ( ( rule__NamespacedKeyKey__Group_1__0 )* )
            // InternalMCEntity.g:6597:2: ( rule__NamespacedKeyKey__Group_1__0 )*
            {
             before(grammarAccess.getNamespacedKeyKeyAccess().getGroup_1()); 
            // InternalMCEntity.g:6598:2: ( rule__NamespacedKeyKey__Group_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==48) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMCEntity.g:6598:3: rule__NamespacedKeyKey__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__NamespacedKeyKey__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getNamespacedKeyKeyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group__1__Impl"


    // $ANTLR start "rule__NamespacedKeyKey__Group_1__0"
    // InternalMCEntity.g:6607:1: rule__NamespacedKeyKey__Group_1__0 : rule__NamespacedKeyKey__Group_1__0__Impl rule__NamespacedKeyKey__Group_1__1 ;
    public final void rule__NamespacedKeyKey__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6611:1: ( rule__NamespacedKeyKey__Group_1__0__Impl rule__NamespacedKeyKey__Group_1__1 )
            // InternalMCEntity.g:6612:2: rule__NamespacedKeyKey__Group_1__0__Impl rule__NamespacedKeyKey__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__NamespacedKeyKey__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedKeyKey__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group_1__0"


    // $ANTLR start "rule__NamespacedKeyKey__Group_1__0__Impl"
    // InternalMCEntity.g:6619:1: rule__NamespacedKeyKey__Group_1__0__Impl : ( '/' ) ;
    public final void rule__NamespacedKeyKey__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6623:1: ( ( '/' ) )
            // InternalMCEntity.g:6624:1: ( '/' )
            {
            // InternalMCEntity.g:6624:1: ( '/' )
            // InternalMCEntity.g:6625:2: '/'
            {
             before(grammarAccess.getNamespacedKeyKeyAccess().getSolidusKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNamespacedKeyKeyAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group_1__0__Impl"


    // $ANTLR start "rule__NamespacedKeyKey__Group_1__1"
    // InternalMCEntity.g:6634:1: rule__NamespacedKeyKey__Group_1__1 : rule__NamespacedKeyKey__Group_1__1__Impl ;
    public final void rule__NamespacedKeyKey__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6638:1: ( rule__NamespacedKeyKey__Group_1__1__Impl )
            // InternalMCEntity.g:6639:2: rule__NamespacedKeyKey__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedKeyKey__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group_1__1"


    // $ANTLR start "rule__NamespacedKeyKey__Group_1__1__Impl"
    // InternalMCEntity.g:6645:1: rule__NamespacedKeyKey__Group_1__1__Impl : ( ruleUnquotedString ) ;
    public final void rule__NamespacedKeyKey__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6649:1: ( ( ruleUnquotedString ) )
            // InternalMCEntity.g:6650:1: ( ruleUnquotedString )
            {
            // InternalMCEntity.g:6650:1: ( ruleUnquotedString )
            // InternalMCEntity.g:6651:2: ruleUnquotedString
            {
             before(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyKeyAccess().getUnquotedStringParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKeyKey__Group_1__1__Impl"


    // $ANTLR start "rule__UnquotedString__Group__0"
    // InternalMCEntity.g:6661:1: rule__UnquotedString__Group__0 : rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 ;
    public final void rule__UnquotedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6665:1: ( rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 )
            // InternalMCEntity.g:6666:2: rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__UnquotedString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__0"


    // $ANTLR start "rule__UnquotedString__Group__0__Impl"
    // InternalMCEntity.g:6673:1: rule__UnquotedString__Group__0__Impl : ( ( rule__UnquotedString__Alternatives_0 ) ) ;
    public final void rule__UnquotedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6677:1: ( ( ( rule__UnquotedString__Alternatives_0 ) ) )
            // InternalMCEntity.g:6678:1: ( ( rule__UnquotedString__Alternatives_0 ) )
            {
            // InternalMCEntity.g:6678:1: ( ( rule__UnquotedString__Alternatives_0 ) )
            // InternalMCEntity.g:6679:2: ( rule__UnquotedString__Alternatives_0 )
            {
             before(grammarAccess.getUnquotedStringAccess().getAlternatives_0()); 
            // InternalMCEntity.g:6680:2: ( rule__UnquotedString__Alternatives_0 )
            // InternalMCEntity.g:6680:3: rule__UnquotedString__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUnquotedStringAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__0__Impl"


    // $ANTLR start "rule__UnquotedString__Group__1"
    // InternalMCEntity.g:6688:1: rule__UnquotedString__Group__1 : rule__UnquotedString__Group__1__Impl ;
    public final void rule__UnquotedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6692:1: ( rule__UnquotedString__Group__1__Impl )
            // InternalMCEntity.g:6693:2: rule__UnquotedString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__1"


    // $ANTLR start "rule__UnquotedString__Group__1__Impl"
    // InternalMCEntity.g:6699:1: rule__UnquotedString__Group__1__Impl : ( ( rule__UnquotedString__Alternatives_1 )* ) ;
    public final void rule__UnquotedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6703:1: ( ( ( rule__UnquotedString__Alternatives_1 )* ) )
            // InternalMCEntity.g:6704:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            {
            // InternalMCEntity.g:6704:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            // InternalMCEntity.g:6705:2: ( rule__UnquotedString__Alternatives_1 )*
            {
             before(grammarAccess.getUnquotedStringAccess().getAlternatives_1()); 
            // InternalMCEntity.g:6706:2: ( rule__UnquotedString__Alternatives_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_INT||(LA61_0>=RULE_DOUBLE && LA61_0<=RULE_BYTE)||(LA61_0>=31 && LA61_0<=33)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMCEntity.g:6706:3: rule__UnquotedString__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__UnquotedString__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getUnquotedStringAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__1__Impl"


    // $ANTLR start "rule__EntityData__NbtAssignment"
    // InternalMCEntity.g:6715:1: rule__EntityData__NbtAssignment : ( ruleNBTCompound ) ;
    public final void rule__EntityData__NbtAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6719:1: ( ( ruleNBTCompound ) )
            // InternalMCEntity.g:6720:2: ( ruleNBTCompound )
            {
            // InternalMCEntity.g:6720:2: ( ruleNBTCompound )
            // InternalMCEntity.g:6721:3: ruleNBTCompound
            {
             before(grammarAccess.getEntityDataAccess().getNbtNBTCompoundParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTCompound();

            state._fsp--;

             after(grammarAccess.getEntityDataAccess().getNbtNBTCompoundParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityData__NbtAssignment"


    // $ANTLR start "rule__NBTCompound__EntriesAssignment_2_0"
    // InternalMCEntity.g:6730:1: rule__NBTCompound__EntriesAssignment_2_0 : ( ruleNBTEntry ) ;
    public final void rule__NBTCompound__EntriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6734:1: ( ( ruleNBTEntry ) )
            // InternalMCEntity.g:6735:2: ( ruleNBTEntry )
            {
            // InternalMCEntity.g:6735:2: ( ruleNBTEntry )
            // InternalMCEntity.g:6736:3: ruleNBTEntry
            {
             before(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTEntry();

            state._fsp--;

             after(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__EntriesAssignment_2_0"


    // $ANTLR start "rule__NBTCompound__EntriesAssignment_2_1_1"
    // InternalMCEntity.g:6745:1: rule__NBTCompound__EntriesAssignment_2_1_1 : ( ruleNBTEntry ) ;
    public final void rule__NBTCompound__EntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6749:1: ( ( ruleNBTEntry ) )
            // InternalMCEntity.g:6750:2: ( ruleNBTEntry )
            {
            // InternalMCEntity.g:6750:2: ( ruleNBTEntry )
            // InternalMCEntity.g:6751:3: ruleNBTEntry
            {
             before(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTEntry();

            state._fsp--;

             after(grammarAccess.getNBTCompoundAccess().getEntriesNBTEntryParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTCompound__EntriesAssignment_2_1_1"


    // $ANTLR start "rule__NBTEntry__KeyAssignment_0"
    // InternalMCEntity.g:6760:1: rule__NBTEntry__KeyAssignment_0 : ( ( rule__NBTEntry__KeyAlternatives_0_0 ) ) ;
    public final void rule__NBTEntry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6764:1: ( ( ( rule__NBTEntry__KeyAlternatives_0_0 ) ) )
            // InternalMCEntity.g:6765:2: ( ( rule__NBTEntry__KeyAlternatives_0_0 ) )
            {
            // InternalMCEntity.g:6765:2: ( ( rule__NBTEntry__KeyAlternatives_0_0 ) )
            // InternalMCEntity.g:6766:3: ( rule__NBTEntry__KeyAlternatives_0_0 )
            {
             before(grammarAccess.getNBTEntryAccess().getKeyAlternatives_0_0()); 
            // InternalMCEntity.g:6767:3: ( rule__NBTEntry__KeyAlternatives_0_0 )
            // InternalMCEntity.g:6767:4: rule__NBTEntry__KeyAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTEntry__KeyAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTEntryAccess().getKeyAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__KeyAssignment_0"


    // $ANTLR start "rule__NBTEntry__ValueAssignment_2"
    // InternalMCEntity.g:6775:1: rule__NBTEntry__ValueAssignment_2 : ( ruleNBTValue ) ;
    public final void rule__NBTEntry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6779:1: ( ( ruleNBTValue ) )
            // InternalMCEntity.g:6780:2: ( ruleNBTValue )
            {
            // InternalMCEntity.g:6780:2: ( ruleNBTValue )
            // InternalMCEntity.g:6781:3: ruleNBTValue
            {
             before(grammarAccess.getNBTEntryAccess().getValueNBTValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTValue();

            state._fsp--;

             after(grammarAccess.getNBTEntryAccess().getValueNBTValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTEntry__ValueAssignment_2"


    // $ANTLR start "rule__NBTByteArray__ElementsAssignment_2_0"
    // InternalMCEntity.g:6790:1: rule__NBTByteArray__ElementsAssignment_2_0 : ( RULE_BYTE ) ;
    public final void rule__NBTByteArray__ElementsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6794:1: ( ( RULE_BYTE ) )
            // InternalMCEntity.g:6795:2: ( RULE_BYTE )
            {
            // InternalMCEntity.g:6795:2: ( RULE_BYTE )
            // InternalMCEntity.g:6796:3: RULE_BYTE
            {
             before(grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_0_0()); 
            match(input,RULE_BYTE,FOLLOW_2); 
             after(grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__ElementsAssignment_2_0"


    // $ANTLR start "rule__NBTByteArray__ElementsAssignment_2_1_1"
    // InternalMCEntity.g:6805:1: rule__NBTByteArray__ElementsAssignment_2_1_1 : ( RULE_BYTE ) ;
    public final void rule__NBTByteArray__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6809:1: ( ( RULE_BYTE ) )
            // InternalMCEntity.g:6810:2: ( RULE_BYTE )
            {
            // InternalMCEntity.g:6810:2: ( RULE_BYTE )
            // InternalMCEntity.g:6811:3: RULE_BYTE
            {
             before(grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_1_1_0()); 
            match(input,RULE_BYTE,FOLLOW_2); 
             after(grammarAccess.getNBTByteArrayAccess().getElementsBYTETerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByteArray__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__NBTLongArray__ElementsAssignment_2_0"
    // InternalMCEntity.g:6820:1: rule__NBTLongArray__ElementsAssignment_2_0 : ( RULE_LONG ) ;
    public final void rule__NBTLongArray__ElementsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6824:1: ( ( RULE_LONG ) )
            // InternalMCEntity.g:6825:2: ( RULE_LONG )
            {
            // InternalMCEntity.g:6825:2: ( RULE_LONG )
            // InternalMCEntity.g:6826:3: RULE_LONG
            {
             before(grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_0_0()); 
            match(input,RULE_LONG,FOLLOW_2); 
             after(grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__ElementsAssignment_2_0"


    // $ANTLR start "rule__NBTLongArray__ElementsAssignment_2_1_1"
    // InternalMCEntity.g:6835:1: rule__NBTLongArray__ElementsAssignment_2_1_1 : ( RULE_LONG ) ;
    public final void rule__NBTLongArray__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6839:1: ( ( RULE_LONG ) )
            // InternalMCEntity.g:6840:2: ( RULE_LONG )
            {
            // InternalMCEntity.g:6840:2: ( RULE_LONG )
            // InternalMCEntity.g:6841:3: RULE_LONG
            {
             before(grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_LONG,FOLLOW_2); 
             after(grammarAccess.getNBTLongArrayAccess().getElementsLONGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLongArray__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__NBTIntArray__ElementsAssignment_2_0"
    // InternalMCEntity.g:6850:1: rule__NBTIntArray__ElementsAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__NBTIntArray__ElementsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6854:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:6855:2: ( RULE_INT )
            {
            // InternalMCEntity.g:6855:2: ( RULE_INT )
            // InternalMCEntity.g:6856:3: RULE_INT
            {
             before(grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__ElementsAssignment_2_0"


    // $ANTLR start "rule__NBTIntArray__ElementsAssignment_2_1_1"
    // InternalMCEntity.g:6865:1: rule__NBTIntArray__ElementsAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__NBTIntArray__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6869:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:6870:2: ( RULE_INT )
            {
            // InternalMCEntity.g:6870:2: ( RULE_INT )
            // InternalMCEntity.g:6871:3: RULE_INT
            {
             before(grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNBTIntArrayAccess().getElementsINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTIntArray__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_0_0"
    // InternalMCEntity.g:6880:1: rule__NBTArray__ElementsAssignment_2_0_0_0 : ( ruleNBTCompound ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6884:1: ( ( ruleNBTCompound ) )
            // InternalMCEntity.g:6885:2: ( ruleNBTCompound )
            {
            // InternalMCEntity.g:6885:2: ( ruleNBTCompound )
            // InternalMCEntity.g:6886:3: ruleNBTCompound
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTCompound();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_0_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_0_1_1"
    // InternalMCEntity.g:6895:1: rule__NBTArray__ElementsAssignment_2_0_0_1_1 : ( ruleNBTCompound ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6899:1: ( ( ruleNBTCompound ) )
            // InternalMCEntity.g:6900:2: ( ruleNBTCompound )
            {
            // InternalMCEntity.g:6900:2: ( ruleNBTCompound )
            // InternalMCEntity.g:6901:3: ruleNBTCompound
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTCompound();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTCompoundParserRuleCall_2_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_0_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_1_0"
    // InternalMCEntity.g:6910:1: rule__NBTArray__ElementsAssignment_2_0_1_0 : ( ruleNBTByteArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6914:1: ( ( ruleNBTByteArray ) )
            // InternalMCEntity.g:6915:2: ( ruleNBTByteArray )
            {
            // InternalMCEntity.g:6915:2: ( ruleNBTByteArray )
            // InternalMCEntity.g:6916:3: ruleNBTByteArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTByteArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_1_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_1_1_1"
    // InternalMCEntity.g:6925:1: rule__NBTArray__ElementsAssignment_2_0_1_1_1 : ( ruleNBTByteArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6929:1: ( ( ruleNBTByteArray ) )
            // InternalMCEntity.g:6930:2: ( ruleNBTByteArray )
            {
            // InternalMCEntity.g:6930:2: ( ruleNBTByteArray )
            // InternalMCEntity.g:6931:3: ruleNBTByteArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTByteArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTByteArrayParserRuleCall_2_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_1_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_2_0"
    // InternalMCEntity.g:6940:1: rule__NBTArray__ElementsAssignment_2_0_2_0 : ( ruleNBTLongArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6944:1: ( ( ruleNBTLongArray ) )
            // InternalMCEntity.g:6945:2: ( ruleNBTLongArray )
            {
            // InternalMCEntity.g:6945:2: ( ruleNBTLongArray )
            // InternalMCEntity.g:6946:3: ruleNBTLongArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTLongArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_2_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_2_1_1"
    // InternalMCEntity.g:6955:1: rule__NBTArray__ElementsAssignment_2_0_2_1_1 : ( ruleNBTLongArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6959:1: ( ( ruleNBTLongArray ) )
            // InternalMCEntity.g:6960:2: ( ruleNBTLongArray )
            {
            // InternalMCEntity.g:6960:2: ( ruleNBTLongArray )
            // InternalMCEntity.g:6961:3: ruleNBTLongArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTLongArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTLongArrayParserRuleCall_2_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_2_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_3_0"
    // InternalMCEntity.g:6970:1: rule__NBTArray__ElementsAssignment_2_0_3_0 : ( ruleNBTIntArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6974:1: ( ( ruleNBTIntArray ) )
            // InternalMCEntity.g:6975:2: ( ruleNBTIntArray )
            {
            // InternalMCEntity.g:6975:2: ( ruleNBTIntArray )
            // InternalMCEntity.g:6976:3: ruleNBTIntArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTIntArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_3_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_3_1_1"
    // InternalMCEntity.g:6985:1: rule__NBTArray__ElementsAssignment_2_0_3_1_1 : ( ruleNBTIntArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:6989:1: ( ( ruleNBTIntArray ) )
            // InternalMCEntity.g:6990:2: ( ruleNBTIntArray )
            {
            // InternalMCEntity.g:6990:2: ( ruleNBTIntArray )
            // InternalMCEntity.g:6991:3: ruleNBTIntArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTIntArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTIntArrayParserRuleCall_2_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_3_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_4_0"
    // InternalMCEntity.g:7000:1: rule__NBTArray__ElementsAssignment_2_0_4_0 : ( ruleNBTArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7004:1: ( ( ruleNBTArray ) )
            // InternalMCEntity.g:7005:2: ( ruleNBTArray )
            {
            // InternalMCEntity.g:7005:2: ( ruleNBTArray )
            // InternalMCEntity.g:7006:3: ruleNBTArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_4_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_4_1_1"
    // InternalMCEntity.g:7015:1: rule__NBTArray__ElementsAssignment_2_0_4_1_1 : ( ruleNBTArray ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7019:1: ( ( ruleNBTArray ) )
            // InternalMCEntity.g:7020:2: ( ruleNBTArray )
            {
            // InternalMCEntity.g:7020:2: ( ruleNBTArray )
            // InternalMCEntity.g:7021:3: ruleNBTArray
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTArray();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTArrayParserRuleCall_2_0_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_4_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_5_0"
    // InternalMCEntity.g:7030:1: rule__NBTArray__ElementsAssignment_2_0_5_0 : ( ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 ) ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7034:1: ( ( ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 ) ) )
            // InternalMCEntity.g:7035:2: ( ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 ) )
            {
            // InternalMCEntity.g:7035:2: ( ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 ) )
            // InternalMCEntity.g:7036:3: ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_0_0()); 
            // InternalMCEntity.g:7037:3: ( rule__NBTArray__ElementsAlternatives_2_0_5_0_0 )
            // InternalMCEntity.g:7037:4: rule__NBTArray__ElementsAlternatives_2_0_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAlternatives_2_0_5_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_5_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_5_1_1"
    // InternalMCEntity.g:7045:1: rule__NBTArray__ElementsAssignment_2_0_5_1_1 : ( ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 ) ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7049:1: ( ( ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 ) ) )
            // InternalMCEntity.g:7050:2: ( ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 ) )
            {
            // InternalMCEntity.g:7050:2: ( ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 ) )
            // InternalMCEntity.g:7051:3: ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 )
            {
             before(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_1_1_0()); 
            // InternalMCEntity.g:7052:3: ( rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0 )
            // InternalMCEntity.g:7052:4: rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTArray__ElementsAlternatives_2_0_5_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTArrayAccess().getElementsAlternatives_2_0_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_5_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_6_0"
    // InternalMCEntity.g:7060:1: rule__NBTArray__ElementsAssignment_2_0_6_0 : ( ruleNBTString ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7064:1: ( ( ruleNBTString ) )
            // InternalMCEntity.g:7065:2: ( ruleNBTString )
            {
            // InternalMCEntity.g:7065:2: ( ruleNBTString )
            // InternalMCEntity.g:7066:3: ruleNBTString
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTString();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_6_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_6_1_1"
    // InternalMCEntity.g:7075:1: rule__NBTArray__ElementsAssignment_2_0_6_1_1 : ( ruleNBTString ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7079:1: ( ( ruleNBTString ) )
            // InternalMCEntity.g:7080:2: ( ruleNBTString )
            {
            // InternalMCEntity.g:7080:2: ( ruleNBTString )
            // InternalMCEntity.g:7081:3: ruleNBTString
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTString();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTStringParserRuleCall_2_0_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_6_1_1"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_7_0"
    // InternalMCEntity.g:7090:1: rule__NBTArray__ElementsAssignment_2_0_7_0 : ( ruleNBTJSONTextComponent ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7094:1: ( ( ruleNBTJSONTextComponent ) )
            // InternalMCEntity.g:7095:2: ( ruleNBTJSONTextComponent )
            {
            // InternalMCEntity.g:7095:2: ( ruleNBTJSONTextComponent )
            // InternalMCEntity.g:7096:3: ruleNBTJSONTextComponent
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTJSONTextComponent();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_7_0"


    // $ANTLR start "rule__NBTArray__ElementsAssignment_2_0_7_1_1"
    // InternalMCEntity.g:7105:1: rule__NBTArray__ElementsAssignment_2_0_7_1_1 : ( ruleNBTJSONTextComponent ) ;
    public final void rule__NBTArray__ElementsAssignment_2_0_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7109:1: ( ( ruleNBTJSONTextComponent ) )
            // InternalMCEntity.g:7110:2: ( ruleNBTJSONTextComponent )
            {
            // InternalMCEntity.g:7110:2: ( ruleNBTJSONTextComponent )
            // InternalMCEntity.g:7111:3: ruleNBTJSONTextComponent
            {
             before(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTJSONTextComponent();

            state._fsp--;

             after(grammarAccess.getNBTArrayAccess().getElementsNBTJSONTextComponentParserRuleCall_2_0_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTArray__ElementsAssignment_2_0_7_1_1"


    // $ANTLR start "rule__NBTBool__ValueAssignment_0"
    // InternalMCEntity.g:7120:1: rule__NBTBool__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__NBTBool__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7124:1: ( ( ( 'true' ) ) )
            // InternalMCEntity.g:7125:2: ( ( 'true' ) )
            {
            // InternalMCEntity.g:7125:2: ( ( 'true' ) )
            // InternalMCEntity.g:7126:3: ( 'true' )
            {
             before(grammarAccess.getNBTBoolAccess().getValueTrueKeyword_0_0()); 
            // InternalMCEntity.g:7127:3: ( 'true' )
            // InternalMCEntity.g:7128:4: 'true'
            {
             before(grammarAccess.getNBTBoolAccess().getValueTrueKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNBTBoolAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getNBTBoolAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTBool__ValueAssignment_0"


    // $ANTLR start "rule__NBTFloat__ValueAssignment"
    // InternalMCEntity.g:7139:1: rule__NBTFloat__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__NBTFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7143:1: ( ( RULE_FLOAT ) )
            // InternalMCEntity.g:7144:2: ( RULE_FLOAT )
            {
            // InternalMCEntity.g:7144:2: ( RULE_FLOAT )
            // InternalMCEntity.g:7145:3: RULE_FLOAT
            {
             before(grammarAccess.getNBTFloatAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getNBTFloatAccess().getValueFLOATTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTFloat__ValueAssignment"


    // $ANTLR start "rule__NBTDouble__ValueAssignment"
    // InternalMCEntity.g:7154:1: rule__NBTDouble__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NBTDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7158:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7159:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7159:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7160:3: RULE_DOUBLE
            {
             before(grammarAccess.getNBTDoubleAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getNBTDoubleAccess().getValueDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTDouble__ValueAssignment"


    // $ANTLR start "rule__NBTLong__ValueAssignment"
    // InternalMCEntity.g:7169:1: rule__NBTLong__ValueAssignment : ( RULE_LONG ) ;
    public final void rule__NBTLong__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7173:1: ( ( RULE_LONG ) )
            // InternalMCEntity.g:7174:2: ( RULE_LONG )
            {
            // InternalMCEntity.g:7174:2: ( RULE_LONG )
            // InternalMCEntity.g:7175:3: RULE_LONG
            {
             before(grammarAccess.getNBTLongAccess().getValueLONGTerminalRuleCall_0()); 
            match(input,RULE_LONG,FOLLOW_2); 
             after(grammarAccess.getNBTLongAccess().getValueLONGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTLong__ValueAssignment"


    // $ANTLR start "rule__NBTShort__ValueAssignment"
    // InternalMCEntity.g:7184:1: rule__NBTShort__ValueAssignment : ( RULE_SHORT ) ;
    public final void rule__NBTShort__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7188:1: ( ( RULE_SHORT ) )
            // InternalMCEntity.g:7189:2: ( RULE_SHORT )
            {
            // InternalMCEntity.g:7189:2: ( RULE_SHORT )
            // InternalMCEntity.g:7190:3: RULE_SHORT
            {
             before(grammarAccess.getNBTShortAccess().getValueSHORTTerminalRuleCall_0()); 
            match(input,RULE_SHORT,FOLLOW_2); 
             after(grammarAccess.getNBTShortAccess().getValueSHORTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTShort__ValueAssignment"


    // $ANTLR start "rule__NBTByte__ValueAssignment"
    // InternalMCEntity.g:7199:1: rule__NBTByte__ValueAssignment : ( RULE_BYTE ) ;
    public final void rule__NBTByte__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7203:1: ( ( RULE_BYTE ) )
            // InternalMCEntity.g:7204:2: ( RULE_BYTE )
            {
            // InternalMCEntity.g:7204:2: ( RULE_BYTE )
            // InternalMCEntity.g:7205:3: RULE_BYTE
            {
             before(grammarAccess.getNBTByteAccess().getValueBYTETerminalRuleCall_0()); 
            match(input,RULE_BYTE,FOLLOW_2); 
             after(grammarAccess.getNBTByteAccess().getValueBYTETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTByte__ValueAssignment"


    // $ANTLR start "rule__NBTInt__ValueAssignment"
    // InternalMCEntity.g:7214:1: rule__NBTInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NBTInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7218:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:7219:2: ( RULE_INT )
            {
            // InternalMCEntity.g:7219:2: ( RULE_INT )
            // InternalMCEntity.g:7220:3: RULE_INT
            {
             before(grammarAccess.getNBTIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNBTIntAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTInt__ValueAssignment"


    // $ANTLR start "rule__NBTString__ValueAssignment"
    // InternalMCEntity.g:7229:1: rule__NBTString__ValueAssignment : ( ( rule__NBTString__ValueAlternatives_0 ) ) ;
    public final void rule__NBTString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7233:1: ( ( ( rule__NBTString__ValueAlternatives_0 ) ) )
            // InternalMCEntity.g:7234:2: ( ( rule__NBTString__ValueAlternatives_0 ) )
            {
            // InternalMCEntity.g:7234:2: ( ( rule__NBTString__ValueAlternatives_0 ) )
            // InternalMCEntity.g:7235:3: ( rule__NBTString__ValueAlternatives_0 )
            {
             before(grammarAccess.getNBTStringAccess().getValueAlternatives_0()); 
            // InternalMCEntity.g:7236:3: ( rule__NBTString__ValueAlternatives_0 )
            // InternalMCEntity.g:7236:4: rule__NBTString__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NBTString__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNBTStringAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTString__ValueAssignment"


    // $ANTLR start "rule__NBTJSONTextComponent__ValueAssignment_0_1"
    // InternalMCEntity.g:7244:1: rule__NBTJSONTextComponent__ValueAssignment_0_1 : ( ruleNBTJSONTextComponentObject ) ;
    public final void rule__NBTJSONTextComponent__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7248:1: ( ( ruleNBTJSONTextComponentObject ) )
            // InternalMCEntity.g:7249:2: ( ruleNBTJSONTextComponentObject )
            {
            // InternalMCEntity.g:7249:2: ( ruleNBTJSONTextComponentObject )
            // InternalMCEntity.g:7250:3: ruleNBTJSONTextComponentObject
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentObjectParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTJSONTextComponentObject();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentObjectParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__ValueAssignment_0_1"


    // $ANTLR start "rule__NBTJSONTextComponent__ValueAssignment_1_1"
    // InternalMCEntity.g:7259:1: rule__NBTJSONTextComponent__ValueAssignment_1_1 : ( ruleNBTJSONTextComponentArray ) ;
    public final void rule__NBTJSONTextComponent__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7263:1: ( ( ruleNBTJSONTextComponentArray ) )
            // InternalMCEntity.g:7264:2: ( ruleNBTJSONTextComponentArray )
            {
            // InternalMCEntity.g:7264:2: ( ruleNBTJSONTextComponentArray )
            // InternalMCEntity.g:7265:3: ruleNBTJSONTextComponentArray
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentArrayParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTJSONTextComponentArray();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentArrayParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__ValueAssignment_1_1"


    // $ANTLR start "rule__NBTJSONTextComponent__ValueAssignment_2_1"
    // InternalMCEntity.g:7274:1: rule__NBTJSONTextComponent__ValueAssignment_2_1 : ( ruleNBTJSONTextComponentString ) ;
    public final void rule__NBTJSONTextComponent__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7278:1: ( ( ruleNBTJSONTextComponentString ) )
            // InternalMCEntity.g:7279:2: ( ruleNBTJSONTextComponentString )
            {
            // InternalMCEntity.g:7279:2: ( ruleNBTJSONTextComponentString )
            // InternalMCEntity.g:7280:3: ruleNBTJSONTextComponentString
            {
             before(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNBTJSONTextComponentString();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentAccess().getValueNBTJSONTextComponentStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponent__ValueAssignment_2_1"


    // $ANTLR start "rule__NBTJSONTextComponentObject__EntriesAssignment_1_0"
    // InternalMCEntity.g:7289:1: rule__NBTJSONTextComponentObject__EntriesAssignment_1_0 : ( ruleJSONEntry ) ;
    public final void rule__NBTJSONTextComponentObject__EntriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7293:1: ( ( ruleJSONEntry ) )
            // InternalMCEntity.g:7294:2: ( ruleJSONEntry )
            {
            // InternalMCEntity.g:7294:2: ( ruleJSONEntry )
            // InternalMCEntity.g:7295:3: ruleJSONEntry
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONEntry();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__EntriesAssignment_1_0"


    // $ANTLR start "rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1"
    // InternalMCEntity.g:7304:1: rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1 : ( ruleJSONEntry ) ;
    public final void rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7308:1: ( ( ruleJSONEntry ) )
            // InternalMCEntity.g:7309:2: ( ruleJSONEntry )
            {
            // InternalMCEntity.g:7309:2: ( ruleJSONEntry )
            // InternalMCEntity.g:7310:3: ruleJSONEntry
            {
             before(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONEntry();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentObjectAccess().getEntriesJSONEntryParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentObject__EntriesAssignment_1_1_1"


    // $ANTLR start "rule__NBTJSONTextComponentString__ValueAssignment_1"
    // InternalMCEntity.g:7319:1: rule__NBTJSONTextComponentString__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NBTJSONTextComponentString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7323:1: ( ( RULE_STRING ) )
            // InternalMCEntity.g:7324:2: ( RULE_STRING )
            {
            // InternalMCEntity.g:7324:2: ( RULE_STRING )
            // InternalMCEntity.g:7325:3: RULE_STRING
            {
             before(grammarAccess.getNBTJSONTextComponentStringAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNBTJSONTextComponentStringAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentString__ValueAssignment_1"


    // $ANTLR start "rule__NBTJSONTextComponentArray__EntriesAssignment_1_0"
    // InternalMCEntity.g:7334:1: rule__NBTJSONTextComponentArray__EntriesAssignment_1_0 : ( ruleJSONValue ) ;
    public final void rule__NBTJSONTextComponentArray__EntriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7338:1: ( ( ruleJSONValue ) )
            // InternalMCEntity.g:7339:2: ( ruleJSONValue )
            {
            // InternalMCEntity.g:7339:2: ( ruleJSONValue )
            // InternalMCEntity.g:7340:3: ruleJSONValue
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__EntriesAssignment_1_0"


    // $ANTLR start "rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1"
    // InternalMCEntity.g:7349:1: rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1 : ( ruleJSONValue ) ;
    public final void rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7353:1: ( ( ruleJSONValue ) )
            // InternalMCEntity.g:7354:2: ( ruleJSONValue )
            {
            // InternalMCEntity.g:7354:2: ( ruleJSONValue )
            // InternalMCEntity.g:7355:3: ruleJSONValue
            {
             before(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getNBTJSONTextComponentArrayAccess().getEntriesJSONValueParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NBTJSONTextComponentArray__EntriesAssignment_1_1_1"


    // $ANTLR start "rule__JSONBool__ValueAssignment_0"
    // InternalMCEntity.g:7364:1: rule__JSONBool__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__JSONBool__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7368:1: ( ( ( 'true' ) ) )
            // InternalMCEntity.g:7369:2: ( ( 'true' ) )
            {
            // InternalMCEntity.g:7369:2: ( ( 'true' ) )
            // InternalMCEntity.g:7370:3: ( 'true' )
            {
             before(grammarAccess.getJSONBoolAccess().getValueTrueKeyword_0_0()); 
            // InternalMCEntity.g:7371:3: ( 'true' )
            // InternalMCEntity.g:7372:4: 'true'
            {
             before(grammarAccess.getJSONBoolAccess().getValueTrueKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getJSONBoolAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getJSONBoolAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONBool__ValueAssignment_0"


    // $ANTLR start "rule__JSONDouble__ValueAssignment"
    // InternalMCEntity.g:7383:1: rule__JSONDouble__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__JSONDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7387:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7388:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7388:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7389:3: RULE_DOUBLE
            {
             before(grammarAccess.getJSONDoubleAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getJSONDoubleAccess().getValueDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONDouble__ValueAssignment"


    // $ANTLR start "rule__JSONLong__ValueAssignment"
    // InternalMCEntity.g:7398:1: rule__JSONLong__ValueAssignment : ( ruleINTAsLong ) ;
    public final void rule__JSONLong__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7402:1: ( ( ruleINTAsLong ) )
            // InternalMCEntity.g:7403:2: ( ruleINTAsLong )
            {
            // InternalMCEntity.g:7403:2: ( ruleINTAsLong )
            // InternalMCEntity.g:7404:3: ruleINTAsLong
            {
             before(grammarAccess.getJSONLongAccess().getValueINTAsLongParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINTAsLong();

            state._fsp--;

             after(grammarAccess.getJSONLongAccess().getValueINTAsLongParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLong__ValueAssignment"


    // $ANTLR start "rule__JSONObject__EntriesAssignment_2_0"
    // InternalMCEntity.g:7413:1: rule__JSONObject__EntriesAssignment_2_0 : ( ruleJSONEntry ) ;
    public final void rule__JSONObject__EntriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7417:1: ( ( ruleJSONEntry ) )
            // InternalMCEntity.g:7418:2: ( ruleJSONEntry )
            {
            // InternalMCEntity.g:7418:2: ( ruleJSONEntry )
            // InternalMCEntity.g:7419:3: ruleJSONEntry
            {
             before(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONEntry();

            state._fsp--;

             after(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__EntriesAssignment_2_0"


    // $ANTLR start "rule__JSONObject__EntriesAssignment_2_1_1"
    // InternalMCEntity.g:7428:1: rule__JSONObject__EntriesAssignment_2_1_1 : ( ruleJSONEntry ) ;
    public final void rule__JSONObject__EntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7432:1: ( ( ruleJSONEntry ) )
            // InternalMCEntity.g:7433:2: ( ruleJSONEntry )
            {
            // InternalMCEntity.g:7433:2: ( ruleJSONEntry )
            // InternalMCEntity.g:7434:3: ruleJSONEntry
            {
             before(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONEntry();

            state._fsp--;

             after(grammarAccess.getJSONObjectAccess().getEntriesJSONEntryParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONObject__EntriesAssignment_2_1_1"


    // $ANTLR start "rule__JSONEntry__KeyAssignment_0"
    // InternalMCEntity.g:7443:1: rule__JSONEntry__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JSONEntry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7447:1: ( ( RULE_STRING ) )
            // InternalMCEntity.g:7448:2: ( RULE_STRING )
            {
            // InternalMCEntity.g:7448:2: ( RULE_STRING )
            // InternalMCEntity.g:7449:3: RULE_STRING
            {
             before(grammarAccess.getJSONEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSONEntryAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__KeyAssignment_0"


    // $ANTLR start "rule__JSONEntry__ValueAssignment_2"
    // InternalMCEntity.g:7458:1: rule__JSONEntry__ValueAssignment_2 : ( ruleJSONValue ) ;
    public final void rule__JSONEntry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7462:1: ( ( ruleJSONValue ) )
            // InternalMCEntity.g:7463:2: ( ruleJSONValue )
            {
            // InternalMCEntity.g:7463:2: ( ruleJSONValue )
            // InternalMCEntity.g:7464:3: ruleJSONValue
            {
             before(grammarAccess.getJSONEntryAccess().getValueJSONValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getJSONEntryAccess().getValueJSONValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONEntry__ValueAssignment_2"


    // $ANTLR start "rule__JSONArray__EntriesAssignment_2_0"
    // InternalMCEntity.g:7473:1: rule__JSONArray__EntriesAssignment_2_0 : ( ruleJSONValue ) ;
    public final void rule__JSONArray__EntriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7477:1: ( ( ruleJSONValue ) )
            // InternalMCEntity.g:7478:2: ( ruleJSONValue )
            {
            // InternalMCEntity.g:7478:2: ( ruleJSONValue )
            // InternalMCEntity.g:7479:3: ruleJSONValue
            {
             before(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__EntriesAssignment_2_0"


    // $ANTLR start "rule__JSONArray__EntriesAssignment_2_1_1"
    // InternalMCEntity.g:7488:1: rule__JSONArray__EntriesAssignment_2_1_1 : ( ruleJSONValue ) ;
    public final void rule__JSONArray__EntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7492:1: ( ( ruleJSONValue ) )
            // InternalMCEntity.g:7493:2: ( ruleJSONValue )
            {
            // InternalMCEntity.g:7493:2: ( ruleJSONValue )
            // InternalMCEntity.g:7494:3: ruleJSONValue
            {
             before(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONValue();

            state._fsp--;

             after(grammarAccess.getJSONArrayAccess().getEntriesJSONValueParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArray__EntriesAssignment_2_1_1"


    // $ANTLR start "rule__JSONString__ValueAssignment"
    // InternalMCEntity.g:7503:1: rule__JSONString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__JSONString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7507:1: ( ( RULE_STRING ) )
            // InternalMCEntity.g:7508:2: ( RULE_STRING )
            {
            // InternalMCEntity.g:7508:2: ( RULE_STRING )
            // InternalMCEntity.g:7509:3: RULE_STRING
            {
             before(grammarAccess.getJSONStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSONStringAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONString__ValueAssignment"


    // $ANTLR start "rule__Selector__TypeAssignment_0"
    // InternalMCEntity.g:7518:1: rule__Selector__TypeAssignment_0 : ( ruleSelectorType ) ;
    public final void rule__Selector__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7522:1: ( ( ruleSelectorType ) )
            // InternalMCEntity.g:7523:2: ( ruleSelectorType )
            {
            // InternalMCEntity.g:7523:2: ( ruleSelectorType )
            // InternalMCEntity.g:7524:3: ruleSelectorType
            {
             before(grammarAccess.getSelectorAccess().getTypeSelectorTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTypeSelectorTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__TypeAssignment_0"


    // $ANTLR start "rule__Selector__ArgumentsAssignment_1_1"
    // InternalMCEntity.g:7533:1: rule__Selector__ArgumentsAssignment_1_1 : ( ruleSelectorArguments ) ;
    public final void rule__Selector__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7537:1: ( ( ruleSelectorArguments ) )
            // InternalMCEntity.g:7538:2: ( ruleSelectorArguments )
            {
            // InternalMCEntity.g:7538:2: ( ruleSelectorArguments )
            // InternalMCEntity.g:7539:3: ruleSelectorArguments
            {
             before(grammarAccess.getSelectorAccess().getArgumentsSelectorArgumentsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorArguments();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getArgumentsSelectorArgumentsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__SelectorArguments__FiltersAssignment_0"
    // InternalMCEntity.g:7548:1: rule__SelectorArguments__FiltersAssignment_0 : ( ruleSelectorFilter ) ;
    public final void rule__SelectorArguments__FiltersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7552:1: ( ( ruleSelectorFilter ) )
            // InternalMCEntity.g:7553:2: ( ruleSelectorFilter )
            {
            // InternalMCEntity.g:7553:2: ( ruleSelectorFilter )
            // InternalMCEntity.g:7554:3: ruleSelectorFilter
            {
             before(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorFilter();

            state._fsp--;

             after(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__FiltersAssignment_0"


    // $ANTLR start "rule__SelectorArguments__FiltersAssignment_1_1"
    // InternalMCEntity.g:7563:1: rule__SelectorArguments__FiltersAssignment_1_1 : ( ruleSelectorFilter ) ;
    public final void rule__SelectorArguments__FiltersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7567:1: ( ( ruleSelectorFilter ) )
            // InternalMCEntity.g:7568:2: ( ruleSelectorFilter )
            {
            // InternalMCEntity.g:7568:2: ( ruleSelectorFilter )
            // InternalMCEntity.g:7569:3: ruleSelectorFilter
            {
             before(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorFilter();

            state._fsp--;

             after(grammarAccess.getSelectorArgumentsAccess().getFiltersSelectorFilterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorArguments__FiltersAssignment_1_1"


    // $ANTLR start "rule__SelectorFilter__NameAssignment_0"
    // InternalMCEntity.g:7578:1: rule__SelectorFilter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SelectorFilter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7582:1: ( ( RULE_ID ) )
            // InternalMCEntity.g:7583:2: ( RULE_ID )
            {
            // InternalMCEntity.g:7583:2: ( RULE_ID )
            // InternalMCEntity.g:7584:3: RULE_ID
            {
             before(grammarAccess.getSelectorFilterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorFilterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__NameAssignment_0"


    // $ANTLR start "rule__SelectorFilter__InvertedAssignment_2"
    // InternalMCEntity.g:7593:1: rule__SelectorFilter__InvertedAssignment_2 : ( ( '!' ) ) ;
    public final void rule__SelectorFilter__InvertedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7597:1: ( ( ( '!' ) ) )
            // InternalMCEntity.g:7598:2: ( ( '!' ) )
            {
            // InternalMCEntity.g:7598:2: ( ( '!' ) )
            // InternalMCEntity.g:7599:3: ( '!' )
            {
             before(grammarAccess.getSelectorFilterAccess().getInvertedExclamationMarkKeyword_2_0()); 
            // InternalMCEntity.g:7600:3: ( '!' )
            // InternalMCEntity.g:7601:4: '!'
            {
             before(grammarAccess.getSelectorFilterAccess().getInvertedExclamationMarkKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSelectorFilterAccess().getInvertedExclamationMarkKeyword_2_0()); 

            }

             after(grammarAccess.getSelectorFilterAccess().getInvertedExclamationMarkKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__InvertedAssignment_2"


    // $ANTLR start "rule__SelectorFilter__ValueAssignment_3"
    // InternalMCEntity.g:7612:1: rule__SelectorFilter__ValueAssignment_3 : ( ruleSelectorValue ) ;
    public final void rule__SelectorFilter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7616:1: ( ( ruleSelectorValue ) )
            // InternalMCEntity.g:7617:2: ( ruleSelectorValue )
            {
            // InternalMCEntity.g:7617:2: ( ruleSelectorValue )
            // InternalMCEntity.g:7618:3: ruleSelectorValue
            {
             before(grammarAccess.getSelectorFilterAccess().getValueSelectorValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorValue();

            state._fsp--;

             after(grammarAccess.getSelectorFilterAccess().getValueSelectorValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorFilter__ValueAssignment_3"


    // $ANTLR start "rule__IntRange__BeginAssignment_0_1"
    // InternalMCEntity.g:7627:1: rule__IntRange__BeginAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__IntRange__BeginAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7631:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:7632:2: ( RULE_INT )
            {
            // InternalMCEntity.g:7632:2: ( RULE_INT )
            // InternalMCEntity.g:7633:3: RULE_INT
            {
             before(grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__BeginAssignment_0_1"


    // $ANTLR start "rule__IntRange__EndAssignment_0_3"
    // InternalMCEntity.g:7642:1: rule__IntRange__EndAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__IntRange__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7646:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:7647:2: ( RULE_INT )
            {
            // InternalMCEntity.g:7647:2: ( RULE_INT )
            // InternalMCEntity.g:7648:3: RULE_INT
            {
             before(grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__EndAssignment_0_3"


    // $ANTLR start "rule__IntRange__BeginAssignment_1_1"
    // InternalMCEntity.g:7657:1: rule__IntRange__BeginAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__IntRange__BeginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7661:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:7662:2: ( RULE_INT )
            {
            // InternalMCEntity.g:7662:2: ( RULE_INT )
            // InternalMCEntity.g:7663:3: RULE_INT
            {
             before(grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getBeginINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__BeginAssignment_1_1"


    // $ANTLR start "rule__IntRange__EndAssignment_2_2"
    // InternalMCEntity.g:7672:1: rule__IntRange__EndAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__IntRange__EndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7676:1: ( ( RULE_INT ) )
            // InternalMCEntity.g:7677:2: ( RULE_INT )
            {
            // InternalMCEntity.g:7677:2: ( RULE_INT )
            // InternalMCEntity.g:7678:3: RULE_INT
            {
             before(grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntRangeAccess().getEndINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntRange__EndAssignment_2_2"


    // $ANTLR start "rule__DoubleRange__BeginAssignment_0_1_0_0"
    // InternalMCEntity.g:7687:1: rule__DoubleRange__BeginAssignment_0_1_0_0 : ( ruleINTasDouble ) ;
    public final void rule__DoubleRange__BeginAssignment_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7691:1: ( ( ruleINTasDouble ) )
            // InternalMCEntity.g:7692:2: ( ruleINTasDouble )
            {
            // InternalMCEntity.g:7692:2: ( ruleINTasDouble )
            // InternalMCEntity.g:7693:3: ruleINTasDouble
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginINTasDoubleParserRuleCall_0_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleINTasDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRangeAccess().getBeginINTasDoubleParserRuleCall_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__BeginAssignment_0_1_0_0"


    // $ANTLR start "rule__DoubleRange__EndAssignment_0_1_0_2"
    // InternalMCEntity.g:7702:1: rule__DoubleRange__EndAssignment_0_1_0_2 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleRange__EndAssignment_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7706:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7707:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7707:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7708:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_0_1_0_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_0_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__EndAssignment_0_1_0_2"


    // $ANTLR start "rule__DoubleRange__BeginAssignment_0_1_1_0"
    // InternalMCEntity.g:7717:1: rule__DoubleRange__BeginAssignment_0_1_1_0 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleRange__BeginAssignment_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7721:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7722:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7722:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7723:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_0_1_1_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__BeginAssignment_0_1_1_0"


    // $ANTLR start "rule__DoubleRange__EndAssignment_0_1_1_2"
    // InternalMCEntity.g:7732:1: rule__DoubleRange__EndAssignment_0_1_1_2 : ( ruleDOUBLEorINT ) ;
    public final void rule__DoubleRange__EndAssignment_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7736:1: ( ( ruleDOUBLEorINT ) )
            // InternalMCEntity.g:7737:2: ( ruleDOUBLEorINT )
            {
            // InternalMCEntity.g:7737:2: ( ruleDOUBLEorINT )
            // InternalMCEntity.g:7738:3: ruleDOUBLEorINT
            {
             before(grammarAccess.getDoubleRangeAccess().getEndDOUBLEorINTParserRuleCall_0_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLEorINT();

            state._fsp--;

             after(grammarAccess.getDoubleRangeAccess().getEndDOUBLEorINTParserRuleCall_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__EndAssignment_0_1_1_2"


    // $ANTLR start "rule__DoubleRange__BeginAssignment_1_1"
    // InternalMCEntity.g:7747:1: rule__DoubleRange__BeginAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleRange__BeginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7751:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7752:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7752:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7753:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_1_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getBeginDOUBLETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__BeginAssignment_1_1"


    // $ANTLR start "rule__DoubleRange__EndAssignment_2_2"
    // InternalMCEntity.g:7762:1: rule__DoubleRange__EndAssignment_2_2 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleRange__EndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7766:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7767:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7767:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7768:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_2_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleRangeAccess().getEndDOUBLETerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleRange__EndAssignment_2_2"


    // $ANTLR start "rule__IntSelectorValue__ValueAssignment"
    // InternalMCEntity.g:7777:1: rule__IntSelectorValue__ValueAssignment : ( ruleINTAsLong ) ;
    public final void rule__IntSelectorValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7781:1: ( ( ruleINTAsLong ) )
            // InternalMCEntity.g:7782:2: ( ruleINTAsLong )
            {
            // InternalMCEntity.g:7782:2: ( ruleINTAsLong )
            // InternalMCEntity.g:7783:3: ruleINTAsLong
            {
             before(grammarAccess.getIntSelectorValueAccess().getValueINTAsLongParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINTAsLong();

            state._fsp--;

             after(grammarAccess.getIntSelectorValueAccess().getValueINTAsLongParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntSelectorValue__ValueAssignment"


    // $ANTLR start "rule__DoubleSelectorValue__ValueAssignment"
    // InternalMCEntity.g:7792:1: rule__DoubleSelectorValue__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__DoubleSelectorValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7796:1: ( ( RULE_DOUBLE ) )
            // InternalMCEntity.g:7797:2: ( RULE_DOUBLE )
            {
            // InternalMCEntity.g:7797:2: ( RULE_DOUBLE )
            // InternalMCEntity.g:7798:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleSelectorValueAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleSelectorValueAccess().getValueDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleSelectorValue__ValueAssignment"


    // $ANTLR start "rule__BoolSelectorValue__ValueAssignment_0"
    // InternalMCEntity.g:7807:1: rule__BoolSelectorValue__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BoolSelectorValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7811:1: ( ( ( 'true' ) ) )
            // InternalMCEntity.g:7812:2: ( ( 'true' ) )
            {
            // InternalMCEntity.g:7812:2: ( ( 'true' ) )
            // InternalMCEntity.g:7813:3: ( 'true' )
            {
             before(grammarAccess.getBoolSelectorValueAccess().getValueTrueKeyword_0_0()); 
            // InternalMCEntity.g:7814:3: ( 'true' )
            // InternalMCEntity.g:7815:4: 'true'
            {
             before(grammarAccess.getBoolSelectorValueAccess().getValueTrueKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBoolSelectorValueAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBoolSelectorValueAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolSelectorValue__ValueAssignment_0"


    // $ANTLR start "rule__StringSelectorValue__ValueAssignment"
    // InternalMCEntity.g:7826:1: rule__StringSelectorValue__ValueAssignment : ( ( rule__StringSelectorValue__ValueAlternatives_0 ) ) ;
    public final void rule__StringSelectorValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7830:1: ( ( ( rule__StringSelectorValue__ValueAlternatives_0 ) ) )
            // InternalMCEntity.g:7831:2: ( ( rule__StringSelectorValue__ValueAlternatives_0 ) )
            {
            // InternalMCEntity.g:7831:2: ( ( rule__StringSelectorValue__ValueAlternatives_0 ) )
            // InternalMCEntity.g:7832:3: ( rule__StringSelectorValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getStringSelectorValueAccess().getValueAlternatives_0()); 
            // InternalMCEntity.g:7833:3: ( rule__StringSelectorValue__ValueAlternatives_0 )
            // InternalMCEntity.g:7833:4: rule__StringSelectorValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StringSelectorValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringSelectorValueAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringSelectorValue__ValueAssignment"


    // $ANTLR start "rule__NamespacedKey__NamespaceAssignment_0"
    // InternalMCEntity.g:7841:1: rule__NamespacedKey__NamespaceAssignment_0 : ( ruleUnquotedString ) ;
    public final void rule__NamespacedKey__NamespaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7845:1: ( ( ruleUnquotedString ) )
            // InternalMCEntity.g:7846:2: ( ruleUnquotedString )
            {
            // InternalMCEntity.g:7846:2: ( ruleUnquotedString )
            // InternalMCEntity.g:7847:3: ruleUnquotedString
            {
             before(grammarAccess.getNamespacedKeyAccess().getNamespaceUnquotedStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyAccess().getNamespaceUnquotedStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__NamespaceAssignment_0"


    // $ANTLR start "rule__NamespacedKey__KeyAssignment_2"
    // InternalMCEntity.g:7856:1: rule__NamespacedKey__KeyAssignment_2 : ( ruleNamespacedKeyKey ) ;
    public final void rule__NamespacedKey__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCEntity.g:7860:1: ( ( ruleNamespacedKeyKey ) )
            // InternalMCEntity.g:7861:2: ( ruleNamespacedKeyKey )
            {
            // InternalMCEntity.g:7861:2: ( ruleNamespacedKeyKey )
            // InternalMCEntity.g:7862:3: ruleNamespacedKeyKey
            {
             before(grammarAccess.getNamespacedKeyAccess().getKeyNamespacedKeyKeyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespacedKeyKey();

            state._fsp--;

             after(grammarAccess.getNamespacedKeyAccess().getKeyNamespacedKeyKeyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespacedKey__KeyAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\11\uffff\4\15\1\uffff\12\15\1\uffff";
    static final String dfa_3s = "\1\4\10\uffff\4\4\1\uffff\12\4\1\uffff";
    static final String dfa_4s = "\1\61\10\uffff\4\52\1\uffff\12\52\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\12\12\uffff\1\11";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\2\15\1\10\1\11\4\10\1\3\1\4\1\5\1\1\1\uffff\1\1\1\uffff\1\1\12\uffff\1\12\1\13\1\14\5\uffff\1\2\4\uffff\1\6\1\7\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
            "\1\22\2\uffff\1\24\1\16\1\23\1\25\1\26\1\27\22\uffff\1\17\1\20\1\21\6\uffff\2\15\1\30",
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
            return "1258:1: rule__NBTValue__Alternatives : ( ( ruleNBTJSONTextComponent ) | ( ruleNBTCompound ) | ( ruleNBTByteArray ) | ( ruleNBTLongArray ) | ( ruleNBTIntArray ) | ( ruleNBTArray ) | ( ruleNBTBool ) | ( ruleNBTNumber ) | ( ruleNamespacedKey ) | ( ruleNBTString ) );";
        }
    }
    static final String dfa_8s = "\33\uffff";
    static final String dfa_9s = "\2\uffff\4\11\1\26\1\uffff\1\32\2\uffff\12\11\2\uffff\1\31\3\uffff";
    static final String dfa_10s = "\1\4\1\uffff\4\4\1\51\1\4\1\51\2\uffff\12\4\2\uffff\1\4\3\uffff";
    static final String dfa_11s = "\1\61\1\uffff\4\53\1\57\1\7\1\57\2\uffff\12\53\2\uffff\1\53\3\uffff";
    static final String dfa_12s = "\1\uffff\1\1\7\uffff\1\7\1\10\12\uffff\1\2\1\5\1\uffff\1\4\1\3\1\6";
    static final String dfa_13s = "\33\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\11\1\uffff\1\10\1\2\26\uffff\1\3\1\4\1\5\5\uffff\1\1\5\uffff\1\12\1\uffff\1\7\1\uffff\1\12",
            "",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\26\1\uffff\1\26\3\uffff\1\27",
            "\1\31\2\uffff\1\30",
            "\1\32\1\uffff\1\32\3\uffff\1\30",
            "",
            "",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "\1\17\2\uffff\1\21\1\13\1\20\1\22\1\23\1\24\22\uffff\1\14\1\15\1\16\7\uffff\1\11\1\25\1\11",
            "",
            "",
            "\1\31\2\uffff\1\30\41\uffff\1\31\1\uffff\1\31",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1654:1: rule__SelectorValue__Alternatives : ( ( ruleNBTCompound ) | ( ruleNamespacedKey ) | ( ruleIntRange ) | ( ruleDoubleRange ) | ( ruleIntSelectorValue ) | ( ruleDoubleSelectorValue ) | ( ruleStringSelectorValue ) | ( ruleBoolSelectorValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010380000120L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000380000120L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000230838015FFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000238838015FFF0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002200000001E90L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000150000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000230FC000000B0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000238FC000000B0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0006A083800001B0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000090L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000380001F90L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000380001F92L});

}