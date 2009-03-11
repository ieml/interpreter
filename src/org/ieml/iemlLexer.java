// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/ieml.g 2009-03-09 21:24:20
 package org.ieml; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class iemlLexer extends Lexer {
    public static final int L5LM=26;
    public static final int PRINTSTAT=6;
    public static final int CAT3=11;
    public static final int XMLSTAT=7;
    public static final int PRIMITIVE=17;
    public static final int WS=28;
    public static final int CAT4=12;
    public static final int CAT5=13;
    public static final int L4LM=25;
    public static final int CAT2=10;
    public static final int XML=15;
    public static final int L0LM=18;
    public static final int EXPRESSION=4;
    public static final int PRINT=14;
    public static final int CAT0=8;
    public static final int EOF=-1;
    public static final int POR=27;
    public static final int RPAREN=20;
    public static final int LPAREN=19;
    public static final int CAT1=9;
    public static final int SCRIPT=5;
    public static final int L2LM=23;
    public static final int STAR=16;
    public static final int L3LM=24;
    public static final int EVENT=21;
    public static final int L1LM=22;

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
            // /eclipse/workspace/imelpreter/src/ieml.g:46:6: ( '*' )
            // /eclipse/workspace/imelpreter/src/ieml.g:46:7: '*'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:47:5: ( ( ' ' | '\\t' )+ )
            // /eclipse/workspace/imelpreter/src/ieml.g:47:9: ( ' ' | '\\t' )+
            {
            // /eclipse/workspace/imelpreter/src/ieml.g:47:9: ( ' ' | '\\t' )+
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
            // /eclipse/workspace/imelpreter/src/ieml.g:48:11: ( 'A' | 'U' | 'S' | 'B' | 'T' | 'O' | 'M' | 'E' )
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
            // /eclipse/workspace/imelpreter/src/ieml.g:49:7: ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' )
            int alt2=25;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:9: 'wo'
                    {
                    match("wo"); 


                    }
                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:16: 'wa'
                    {
                    match("wa"); 


                    }
                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:23: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:29: 'o'
                    {
                    match('o'); 

                    }
                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:35: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:41: 'wu'
                    {
                    match("wu"); 


                    }
                    break;
                case 7 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:48: 'we'
                    {
                    match("we"); 


                    }
                    break;
                case 8 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:55: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 9 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:61: 'a'
                    {
                    match('a'); 

                    }
                    break;
                case 10 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:67: 'i'
                    {
                    match('i'); 

                    }
                    break;
                case 11 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:73: 'j'
                    {
                    match('j'); 

                    }
                    break;
                case 12 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:79: 'g'
                    {
                    match('g'); 

                    }
                    break;
                case 13 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:85: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 14 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:91: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 15 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:97: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 16 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:103: 'h'
                    {
                    match('h'); 

                    }
                    break;
                case 17 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:109: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 18 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:115: 'k'
                    {
                    match('k'); 

                    }
                    break;
                case 19 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:121: 'm'
                    {
                    match('m'); 

                    }
                    break;
                case 20 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:127: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 21 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:133: 'p'
                    {
                    match('p'); 

                    }
                    break;
                case 22 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:139: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 23 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:145: 'd'
                    {
                    match('d'); 

                    }
                    break;
                case 24 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:151: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 25 :
                    // /eclipse/workspace/imelpreter/src/ieml.g:49:157: 'l'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:50:6: ( ':' )
            // /eclipse/workspace/imelpreter/src/ieml.g:50:8: ':'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:51:6: ( '.' )
            // /eclipse/workspace/imelpreter/src/ieml.g:51:8: '.'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:52:6: ( '-' )
            // /eclipse/workspace/imelpreter/src/ieml.g:52:8: '-'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:53:6: ( '\\'' )
            // /eclipse/workspace/imelpreter/src/ieml.g:53:8: '\\''
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
            // /eclipse/workspace/imelpreter/src/ieml.g:54:6: ( ',' )
            // /eclipse/workspace/imelpreter/src/ieml.g:54:8: ','
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
            // /eclipse/workspace/imelpreter/src/ieml.g:55:6: ( '_' )
            // /eclipse/workspace/imelpreter/src/ieml.g:55:8: '_'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:56:8: ( '(' )
            // /eclipse/workspace/imelpreter/src/ieml.g:56:10: '('
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
            // /eclipse/workspace/imelpreter/src/ieml.g:57:8: ( ')' )
            // /eclipse/workspace/imelpreter/src/ieml.g:57:10: ')'
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
            // /eclipse/workspace/imelpreter/src/ieml.g:58:5: ( '|' )
            // /eclipse/workspace/imelpreter/src/ieml.g:58:7: '|'
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

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:59:7: ( 'print' )
            // /eclipse/workspace/imelpreter/src/ieml.g:59:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "XML"
    public final void mXML() throws RecognitionException {
        try {
            int _type = XML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/src/ieml.g:60:5: ( 'xml' )
            // /eclipse/workspace/imelpreter/src/ieml.g:60:7: 'xml'
            {
            match("xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML"

    public void mTokens() throws RecognitionException {
        // /eclipse/workspace/imelpreter/src/ieml.g:1:8: ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | PRINT | XML )
        int alt3=15;
        alt3 = dfa3.predict(input);
        switch (alt3) {
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
                // /eclipse/workspace/imelpreter/src/ieml.g:1:82: PRINT
                {
                mPRINT(); 

                }
                break;
            case 15 :
                // /eclipse/workspace/imelpreter/src/ieml.g:1:88: XML
                {
                mXML(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
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
            return "49:1: EVENT : ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' );";
        }
    }
    static final String DFA3_eotS =
        "\5\uffff\2\4\13\uffff";
    static final String DFA3_eofS =
        "\22\uffff";
    static final String DFA3_minS =
        "\1\11\4\uffff\1\162\1\155\13\uffff";
    static final String DFA3_maxS =
        "\1\174\4\uffff\1\162\1\155\13\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\26\uffff\1\2\6\uffff\1\12\1\15\1\16\1\1\1\uffff\1\13\1"+
            "\11\1\10\13\uffff\1\7\6\uffff\2\3\2\uffff\1\3\7\uffff\1\3\1"+
            "\uffff\1\3\3\uffff\3\3\11\uffff\1\14\1\uffff\17\4\1\5\2\uffff"+
            "\3\4\1\uffff\1\4\1\6\1\4\2\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | PRINT | XML );";
        }
    }
 

}