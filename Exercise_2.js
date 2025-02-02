// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//Stack Implementation using linkedlist.
class StackAsLinkedList {

    static stackNode = class {

        constructor(d) {
            //Constructor here
            this.data = d; // store the value
            this.next = null; //pointer to the next node (default: null)
        }
    }

    constructor(){
        this.top = null; // points to the top of stack
    }

    isEmpty() {
        //Write your code here for the condition if stack is e  
        return this.top === null;
    }
    push(data) {
       //Write code to push data to the stack.
       const newNode = new StackAsLinkedList.stackNode(data); // creating a new node
       newNode.next = this.top; //Link the new node to the pevious top
       this.top = newNode //Update top to the new node
    }
 
    // Function to pop the top most element
    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element

       if(this.isEmpty()){
        console.log("Stack underflow")
        return 0;
       }
       const poppedData= this.top.data;
       this.top = this.top.next;
       return poppedData;
    }

    peek() {
       //Write code to just return the topmost element without removing it.
       if (this.isEmpty()) {
        console.log("Stack is empty"); // Print error message
        return 0; // Return 0 as per instruction
    }
    return this.top.data; // Return the top element's value
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
