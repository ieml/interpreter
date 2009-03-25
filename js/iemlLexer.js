// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/js/ieml.g 2009-03-24 21:42:27

var iemlLexer = function(input, state) {
// alternate constructor @todo
// public iemlLexer(CharStream input)
// public iemlLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa2 = new iemlLexer.DFA2(this);
    this.dfa4 = new iemlLexer.DFA4(this);
    iemlLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(iemlLexer, {
    L5LM: 27,
    PRINTSTAT: 6,
    LETTER: 30,
    CAT3: 12,
    PRIM: 15,
    XMLSTAT: 7,
    PRIMITIVE: 20,
    WS: 29,
    CAT4: 13,
    CAT5: 14,
    LOWER: 32,
    L4LM: 26,
    CAT2: 11,
    L0LM: 21,
    EXPRESSION: 4,
    FUNCTION: 8,
    CAT0: 9,
    UPPER: 33,
    EOF: -1,
    POR: 28,
    RPAREN: 18,
    LPAREN: 17,
    CAT1: 10,
    SCRIPT: 5,
    L2LM: 24,
    DIGIT: 31,
    STAR: 19,
    L3LM: 25,
    NAME: 16,
    EVENT: 22,
    L1LM: 23
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(iemlLexer, org.antlr.runtime.Lexer, {
    L5LM : 27,
    PRINTSTAT : 6,
    LETTER : 30,
    CAT3 : 12,
    PRIM : 15,
    XMLSTAT : 7,
    PRIMITIVE : 20,
    WS : 29,
    CAT4 : 13,
    CAT5 : 14,
    LOWER : 32,
    L4LM : 26,
    CAT2 : 11,
    L0LM : 21,
    EXPRESSION : 4,
    FUNCTION : 8,
    CAT0 : 9,
    UPPER : 33,
    EOF : -1,
    POR : 28,
    RPAREN : 18,
    LPAREN : 17,
    CAT1 : 10,
    SCRIPT : 5,
    L2LM : 24,
    DIGIT : 31,
    STAR : 19,
    L3LM : 25,
    NAME : 16,
    EVENT : 22,
    L1LM : 23,
    getGrammarFileName: function() { return "/eclipse/workspace/imelpreter/js/ieml.g"; }
});
org.antlr.lang.augmentObject(iemlLexer.prototype, {
    // $ANTLR start STAR
    mSTAR: function()  {
        try {
            var _type = this.STAR;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:39:6: ( '*' )
            // /eclipse/workspace/imelpreter/js/ieml.g:39:7: '*'
            this.match('*'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "STAR",

    // $ANTLR start WS
    mWS: function()  {
        try {
            var _type = this.WS;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:40:5: ( ( ' ' | '\\t' )+ )
            // /eclipse/workspace/imelpreter/js/ieml.g:40:9: ( ' ' | '\\t' )+
            // /eclipse/workspace/imelpreter/js/ieml.g:40:9: ( ' ' | '\\t' )+
            var cnt1=0;
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:
                    if ( this.input.LA(1)=='\t'||this.input.LA(1)==' ' ) {
                        this.input.consume();

                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        this.recover(mse);
                        throw mse;}



                    break;

                default :
                    if ( cnt1 >= 1 ) {
                        break loop1;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(1, this.input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            skip();



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "WS",

    // $ANTLR start PRIMITIVE
    mPRIMITIVE: function()  {
        try {
            var _type = this.PRIMITIVE;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:41:11: ( 'A' | 'U' | 'S' | 'B' | 'T' | 'O' | 'M' | 'E' )
            // /eclipse/workspace/imelpreter/js/ieml.g:
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='B')||this.input.LA(1)=='E'||this.input.LA(1)=='M'||this.input.LA(1)=='O'||(this.input.LA(1)>='S' && this.input.LA(1)<='U') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "PRIMITIVE",

    // $ANTLR start EVENT
    mEVENT: function()  {
        try {
            var _type = this.EVENT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:42:7: ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' )
            var alt2=25;
            alt2 = this.dfa2.predict(this.input);
            switch (alt2) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:9: 'wo'
                    this.match("wo"); 



                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:16: 'wa'
                    this.match("wa"); 



                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:23: 'y'
                    this.match('y'); 


                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:29: 'o'
                    this.match('o'); 


                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:35: 'e'
                    this.match('e'); 


                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:41: 'wu'
                    this.match("wu"); 



                    break;
                case 7 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:48: 'we'
                    this.match("we"); 



                    break;
                case 8 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:55: 'u'
                    this.match('u'); 


                    break;
                case 9 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:61: 'a'
                    this.match('a'); 


                    break;
                case 10 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:67: 'i'
                    this.match('i'); 


                    break;
                case 11 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:73: 'j'
                    this.match('j'); 


                    break;
                case 12 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:79: 'g'
                    this.match('g'); 


                    break;
                case 13 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:85: 's'
                    this.match('s'); 


                    break;
                case 14 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:91: 'b'
                    this.match('b'); 


                    break;
                case 15 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:97: 't'
                    this.match('t'); 


                    break;
                case 16 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:103: 'h'
                    this.match('h'); 


                    break;
                case 17 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:109: 'c'
                    this.match('c'); 


                    break;
                case 18 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:115: 'k'
                    this.match('k'); 


                    break;
                case 19 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:121: 'm'
                    this.match('m'); 


                    break;
                case 20 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:127: 'n'
                    this.match('n'); 


                    break;
                case 21 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:133: 'p'
                    this.match('p'); 


                    break;
                case 22 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:139: 'x'
                    this.match('x'); 


                    break;
                case 23 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:145: 'd'
                    this.match('d'); 


                    break;
                case 24 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:151: 'f'
                    this.match('f'); 


                    break;
                case 25 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:42:157: 'l'
                    this.match('l'); 


                    break;

            }
            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "EVENT",

    // $ANTLR start L0LM
    mL0LM: function()  {
        try {
            var _type = this.L0LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:43:6: ( ':' )
            // /eclipse/workspace/imelpreter/js/ieml.g:43:8: ':'
            this.match(':'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L0LM",

    // $ANTLR start L1LM
    mL1LM: function()  {
        try {
            var _type = this.L1LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:44:6: ( '.' )
            // /eclipse/workspace/imelpreter/js/ieml.g:44:8: '.'
            this.match('.'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L1LM",

    // $ANTLR start L2LM
    mL2LM: function()  {
        try {
            var _type = this.L2LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:45:6: ( '-' )
            // /eclipse/workspace/imelpreter/js/ieml.g:45:8: '-'
            this.match('-'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L2LM",

    // $ANTLR start L3LM
    mL3LM: function()  {
        try {
            var _type = this.L3LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:46:6: ( '\\'' )
            // /eclipse/workspace/imelpreter/js/ieml.g:46:8: '\\''
            this.match('\''); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L3LM",

    // $ANTLR start L4LM
    mL4LM: function()  {
        try {
            var _type = this.L4LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:47:6: ( ',' )
            // /eclipse/workspace/imelpreter/js/ieml.g:47:8: ','
            this.match(','); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L4LM",

    // $ANTLR start L5LM
    mL5LM: function()  {
        try {
            var _type = this.L5LM;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:48:6: ( '_' )
            // /eclipse/workspace/imelpreter/js/ieml.g:48:8: '_'
            this.match('_'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "L5LM",

    // $ANTLR start LPAREN
    mLPAREN: function()  {
        try {
            var _type = this.LPAREN;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:49:8: ( '(' )
            // /eclipse/workspace/imelpreter/js/ieml.g:49:10: '('
            this.match('('); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "LPAREN",

    // $ANTLR start RPAREN
    mRPAREN: function()  {
        try {
            var _type = this.RPAREN;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:50:8: ( ')' )
            // /eclipse/workspace/imelpreter/js/ieml.g:50:10: ')'
            this.match(')'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "RPAREN",

    // $ANTLR start POR
    mPOR: function()  {
        try {
            var _type = this.POR;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:51:5: ( '|' )
            // /eclipse/workspace/imelpreter/js/ieml.g:51:7: '|'
            this.match('|'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "POR",

    // $ANTLR start NAME
    mNAME: function()  {
        try {
            var _type = this.NAME;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /eclipse/workspace/imelpreter/js/ieml.g:52:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /eclipse/workspace/imelpreter/js/ieml.g:52:7: LETTER ( LETTER | DIGIT | '_' )*
            this.mLETTER(); 
            // /eclipse/workspace/imelpreter/js/ieml.g:52:14: ( LETTER | DIGIT | '_' )*
            loop3:
            do {
                var alt3=2;
                var LA3_0 = this.input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/ieml.g:
                    if ( (this.input.LA(1)>='0' && this.input.LA(1)<='9')||(this.input.LA(1)>='A' && this.input.LA(1)<='Z')||this.input.LA(1)=='_'||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                        this.input.consume();

                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        this.recover(mse);
                        throw mse;}



                    break;

                default :
                    break loop3;
                }
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "NAME",

    // $ANTLR start LETTER
    mLETTER: function()  {
        try {
            // /eclipse/workspace/imelpreter/js/ieml.g:53:16: ( LOWER | UPPER )
            // /eclipse/workspace/imelpreter/js/ieml.g:
            if ( (this.input.LA(1)>='A' && this.input.LA(1)<='Z')||(this.input.LA(1)>='a' && this.input.LA(1)<='z') ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}




        }
        finally {
        }
    },
    // $ANTLR end "LETTER",

    // $ANTLR start LOWER
    mLOWER: function()  {
        try {
            // /eclipse/workspace/imelpreter/js/ieml.g:54:15: ( 'a' .. 'z' )
            // /eclipse/workspace/imelpreter/js/ieml.g:54:17: 'a' .. 'z'
            this.matchRange('a','z'); 



        }
        finally {
        }
    },
    // $ANTLR end "LOWER",

    // $ANTLR start UPPER
    mUPPER: function()  {
        try {
            // /eclipse/workspace/imelpreter/js/ieml.g:55:15: ( 'A' .. 'Z' )
            // /eclipse/workspace/imelpreter/js/ieml.g:55:17: 'A' .. 'Z'
            this.matchRange('A','Z'); 



        }
        finally {
        }
    },
    // $ANTLR end "UPPER",

    // $ANTLR start DIGIT
    mDIGIT: function()  {
        try {
            // /eclipse/workspace/imelpreter/js/ieml.g:56:15: ( '0' .. '9' )
            // /eclipse/workspace/imelpreter/js/ieml.g:56:17: '0' .. '9'
            this.matchRange('0','9'); 



        }
        finally {
        }
    },
    // $ANTLR end "DIGIT",

    mTokens: function() {
        // /eclipse/workspace/imelpreter/js/ieml.g:1:8: ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | NAME )
        var alt4=14;
        alt4 = this.dfa4.predict(this.input);
        switch (alt4) {
            case 1 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:10: STAR
                this.mSTAR(); 


                break;
            case 2 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:15: WS
                this.mWS(); 


                break;
            case 3 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:18: PRIMITIVE
                this.mPRIMITIVE(); 


                break;
            case 4 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:28: EVENT
                this.mEVENT(); 


                break;
            case 5 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:34: L0LM
                this.mL0LM(); 


                break;
            case 6 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:39: L1LM
                this.mL1LM(); 


                break;
            case 7 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:44: L2LM
                this.mL2LM(); 


                break;
            case 8 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:49: L3LM
                this.mL3LM(); 


                break;
            case 9 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:54: L4LM
                this.mL4LM(); 


                break;
            case 10 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:59: L5LM
                this.mL5LM(); 


                break;
            case 11 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:64: LPAREN
                this.mLPAREN(); 


                break;
            case 12 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:71: RPAREN
                this.mRPAREN(); 


                break;
            case 13 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:78: POR
                this.mPOR(); 


                break;
            case 14 :
                // /eclipse/workspace/imelpreter/js/ieml.g:1:82: NAME
                this.mNAME(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(iemlLexer, {
    DFA2_eotS:
        "\u001b\uffff",
    DFA2_eofS:
        "\u001b\uffff",
    DFA2_minS:
        "\u0002\u0061\u0019\uffff",
    DFA2_maxS:
        "\u0001\u0079\u0001\u0075\u0019\uffff",
    DFA2_acceptS:
        "\u0002\uffff\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0008\u0001"+
    "\u0009\u0001\u000a\u0001\u000b\u0001\u000c\u0001\u000d\u0001\u000e\u0001"+
    "\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001"+
    "\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0001\u0019\u0001\u0001\u0001"+
    "\u0002\u0001\u0006\u0001\u0007",
    DFA2_specialS:
        "\u001b\uffff}>",
    DFA2_transitionS: [
            "\u0001\u0006\u0001\u000b\u0001\u000e\u0001\u0014\u0001\u0004"+
            "\u0001\u0015\u0001\u0009\u0001\u000d\u0001\u0007\u0001\u0008"+
            "\u0001\u000f\u0001\u0016\u0001\u0010\u0001\u0011\u0001\u0003"+
            "\u0001\u0012\u0002\uffff\u0001\u000a\u0001\u000c\u0001\u0005"+
            "\u0001\uffff\u0001\u0001\u0001\u0013\u0001\u0002",
            "\u0001\u0018\u0003\uffff\u0001\u001a\u0009\uffff\u0001\u0017"+
            "\u0005\uffff\u0001\u0019",
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
    ]
});

org.antlr.lang.augmentObject(iemlLexer, {
    DFA2_eot:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA2_eotS),
    DFA2_eof:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA2_eofS),
    DFA2_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(iemlLexer.DFA2_minS),
    DFA2_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(iemlLexer.DFA2_maxS),
    DFA2_accept:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA2_acceptS),
    DFA2_special:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA2_specialS),
    DFA2_transition: (function() {
        var a = [],
            i,
            numStates = iemlLexer.DFA2_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA2_transitionS[i]));
        }
        return a;
    })()
});

iemlLexer.DFA2 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 2;
    this.eot = iemlLexer.DFA2_eot;
    this.eof = iemlLexer.DFA2_eof;
    this.min = iemlLexer.DFA2_min;
    this.max = iemlLexer.DFA2_max;
    this.accept = iemlLexer.DFA2_accept;
    this.special = iemlLexer.DFA2_special;
    this.transition = iemlLexer.DFA2_transition;
};

org.antlr.lang.extend(iemlLexer.DFA2, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "42:1: EVENT : ( 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' );";
    },
    dummy: null
});
org.antlr.lang.augmentObject(iemlLexer, {
    DFA4_eotS:
        "\u0003\uffff\u0001\u0024\u0001\u0023\u0015\u0029\u000b\uffff\u0004"+
    "\u0029\u0001\uffff",
    DFA4_eofS:
        "\u002a\uffff",
    DFA4_minS:
        "\u0001\u0009\u0002\uffff\u0001\u0030\u0001\u0061\u0015\u0030\u000b"+
    "\uffff\u0004\u0030\u0001\uffff",
    DFA4_maxS:
        "\u0001\u007c\u0002\uffff\u0001\u007a\u0001\u0075\u0015\u007a\u000b"+
    "\uffff\u0004\u007a\u0001\uffff",
    DFA4_acceptS:
        "\u0001\uffff\u0001\u0001\u0001\u0002\u0017\uffff\u0001\u0005\u0001"+
    "\u0006\u0001\u0007\u0001\u0008\u0001\u0009\u0001\u000a\u0001\u000b\u0001"+
    "\u000c\u0001\u000d\u0001\u000e\u0001\u0003\u0004\uffff\u0001\u0004",
    DFA4_specialS:
        "\u002a\uffff}>",
    DFA4_transitionS: [
            "\u0001\u0002\u0016\uffff\u0001\u0002\u0006\uffff\u0001\u001d"+
            "\u0001\u0020\u0001\u0021\u0001\u0001\u0001\uffff\u0001\u001e"+
            "\u0001\u001c\u0001\u001b\u000b\uffff\u0001\u001a\u0006\uffff"+
            "\u0002\u0003\u0002\u0023\u0001\u0003\u0007\u0023\u0001\u0003"+
            "\u0001\u0023\u0001\u0003\u0003\u0023\u0003\u0003\u0005\u0023"+
            "\u0004\uffff\u0001\u001f\u0001\uffff\u0001\u0009\u0001\u000e"+
            "\u0001\u0011\u0001\u0017\u0001\u0007\u0001\u0018\u0001\u000c"+
            "\u0001\u0010\u0001\u000a\u0001\u000b\u0001\u0012\u0001\u0019"+
            "\u0001\u0013\u0001\u0014\u0001\u0006\u0001\u0015\u0002\u0023"+
            "\u0001\u000d\u0001\u000f\u0001\u0008\u0001\u0023\u0001\u0004"+
            "\u0001\u0016\u0001\u0005\u0001\u0023\u0001\uffff\u0001\u0022",
            "",
            "",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u0001\u0026\u0003\uffff\u0001\u0028\u0009\uffff\u0001\u0025"+
            "\u0005\uffff\u0001\u0027",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
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
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            "\u000a\u0023\u0007\uffff\u001a\u0023\u0004\uffff\u0001\u0023"+
            "\u0001\uffff\u001a\u0023",
            ""
    ]
});

org.antlr.lang.augmentObject(iemlLexer, {
    DFA4_eot:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA4_eotS),
    DFA4_eof:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA4_eofS),
    DFA4_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(iemlLexer.DFA4_minS),
    DFA4_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(iemlLexer.DFA4_maxS),
    DFA4_accept:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA4_acceptS),
    DFA4_special:
        org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA4_specialS),
    DFA4_transition: (function() {
        var a = [],
            i,
            numStates = iemlLexer.DFA4_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(iemlLexer.DFA4_transitionS[i]));
        }
        return a;
    })()
});

iemlLexer.DFA4 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 4;
    this.eot = iemlLexer.DFA4_eot;
    this.eof = iemlLexer.DFA4_eof;
    this.min = iemlLexer.DFA4_min;
    this.max = iemlLexer.DFA4_max;
    this.accept = iemlLexer.DFA4_accept;
    this.special = iemlLexer.DFA4_special;
    this.transition = iemlLexer.DFA4_transition;
};

org.antlr.lang.extend(iemlLexer.DFA4, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( STAR | WS | PRIMITIVE | EVENT | L0LM | L1LM | L2LM | L3LM | L4LM | L5LM | LPAREN | RPAREN | POR | NAME );";
    },
    dummy: null
});
 
})();