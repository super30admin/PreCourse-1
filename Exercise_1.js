//Time Complexity O(1) for push, pop, peek and isEmpty operations
//Space Complexity O(n) where n is capacity of stack
//Yes
//No

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
        if(this.top === -1){  //checking if top of stack is -1
            return true;   //if so return true that stack is empty
        }
    }
     push(x) {
        //Check for stack Overflow
        //Write your code here
        if(this.top === this.MAX -1){  //Checking if stack is full or not
            console.log("Stack is Overflow")
            return;
        }
        this.a[++this.top] = x; //if stack is not full , we will update the top index by using increment operator and assigning the top of the stack value with x
    }
     pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()){  
            console.log("Stack Underflow")
            return 0;  //If stack is empty, return 0
        }
        return this.a[this.top--];  //Else remove top of the stack
    }
     peek() {
       //Write your code here
       return this.a[this.top]  //Return the value of top of stack
    }
}
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
