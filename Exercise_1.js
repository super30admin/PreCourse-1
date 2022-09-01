//Push - O(n)
//pop - O(n)
//isEmpty - O(n)
//Peek - O(n)
var Stack = function (maxSize) {
    this.arr = [];
    this.length = 0;
    this.maxSize = maxSize;
};

Stack.prototype.push = function (x) {
    if (this.length < this.maxSize) {
        this.arr[this.length] = x;
        this.length++
    }
};

Stack.prototype.pop = function () {
    if (this.length == 0) { 
        console.log("Stack Underflow") 
        return -1 
    }
    else {
        this.length--;
        let last = this.arr[this.length]
        return last;
    }
};

Stack.prototype.isEmpty = function () {
    return this.length < 0 
};


Stack.prototype.peek = function () {
    return this.arr[this.length];
}; 

let s = new Stack(3); 
s.push(10); 
s.push(20); 
s.push(30); 
console.log(s.pop() + " Popped from stack"); 