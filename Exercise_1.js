//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file
// time complexity is O(1) and space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was full aware of the topic however i used youtube 
//to learn and write the code
// Your code here along with comments explaining your approach


class Stack {

    constructor() //Initialize your constructor
    {
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() //Write your code here 
    {
        return this.top === -1;
    }

    push(x) //Write your code here //Check for stack Overflow
    {
        if (this.top >= this.MAX - 1) {
            console.log('Stack Overflow');
            return;
        }
        this.a[++this.top] = x;
    }

    pop() //If empty return 0 and print " Stack Underflow" //Write your code here 
    {
        if (this.isEmpty()) {
            console.log('Stack Underflow');
            return 0;
        }
        return this.a[this.top--];
    }

    peek() //Write your code here
    {
        if (this.isEmpty()) {
            console.log('Stack is empty');
            return 0;
        }
        return this.a[this.top];
    }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + ' Popped from stack');


