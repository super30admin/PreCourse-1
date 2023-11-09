class Node {
constructor(data, next = null){
    this.data = data;
    this.next = next;
}
}

class LinkedList{
    constructor(){
        this.head = null;
        this.size = 0;
    }
    push(data){
        let node = new Node(data);
        let current;
        current = this.head;
        node.next = current;
        this.head = node;
        this.size++;
    }
    pop(){
        let current = this.head;
        if(current){
            let data = current.data;
            current = current.next;
            this.head = current;
            this.length--;
            return data;
        }
        return null;
    }
    peek(){
        let current = this.head;
        if(current){
            return current.data;
        }
        else{
            return null;
        }
    }
    isEmpty(){
        if(this.size > 0){
            return false;
        }
        else{
            return true;
        }
    }
}
let Stack = new LinkedList();
Stack.push(10);
Stack.push(20);
Stack.push(30);
console.log(Stack.pop() + " Popped from Stack");
console.log("Top element is " + Stack.peek());