class StackAsLinkedList {
    constructor() {
        this.top = null
    }
    static stackNode = class {
        constructor(d) {
            //Constructor here
            this.data = d;
            this.next = null;
        }
    }

    isEmpty() {
        return this.top == null
    }

    push(data) {
        const stackNodeVar = new StackAsLinkedList.stackNode(data)
        const empty = this.isEmpty()
        if (!empty) {
            stackNodeVar.next = this.top
        }
        this.top = stackNodeVar
    }

    pop() {
        const empty = this.isEmpty()
        if (empty) {
            console.log("Stack Underflow")
            return 0
        }
        const poppedItem = this.top.data;
        this.top = this.top.next;
        return poppedItem;
    }

    peek() {
        const empty = this.isEmpty()
        if (empty) {
            console.log("Stack Underflow")
            return 0
        }
        const topItem = this.top.data;
        return topItem;
    }
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
