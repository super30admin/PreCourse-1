class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

class StackAsLinkedList {
    constructor() {
        this.top = null;
        this.end = null;
        this.length = 0;
    }

    isEmpty() {
        return this.length === 0;
    }

    //Adds the element at head of the list
    push(val) {
        let newNode = new Node(val);
        if (!this.top) {
            this.top = newNode;
            this.end = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }

        this.length++;
        return this.length;

    }

    // Removes the last added element fromt the head
    pop() {
        if (!this.top) return null;
        if (this.top === this.end) this.end = null;

        let poppedNode = this.top;
        this.top = poppedNode.next;

        this.length--;
        return poppedNode.val;
    }

    //Returns the last added value without popping
    peek() {
        return this.top.val;
    }

}

let stack = new StackAsLinkedList();
stack.push(10);
stack.push(20);
stack.push(30);