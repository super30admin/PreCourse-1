var LL2Stack = {};
LL2Stack.StackNode = function(){
	this.item = null;
	this.next = null;
}

LL2Stack.LinkedStack = function(){
	var head = null;
	var size = null;

	this.push = function(item){
		var node = new LL2Stack.StackNode();
		node.item = item;
		node.next = null;
		if(size < 1 && head === null){
			head = node;
			head.next = null;
			size = 1;
		}else{
			var current = head;
			while(current.next !== null){
				current = current.next;
			}
			current.next = node;
			size += 1;
		}
	}
	
	this.pop = function(){
		var current = head;
		if(size === 0){
			return;
		}
		if(size === 1){
			head = null;
			size = 0;
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
	}
	
	this.isEmpty = function(){
		return size < 1;
	}
	
	this.peek = function(){
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

var sll = new LL2Stack.LinkedStack();
console.log(sll.isEmpty());
sll.push(10); 
sll.push(20); 
sll.push(30); 
console.log(sll.pop()["item"] + " popped from stack");
console.log("Top element is " + sll.peek()); 