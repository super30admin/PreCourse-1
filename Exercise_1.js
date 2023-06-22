"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Stack = void 0;
var Stack = /** @class */ (function () {
    function Stack() {
        this.max = 1000;
        //Initialize your constructor 
        this.top = -1;
        this.a = new Array(this.max);
        this.popped = 0;
    }
    Stack.prototype.isEmpty = function () {
        //Write your code here 
        return this.top == -1 ? true : false;
    };
    Stack.prototype.push = function (x) {
        //Check for stack Overflow
        //Write your code here
        if (this.top + 1 == this.max) {
            return false;
        }
        else {
            this.top = this.top + 1;
            this.a[this.top] = x;
            return true;
        }
    };
    Stack.prototype.pop = function () {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (this.top == -1) {
            console.log("Stack Underflow");
            return 0;
        }
        else {
            this.popped = this.a[this.top];
            this.a[this.top] = null;
            this.top--;
        }
        return this.popped;
    };
    Stack.prototype.peek = function () {
        //Write your code here
        return this.a[this.top];
    };
    return Stack;
}());
exports.Stack = Stack;
var s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.isEmpty());
console.log(s.pop() + " Popped from stack");
console.log(s);
