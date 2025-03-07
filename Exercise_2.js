// Time Complexity :O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class StackAsLinkedList {
​
    static stackNode = class {
​
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
        }
    }

    constructor() {
        this.head = null;
    }
​
    isEmpty() {
        //Write your code here for the condition if stack is empty.
        return this.head === null;
    }
​
    push(data) {
       //Write code to push data to the stack.
       let newNode = new StackAsLinkedList.stackNode(data);
       newNode.next = this.head;
       this.head = newNode;
    }
​
    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element
       if(this.head === null) {
        console.log("stack underflow");
        return 0;
       }
       else {
        const headNode = this.head.data;
        this.head = this.head.next;
        return headNode;
       }
    }
​
    peek() {
       //Write code to just return the topmost element without removing it.
       return this.head.data;
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
