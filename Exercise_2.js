// time complexity is O(1) and space complexity is O(n), n is the number of elements in the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I wasn't fully aware of the topic however i used youtube 
//to learn and write the code
// Your code here along with comments explaining your approach

class StackAsLinkedList {
    constructor() {
      this.head = null; // Initialize an empty linked list to represent the stack.
    }
  
    // Node class represents a single node in the linked list.
    static stackNode = class {
      constructor(data) {
        this.data = data;
        this.next = null;
      }
    }
  
    isEmpty() {
      // Check if the stack is empty.
      // time complexity is O(1)
      return this.head === null;
    }
  
    push(data) {
      // Push data onto the stack by adding a new node at the front of the linked list.
      //time complexity O(1)
      const newNode = new StackAsLinkedList.stackNode(data);
      newNode.next = this.head;
      this.head = newNode;
    }
  
    pop() {
      // If the stack is empty, return 0 and print "Stack Underflow."
      // Otherwise, pop the topmost element of the stack and return the popped element.
      // time complexity is O(1)
      if (this.isEmpty()) {
        console.log("Stack Underflow");
        return 0;
      }
      const poppedData = this.head.data;
      this.head = this.head.next;
      return poppedData;
    }
  
    peek() {
      // Return the topmost element without removing it.
      //time complexity is O(1)
      if (this.isEmpty()) {
        console.log("Stack is empty");
        return 0;
      }
      return this.head.data;
    }
  }
  
  // Driver code
  const sll = new StackAsLinkedList();
  sll.push(10);
  sll.push(20);
  sll.push(30);
  console.log(sll.pop() + " popped from stack");
  console.log("Top element is " + sll.peek());
  
  
 