// $ANTLR 3.1.2 /eclipse/workspace/imelpreter/src/iemlWalker.g 2009-03-14 18:31:17

	package org.ieml;
	import java.lang.reflect.*;
	import java.io.*;
	

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class iemlWalker extends TreeParser {
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


        public iemlWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public iemlWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return iemlWalker.tokenNames; }
    public String getGrammarFileName() { return "/eclipse/workspace/imelpreter/src/iemlWalker.g"; }


    	
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
    	



    // $ANTLR start "script"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:34:1: script : ( functionEval )* ;
    public final void script() throws RecognitionException {
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:34:7: ( ( functionEval )* )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:34:9: ( functionEval )*
            {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:34:9: ( functionEval )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCTION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /eclipse/workspace/imelpreter/src/iemlWalker.g:34:9: functionEval
            	    {
            	    pushFollow(FOLLOW_functionEval_in_script44);
            	    functionEval();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "script"


    // $ANTLR start "functionEval"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:36:1: functionEval : ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) );
    public final void functionEval() throws RecognitionException {
        CommonTree fn=null;
        Category cat = null;


        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:37:2: ( ^( FUNCTION fn= NAME cat= starexp ) | ^( FUNCTION fn= NAME functionEval ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNCTION) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==NAME) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==EXPRESSION) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==FUNCTION) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:37:4: ^( FUNCTION fn= NAME cat= starexp )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_functionEval55); 

                    match(input, Token.DOWN, null); 
                    fn=(CommonTree)match(input,NAME,FOLLOW_NAME_in_functionEval59); 
                    pushFollow(FOLLOW_starexp_in_functionEval63);
                    cat=starexp();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		try {
                    			Method method = this.getClass().getDeclaredMethod(fn.toString(), new Class[] {Category.class});
                    			method.invoke(this, new Object[]{cat});
                    		} catch (Exception e) {
                    			ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    			PrintStream ps = new PrintStream(baos);
                    			e.printStackTrace(ps);
                    			System.out.println("Error executing function: " + new String(baos.toByteArray()));
                    		}
                    	  

                    }
                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:48:4: ^( FUNCTION fn= NAME functionEval )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_functionEval72); 

                    match(input, Token.DOWN, null); 
                    fn=(CommonTree)match(input,NAME,FOLLOW_NAME_in_functionEval76); 
                    pushFollow(FOLLOW_functionEval_in_functionEval78);
                    functionEval();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionEval"


    // $ANTLR start "starexp"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:50:1: starexp returns [Category category] : ( ^( EXPRESSION category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) );
    public final Category starexp() throws RecognitionException {
        Category category = null;

        Category cat = null;


        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:50:36: ( ^( EXPRESSION category0 ) | ^( EXPRESSION cat= category1 ) | ^( EXPRESSION cat= category2 ) | ^( EXPRESSION cat= category3 ) | ^( EXPRESSION cat= category4 ) | ^( EXPRESSION cat= category5 ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXPRESSION) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case CAT1:
                        {
                        alt3=2;
                        }
                        break;
                    case CAT2:
                        {
                        alt3=3;
                        }
                        break;
                    case CAT4:
                        {
                        alt3=5;
                        }
                        break;
                    case CAT0:
                        {
                        alt3=1;
                        }
                        break;
                    case CAT5:
                        {
                        alt3=6;
                        }
                        break;
                    case CAT3:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:51:1: ^( EXPRESSION category0 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp93); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category0_in_starexp95);
                    category0();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:52:4: ^( EXPRESSION cat= category1 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp103); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category1_in_starexp107);
                    cat=category1();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     category =cat; 

                    }
                    break;
                case 3 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:53:4: ^( EXPRESSION cat= category2 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp117); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category2_in_starexp121);
                    cat=category2();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     category =cat; 

                    }
                    break;
                case 4 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:54:4: ^( EXPRESSION cat= category3 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp131); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category3_in_starexp135);
                    cat=category3();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     category =cat; 

                    }
                    break;
                case 5 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:55:4: ^( EXPRESSION cat= category4 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp145); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category4_in_starexp149);
                    cat=category4();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     category =cat; 

                    }
                    break;
                case 6 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:56:4: ^( EXPRESSION cat= category5 )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_starexp159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category5_in_starexp163);
                    cat=category5();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     category =cat; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return category;
    }
    // $ANTLR end "starexp"

    protected static class category5_scope {
        Category cat5;
    }
    protected Stack category5_stack = new Stack();


    // $ANTLR start "category5"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:58:1: category5 returns [Category result] : ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) ;
    public final Category category5() throws RecognitionException {
        category5_stack.push(new category5_scope());
        Category result = null;

        Category first = null;

        Category second = null;

        Category third = null;


         ((category5_scope)category5_stack.peek()).cat5 = createCategory(5); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:2: ( ^( CAT5 first= category4 (second= category4 (third= category4 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:4: ^( CAT5 first= category4 (second= category4 (third= category4 )? )? )
            {
            match(input,CAT5,FOLLOW_CAT5_in_category5189); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_category4_in_category5193);
            first=category4();

            state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:27: (second= category4 (third= category4 )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CAT4) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:28: second= category4 (third= category4 )?
                    {
                    pushFollow(FOLLOW_category4_in_category5198);
                    second=category4();

                    state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:50: (third= category4 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==CAT4) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:61:50: third= category4
                            {
                            pushFollow(FOLLOW_category4_in_category5202);
                            third=category4();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            		result = ((category5_scope)category5_stack.peek()).cat5;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            category5_stack.pop();
        }
        return result;
    }
    // $ANTLR end "category5"

    protected static class category4_scope {
        Category cat4;
    }
    protected Stack category4_stack = new Stack();


    // $ANTLR start "category4"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:67:1: category4 returns [Category result] : ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) ;
    public final Category category4() throws RecognitionException {
        category4_stack.push(new category4_scope());
        Category result = null;

        Category first = null;

        Category second = null;

        Category third = null;


         ((category4_scope)category4_stack.peek()).cat4 = createCategory(4); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:2: ( ^( CAT4 first= category3 (second= category3 (third= category3 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:4: ^( CAT4 first= category3 (second= category3 (third= category3 )? )? )
            {
            match(input,CAT4,FOLLOW_CAT4_in_category4230); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_category3_in_category4234);
            first=category3();

            state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:27: (second= category3 (third= category3 )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CAT3) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:28: second= category3 (third= category3 )?
                    {
                    pushFollow(FOLLOW_category3_in_category4239);
                    second=category3();

                    state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:50: (third= category3 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==CAT3) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:70:50: third= category3
                            {
                            pushFollow(FOLLOW_category3_in_category4243);
                            third=category3();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            		result = ((category4_scope)category4_stack.peek()).cat4;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            category4_stack.pop();
        }
        return result;
    }
    // $ANTLR end "category4"

    protected static class category3_scope {
        Category cat3;
    }
    protected Stack category3_stack = new Stack();


    // $ANTLR start "category3"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:76:1: category3 returns [Category result] : ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) ;
    public final Category category3() throws RecognitionException {
        category3_stack.push(new category3_scope());
        Category result = null;

        Category first = null;

        Category second = null;

        Category third = null;


         ((category3_scope)category3_stack.peek()).cat3 = createCategory(3); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:2: ( ^( CAT3 first= category2 (second= category2 (third= category2 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:4: ^( CAT3 first= category2 (second= category2 (third= category2 )? )? )
            {
            match(input,CAT3,FOLLOW_CAT3_in_category3272); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_category2_in_category3276);
            first=category2();

            state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:27: (second= category2 (third= category2 )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CAT2) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:28: second= category2 (third= category2 )?
                    {
                    pushFollow(FOLLOW_category2_in_category3281);
                    second=category2();

                    state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:50: (third= category2 )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CAT2) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:79:50: third= category2
                            {
                            pushFollow(FOLLOW_category2_in_category3285);
                            third=category2();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            		result = ((category3_scope)category3_stack.peek()).cat3;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            category3_stack.pop();
        }
        return result;
    }
    // $ANTLR end "category3"

    protected static class category2_scope {
        Category cat2;
    }
    protected Stack category2_stack = new Stack();


    // $ANTLR start "category2"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:85:1: category2 returns [Category result] : ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) ;
    public final Category category2() throws RecognitionException {
        category2_stack.push(new category2_scope());
        Category result = null;

        Category first = null;

        Category second = null;

        Category third = null;


         ((category2_scope)category2_stack.peek()).cat2 = createCategory(2); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:2: ( ^( CAT2 first= category1 (second= category1 (third= category1 )? )? ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:4: ^( CAT2 first= category1 (second= category1 (third= category1 )? )? )
            {
            match(input,CAT2,FOLLOW_CAT2_in_category2314); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_category1_in_category2318);
            first=category1();

            state._fsp--;

            // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:27: (second= category1 (third= category1 )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CAT1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:28: second= category1 (third= category1 )?
                    {
                    pushFollow(FOLLOW_category1_in_category2323);
                    second=category1();

                    state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:50: (third= category1 )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==CAT1) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:88:50: third= category1
                            {
                            pushFollow(FOLLOW_category1_in_category2327);
                            third=category1();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            		result = ((category2_scope)category2_stack.peek()).cat2;
            		result.setRole1(first);
            		if (second!=null) result.setRole2(second);
            		if (third!=null) result.setRole3(third);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            category2_stack.pop();
        }
        return result;
    }
    // $ANTLR end "category2"

    protected static class category1_scope {
        Category cat1;
    }
    protected Stack category1_stack = new Stack();


    // $ANTLR start "category1"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:94:1: category1 returns [Category result] : ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) );
    public final Category category1() throws RecognitionException {
        category1_stack.push(new category1_scope());
        Category result = null;

        CommonTree EVENT1=null;
        String first = null;

        String second = null;

        String third = null;


         ((category1_scope)category1_stack.peek()).cat1 = createCategory(1); 
        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:2: ( ^( CAT1 first= category0 (second= category0 (third= category0 )? )? ) | ^( CAT1 EVENT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CAT1) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==EVENT) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==CAT0) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:4: ^( CAT1 first= category0 (second= category0 (third= category0 )? )? )
                    {
                    match(input,CAT1,FOLLOW_CAT1_in_category1356); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_category0_in_category1360);
                    first=category0();

                    state._fsp--;

                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:27: (second= category0 (third= category0 )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CAT0) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:28: second= category0 (third= category0 )?
                            {
                            pushFollow(FOLLOW_category0_in_category1365);
                            second=category0();

                            state._fsp--;

                            // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:50: (third= category0 )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==CAT0) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:97:50: third= category0
                                    {
                                    pushFollow(FOLLOW_category0_in_category1369);
                                    third=category0();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    		result = ((category1_scope)category1_stack.peek()).cat1;
                    		result.setRole1Value(first);
                    		if (second!=null) result.setRole2Value(second);
                    		if (third!=null) result.setRole3Value(third); 

                    }
                    break;
                case 2 :
                    // /eclipse/workspace/imelpreter/src/iemlWalker.g:102:4: ^( CAT1 EVENT )
                    {
                    match(input,CAT1,FOLLOW_CAT1_in_category1381); 

                    match(input, Token.DOWN, null); 
                    EVENT1=(CommonTree)match(input,EVENT,FOLLOW_EVENT_in_category1383); 

                    match(input, Token.UP, null); 

                    		result = ((category1_scope)category1_stack.peek()).cat1;
                    		result.setAbbreviation((EVENT1!=null?EVENT1.getText():null));
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            category1_stack.pop();
        }
        return result;
    }
    // $ANTLR end "category1"


    // $ANTLR start "category0"
    // /eclipse/workspace/imelpreter/src/iemlWalker.g:106:1: category0 returns [String value] : ^( CAT0 PRIMITIVE ) ;
    public final String category0() throws RecognitionException {
        String value = null;

        CommonTree PRIMITIVE2=null;

        try {
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:107:2: ( ^( CAT0 PRIMITIVE ) )
            // /eclipse/workspace/imelpreter/src/iemlWalker.g:107:4: ^( CAT0 PRIMITIVE )
            {
            match(input,CAT0,FOLLOW_CAT0_in_category0400); 

            match(input, Token.DOWN, null); 
            PRIMITIVE2=(CommonTree)match(input,PRIMITIVE,FOLLOW_PRIMITIVE_in_category0402); 

            match(input, Token.UP, null); 

            		value = (PRIMITIVE2!=null?PRIMITIVE2.getText():null);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "category0"

    // Delegated rules


 

    public static final BitSet FOLLOW_functionEval_in_script44 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_FUNCTION_in_functionEval55 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_functionEval59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_starexp_in_functionEval63 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functionEval72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_functionEval76 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_functionEval_in_functionEval78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category0_in_starexp95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category1_in_starexp107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category2_in_starexp121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category3_in_starexp135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category4_in_starexp149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_starexp159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category5_in_starexp163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT5_in_category5189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category4_in_category5193 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_category4_in_category5198 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_category4_in_category5202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT4_in_category4230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category3_in_category4234 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_category3_in_category4239 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_category3_in_category4243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT3_in_category3272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category2_in_category3276 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_category2_in_category3281 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_category2_in_category3285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT2_in_category2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category1_in_category2318 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_category1_in_category2323 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_category1_in_category2327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT1_in_category1356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_category0_in_category1360 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_category0_in_category1365 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_category0_in_category1369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT1_in_category1381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EVENT_in_category1383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAT0_in_category0400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRIMITIVE_in_category0402 = new BitSet(new long[]{0x0000000000000008L});

}