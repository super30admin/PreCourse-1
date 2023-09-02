/*
* Implement Stack using Linked List
*
*
TC = isEmpty: O(1)
    push: O(1)
    pop: O(1)
    peek: O(1)

SC = O(N) - N is the number of elements pushed
* */

class stackNode  {
    constructor(d) {
        //Constructor here
        this.val = d;
        this.next = null;
    }
}

class StackAsLinkedList {
    constructor() {
        this.root = null;
    }

    isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (this.root === null) return 'Stack is empty'
    }

    push(data) {
       //Write code to push data to the stack.
        let newNode = new stackNode(data);
        if (this.isEmpty()) {
            this.root = newNode;
        } else {
            /*
            * Approach here is to keep the last pushed element as the first element.
            * */
            newNode.next = this.root;
            this.root = newNode;
        }
    }

    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return 0;
        } else {
            const { val } = this.root;
            this.root = this.root.next;
            return val;
        }

    }

    peek() {
       //Write code to just return the topmost element without removing it.
        if (this.isEmpty()) {
            return 'Stack Empty'
        } else {
            return this.root.val
        }
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
