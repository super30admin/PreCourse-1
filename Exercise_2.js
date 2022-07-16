// Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : 


// Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : create the first element of the linked list
class LinkedList {
    constructor(head = null) {
      this.head = head;
    }
  }
  
  //Create a node with data and next element pointing to the next node. default value is null.
  class Node {
    constructor(data, next = null) {
      this.data = data,
        this.next = next;
    }
  }
  


  class Stack {

    //initially the top value is null. 
    constructor() {
      this.top = null;
      let linkedList;
      let top;
    }
  
    // Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : check whether the top element is null or not and return result appropriately.
    isEmpty() {
      if (top == null) return true;
      else return false;
    }
  
    // Time Complexity : O(1)
// Space Complexity : O(1)
//APPROACH : create a new node
//check if top element is null
// if yes, create a new linkedlist and add the node as its head element.
//else attach the new node to the top most element and make the new node as the top element
    push(data) {
      let newNode = new Node(data);
      if (top==null) {
        this.linkedList = new LinkedList(newNode);
      } else {
        newNode.next = top;
      }
      top = newNode;
      return top;
    }
  
// Time Complexity : O(1)
// Space Complexity : O(1)
// APPROACH : check if top element is null
// if yes, return empty message
//else create a temporary node. take the value of the top node into it.
// change the top node to the next node
//return the temporary node data
    pop() {
      if (top == null) return "Nothing. Stack is empty."
      else {
        let tempNode = new Node();
        tempNode = top;
        top = top.next;
        return tempNode;
      }
    }
  
 // Time Complexity : O(1)
// Space Complexity : O(1)
// APPROACH : check if top element is null   
// if yes, return empty message
//else return data of the top most element
    peek() {
      if (isEmpty()) return "0. Stack is empty!"
      else {
        return top.data;
      }
    }
  }
  
  
  let stack = new Stack();
  
  console.log(stack.push(10));
  console.log(stack.push(20));
  console.log(stack.push(30));
  
  console.log(stack.pop() + 'popped from stack');
  
  console.log('top element is'+ stack.peek())
  
  