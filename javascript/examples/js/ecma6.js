describe("how let works", function(){

    it("will provide block scoping, unlike var", function(){

        var doWork = function(flag){

            if(flag){
                var x = 3;
            }
            return x;

        };

        var result = doWork(true);

        expect(result).toBe(3);


    });

});

describe( 'using const', function() {

    "use strict";

    it("will make a variable read only", function(){

            const MAX_SIZE = 10;

            expect(MAX_SIZE).toBe(10);
    
    });

    it("can shadow outer declaration", function(){

        const x = 12;
        
        var doWork = function(){
            let x = 10;
            return x;
        };
        
        var result = doWork();
        expect(result).toBe(10);
        expect(x).toBe(12);

    });

});

describe('destructuring', function(){
    
    it("can destructure arrays", function(){
        
        var doWork = function(){
            return [1,3,2];
        }

        let [,x,y, z] = doWork();

        expect(x).toBe(3);
        expect(y).toBe(2);
        expect(z).toBeUndefined();

    });

    it("can deconstruct objects", function(){

        let doWork = function(){
            return {
                firstName:"Scott",
                lastName:"Allen",
                handles: {
                    twitter:"OdeTocode"
                }
            };
        };

        let{ firstName: firstName,
                handles:{ twitter: twitter } }
        = doWork();

        expect(firstName).toBe("Scott");
        expect(twitter).toBe("OdeTocode")
    });

    it("works with parameters", function(){

        let doWork = function( url, {data, cache}){
            return data;
        };

        let result = doWork(
                'api/test',
                {
                    data:"test",
                    cache: false
                }
             );
        

        expect(result).toBe("test");

    });


});


describe('default parameters', function() {

    it('provides defaults', function(){

        var doWork = function(name="Scott"){
            return name;
        }

        var result = doWork();

        expect(result).toBe("Scott");

    });

    it('will provide a value for undefined', function(){

        let doWork = function( a = 1, b = 2, c = 3 ) {
            return [ a, b, c ];
        };

        let [ a, b, c ] = doWork(5, undefined);

        expect(a).toBe(5);
        expect(b).toBe(2);
        expect(c).toBe(3);

    });

    it("works with destructuring", function(){

        let doWork = function( url, {data = "Scott", cache = true }){
            return data;
        };

        let result = doWork(
                'api/test',
                {
                    //data:"test",
                    cache: false
                }
             );
        

        expect(result).toBe("Scott");

    });

});

describe('Rest Parameters', function() {

    it('is like var args and is better than arguements structure', function(){

        let doWork = function(name, ...numbers){
            let result = 0;
            numbers.forEach(function(n){
                result += n;
            });
            return result;

        };

        let result = doWork("Scott", 1, 2, 3);

        expect(result).toBe(6);

    });

});

describe('Spread Operator', function() {

    it('can spread an array across parameters', function(){

        let doWork = function(x,y,z){
            return x + y + z;
        };

        let result = doWork(...[1, 2, 3]);

        expect(result).toBe(6);

    });

    it('can build arrays', function() {

        var a = [4,5,6];
        var b = [1,2,3, ...a, 7,8,9];
        
        expect(b).toEqual([1,2,3,4,5,6,7,8,9]);

    });


});

describe('Template Literals', function(){

    it('can easily combine literals and data', function() {
        let doWork = function(name){
            return `Hello, ${name}`;
        };

        let result = doWork("Scott");
        expect(result).toBe('Hello, Scott');

    });

    it('can build URLS', function(){

        let category = "music";
        let id = 1212;

        let url = `http://apiserver/${category}/${id}`;

        expect(url).toBe("http://apiserver/music/1212");
    });

    it('can use tags', function(){

        let upper = function( strings, ...values ){
            let result = "";
            for ( var i = 0; i < strings.length; i++ ){
                result +=strings[i];
                if ( i < values.length ){
                    result +=values[i];
                }
            }
            return result.toUpperCase();
        };
        
        var x = 1;
        var y = 3;
        var result = upper `${x} + ${y} is ${x+y}`;

        expect(result).toBe("1 + 3 IS 4");
    });


});

