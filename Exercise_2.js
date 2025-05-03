//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file​
// Time Complexity: Add time complexity of each method here
// Space Complexity: Add space complexity of each method here

class StackAsLinkedList {
    constructor() {
        this.top = null;
    }

    static StackNode = class {
        constructor(data) {
            this.data = data;
            this.next = null;
        }
    }

    isEmpty() {
        // Write your code here
    }

    push(data) {
        // Write your code here to add a new node
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
const stack = new StackAsLinkedList();
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack.pop() + " popped from stack");