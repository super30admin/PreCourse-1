class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

  // Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Did not try
// Any problem you faced while coding this :
​
    constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }
​
    isEmpty() {
        //Write your code here
        return this.top === -1;
    }
​
    push(x) {
        //Check for stack Overflow
        //Write your code here

        if(this.a.length >= this.MAX) {
            console.log('Stack Overflow');
            return false;
        }
        this.a.push(x);
        return true;
    }
​
    pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.a.length<=0) {
            console.log("Stack Underflow")
            return 0;
        }
        else {
            return this.a.pop();
        }      
    }
​
    peek() {
       //Write your code here
       if(this.a.length<=0) {
        return 0;
       }
       else {
       return this.a[this.a.length - 1];
       }

    }
}
​
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
