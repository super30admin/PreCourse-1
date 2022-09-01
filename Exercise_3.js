let LinkedList = function(data=null, next=null){
    var data = data;
    var next = next;
    var head = null;
}
LinkedList.prototype.insert = function(data){
    let newNode = new LinkedList(data);
    let currentNode= this.head
    while(currentNode.next!=null){
        currentNode=currentNode.next
    }
    currentNode.next=newNode
};

LinkedList.prototype.find = function(key){
    let currentNode = this.head
    while(currentNode.next!=null){
        currentNode=currentNode.next
        if(currentNode.data==key){
            return (currentNode.data)
        }
    }
    return ("No element found")
};

LinkedList.prototype.remove = function(key){
    let currentNode=this.head
    while(currentNode.next!=null){
        lastNode=currentNode
        currentNode=currentNode.next
        if(currentNode.data==key){
            lastNode.next=currentNode.next
            return currentNode.data
        }
    }
}	

LinkedList.prototype.printlinkedlist = function(){
    let currentNode=self.head
    while(currentNode.next!=null){
        currentNode=currentNode.next
        console.log(currentNode.data)
    }
}

let list = new LinkedList(); 
list = list.insert(list, 1); 
list = insert(list, 2); 
list = insert(list, 3); 
list = insert(list, 4); 
list = insert(list, 5); 
console.log(list); 