class StackNode {
    data: number;
    next: StackNode;
}

class StackAsLinkedList {
    top: StackNode;

    isEmpty() {
        //Write your code here for the condition if stack is empty. 
        return this.top === null ? true : false;
    }

    push(data: number) {
        const node = new StackNode;
        node.data = data;
        node.next = this.top;

        this.top = node;
    }

    pop() {
        if (this.top === null) {
            console.log('Stack underflow');
            return 0;
        }
        const temp = this.top.data;
        this.top = this.top.next;

        return temp;
    }

    peek() {
        if(this.top === null){
            console.log('Stack empty');
        }
        return this.top.data;
    }
}
//Driver code
class main {

    sll = new StackAsLinkedList();

    constructor() {
        this.sll.push(10);
        this.sll.push(20);
        this.sll.push(30);

        this.sll.pop();

        console.log(this.sll.pop() + " popped from stack");

        console.log("Top element is " + this.sll.peek());
    }
}

