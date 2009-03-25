// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/js/iemlWalker.g 2009-03-24 21:42:25

var iemlWalker = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    iemlWalker.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(iemlWalker, {
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
// public class variables
var L5LM= 27,
    PRINTSTAT= 6,
    LETTER= 30,
    CAT3= 12,
    PRIM= 15,
    XMLSTAT= 7,
    PRIMITIVE= 20,
    WS= 29,
    CAT4= 13,
    CAT5= 14,
    LOWER= 32,
    L4LM= 26,
    CAT2= 11,
    L0LM= 21,
    EXPRESSION= 4,
    FUNCTION= 8,
    CAT0= 9,
    UPPER= 33,
    EOF= -1,
    POR= 28,
    RPAREN= 18,
    LPAREN= 17,
    CAT1= 10,
    SCRIPT= 5,
    L2LM= 24,
    DIGIT= 31,
    STAR= 19,
    L3LM= 25,
    NAME= 16,
    EVENT= 22,
    L1LM= 23;
var UP = org.antlr.runtime.Token.UP,
    DOWN = org.antlr.runtime.Token.DOWN;

// public instance methods/vars
org.antlr.lang.extend(iemlWalker, org.antlr.runtime.tree.TreeParser, {
        

    getTokenNames: function() { return iemlWalker.tokenNames; },
    getGrammarFileName: function() { return "/eclipse/workspace/imelpreter/js/iemlWalker.g"; }
});
org.antlr.lang.augmentObject(iemlWalker.prototype, {


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:9:1: script returns [category] : cat= starexp ;
    // $ANTLR start "script"
    script: function() {
        var category = null;

         var cat = null;

        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:10:1: (cat= starexp )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:10:3: cat= starexp
            this.pushFollow(iemlWalker.FOLLOW_starexp_in_script45);
            cat=this.starexp();

            this.state._fsp--;

            category=cat



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return category;
    },


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:12:1: functionEval : ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) );
    // $ANTLR start "functionEval"
    functionEval: function() {
        var fn = null;
         var cat = null;

        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:13:2: ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) )
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==FUNCTION) ) {
                var LA1_1 = this.input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    var LA1_2 = this.input.LA(3);

                    if ( (LA1_2==NAME) ) {
                        var LA1_3 = this.input.LA(4);

                        if ( (LA1_3==FUNCTION) ) {
                            alt1=2;
                        }
                        else if ( (LA1_3==EXPRESSION) ) {
                            alt1=1;
                        }
                        else {
                            var nvae =
                                new org.antlr.runtime.NoViableAltException("", 1, 3, this.input);

                            throw nvae;
                        }
                    }
                    else {
                        var nvae =
                            new org.antlr.runtime.NoViableAltException("", 1, 2, this.input);

                        throw nvae;
                    }
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 1, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 1, 0, this.input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:13:4: ^( FUNCTION fn= NAME cat= starexp )
                    this.match(this.input,FUNCTION,iemlWalker.FOLLOW_FUNCTION_in_functionEval57); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    fn=this.match(this.input,NAME,iemlWalker.FOLLOW_NAME_in_functionEval61); 
                    this.pushFollow(iemlWalker.FOLLOW_starexp_in_functionEval65);
                    cat=this.starexp();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		return eval(fn + "(cat)");
                    	  


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:16:4: ^( FUNCTION fn= NAME functionEval )
                    this.match(this.input,FUNCTION,iemlWalker.FOLLOW_FUNCTION_in_functionEval74); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    fn=this.match(this.input,NAME,iemlWalker.FOLLOW_NAME_in_functionEval78); 
                    this.pushFollow(iemlWalker.FOLLOW_functionEval_in_functionEval80);
                    this.functionEval();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;

            }
        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    },


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:18:1: starexp returns [Category category] : ( ^( EXPRESSION cat= category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) );
    // $ANTLR start "starexp"
    starexp: function() {
        var category = null;

         var cat = null;

        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:18:36: ( ^( EXPRESSION cat= category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) )
            var alt2=6;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==EXPRESSION) ) {
                var LA2_1 = this.input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    switch ( this.input.LA(3) ) {
                    case CAT1:
                        alt2=2;
                        break;
                    case CAT2:
                        alt2=3;
                        break;
                    case CAT0:
                        alt2=1;
                        break;
                    case CAT4:
                        alt2=5;
                        break;
                    case CAT5:
                        alt2=6;
                        break;
                    case CAT3:
                        alt2=4;
                        break;
                    default:
                        var nvae =
                            new org.antlr.runtime.NoViableAltException("", 2, 2, this.input);

                        throw nvae;
                    }

                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 2, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 2, 0, this.input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:19:4: ^( EXPRESSION cat= category0 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp98); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category0_in_starexp102);
                    cat=this.category0();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:20:4: ^( EXPRESSION cat= category1 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp112); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category1_in_starexp116);
                    cat=this.category1();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:21:4: ^( EXPRESSION cat= category2 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp126); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category2_in_starexp130);
                    cat=this.category2();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:22:4: ^( EXPRESSION cat= category3 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp140); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category3_in_starexp144);
                    cat=this.category3();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:23:4: ^( EXPRESSION cat= category4 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp154); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category4_in_starexp158);
                    cat=this.category4();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:24:4: ^( EXPRESSION cat= category5 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp168); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category5_in_starexp172);
                    cat=this.category5();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;

            }
        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return category;
    },

    category5_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:26:1: category5 returns [Category result] : ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) ;
    // $ANTLR start "category5"
    category5: function() {
        this.category5_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category5_stack).cat5 = createCategory(5); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:2: ( ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:4: ^( CAT5 first= category4 (second= category4 (third= category4 )? )? )
            this.match(this.input,CAT5,iemlWalker.FOLLOW_CAT5_in_category5198); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category4_in_category5202);
            first=this.category4();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:27: (second= category4 (third= category4 )? )?
            var alt4=2;
            var LA4_0 = this.input.LA(1);

            if ( (LA4_0==CAT4) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:28: second= category4 (third= category4 )?
                    this.pushFollow(iemlWalker.FOLLOW_category4_in_category5207);
                    second=this.category4();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:50: (third= category4 )?
                    var alt3=2;
                    var LA3_0 = this.input.LA(1);

                    if ( (LA3_0==CAT4) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:29:50: third= category4
                            this.pushFollow(iemlWalker.FOLLOW_category4_in_category5211);
                            third=this.category4();

                            this.state._fsp--;



                            break;

                    }



                    break;

            }


            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		result = org.antlr.lang.array.peek(this.category5_stack).cat5;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category5_stack.pop();
        }
        return result;
    },

    category4_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:35:1: category4 returns [Category result] : ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) ;
    // $ANTLR start "category4"
    category4: function() {
        this.category4_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category4_stack).cat4 = createCategory(4); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:2: ( ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:4: ^( CAT4 first= category3 (second= category3 (third= category3 )? )? )
            this.match(this.input,CAT4,iemlWalker.FOLLOW_CAT4_in_category4239); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category3_in_category4243);
            first=this.category3();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:27: (second= category3 (third= category3 )? )?
            var alt6=2;
            var LA6_0 = this.input.LA(1);

            if ( (LA6_0==CAT3) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:28: second= category3 (third= category3 )?
                    this.pushFollow(iemlWalker.FOLLOW_category3_in_category4248);
                    second=this.category3();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:50: (third= category3 )?
                    var alt5=2;
                    var LA5_0 = this.input.LA(1);

                    if ( (LA5_0==CAT3) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:38:50: third= category3
                            this.pushFollow(iemlWalker.FOLLOW_category3_in_category4252);
                            third=this.category3();

                            this.state._fsp--;



                            break;

                    }



                    break;

            }


            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		result = org.antlr.lang.array.peek(this.category4_stack).cat4;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category4_stack.pop();
        }
        return result;
    },

    category3_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:44:1: category3 returns [Category result] : ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) ;
    // $ANTLR start "category3"
    category3: function() {
        this.category3_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category3_stack).cat3 = createCategory(3); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:2: ( ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:4: ^( CAT3 first= category2 (second= category2 (third= category2 )? )? )
            this.match(this.input,CAT3,iemlWalker.FOLLOW_CAT3_in_category3281); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category2_in_category3285);
            first=this.category2();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:27: (second= category2 (third= category2 )? )?
            var alt8=2;
            var LA8_0 = this.input.LA(1);

            if ( (LA8_0==CAT2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:28: second= category2 (third= category2 )?
                    this.pushFollow(iemlWalker.FOLLOW_category2_in_category3290);
                    second=this.category2();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:50: (third= category2 )?
                    var alt7=2;
                    var LA7_0 = this.input.LA(1);

                    if ( (LA7_0==CAT2) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:47:50: third= category2
                            this.pushFollow(iemlWalker.FOLLOW_category2_in_category3294);
                            third=this.category2();

                            this.state._fsp--;



                            break;

                    }



                    break;

            }


            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		result = org.antlr.lang.array.peek(this.category3_stack).cat3;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category3_stack.pop();
        }
        return result;
    },

    category2_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:53:1: category2 returns [Category result] : ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) ;
    // $ANTLR start "category2"
    category2: function() {
        this.category2_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category2_stack).cat2 = createCategory(2); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:2: ( ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:4: ^( CAT2 first= category1 (second= category1 (third= category1 )? )? )
            this.match(this.input,CAT2,iemlWalker.FOLLOW_CAT2_in_category2323); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category1_in_category2327);
            first=this.category1();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:27: (second= category1 (third= category1 )? )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( (LA10_0==CAT1) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:28: second= category1 (third= category1 )?
                    this.pushFollow(iemlWalker.FOLLOW_category1_in_category2332);
                    second=this.category1();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:50: (third= category1 )?
                    var alt9=2;
                    var LA9_0 = this.input.LA(1);

                    if ( (LA9_0==CAT1) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:56:50: third= category1
                            this.pushFollow(iemlWalker.FOLLOW_category1_in_category2336);
                            third=this.category1();

                            this.state._fsp--;



                            break;

                    }



                    break;

            }


            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		result = org.antlr.lang.array.peek(this.category2_stack).cat2;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category2_stack.pop();
        }
        return result;
    },

    category1_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:62:1: category1 returns [Category result] : ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) );
    // $ANTLR start "category1"
    category1: function() {
        this.category1_stack.push({});
        var result = null;

        var EVENT1 = null;
         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category1_stack).cat1 = createCategory(1); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:2: ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) )
            var alt13=2;
            var LA13_0 = this.input.LA(1);

            if ( (LA13_0==CAT1) ) {
                var LA13_1 = this.input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    var LA13_2 = this.input.LA(3);

                    if ( (LA13_2==EVENT) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==CAT0) ) {
                        alt13=1;
                    }
                    else {
                        var nvae =
                            new org.antlr.runtime.NoViableAltException("", 13, 2, this.input);

                        throw nvae;
                    }
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 13, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 13, 0, this.input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:4: ^( CAT1 first= category0 (second= category0 (third= category0 )? )? )
                    this.match(this.input,CAT1,iemlWalker.FOLLOW_CAT1_in_category1365); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category0_in_category1369);
                    first=this.category0();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:27: (second= category0 (third= category0 )? )?
                    var alt12=2;
                    var LA12_0 = this.input.LA(1);

                    if ( (LA12_0==CAT0) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:28: second= category0 (third= category0 )?
                            this.pushFollow(iemlWalker.FOLLOW_category0_in_category1374);
                            second=this.category0();

                            this.state._fsp--;

                            // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:50: (third= category0 )?
                            var alt11=2;
                            var LA11_0 = this.input.LA(1);

                            if ( (LA11_0==CAT0) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:65:50: third= category0
                                    this.pushFollow(iemlWalker.FOLLOW_category0_in_category1378);
                                    third=this.category0();

                                    this.state._fsp--;



                                    break;

                            }



                            break;

                    }


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		result = org.antlr.lang.array.peek(this.category1_stack).cat1;
                    		result.setRole1(first);
                    		if (second!=null) result.setRole2(second);
                    		if (third!=null) result.setRole3(third); 


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/js/iemlWalker.g:70:4: ^( CAT1 EVENT )
                    this.match(this.input,CAT1,iemlWalker.FOLLOW_CAT1_in_category1390); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    EVENT1=this.match(this.input,EVENT,iemlWalker.FOLLOW_EVENT_in_category1392); 

                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		result = org.antlr.lang.array.peek(this.category1_stack).cat1;
                    		result.setValue((EVENT1?EVENT1.getText():null));
                    	


                    break;

            }
        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category1_stack.pop();
        }
        return result;
    },

    category0_stack: [],


    // /eclipse/workspace/imelpreter/js/iemlWalker.g:74:1: category0 returns [Category result] : ^( CAT0 PRIMITIVE ) ;
    // $ANTLR start "category0"
    category0: function() {
        this.category0_stack.push({});
        var result = null;

        var PRIMITIVE2 = null;

         org.antlr.lang.array.peek(this.category0_stack).cat0 = createCategory(0); 
        try {
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:77:2: ( ^( CAT0 PRIMITIVE ) )
            // /eclipse/workspace/imelpreter/js/iemlWalker.g:77:4: ^( CAT0 PRIMITIVE )
            this.match(this.input,CAT0,iemlWalker.FOLLOW_CAT0_in_category0417); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            PRIMITIVE2=this.match(this.input,PRIMITIVE,iemlWalker.FOLLOW_PRIMITIVE_in_category0419); 

            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		result = org.antlr.lang.array.peek(this.category0_stack).cat0;
            		result.setValue((PRIMITIVE2?PRIMITIVE2.getText():null));
            	



        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
            this.category0_stack.pop();
        }
        return result;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(iemlWalker, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPRESSION", "SCRIPT", "PRINTSTAT", "XMLSTAT", "FUNCTION", "CAT0", "CAT1", "CAT2", "CAT3", "CAT4", "CAT5", "PRIM", "NAME", "LPAREN", "RPAREN", "STAR", "PRIMITIVE", "L0LM", "EVENT", "L1LM", "L2LM", "L3LM", "L4LM", "L5LM", "POR", "WS", "LETTER", "DIGIT", "LOWER", "UPPER"],
    FOLLOW_starexp_in_script45: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_FUNCTION_in_functionEval57: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_NAME_in_functionEval61: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_starexp_in_functionEval65: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_FUNCTION_in_functionEval74: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_NAME_in_functionEval78: new org.antlr.runtime.BitSet([0x00000100, 0x00000000]),
    FOLLOW_functionEval_in_functionEval80: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp98: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category0_in_starexp102: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp112: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category1_in_starexp116: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp126: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category2_in_starexp130: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp140: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category3_in_starexp144: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp154: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category4_in_starexp158: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp168: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category5_in_starexp172: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT5_in_category5198: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category4_in_category5202: new org.antlr.runtime.BitSet([0x00002008, 0x00000000]),
    FOLLOW_category4_in_category5207: new org.antlr.runtime.BitSet([0x00002008, 0x00000000]),
    FOLLOW_category4_in_category5211: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT4_in_category4239: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category3_in_category4243: new org.antlr.runtime.BitSet([0x00001008, 0x00000000]),
    FOLLOW_category3_in_category4248: new org.antlr.runtime.BitSet([0x00001008, 0x00000000]),
    FOLLOW_category3_in_category4252: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT3_in_category3281: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category2_in_category3285: new org.antlr.runtime.BitSet([0x00000808, 0x00000000]),
    FOLLOW_category2_in_category3290: new org.antlr.runtime.BitSet([0x00000808, 0x00000000]),
    FOLLOW_category2_in_category3294: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT2_in_category2323: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category1_in_category2327: new org.antlr.runtime.BitSet([0x00000408, 0x00000000]),
    FOLLOW_category1_in_category2332: new org.antlr.runtime.BitSet([0x00000408, 0x00000000]),
    FOLLOW_category1_in_category2336: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT1_in_category1365: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category0_in_category1369: new org.antlr.runtime.BitSet([0x00000208, 0x00000000]),
    FOLLOW_category0_in_category1374: new org.antlr.runtime.BitSet([0x00000208, 0x00000000]),
    FOLLOW_category0_in_category1378: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT1_in_category1390: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_EVENT_in_category1392: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT0_in_category0417: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_PRIMITIVE_in_category0419: new org.antlr.runtime.BitSet([0x00000008, 0x00000000])
});

})();