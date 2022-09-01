let LinkedList = function(){
    var head = null;
    var value = null;
	var size = 0;
}
LinkedList.prototype.append = function(){

    if(this.size < 1 && this.head === null){
        this.head = node;
        this.head.next = null;
        size = 1;
    }else{
        var current = this.head;
        while(current.next !== null){
            current = current.next;
        }
        current.next = node;
        this.size += 1;
    }
};

LinkedList.prototype.remove = function(){
    var current = this.head;
    if(this.size === 0){
        return;
    }
    if(this.size === 1){
        this.head = null;
        this.size = 0;
        return current;
    }
    var prev = current; 
    while(current.next !== null){
            prev = current;
            current = current.next;
    }
    prev.next = null;
    size -= 1;
    return current;
};

LinkedList.prototype.find = function(x){
    var current = this.head;
    if(this.size > 0 && this.head !== null){
        if(x = current)
        while(current.next !== null){
            current = current.next;
        }
        return current.item;
    }else{
        return null;
    }
}	

LinkedList.LinkedStack = function(){
	
	this.find = function(){
		var current = head;
		if(size > 0 && head !== null){
			while(current.next !== null){
				current = current.next;
			}
			return current.item;
		}else{
			return null;
		}
	}	
}

let list = new LinkedList(); 
list = insert(list, 1); 
list = insert(list, 2); 
list = insert(list, 3); 
list = insert(list, 4); 
list = insert(list, 5); 
console.log(list); 