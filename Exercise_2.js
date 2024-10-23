// Time Complexity : O(1)
// Space Complexity : O(n)
class StackAsLinkedList {
  constructor() {
    this.top = null;
  }

  static stackNode = class {
    constructor(d) {
      // Constructor here
      this.data = d;
      this.next = null;
    }
  };

  isEmpty() {
    // Write your code here for the condition if stack is empty.
    return this.top == null;
  }

  push(data) {
    // Write code to push data to the stack.
    const newNode = new StackAsLinkedList.stackNode(data);
    newNode.next = this.top;
    this.top = newNode;
  }

  pop() {
    // If Stack Empty Return 0 and print "Stack Underflow"
    // Write code to pop the topmost element of stack.
    // Also return the popped element
    if (this.isEmpty()) {
      console.log("Stack Underflow");
      return 0;
    }
    const poppedValue = this.top.data;
    this.top = this.top.next;
    return poppedValue;
  }

  peek() {
    // Write code to just return the topmost element without removing it.
    if (this.isEmpty()) {
      console.log("Stack is empty");
      return null;
    }
    return this.top.data;
  }
}

// Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
