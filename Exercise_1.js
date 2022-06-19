// Time Complexity : O(1)
// Space Complexity : O(1) - for this problem it is O(1) since we are inserting only two items and popping one item. But if the list is n numbers, then it would be O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I am not confident about how to determine space complexity for a particular algo and also I am not sure if my above analysis
// for space complexity is correct. I have implemeted the problem using arrays.

class myStack {
  // initialised items
  constructor() {
    this.items = [];
  }

  itemLength = () => this.items.length;
  isEmpty = () => this.itemLength() === 0;

  // push an element to the top of the stack
  push = (item) => {
    this.items.push(item);
    return this.items;
  };
  // pop an element to the top of the stack
  pop = () => this.items.pop();
  // return the element item of the stack
  peek = () => {
    if (this.isEmpty()) throw Error("stack is empty");
    return this.items[this.itemLength() - 1];
  };
}

s = new myStack();
console.log(s.push("1"));
console.log(s.push("3"));
console.log(s.pop());
console.log(s.peek());
