// Time Complexity : Peek O(1), Pop O(N) and Push O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Yes, I faced an issue in declaring the stackNode class.
class StackAsLinkedList {

    static stackNode = class {
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
        }
    }

    tail = null;
    head = null;

    isEmpty() {
        //Write your code here for the condition if stack is empty.
        return this.head === null;
    }

    push(data) {
       //Write code to push data to the stack.
       const newNode = new StackAsLinkedList.stackNode(data);
       if(this.isEmpty()) {
        this.head = newNode;
        this.tail = this.head;
       }else {
        this.tail.next = newNode;
        this.tail = this.tail.next;
       }
    }

    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the p{opped element
       if(this.isEmpty()) {
        console.log("Stack Underflow");
        return 0;
       }
        const temp = this.tail == null ? this.head.data : this.tail.data;

        if(this.tail === this.head) {
            this.head = null;
            this.tail = null;
        }else {
            let current = this.head;
            while(current.next !== this.tail) {
                current = current.next;
            }

            current.next = null;
            this.tail = current;
        }
        return temp;
    }

    peek() {
       //Write code to just return the topmost element without removing it.
       return this.isEmpty() ? -1 : this.tail.data;
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());