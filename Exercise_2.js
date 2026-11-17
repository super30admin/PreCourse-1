// Time Complexity: O(1) for push, pop, peek, and isEmpty
// Space Complexity: O(n) for storing n elements in the stack

class StackAsLinkedList {
    static stackNode = class {
        constructor(d) {
            this.data = d;
            this.next = null;
        }
    };

    constructor() {
        this.root = null;
    }

    isEmpty() {
        return this.root === null;
    }

    push(data) {
        const newNode = new StackAsLinkedList.stackNode(data);
        newNode.next = this.root;
        this.root = newNode;
    }

    pop() {
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return 0;
        }
        const poppedData = this.root.data;
        this.root = this.root.next;
        return poppedData;
    }

    peek() {
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return 0;
        }
        return this.root.data;
    }
}

// Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
