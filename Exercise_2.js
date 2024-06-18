// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Not tested on leetcode
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class StackAsLinkedList {
    constructor() {
        this.head = null;
    }

    static stackNode = class {
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
        }
    }
    isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (this.head == null)
            return true;
        return false;
    }
    push(data) {
        //Write code to push data to the stack.
        let newNode = new StackAsLinkedList.stackNode(data);
        if (this.head == null)
            this.head = newNode;
        else {
            let curHeadNode = this.head;
            this.head = newNode;
            newNode.next = curHeadNode;
        }
        console.log(`${data} pushed to stack`);
    }
    pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (this.head == null)
            console.log('Stack Underflow');
        else {
            var node = this.head;
            this.head = node.next;
            return node.data;
        }
    }
    peek() {
        //Write code to just return the topmost element without removing it.
        if (this.head == null)
            console.log('Stack Underflow');
        else
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
