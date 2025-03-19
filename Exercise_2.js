class StackAsLinkedList {

    static stackNode = class {
        constructor(d) {
            this.data = d;
            this.next = null;
        }
    };

    constructor() {
        this.top = null;
    }

    isEmpty() {
        return this.top === null;
    }

    push(data) {
        const newNode = new StackAsLinkedList.stackNode(data);
        newNode.next = this.top;
        this.top = newNode;
    }

    pop() {
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return 0;
        }
        const poppedValue = this.top.data;
        this.top = this.top.next;
        return poppedValue;
    }

    peek() {
        return this.isEmpty() ? null : this.top.data;
    }
}

// Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
