//Implement Singly Linked List.

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
        let cur = this.head;
        for(let i = 1; i < this.length - 1; i++){
            cur = cur.next;
        }
        this.tail = cur;
        cur.next = null;
        this.length--;
        if(this.length === 0) {
            this.head = null;
            this.tail = null;
        }
        return this;
    }
    shift(){
        if(!this.head) return undefined; 
        if(this.length === 1) {
            this.head = null;
            this.tail = null;
        }
        else{
            this.head = this.head.next;
        }
        this.length--;
        return this;
    }
    unshift(val){
        let newNode = new Node(val);
        if(!this.head){
            this.head = newNode;
            this.tail = this.head;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }
    get(index){
        if(index < 0 || index > this.length - 1) return null;
        if(index === 0) return this.head;
        let cur = this.head;
        for(let i = 1; i <= index; i++){
            cur = cur.next;
        }
        return cur;
    }
    set(index, val){
        if(index < 0 || index > this.length - 1) return false;
        if(index === 0) {
            this.head.val = val;
            return true;
        }
        let cur = this.get(index);
        cur.val = val;
        return true;
    }
    insert(index, val){
        if(index < 0 || index > this.length) return false;
        if(index === this.length) return this.push(val);
        if(index === 0) return this.unshift(val);

        let newNode = new Node(val);
        let prev = this.get(index - 1);
        let temp = prev.next;
        prev.next = newNode;
        newNode.next = temp;
        this.length++;
        return this;
    }
    remove(index){
        if(index < 0 || index > this.length - 1) return false;
        if(index === 0) return this.shift();
        if(index === this.length - 1) return this.pop();

        let prev = this.get(index - 1);
        prev.next = prev.next.next;
        this.length--;
        return this;
    }
    reverse(){
        if(!this.head.next) return this.head;
        let prev = this.head;
        let cur = this.head.next;
        let next;
        this.head = this.tail;
        this.tail = prev;
        this.tail.next = null;
       
        for(let i = 1; i < this.length; i++){
           next = cur.next;
           cur.next = prev;
           prev = cur;
           cur = next;
        }       
        return this;
    }
}

let linkedList = new SinglyLinkedList();
linkedList.push(0)
linkedList.push(1)
linkedList.push(2)
linkedList.push(3)
linkedList.push(4)