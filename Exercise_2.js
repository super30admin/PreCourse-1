class StackAsLinkedList {
  static stackNode = class {
    constructor(d) {
      //Constructor here
      this.data = d;
      this.next = null;
    }
  };
  constructor() {
    this.root = null; // top of the stack
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
    const popData = this.root.data;
    this.root = this.root.next;
    return popData;
  }

  peek() {
    if (this.isEmpty()) {
      console.log("Stack Empty");
      return 0;
    }
    return this.root.data;
  }
}

const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
