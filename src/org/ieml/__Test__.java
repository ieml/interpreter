package org.ieml;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.ieml.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        iemlLexer lex = new iemlLexer(new ANTLRFileStream("/eclipse/workspace/imelpreter/src/org/ieml/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        iemlParser parser = new iemlParser(tokens);
        iemlParser.script_return r = parser.script();
    }
}