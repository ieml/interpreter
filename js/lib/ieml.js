
/**
 * This is a callback method meant for the tree walker to
 * construct a basic Category, that it's subsequently going
 * to use to set it's first and (optionally second (& optionally third)) roles
 * @param layer
 * @return
 */
function createCategory(layer) {
	return new Category(layer);
}

/**
 * Utility function that logs a category as a string
 * on Firefox's console
 */
function log(category) {
	if (console!=null)
		console.log(category.toString());
}

/**
 * creates a Fold out of a Category, i.e. an aleph(0, n)
 */
function fold(cat) {
	var f = new Fold();
	f.layer = cat.layer;
	f.members.push(cat);
	return f;
}

/**
 * computes the power set of a fold
 * @param fold of layer n, (nesting) level m
 * @return a fold of layer n, level m+1
 */
function pow(fold) {
	var result = new Fold();
	result.layer = fold.layer;
	result.level = fold.level+1;
	if (fold.layer==0 && fold.level==0) {
		var primitiveValue = fold.members[0].getValue();
		var unfoldedPrimitives = unfoldPrimitive(primitiveValue);
		var combinations = combine(unfoldedPrimitives, "+");
		result.members = combinations;
	} else if (fold.layer==1 && fold.level==0) {
		var role1uf = unfoldPrimitive(fold.members[0].role1.getValue());
		var role2uf = unfoldPrimitive(fold.members[0].role2.getValue());
		var role1cb = combine(role1uf, "+", true);
		var role2cb = combine(role2uf, "+", true);
		var cart = cprod([role1cb, role2cb]);
		for (i=0; i<cart.length; i++)
			result.members.push(cart[i].join(""));
	}
	result.members = starize(result.members);
	return result;
}

/**
 * Computes the cartesian product of n sets
 */

function cprod(aarray) {
	var nresults = 1;
	for (var i=0; i<aarray.length; i++)
		nresults*=aarray[i].length;
	var result = new Array(nresults);
	for (i=0; i<nresults; i++)
		result[i] = new Array(aarray.length);
	for (i=0; i<aarray.length; i++)
		for (var j=0; j<nresults; j++)
			result[j][i] = aarray[i][j%aarray[i].length];
	return result;
}

/**
 * Computes all the possible combinations of an array 
 * of strings
 * @param a an array of elements
 * @param operator an operator ("+","|"...) to join multi-terms
 * @param parenthesize wether to surround multi-terms with parentheses
 */
function combine(a, operator, parenthesize) {
	var fn = function(n, src, got, all) {
		if (n == 0) {
			if (got.length > 0) {
				all[all.length] = got;
			}
			return;
		}
		for (var j = 0; j < src.length; j++) {
			fn(n - 1, src.slice(j + 1), got.concat([src[j]]), all);
		}
		return;
	}
	var all = [];
	for (var i=0; i < a.length; i++) {
		fn(i, a, [], all);
	}
	all.push(a);
	var result = [];
	for (i=0;i<all.length;i++) {
		var combined = all[i].join(operator);
		if (parenthesize && all[i].length>1) combined = "(" + combined + ")";
		result.push(combined);
	}
	return result;
}

/**
 * surrounds arbitrarily array nested strings with *...**
 * @param aarray
 * @return
 */
function starize(aarray) {
	var isArray = aarray instanceof Array;
	if (! isArray) return "*" + aarray + "**";
	else {
		var result = [];
		for (var i=0; i<aarray.length; i++)
			result.push(starize(aarray[i]));
		return result;
	}
}

function unfoldPrimitive(primitive) {
	if (primitive=="M") return ["S:", "B:", "T:"];
	else if (primitive=="O") return ["A:", "U:"];
	else return [primitive+":"];
}

/**
 * A Fold object, i.e. 
 * level 0: a category
 * level 1: a set of categories
 * level 2: a set of set of categories
 * ...
 */
function Fold() {
	this.level = 0;
	this.layer = 0;
	this.members = [];
	this.toString = function() {
		if (this.level==0)
			return members[0].toString();
		else {
			var cb = toCurlyBraces(this.members);
			return cb;
		}
	}
}

/**
 * transforms a javascript array of arrays with nesting n into
 * an IEML fold of folding level n
 * @param aarray an array of arrays with folding level n
 * @return the string representation of an aleph of folding level n
 */
function toCurlyBraces(aarray) {
	var isArray = aarray instanceof Array;
	if (! isArray) return aarray;
	else {
		var result = "{";
		for (var i=0; i<aarray.length; i++) {
			if (i>0) result+=",";
			result += toCurlyBraces(aarray[i]);
		}
		return result + "}";
	}
}

/**
 * A Category "Object" which is what the parser is returning when
 * encountering a STAR expression
 */
function Category(layer) {
	this.parent = null;
	this.layer = layer;
	this.separators = [':', '.', '-', '\'', ',', '_'];
	
	this.setParent = function(cat) { this.parent = cat; };
	this.setRole1 = function(cat) { this.role1 = cat; cat.setParent(this); };
	this.setRole2 = function(cat) { this.role2 = cat; cat.setParent(this); };
	this.setRole3 = function(cat) { this.role3 = cat; cat.setParent(this); };
	this.setValue = function(v) { this.value = v; };
	this.getValue = function() { return this.value; };
	
	this.toString = function() {
		var result = "";
		var separator = this.separators[this.layer-1];
		if (this.parent==null) result += "*";
		if (this.getValue()==null) {
			result += this._appendRole(this.role1, result, separator);
			result += this._appendRole(this.role2, result, separator);
			result += this._appendRole(this.role3, result, separator);
		} else {
			result += this.getValue();
		}
		if (this.parent==null) {
			result += this.separators[layer];
			result += "**";
		}
		return result;
	};
	
	this._appendRole = function(role, result, separator) {
		var roleResult = "";
		if (role!=null && role.value!=null) roleResult += role.value + separator;
		else if (role!=null) roleResult += role + separator;
		return roleResult;
	};
}