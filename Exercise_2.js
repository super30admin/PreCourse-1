class StackAsLinkedList {
​
// TimeComplexity: O(1)
// SpaceComplexity: O(n) 
    static stackNode = class {
​
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;

        }
    }
​
    constructor() {
        this.top = null;
    }
    
    isEmpty() {
        //Write your code here for the condition if stack is empty.
        return this.top === null;
    }
​
    push(data) {
       //Write code to push data to the stack.
       const n1 = new stackNode(data);
       n1.next = this.top;
       this.top = n1;
    }
​
    pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element
       if(this.isEmpty()){
        return null;
        } else {
            const pop = this.top;
            this.top = this.top.next;
            return pop.value;
        }
    }
​
    peek() {
       //Write code to just return the topmost element without removing it.
       if(this.isEmpty()){
            return null;
        } else {
            return this.top.value;
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
