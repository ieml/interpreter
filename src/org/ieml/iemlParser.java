// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/ieml.g 2009-03-18 11:50:15

package org.ieml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class iemlParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPRESSION", "SCRIPT", "PRINTSTAT", "XMLSTAT", "FUNCTION", "CAT0", "CAT1", "CAT2", "CAT3", "CAT4", "CAT5", "PRIM", "NAME", "LPAREN", "RPAREN", "STAR", "PRIMITIVE", "L0LM", "EVENT", "L1LM", "L2LM", "L3LM", "L4LM", "L5LM", "POR", "WS", "LETTER", "DIGIT", "LOWER", "UPPER"
    };
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
    public static final int UPPER=33;
    public static final int CAT0=9;
    public static final int EOF=-1;
    public static final int POR=28;
    public static final int RPAREN=18;
    public static final int SCRIPT=5;
    public static final int CAT1=10;
    public static final int LPAREN=17;
    public static final int L2LM=24;
    public static final int DIGIT=31;
    public static final int L3LM=25;
    public static final int STAR=19;
    public static final int EVENT=22;
    public static final int NAME=16;
    public static final int L1LM=23;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "cat2", "cat1", "cat5", "cat4", "starexpr", "pop", 
        "cat0", "expr", "functionEval", "cat3", "script"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public iemlParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public iemlParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public iemlParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return iemlParser.tokenNames; }
    public String getGrammarFileName() { return "/eclipse/workspace/imelpreter/src/ieml.g"; }




    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /eclipse/workspace/imelpreter/src/ieml.g:26:1: script : functionEval EOF ;
    public final iemlParser.script_return script() throws RecognitionException {
        iemlParser.script_return retval = new iemlParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        iemlParser.functionEval_return functionEval1 = null;


        CommonTree EOF2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "script");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:26:8: ( functionEval EOF )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:26:10: functionEval EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(26,10);
            pushFollow(FOLLOW_functionEval_in_script91);
            functionEval1=functionEval();

            state._fsp--;

            adaptor.addChild(root_0, functionEval1.getTree());
            dbg.location(26,23);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script93); 
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(26, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "script");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "script"

    public static class functionEval_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionEval"
    // /eclipse/workspace/imelpreter/src/ieml.g:28:1: functionEval : fn= NAME LPAREN (exp= starexpr | otherfn= functionEval ) RPAREN -> ^( FUNCTION $fn ( $exp)? ( $otherfn)? ) ;
    public final iemlParser.functionEval_return functionEval() throws RecognitionException {
        iemlParser.functionEval_return retval = new iemlParser.functionEval_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fn=null;
        Token LPAREN3=null;
        Token RPAREN4=null;
        iemlParser.starexpr_return exp = null;

        iemlParser.functionEval_return otherfn = null;


        CommonTree fn_tree=null;
        CommonTree LPAREN3_tree=null;
        CommonTree RPAREN4_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleSubtreeStream stream_starexpr=new RewriteRuleSubtreeStream(adaptor,"rule starexpr");
        RewriteRuleSubtreeStream stream_functionEval=new RewriteRuleSubtreeStream(adaptor,"rule functionEval");
        try { dbg.enterRule(getGrammarFileName(), "functionEval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:29:3: (fn= NAME LPAREN (exp= starexpr | otherfn= functionEval ) RPAREN -> ^( FUNCTION $fn ( $exp)? ( $otherfn)? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:29:5: fn= NAME LPAREN (exp= starexpr | otherfn= functionEval ) RPAREN
            {
            dbg.location(29,7);
            fn=(Token)match(input,NAME,FOLLOW_NAME_in_functionEval105);  
            stream_NAME.add(fn);

            dbg.location(29,13);
            LPAREN3=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionEval107);  
            stream_LPAREN.add(LPAREN3);

            dbg.location(29,20);
            // /eclipse/workspace/imelpreter/src/ieml.g:29:20: (exp= starexpr | otherfn= functionEval )
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==STAR) ) {
                alt1=1;
            }
            else if ( (LA1_0==NAME) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:29:21: exp= starexpr
                    {
                    dbg.location(29,24);
                    pushFollow(FOLLOW_starexpr_in_functionEval112);
                    exp=starexpr();

                    state._fsp--;

                    stream_starexpr.add(exp.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /eclipse/workspace/imelpreter/src/ieml.g:29:36: otherfn= functionEval
                    {
                    dbg.location(29,43);
                    pushFollow(FOLLOW_functionEval_in_functionEval118);
                    otherfn=functionEval();

                    state._fsp--;

                    stream_functionEval.add(otherfn.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(29,58);
            RPAREN4=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionEval121);  
            stream_RPAREN.add(RPAREN4);



            // AST REWRITE
            // elements: otherfn, fn, exp
            // token labels: fn
            // rule labels: exp, otherfn, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fn=new RewriteRuleTokenStream(adaptor,"token fn",fn);
            RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.tree:null);
            RewriteRuleSubtreeStream stream_otherfn=new RewriteRuleSubtreeStream(adaptor,"rule otherfn",otherfn!=null?otherfn.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:65: -> ^( FUNCTION $fn ( $exp)? ( $otherfn)? )
            {
                dbg.location(29,68);
                // /eclipse/workspace/imelpreter/src/ieml.g:29:68: ^( FUNCTION $fn ( $exp)? ( $otherfn)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(29,70);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                dbg.location(29,79);
                adaptor.addChild(root_1, stream_fn.nextNode());
                dbg.location(29,83);
                // /eclipse/workspace/imelpreter/src/ieml.g:29:83: ( $exp)?
                if ( stream_exp.hasNext() ) {
                    dbg.location(29,83);
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();
                dbg.location(29,89);
                // /eclipse/workspace/imelpreter/src/ieml.g:29:89: ( $otherfn)?
                if ( stream_otherfn.hasNext() ) {
                    dbg.location(29,89);
                    adaptor.addChild(root_1, stream_otherfn.nextTree());

                }
                stream_otherfn.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 99);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionEval");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionEval"

    public static class starexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "starexpr"
    // /eclipse/workspace/imelpreter/src/ieml.g:31:1: starexpr : STAR category= expr STAR STAR -> ^( EXPRESSION $category) ;
    public final iemlParser.starexpr_return starexpr() throws RecognitionException {
        iemlParser.starexpr_return retval = new iemlParser.starexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STAR5=null;
        Token STAR6=null;
        Token STAR7=null;
        iemlParser.expr_return category = null;


        CommonTree STAR5_tree=null;
        CommonTree STAR6_tree=null;
        CommonTree STAR7_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "starexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:31:9: ( STAR category= expr STAR STAR -> ^( EXPRESSION $category) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:31:11: STAR category= expr STAR STAR
            {
            dbg.location(31,11);
            STAR5=(Token)match(input,STAR,FOLLOW_STAR_in_starexpr145);  
            stream_STAR.add(STAR5);

            dbg.location(31,24);
            pushFollow(FOLLOW_expr_in_starexpr149);
            category=expr();

            state._fsp--;

            stream_expr.add(category.getTree());
            dbg.location(31,30);
            STAR6=(Token)match(input,STAR,FOLLOW_STAR_in_starexpr151);  
            stream_STAR.add(STAR6);

            dbg.location(31,35);
            STAR7=(Token)match(input,STAR,FOLLOW_STAR_in_starexpr153);  
            stream_STAR.add(STAR7);



            // AST REWRITE
            // elements: category
            // token labels: 
            // rule labels: category, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category",category!=null?category.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:40: -> ^( EXPRESSION $category)
            {
                dbg.location(31,43);
                // /eclipse/workspace/imelpreter/src/ieml.g:31:43: ^( EXPRESSION $category)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(31,45);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                dbg.location(31,56);
                adaptor.addChild(root_1, stream_category.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "starexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "starexpr"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /eclipse/workspace/imelpreter/src/ieml.g:33:1: expr : ( cat0 | cat1 | cat2 | cat3 | cat4 | cat5 );
    public final iemlParser.expr_return expr() throws RecognitionException {
        iemlParser.expr_return retval = new iemlParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        iemlParser.cat0_return cat08 = null;

        iemlParser.cat1_return cat19 = null;

        iemlParser.cat2_return cat210 = null;

        iemlParser.cat3_return cat311 = null;

        iemlParser.cat4_return cat412 = null;

        iemlParser.cat5_return cat513 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:33:6: ( cat0 | cat1 | cat2 | cat3 | cat4 | cat5 )
            int alt2=6;
            try { dbg.enterDecision(2);

            try {
                isCyclicDecision = true;
                alt2 = dfa2.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:8: cat0
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,8);
                    pushFollow(FOLLOW_cat0_in_expr170);
                    cat08=cat0();

                    state._fsp--;

                    adaptor.addChild(root_0, cat08.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:15: cat1
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,15);
                    pushFollow(FOLLOW_cat1_in_expr174);
                    cat19=cat1();

                    state._fsp--;

                    adaptor.addChild(root_0, cat19.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:22: cat2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,22);
                    pushFollow(FOLLOW_cat2_in_expr178);
                    cat210=cat2();

                    state._fsp--;

                    adaptor.addChild(root_0, cat210.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:29: cat3
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,29);
                    pushFollow(FOLLOW_cat3_in_expr182);
                    cat311=cat3();

                    state._fsp--;

                    adaptor.addChild(root_0, cat311.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:36: cat4
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,36);
                    pushFollow(FOLLOW_cat4_in_expr186);
                    cat412=cat4();

                    state._fsp--;

                    adaptor.addChild(root_0, cat412.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /eclipse/workspace/imelpreter/src/ieml.g:33:43: cat5
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(33,43);
                    pushFollow(FOLLOW_cat5_in_expr190);
                    cat513=cat5();

                    state._fsp--;

                    adaptor.addChild(root_0, cat513.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(33, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class cat0_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat0"
    // /eclipse/workspace/imelpreter/src/ieml.g:35:1: cat0 : PRIMITIVE L0LM -> ^( CAT0 PRIMITIVE ) ;
    public final iemlParser.cat0_return cat0() throws RecognitionException {
        iemlParser.cat0_return retval = new iemlParser.cat0_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRIMITIVE14=null;
        Token L0LM15=null;

        CommonTree PRIMITIVE14_tree=null;
        CommonTree L0LM15_tree=null;
        RewriteRuleTokenStream stream_PRIMITIVE=new RewriteRuleTokenStream(adaptor,"token PRIMITIVE");
        RewriteRuleTokenStream stream_L0LM=new RewriteRuleTokenStream(adaptor,"token L0LM");

        try { dbg.enterRule(getGrammarFileName(), "cat0");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:35:6: ( PRIMITIVE L0LM -> ^( CAT0 PRIMITIVE ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:35:8: PRIMITIVE L0LM
            {
            dbg.location(35,8);
            PRIMITIVE14=(Token)match(input,PRIMITIVE,FOLLOW_PRIMITIVE_in_cat0198);  
            stream_PRIMITIVE.add(PRIMITIVE14);

            dbg.location(35,18);
            L0LM15=(Token)match(input,L0LM,FOLLOW_L0LM_in_cat0200);  
            stream_L0LM.add(L0LM15);



            // AST REWRITE
            // elements: PRIMITIVE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 35:23: -> ^( CAT0 PRIMITIVE )
            {
                dbg.location(35,26);
                // /eclipse/workspace/imelpreter/src/ieml.g:35:26: ^( CAT0 PRIMITIVE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(35,28);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT0, "CAT0"), root_1);

                dbg.location(35,33);
                adaptor.addChild(root_1, stream_PRIMITIVE.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(35, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat0");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat0"

    public static class cat1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat1"
    // /eclipse/workspace/imelpreter/src/ieml.g:36:1: cat1 : ( (first= cat0 (second= cat0 (third= cat0 )? )? ) | EVENT ) L1LM -> ^( CAT1 ( $first)? ( $second)? ( $third)? ( EVENT )? ) ;
    public final iemlParser.cat1_return cat1() throws RecognitionException {
        iemlParser.cat1_return retval = new iemlParser.cat1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EVENT16=null;
        Token L1LM17=null;
        iemlParser.cat0_return first = null;

        iemlParser.cat0_return second = null;

        iemlParser.cat0_return third = null;


        CommonTree EVENT16_tree=null;
        CommonTree L1LM17_tree=null;
        RewriteRuleTokenStream stream_EVENT=new RewriteRuleTokenStream(adaptor,"token EVENT");
        RewriteRuleTokenStream stream_L1LM=new RewriteRuleTokenStream(adaptor,"token L1LM");
        RewriteRuleSubtreeStream stream_cat0=new RewriteRuleSubtreeStream(adaptor,"rule cat0");
        try { dbg.enterRule(getGrammarFileName(), "cat1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:36:6: ( ( (first= cat0 (second= cat0 (third= cat0 )? )? ) | EVENT ) L1LM -> ^( CAT1 ( $first)? ( $second)? ( $third)? ( EVENT )? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:36:8: ( (first= cat0 (second= cat0 (third= cat0 )? )? ) | EVENT ) L1LM
            {
            dbg.location(36,8);
            // /eclipse/workspace/imelpreter/src/ieml.g:36:8: ( (first= cat0 (second= cat0 (third= cat0 )? )? ) | EVENT )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==PRIMITIVE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EVENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:36:9: (first= cat0 (second= cat0 (third= cat0 )? )? )
                    {
                    dbg.location(36,9);
                    // /eclipse/workspace/imelpreter/src/ieml.g:36:9: (first= cat0 (second= cat0 (third= cat0 )? )? )
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:36:10: first= cat0 (second= cat0 (third= cat0 )? )?
                    {
                    dbg.location(36,15);
                    pushFollow(FOLLOW_cat0_in_cat1219);
                    first=cat0();

                    state._fsp--;

                    stream_cat0.add(first.getTree());
                    dbg.location(36,21);
                    // /eclipse/workspace/imelpreter/src/ieml.g:36:21: (second= cat0 (third= cat0 )? )?
                    int alt4=2;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4);

                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PRIMITIVE) ) {
                        alt4=1;
                    }
                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /eclipse/workspace/imelpreter/src/ieml.g:36:22: second= cat0 (third= cat0 )?
                            {
                            dbg.location(36,28);
                            pushFollow(FOLLOW_cat0_in_cat1224);
                            second=cat0();

                            state._fsp--;

                            stream_cat0.add(second.getTree());
                            dbg.location(36,39);
                            // /eclipse/workspace/imelpreter/src/ieml.g:36:39: (third= cat0 )?
                            int alt3=2;
                            try { dbg.enterSubRule(3);
                            try { dbg.enterDecision(3);

                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==PRIMITIVE) ) {
                                alt3=1;
                            }
                            } finally {dbg.exitDecision(3);}

                            switch (alt3) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /eclipse/workspace/imelpreter/src/ieml.g:36:39: third= cat0
                                    {
                                    dbg.location(36,39);
                                    pushFollow(FOLLOW_cat0_in_cat1228);
                                    third=cat0();

                                    state._fsp--;

                                    stream_cat0.add(third.getTree());

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(3);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}


                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /eclipse/workspace/imelpreter/src/ieml.g:36:51: EVENT
                    {
                    dbg.location(36,51);
                    EVENT16=(Token)match(input,EVENT,FOLLOW_EVENT_in_cat1236);  
                    stream_EVENT.add(EVENT16);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(36,58);
            L1LM17=(Token)match(input,L1LM,FOLLOW_L1LM_in_cat1239);  
            stream_L1LM.add(L1LM17);



            // AST REWRITE
            // elements: second, first, EVENT, third
            // token labels: 
            // rule labels: first, retval, third, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_third=new RewriteRuleSubtreeStream(adaptor,"rule third",third!=null?third.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:63: -> ^( CAT1 ( $first)? ( $second)? ( $third)? ( EVENT )? )
            {
                dbg.location(36,66);
                // /eclipse/workspace/imelpreter/src/ieml.g:36:66: ^( CAT1 ( $first)? ( $second)? ( $third)? ( EVENT )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(36,68);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT1, "CAT1"), root_1);

                dbg.location(36,73);
                // /eclipse/workspace/imelpreter/src/ieml.g:36:73: ( $first)?
                if ( stream_first.hasNext() ) {
                    dbg.location(36,73);
                    adaptor.addChild(root_1, stream_first.nextTree());

                }
                stream_first.reset();
                dbg.location(36,81);
                // /eclipse/workspace/imelpreter/src/ieml.g:36:81: ( $second)?
                if ( stream_second.hasNext() ) {
                    dbg.location(36,81);
                    adaptor.addChild(root_1, stream_second.nextTree());

                }
                stream_second.reset();
                dbg.location(36,90);
                // /eclipse/workspace/imelpreter/src/ieml.g:36:90: ( $third)?
                if ( stream_third.hasNext() ) {
                    dbg.location(36,90);
                    adaptor.addChild(root_1, stream_third.nextTree());

                }
                stream_third.reset();
                dbg.location(36,98);
                // /eclipse/workspace/imelpreter/src/ieml.g:36:98: ( EVENT )?
                if ( stream_EVENT.hasNext() ) {
                    dbg.location(36,98);
                    adaptor.addChild(root_1, stream_EVENT.nextNode());

                }
                stream_EVENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(36, 105);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat1"

    public static class cat2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat2"
    // /eclipse/workspace/imelpreter/src/ieml.g:37:1: cat2 : first= cat1 (second= cat1 (third= cat1 )? )? L2LM -> ^( CAT2 $first ( $second)? ( $third)? ) ;
    public final iemlParser.cat2_return cat2() throws RecognitionException {
        iemlParser.cat2_return retval = new iemlParser.cat2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L2LM18=null;
        iemlParser.cat1_return first = null;

        iemlParser.cat1_return second = null;

        iemlParser.cat1_return third = null;


        CommonTree L2LM18_tree=null;
        RewriteRuleTokenStream stream_L2LM=new RewriteRuleTokenStream(adaptor,"token L2LM");
        RewriteRuleSubtreeStream stream_cat1=new RewriteRuleSubtreeStream(adaptor,"rule cat1");
        try { dbg.enterRule(getGrammarFileName(), "cat2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:37:6: (first= cat1 (second= cat1 (third= cat1 )? )? L2LM -> ^( CAT2 $first ( $second)? ( $third)? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:37:8: first= cat1 (second= cat1 (third= cat1 )? )? L2LM
            {
            dbg.location(37,13);
            pushFollow(FOLLOW_cat1_in_cat2269);
            first=cat1();

            state._fsp--;

            stream_cat1.add(first.getTree());
            dbg.location(37,19);
            // /eclipse/workspace/imelpreter/src/ieml.g:37:19: (second= cat1 (third= cat1 )? )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==PRIMITIVE||LA7_0==EVENT) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:37:20: second= cat1 (third= cat1 )?
                    {
                    dbg.location(37,26);
                    pushFollow(FOLLOW_cat1_in_cat2274);
                    second=cat1();

                    state._fsp--;

                    stream_cat1.add(second.getTree());
                    dbg.location(37,37);
                    // /eclipse/workspace/imelpreter/src/ieml.g:37:37: (third= cat1 )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==PRIMITIVE||LA6_0==EVENT) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /eclipse/workspace/imelpreter/src/ieml.g:37:37: third= cat1
                            {
                            dbg.location(37,37);
                            pushFollow(FOLLOW_cat1_in_cat2278);
                            third=cat1();

                            state._fsp--;

                            stream_cat1.add(third.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(37,46);
            L2LM18=(Token)match(input,L2LM,FOLLOW_L2LM_in_cat2283);  
            stream_L2LM.add(L2LM18);



            // AST REWRITE
            // elements: second, third, first
            // token labels: 
            // rule labels: first, retval, third, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_third=new RewriteRuleSubtreeStream(adaptor,"rule third",third!=null?third.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:51: -> ^( CAT2 $first ( $second)? ( $third)? )
            {
                dbg.location(37,54);
                // /eclipse/workspace/imelpreter/src/ieml.g:37:54: ^( CAT2 $first ( $second)? ( $third)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(37,56);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT2, "CAT2"), root_1);

                dbg.location(37,61);
                adaptor.addChild(root_1, stream_first.nextTree());
                dbg.location(37,68);
                // /eclipse/workspace/imelpreter/src/ieml.g:37:68: ( $second)?
                if ( stream_second.hasNext() ) {
                    dbg.location(37,68);
                    adaptor.addChild(root_1, stream_second.nextTree());

                }
                stream_second.reset();
                dbg.location(37,77);
                // /eclipse/workspace/imelpreter/src/ieml.g:37:77: ( $third)?
                if ( stream_third.hasNext() ) {
                    dbg.location(37,77);
                    adaptor.addChild(root_1, stream_third.nextTree());

                }
                stream_third.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat2"

    public static class cat3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat3"
    // /eclipse/workspace/imelpreter/src/ieml.g:38:1: cat3 : first= cat2 (second= cat2 (third= cat2 )? )? L3LM -> ^( CAT3 $first ( $second)? ( $third)? ) ;
    public final iemlParser.cat3_return cat3() throws RecognitionException {
        iemlParser.cat3_return retval = new iemlParser.cat3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L3LM19=null;
        iemlParser.cat2_return first = null;

        iemlParser.cat2_return second = null;

        iemlParser.cat2_return third = null;


        CommonTree L3LM19_tree=null;
        RewriteRuleTokenStream stream_L3LM=new RewriteRuleTokenStream(adaptor,"token L3LM");
        RewriteRuleSubtreeStream stream_cat2=new RewriteRuleSubtreeStream(adaptor,"rule cat2");
        try { dbg.enterRule(getGrammarFileName(), "cat3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:38:6: (first= cat2 (second= cat2 (third= cat2 )? )? L3LM -> ^( CAT3 $first ( $second)? ( $third)? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:38:8: first= cat2 (second= cat2 (third= cat2 )? )? L3LM
            {
            dbg.location(38,13);
            pushFollow(FOLLOW_cat2_in_cat3309);
            first=cat2();

            state._fsp--;

            stream_cat2.add(first.getTree());
            dbg.location(38,19);
            // /eclipse/workspace/imelpreter/src/ieml.g:38:19: (second= cat2 (third= cat2 )? )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==PRIMITIVE||LA9_0==EVENT) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:38:20: second= cat2 (third= cat2 )?
                    {
                    dbg.location(38,26);
                    pushFollow(FOLLOW_cat2_in_cat3314);
                    second=cat2();

                    state._fsp--;

                    stream_cat2.add(second.getTree());
                    dbg.location(38,37);
                    // /eclipse/workspace/imelpreter/src/ieml.g:38:37: (third= cat2 )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==PRIMITIVE||LA8_0==EVENT) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /eclipse/workspace/imelpreter/src/ieml.g:38:37: third= cat2
                            {
                            dbg.location(38,37);
                            pushFollow(FOLLOW_cat2_in_cat3318);
                            third=cat2();

                            state._fsp--;

                            stream_cat2.add(third.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(38,46);
            L3LM19=(Token)match(input,L3LM,FOLLOW_L3LM_in_cat3323);  
            stream_L3LM.add(L3LM19);



            // AST REWRITE
            // elements: first, second, third
            // token labels: 
            // rule labels: first, retval, third, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_third=new RewriteRuleSubtreeStream(adaptor,"rule third",third!=null?third.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:51: -> ^( CAT3 $first ( $second)? ( $third)? )
            {
                dbg.location(38,54);
                // /eclipse/workspace/imelpreter/src/ieml.g:38:54: ^( CAT3 $first ( $second)? ( $third)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(38,56);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT3, "CAT3"), root_1);

                dbg.location(38,61);
                adaptor.addChild(root_1, stream_first.nextTree());
                dbg.location(38,68);
                // /eclipse/workspace/imelpreter/src/ieml.g:38:68: ( $second)?
                if ( stream_second.hasNext() ) {
                    dbg.location(38,68);
                    adaptor.addChild(root_1, stream_second.nextTree());

                }
                stream_second.reset();
                dbg.location(38,77);
                // /eclipse/workspace/imelpreter/src/ieml.g:38:77: ( $third)?
                if ( stream_third.hasNext() ) {
                    dbg.location(38,77);
                    adaptor.addChild(root_1, stream_third.nextTree());

                }
                stream_third.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat3"

    public static class cat4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat4"
    // /eclipse/workspace/imelpreter/src/ieml.g:39:1: cat4 : first= cat3 (second= cat3 (third= cat3 )? )? L4LM -> ^( CAT4 $first ( $second)? ( $third)? ) ;
    public final iemlParser.cat4_return cat4() throws RecognitionException {
        iemlParser.cat4_return retval = new iemlParser.cat4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L4LM20=null;
        iemlParser.cat3_return first = null;

        iemlParser.cat3_return second = null;

        iemlParser.cat3_return third = null;


        CommonTree L4LM20_tree=null;
        RewriteRuleTokenStream stream_L4LM=new RewriteRuleTokenStream(adaptor,"token L4LM");
        RewriteRuleSubtreeStream stream_cat3=new RewriteRuleSubtreeStream(adaptor,"rule cat3");
        try { dbg.enterRule(getGrammarFileName(), "cat4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:39:6: (first= cat3 (second= cat3 (third= cat3 )? )? L4LM -> ^( CAT4 $first ( $second)? ( $third)? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:39:8: first= cat3 (second= cat3 (third= cat3 )? )? L4LM
            {
            dbg.location(39,13);
            pushFollow(FOLLOW_cat3_in_cat4349);
            first=cat3();

            state._fsp--;

            stream_cat3.add(first.getTree());
            dbg.location(39,19);
            // /eclipse/workspace/imelpreter/src/ieml.g:39:19: (second= cat3 (third= cat3 )? )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==PRIMITIVE||LA11_0==EVENT) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:39:20: second= cat3 (third= cat3 )?
                    {
                    dbg.location(39,26);
                    pushFollow(FOLLOW_cat3_in_cat4354);
                    second=cat3();

                    state._fsp--;

                    stream_cat3.add(second.getTree());
                    dbg.location(39,37);
                    // /eclipse/workspace/imelpreter/src/ieml.g:39:37: (third= cat3 )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==PRIMITIVE||LA10_0==EVENT) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /eclipse/workspace/imelpreter/src/ieml.g:39:37: third= cat3
                            {
                            dbg.location(39,37);
                            pushFollow(FOLLOW_cat3_in_cat4358);
                            third=cat3();

                            state._fsp--;

                            stream_cat3.add(third.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(39,46);
            L4LM20=(Token)match(input,L4LM,FOLLOW_L4LM_in_cat4363);  
            stream_L4LM.add(L4LM20);



            // AST REWRITE
            // elements: second, third, first
            // token labels: 
            // rule labels: first, retval, third, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_third=new RewriteRuleSubtreeStream(adaptor,"rule third",third!=null?third.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:51: -> ^( CAT4 $first ( $second)? ( $third)? )
            {
                dbg.location(39,54);
                // /eclipse/workspace/imelpreter/src/ieml.g:39:54: ^( CAT4 $first ( $second)? ( $third)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(39,56);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT4, "CAT4"), root_1);

                dbg.location(39,61);
                adaptor.addChild(root_1, stream_first.nextTree());
                dbg.location(39,68);
                // /eclipse/workspace/imelpreter/src/ieml.g:39:68: ( $second)?
                if ( stream_second.hasNext() ) {
                    dbg.location(39,68);
                    adaptor.addChild(root_1, stream_second.nextTree());

                }
                stream_second.reset();
                dbg.location(39,77);
                // /eclipse/workspace/imelpreter/src/ieml.g:39:77: ( $third)?
                if ( stream_third.hasNext() ) {
                    dbg.location(39,77);
                    adaptor.addChild(root_1, stream_third.nextTree());

                }
                stream_third.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat4"

    public static class cat5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cat5"
    // /eclipse/workspace/imelpreter/src/ieml.g:40:1: cat5 : first= cat4 (second= cat4 (third= cat4 )? )? L5LM -> ^( CAT5 $first ( $second)? ( $third)? ) ;
    public final iemlParser.cat5_return cat5() throws RecognitionException {
        iemlParser.cat5_return retval = new iemlParser.cat5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L5LM21=null;
        iemlParser.cat4_return first = null;

        iemlParser.cat4_return second = null;

        iemlParser.cat4_return third = null;


        CommonTree L5LM21_tree=null;
        RewriteRuleTokenStream stream_L5LM=new RewriteRuleTokenStream(adaptor,"token L5LM");
        RewriteRuleSubtreeStream stream_cat4=new RewriteRuleSubtreeStream(adaptor,"rule cat4");
        try { dbg.enterRule(getGrammarFileName(), "cat5");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:40:6: (first= cat4 (second= cat4 (third= cat4 )? )? L5LM -> ^( CAT5 $first ( $second)? ( $third)? ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:40:8: first= cat4 (second= cat4 (third= cat4 )? )? L5LM
            {
            dbg.location(40,13);
            pushFollow(FOLLOW_cat4_in_cat5389);
            first=cat4();

            state._fsp--;

            stream_cat4.add(first.getTree());
            dbg.location(40,19);
            // /eclipse/workspace/imelpreter/src/ieml.g:40:19: (second= cat4 (third= cat4 )? )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==PRIMITIVE||LA13_0==EVENT) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /eclipse/workspace/imelpreter/src/ieml.g:40:20: second= cat4 (third= cat4 )?
                    {
                    dbg.location(40,26);
                    pushFollow(FOLLOW_cat4_in_cat5394);
                    second=cat4();

                    state._fsp--;

                    stream_cat4.add(second.getTree());
                    dbg.location(40,37);
                    // /eclipse/workspace/imelpreter/src/ieml.g:40:37: (third= cat4 )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==PRIMITIVE||LA12_0==EVENT) ) {
                        alt12=1;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /eclipse/workspace/imelpreter/src/ieml.g:40:37: third= cat4
                            {
                            dbg.location(40,37);
                            pushFollow(FOLLOW_cat4_in_cat5398);
                            third=cat4();

                            state._fsp--;

                            stream_cat4.add(third.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(40,46);
            L5LM21=(Token)match(input,L5LM,FOLLOW_L5LM_in_cat5403);  
            stream_L5LM.add(L5LM21);



            // AST REWRITE
            // elements: third, second, first
            // token labels: 
            // rule labels: first, retval, third, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_third=new RewriteRuleSubtreeStream(adaptor,"rule third",third!=null?third.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:51: -> ^( CAT5 $first ( $second)? ( $third)? )
            {
                dbg.location(40,54);
                // /eclipse/workspace/imelpreter/src/ieml.g:40:54: ^( CAT5 $first ( $second)? ( $third)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(40,56);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAT5, "CAT5"), root_1);

                dbg.location(40,61);
                adaptor.addChild(root_1, stream_first.nextTree());
                dbg.location(40,68);
                // /eclipse/workspace/imelpreter/src/ieml.g:40:68: ( $second)?
                if ( stream_second.hasNext() ) {
                    dbg.location(40,68);
                    adaptor.addChild(root_1, stream_second.nextTree());

                }
                stream_second.reset();
                dbg.location(40,77);
                // /eclipse/workspace/imelpreter/src/ieml.g:40:77: ( $third)?
                if ( stream_third.hasNext() ) {
                    dbg.location(40,77);
                    adaptor.addChild(root_1, stream_third.nextTree());

                }
                stream_third.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cat5");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cat5"

    public static class pop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pop"
    // /eclipse/workspace/imelpreter/src/ieml.g:42:1: pop : POR ;
    public final iemlParser.pop_return pop() throws RecognitionException {
        iemlParser.pop_return retval = new iemlParser.pop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POR22=null;

        CommonTree POR22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /eclipse/workspace/imelpreter/src/ieml.g:42:5: ( POR )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/ieml.g:42:7: POR
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(42,7);
            POR22=(Token)match(input,POR,FOLLOW_POR_in_pop428); 
            POR22_tree = (CommonTree)adaptor.create(POR22);
            adaptor.addChild(root_0, POR22_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pop"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\u00ec\uffff";
    static final String DFA2_eofS =
        "\u00ec\uffff";
    static final String DFA2_minS =
        "\1\24\1\25\1\27\2\23\1\25\1\uffff\1\25\1\27\1\23\1\uffff\3\24\1"+
        "\uffff\1\25\1\27\1\23\3\25\1\27\2\24\1\25\1\27\1\23\1\uffff\1\27"+
        "\2\24\1\30\2\25\1\27\3\24\2\uffff\2\25\3\24\1\25\1\27\2\25\1\27"+
        "\1\24\1\27\1\24\3\25\1\27\5\24\1\25\1\27\1\24\1\25\1\27\2\24\1\30"+
        "\2\25\1\27\1\31\3\25\1\27\2\24\1\25\2\27\2\25\3\24\1\27\2\24\1\30"+
        "\2\25\1\27\3\24\1\27\1\24\3\25\1\27\2\25\3\24\1\25\1\27\2\25\1\27"+
        "\1\24\1\25\1\27\2\24\1\30\1\27\1\24\3\25\1\27\5\24\1\25\1\27\1\32"+
        "\1\27\3\25\1\27\2\24\1\30\2\25\1\27\1\31\3\25\1\27\2\24\1\27\1\24"+
        "\1\27\2\25\3\24\1\27\2\24\1\30\2\25\1\27\1\24\1\25\1\27\1\24\3\25"+
        "\1\27\2\25\3\24\1\25\2\27\1\25\1\27\2\24\1\30\1\27\1\24\3\25\1\27"+
        "\2\24\1\27\3\25\1\27\2\24\1\30\2\25\1\27\1\31\1\27\1\24\1\27\2\25"+
        "\3\24\1\25\1\27\1\24\3\25\2\27\1\25\1\27\2\24\1\30\1\27\2\25\1\27"+
        "\1\24\1\25\1\27";
    static final String DFA2_maxS =
        "\1\26\1\25\2\27\1\30\1\25\1\uffff\1\25\1\27\1\31\1\uffff\2\27\1"+
        "\30\1\uffff\1\25\1\27\1\32\3\25\2\27\1\30\1\25\1\27\1\33\1\uffff"+
        "\3\27\1\30\2\25\1\27\1\31\1\27\1\30\2\uffff\2\25\2\27\1\30\1\25"+
        "\1\27\2\25\1\27\1\31\2\27\3\25\2\27\1\30\2\27\1\30\1\25\1\27\1\32"+
        "\1\25\3\27\1\30\2\25\1\27\1\31\3\25\2\27\1\30\1\25\2\27\2\25\2\27"+
        "\1\30\3\27\1\30\2\25\1\27\1\31\1\27\1\30\2\27\3\25\1\27\2\25\2\27"+
        "\1\30\1\25\1\27\2\25\1\27\1\31\1\25\3\27\1\30\2\27\3\25\2\27\1\30"+
        "\2\27\1\30\1\25\1\27\1\32\1\27\3\25\3\27\1\30\2\25\1\27\1\31\3\25"+
        "\2\27\1\30\3\27\2\25\2\27\1\30\3\27\1\30\2\25\1\27\1\31\1\25\2\27"+
        "\3\25\1\27\2\25\2\27\1\30\1\25\2\27\1\25\3\27\1\30\2\27\3\25\2\27"+
        "\1\30\1\27\3\25\3\27\1\30\2\25\1\27\1\31\3\27\2\25\2\27\1\30\1\25"+
        "\2\27\3\25\2\27\1\25\3\27\1\30\1\27\2\25\2\27\1\25\1\27";
    static final String DFA2_acceptS =
        "\6\uffff\1\1\3\uffff\1\2\3\uffff\1\3\14\uffff\1\4\12\uffff\1\5\1"+
        "\6\u00c4\uffff";
    static final String DFA2_specialS =
        "\u00ec\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\6\1\5\2\uffff\1\4",
            "\1\12\1\7\1\uffff\1\10\1\uffff\1\11",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "\1\16\1\17\1\uffff\1\20\2\uffff\1\21",
            "",
            "\1\22\2\uffff\1\4",
            "\1\23\2\uffff\1\15",
            "\1\24\1\uffff\1\25\1\uffff\1\11",
            "",
            "\1\26",
            "\1\27",
            "\1\33\1\30\1\uffff\1\31\3\uffff\1\32",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40\2\uffff\1\27",
            "\1\41\1\uffff\1\42\1\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46\1\47\1\uffff\1\47\4\uffff\1\47",
            "",
            "\1\4",
            "\1\50\2\uffff\1\15",
            "\1\51\2\uffff\1\37",
            "\1\11",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\1\uffff\1\56\2\uffff\1\21",
            "\1\57\2\uffff\1\45",
            "\1\60\1\uffff\1\61\1\uffff\1\62",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65\2\uffff\1\27",
            "\1\66\2\uffff\1\54",
            "\1\67\1\uffff\1\70\1\uffff\1\43",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\uffff\1\77\2\uffff\1\100",
            "\1\15",
            "\1\101\2\uffff\1\37",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\2\uffff\1\72",
            "\1\107\1\uffff\1\110\1\uffff\1\111",
            "\1\112\2\uffff\1\45",
            "\1\113\2\uffff\1\75",
            "\1\114\1\uffff\1\115\1\uffff\1\62",
            "\1\116",
            "\1\117",
            "\1\120\1\uffff\1\121\3\uffff\1\32",
            "\1\122",
            "\1\27",
            "\1\123\2\uffff\1\54",
            "\1\124\2\uffff\1\105",
            "\1\43",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\21",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\2\uffff\1\117",
            "\1\135\1\uffff\1\136\1\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\37",
            "\1\142",
            "\1\143",
            "\1\144\2\uffff\1\72",
            "\1\145\2\uffff\1\127",
            "\1\146\1\uffff\1\147\1\uffff\1\111",
            "\1\45",
            "\1\150\2\uffff\1\75",
            "\1\151\2\uffff\1\133",
            "\1\62",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\1\uffff\1\156\2\uffff\1\100",
            "\1\157\2\uffff\1\141",
            "\1\160\1\uffff\1\161\1\uffff\1\162",
            "\1\54",
            "\1\163\2\uffff\1\105",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\2\uffff\1\117",
            "\1\173\2\uffff\1\154",
            "\1\174\1\uffff\1\175\1\uffff\1\137",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\1\uffff\1\u0084\2\uffff\1\u0085",
            "\1\u0086",
            "\1\72",
            "\1\u0087\2\uffff\1\127",
            "\1\u0088\2\uffff\1\167",
            "\1\111",
            "\1\75",
            "\1\u0089\2\uffff\1\133",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\2\uffff\1\177",
            "\1\u008f\1\uffff\1\u0090\1\uffff\1\u0091",
            "\1\u0092\2\uffff\1\141",
            "\1\u0093\2\uffff\1\u0082",
            "\1\u0094\1\uffff\1\u0095\1\uffff\1\162",
            "\1\u0096",
            "\1\u0097",
            "\1\32",
            "\1\105",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\117",
            "\1\u009b\2\uffff\1\154",
            "\1\u009c\2\uffff\1\u008d",
            "\1\137",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\100",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\2\uffff\1\u0097",
            "\1\u00a5\1\uffff\1\u00a6\1\uffff\1\u00a7",
            "\1\127",
            "\1\u00a8\2\uffff\1\167",
            "\1\133",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\2\uffff\1\177",
            "\1\u00ac\2\uffff\1\u009f",
            "\1\u00ad\1\uffff\1\u00ae\1\uffff\1\u0091",
            "\1\141",
            "\1\u00af\2\uffff\1\u0082",
            "\1\u00b0\2\uffff\1\u00a3",
            "\1\162",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\1\uffff\1\u00b5\2\uffff\1\u0085",
            "\1\u00b6",
            "\1\154",
            "\1\u00b7\2\uffff\1\u008d",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\2\uffff\1\u0097",
            "\1\u00bf\2\uffff\1\u00b3",
            "\1\u00c0\1\uffff\1\u00c1\1\uffff\1\u00a7",
            "\1\u00c2",
            "\1\u00c3",
            "\1\167",
            "\1\u00c4",
            "\1\177",
            "\1\u00c5\2\uffff\1\u009f",
            "\1\u00c6\2\uffff\1\u00bb",
            "\1\u0091",
            "\1\u0082",
            "\1\u00c7\2\uffff\1\u00a3",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc\2\uffff\1\u00c3",
            "\1\u00cd\1\uffff\1\u00ce\1\uffff\1\u00cf",
            "\1\u008d",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u0097",
            "\1\u00d3\2\uffff\1\u00b3",
            "\1\u00d4\2\uffff\1\u00cb",
            "\1\u00a7",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u0085",
            "\1\u009f",
            "\1\u00d8\2\uffff\1\u00bb",
            "\1\u00a3",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db\2\uffff\1\u00c3",
            "\1\u00dc\2\uffff\1\u00d7",
            "\1\u00dd\1\uffff\1\u00de\1\uffff\1\u00cf",
            "\1\u00df",
            "\1\u00b3",
            "\1\u00e0\2\uffff\1\u00cb",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00bb",
            "\1\u00e5",
            "\1\u00c3",
            "\1\u00e6\2\uffff\1\u00d7",
            "\1\u00e7\2\uffff\1\u00e4",
            "\1\u00cf",
            "\1\u00cb",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00d7",
            "\1\u00ea\2\uffff\1\u00e4",
            "\1\u00eb",
            "\1\u00e4"
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
            return "33:1: expr : ( cat0 | cat1 | cat2 | cat3 | cat4 | cat5 );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_functionEval_in_script91 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_script93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionEval105 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_functionEval107 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_starexpr_in_functionEval112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionEval_in_functionEval118 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_functionEval121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_starexpr145 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_expr_in_starexpr149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STAR_in_starexpr151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STAR_in_starexpr153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat0_in_expr170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat1_in_expr174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat2_in_expr178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat3_in_expr182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat4_in_expr186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat5_in_expr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_in_cat0198 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_L0LM_in_cat0200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat0_in_cat1219 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_cat0_in_cat1224 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_cat0_in_cat1228 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EVENT_in_cat1236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_L1LM_in_cat1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat1_in_cat2269 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_cat1_in_cat2274 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_cat1_in_cat2278 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_L2LM_in_cat2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat2_in_cat3309 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_cat2_in_cat3314 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_cat2_in_cat3318 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_L3LM_in_cat3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat3_in_cat4349 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_cat3_in_cat4354 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_cat3_in_cat4358 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_L4LM_in_cat4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cat4_in_cat5389 = new BitSet(new long[]{0x0000000008500000L});
    public static final BitSet FOLLOW_cat4_in_cat5394 = new BitSet(new long[]{0x0000000008500000L});
    public static final BitSet FOLLOW_cat4_in_cat5398 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_L5LM_in_cat5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POR_in_pop428 = new BitSet(new long[]{0x0000000000000002L});

}