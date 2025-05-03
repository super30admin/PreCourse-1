//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file​
// Time Complexity: Add time complexity of each method here
// Space Complexity: Add space complexity of each method here

class Stack {
    constructor() {
        // Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() {
        // Write your code here
    }

    push(x) {
        // Check for stack Overflow
        // Write your code here
    }

    pop() {
        // If empty return 0 and print "Stack Underflow"
        // Write your code here
    }

    peek() {
        // Write your code here
    }
}

// Driver code
const stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack.pop() + " Popped from stack");