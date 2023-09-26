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
​
    function isEmpty() {
        //Write your code here for the condition if stack is empty.
    }
​
    function push(data) {
       //Write code to push data to the stack.
    }
​
    function pop() {
       //If Stack Empty Return 0 and print "Stack Underflow"
       //Write code to pop the topmost element of stack.
       //Also return the popped element
    }
​
    function peek() {
       //Write code to just return the topmost element without removing it.
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
