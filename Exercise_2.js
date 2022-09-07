// Time Complexity :
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space Complexity :
// O(N), where N is stack length

// Did this code successfully run on Leetcode : Ran successfully locally. Did not find on leetcode
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
// Exercise_2 : Implement Stack using Linked List.
class StackNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class StackAsLinkedList {
    constructor(head = null) {
        this.head = head;
    }
}

StackAsLinkedList.prototype.isEmpty = function () {
    // Return true if head is null
    return this.head === null;
}

StackAsLinkedList.prototype.push = function (data) {
    // Create a new node with data
    let node = new StackNode(data);
    // New node next will be the head
    node.next = this.head;
    // New node will become the head
    this.head = node;
}

StackAsLinkedList.prototype.pop = function () {
    //If Stack Empty Return 0 and print "Stack Underflow"
    if (this.head === null) {
        console.log("Stack Underflow");
        return 0;
    }
    //Write code to pop the topmost element of stack.
    let node = this.head;
    this.head = node.next;
    node.next = null;

    //Also return the popped element 
    return node;
}

StackAsLinkedList.prototype.peek = function () {
    //Write code to just return the topmost element without removing it.
    if (this.head === null) {
        console.log("No elements present");
        return 0;
    }
    return this.head.data;
}

let stack = new StackAsLinkedList();
console.log(stack.isEmpty())
stack.push(1);
stack.push(2);
stack.push(3);

console.log("Popped node is : ", stack.pop());
console.log("Peek : ", stack.peek());

console.log("\nPopped node is : ", stack.pop());
console.log("Peek : ", stack.peek());

console.log("\nPopped node is : ", stack.pop());

console.log("\nPeek : ", stack.peek());
