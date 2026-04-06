class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  constructor() {
    //Initialize your constructor
    this.MAX = 1000;
    this.top = -1;
    this.a = new Array(this.MAX);
  }
  isEmpty() {
    return this.top === -1;
  }
  push(x) {
    if (this.top >= this.MAX - 1) {
      console.log("Stack Overflow");
      return false;
    }
    this.top += 1;
    this.a[this.top] = x;
    return true;
  }
  pop() {
    if (this.isEmpty()) {
      console.log("Stack Underflow");
      return 0;
    }
    const val = this.a[this.top];
    this.top -= 1;
    return val;
  }
  peek() {
    if (this.isEmpty()) {
      console.log("Stack Empty");
      return 0;
    }
    return this.a[this.top];
  }
}
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
