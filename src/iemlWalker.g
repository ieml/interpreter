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

script: statement*;

statement: print;

print	:	^(PRINTSTAT starexpr) {
	hello($se);
};
