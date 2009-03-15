tree grammar iemlWalker;

options {
	ASTLabelType = CommonTree;
	tokenVocab = ieml;
}

@header {
	package org.ieml;
}

@members {
	public void hello(Object o) {
		System.out.println("hello world: " + o);
	}
}

script: functionEval*;

functionEval
	: ^(FUNCTION fn=NAME starexp) {
	  }
	| ^(FUNCTION fn=NAME functionEval);
	
starexp	: ^( EXPRESSION category);
	
category
	: ^(CAT0 category (category category?)?) {
		System.out.println("this is a CAT0");
	}
	| ^(CAT1 category (category category?)?) {
		System.out.println("this is a CAT1");
	}
	| ^(CAT2 category (category category?)?) {
		System.out.println("this is a CAT2");
	}
	| ^(CAT3 category (category category?)?) {
		System.out.println("this is a CAT3");
	}
	| ^(CAT4 category (category category?)?) {
		System.out.println("this is a CAT4");
	}
	| ^(CAT5 category (category category?)?) {
		System.out.println("this is a CAT5");
	};

