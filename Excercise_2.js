//Implement Stack using Linked List.

class Node {
    constructor(val){
        this.val = val;
        this.next = null;
    }
}

class SinglyLinkedList{
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    push(val){
        let newNode = new Node(val);
        if(!this.head) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }
    pop(){
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        let cur = this.head;
        for(let i = 1; i < this.length - 1; i++){
            cur = cur.next;
        }
        this.tail = cur;
        cur.next = null;
        this.length--;
        if(this.isEmpty()) {
            this.head = null;
            this.tail = null;
            console.log('Stack Undersflow');
            return 0;
        }
        return this;
    }
    isEmpty() {
        //Write your code here for the condition if stack is empty. 
        if(this.length === 0) return true;
        else return false;
    }
    peek() {
        //Write code to just return the topmost element without removing it.
        return this.tail;
    } 
}

let linkedList = new SinglyLinkedList();
linkedList.push(0)
linkedList.push(1)
linkedList.push(2)
linkedList.push(3)
linkedList.push(4)
linkedList.isEmpty()
linkedList.pop()
linkedList.peek()