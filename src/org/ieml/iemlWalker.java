// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/iemlWalker.g 2009-03-09 20:16:48

	package org.ieml;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class iemlWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STAR", "WS", "PRIMITIVE", "EVENT", "L0LM", "L1LM", "L2LM", "L3LM", "L4LM", "L5LM", "LPAREN", "RPAREN", "POR", "PRINT", "XML", "EXPR", "CAT0", "CAT1", "CAT2", "CAT3", "CAT4", "CAT5"
    };
    public static final int L5LM=13;
    public static final int CAT3=23;
    public static final int EXPR=19;
    public static final int PRIMITIVE=6;
    public static final int WS=5;
    public static final int CAT4=24;
    public static final int CAT5=25;
    public static final int L4LM=12;
    public static final int CAT2=22;
    public static final int XML=18;
    public static final int L0LM=8;
    public static final int PRINT=17;
    public static final int CAT0=20;
    public static final int EOF=-1;
    public static final int POR=16;
    public static final int RPAREN=15;
    public static final int LPAREN=14;
    public static final int CAT1=21;
    public static final int L2LM=10;
    public static final int STAR=4;
    public static final int L3LM=11;
    public static final int EVENT=7;
    public static final int L1LM=9;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "statement", "print", "script"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public iemlWalker(TreeNodeStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public iemlWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, input.getTreeAdaptor());
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public iemlWalker(TreeNodeStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return iemlWalker.tokenNames; }
    public String getGrammarFileName() { return "/eclipse/workspace/imelpreter/src/iemlWalker.g"; }


    	public void hello(Object o) {
    		System.out.println("hello world: " + o);
    	}



    // $ANTLR start "script"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:18:1: script : ( statement )* ;
    public final void script() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "script");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:18:7: ( ( statement )* )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:18:9: ( statement )*
            {
            dbg.location(18,9);
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:18:9: ( statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==PRINT) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /eclipse/workspace/imelpreter/src/iemlWalker.g:18:9: statement
            	    {
            	    dbg.location(18,9);
            	    pushFollow(FOLLOW_statement_in_script44);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(18, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "script");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "script"


    // $ANTLR start "statement"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:20:1: statement : print ;
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:20:10: ( print )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:20:12: print
            {
            dbg.location(20,12);
            pushFollow(FOLLOW_print_in_statement52);
            print();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(20, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "print"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:22:1: print : ^( PRINT se= EXPR ) ;
    public final void print() throws RecognitionException {
        CommonTree se=null;

        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:22:7: ( ^( PRINT se= EXPR ) )
            dbg.enterAlt(1);

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:22:9: ^( PRINT se= EXPR )
            {
            dbg.location(22,9);
            dbg.location(22,11);
            match(input,PRINT,FOLLOW_PRINT_in_print61); 

            match(input, Token.DOWN, null); 
            dbg.location(22,19);
            se=(CommonTree)match(input,EXPR,FOLLOW_EXPR_in_print65); 

            match(input, Token.UP, null); 
            dbg.location(22,26);

            	hello(se);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(24, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "print"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_script44 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_print_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_print65 = new BitSet(new long[]{0x0000000000000008L});

}