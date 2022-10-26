class Stack {
  constructor() {
    this.array = [];
  }

  peek() {
    const top = this.array[this.array.length - 1];
    console.log(top);
    return top;
  }

  push(value) {
    this.array.push(value);
    console.log(value);
    return value;
  }

  pop() {
    const itemToRemove = this.array.pop();
    console.log(itemToRemove);
    return itemToRemove;
  }
}

const myStack = new Stack();
myStack.peek();
myStack.push('google');
myStack.push('udemy');
myStack.push('discord');
myStack.peek();
myStack.pop();
myStack.pop();
myStack.pop();
