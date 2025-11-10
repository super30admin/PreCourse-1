class StackAsLinkedList {
    constructor() {
        this.head = null;
    }
​
    static stackNode = class {
​
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
            this.head = null;
        }
    }
​
    isEmpty() {
        //Write your code here for the condition if stack is empty.
        /* check if the head is null and make the decision */
        return this.head === null;
    }
​
    push(data) {
       //Write code to push data to the stack.

       /* 1. Create the node to be added
          2. Append the node to the head pointer
          3. Update the head pointer to point to the new node
       */
         const newNode = new StackAsLinkedList.stackNode(data);
         newNode.next = this.head;
         this.head = newNode;

    }
​
     pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element

       /* if head is not null return the top value and update head */

       if(!this.head){
              console.log("Stack Underflow");
              return 0;
       }else{
        const topNode = this.head;
        this.head = this.head.next;
        return topNode.data;
       }
    }

    peek() {
       //Write code to just return the topmost element without removing it.

       if(this.head){
           return this.head.data;
       }else{
           console.log("Stack is empty");
           return;
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
