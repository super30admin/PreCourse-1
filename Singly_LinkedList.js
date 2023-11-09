class Node{
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

Insert(data){
    let node = new Node(data);
    let current;

    if(!this.head){
        this.head = node;
    }
    else{
    current = this.head;
    while(current.next){
        current = current.next;
    }
    current.next = node;
}
this.size++;
}
printList(){
    let current = this.head;
    while(current){
        console.log(current.data);
        current = current.next;
    }
}
clearList() {
    this.head = null;
    this.size = 0;
  }
  
}

const list = new LinkedList();
list.Insert(1);
list.Insert(2);
list.Insert(3);
list.Insert(4);
list.Insert(5);
list.printList();


