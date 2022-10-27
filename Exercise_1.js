// Time Complexity : O(1)
// Space Complexity : O(1)
class MyStack {
  constructor() {
    this.stack = [];
  }
  isEmpty() {
    if (!this.stack.length) {
      return true;
    } else {
      return false;
    }
  }
  push(item) {
    this.stack.push(item);
    return this;
  }
  pop() {
    this.stack.pop();
    return this;
  }
  peek() {
    return this.stack.slice(-1);
  }
  size() {
    return this.stack.length;
  }
  show() {
    return this.stack;
  }
}
let s = new MyStack();
console.log(s.isEmpty());
s.push("1");
s.push("2");
console.log(s.size());
console.log(s.peek());
console.log(s.show());
console.log(s.pop());
console.log(s.show());
console.log(s.isEmpty());
