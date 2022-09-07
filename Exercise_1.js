// Time Complexity :
// Push: O(1)
// Pop: O(1)
// Peek: O(1)
// IsEmpty: O(1)

// Space Complexity :
// O(N), where N is the number of elements in the stack

// Did this code successfully run on Leetcode : Ran successfully locally. Did not find on leetcode
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
// Exercise_1 : Implement Stack using Linked List.

var Stack = function() {
    this.MAX = 10;
    this.a = new Array(this.Max);
    this.size = 0; // Monitoring the size of the array as elements are pushed and popped
};

/** 
 * @param {number} x
 * @return {boolean}
 */
 Stack.prototype.push = function(x) {
    //Check for stack Overflow
    if(this.size === this.MAX){
        console.log("Stack overflow");
        return false;
    }
    
    this.a[this.size] = x;
    this.size++; // Increase size as 1 element is added

    return true;
};

/**
 * @return {number}
 */
 Stack.prototype.pop = function() {
    //If empty return 0 and print " Stack Underflow"
    if(this.size===0){
        console.log("Stack Underflow");
        return 0;
    }
    let poppedEle = this.a[this.size-1];
    this.a[this.size-1] = undefined;
    this.size--;
    return poppedEle;
};

/**
 * @return {number}
 */
 Stack.prototype.peek = function() {
     // If size is 0, it will have no elements
    if(this.size === 0){
        console.log("Empty stack");
        return 0;
    }
    return this.a[this.size-1];
};

/**
 * @return {boolean}
 */
 Stack.prototype.empty = function() {
     // Stacl is empty is size is 0
    return this.size===0;
};

var s = new Stack()

// Testing empty
console.log( "Is Empty? ", s.empty() ); 

// Testing pop
console.log(s.pop() + " Popped from stack"); 

// Testing push
s.push(10); 
s.push(20); 
s.push(30); 

// Testing empty
console.log( "Is Empty? ", s.empty() ); 

// Testing pop
console.log(s.pop() + " Popped from stack"); 

// Testing peek
console.log( s.peek() + " Peeked from stack" ); 

console.log(s);