// Time Complexity : push, pop, peek, isEmpty O(1)
// Space Complexity : O(1) since we not creating any data structure in user facing functions.
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : NO

class StackAsLinkedList {
  static stackNode = class {
    constructor(d) {
      //Constructor here
      this.data = d;
      this.next = null;
    }
  };

  constructor() {
    this.root = null;
  }

  isEmpty() {
    //Write your code here for the condition if stack is empty.
    return this.root == null;
  }

  push(data) {
    //Write code to push data to the stack.
    let new_node = new StackAsLinkedList.stackNode(data);

    if (this.isEmpty() === false) {
      let temp = this.root;
      new_node.next = this.root;
      temp = null;
    }

    this.root = new_node;
  }

  pop() {
    //If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
    //Also return the popped element
    if (this.isEmpty()) return "Stack Underflow";

    this.root = this.root.next;
    return this.root.data;
  }

  peek() {
    //Write code to just return the topmost element without removing it.
    return this.root.data;
  }
}

test("Scenario #1:", () => {
  let obj = new StackAsLinkedList();
  obj.push(10);
  obj.push(20);
  obj.push(30);
  expect(obj.peek()).toStrictEqual(30);
  expect(obj.pop()).toStrictEqual(20);
});
