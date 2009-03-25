// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/iemlWalker.g 2009-03-17 20:11:47

	package org.ieml;
	import java.lang.reflect.*;
	import java.io.*;
	

var iemlWalker = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){

        	
        	Category createCategory(int layer) {
        		return new Category(layer);
        	}
        	
        	public static void print(Category category) {
        		System.out.println(category.toString());
        	}
        	
        	public void sources(Category category) {
        		category.sources();
        	}
        	
        	public void layer(Category category) {
        		category.layer();
        	}
        	

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
    getGrammarFileName: function() { return "/eclipse/workspace/imelpreter/src/iemlWalker.g"; }
});
org.antlr.lang.augmentObject(iemlWalker.prototype, {


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:35:1: script : ( functionEval )* ;
    // $ANTLR start "script"
    script: function() {
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:35:7: ( ( functionEval )* )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:35:9: ( functionEval )*
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:35:9: ( functionEval )*
            loop1:
            do {
                var alt1=2;
                var LA1_0 = this.input.LA(1);

                if ( (LA1_0==FUNCTION) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:35:9: functionEval
                    this.pushFollow(iemlWalker.FOLLOW_functionEval_in_script50);
                    this.functionEval();

                    this.state._fsp--;



                    break;

                default :
                    break loop1;
                }
            } while (true);




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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:37:1: functionEval : ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) );
    // $ANTLR start "functionEval"
    functionEval: function() {
        var fn = null;
         var cat = null;

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:38:2: ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) )
            var alt2=2;
            var LA2_0 = this.input.LA(1);

            if ( (LA2_0==FUNCTION) ) {
                var LA2_1 = this.input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    var LA2_2 = this.input.LA(3);

                    if ( (LA2_2==NAME) ) {
                        var LA2_3 = this.input.LA(4);

                        if ( (LA2_3==EXPRESSION) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==FUNCTION) ) {
                            alt2=2;
                        }
                        else {
                            var nvae =
                                new org.antlr.runtime.NoViableAltException("", 2, 3, this.input);

                            throw nvae;
                        }
                    }
                    else {
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
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:38:4: ^( FUNCTION fn= NAME cat= starexp )
                    this.match(this.input,FUNCTION,iemlWalker.FOLLOW_FUNCTION_in_functionEval61); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    fn=this.match(this.input,NAME,iemlWalker.FOLLOW_NAME_in_functionEval65); 
                    this.pushFollow(iemlWalker.FOLLOW_starexp_in_functionEval69);
                    cat=this.starexp();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		try {
                    			Method method = this.getClass().getDeclaredMethod(fn.toString(), new Class[] {Category.class});
                    			method.invoke(this, new Object[]{cat});
                    		} catch (Exception e) {
                    			ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    			PrintStream ps = new PrintStream(baos);
                    			e.printStackTrace(ps);
                    			System.out.println("Error executing function: " + new String(baos.toByteArray()));
                    		}
                    	  


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:49:4: ^( FUNCTION fn= NAME functionEval )
                    this.match(this.input,FUNCTION,iemlWalker.FOLLOW_FUNCTION_in_functionEval78); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    fn=this.match(this.input,NAME,iemlWalker.FOLLOW_NAME_in_functionEval82); 
                    this.pushFollow(iemlWalker.FOLLOW_functionEval_in_functionEval84);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:51:1: starexp returns [Category category] : ( ^( EXPRESSION category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) );
    // $ANTLR start "starexp"
    starexp: function() {
        var category = null;

         var cat = null;

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:51:36: ( ^( EXPRESSION category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) )
            var alt3=6;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0==EXPRESSION) ) {
                var LA3_1 = this.input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    switch ( this.input.LA(3) ) {
                    case CAT1:
                        alt3=2;
                        break;
                    case CAT2:
                        alt3=3;
                        break;
                    case CAT4:
                        alt3=5;
                        break;
                    case CAT0:
                        alt3=1;
                        break;
                    case CAT5:
                        alt3=6;
                        break;
                    case CAT3:
                        alt3=4;
                        break;
                    default:
                        var nvae =
                            new org.antlr.runtime.NoViableAltException("", 3, 2, this.input);

                        throw nvae;
                    }

                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 3, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:52:1: ^( EXPRESSION category0 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp99); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category0_in_starexp101);
                    this.category0();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:53:4: ^( EXPRESSION cat= category1 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp109); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category1_in_starexp113);
                    cat=this.category1();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:54:4: ^( EXPRESSION cat= category2 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp123); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category2_in_starexp127);
                    cat=this.category2();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:55:4: ^( EXPRESSION cat= category3 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp137); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category3_in_starexp141);
                    cat=this.category3();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:56:4: ^( EXPRESSION cat= category4 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp151); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category4_in_starexp155);
                    cat=this.category4();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 
                     category =cat; 


                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:57:4: ^( EXPRESSION cat= category5 )
                    this.match(this.input,EXPRESSION,iemlWalker.FOLLOW_EXPRESSION_in_starexp165); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category5_in_starexp169);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:59:1: category5 returns [Category result] : ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) ;
    // $ANTLR start "category5"
    category5: function() {
        this.category5_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category5_stack).cat5 = createCategory(5); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:2: ( ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:4: ^( CAT5 first= category4 (second= category4 (third= category4 )? )? )
            this.match(this.input,CAT5,iemlWalker.FOLLOW_CAT5_in_category5195); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category4_in_category5199);
            first=this.category4();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:27: (second= category4 (third= category4 )? )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0==CAT4) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:28: second= category4 (third= category4 )?
                    this.pushFollow(iemlWalker.FOLLOW_category4_in_category5204);
                    second=this.category4();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:50: (third= category4 )?
                    var alt4=2;
                    var LA4_0 = this.input.LA(1);

                    if ( (LA4_0==CAT4) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:62:50: third= category4
                            this.pushFollow(iemlWalker.FOLLOW_category4_in_category5208);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:68:1: category4 returns [Category result] : ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) ;
    // $ANTLR start "category4"
    category4: function() {
        this.category4_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category4_stack).cat4 = createCategory(4); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:2: ( ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:4: ^( CAT4 first= category3 (second= category3 (third= category3 )? )? )
            this.match(this.input,CAT4,iemlWalker.FOLLOW_CAT4_in_category4236); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category3_in_category4240);
            first=this.category3();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:27: (second= category3 (third= category3 )? )?
            var alt7=2;
            var LA7_0 = this.input.LA(1);

            if ( (LA7_0==CAT3) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:28: second= category3 (third= category3 )?
                    this.pushFollow(iemlWalker.FOLLOW_category3_in_category4245);
                    second=this.category3();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:50: (third= category3 )?
                    var alt6=2;
                    var LA6_0 = this.input.LA(1);

                    if ( (LA6_0==CAT3) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:71:50: third= category3
                            this.pushFollow(iemlWalker.FOLLOW_category3_in_category4249);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:77:1: category3 returns [Category result] : ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) ;
    // $ANTLR start "category3"
    category3: function() {
        this.category3_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category3_stack).cat3 = createCategory(3); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:2: ( ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:4: ^( CAT3 first= category2 (second= category2 (third= category2 )? )? )
            this.match(this.input,CAT3,iemlWalker.FOLLOW_CAT3_in_category3278); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category2_in_category3282);
            first=this.category2();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:27: (second= category2 (third= category2 )? )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0==CAT2) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:28: second= category2 (third= category2 )?
                    this.pushFollow(iemlWalker.FOLLOW_category2_in_category3287);
                    second=this.category2();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:50: (third= category2 )?
                    var alt8=2;
                    var LA8_0 = this.input.LA(1);

                    if ( (LA8_0==CAT2) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:80:50: third= category2
                            this.pushFollow(iemlWalker.FOLLOW_category2_in_category3291);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:86:1: category2 returns [Category result] : ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) ;
    // $ANTLR start "category2"
    category2: function() {
        this.category2_stack.push({});
        var result = null;

         var first = null;
         var second = null;
         var third = null;

         org.antlr.lang.array.peek(this.category2_stack).cat2 = createCategory(2); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:2: ( ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:4: ^( CAT2 first= category1 (second= category1 (third= category1 )? )? )
            this.match(this.input,CAT2,iemlWalker.FOLLOW_CAT2_in_category2320); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            this.pushFollow(iemlWalker.FOLLOW_category1_in_category2324);
            first=this.category1();

            this.state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:27: (second= category1 (third= category1 )? )?
            var alt11=2;
            var LA11_0 = this.input.LA(1);

            if ( (LA11_0==CAT1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:28: second= category1 (third= category1 )?
                    this.pushFollow(iemlWalker.FOLLOW_category1_in_category2329);
                    second=this.category1();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:50: (third= category1 )?
                    var alt10=2;
                    var LA10_0 = this.input.LA(1);

                    if ( (LA10_0==CAT1) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:89:50: third= category1
                            this.pushFollow(iemlWalker.FOLLOW_category1_in_category2333);
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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:95:1: category1 returns [Category result] : ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) );
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
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:2: ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) )
            var alt14=2;
            var LA14_0 = this.input.LA(1);

            if ( (LA14_0==CAT1) ) {
                var LA14_1 = this.input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    var LA14_2 = this.input.LA(3);

                    if ( (LA14_2==EVENT) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==CAT0) ) {
                        alt14=1;
                    }
                    else {
                        var nvae =
                            new org.antlr.runtime.NoViableAltException("", 14, 2, this.input);

                        throw nvae;
                    }
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 14, 1, this.input);

                    throw nvae;
                }
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 14, 0, this.input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:4: ^( CAT1 first= category0 (second= category0 (third= category0 )? )? )
                    this.match(this.input,CAT1,iemlWalker.FOLLOW_CAT1_in_category1362); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(iemlWalker.FOLLOW_category0_in_category1366);
                    first=this.category0();

                    this.state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:27: (second= category0 (third= category0 )? )?
                    var alt13=2;
                    var LA13_0 = this.input.LA(1);

                    if ( (LA13_0==CAT0) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:28: second= category0 (third= category0 )?
                            this.pushFollow(iemlWalker.FOLLOW_category0_in_category1371);
                            second=this.category0();

                            this.state._fsp--;

                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:50: (third= category0 )?
                            var alt12=2;
                            var LA12_0 = this.input.LA(1);

                            if ( (LA12_0==CAT0) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:98:50: third= category0
                                    this.pushFollow(iemlWalker.FOLLOW_category0_in_category1375);
                                    third=this.category0();

                                    this.state._fsp--;



                                    break;

                            }



                            break;

                    }


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		result = org.antlr.lang.array.peek(this.category1_stack).cat1;
                    		result.setRole1Value(first);
                    		if (second!=null) result.setRole2Value(second);
                    		if (third!=null) result.setRole3Value(third); 


                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:103:4: ^( CAT1 EVENT )
                    this.match(this.input,CAT1,iemlWalker.FOLLOW_CAT1_in_category1387); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    EVENT1=this.match(this.input,EVENT,iemlWalker.FOLLOW_EVENT_in_category1389); 

                    this.match(this.input, org.antlr.runtime.Token.UP, null); 

                    		result = org.antlr.lang.array.peek(this.category1_stack).cat1;
                    		result.setAbbreviation((EVENT1?EVENT1.getText():null));
                    	


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


    // /eclipse/workspace/imelpreter/src/iemlWalker.g:107:1: category0 returns [String value] : ^( CAT0 PRIMITIVE ) ;
    // $ANTLR start "category0"
    category0: function() {
        var value = null;

        var PRIMITIVE2 = null;

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:108:2: ( ^( CAT0 PRIMITIVE ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:108:4: ^( CAT0 PRIMITIVE )
            this.match(this.input,CAT0,iemlWalker.FOLLOW_CAT0_in_category0406); 

            this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
            PRIMITIVE2=this.match(this.input,PRIMITIVE,iemlWalker.FOLLOW_PRIMITIVE_in_category0408); 

            this.match(this.input, org.antlr.runtime.Token.UP, null); 

            		value = (PRIMITIVE2?PRIMITIVE2.getText():null);
            	



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
        return value;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(iemlWalker, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPRESSION", "SCRIPT", "PRINTSTAT", "XMLSTAT", "FUNCTION", "CAT0", "CAT1", "CAT2", "CAT3", "CAT4", "CAT5", "PRIM", "NAME", "LPAREN", "RPAREN", "STAR", "PRIMITIVE", "L0LM", "EVENT", "L1LM", "L2LM", "L3LM", "L4LM", "L5LM", "POR", "WS", "LETTER", "DIGIT", "LOWER", "UPPER"],
    FOLLOW_functionEval_in_script50: new org.antlr.runtime.BitSet([0x00000102, 0x00000000]),
    FOLLOW_FUNCTION_in_functionEval61: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_NAME_in_functionEval65: new org.antlr.runtime.BitSet([0x00000010, 0x00000000]),
    FOLLOW_starexp_in_functionEval69: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_FUNCTION_in_functionEval78: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_NAME_in_functionEval82: new org.antlr.runtime.BitSet([0x00000108, 0x00000000]),
    FOLLOW_functionEval_in_functionEval84: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp99: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category0_in_starexp101: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp109: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category1_in_starexp113: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp123: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category2_in_starexp127: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp137: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category3_in_starexp141: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp151: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category4_in_starexp155: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXPRESSION_in_starexp165: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category5_in_starexp169: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT5_in_category5195: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category4_in_category5199: new org.antlr.runtime.BitSet([0x00002008, 0x00000000]),
    FOLLOW_category4_in_category5204: new org.antlr.runtime.BitSet([0x00002008, 0x00000000]),
    FOLLOW_category4_in_category5208: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT4_in_category4236: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category3_in_category4240: new org.antlr.runtime.BitSet([0x00001008, 0x00000000]),
    FOLLOW_category3_in_category4245: new org.antlr.runtime.BitSet([0x00001008, 0x00000000]),
    FOLLOW_category3_in_category4249: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT3_in_category3278: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category2_in_category3282: new org.antlr.runtime.BitSet([0x00000808, 0x00000000]),
    FOLLOW_category2_in_category3287: new org.antlr.runtime.BitSet([0x00000808, 0x00000000]),
    FOLLOW_category2_in_category3291: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT2_in_category2320: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category1_in_category2324: new org.antlr.runtime.BitSet([0x00000408, 0x00000000]),
    FOLLOW_category1_in_category2329: new org.antlr.runtime.BitSet([0x00000408, 0x00000000]),
    FOLLOW_category1_in_category2333: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT1_in_category1362: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_category0_in_category1366: new org.antlr.runtime.BitSet([0x00000208, 0x00000000]),
    FOLLOW_category0_in_category1371: new org.antlr.runtime.BitSet([0x00000208, 0x00000000]),
    FOLLOW_category0_in_category1375: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT1_in_category1387: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_EVENT_in_category1389: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CAT0_in_category0406: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_PRIMITIVE_in_category0408: new org.antlr.runtime.BitSet([0x00000008, 0x00000000])
});

})();