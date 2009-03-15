package org.ieml;

import java.io.*;
import java.util.Scanner;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Processor {

    public static void main(String[] args) throws IOException, RecognitionException {
    	new Processor().processInteractive();
    }
    
    private void processInteractive() throws IOException, RecognitionException {
    	iemlWalker treeParser = new iemlWalker(null); // a TreeNodeStream will be assigned later
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("ieml> ");
            String line = scanner.nextLine().trim();
            if ("quit".equals(line) || "exit".equals(line)) break;
            processLine(treeParser, line);
        }
    }
    
    // Note that we can't create a new instance of MathTree for each
    // line processed because it maintains the variable and function Maps.
    private void processLine(iemlWalker treeParser, String line) throws RecognitionException {
        // Run the lexer and token parser on the line.
        iemlLexer lexer = new iemlLexer(new ANTLRStringStream(line));
        iemlParser tokenParser = new iemlParser(new CommonTokenStream(lexer));
        iemlParser.script_return parserResult =
            tokenParser.script(); // start rule method
        
        // Use the token parser to retrieve the AST.
        CommonTree ast = (CommonTree) parserResult.getTree();
        if (ast == null) return; // line is empty
        
        // Use the tree parser to process the AST.
        treeParser.setTreeNodeStream(new CommonTreeNodeStream(ast));
        treeParser.functionEval(); // start rule method
    }

}