describe('the class keyword - its a syntax thing', function(){

    it('can create a class', function(){
        
        class Employee{
            doWork(){
                return "complete!";
            }
            getName(){
                return "Scott";
            }
        }
        
        let e = new Employee();

        expect(e.doWork()).toBe("complete!");
        expect(e.getName()).toBe("Scott");
        expect(Employee.prototype.doWork.call(e)).toBe("complete!");

    });


    it('can have a constructor', function(){
        
        class Employee{
            
            constructor(name){
                this._name = name;
            }
            
            doWork(){
                return this._name;
            }
            getName(){
                return this._name;
            }
        }
        
        let e1 = new Employee("Scott");
        let e2 = new Employee("Alex");
        
        expect(e1.getName()).toBe("Scott");
        expect(e2.getName()).toBe("Alex");

    });

    it('can have getters and setters', function(){
        
        class Employee{
            
            constructor(name){
                this._name = name;
            }
            
            doWork(){
                return this._name;
            }
            get name(){
                return this._name.toUpperCase();
            }
            set name(newValue){
                if (newValue){

                }
                this._name = newValue;
            }
        }
        
        let e1 = new Employee("Scott");
        let e2 = new Employee("Alex");
        
        expect(e1.name).toBe("SCOTT");
        expect(e2.name).toBe("ALEX");

        e1.name = "Chris";
        expect(e1.name).toBe("CHRIS");

    });

    it('can have a super class', function(){
        
        class Person{
            
            constructor(name){
                this.name = name;
            }
            
            get name(){
                return this._name;
            }
            
            set name(newValue){
                if (newValue){
                    this._name = newValue;
                }
            }

        }
        
        class Employee extends Person{

            doWork(){
                return `${this._name} is working`;
            }
        }
        let p1 = new Person("Scott");
        let e1 = new Employee("Christopher");
        
        expect(p1.name).toBe("Scott");
        expect(e1.name).toBe("Christopher");
        expect(e1.doWork()).toBe("Christopher is working");

    });

    it('can inherit', function(){
        
        class Person{
            
            constructor(name){
                this.name = name;
            }
            
            get name(){
                return this._name;
            }
            
            set name(newValue){
                if (newValue){
                    this._name = newValue;
                }
            }

        }
        
        class Employee extends Person{

            constructor(title, name){
                super(name);
                this._title = title;
            }

            get title(){
                return this._title;
            }

            doWork(){
                return `${this._name} is working`;
            }
        }
        let p1 = new Person("Scott");
        let e1 = new Employee("Developer", "Christopher");
        
        expect(p1.name).toBe("Scott");
        expect(e1.name).toBe("Christopher");
        expect(e1.doWork()).toBe("Christopher is working");

    });

    it('can override methods', function(){
        
        class Person{
            
            constructor(name){
                this.name = name;
            }
            
            get name(){
                return this._name;
            }
            
            set name(newValue){
                if (newValue){
                    this._name = newValue;
                }
            }

            doWork(){
                return "free";
            }

            doMoreStuff(){
                return 'more stuff';
            }

            toString(){
                return this.name;
            }

        }
        
        class Employee extends Person{

            constructor(title, name){
                super(name);
                this._title = title;
            }

            get title(){
                return this._title;
            }

            doWork(){
                return "paid";
            }

        }
        let e1 = new Employee("Developer", "Scott");
        let p1 = new Person("Alex");
        
        expect(p1.doWork()).toBe("free");
        expect(e1.doWork()).toBe("paid");
        expect(p1.toString()).toBe("Alex");
        expect(e1.toString()).toBe("Scott");

        let makeEveryoneWork = function(...people){
            var results = [];
            for ( var i = 0; i < people.length; i++ ){
                if ( people[i] instanceof Person){
                    results.push(people[i].doWork());
                }
            };
            return results;
        }

        expect(makeEveryoneWork(p1, e1, {} )).toEqual(["free", "paid"]);

    });
});

