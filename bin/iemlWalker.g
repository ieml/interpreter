tree grammar iemlWalker;

options {
	ASTLabelType = CommonTree;
	tokenVocab = ieml;
}

@header {
	package org.ieml;
	import java.lang.reflect.*;
	import java.io.*;
	}

@members {
	
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
	
}

script: functionEval*;

functionEval
	: ^(FUNCTION fn=NAME cat=starexp) {
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
	| ^(FUNCTION fn=NAME functionEval);
	
starexp	returns [Category category]:
^( EXPRESSION category0)
	| ^( EXPRESSION cat=category1) { $category=cat; }
	| ^( EXPRESSION cat=category2) { $category=cat; }
	| ^( EXPRESSION cat=category3) { $category=cat; }
	| ^( EXPRESSION cat=category4) { $category=cat; }
	| ^( EXPRESSION cat=category5) { $category=cat; };

category5 returns [Category result]
scope { Category cat5; }
@init { $category5::cat5 = createCategory(5); }
	: ^(CAT5 first=category4 (second=category4 third=category4?)?) {
		$result = $category5::cat5;
		$result.setRole1(first);
		if (second!=null) $result.setRole2(second);
		if (third!=null) $result.setRole3(third);
	};
category4 returns [Category result]
scope { Category cat4; }
@init { $category4::cat4= createCategory(4); }
	: ^(CAT4 first=category3 (second=category3 third=category3?)?) {
		$result = $category4::cat4;
		$result.setRole1(first);
		if (second!=null) $result.setRole2(second);
		if (third!=null) $result.setRole3(third);
	};
category3 returns [Category result] 
scope { Category cat3; }
@init { $category3::cat3= createCategory(3); }
	: ^(CAT3 first=category2 (second=category2 third=category2?)?) {
		$result = $category3::cat3;
		$result.setRole1(first);
		if (second!=null) $result.setRole2(second);
		if (third!=null) $result.setRole3(third);
	};
category2 returns [Category result] 
scope { Category cat2; }
@init { $category2::cat2= createCategory(2); }
	: ^(CAT2 first=category1 (second=category1 third=category1?)?) {
		$result = $category2::cat2;
		$result.setRole1(first);
		if (second!=null) $result.setRole2(second);
		if (third!=null) $result.setRole3(third);
	};
category1 returns [Category result] 
scope { Category cat1; }
@init { $category1::cat1= createCategory(1); }
	: ^(CAT1 first=category0 (second=category0 third=category0?)?) {
		$result = $category1::cat1;
		$result.setRole1Value(first);
		if (second!=null) $result.setRole2Value(second);
		if (third!=null) $result.setRole3Value(third); }
	| ^(CAT1 EVENT) {
		$result = $category1::cat1;
		$result.setAbbreviation($EVENT.text);
	};
category0 returns [String value] 
	: ^(CAT0 PRIMITIVE) {
		$value = $PRIMITIVE.text;
	};
