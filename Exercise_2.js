//Time Complexity O(1) for push, pop, peek and isEmpty operations
//Space Complexity O(n) where n is capacity of stack
//Yes
//No

// class to represent a node in the stack
class StackAsLinkedList {
    static stackNode = class {
        // Constructor to initialize the node with data and next pointer
        constructor(d) {
            this.data = d;
            this.next = null;
        }
    }

    // Constructor for the StackAsLinkedList
    constructor() {
        // Initialize the top of the stack as null
        this.top = null;
    }

    // Check if the stack is empty
    isEmpty() {
        if (this.top == null) {
            console.log("Stack is empty");
            return true;
        }
    }

    // Push an element onto the stack
    push(data) {
        // Create a new node with the given data
        let temp = new StackAsLinkedList.stackNode(data);
        // Check for stack overflow
        if (temp == null) {
            console.log("Stack is overflow");
            return;
        }
        // Set the new node's data and next pointer
        temp.data = data;
        temp.next = this.top;
        // Update the top to the new node
        this.top = temp;
    }

    // Pop the topmost element from the stack
    pop() {
        // If the stack is empty, print "Stack Underflow" and return 0
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return 0;
        }
        // Store the data of the top node
        let popData = this.top.data;
        // Move the top pointer to the next node
        this.top = this.top.next;
        // Return the popped data
        return popData;
    }

    // Peek at the topmost element without removing it
    peek() {
        // If the stack is empty, print "Stack is empty"
        if (this.isEmpty()) {
            console.log("Stack is empty");
        } else {
            // Return the data of the top node
            return this.top.data;
        }
    }
}

// Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
