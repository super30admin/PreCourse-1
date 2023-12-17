//Time Complexity O(1) for push, pop, peek and isEmpty operations
//Space Complexity O(n) where n is capacity of stack
//Yes
//No

class StackAsLinkedList {
    static stackNode = class {
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
        }
    }

 constructor() {
            this.top = null;
    }
    
     isEmpty() {
        //Write your code here for the condition if stack is empty.
        if(this.top == null){
            console.log("Stack is empty")
            return true;
        }
    }
     push(data) {
       //Write code to push data to the stack.
        let temp = new StackAsLinkedList.stackNode(data)
        if(temp == null){
            console.log("Stack is overflow")
            return;
        }
        temp.data = data
        temp.next = this.top 
        this.top = temp
    }
     pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element
        if(this.isEmpty()){
            console.log("Stack Underflow")
            return 0;
        }
        let popData = this.top.data
        this.top = this.top.next
        return popData;
    }
     peek() {
       //Write code to just return the topmost element without removing it.
        if(this.isEmpty()){
            console.log("Stack is empty")
    }
        else {
            return this.top.data;
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
