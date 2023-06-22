"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StackAsLinkedList = exports.StackNode = void 0;
var StackNode = /** @class */ (function () {
    function StackNode(data) {
        //Constructor here 
        this._data = data;
        //this._next=next;
    }
    Object.defineProperty(StackNode.prototype, "data", {
        get: function () {
            return this._data;
        },
        set: function (value) {
            this._data = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(StackNode.prototype, "next", {
        get: function () {
            return this._next;
        },
        set: function (value) {
            this._next = value;
        },
        enumerable: false,
        configurable: true
    });
    return StackNode;
}());
exports.StackNode = StackNode;
var StackAsLinkedList = /** @class */ (function () {
    function StackAsLinkedList() {
    }
    StackAsLinkedList.prototype.Constructor = function () {
        this._root = null;
        this._size = 0;
    };
    Object.defineProperty(StackAsLinkedList.prototype, "size", {
        get: function () {
            return this._size;
        },
        enumerable: false,
        configurable: true
    });
    StackAsLinkedList.prototype.isEmpty = function () {
        //Write your code here for the condition if stack is empty. 
        return this._root === null ? true : false;
    };
    StackAsLinkedList.prototype.push = function (data) {
        var newStackNode = new StackNode(data);
        if (this._root === null) {
            this._root = newStackNode;
        }
        else {
            newStackNode.next = this._root;
            this._root = newStackNode;
        }
        this._size++;
        //Write code to push data to the stack. 
    };
    StackAsLinkedList.prototype.pop = function () {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if (this._root === null) {
            return 0;
            console.log("stack Underflow");
        }
        else {
            var temp = this._root;
            this._size--;
            this._root = temp.next;
            return temp.data;
        }
    };
    StackAsLinkedList.prototype.peek = function () {
        //Write code to just return the topmost element without removing it.
        return this._root.data;
    };
    return StackAsLinkedList;
}());
exports.StackAsLinkedList = StackAsLinkedList;
//Driver code
var sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
