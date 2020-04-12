package com.raptor.mcmodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMcmodelLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int RULE_SIGN=11;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int RULE_PERCENTAGE=5;
    public static final int RULE_SLONG=10;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_DIGITS=12;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int RULE_ULONG=9;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_EXPONENT=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalMcmodelLexer() {;} 
    public InternalMcmodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMcmodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMcmodel.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:11:7: ( 'parent' )
            // InternalMcmodel.g:11:9: 'parent'
            {
            match("parent"); 


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
            // InternalMcmodel.g:12:7: ( '=' )
            // InternalMcmodel.g:12:9: '='
            {
            match('='); 

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
            // InternalMcmodel.g:13:7: ( 'ambientocclusion' )
            // InternalMcmodel.g:13:9: 'ambientocclusion'
            {
            match("ambientocclusion"); 


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
            // InternalMcmodel.g:14:7: ( 'true' )
            // InternalMcmodel.g:14:9: 'true'
            {
            match("true"); 


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
            // InternalMcmodel.g:15:7: ( 'false' )
            // InternalMcmodel.g:15:9: 'false'
            {
            match("false"); 


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
            // InternalMcmodel.g:16:7: ( 'display' )
            // InternalMcmodel.g:16:9: 'display'
            {
            match("display"); 


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
            // InternalMcmodel.g:17:7: ( 'textures' )
            // InternalMcmodel.g:17:9: 'textures'
            {
            match("textures"); 


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
            // InternalMcmodel.g:18:7: ( '{' )
            // InternalMcmodel.g:18:9: '{'
            {
            match('{'); 

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
            // InternalMcmodel.g:19:7: ( '}' )
            // InternalMcmodel.g:19:9: '}'
            {
            match('}'); 

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
            // InternalMcmodel.g:20:7: ( 'elements' )
            // InternalMcmodel.g:20:9: 'elements'
            {
            match("elements"); 


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
            // InternalMcmodel.g:21:7: ( 'gui_light' )
            // InternalMcmodel.g:21:9: 'gui_light'
            {
            match("gui_light"); 


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
            // InternalMcmodel.g:22:7: ( 'overrides' )
            // InternalMcmodel.g:22:9: 'overrides'
            {
            match("overrides"); 


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
            // InternalMcmodel.g:23:7: ( '#' )
            // InternalMcmodel.g:23:9: '#'
            {
            match('#'); 

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
            // InternalMcmodel.g:24:7: ( 'from' )
            // InternalMcmodel.g:24:9: 'from'
            {
            match("from"); 


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
            // InternalMcmodel.g:25:7: ( 'to' )
            // InternalMcmodel.g:25:9: 'to'
            {
            match("to"); 


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
            // InternalMcmodel.g:26:7: ( 'rotation' )
            // InternalMcmodel.g:26:9: 'rotation'
            {
            match("rotation"); 


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
            // InternalMcmodel.g:27:7: ( 'faces' )
            // InternalMcmodel.g:27:9: 'faces'
            {
            match("faces"); 


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
            // InternalMcmodel.g:28:7: ( 'default' )
            // InternalMcmodel.g:28:9: 'default'
            {
            match("default"); 


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
            // InternalMcmodel.g:29:7: ( 'shade' )
            // InternalMcmodel.g:29:9: 'shade'
            {
            match("shade"); 


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
            // InternalMcmodel.g:30:7: ( 'origin' )
            // InternalMcmodel.g:30:9: 'origin'
            {
            match("origin"); 


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
            // InternalMcmodel.g:31:7: ( 'axis' )
            // InternalMcmodel.g:31:9: 'axis'
            {
            match("axis"); 


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
            // InternalMcmodel.g:32:7: ( 'angle' )
            // InternalMcmodel.g:32:9: 'angle'
            {
            match("angle"); 


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
            // InternalMcmodel.g:33:7: ( 'rescale' )
            // InternalMcmodel.g:33:9: 'rescale'
            {
            match("rescale"); 


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
            // InternalMcmodel.g:34:7: ( ',' )
            // InternalMcmodel.g:34:9: ','
            {
            match(','); 

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
            // InternalMcmodel.g:35:7: ( '@' )
            // InternalMcmodel.g:35:9: '@'
            {
            match('@'); 

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
            // InternalMcmodel.g:36:7: ( '(' )
            // InternalMcmodel.g:36:9: '('
            {
            match('('); 

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
            // InternalMcmodel.g:37:7: ( 'cullface' )
            // InternalMcmodel.g:37:9: 'cullface'
            {
            match("cullface"); 


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
            // InternalMcmodel.g:38:7: ( 'tintindex' )
            // InternalMcmodel.g:38:9: 'tintindex'
            {
            match("tintindex"); 


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
            // InternalMcmodel.g:39:7: ( ')' )
            // InternalMcmodel.g:39:9: ')'
            {
            match(')'); 

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
            // InternalMcmodel.g:40:7: ( 'thirdperson_righthand' )
            // InternalMcmodel.g:40:9: 'thirdperson_righthand'
            {
            match("thirdperson_righthand"); 


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
            // InternalMcmodel.g:41:7: ( 'thirdperson_lefthand' )
            // InternalMcmodel.g:41:9: 'thirdperson_lefthand'
            {
            match("thirdperson_lefthand"); 


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
            // InternalMcmodel.g:42:7: ( 'firstperson_righthand' )
            // InternalMcmodel.g:42:9: 'firstperson_righthand'
            {
            match("firstperson_righthand"); 


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
            // InternalMcmodel.g:43:7: ( 'firstperson_lefthand' )
            // InternalMcmodel.g:43:9: 'firstperson_lefthand'
            {
            match("firstperson_lefthand"); 


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
            // InternalMcmodel.g:44:7: ( 'gui' )
            // InternalMcmodel.g:44:9: 'gui'
            {
            match("gui"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:45:7: ( 'head' )
            // InternalMcmodel.g:45:9: 'head'
            {
            match("head"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:46:7: ( 'ground' )
            // InternalMcmodel.g:46:9: 'ground'
            {
            match("ground"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:47:7: ( 'fixed' )
            // InternalMcmodel.g:47:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:48:7: ( 'translation' )
            // InternalMcmodel.g:48:9: 'translation'
            {
            match("translation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:49:7: ( 'scale' )
            // InternalMcmodel.g:49:9: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:50:7: ( 'apply' )
            // InternalMcmodel.g:50:9: 'apply'
            {
            match("apply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:51:7: ( 'when' )
            // InternalMcmodel.g:51:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:52:7: ( '==' )
            // InternalMcmodel.g:52:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:53:7: ( '&' )
            // InternalMcmodel.g:53:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:54:7: ( '!' )
            // InternalMcmodel.g:54:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:55:7: ( 'blocking' )
            // InternalMcmodel.g:55:9: 'blocking'
            {
            match("blocking"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:56:7: ( '!=' )
            // InternalMcmodel.g:56:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:57:7: ( 'broken' )
            // InternalMcmodel.g:57:9: 'broken'
            {
            match("broken"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:58:7: ( 'cast' )
            // InternalMcmodel.g:58:9: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:59:7: ( 'cooldown' )
            // InternalMcmodel.g:59:9: 'cooldown'
            {
            match("cooldown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:60:7: ( 'damage' )
            // InternalMcmodel.g:60:9: 'damage'
            {
            match("damage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:61:7: ( 'damaged' )
            // InternalMcmodel.g:61:9: 'damaged'
            {
            match("damaged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:62:7: ( 'lefthanded' )
            // InternalMcmodel.g:62:9: 'lefthanded'
            {
            match("lefthanded"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:63:7: ( 'pull' )
            // InternalMcmodel.g:63:9: 'pull'
            {
            match("pull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:64:7: ( 'pulling' )
            // InternalMcmodel.g:64:9: 'pulling'
            {
            match("pulling"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:65:7: ( 'throwing' )
            // InternalMcmodel.g:65:9: 'throwing'
            {
            match("throwing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:66:7: ( 'time' )
            // InternalMcmodel.g:66:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:67:7: ( 'custom_model_data' )
            // InternalMcmodel.g:67:9: 'custom_model_data'
            {
            match("custom_model_data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:68:7: ( ':' )
            // InternalMcmodel.g:68:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:69:7: ( '[' )
            // InternalMcmodel.g:69:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:70:7: ( ']' )
            // InternalMcmodel.g:70:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:71:7: ( 'null' )
            // InternalMcmodel.g:71:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:72:7: ( '/' )
            // InternalMcmodel.g:72:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:73:7: ( '.' )
            // InternalMcmodel.g:73:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:74:7: ( 'down' )
            // InternalMcmodel.g:74:9: 'down'
            {
            match("down"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:75:7: ( 'east' )
            // InternalMcmodel.g:75:9: 'east'
            {
            match("east"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:76:7: ( 'front' )
            // InternalMcmodel.g:76:9: 'front'
            {
            match("front"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:77:7: ( 'north' )
            // InternalMcmodel.g:77:9: 'north'
            {
            match("north"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:78:7: ( 'side' )
            // InternalMcmodel.g:78:9: 'side'
            {
            match("side"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:79:7: ( 'south' )
            // InternalMcmodel.g:79:9: 'south'
            {
            match("south"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:80:7: ( 'west' )
            // InternalMcmodel.g:80:9: 'west'
            {
            match("west"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:81:7: ( 'x' )
            // InternalMcmodel.g:81:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:82:7: ( 'y' )
            // InternalMcmodel.g:82:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:83:7: ( 'z' )
            // InternalMcmodel.g:83:9: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:84:7: ( 'up' )
            // InternalMcmodel.g:84:9: 'up'
            {
            match("up"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalMcmodel.g:19105:20: ( ( '+' | '-' ) )
            // InternalMcmodel.g:19105:22: ( '+' | '-' )
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
            // InternalMcmodel.g:19107:22: ( ( '0' .. '9' )+ )
            // InternalMcmodel.g:19107:24: ( '0' .. '9' )+
            {
            // InternalMcmodel.g:19107:24: ( '0' .. '9' )+
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
            	    // InternalMcmodel.g:19107:25: '0' .. '9'
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
            // InternalMcmodel.g:19109:24: ( ( 'e' | 'E' ) ( RULE_SIGN )? RULE_DIGITS )
            // InternalMcmodel.g:19109:26: ( 'e' | 'E' ) ( RULE_SIGN )? RULE_DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMcmodel.g:19109:36: ( RULE_SIGN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMcmodel.g:19109:36: RULE_SIGN
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

    // $ANTLR start "RULE_PERCENTAGE"
    public final void mRULE_PERCENTAGE() throws RecognitionException {
        try {
            int _type = RULE_PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:19111:17: ( ( '.' RULE_DIGITS | RULE_DIGITS ( '.' ( RULE_DIGITS )? )? ) '%' )
            // InternalMcmodel.g:19111:19: ( '.' RULE_DIGITS | RULE_DIGITS ( '.' ( RULE_DIGITS )? )? ) '%'
            {
            // InternalMcmodel.g:19111:19: ( '.' RULE_DIGITS | RULE_DIGITS ( '.' ( RULE_DIGITS )? )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMcmodel.g:19111:20: '.' RULE_DIGITS
                    {
                    match('.'); 
                    mRULE_DIGITS(); 

                    }
                    break;
                case 2 :
                    // InternalMcmodel.g:19111:36: RULE_DIGITS ( '.' ( RULE_DIGITS )? )?
                    {
                    mRULE_DIGITS(); 
                    // InternalMcmodel.g:19111:48: ( '.' ( RULE_DIGITS )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMcmodel.g:19111:49: '.' ( RULE_DIGITS )?
                            {
                            match('.'); 
                            // InternalMcmodel.g:19111:53: ( RULE_DIGITS )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalMcmodel.g:19111:53: RULE_DIGITS
                                    {
                                    mRULE_DIGITS(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENTAGE"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMcmodel.g:19113:13: ( ( RULE_SIGN )? ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' ( RULE_DIGITS )? ( RULE_EXPONENT )? | RULE_EXPONENT ) ) )
            // InternalMcmodel.g:19113:15: ( RULE_SIGN )? ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' ( RULE_DIGITS )? ( RULE_EXPONENT )? | RULE_EXPONENT ) )
            {
            // InternalMcmodel.g:19113:15: ( RULE_SIGN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMcmodel.g:19113:15: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalMcmodel.g:19113:26: ( '.' RULE_DIGITS ( RULE_EXPONENT )? | RULE_DIGITS ( '.' ( RULE_DIGITS )? ( RULE_EXPONENT )? | RULE_EXPONENT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMcmodel.g:19113:27: '.' RULE_DIGITS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DIGITS(); 
                    // InternalMcmodel.g:19113:43: ( RULE_EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMcmodel.g:19113:43: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMcmodel.g:19113:58: RULE_DIGITS ( '.' ( RULE_DIGITS )? ( RULE_EXPONENT )? | RULE_EXPONENT )
                    {
                    mRULE_DIGITS(); 
                    // InternalMcmodel.g:19113:70: ( '.' ( RULE_DIGITS )? ( RULE_EXPONENT )? | RULE_EXPONENT )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='.') ) {
                        alt10=1;
                    }
                    else if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMcmodel.g:19113:71: '.' ( RULE_DIGITS )? ( RULE_EXPONENT )?
                            {
                            match('.'); 
                            // InternalMcmodel.g:19113:75: ( RULE_DIGITS )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // InternalMcmodel.g:19113:75: RULE_DIGITS
                                    {
                                    mRULE_DIGITS(); 

                                    }
                                    break;

                            }

                            // InternalMcmodel.g:19113:88: ( RULE_EXPONENT )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='E'||LA9_0=='e') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalMcmodel.g:19113:88: RULE_EXPONENT
                                    {
                                    mRULE_EXPONENT(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMcmodel.g:19113:103: RULE_EXPONENT
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
            // InternalMcmodel.g:19115:12: ( RULE_DIGITS )
            // InternalMcmodel.g:19115:14: RULE_DIGITS
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
            // InternalMcmodel.g:19117:12: ( RULE_SIGN RULE_DIGITS )
            // InternalMcmodel.g:19117:14: RULE_SIGN RULE_DIGITS
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
            // InternalMcmodel.g:19119:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMcmodel.g:19119:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMcmodel.g:19119:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMcmodel.g:19119:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMcmodel.g:19119:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMcmodel.g:19119:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMcmodel.g:19119:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMcmodel.g:19119:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMcmodel.g:19119:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMcmodel.g:19119:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMcmodel.g:19119:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalMcmodel.g:19121:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMcmodel.g:19121:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMcmodel.g:19121:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMcmodel.g:
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
            	    break loop15;
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
            // InternalMcmodel.g:19123:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMcmodel.g:19123:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMcmodel.g:19123:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMcmodel.g:19123:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalMcmodel.g:19125:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMcmodel.g:19125:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMcmodel.g:19125:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMcmodel.g:19125:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalMcmodel.g:19125:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMcmodel.g:19125:41: ( '\\r' )? '\\n'
                    {
                    // InternalMcmodel.g:19125:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMcmodel.g:19125:41: '\\r'
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
            // InternalMcmodel.g:19127:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMcmodel.g:19127:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMcmodel.g:19127:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMcmodel.g:
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalMcmodel.g:19129:16: ( . )
            // InternalMcmodel.g:19129:18: .
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
        // InternalMcmodel.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_PERCENTAGE | RULE_DOUBLE | RULE_ULONG | RULE_SLONG | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=84;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMcmodel.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalMcmodel.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalMcmodel.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalMcmodel.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalMcmodel.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalMcmodel.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalMcmodel.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalMcmodel.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalMcmodel.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalMcmodel.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalMcmodel.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalMcmodel.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalMcmodel.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalMcmodel.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalMcmodel.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalMcmodel.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalMcmodel.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalMcmodel.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalMcmodel.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalMcmodel.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalMcmodel.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalMcmodel.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalMcmodel.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalMcmodel.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalMcmodel.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalMcmodel.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalMcmodel.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalMcmodel.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalMcmodel.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalMcmodel.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalMcmodel.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalMcmodel.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalMcmodel.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalMcmodel.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalMcmodel.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalMcmodel.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalMcmodel.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalMcmodel.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalMcmodel.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalMcmodel.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalMcmodel.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalMcmodel.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalMcmodel.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalMcmodel.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalMcmodel.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalMcmodel.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalMcmodel.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalMcmodel.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalMcmodel.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalMcmodel.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalMcmodel.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalMcmodel.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalMcmodel.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalMcmodel.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalMcmodel.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalMcmodel.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalMcmodel.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalMcmodel.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalMcmodel.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalMcmodel.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalMcmodel.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalMcmodel.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalMcmodel.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalMcmodel.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalMcmodel.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalMcmodel.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalMcmodel.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalMcmodel.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalMcmodel.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalMcmodel.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalMcmodel.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalMcmodel.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalMcmodel.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalMcmodel.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalMcmodel.g:1:454: RULE_PERCENTAGE
                {
                mRULE_PERCENTAGE(); 

                }
                break;
            case 76 :
                // InternalMcmodel.g:1:470: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 77 :
                // InternalMcmodel.g:1:482: RULE_ULONG
                {
                mRULE_ULONG(); 

                }
                break;
            case 78 :
                // InternalMcmodel.g:1:493: RULE_SLONG
                {
                mRULE_SLONG(); 

                }
                break;
            case 79 :
                // InternalMcmodel.g:1:504: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // InternalMcmodel.g:1:516: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // InternalMcmodel.g:1:524: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 82 :
                // InternalMcmodel.g:1:540: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 83 :
                // InternalMcmodel.g:1:556: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 84 :
                // InternalMcmodel.g:1:564: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\55\1\57\4\55\2\uffff\3\55\1\uffff\2\55\3\uffff\1\55\1\uffff\2\55\1\uffff\1\133\2\55\3\uffff\1\55\1\146\1\150\1\151\1\152\1\153\1\55\1\155\3\52\3\uffff\2\55\3\uffff\6\55\1\176\11\55\2\uffff\6\55\1\uffff\6\55\3\uffff\3\55\1\uffff\3\55\3\uffff\3\55\3\uffff\2\55\3\uffff\1\161\4\uffff\1\u00a4\1\uffff\1\155\1\161\2\uffff\1\u00a6\2\uffff\11\55\1\uffff\17\55\1\u00c1\25\55\1\uffff\1\161\1\uffff\1\55\1\u00d9\1\55\1\u00db\2\55\1\u00de\3\55\1\u00e2\4\55\1\u00e7\6\55\1\u00ee\1\55\1\u00f0\1\55\1\uffff\7\55\1\u00f9\3\55\1\u00fd\1\55\1\u00ff\1\u0100\1\u0101\3\55\1\u0105\3\55\1\uffff\1\55\1\uffff\1\u010a\1\u010b\1\uffff\3\55\1\uffff\2\55\1\u0111\1\u0112\1\uffff\1\u0113\1\55\1\u0115\3\55\1\uffff\1\55\1\uffff\6\55\1\u0120\1\u0121\1\uffff\1\u0122\2\55\1\uffff\1\55\3\uffff\3\55\1\uffff\1\u0129\1\u012a\2\55\2\uffff\5\55\3\uffff\1\55\1\uffff\2\55\1\u0136\2\55\1\u0139\1\55\1\u013b\2\55\3\uffff\4\55\1\u0142\1\55\2\uffff\1\u0144\7\55\1\u014c\1\u014d\1\u014e\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\1\u0153\4\55\1\uffff\1\55\1\uffff\2\55\1\u015b\2\55\1\u015e\1\55\3\uffff\1\u0160\2\55\1\u0163\1\uffff\1\u0164\1\55\1\u0166\1\u0167\3\55\1\uffff\1\u016b\1\55\1\uffff\1\55\1\uffff\1\u016e\1\u016f\2\uffff\1\55\2\uffff\3\55\1\uffff\2\55\2\uffff\1\55\1\u0177\1\55\1\u0179\3\55\1\uffff\1\55\1\uffff\25\55\1\u0195\5\55\1\uffff\4\55\1\u019f\4\55\1\uffff\5\55\1\u01a9\1\55\1\u01ab\1\u01ac\1\uffff\1\u01ad\3\uffff";
    static final String DFA21_eofS =
        "\u01ae\uffff";
    static final String DFA21_minS =
        "\1\0\1\141\1\75\1\155\1\145\2\141\2\uffff\1\141\2\162\1\uffff\1\145\1\143\3\uffff\1\141\1\uffff\2\145\1\uffff\1\75\1\154\1\145\3\uffff\1\157\1\52\4\60\1\160\1\45\1\56\2\0\3\uffff\1\162\1\154\3\uffff\1\142\1\151\1\147\1\160\1\141\1\170\1\60\1\155\1\151\1\143\1\157\1\162\1\163\1\146\1\155\1\167\2\uffff\1\145\1\163\1\151\1\157\1\145\1\151\1\uffff\1\164\1\163\2\141\1\144\1\165\3\uffff\1\154\1\163\1\157\1\uffff\1\141\1\145\1\163\3\uffff\2\157\1\146\3\uffff\1\154\1\162\3\uffff\1\45\4\uffff\1\60\1\uffff\2\45\2\uffff\1\56\2\uffff\1\145\1\154\1\151\1\163\2\154\1\145\1\156\1\164\1\uffff\1\164\1\145\1\162\1\157\1\163\1\145\1\155\1\163\1\145\1\160\2\141\1\156\1\155\1\164\1\60\1\165\1\162\1\147\1\141\1\143\1\144\1\154\1\145\1\164\1\154\2\164\1\154\1\144\1\156\1\164\1\143\1\153\1\164\1\154\1\164\1\uffff\1\45\1\uffff\1\156\1\60\1\145\1\60\1\145\1\171\1\60\1\163\1\165\1\151\1\60\1\144\1\167\1\145\1\163\1\60\2\164\1\144\1\154\1\165\1\147\1\60\1\145\1\60\1\154\1\uffff\1\156\1\162\1\151\1\164\1\141\2\145\1\60\1\150\1\146\1\157\1\60\1\144\3\60\1\153\1\145\1\150\1\60\1\150\1\164\1\156\1\uffff\1\156\1\uffff\2\60\1\uffff\1\154\1\162\1\156\1\uffff\1\160\1\151\2\60\1\uffff\1\60\1\160\1\60\1\141\1\154\1\145\1\uffff\1\156\1\uffff\1\151\1\144\1\151\1\156\1\151\1\154\2\60\1\uffff\1\60\1\141\1\155\1\uffff\1\157\3\uffff\1\151\1\156\1\141\1\uffff\2\60\1\147\1\164\2\uffff\1\141\1\145\1\144\1\145\1\156\3\uffff\1\145\1\uffff\1\171\1\164\1\60\1\164\1\147\1\60\1\144\1\60\1\157\1\145\3\uffff\1\143\1\137\1\167\1\156\1\60\1\156\2\uffff\1\60\1\157\1\164\1\163\1\145\1\162\1\147\1\162\3\60\1\uffff\1\163\1\150\1\uffff\1\145\1\uffff\1\156\1\60\1\145\1\155\1\156\1\147\1\uffff\1\144\1\uffff\1\143\1\151\1\60\1\170\1\163\1\60\1\163\3\uffff\1\60\1\164\1\163\1\60\1\uffff\1\60\1\157\2\60\1\145\1\143\1\157\1\uffff\1\60\1\157\1\uffff\1\157\1\uffff\2\60\2\uffff\1\144\2\uffff\1\144\1\154\1\156\1\uffff\2\156\2\uffff\1\145\1\60\1\165\1\60\2\137\1\154\1\uffff\1\163\1\uffff\2\154\1\137\2\151\1\145\1\151\1\145\1\144\1\157\1\147\1\146\1\147\1\146\1\141\1\156\1\150\1\164\1\150\2\164\1\60\1\164\1\150\1\164\1\150\1\141\1\uffff\1\150\1\141\1\150\1\141\1\60\1\141\1\156\1\141\1\156\1\uffff\1\156\1\144\1\156\2\144\1\60\1\144\2\60\1\uffff\1\60\3\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\165\1\75\1\170\2\162\1\157\2\uffff\1\154\1\165\1\166\1\uffff\2\157\3\uffff\1\165\1\uffff\1\145\1\150\1\uffff\1\75\1\162\1\145\3\uffff\1\165\1\57\1\71\3\172\1\160\1\145\1\71\2\uffff\3\uffff\1\162\1\154\3\uffff\1\142\1\151\1\147\1\160\1\165\1\170\1\172\1\156\1\162\1\154\1\157\1\170\1\163\1\146\1\155\1\167\2\uffff\1\145\1\163\1\151\1\157\1\145\1\151\1\uffff\1\164\1\163\2\141\1\144\1\165\3\uffff\2\163\1\157\1\uffff\1\141\1\145\1\163\3\uffff\2\157\1\146\3\uffff\1\154\1\162\3\uffff\1\71\4\uffff\1\172\1\uffff\1\145\1\71\2\uffff\1\145\2\uffff\1\145\1\154\1\151\1\163\2\154\1\145\1\156\1\164\1\uffff\1\164\1\145\1\162\1\157\1\163\1\145\1\156\1\163\1\145\1\160\2\141\1\156\1\155\1\164\1\172\1\165\1\162\1\147\1\141\1\143\1\144\1\154\1\145\1\164\1\154\2\164\1\154\1\144\1\156\1\164\1\143\1\153\1\164\1\154\1\164\1\uffff\1\71\1\uffff\1\156\1\172\1\145\1\172\1\145\1\171\1\172\1\163\1\165\1\151\1\172\1\144\1\167\1\145\1\163\1\172\2\164\1\144\1\154\1\165\1\147\1\172\1\145\1\172\1\154\1\uffff\1\156\1\162\1\151\1\164\1\141\2\145\1\172\1\150\1\146\1\157\1\172\1\144\3\172\1\153\1\145\1\150\1\172\1\150\1\164\1\156\1\uffff\1\156\1\uffff\2\172\1\uffff\1\154\1\162\1\156\1\uffff\1\160\1\151\2\172\1\uffff\1\172\1\160\1\172\1\141\1\154\1\145\1\uffff\1\156\1\uffff\1\151\1\144\1\151\1\156\1\151\1\154\2\172\1\uffff\1\172\1\141\1\155\1\uffff\1\157\3\uffff\1\151\1\156\1\141\1\uffff\2\172\1\147\1\164\2\uffff\1\141\1\145\1\144\1\145\1\156\3\uffff\1\145\1\uffff\1\171\1\164\1\172\1\164\1\147\1\172\1\144\1\172\1\157\1\145\3\uffff\1\143\1\137\1\167\1\156\1\172\1\156\2\uffff\1\172\1\157\1\164\1\163\1\145\1\162\1\147\1\162\3\172\1\uffff\1\163\1\150\1\uffff\1\145\1\uffff\1\156\1\172\1\145\1\155\1\156\1\147\1\uffff\1\144\1\uffff\1\143\1\151\1\172\1\170\1\163\1\172\1\163\3\uffff\1\172\1\164\1\163\1\172\1\uffff\1\172\1\157\2\172\1\145\1\143\1\157\1\uffff\1\172\1\157\1\uffff\1\157\1\uffff\2\172\2\uffff\1\144\2\uffff\1\144\1\154\1\156\1\uffff\2\156\2\uffff\1\145\1\172\1\165\1\172\2\137\1\154\1\uffff\1\163\1\uffff\2\162\1\137\2\151\1\145\1\151\1\145\1\144\1\157\1\147\1\146\1\147\1\146\1\141\1\156\1\150\1\164\1\150\2\164\1\172\1\164\1\150\1\164\1\150\1\141\1\uffff\1\150\1\141\1\150\1\141\1\172\1\141\1\156\1\141\1\156\1\uffff\1\156\1\144\1\156\2\144\1\172\1\144\2\172\1\uffff\1\172\3\uffff";
    static final String DFA21_acceptS =
        "\7\uffff\1\10\1\11\3\uffff\1\15\2\uffff\1\30\1\31\1\32\1\uffff\1\35\2\uffff\1\53\3\uffff\1\72\1\73\1\74\13\uffff\1\120\1\123\1\124\2\uffff\1\120\1\52\1\2\20\uffff\1\10\1\11\6\uffff\1\15\6\uffff\1\30\1\31\1\32\3\uffff\1\35\3\uffff\1\53\1\56\1\54\3\uffff\1\72\1\73\1\74\2\uffff\1\121\1\122\1\76\1\uffff\1\77\1\107\1\110\1\111\1\uffff\1\115\2\uffff\1\113\1\114\1\uffff\1\117\1\123\11\uffff\1\17\45\uffff\1\112\1\uffff\1\116\32\uffff\1\42\27\uffff\1\65\1\uffff\1\25\2\uffff\1\4\3\uffff\1\70\4\uffff\1\16\6\uffff\1\100\1\uffff\1\101\10\uffff\1\104\3\uffff\1\60\1\uffff\1\43\1\51\1\106\3\uffff\1\75\4\uffff\1\26\1\50\5\uffff\1\5\1\21\1\102\1\uffff\1\45\12\uffff\1\23\1\47\1\105\6\uffff\1\103\1\1\13\uffff\1\62\2\uffff\1\44\1\uffff\1\24\6\uffff\1\57\1\uffff\1\66\7\uffff\1\6\1\22\1\63\4\uffff\1\27\7\uffff\1\7\2\uffff\1\67\1\uffff\1\12\2\uffff\1\20\1\33\1\uffff\1\61\1\55\3\uffff\1\34\2\uffff\1\13\1\14\7\uffff\1\64\1\uffff\1\46\33\uffff\1\3\11\uffff\1\71\11\uffff\1\37\1\uffff\1\41\1\36\1\40";
    static final String DFA21_specialS =
        "\1\2\45\uffff\1\1\1\0\u0186\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\27\1\46\1\14\2\52\1\26\1\47\1\21\1\23\1\52\1\45\1\17\1\45\1\37\1\36\12\44\1\32\2\52\1\2\2\52\1\20\32\50\1\33\1\52\1\34\1\52\1\50\1\52\1\3\1\30\1\22\1\6\1\11\1\5\1\12\1\24\3\50\1\31\1\50\1\35\1\13\1\1\1\50\1\15\1\16\1\4\1\43\1\50\1\25\1\40\1\41\1\42\1\7\1\52\1\10\uff82\52",
            "\1\53\23\uffff\1\54",
            "\1\56",
            "\1\60\1\62\1\uffff\1\63\7\uffff\1\61",
            "\1\65\2\uffff\1\70\1\67\5\uffff\1\66\2\uffff\1\64",
            "\1\71\7\uffff\1\73\10\uffff\1\72",
            "\1\76\3\uffff\1\75\3\uffff\1\74\5\uffff\1\77",
            "",
            "",
            "\1\103\12\uffff\1\102",
            "\1\105\2\uffff\1\104",
            "\1\107\3\uffff\1\106",
            "",
            "\1\112\11\uffff\1\111",
            "\1\114\4\uffff\1\113\1\115\5\uffff\1\116",
            "",
            "",
            "",
            "\1\123\15\uffff\1\124\5\uffff\1\122",
            "",
            "\1\126",
            "\1\130\2\uffff\1\127",
            "",
            "\1\132",
            "\1\134\5\uffff\1\135",
            "\1\136",
            "",
            "",
            "",
            "\1\143\5\uffff\1\142",
            "\1\144\4\uffff\1\145",
            "\12\147",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\154",
            "\1\160\10\uffff\1\157\1\uffff\12\156\13\uffff\1\161\37\uffff\1\161",
            "\1\161\1\uffff\12\162",
            "\0\163",
            "\0\163",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\174\23\uffff\1\173",
            "\1\175",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0080\1\177",
            "\1\u0081\10\uffff\1\u0082",
            "\1\u0084\10\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086\5\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "\1\u0098\6\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "",
            "\1\160\12\uffff\12\147",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\160\10\uffff\1\157\1\uffff\12\156\13\uffff\1\161\37\uffff\1\161",
            "\1\160\12\uffff\12\u00a5",
            "",
            "",
            "\1\161\1\uffff\12\162\13\uffff\1\161\37\uffff\1\161",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\55\7\uffff\32\55\4\uffff\1\u00c0\1\uffff\32\55",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\160\12\uffff\12\u00a5",
            "",
            "\1\u00d7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00d8\21\55",
            "\1\u00da",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00dc",
            "\1\u00dd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ef",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fe",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0114",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "",
            "",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012b",
            "\1\u012c",
            "",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u0135\26\55",
            "\1\u0137",
            "\1\u0138",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u013a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0143",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "",
            "\1\u0152",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015c",
            "\1\u015d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015f",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0161",
            "\1\u0162",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0165",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u016c",
            "",
            "\1\u016d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0170",
            "",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "\1\u0175",
            "",
            "",
            "\1\u0176",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0178",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\u017d",
            "",
            "\1\u017f\5\uffff\1\u017e",
            "\1\u0181\5\uffff\1\u0180",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01aa",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_PERCENTAGE | RULE_DOUBLE | RULE_ULONG | RULE_SLONG | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_39 = input.LA(1);

                        s = -1;
                        if ( ((LA21_39>='\u0000' && LA21_39<='\uFFFF')) ) {s = 115;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_38 = input.LA(1);

                        s = -1;
                        if ( ((LA21_38>='\u0000' && LA21_38<='\uFFFF')) ) {s = 115;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='p') ) {s = 1;}

                        else if ( (LA21_0=='=') ) {s = 2;}

                        else if ( (LA21_0=='a') ) {s = 3;}

                        else if ( (LA21_0=='t') ) {s = 4;}

                        else if ( (LA21_0=='f') ) {s = 5;}

                        else if ( (LA21_0=='d') ) {s = 6;}

                        else if ( (LA21_0=='{') ) {s = 7;}

                        else if ( (LA21_0=='}') ) {s = 8;}

                        else if ( (LA21_0=='e') ) {s = 9;}

                        else if ( (LA21_0=='g') ) {s = 10;}

                        else if ( (LA21_0=='o') ) {s = 11;}

                        else if ( (LA21_0=='#') ) {s = 12;}

                        else if ( (LA21_0=='r') ) {s = 13;}

                        else if ( (LA21_0=='s') ) {s = 14;}

                        else if ( (LA21_0==',') ) {s = 15;}

                        else if ( (LA21_0=='@') ) {s = 16;}

                        else if ( (LA21_0=='(') ) {s = 17;}

                        else if ( (LA21_0=='c') ) {s = 18;}

                        else if ( (LA21_0==')') ) {s = 19;}

                        else if ( (LA21_0=='h') ) {s = 20;}

                        else if ( (LA21_0=='w') ) {s = 21;}

                        else if ( (LA21_0=='&') ) {s = 22;}

                        else if ( (LA21_0=='!') ) {s = 23;}

                        else if ( (LA21_0=='b') ) {s = 24;}

                        else if ( (LA21_0=='l') ) {s = 25;}

                        else if ( (LA21_0==':') ) {s = 26;}

                        else if ( (LA21_0=='[') ) {s = 27;}

                        else if ( (LA21_0==']') ) {s = 28;}

                        else if ( (LA21_0=='n') ) {s = 29;}

                        else if ( (LA21_0=='/') ) {s = 30;}

                        else if ( (LA21_0=='.') ) {s = 31;}

                        else if ( (LA21_0=='x') ) {s = 32;}

                        else if ( (LA21_0=='y') ) {s = 33;}

                        else if ( (LA21_0=='z') ) {s = 34;}

                        else if ( (LA21_0=='u') ) {s = 35;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 36;}

                        else if ( (LA21_0=='+'||LA21_0=='-') ) {s = 37;}

                        else if ( (LA21_0=='\"') ) {s = 38;}

                        else if ( (LA21_0=='\'') ) {s = 39;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='i' && LA21_0<='k')||LA21_0=='m'||LA21_0=='q'||LA21_0=='v') ) {s = 40;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 41;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='$' && LA21_0<='%')||LA21_0=='*'||(LA21_0>=';' && LA21_0<='<')||(LA21_0>='>' && LA21_0<='?')||LA21_0=='\\'||LA21_0=='^'||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}