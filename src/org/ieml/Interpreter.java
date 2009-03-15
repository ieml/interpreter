package org.ieml;

import java.io.FileInputStream;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Interpreter {

    public static void main(String args[]) throws Exception {
    	String input = IOUtils.toString(new FileInputStream("test.usl"), "UTF-8");
    	ANTLRStringStream stringStream = new ANTLRStringStream(input);
        iemlLexer lex = new iemlLexer(stringStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        iemlParser parser = new iemlParser(tokens);
        iemlParser.script_return r = parser.script(); 
        CommonTree ast = (CommonTree) r.getTree();
        String command = ast.getChild(0).toString();
        System.out.println("command is: " + command);
        if (command.equals("XMLSTAT")) {
        	toXML(ast, input);
        } else if (command.equals("PRINTSTAT")) {
        	printExpression((CommonTree) ast.getChild(0).getChild(0));
        }
    }
    
    public static void printExpression(CommonTree ast) {
    	printTree(ast, 0);
    }
    
    public static void unfold() {
    	
    }
    
    public static void toXML(CommonTree ast, String input) {
    	Document document = DocumentHelper.createDocument();
    	Element root = DocumentHelper.createElement("ieml");
    	document.setRootElement(root);
    	root.addAttribute("exprType", "single-category");
    	root.addAttribute("expressionString", input);
    	xmlTree(ast.getChild(0), root, true, -1);
    	System.out.println(document.asXML());
    }
    
    private static void xmlTree(Tree child, Element parent, boolean rootCategory, int role) {
    	String nodeName = child.toString();
    	if (nodeName.startsWith("CAT")) {
    		int layer = Integer.valueOf(nodeName.substring(3));
    		Element node = null;
    		if (rootCategory) {
    			node = DocumentHelper.createElement("category");
    			rootCategory = false;
    		} else {
    			node = DocumentHelper.createElement("genOp");
    		}
    		node.addAttribute("layer", "L" + layer);
    		if (role!=-1)
    			node.addAttribute("role", "role" + role);
    		if (layer==1) {
    			String label = child.getChild(0).toString();
    			node.add(DocumentHelper.createElement(label));
    		}
			parent.add(node);
    		for (int i=0; i<child.getChildCount(); i++) {
    			xmlTree(child.getChild(i), node, rootCategory, i+1);
    		}
    	} else {
    		Tree grandchild = child.getChild(0);
    		if (grandchild!=null)
    			xmlTree(grandchild, parent, rootCategory, role);
    	}
	}

	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
}