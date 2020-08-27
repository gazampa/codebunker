console.log('begin');
// top tips
// use " for external strings and ' for internal
// use objects when the elements are arbitrary strings
// use arrays when the elements are numbers
// http://jex.im/regulex/
// !! turn boolish into boolean
// switch conditions need to be broken
// crockford the little schemer -

// privacy : function scope is never exposed
function gizmo(id){
    return {
        toString: function () {
                return "gizmo " + id;
        }
    };
}

function hoozit(id){
    var that = gizmo(id);
    that.test = function (testid){
        return testid === id;
    };
    that.equals = function(testid){
        return testid === id;
    }
    that.toString = function(){
        return "hoozit override : " + id;
    }
    return that;
}

console.log( hoozit(55).equals(55) );

function clasz(param){}

function Objekt(param){
    var that = clasz(param);

    that.method = function(){
        return "My parameter has every convenience, including privacy : /n " + param;
    }
    that.equals = function(innerParam){
        return param === innerParam;
    }
    that.toString = function(){
        return "" + param;
    }
}

function in_strict_mode(){
    return ( function(){
                return !this;
    }() );
}
console.log( in_strict_mode() );

function farray(){

    var a = function(){ return 'bang';}
    var b = function(){ return 'bang';}
    var c = function(){ return 'bang';}
    var d = function(){ return 'bang';}
    var e = function(){ return 'bang';}

    var arr = [a,b,c,d,e];
    console.log(arr.length);
    for ( var i = 0; i < arr.length; i++ ){
        console.log(arr[i]());
    }
}

farray();

var names = [1, 2, 3];

var digit_name = ( function() {

    var names = ['one', 'two', 'three'];
    
    console.log( names[0] );
    
        return function( n ){
    
            var names = ['x', 'y', 'z'];

            return names[n];
    
    };

}());

console.log( names[0] );
console.log ( digit_name(0) );

function itstime(x, duration){
    
    console.log(x + ' : ' + Date.now());
    var tick = 0;
    return function step(){ //Math.floor( millis );
        tick += 1;
        console.log(x + ' ' + tick + ' - ' + Date.now());
        if ( tick < 15 ) {
            setTimeout(step, duration);
            return undefined;
        }
    }
    setTimeout(step, 100);
}

var func = itstime('boo');
var funcs = [itstime('bing', 100), itstime('bang', 50), itstime('bong', 250)];

funcs.forEach(element => {
    element();
});

console.log( func() );

function letTest() {
    let x = 1;
    if (true) {
      let x = 2;  // different variable
      console.log(x);  // 2
    }
    console.log(x);  // 1
}


console.log('end');
