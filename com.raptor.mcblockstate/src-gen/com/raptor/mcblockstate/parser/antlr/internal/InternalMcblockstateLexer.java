package com.raptor.mcblockstate.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMcblockstateLexer extends Lexer {
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

    public InternalMcblockstateLexer() {;} 
    public InternalMcblockstateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMcblockstateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMcblockstate.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:11:7: ( 'variants' )
            // InternalMcblockstate.g:11:9: 'variants'
            {
            match("variants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:12:7: ( '{' )
            // InternalMcblockstate.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:13:7: ( '}' )
            // InternalMcblockstate.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:14:7: ( '[' )
            // InternalMcblockstate.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:15:7: ( ',' )
            // InternalMcblockstate.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:16:7: ( ']' )
            // InternalMcblockstate.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:17:7: ( '=' )
            // InternalMcblockstate.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:18:7: ( 'when' )
            // InternalMcblockstate.g:18:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:19:7: ( '(' )
            // InternalMcblockstate.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:20:7: ( ')' )
            // InternalMcblockstate.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:21:7: ( 'apply' )
            // InternalMcblockstate.g:21:9: 'apply'
            {
            match("apply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:22:7: ( '|' )
            // InternalMcblockstate.g:22:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:23:7: ( '&' )
            // InternalMcblockstate.g:23:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:24:7: ( '==' )
            // InternalMcblockstate.g:24:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:25:7: ( 'in' )
            // InternalMcblockstate.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:26:7: ( '!' )
            // InternalMcblockstate.g:26:9: '!'
            {
            match('!'); 

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
            // InternalMcblockstate.g:27:7: ( 'true' )
            // InternalMcblockstate.g:27:9: 'true'
            {
            match("true"); 


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
            // InternalMcblockstate.g:28:7: ( 'false' )
            // InternalMcblockstate.g:28:9: 'false'
            {
            match("false"); 


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
            // InternalMcblockstate.g:29:7: ( 'null' )
            // InternalMcblockstate.g:29:9: 'null'
            {
            match("null"); 


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
            // InternalMcblockstate.g:30:7: ( 'multipart' )
            // InternalMcblockstate.g:30:9: 'multipart'
            {
            match("multipart"); 


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
            // InternalMcblockstate.g:31:7: ( 'x' )
            // InternalMcblockstate.g:31:9: 'x'
            {
            match('x'); 

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
            // InternalMcblockstate.g:32:7: ( 'y' )
            // InternalMcblockstate.g:32:9: 'y'
            {
            match('y'); 

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
            // InternalMcblockstate.g:33:7: ( 'uvlock' )
            // InternalMcblockstate.g:33:9: 'uvlock'
            {
            match("uvlock"); 


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
            // InternalMcblockstate.g:34:7: ( '*' )
            // InternalMcblockstate.g:34:9: '*'
            {
            match('*'); 

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
            // InternalMcblockstate.g:35:7: ( ':' )
            // InternalMcblockstate.g:35:9: ':'
            {
            match(':'); 

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
            // InternalMcblockstate.g:36:7: ( '/' )
            // InternalMcblockstate.g:36:9: '/'
            {
            match('/'); 

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
            // InternalMcblockstate.g:37:7: ( '.' )
            // InternalMcblockstate.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalMcblockstate.g:2110:20: ( ( '+' | '-' ) )
            // InternalMcblockstate.g:2110:22: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_DIGITS"
    public final void mRULE_DIGITS() throws RecognitionException {
        try {
            // InternalMcblockstate.g:2112:22: ( ( '0' .. '9' )+ )
            // InternalMcblockstate.g:2112:24: ( '0' .. '9' )+
            {
            // InternalMcblockstate.g:2112:24: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMcblockstate.g:2112:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGITS"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalMcblockstate.g:2114:24: ( ( 'e' | 'E' ) ( RULE_SIGN )? RULE_DIGITS )
            // InternalMcblockstate.g:2114:26: ( 'e' | 'E' ) ( RULE_SIGN )? RULE_DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMcblockstate.g:2114:36: ( RULE_SIGN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMcblockstate.g:2114:36: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            mRULE_DIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2116:13: ( ( RULE_SIGN )? ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_EXPONENT ) ) )
            // InternalMcblockstate.g:2116:15: ( RULE_SIGN )? ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_EXPONENT ) )
            {
            // InternalMcblockstate.g:2116:15: ( RULE_SIGN )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMcblockstate.g:2116:15: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalMcblockstate.g:2116:26: ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_EXPONENT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMcblockstate.g:2116:27: '.' RULE_DIGITS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DIGITS(); 
                    // InternalMcblockstate.g:2116:43: ( RULE_EXPONENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMcblockstate.g:2116:43: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:2116:58: RULE_DIGITS ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_EXPONENT )
                    {
                    mRULE_DIGITS(); 
                    // InternalMcblockstate.g:2116:70: ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_EXPONENT )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    else if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMcblockstate.g:2116:71: '.' RULE_DIGITS ( RULE_EXPONENT )?
                            {
                            match('.'); 
                            mRULE_DIGITS(); 
                            // InternalMcblockstate.g:2116:87: ( RULE_EXPONENT )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0=='E'||LA5_0=='e') ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalMcblockstate.g:2116:87: RULE_EXPONENT
                                    {
                                    mRULE_EXPONENT(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMcblockstate.g:2116:102: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

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

    // $ANTLR start "RULE_ULONG"
    public final void mRULE_ULONG() throws RecognitionException {
        try {
            int _type = RULE_ULONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2118:12: ( RULE_DIGITS )
            // InternalMcblockstate.g:2118:14: RULE_DIGITS
            {
            mRULE_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ULONG"

    // $ANTLR start "RULE_SLONG"
    public final void mRULE_SLONG() throws RecognitionException {
        try {
            int _type = RULE_SLONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2120:12: ( RULE_SIGN RULE_DIGITS )
            // InternalMcblockstate.g:2120:14: RULE_SIGN RULE_DIGITS
            {
            mRULE_SIGN(); 
            mRULE_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLONG"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2122:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMcblockstate.g:2122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMcblockstate.g:2122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMcblockstate.g:2122:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMcblockstate.g:2122:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMcblockstate.g:2122:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMcblockstate.g:2122:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMcblockstate.g:2122:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMcblockstate.g:2122:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMcblockstate.g:2122:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMcblockstate.g:2122:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2124:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMcblockstate.g:2124:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMcblockstate.g:2124:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMcblockstate.g:
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
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcblockstate.g:2126:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMcblockstate.g:2126:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMcblockstate.g:2126:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMcblockstate.g:2126:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalMcblockstate.g:2128:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMcblockstate.g:2128:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMcblockstate.g:2128:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMcblockstate.g:2128:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalMcblockstate.g:2128:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMcblockstate.g:2128:41: ( '\\r' )? '\\n'
                    {
                    // InternalMcblockstate.g:2128:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMcblockstate.g:2128:41: '\\r'
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
            // InternalMcblockstate.g:2130:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMcblockstate.g:2130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMcblockstate.g:2130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMcblockstate.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalMcblockstate.g:2132:16: ( . )
            // InternalMcblockstate.g:2132:18: .
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
        // InternalMcblockstate.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_DOUBLE | RULE_ULONG | RULE_SLONG | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=36;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalMcblockstate.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalMcblockstate.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalMcblockstate.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalMcblockstate.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalMcblockstate.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalMcblockstate.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalMcblockstate.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalMcblockstate.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalMcblockstate.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalMcblockstate.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalMcblockstate.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalMcblockstate.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalMcblockstate.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalMcblockstate.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalMcblockstate.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalMcblockstate.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalMcblockstate.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalMcblockstate.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalMcblockstate.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalMcblockstate.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalMcblockstate.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalMcblockstate.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalMcblockstate.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalMcblockstate.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalMcblockstate.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalMcblockstate.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalMcblockstate.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalMcblockstate.g:1:172: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 29 :
                // InternalMcblockstate.g:1:184: RULE_ULONG
                {
                mRULE_ULONG(); 

                }
                break;
            case 30 :
                // InternalMcblockstate.g:1:195: RULE_SLONG
                {
                mRULE_SLONG(); 

                }
                break;
            case 31 :
                // InternalMcblockstate.g:1:206: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalMcblockstate.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalMcblockstate.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalMcblockstate.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalMcblockstate.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalMcblockstate.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\43\5\uffff\1\52\1\43\2\uffff\1\43\2\uffff\1\43\1\uffff\4\43\1\67\1\70\1\43\2\uffff\1\76\1\77\1\41\1\102\2\41\3\uffff\1\43\10\uffff\1\43\2\uffff\1\43\2\uffff\1\111\1\uffff\4\43\2\uffff\1\43\7\uffff\1\117\1\uffff\1\102\2\uffff\3\43\1\uffff\5\43\1\uffff\1\43\1\131\1\43\1\133\1\43\1\135\3\43\1\uffff\1\141\1\uffff\1\142\1\uffff\3\43\2\uffff\1\43\1\147\2\43\1\uffff\1\152\1\43\1\uffff\1\154\1\uffff";
    static final String DFA17_eofS =
        "\155\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\5\uffff\1\75\1\150\2\uffff\1\160\2\uffff\1\156\1\uffff\1\162\1\141\2\165\2\60\1\166\2\uffff\1\52\1\60\2\56\2\0\3\uffff\1\162\10\uffff\1\145\2\uffff\1\160\2\uffff\1\60\1\uffff\1\165\3\154\2\uffff\1\154\7\uffff\1\56\1\uffff\1\56\2\uffff\1\151\1\156\1\154\1\uffff\1\145\1\163\1\154\1\164\1\157\1\uffff\1\141\1\60\1\171\1\60\1\145\1\60\1\151\1\143\1\156\1\uffff\1\60\1\uffff\1\60\1\uffff\1\160\1\153\1\164\2\uffff\1\141\1\60\1\163\1\162\1\uffff\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\5\uffff\1\75\1\150\2\uffff\1\160\2\uffff\1\156\1\uffff\1\162\1\141\2\165\2\172\1\166\2\uffff\1\57\2\71\1\145\2\uffff\3\uffff\1\162\10\uffff\1\145\2\uffff\1\160\2\uffff\1\172\1\uffff\1\165\3\154\2\uffff\1\154\7\uffff\1\145\1\uffff\1\145\2\uffff\1\151\1\156\1\154\1\uffff\1\145\1\163\1\154\1\164\1\157\1\uffff\1\141\1\172\1\171\1\172\1\145\1\172\1\151\1\143\1\156\1\uffff\1\172\1\uffff\1\172\1\uffff\1\160\1\153\1\164\2\uffff\1\141\1\172\1\163\1\162\1\uffff\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\1\12\1\uffff\1\14\1\15\1\uffff\1\20\7\uffff\1\30\1\31\6\uffff\1\40\1\43\1\44\1\uffff\1\40\1\2\1\3\1\4\1\5\1\6\1\16\1\7\1\uffff\1\11\1\12\1\uffff\1\14\1\15\1\uffff\1\20\4\uffff\1\25\1\26\1\uffff\1\30\1\31\1\41\1\42\1\32\1\33\1\34\1\uffff\1\35\1\uffff\1\37\1\43\3\uffff\1\17\5\uffff\1\36\11\uffff\1\10\1\uffff\1\21\1\uffff\1\23\3\uffff\1\13\1\22\4\uffff\1\27\2\uffff\1\1\1\uffff\1\24";
    static final String DFA17_specialS =
        "\1\2\34\uffff\1\1\1\0\116\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\17\1\35\3\41\1\15\1\36\1\11\1\12\1\27\1\33\1\5\1\33\1\32\1\31\12\34\1\30\2\41\1\7\3\41\32\37\1\4\1\41\1\6\1\41\1\37\1\41\1\13\4\37\1\21\2\37\1\16\3\37\1\23\1\22\5\37\1\20\1\26\1\1\1\10\1\24\1\25\1\37\1\2\1\14\1\3\uff82\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\53",
            "",
            "",
            "\1\56",
            "",
            "",
            "\1\61",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\71",
            "",
            "",
            "\1\74\4\uffff\1\75",
            "\12\100",
            "\1\100\1\uffff\12\101",
            "\1\100\1\uffff\12\103\13\uffff\1\100\37\uffff\1\100",
            "\0\104",
            "\0\104",
            "",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "",
            "",
            "\1\110",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\1\uffff\12\101\13\uffff\1\100\37\uffff\1\100",
            "",
            "\1\100\1\uffff\12\103\13\uffff\1\100\37\uffff\1\100",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\132",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\134",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\150",
            "\1\151",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\153",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_DOUBLE | RULE_ULONG | RULE_SLONG | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( ((LA17_30>='\u0000' && LA17_30<='\uFFFF')) ) {s = 68;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_29 = input.LA(1);

                        s = -1;
                        if ( ((LA17_29>='\u0000' && LA17_29<='\uFFFF')) ) {s = 68;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='v') ) {s = 1;}

                        else if ( (LA17_0=='{') ) {s = 2;}

                        else if ( (LA17_0=='}') ) {s = 3;}

                        else if ( (LA17_0=='[') ) {s = 4;}

                        else if ( (LA17_0==',') ) {s = 5;}

                        else if ( (LA17_0==']') ) {s = 6;}

                        else if ( (LA17_0=='=') ) {s = 7;}

                        else if ( (LA17_0=='w') ) {s = 8;}

                        else if ( (LA17_0=='(') ) {s = 9;}

                        else if ( (LA17_0==')') ) {s = 10;}

                        else if ( (LA17_0=='a') ) {s = 11;}

                        else if ( (LA17_0=='|') ) {s = 12;}

                        else if ( (LA17_0=='&') ) {s = 13;}

                        else if ( (LA17_0=='i') ) {s = 14;}

                        else if ( (LA17_0=='!') ) {s = 15;}

                        else if ( (LA17_0=='t') ) {s = 16;}

                        else if ( (LA17_0=='f') ) {s = 17;}

                        else if ( (LA17_0=='n') ) {s = 18;}

                        else if ( (LA17_0=='m') ) {s = 19;}

                        else if ( (LA17_0=='x') ) {s = 20;}

                        else if ( (LA17_0=='y') ) {s = 21;}

                        else if ( (LA17_0=='u') ) {s = 22;}

                        else if ( (LA17_0=='*') ) {s = 23;}

                        else if ( (LA17_0==':') ) {s = 24;}

                        else if ( (LA17_0=='/') ) {s = 25;}

                        else if ( (LA17_0=='.') ) {s = 26;}

                        else if ( (LA17_0=='+'||LA17_0=='-') ) {s = 27;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 28;}

                        else if ( (LA17_0=='\"') ) {s = 29;}

                        else if ( (LA17_0=='\'') ) {s = 30;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='b' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||(LA17_0>='o' && LA17_0<='s')||LA17_0=='z') ) {s = 31;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 32;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='%')||(LA17_0>=';' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='^'||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}