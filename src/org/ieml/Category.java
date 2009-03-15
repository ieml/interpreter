package org.ieml;

import java.util.ArrayList;
import java.util.List;

public class Category {

	int layer;
	String abbreviation;
	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String value) {
		this.abbreviation = value;
	}
	static char[] separators = new char[6];
	static {
		String sepString = ":.-\',_";
		sepString.getChars(0, sepString.length(), separators, 0);
	}
	Category parent;
	Category role1, role2, role3;
	String role1Value, role2Value, role3Value;
	
	Category (int layer) {
		this.layer = layer;
	}
	
	public List sources() {
		List result = new ArrayList();
		result.add(getRole1Value().toString());
		System.out.println(result);
		return result;
	}
	
	public void layer() {
		System.out.println("layer: "+this.layer);
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		char separator = separators[this.layer-1];
		if (this.parent==null) result.append("*");
		if (this.getAbbreviation()==null) {
			appendRole(role1Value, role1, result, separator);
			appendRole(role2Value, role2, result, separator);
			appendRole(role3Value, role3, result, separator);
		} else {
			result.append(this.getAbbreviation());
		}
		if (this.parent==null) {
			result.append(separators[layer]);
			result.append("**");
		}
		return result.toString();	
	}
	
	private void appendRole(String roleValue, Category role, StringBuffer result,
			char separator) {
		if (roleValue!=null) result.append(roleValue);
		else if (role!=null) result.append(role);
		if (roleValue!=null || role!=null)
			result.append(separator);
	}

	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public Category getRole1() {
		return role1;
	}
	public void setRole1(Category role1) {
		role1.parent = this;
		this.role1 = role1;
	}
	public Category getRole2() {
		return role2;
	}
	public void setRole2(Category role2) {
		role2.parent = this;
		this.role2 = role2;
	}
	public Category getRole3() {
		return role3;
	}
	public void setRole3(Category role3) {
		role3.parent = this;
		this.role3 = role3;
	}
	public String getRole1Value() {
		return role1Value;
	}
	public void setRole1Value(String role1Value) {
		this.role1Value = role1Value;
	}
	public String getRole2Value() {
		return role2Value;
	}
	public void setRole2Value(String role2Value) {
		this.role2Value = role2Value;
	}
	public String getRole3Value() {
		return role3Value;
	}
	public void setRole3Value(String role3Value) {
		this.role3Value = role3Value;
	}
	
}
