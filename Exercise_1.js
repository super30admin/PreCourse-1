class Stack {
    constructor() {
        this.stack = [];

    }

    isEmpty() {
        return this.stack.length === 0;
    }

    //Adds the element at the end of the array
    push(element) {
        return !!this.stack.push(element);
    }

    //Removes the last element from the end of the array
    pop() {
        if (this.stack.length === 0) return null;
        return this.stack.pop();
    }

    //Returns the last element of the array without popping
    peek() {
        let lastIndex = this.stack.length - 1;
        return this.stack[lastIndex];
    }
}

let stack = new Stack();
stack.push(20);
stack.push(30);
stack.push(40);
console.log(stack.pop());
console.log(stack.peek());
console.log(stack.isEmpty());