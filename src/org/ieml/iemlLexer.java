// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/ieml.g 2009-03-14 15:44:52
 package org.ieml; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class iemlLexer extends Lexer {
    public static final int L5LM=27;
    public static final int PRINTSTAT=6;
    public static final int LETTER=30;
    public static final int CAT3=12;
    public static final int PRIM=15;
    public static final int XMLSTAT=7;
    public static final int PRIMITIVE=20;
    public static final int WS=29;
    public static final int CAT4=13;
    public static final int CAT5=14;
    public static final int LOWER=32;
    public static final int L4LM=26;
    public static final int CAT2=11;
    public static final int L0LM=21;
    public static final int EXPRESSION=4;
    public static final int FUNCTION=8;
    public static final int CAT0=9;
    public static final int UPPER=33;
    public static final int EOF=-1;
    public static final int POR=28;
    public static final int RPAREN=18;
    public static final int LPAREN=17;
    public static final int CAT1=10;
    public static final int SCRIPT=5;
    public static final int L2LM=24;
    public static final int DIGIT=31;
    public static final int STAR=19;
    public static final int L3LM=25;
    public static final int NAME=16;
    public static final int EVENT=22;
    public static final int L1LM=23;

    // delegates
    // delegators

    public iemlLexer() {;} 
    public iemlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public iemlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/eclipse/workspace/imelpreter/src/ieml.g"; }

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:44:6: ( '*' )
            // /eclipse/workspace/imelpreter/src/ieml.g:44:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:45:5: ( ( ' ' | '\\t' )+ )
            // /eclipse/workspace/imelpreter/src/ieml.g:45:9: ( ' ' | '\\t' )+
            {
            // /eclipse/workspace/imelpreter/src/ieml.g:45:9: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /eclipse/workspace/imelpreter/src/ieml.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "PRIMITIVE"
    public final void mPRIMITIVE() throws RecognitionException {
        try {
            int _type = PRIMITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:46:11: ( 'A' | 'U' | 'S' | 'B' | 'T' | 'O' | 'M' | 'E' )
            // /eclipse/workspace/imelpreter/src/ieml.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='B')||input.LA(1)=='E'||input.LA(1)=='M'||input.LA(1)=='O'||(input.LA(1)>='S' && input.LA(1)<='U') ) {
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
    // $ANTLR end "PRIMITIVE"

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:47:7: ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' )
            int alt2=25;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:9: 'wo'
                    {
                    match("wo"); 


                    }
                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:16: 'wa'
                    {
                    match("wa"); 


                    }
                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:23: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:29: 'o'
                    {
                    match('o'); 

                    }
                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:35: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:41: 'wu'
                    {
                    match("wu"); 


                    }
                    break;
                case 7 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:48: 'we'
                    {
                    match("we"); 


                    }
                    break;
                case 8 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:55: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 9 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:61: 'a'
                    {
                    match('a'); 

                    }
                    break;
                case 10 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:67: 'i'
                    {
                    match('i'); 

                    }
                    break;
                case 11 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:73: 'j'
                    {
                    match('j'); 

                    }
                    break;
                case 12 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:79: 'g'
                    {
                    match('g'); 

                    }
                    break;
                case 13 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:85: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 14 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:91: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 15 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:97: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 16 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:103: 'h'
                    {
                    match('h'); 

                    }
                    break;
                case 17 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:109: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 18 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:115: 'k'
                    {
                    match('k'); 

                    }
                    break;
                case 19 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:121: 'm'
                    {
                    match('m'); 

                    }
                    break;
                case 20 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:127: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 21 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:133: 'p'
                    {
                    match('p'); 

                    }
                    break;
                case 22 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:139: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 23 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:145: 'd'
                    {
                    match('d'); 

                    }
                    break;
                case 24 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:151: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 25 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:47:157: 'l'
                    {
                    match('l'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVENT"

    // $ANTLR start "L0LM"
    public final void mL0LM() throws RecognitionException {
        try {
            int _type = L0LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:48:6: ( ':' )
            // /eclipse/workspace/imelpreter/src/ieml.g:48:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L0LM"

    // $ANTLR start "L1LM"
    public final void mL1LM() throws RecognitionException {
        try {
            int _type = L1LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:49:6: ( '.' )
            // /eclipse/workspace/imelpreter/src/ieml.g:49:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L1LM"

    // $ANTLR start "L2LM"
    public final void mL2LM() throws RecognitionException {
        try {
            int _type = L2LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:50:6: ( '-' )
            // /eclipse/workspace/imelpreter/src/ieml.g:50:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L2LM"

    // $ANTLR start "L3LM"
    public final void mL3LM() throws RecognitionException {
        try {
            int _type = L3LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:51:6: ( '\\'' )
            // /eclipse/workspace/imelpreter/src/ieml.g:51:8: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L3LM"

    // $ANTLR start "L4LM"
    public final void mL4LM() throws RecognitionException {
        try {
            int _type = L4LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:52:6: ( ',' )
            // /eclipse/workspace/imelpreter/src/ieml.g:52:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L4LM"

    // $ANTLR start "L5LM"
    public final void mL5LM() throws RecognitionException {
        try {
            int _type = L5LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:53:6: ( '_' )
            // /eclipse/workspace/imelpreter/src/ieml.g:53:8: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L5LM"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:54:8: ( '(' )
            // /eclipse/workspace/imelpreter/src/ieml.g:54:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:55:8: ( ')' )
            // /eclipse/workspace/imelpreter/src/ieml.g:55:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "POR"
    public final void mPOR() throws RecognitionException {
        try {
            int _type = POR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:56:5: ( '|' )
            // /eclipse/workspace/imelpreter/src/ieml.g:56:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POR"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:57:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /eclipse/workspace/imelpreter/src/ieml.g:57:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /eclipse/workspace/imelpreter/src/ieml.g:57:14: ( LETTER | DIGIT | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /eclipse/workspace/imelpreter/src/ieml.g:
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:58:16: ( LOWER | UPPER )
            // /eclipse/workspace/imelpreter/src/ieml.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "LETTER"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:59:15: ( 'a' .. 'z' )
            // /eclipse/workspace/imelpreter/src/ieml.g:59:17: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:60:15: ( 'A' .. 'Z' )
            // /eclipse/workspace/imelpreter/src/ieml.g:60:17: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:61:15: ( '0' .. '9' )
            // /eclipse/workspace/imelpreter/src/ieml.g:61:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // /eclipse/workspace/imelpreter/src/ieml.g:1:8: ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | NAME )
        int alt4=14;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:10: STAR
                {
                mSTAR(); 

                }
                break;
            case 2 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:15: WS
                {
                mWS(); 

                }
                break;
            case 3 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:18: PRIMITIVE
                {
                mPRIMITIVE(); 

                }
                break;
            case 4 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:28: EVENT
                {
                mEVENT(); 

                }
                break;
            case 5 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:34: L0LM
                {
                mL0LM(); 

                }
                break;
            case 6 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:39: L1LM
                {
                mL1LM(); 

                }
                break;
            case 7 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:44: L2LM
                {
                mL2LM(); 

                }
                break;
            case 8 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:49: L3LM
                {
                mL3LM(); 

                }
                break;
            case 9 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:54: L4LM
                {
                mL4LM(); 

                }
                break;
            case 10 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:59: L5LM
                {
                mL5LM(); 

                }
                break;
            case 11 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:64: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 12 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:71: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 13 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:78: POR
                {
                mPOR(); 

                }
                break;
            case 14 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:82: NAME
                {
                mNAME(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\33\uffff";
    static final String DFA2_eofS =
        "\33\uffff";
    static final String DFA2_minS =
        "\2\141\31\uffff";
    static final String DFA2_maxS =
        "\1\171\1\165\31\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\1\1\2\1\6\1\7";
    static final String DFA2_specialS =
        "\33\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\13\1\16\1\24\1\4\1\25\1\11\1\15\1\7\1\10\1\17\1\26\1"+
            "\20\1\21\1\3\1\22\2\uffff\1\12\1\14\1\5\1\uffff\1\1\1\23\1\2",
            "\1\30\3\uffff\1\32\11\uffff\1\27\5\uffff\1\31",
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
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "47:1: EVENT : ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' );";
        }
    }
    static final String DFA4_eotS =
        "\3\uffff\1\44\1\43\25\51\13\uffff\4\51\1\uffff";
    static final String DFA4_eofS =
        "\52\uffff";
    static final String DFA4_minS =
        "\1\11\2\uffff\1\60\1\141\25\60\13\uffff\4\60\1\uffff";
    static final String DFA4_maxS =
        "\1\174\2\uffff\1\172\1\165\25\172\13\uffff\4\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\27\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\3\4\uffff\1\4";
    static final String DFA4_specialS =
        "\52\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\26\uffff\1\2\6\uffff\1\35\1\40\1\41\1\1\1\uffff\1\36\1"+
            "\34\1\33\13\uffff\1\32\6\uffff\2\3\2\43\1\3\7\43\1\3\1\43\1"+
            "\3\3\43\3\3\5\43\4\uffff\1\37\1\uffff\1\11\1\16\1\21\1\27\1"+
            "\7\1\30\1\14\1\20\1\12\1\13\1\22\1\31\1\23\1\24\1\6\1\25\2\43"+
            "\1\15\1\17\1\10\1\43\1\4\1\26\1\5\1\43\1\uffff\1\42",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\46\3\uffff\1\50\11\uffff\1\45\5\uffff\1\47",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | NAME );";
        }
    }
 

}