// Time Complexity : O(1)
// Space Complexity : O(n)

class Stack {
  constructor() {
    // Initializing the array size and top pointer
    this.MAX = 1000;
    this.top = -1;
    this.a = new Array(this.MAX);
  }

  isEmpty() {
    return this.top == -1;
  }

  push(x) {
    // Checking for stack Overflow
    if (this.top >= this.MAX - 1) {
      console.log("Stack Overflow");
      return;
    }
    this.a[++this.top] = x;
  }

  pop() {
    // If empty return 0 and print "Stack Underflow"
    if (this.isEmpty()) {
      console.log("Stack Underflow");
      return 0;
    }
    return this.a[this.top--];
  }

  peek() {
    return this.a[this.top];
  }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
