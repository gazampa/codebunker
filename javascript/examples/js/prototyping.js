
 // mz protyping

var o = {a: 1};

// The newly created object o has Object.prototype as its [[Prototype]]
// o has no own property named 'hasOwnProperty'
// hasOwnProperty is an own property of Object.prototype.
// So o inherits hasOwnProperty from Object.prototype
// Object.prototype has null as its prototype.
// o ---> Object.prototype ---> null

var b = ['yo', 'whadup', '?'];

// Arrays inherit from Array.prototype
// (which has methods indexOf, forEach, etc.)
// The prototype chain looks like:
// b ---> Array.prototype ---> Object.prototype ---> null

function f() {
  return 2;
}

// Functions inherit from Function.prototype
// (which has methods call, bind, etc.)
// f ---> Function.prototype ---> Object.prototype ---> null

// With A Constuctor
function Graph() {
    this.vertices = [];
    this.edges = [];
  }
  
  Graph.prototype = {
    addVertex: function(v) {
      this.vertices.push(v);
    }
  };
  
  var g = new Graph();
  // g is an object with own properties 'vertices' and 'edges'.
  // g.[[Prototype]] is the value of Graph.prototype when new Graph() is executed.

 // Using Object.create();
  var a = {a: 1};
 // a ---> Object.prototype ---> null

 var b = Object.create(a);
 // b ---> a ---> Object.prototype ---> null
 console.log(b.a); // 1 (inherited)

 var c = Object.create(b);
 // c ---> b ---> a ---> Object.prototype ---> null

 var d = Object.create(null);
 // d ---> null
 console.log(d.hasOwnProperty);
 // undefined, because d doesn't inherit from Object.prototype

 // with Class
 'use strict';

class Polygon {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
}

class Square extends Polygon {
  constructor(sideLength) {
    super(sideLength, sideLength);
  }
  get area() {
    return this.height * this.width;
  }
  set sideLength(newLength) {
    this.height = newLength;
    this.width = newLength;
  }
}

var square = new Square(2);


function foo(){}
foo.prototype = {
  foo_prop: "foo val"
};
function bar(){}
var proto = new foo;
proto.bar_prop = "bar val";
bar.prototype = proto;
var inst = new bar;
console.log(inst.foo_prop);
console.log(inst.bar_prop);
console.log( foo.prototype.foo_prop );


// Object Reference
var o = {
  a: {
    b: 2
  }
};
// 2 objects are created. One is referenced by the other as one of its properties.
// The other is referenced by virtue of being assigned to the 'o' variable.
// Obviously, none can be garbage-collected


var o2 = o; // the 'o2' variable is the second thing that
            // has a reference to the object
o = 1;      // now, the object that was originally in 'o' has a unique reference
            // embodied by the 'o2' variable

console.log( ' whats in o2 ' + o2.a.b );

var oa = o2.a; // reference to 'a' property of the object.
               // This object now has 2 references: one as a property,
               // the other as the 'oa' variable

o2 = 'yo'; // The object that was originally in 'o' has now zero
           // references to it. It can be garbage-collected.
           // However its 'a' property is still referenced by
           // the 'oa' variable, so it cannot be freed

oa = null; // The 'a' property of the object originally in o
           // has zero references to it. It can be garbage collected.

 //Arrays
 var fruits = ['Apple', 'Banana'];
 console.log(fruits.length);
 // 2
 fruits.forEach(function(item, index, array) {
  console.log(item, index);
});
// Apple 0
// Banana 1

var fruits = [];
fruits.push('apple', 'orange', 'banana');
fruits['05'] = function(){console.log('im in the array, ma')};
fruits[07] = 'peach';
console.log( fruits.length );

for ( var i = 0, j = fruits.length; i < j; i++ ) {
  console.log( fruits[i] );
}

fruits.forEach( function( item, index, array ){
  console.log(item, index);
});

console.log( fruits['05']() );

function hashtable(){
  var table = Object.create(null);
  // creates an object without any inheritance
  // acts more like a hashtable
}

// regular
// Let's create an object o from function f with its own properties a and b:
let f = function () {
    f.prototype.a = 'x';
    f.prototype.b = 'y';
    f.prototype.c = 'z';
    this.a = 1;
    this.b = 2;
    this.m = function() { return this.a + 4 };
 }

 // add properties in f function's prototype
 // do not set the prototype f.prototype = {b:3,c:4}; this will break the prototype chain
 
 let o = new f(); // {a: 1, b: 2}
 // o.[[Prototype]] has properties b and c.
 // o.[[Prototype]].[[Prototype]] is Object.prototype.
 // Finally, o.[[Prototype]].[[Prototype]].[[Prototype]] is null.
 // This is the end of the prototype chain, as null,
 // by definition, has no [[Prototype]].
 // Thus, the full prototype chain looks like:
 // {a: 1, b: 2} ---> {b: 3, c: 4} ---> Object.prototype ---> null
 
 console.log(o.a); // 1
 // Is there an 'a' own property on o? Yes, and its value is 1.
 
 console.log(o.b); // 2
 // Is there a 'b' own property on o? Yes, and its value is 2.
 // The prototype also has a 'b' property, but it's not visited.
 // This is called Property Shadowing
 
 console.log(o.a); // 1
 console.log(o.b); // 2
 console.log(o.c); // z
 
 console.log(o.__proto__.a); // x
 console.log(o.__proto__.b); // y
 console.log(o.__proto__.c); // z

 // Is there a 'c' own property on o? No, check its prototype.
 // Is there a 'c' own property on o.[[Prototype]]? Yes, its value is 4.
 
 console.log(o.d); // undefined
 // Is there a 'd' own property on o? No, check its prototype.
 // Is there a 'd' own property on o.[[Prototype]]? No, check its prototype.
 // o.[[Prototype]].[[Prototype]] is null, stop searching,
 // no property found, return undefined.

 console.log(f);
 console.log( Object.getPrototypeOf( f ) );
 
 console.log(o);
 console.log( Object.getPrototypeOf( o ) );

 console.log( o.m() ); // 5

 console.log( window.Object.prototype );