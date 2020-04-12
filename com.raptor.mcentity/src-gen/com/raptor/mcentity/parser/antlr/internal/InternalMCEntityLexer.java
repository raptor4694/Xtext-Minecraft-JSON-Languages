package com.raptor.mcentity.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCEntityLexer extends Lexer {
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

    public InternalMCEntityLexer() {;} 
    public InternalMCEntityLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMCEntityLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMCEntity.g"; }

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:11:7: ( '{' )
            // InternalMCEntity.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:12:7: ( ',' )
            // InternalMCEntity.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:13:7: ( '}' )
            // InternalMCEntity.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:14:7: ( ':' )
            // InternalMCEntity.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:15:7: ( ']' )
            // InternalMCEntity.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:16:7: ( '[' )
            // InternalMCEntity.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:17:7: ( 'true' )
            // InternalMCEntity.g:17:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:18:7: ( 'false' )
            // InternalMCEntity.g:18:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:19:7: ( '=' )
            // InternalMCEntity.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:20:7: ( '!' )
            // InternalMCEntity.g:20:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:21:7: ( '..' )
            // InternalMCEntity.g:21:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:22:7: ( '/' )
            // InternalMCEntity.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:23:7: ( '-' )
            // InternalMCEntity.g:23:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:24:7: ( '.' )
            // InternalMCEntity.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:25:7: ( '+' )
            // InternalMCEntity.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:26:7: ( '@p' )
            // InternalMCEntity.g:26:9: '@p'
            {
            match("@p"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:27:7: ( '@a' )
            // InternalMCEntity.g:27:9: '@a'
            {
            match("@a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:28:7: ( '@s' )
            // InternalMCEntity.g:28:9: '@s'
            {
            match("@s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:29:7: ( '@e' )
            // InternalMCEntity.g:29:9: '@e'
            {
            match("@e"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:30:7: ( '@r' )
            // InternalMCEntity.g:30:9: '@r'
            {
            match("@r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_NBT_BYTE_ARRAY_START"
    public final void mRULE_NBT_BYTE_ARRAY_START() throws RecognitionException {
        try {
            int _type = RULE_NBT_BYTE_ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3461:27: ( '[B;' )
            // InternalMCEntity.g:3461:29: '[B;'
            {
            match("[B;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NBT_BYTE_ARRAY_START"

    // $ANTLR start "RULE_NBT_INT_ARRAY_START"
    public final void mRULE_NBT_INT_ARRAY_START() throws RecognitionException {
        try {
            int _type = RULE_NBT_INT_ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3463:26: ( '[I;' )
            // InternalMCEntity.g:3463:28: '[I;'
            {
            match("[I;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NBT_INT_ARRAY_START"

    // $ANTLR start "RULE_NBT_LONG_ARRAY_START"
    public final void mRULE_NBT_LONG_ARRAY_START() throws RecognitionException {
        try {
            int _type = RULE_NBT_LONG_ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3465:27: ( '[L;' )
            // InternalMCEntity.g:3465:29: '[L;'
            {
            match("[L;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NBT_LONG_ARRAY_START"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalMCEntity.g:3467:20: ( ( '-' | '+' )? )
            // InternalMCEntity.g:3467:22: ( '-' | '+' )?
            {
            // InternalMCEntity.g:3467:22: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMCEntity.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            // InternalMCEntity.g:3469:19: ( ( 'e' | 'E' ) RULE_SIGN ( '0' .. '9' )+ )
            // InternalMCEntity.g:3469:21: ( 'e' | 'E' ) RULE_SIGN ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_SIGN(); 
            // InternalMCEntity.g:3469:41: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMCEntity.g:3469:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3471:12: ( RULE_SIGN ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( RULE_EXP )? ( 'f' | 'F' ) )
            // InternalMCEntity.g:3471:14: RULE_SIGN ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( RULE_EXP )? ( 'f' | 'F' )
            {
            mRULE_SIGN(); 
            // InternalMCEntity.g:3471:24: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMCEntity.g:3471:25: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // InternalMCEntity.g:3471:25: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMCEntity.g:3471:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // InternalMCEntity.g:3471:37: ( '.' ( '0' .. '9' )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMCEntity.g:3471:38: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // InternalMCEntity.g:3471:42: ( '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalMCEntity.g:3471:43: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3471:56: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalMCEntity.g:3471:60: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMCEntity.g:3471:61: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalMCEntity.g:3471:73: ( RULE_EXP )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMCEntity.g:3471:73: RULE_EXP
                    {
                    mRULE_EXP(); 

                    }
                    break;

            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3473:13: ( RULE_SIGN ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )? | RULE_EXP ( 'd' | 'D' )? | ( 'd' | 'D' ) ) | '.' ( '0' .. '9' )+ ( RULE_EXP )? ( 'd' | 'D' )? ) )
            // InternalMCEntity.g:3473:15: RULE_SIGN ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )? | RULE_EXP ( 'd' | 'D' )? | ( 'd' | 'D' ) ) | '.' ( '0' .. '9' )+ ( RULE_EXP )? ( 'd' | 'D' )? )
            {
            mRULE_SIGN(); 
            // InternalMCEntity.g:3473:25: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )? | RULE_EXP ( 'd' | 'D' )? | ( 'd' | 'D' ) ) | '.' ( '0' .. '9' )+ ( RULE_EXP )? ( 'd' | 'D' )? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='.') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMCEntity.g:3473:26: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )? | RULE_EXP ( 'd' | 'D' )? | ( 'd' | 'D' ) )
                    {
                    // InternalMCEntity.g:3473:26: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMCEntity.g:3473:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // InternalMCEntity.g:3473:38: ( '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )? | RULE_EXP ( 'd' | 'D' )? | ( 'd' | 'D' ) )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case '.':
                        {
                        alt14=1;
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        alt14=2;
                        }
                        break;
                    case 'D':
                    case 'd':
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // InternalMCEntity.g:3473:39: '.' ( '0' .. '9' )* ( RULE_EXP )? ( 'd' | 'D' )?
                            {
                            match('.'); 
                            // InternalMCEntity.g:3473:43: ( '0' .. '9' )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalMCEntity.g:3473:44: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            // InternalMCEntity.g:3473:55: ( RULE_EXP )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='E'||LA11_0=='e') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalMCEntity.g:3473:55: RULE_EXP
                                    {
                                    mRULE_EXP(); 

                                    }
                                    break;

                            }

                            // InternalMCEntity.g:3473:65: ( 'd' | 'D' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0=='D'||LA12_0=='d') ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // InternalMCEntity.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:3473:76: RULE_EXP ( 'd' | 'D' )?
                            {
                            mRULE_EXP(); 
                            // InternalMCEntity.g:3473:85: ( 'd' | 'D' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='D'||LA13_0=='d') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalMCEntity.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // InternalMCEntity.g:3473:96: ( 'd' | 'D' )
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3473:107: '.' ( '0' .. '9' )+ ( RULE_EXP )? ( 'd' | 'D' )?
                    {
                    match('.'); 
                    // InternalMCEntity.g:3473:111: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMCEntity.g:3473:112: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // InternalMCEntity.g:3473:123: ( RULE_EXP )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMCEntity.g:3473:123: RULE_EXP
                            {
                            mRULE_EXP(); 

                            }
                            break;

                    }

                    // InternalMCEntity.g:3473:133: ( 'd' | 'D' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='d') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMCEntity.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalMCEntity.g:3475:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalMCEntity.g:3475:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_INTBASE"
    public final void mRULE_INTBASE() throws RecognitionException {
        try {
            // InternalMCEntity.g:3477:23: ( ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? | '0' ( 'b' | 'B' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )? )? | '0' | '1' ( '0' .. '9' ( '0' .. '9' )? )? | '2' ( '5' ( '0' .. '5' )? | '0' .. '4' ( '0' .. '9' )? | ( '6' .. '9' )? ) | '3' .. '9' ( '0' .. '9' )? ) )
            // InternalMCEntity.g:3477:25: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? | '0' ( 'b' | 'B' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )? )? | '0' | '1' ( '0' .. '9' ( '0' .. '9' )? )? | '2' ( '5' ( '0' .. '5' )? | '0' .. '4' ( '0' .. '9' )? | ( '6' .. '9' )? ) | '3' .. '9' ( '0' .. '9' )? )
            {
            // InternalMCEntity.g:3477:25: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? | '0' ( 'b' | 'B' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )? )? | '0' | '1' ( '0' .. '9' ( '0' .. '9' )? )? | '2' ( '5' ( '0' .. '5' )? | '0' .. '4' ( '0' .. '9' )? | ( '6' .. '9' )? ) | '3' .. '9' ( '0' .. '9' )? )
            int alt35=6;
            switch ( input.LA(1) ) {
            case '0':
                {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt35=1;
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    alt35=2;
                    }
                    break;
                default:
                    alt35=3;}

                }
                break;
            case '1':
                {
                alt35=4;
                }
                break;
            case '2':
                {
                alt35=5;
                }
                break;
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMCEntity.g:3477:26: '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )?
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_HEX_DIGIT(); 
                    // InternalMCEntity.g:3477:55: ( RULE_HEX_DIGIT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='a' && LA19_0<='f')) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMCEntity.g:3477:55: RULE_HEX_DIGIT
                            {
                            mRULE_HEX_DIGIT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3477:71: '0' ( 'b' | 'B' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )? )?
                    {
                    match('0'); 
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMCEntity.g:3477:85: ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )? )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>='0' && LA27_0<='1')) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMCEntity.g:3477:86: ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )?
                            {
                            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalMCEntity.g:3477:96: ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )? )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>='0' && LA26_0<='1')) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalMCEntity.g:3477:97: ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )?
                                    {
                                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // InternalMCEntity.g:3477:107: ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )? )?
                                    int alt25=2;
                                    int LA25_0 = input.LA(1);

                                    if ( ((LA25_0>='0' && LA25_0<='1')) ) {
                                        alt25=1;
                                    }
                                    switch (alt25) {
                                        case 1 :
                                            // InternalMCEntity.g:3477:108: ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )?
                                            {
                                            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                input.consume();

                                            }
                                            else {
                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                recover(mse);
                                                throw mse;}

                                            // InternalMCEntity.g:3477:118: ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )? )?
                                            int alt24=2;
                                            int LA24_0 = input.LA(1);

                                            if ( ((LA24_0>='0' && LA24_0<='1')) ) {
                                                alt24=1;
                                            }
                                            switch (alt24) {
                                                case 1 :
                                                    // InternalMCEntity.g:3477:119: ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )?
                                                    {
                                                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                        input.consume();

                                                    }
                                                    else {
                                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                                        recover(mse);
                                                        throw mse;}

                                                    // InternalMCEntity.g:3477:129: ( ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )? )?
                                                    int alt23=2;
                                                    int LA23_0 = input.LA(1);

                                                    if ( ((LA23_0>='0' && LA23_0<='1')) ) {
                                                        alt23=1;
                                                    }
                                                    switch (alt23) {
                                                        case 1 :
                                                            // InternalMCEntity.g:3477:130: ( '0' | '1' ) ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )?
                                                            {
                                                            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                                input.consume();

                                                            }
                                                            else {
                                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                recover(mse);
                                                                throw mse;}

                                                            // InternalMCEntity.g:3477:140: ( ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )? )?
                                                            int alt22=2;
                                                            int LA22_0 = input.LA(1);

                                                            if ( ((LA22_0>='0' && LA22_0<='1')) ) {
                                                                alt22=1;
                                                            }
                                                            switch (alt22) {
                                                                case 1 :
                                                                    // InternalMCEntity.g:3477:141: ( '0' | '1' ) ( ( '0' | '1' ) ( '0' | '1' )? )?
                                                                    {
                                                                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                                        input.consume();

                                                                    }
                                                                    else {
                                                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                        recover(mse);
                                                                        throw mse;}

                                                                    // InternalMCEntity.g:3477:151: ( ( '0' | '1' ) ( '0' | '1' )? )?
                                                                    int alt21=2;
                                                                    int LA21_0 = input.LA(1);

                                                                    if ( ((LA21_0>='0' && LA21_0<='1')) ) {
                                                                        alt21=1;
                                                                    }
                                                                    switch (alt21) {
                                                                        case 1 :
                                                                            // InternalMCEntity.g:3477:152: ( '0' | '1' ) ( '0' | '1' )?
                                                                            {
                                                                            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                                                input.consume();

                                                                            }
                                                                            else {
                                                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                                recover(mse);
                                                                                throw mse;}

                                                                            // InternalMCEntity.g:3477:162: ( '0' | '1' )?
                                                                            int alt20=2;
                                                                            int LA20_0 = input.LA(1);

                                                                            if ( ((LA20_0>='0' && LA20_0<='1')) ) {
                                                                                alt20=1;
                                                                            }
                                                                            switch (alt20) {
                                                                                case 1 :
                                                                                    // InternalMCEntity.g:
                                                                                    {
                                                                                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                                                                                        input.consume();

                                                                                    }
                                                                                    else {
                                                                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                                        recover(mse);
                                                                                        throw mse;}


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:3477:187: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 4 :
                    // InternalMCEntity.g:3477:191: '1' ( '0' .. '9' ( '0' .. '9' )? )?
                    {
                    match('1'); 
                    // InternalMCEntity.g:3477:195: ( '0' .. '9' ( '0' .. '9' )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMCEntity.g:3477:196: '0' .. '9' ( '0' .. '9' )?
                            {
                            matchRange('0','9'); 
                            // InternalMCEntity.g:3477:205: ( '0' .. '9' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalMCEntity.g:3477:206: '0' .. '9'
                                    {
                                    matchRange('0','9'); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalMCEntity.g:3477:219: '2' ( '5' ( '0' .. '5' )? | '0' .. '4' ( '0' .. '9' )? | ( '6' .. '9' )? )
                    {
                    match('2'); 
                    // InternalMCEntity.g:3477:223: ( '5' ( '0' .. '5' )? | '0' .. '4' ( '0' .. '9' )? | ( '6' .. '9' )? )
                    int alt33=3;
                    switch ( input.LA(1) ) {
                    case '5':
                        {
                        alt33=1;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                        {
                        alt33=2;
                        }
                        break;
                    default:
                        alt33=3;}

                    switch (alt33) {
                        case 1 :
                            // InternalMCEntity.g:3477:224: '5' ( '0' .. '5' )?
                            {
                            match('5'); 
                            // InternalMCEntity.g:3477:228: ( '0' .. '5' )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>='0' && LA30_0<='5')) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalMCEntity.g:3477:229: '0' .. '5'
                                    {
                                    matchRange('0','5'); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:3477:240: '0' .. '4' ( '0' .. '9' )?
                            {
                            matchRange('0','4'); 
                            // InternalMCEntity.g:3477:249: ( '0' .. '9' )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalMCEntity.g:3477:250: '0' .. '9'
                                    {
                                    matchRange('0','9'); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // InternalMCEntity.g:3477:261: ( '6' .. '9' )?
                            {
                            // InternalMCEntity.g:3477:261: ( '6' .. '9' )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( ((LA32_0>='6' && LA32_0<='9')) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalMCEntity.g:3477:262: '6' .. '9'
                                    {
                                    matchRange('6','9'); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalMCEntity.g:3477:274: '3' .. '9' ( '0' .. '9' )?
                    {
                    matchRange('3','9'); 
                    // InternalMCEntity.g:3477:283: ( '0' .. '9' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>='0' && LA34_0<='9')) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMCEntity.g:3477:284: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTBASE"

    // $ANTLR start "RULE_SIGNEDINTBASE"
    public final void mRULE_SIGNEDINTBASE() throws RecognitionException {
        try {
            // InternalMCEntity.g:3479:29: ( ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ | '0' ( 'b' | 'B' ) ( '0' | '1' )+ | RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* ) ) )
            // InternalMCEntity.g:3479:31: ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ | '0' ( 'b' | 'B' ) ( '0' | '1' )+ | RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            {
            // InternalMCEntity.g:3479:31: ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ | '0' ( 'b' | 'B' ) ( '0' | '1' )+ | RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt40=1;
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    alt40=2;
                    }
                    break;
                default:
                    alt40=3;}

            }
            else if ( (LA40_0=='+'||LA40_0=='-'||(LA40_0>='1' && LA40_0<='9')) ) {
                alt40=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMCEntity.g:3479:32: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMCEntity.g:3479:46: ( RULE_HEX_DIGIT )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>='0' && LA36_0<='9')||(LA36_0>='A' && LA36_0<='F')||(LA36_0>='a' && LA36_0<='f')) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMCEntity.g:3479:46: RULE_HEX_DIGIT
                    	    {
                    	    mRULE_HEX_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3479:62: '0' ( 'b' | 'B' ) ( '0' | '1' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMCEntity.g:3479:76: ( '0' | '1' )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>='0' && LA37_0<='1')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMCEntity.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMCEntity.g:3479:87: RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* )
                    {
                    mRULE_SIGN(); 
                    // InternalMCEntity.g:3479:97: ( '0' | '1' .. '9' ( '0' .. '9' )* )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='0') ) {
                        alt39=1;
                    }
                    else if ( ((LA39_0>='1' && LA39_0<='9')) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMCEntity.g:3479:98: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:3479:102: '1' .. '9' ( '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // InternalMCEntity.g:3479:111: ( '0' .. '9' )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( ((LA38_0>='0' && LA38_0<='9')) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalMCEntity.g:3479:112: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNEDINTBASE"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3481:11: ( RULE_SIGNEDINTBASE ( 'l' | 'L' ) )
            // InternalMCEntity.g:3481:13: RULE_SIGNEDINTBASE ( 'l' | 'L' )
            {
            mRULE_SIGNEDINTBASE(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_SHORT"
    public final void mRULE_SHORT() throws RecognitionException {
        try {
            int _type = RULE_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3483:12: ( RULE_SIGNEDINTBASE ( 's' | 'S' ) )
            // InternalMCEntity.g:3483:14: RULE_SIGNEDINTBASE ( 's' | 'S' )
            {
            mRULE_SIGNEDINTBASE(); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHORT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3485:10: ( ( RULE_SIGNEDINTBASE | 'rgb' ( RULE_WS )? '(' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ')' ) )
            // InternalMCEntity.g:3485:12: ( RULE_SIGNEDINTBASE | 'rgb' ( RULE_WS )? '(' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ')' )
            {
            // InternalMCEntity.g:3485:12: ( RULE_SIGNEDINTBASE | 'rgb' ( RULE_WS )? '(' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ')' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='+'||LA48_0=='-'||(LA48_0>='0' && LA48_0<='9')) ) {
                alt48=1;
            }
            else if ( (LA48_0=='r') ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMCEntity.g:3485:13: RULE_SIGNEDINTBASE
                    {
                    mRULE_SIGNEDINTBASE(); 

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3485:32: 'rgb' ( RULE_WS )? '(' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ',' ( RULE_WS )? RULE_INTBASE ( RULE_WS )? ')'
                    {
                    match("rgb"); 

                    // InternalMCEntity.g:3485:38: ( RULE_WS )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>='\t' && LA41_0<='\n')||LA41_0=='\r'||LA41_0==' ') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMCEntity.g:3485:38: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    match('('); 
                    // InternalMCEntity.g:3485:51: ( RULE_WS )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMCEntity.g:3485:51: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    mRULE_INTBASE(); 
                    // InternalMCEntity.g:3485:73: ( RULE_WS )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMCEntity.g:3485:73: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    match(','); 
                    // InternalMCEntity.g:3485:86: ( RULE_WS )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>='\t' && LA44_0<='\n')||LA44_0=='\r'||LA44_0==' ') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMCEntity.g:3485:86: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    mRULE_INTBASE(); 
                    // InternalMCEntity.g:3485:108: ( RULE_WS )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMCEntity.g:3485:108: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    match(','); 
                    // InternalMCEntity.g:3485:121: ( RULE_WS )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMCEntity.g:3485:121: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    mRULE_INTBASE(); 
                    // InternalMCEntity.g:3485:143: ( RULE_WS )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalMCEntity.g:3485:143: RULE_WS
                            {
                            mRULE_WS(); 

                            }
                            break;

                    }

                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3487:11: ( RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'b' | 'B' ) )
            // InternalMCEntity.g:3487:13: RULE_SIGN ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'b' | 'B' )
            {
            mRULE_SIGN(); 
            // InternalMCEntity.g:3487:23: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='0') ) {
                alt50=1;
            }
            else if ( ((LA50_0>='1' && LA50_0<='9')) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMCEntity.g:3487:24: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3487:28: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalMCEntity.g:3487:37: ( '0' .. '9' )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>='0' && LA49_0<='9')) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMCEntity.g:3487:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3489:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )
            // InternalMCEntity.g:3489:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            {
            // InternalMCEntity.g:3489:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>='0' && LA51_0<='9')||(LA51_0>='A' && LA51_0<='Z')||LA51_0=='_'||(LA51_0>='a' && LA51_0<='z')) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMCEntity.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_JSON_TEXT_BEGIN_OBJ"
    public final void mRULE_JSON_TEXT_BEGIN_OBJ() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_BEGIN_OBJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3491:26: ( '\\'{' )
            // InternalMCEntity.g:3491:28: '\\'{'
            {
            match("'{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_BEGIN_OBJ"

    // $ANTLR start "RULE_JSON_TEXT_END_OBJ"
    public final void mRULE_JSON_TEXT_END_OBJ() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_END_OBJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3493:24: ( '}\\'' )
            // InternalMCEntity.g:3493:26: '}\\''
            {
            match("}'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_END_OBJ"

    // $ANTLR start "RULE_JSON_TEXT_BEGIN_ARRAY"
    public final void mRULE_JSON_TEXT_BEGIN_ARRAY() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_BEGIN_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3495:28: ( '\\'[' )
            // InternalMCEntity.g:3495:30: '\\'['
            {
            match("'["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_BEGIN_ARRAY"

    // $ANTLR start "RULE_JSON_TEXT_END_ARRAY"
    public final void mRULE_JSON_TEXT_END_ARRAY() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_END_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3497:26: ( ']\\'' )
            // InternalMCEntity.g:3497:28: ']\\''
            {
            match("]'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_END_ARRAY"

    // $ANTLR start "RULE_JSON_TEXT_BEGIN_STR"
    public final void mRULE_JSON_TEXT_BEGIN_STR() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_BEGIN_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3499:26: ( '\\'\"' )
            // InternalMCEntity.g:3499:28: '\\'\"'
            {
            match("'\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_BEGIN_STR"

    // $ANTLR start "RULE_JSON_TEXT_END_STR"
    public final void mRULE_JSON_TEXT_END_STR() throws RecognitionException {
        try {
            int _type = RULE_JSON_TEXT_END_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3501:24: ( '\"\\'' )
            // InternalMCEntity.g:3501:26: '\"\\''
            {
            match("\"'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_TEXT_END_STR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3503:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMCEntity.g:3503:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMCEntity.g:3503:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop52:
            do {
                int alt52=3;
                int LA52_0 = input.LA(1);

                if ( (LA52_0=='\\') ) {
                    alt52=1;
                }
                else if ( ((LA52_0>='\u0000' && LA52_0<='!')||(LA52_0>='#' && LA52_0<='[')||(LA52_0>=']' && LA52_0<='\uFFFF')) ) {
                    alt52=2;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMCEntity.g:3503:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMCEntity.g:3503:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SINGLE_STRING"
    public final void mRULE_SINGLE_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3505:20: ( '\\'' ( '\\'' | ( '\\\\' . | ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) ) ) ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMCEntity.g:3505:22: '\\'' ( '\\'' | ( '\\\\' . | ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) ) ) ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            match('\''); 
            // InternalMCEntity.g:3505:27: ( '\\'' | ( '\\\\' . | ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) ) ) ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='\'') ) {
                alt55=1;
            }
            else if ( ((LA55_0>='\u0000' && LA55_0<='!')||(LA55_0>='#' && LA55_0<='&')||(LA55_0>='(' && LA55_0<='Z')||(LA55_0>='\\' && LA55_0<='z')||(LA55_0>='|' && LA55_0<='\uFFFF')) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalMCEntity.g:3505:28: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 2 :
                    // InternalMCEntity.g:3505:33: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) ) ) ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    // InternalMCEntity.g:3505:33: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0=='\\') ) {
                        alt53=1;
                    }
                    else if ( ((LA53_0>='\u0000' && LA53_0<='!')||(LA53_0>='#' && LA53_0<='&')||(LA53_0>='(' && LA53_0<='Z')||(LA53_0>=']' && LA53_0<='z')||(LA53_0>='|' && LA53_0<='\uFFFF')) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalMCEntity.g:3505:34: '\\\\' .
                            {
                            match('\\'); 
                            matchAny(); 

                            }
                            break;
                        case 2 :
                            // InternalMCEntity.g:3505:41: ~ ( ( '\\\\' | '\\'' | '{' | '\"' | '[' ) )
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='Z')||(input.LA(1)>=']' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalMCEntity.g:3505:69: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='\\') ) {
                            alt54=1;
                        }
                        else if ( ((LA54_0>='\u0000' && LA54_0<='&')||(LA54_0>='(' && LA54_0<='[')||(LA54_0>=']' && LA54_0<='\uFFFF')) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalMCEntity.g:3505:70: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCEntity.g:3505:77: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3507:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMCEntity.g:3507:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMCEntity.g:3507:24: ( options {greedy=false; } : . )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0=='*') ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1=='/') ) {
                        alt56=2;
                    }
                    else if ( ((LA56_1>='\u0000' && LA56_1<='.')||(LA56_1>='0' && LA56_1<='\uFFFF')) ) {
                        alt56=1;
                    }


                }
                else if ( ((LA56_0>='\u0000' && LA56_0<=')')||(LA56_0>='+' && LA56_0<='\uFFFF')) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMCEntity.g:3507:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3509:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMCEntity.g:3509:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMCEntity.g:3509:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>='\u0000' && LA57_0<='\t')||(LA57_0>='\u000B' && LA57_0<='\f')||(LA57_0>='\u000E' && LA57_0<='\uFFFF')) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMCEntity.g:3509:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalMCEntity.g:3509:40: ( ( '\\r' )? '\\n' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0=='\n'||LA59_0=='\r') ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMCEntity.g:3509:41: ( '\\r' )? '\\n'
                    {
                    // InternalMCEntity.g:3509:41: ( '\\r' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='\r') ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalMCEntity.g:3509:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3511:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMCEntity.g:3511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMCEntity.g:3511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>='\t' && LA60_0<='\n')||LA60_0=='\r'||LA60_0==' ') ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMCEntity.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCEntity.g:3513:16: ( . )
            // InternalMCEntity.g:3513:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMCEntity.g:1:8: ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_NBT_BYTE_ARRAY_START | RULE_NBT_INT_ARRAY_START | RULE_NBT_LONG_ARRAY_START | RULE_FLOAT | RULE_DOUBLE | RULE_LONG | RULE_SHORT | RULE_INT | RULE_BYTE | RULE_ID | RULE_JSON_TEXT_BEGIN_OBJ | RULE_JSON_TEXT_END_OBJ | RULE_JSON_TEXT_BEGIN_ARRAY | RULE_JSON_TEXT_END_ARRAY | RULE_JSON_TEXT_BEGIN_STR | RULE_JSON_TEXT_END_STR | RULE_STRING | RULE_SINGLE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt61=42;
        alt61 = dfa61.predict(input);
        switch (alt61) {
            case 1 :
                // InternalMCEntity.g:1:10: T__31
                {
                mT__31(); 

                }
                break;
            case 2 :
                // InternalMCEntity.g:1:16: T__32
                {
                mT__32(); 

                }
                break;
            case 3 :
                // InternalMCEntity.g:1:22: T__33
                {
                mT__33(); 

                }
                break;
            case 4 :
                // InternalMCEntity.g:1:28: T__34
                {
                mT__34(); 

                }
                break;
            case 5 :
                // InternalMCEntity.g:1:34: T__35
                {
                mT__35(); 

                }
                break;
            case 6 :
                // InternalMCEntity.g:1:40: T__36
                {
                mT__36(); 

                }
                break;
            case 7 :
                // InternalMCEntity.g:1:46: T__37
                {
                mT__37(); 

                }
                break;
            case 8 :
                // InternalMCEntity.g:1:52: T__38
                {
                mT__38(); 

                }
                break;
            case 9 :
                // InternalMCEntity.g:1:58: T__39
                {
                mT__39(); 

                }
                break;
            case 10 :
                // InternalMCEntity.g:1:64: T__40
                {
                mT__40(); 

                }
                break;
            case 11 :
                // InternalMCEntity.g:1:70: T__41
                {
                mT__41(); 

                }
                break;
            case 12 :
                // InternalMCEntity.g:1:76: T__42
                {
                mT__42(); 

                }
                break;
            case 13 :
                // InternalMCEntity.g:1:82: T__43
                {
                mT__43(); 

                }
                break;
            case 14 :
                // InternalMCEntity.g:1:88: T__44
                {
                mT__44(); 

                }
                break;
            case 15 :
                // InternalMCEntity.g:1:94: T__45
                {
                mT__45(); 

                }
                break;
            case 16 :
                // InternalMCEntity.g:1:100: T__46
                {
                mT__46(); 

                }
                break;
            case 17 :
                // InternalMCEntity.g:1:106: T__47
                {
                mT__47(); 

                }
                break;
            case 18 :
                // InternalMCEntity.g:1:112: T__48
                {
                mT__48(); 

                }
                break;
            case 19 :
                // InternalMCEntity.g:1:118: T__49
                {
                mT__49(); 

                }
                break;
            case 20 :
                // InternalMCEntity.g:1:124: T__50
                {
                mT__50(); 

                }
                break;
            case 21 :
                // InternalMCEntity.g:1:130: RULE_NBT_BYTE_ARRAY_START
                {
                mRULE_NBT_BYTE_ARRAY_START(); 

                }
                break;
            case 22 :
                // InternalMCEntity.g:1:156: RULE_NBT_INT_ARRAY_START
                {
                mRULE_NBT_INT_ARRAY_START(); 

                }
                break;
            case 23 :
                // InternalMCEntity.g:1:181: RULE_NBT_LONG_ARRAY_START
                {
                mRULE_NBT_LONG_ARRAY_START(); 

                }
                break;
            case 24 :
                // InternalMCEntity.g:1:207: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 25 :
                // InternalMCEntity.g:1:218: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 26 :
                // InternalMCEntity.g:1:230: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 27 :
                // InternalMCEntity.g:1:240: RULE_SHORT
                {
                mRULE_SHORT(); 

                }
                break;
            case 28 :
                // InternalMCEntity.g:1:251: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalMCEntity.g:1:260: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 30 :
                // InternalMCEntity.g:1:270: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalMCEntity.g:1:278: RULE_JSON_TEXT_BEGIN_OBJ
                {
                mRULE_JSON_TEXT_BEGIN_OBJ(); 

                }
                break;
            case 32 :
                // InternalMCEntity.g:1:303: RULE_JSON_TEXT_END_OBJ
                {
                mRULE_JSON_TEXT_END_OBJ(); 

                }
                break;
            case 33 :
                // InternalMCEntity.g:1:326: RULE_JSON_TEXT_BEGIN_ARRAY
                {
                mRULE_JSON_TEXT_BEGIN_ARRAY(); 

                }
                break;
            case 34 :
                // InternalMCEntity.g:1:353: RULE_JSON_TEXT_END_ARRAY
                {
                mRULE_JSON_TEXT_END_ARRAY(); 

                }
                break;
            case 35 :
                // InternalMCEntity.g:1:378: RULE_JSON_TEXT_BEGIN_STR
                {
                mRULE_JSON_TEXT_BEGIN_STR(); 

                }
                break;
            case 36 :
                // InternalMCEntity.g:1:403: RULE_JSON_TEXT_END_STR
                {
                mRULE_JSON_TEXT_END_STR(); 

                }
                break;
            case 37 :
                // InternalMCEntity.g:1:426: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalMCEntity.g:1:438: RULE_SINGLE_STRING
                {
                mRULE_SINGLE_STRING(); 

                }
                break;
            case 39 :
                // InternalMCEntity.g:1:457: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalMCEntity.g:1:473: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalMCEntity.g:1:489: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalMCEntity.g:1:497: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA61_eotS =
        "\3\uffff\1\33\1\uffff\1\36\1\42\2\44\2\uffff\1\51\1\55\1\56\1\62\1\27\2\72\1\44\1\uffff\2\27\15\uffff\1\44\1\uffff\1\44\4\uffff\1\117\4\uffff\1\72\1\uffff\1\72\6\uffff\1\44\1\124\1\uffff\1\44\1\117\1\120\1\44\1\121\1\117\1\125\1\72\1\124\1\44\4\uffff\1\136\2\uffff\2\44\10\uffff\3\72\1\uffff\2\117\1\uffff\1\44\1\uffff\1\147\1\44\1\uffff\3\117\1\uffff\1\117\1\uffff\1\151\1\uffff";
    static final String DFA61_eofS =
        "\152\uffff";
    static final String DFA61_minS =
        "\1\0\2\uffff\1\47\1\uffff\1\47\1\102\1\162\1\141\2\uffff\1\56\1\52\2\56\1\141\2\56\1\147\1\uffff\2\0\15\uffff\1\165\1\uffff\1\154\4\uffff\1\60\4\uffff\1\56\1\60\1\56\6\uffff\2\60\1\uffff\1\53\2\60\1\56\3\60\1\56\1\60\1\142\4\uffff\1\0\2\uffff\1\145\1\163\1\53\3\uffff\1\53\1\56\2\uffff\1\56\5\60\1\53\1\11\1\uffff\1\60\1\145\6\60\1\uffff\1\60\1\uffff";
    static final String DFA61_maxS =
        "\1\uffff\2\uffff\1\47\1\uffff\1\47\1\114\1\162\1\141\2\uffff\1\71\1\57\2\71\1\163\2\172\1\147\1\uffff\2\uffff\15\uffff\1\165\1\uffff\1\154\4\uffff\1\146\4\uffff\1\163\1\71\1\163\6\uffff\1\146\1\172\1\uffff\1\71\1\146\1\172\1\146\5\172\1\142\4\uffff\1\uffff\2\uffff\1\145\1\163\1\71\3\uffff\1\71\1\146\2\uffff\1\163\2\172\1\71\1\172\1\146\1\71\1\50\1\uffff\1\172\1\145\1\71\2\146\1\172\1\71\1\146\1\uffff\1\172\1\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\11\1\12\10\uffff\1\36\2\uffff\1\51\1\52\1\1\1\2\1\40\1\3\1\4\1\42\1\5\1\25\1\26\1\27\1\6\1\uffff\1\36\1\uffff\1\11\1\12\1\13\1\16\1\uffff\1\47\1\50\1\14\1\15\3\uffff\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\34\12\uffff\1\37\1\41\1\43\1\46\1\uffff\1\45\1\51\3\uffff\1\31\1\30\1\32\2\uffff\1\35\1\33\10\uffff\1\44\10\uffff\1\7\1\uffff\1\10";
    static final String DFA61_specialS =
        "\1\1\23\uffff\1\3\1\2\63\uffff\1\0\40\uffff}>";
    static final String[] DFA61_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\12\1\25\4\27\1\24\3\27\1\16\1\2\1\15\1\13\1\14\1\20\11\21\1\4\2\27\1\11\2\27\1\17\32\23\1\6\1\27\1\5\1\27\1\23\1\27\5\23\1\10\13\23\1\22\1\23\1\7\6\23\1\1\1\27\1\3\uff82\27",
            "",
            "",
            "\1\32",
            "",
            "\1\35",
            "\1\37\6\uffff\1\40\2\uffff\1\41",
            "\1\43",
            "\1\45",
            "",
            "",
            "\1\50\1\uffff\12\52",
            "\1\53\4\uffff\1\54",
            "\1\60\1\uffff\1\57\11\61",
            "\1\60\1\uffff\1\57\11\61",
            "\1\64\3\uffff\1\66\12\uffff\1\63\1\uffff\1\67\1\65",
            "\1\74\1\uffff\12\76\7\uffff\1\44\1\71\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\4\44\1\70\2\44\4\uffff\1\44\1\uffff\1\44\1\71\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\4\44\1\70\2\44",
            "\1\74\1\uffff\12\102\7\uffff\1\44\1\103\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\7\44\4\uffff\1\44\1\uffff\1\44\1\103\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\7\44",
            "\1\104",
            "",
            "\42\110\1\107\70\110\1\106\37\110\1\105\uff84\110",
            "\47\112\1\111\uffd8\112",
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
            "\1\114",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "\12\52\13\uffff\1\116\1\120\36\uffff\1\116\1\120",
            "",
            "",
            "",
            "",
            "\1\74\1\uffff\12\123\10\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125\16\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125",
            "\12\52",
            "\1\74\1\uffff\12\126\10\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125\16\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\127\7\uffff\6\127\32\uffff\6\127",
            "\2\130\10\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\131\1\uffff\1\131\2\uffff\12\132",
            "\12\133\13\uffff\1\134\1\120\36\uffff\1\134\1\120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\74\1\uffff\12\76\12\uffff\1\100\1\73\1\75\35\uffff\1\100\1\73\1\75",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\74\1\uffff\12\102\7\uffff\1\44\1\103\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\7\44\4\uffff\1\44\1\uffff\1\44\1\103\1\44\1\100\1\73\1\75\5\44\1\77\6\44\1\101\7\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\135",
            "",
            "",
            "",
            "",
            "\0\112",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141\1\uffff\1\141\2\uffff\12\142",
            "",
            "",
            "",
            "\1\131\1\uffff\1\131\2\uffff\12\143",
            "\1\74\1\uffff\12\123\12\uffff\1\117\1\122\1\120\35\uffff\1\117\1\122\1\120",
            "",
            "",
            "\1\74\1\uffff\12\126\10\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125\16\uffff\1\124\1\uffff\1\117\1\122\1\120\5\uffff\1\121\6\uffff\1\125",
            "\12\127\7\uffff\6\127\5\44\1\77\6\44\1\101\7\44\4\uffff\1\44\1\uffff\6\127\5\44\1\77\6\44\1\101\7\44",
            "\2\130\10\44\7\uffff\13\44\1\77\6\44\1\101\7\44\4\uffff\1\44\1\uffff\13\44\1\77\6\44\1\101\7\44",
            "\12\143",
            "\12\132\7\uffff\3\44\1\144\1\44\1\75\24\44\4\uffff\1\44\1\uffff\3\44\1\144\1\44\1\75\24\44",
            "\12\133\13\uffff\1\134\1\120\36\uffff\1\134\1\120",
            "\1\145\1\uffff\1\145\2\uffff\12\146",
            "\2\72\2\uffff\1\72\22\uffff\1\72\7\uffff\1\72",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\150",
            "\12\142",
            "\12\142\14\uffff\1\120\37\uffff\1\120",
            "\12\143\14\uffff\1\120\37\uffff\1\120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\146",
            "\12\146\14\uffff\1\120\37\uffff\1\120",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_NBT_BYTE_ARRAY_START | RULE_NBT_INT_ARRAY_START | RULE_NBT_LONG_ARRAY_START | RULE_FLOAT | RULE_DOUBLE | RULE_LONG | RULE_SHORT | RULE_INT | RULE_BYTE | RULE_ID | RULE_JSON_TEXT_BEGIN_OBJ | RULE_JSON_TEXT_END_OBJ | RULE_JSON_TEXT_BEGIN_ARRAY | RULE_JSON_TEXT_END_ARRAY | RULE_JSON_TEXT_BEGIN_STR | RULE_JSON_TEXT_END_STR | RULE_STRING | RULE_SINGLE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_73 = input.LA(1);

                        s = -1;
                        if ( ((LA61_73>='\u0000' && LA61_73<='\uFFFF')) ) {s = 74;}

                        else s = 94;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_0 = input.LA(1);

                        s = -1;
                        if ( (LA61_0=='{') ) {s = 1;}

                        else if ( (LA61_0==',') ) {s = 2;}

                        else if ( (LA61_0=='}') ) {s = 3;}

                        else if ( (LA61_0==':') ) {s = 4;}

                        else if ( (LA61_0==']') ) {s = 5;}

                        else if ( (LA61_0=='[') ) {s = 6;}

                        else if ( (LA61_0=='t') ) {s = 7;}

                        else if ( (LA61_0=='f') ) {s = 8;}

                        else if ( (LA61_0=='=') ) {s = 9;}

                        else if ( (LA61_0=='!') ) {s = 10;}

                        else if ( (LA61_0=='.') ) {s = 11;}

                        else if ( (LA61_0=='/') ) {s = 12;}

                        else if ( (LA61_0=='-') ) {s = 13;}

                        else if ( (LA61_0=='+') ) {s = 14;}

                        else if ( (LA61_0=='@') ) {s = 15;}

                        else if ( (LA61_0=='0') ) {s = 16;}

                        else if ( ((LA61_0>='1' && LA61_0<='9')) ) {s = 17;}

                        else if ( (LA61_0=='r') ) {s = 18;}

                        else if ( ((LA61_0>='A' && LA61_0<='Z')||LA61_0=='_'||(LA61_0>='a' && LA61_0<='e')||(LA61_0>='g' && LA61_0<='q')||LA61_0=='s'||(LA61_0>='u' && LA61_0<='z')) ) {s = 19;}

                        else if ( (LA61_0=='\'') ) {s = 20;}

                        else if ( (LA61_0=='\"') ) {s = 21;}

                        else if ( ((LA61_0>='\t' && LA61_0<='\n')||LA61_0=='\r'||LA61_0==' ') ) {s = 22;}

                        else if ( ((LA61_0>='\u0000' && LA61_0<='\b')||(LA61_0>='\u000B' && LA61_0<='\f')||(LA61_0>='\u000E' && LA61_0<='\u001F')||(LA61_0>='#' && LA61_0<='&')||(LA61_0>='(' && LA61_0<='*')||(LA61_0>=';' && LA61_0<='<')||(LA61_0>='>' && LA61_0<='?')||LA61_0=='\\'||LA61_0=='^'||LA61_0=='`'||LA61_0=='|'||(LA61_0>='~' && LA61_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_21 = input.LA(1);

                        s = -1;
                        if ( (LA61_21=='\'') ) {s = 73;}

                        else if ( ((LA61_21>='\u0000' && LA61_21<='&')||(LA61_21>='(' && LA61_21<='\uFFFF')) ) {s = 74;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_20 = input.LA(1);

                        s = -1;
                        if ( (LA61_20=='{') ) {s = 69;}

                        else if ( (LA61_20=='[') ) {s = 70;}

                        else if ( (LA61_20=='\"') ) {s = 71;}

                        else if ( ((LA61_20>='\u0000' && LA61_20<='!')||(LA61_20>='#' && LA61_20<='Z')||(LA61_20>='\\' && LA61_20<='z')||(LA61_20>='|' && LA61_20<='\uFFFF')) ) {s = 72;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}