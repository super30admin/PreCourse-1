// Time Complexity : Peek O(1), Pop O(1) and Push O(N)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
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
        return this.top === -1;
    }

    push(x) {
        if(this.top <( this.MAX - 1)) {
            this.top++;
            this.a[this.top] = x;
        }else {
            console.log("Stack Overflow");
        }
    }

    pop() {
        if(!this.isEmpty()) {
            const temp = this.a[this.top];
            this.a.slice(this.top, 1);
            this.top--;
            return temp;
        } 
        console.log("Stack Underflow");
        return 0;
    }

    peek() {
        if(this.top !== -1) return this.a[this.top];
        return -1;
    }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
console.log(s.peek() + " is the top element");
