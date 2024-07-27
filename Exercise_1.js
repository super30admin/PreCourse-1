class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
// ​Time Complexity: O(1)
// Space Complexity: O(1)
    constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }
​
// ​Time Complexity: O(1)
// Space Complexity: O(1)
     isEmpty() {
        //Write your code here
        if (this.a.length === 0) {
            return true
        } else return false
    }
​
// ​Time Complexity: O(1)
// Space Complexity: O(1)
     push(x) {
        //Check for stack Overflow
        //Write your code here
        if(this.a.length >= 1000) {
            console.log(this.a.length)
            console.log(this.a)
            console.log("Stack Overflow")
        } else this.a.push(x)
    }

​// ​Time Complexity: O(1)
// Space Complexity: O(1)
     pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.a.length === 0){
            console.log("Stack Underflow")
            return 0
        } else {
            return this.a.pop()    
        }
    }
​
// ​Time Complexity: O(1)
// Space Complexity: O(1)
     peek() {
       //Write your code here
       return this.a[this.a.length + this.top]
    }
}
​
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
