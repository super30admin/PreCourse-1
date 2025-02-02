/*
Learned Stack, Array coded operations to check if 
1)stack is empty 
2)pushing element inside stack
3) popping the element out from stack
4) peeking the top most element in stack 
*/

/*
 Your code here along with comments explaining your approach
 1. Stack - LIFO(Last in first)
 2. We don't need use function keyword inside a class (we directly write name isEmpty() which is called method)
 3. Function written inside a class is called a method
 4. Constructor() : The constructor method is a special method of a class for creating and initializing an object instance of that class.
                    A class method called constructor cannot be a getter, setter, async, or generator.
                    A class cannot have more than one constructor method.
 5.  this keyword in constructor is the class object. (here in this case it is Stack which works as global class)
 6. to call the method we need to do //s.isEmpty()
*/
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file. 

    constructor() {
        //Initialize your constructor
        this.MAX = 1000; 
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() {
        //Write your code here
        return this.top === -1;
    }

    push(x) {
        //Check for stack Overflow
        //Write your code here
        if(this.top>=this.MAX -1){
            return false; // Stack Overflow
        }
            this.top = this.top +1
            this.a[this.top]=x;
            return true
    }
    pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()){
            console.log("Stack Underflow")
            return 0
        }
        return this.a[this.top--]

    }

    peek() {
       //Write your code here
       if(this.isEmpty()){
        console.log("Stack is Empty");
        return 0;
       }
        return this.a[this.top];
    }
}

let s = new Stack(); // created the new object using new keyword  // class is the blueprint of the object
s.push(10);
s.push(20);
s.push(30);
// console.log("The stack is",s)
// console.log("Peek is",s.peek())
// console.log("Checking if it is empty",s.isEmpty())
console.log(s.pop() + " Popped from stack");