describe('Functional Programming', function(){

    it('provides a compact syntax to define a function', function(){

        let add_original = function(x,y){
            return x + y;
        };

        let add = (x,y) => x + y;
        let square = x => x*x;
        let three = () => 3;

        expect(add_original(2,3)).toBe(5);
        expect(add(2,3)).toBe(5);
        expect(square(2)).toBe(4);
        expect(three()).toBe(3);

    });

    it('can be used with array methods', function(){
        var numbers = [1,2,3,4];

        var sum = 0;
        numbers.forEach(n => sum += n);

        var doubled = numbers.map( n => n * 2 );

        expect(sum).toBe(10);
        expect(doubled).toEqual([2,4,6,8]);
    });

    it("lexically binds to 'this'...Arrow functions will always capture the this reference", function(done){
        
        this.name = "Scott";
    
        setTimeout( () => {
            expect(this.name).toBe("Scott");
            done();
        }, 15);

    
    });

    it('can work with iterators at a low level', function(){

        let sum = 0;
        let numbers = [1,2,3,4];

        for( let i = 0; i < numbers.length; i++ ){
            sum += numbers[i];
        }
        expect(sum).toBe(10);

        sum = 0;
        for ( let i in numbers ){
            sum += numbers[i];
        }
        expect(sum).toBe(10);

        sum = 0;
        let iterator = numbers.values();
        let next = iterator.next();

        while( !next.done ){
            sum += next.value;
            next = iterator.next();
        }

        expect(sum).toBe(10);

    });

    it('can work with iterables at a high level', function(){

            let numbers = [1,2,3,4];
            let sum = 0;

            for ( let n of numbers ){
                sum += n;
            }

            expect(sum).toBe(10);

    });

    it('can be built by implementing Symbol iterator', function(){

        class Company {

            constructor(){
                this.employees = [];
            }

            addEmployees(...names) {
                this.employees = this.employees.concat(names);
            }

            [Symbol.iterator](){
                return new ArrayIterator(this.employees);
            }
        }

        class ArrayIterator{
            constructor(array) {
                this.array = array;
                this.index = 0;
            }
            next(){
                var result = { value: undefined, done: true };
                if(this.index < this.array.length ){
                    result.value = this.array[this.index];
                    result.done = false;
                    this.index +=1;
                }
                return result;
            }
        }
        
        let count = 0
        
        let company = new Company();
        
        company.addEmployees("Tim", "Sue", "Joy", "Tom");

        for ( let employee of company ){
            count +=1;
        }

        expect(count).toBe(4);

    });

    it('can use generators to build iterables', function(){
        
//        let numbers = function*(){
//            yield 1;
//            yield 2;
//            yield 3;
//        };

//        let numbers = function*(){
//            for ( let i = 0; i <= 3; i++ ){
//                yield i;
//            }
//        };

        let numbers = function*( start, end ){      // for ( let n of numbers(1,5) ) {}
            for ( let i = start; i <= end; i++ ){   //      sum+=n;
                yield i;                            // }
            }                                       //
        };

        let sum = 0;
        let iterator = numbers(1,5);
        let next = iterator.next();

        while(!next.done){
            sum+= next.value;
            next = iterator.next();
        }

        expect(sum).toBe(15);

    });

    it('generators make more concise understandable syntax', function(){
        class Company {

            constructor(){
                this.employees = [];
            }

            addEmployees(...names) {
                this.employees = this.employees.concat(names);
            }

            *[Symbol.iterator](){
                for( let e of this.employees ){
                    console.log(e);
                    yield e;
                }
            }
        }

        let filter = function*(items, predicate){
            for ( let item of items ){
                console.log("filter", item);
                if( predicate(item)){
                    yield item;
                }
            }
        }
        
        let count = 0
        
        let company = new Company();
        
        company.addEmployees("Tim", "Sue", "Joy", "Tom");

        for ( let employee of filter( company, e => e[0] == 'T' ) ){
            count +=1;
        }

        expect(count).toBe(2);

    });

});

describe('working with built in objects', function(){



});

describe('another feature', function(){

    it('is a wonderful feature', function() {
        let result = 0;
        
        expect(result).toBe(0);
    });

});
