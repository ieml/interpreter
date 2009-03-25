
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

function layer(category) {
	return category.layer;
}

/**
 * Utility function that logs a category as a string
 * on Firefox's console
 */
function log(category) {
	if (console!=null)
		console.log(category.toString());
}

function parse(category) {
	return category;
}

/**
 * creates a Fold out of a Category, i.e. an aleph(0, n)
 */
function fold(cat) {
	var f = new Fold();
	f.layer = cat.layer;
	f.members.push(cat);
}

/**
 * returns the powerset of the 
 * @param fold of layer n, (nesting) level m
 * @return a fold of layer n, level m+1
 */
function pow(fold) {
	var f = new Fold();
	f.layer = fold.layer;
	f.level = fold.level+1;
	
}

function combine(a) {
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
	return all;
}

function cca(category) {
	
}

function unfold(primitive) {
	if (primitive=="M") return ["S", "B", "T"];
	else if (primitive=="O") return ["A", "U"];
	else return [primitive];
}

function Fold() {
	this.level = 0;
	this.layer = 0;
	this.members = [];
	this.toString = function() {
		if (this.layer==0&&this.level==0)
			return members[0].toString();
		else return "Not Implemented";
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