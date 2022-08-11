// Online Javascript Editor for free
function Stack(){
	this.datastore = [];
	this.push = push;
	this.pop = pop;
	this.peek = peek;
	this.length = length;
	this.top = 0;
}

function push(element){
	this.datastore[this.top++] = element;
}

function peek(){
	return this.datastore[this.top-1]
}

function pop(){
	return this.datastore[--this.top];
}
function length(){
	return this.top;
}

var s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.datastore);
console.log(s.pop() + "Popped from Stack");