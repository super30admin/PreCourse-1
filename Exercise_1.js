
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Calling the object and executing the Stack.


// Your code here along with comments explaining your approach

const MAX = 1000;
let top;
let arr;

// Creating a new class for Stack DS
class Stack {
  constructor() {
    arr = new Array(MAX);
    top = -1;
  }

  // Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : Checking whether the length of the array, which is a built in function in JS, is equal to zero to determine
// whether it is empty or not.
  isEmpty() {
    return arr.length === 0;
  }

  // Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : Checking if the array is empty or not.
// Then taking the top most(last number) in array into a variable. Deleting the top most number. Decrementing the 'top' variable.
// Returning the number which was deleted.
  pop() {
    if (top !== -1) {
      var number = arr[top];
      arr.delete(top);
      top--;
      return number;
    } else
      return "Stack is empty.";

  }

    // Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : Checking to see if the stack is full. 
//If not full, increment 'top'.
// insert the number into the array
// return the updated array
  push(number) {
    if (top === MAX - 1) return 'Stack is full. Cannot insert the number';
    else {
      top++;
      arr[top] = number;
      return arr;
    }
  }

    // Time Complexity : O(n)
// Space Complexity : O(1)
// APPROACH: Check to see if the stack is empty
// If not empty, declare a variable 'length'
// iterate thtrough the array and increment length variable on each step
// return the length of the array
  peek() {
    if (top === -1) return 'Stack is empty';
    else {
      let length = 0;
      for (let i = 0; i < top; i++) {
        length++;
      }
      return length;
    }

  }

}

let s = new Stack();
consolelog(s.push(10));
consolelog(s.push(20));
consolelog(s.push(30));

console.log(s.pop());