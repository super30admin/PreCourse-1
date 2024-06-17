// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  
  constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }
    
    isEmpty() {
        //Write your code here
        console.log("Empty");
    }
    
    push(x) {
        //Check for stack Overflow
        if(this.top >= (this.MAX-1)){
            console.log("Stack Overflow"); 
            return;
        }
        //Write your code here
        this.top += 1;
        this.a[this.top] = x;
        console.log(`${x} inserted at index ${this.top}`);
    }

    pop() {
        //If empty return 0 and print " Stack Underflow"
        if(this.top == -1){
            console.log("Stack Underflow");
            return;
        }
        //Write your code here
        let poppedVal = this.a[this.top];
        this.top -= 1;
        return poppedVal;
    }

    peek() {
       //Write your code here
       console.log(`Peek value is ${this.a[this.top]}`)
    }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
s.peek();
console.log(s.pop() + " Popped from stack");
