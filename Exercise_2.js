// Time Complexity : Push, Peek = O(1), Pop = O(N)
// Space Complexity : O(1)
class Node {
  constructor(data = null, next = null) {
    this.data = data;
    this.next = next;
  }
}

class Stack {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  push(data) {
    let newNode = new Node(data);
    if (!this.head) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.tail.next = newNode;
      this.tail = this.tail.next;
    }
    this.length += 1;
    return this;
  }

  pop() {
    if (this.length === 0) {
      console.log("Stack is empty");
      return this;
    }
    if (this.length === 1) {
      this.head = this.tail = null;
      this.length -= 1;
      return this;
    }
    let i = 0;
    let currentNode = this.head;
    let prevNode = this.head;
    while (i < this.length - 1) {
      prevNode = currentNode;
      currentNode = currentNode.next;
      i++;
    }
    this.tail = prevNode;
    this.tail.next = null;
    this.length -= 1;
    return this;
  }

  peek() {
    if (this.length === 0) {
      return null;
    } else {
      return this.tail.data;
    }
  }
}

let stack = new Stack();
stack.push("Item1");
stack.push("Item2");
stack.push("Item3");
console.log(stack);
console.log(stack.peek());
stack.pop();
console.log(stack);
stack.pop();
console.log(stack);
stack.pop();
console.log(stack);
stack.pop();
console.log(stack);
