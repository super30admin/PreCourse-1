// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No
class StackAsLinkedList {

    static stackNode = class {

        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
            this.top = null;
        }
    }

    isEmpty() {
        //Write your code here for the condition if stack is empty.
        if(this.top == null){
            console.log("Stack is empty");
            return;
        }
    }

    push(data) {
       //Write code to push data to the stack.

       // Create new temp node
       // insert the data to this node data and assign it's next to this.top
       // now this tempNode will become top
       let tempNode = new StackAsLinkedList.stackNode();
       tempNode.data = data;
       tempNode.next = this.top;
       this.top = tempNode;
    }

    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       if(this.top == null){
        console.log("Stack Overflow");
        return 0;
       }
       //Write code to pop the topmost element of stack.
       //Also return the popped element

       // Just move the top element to next element
       let poppedElement = this.top.data;
       this.top = this.top.next;
       return poppedElement;
    }

    peek() {
       //Write code to just return the topmost element without removing it.
       return this.top.data;
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
