// Time Complexity: O(1) - constant time
// Space Complexity: O(1) - constant time
// Did this code successfully run on Leetcode: N/A
// Any problem you faced while coding this: No

class Stack {
  constructor() {
    this.items = [];
  }

  pushToStack(element) {
    return this.items.push(element);
  }

  popFromStack() {
    if (!this.items.length) {
      return console.log("stack underflow");
    }
    return this.items.pop();
  }

  peekStack() {
    if (!this.items.length) {
      return console.log("stack underflow when peeking");
    }
    console.log(this.items[this.items.length - 1]);
    return this.items[this.items.length - 1];
  }

  isEmpty() {
    return !this.items.length
      ? console.log("true: stack is empty")
      : console.log("false: stack has items");
  }

  stackSize() {
    console.log("size:", this.items.length);
    return this.items.length;
  }

  showStack() {
    console.log("stack items:", this.items);
    return this.items;
  }
}

const currentStack = new Stack();
// Adds new elements to the stack
currentStack.pushToStack(10);
currentStack.pushToStack(20);
currentStack.pushToStack(30);

// Returns stack size
currentStack.stackSize();

// Displays stack
currentStack.showStack();

// Displays what is at the top of the stack
currentStack.peekStack();

// Removes elements from the stack
currentStack.popFromStack();
currentStack.popFromStack();
currentStack.popFromStack();
currentStack.popFromStack();

// Returns stack size after removing all elements
currentStack.stackSize();

// Displays stack
currentStack.showStack();

// Displays what is at the top of the stack
currentStack.peekStack();

// Let's us know if the stack is empty
currentStack.isEmpty();
