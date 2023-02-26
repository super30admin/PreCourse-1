//Time Complexity to access/insert/delete data into stack is O(1)
//Space grows depending on the data hence it will be O(n)

class Stack {
    constructor() {
        this.items = []
        this.top = null
    }

    isEmpty() {
        return this.items.length === 0
    }

    size() {
        return this.items.length
    }

    peek() {
        if (this.isEmpty()) {
            return "No Elements in Stack"
        } else {
            return "Top of the stack is - " + this.top
        }
    }

    pop() {
        if (this.isEmpty()) {
            return "Insert an element before deleting it"
        } else {
          if (this.size === 1) {
                this.top = null;
                return this.items.pop();
            } else {
                this.top = this.items[this.items.length - 2];
                return this.items.pop() && "Elements in the stack - " + this.items;
            }
        }
    }

    push(element) {
        this.items.push(element)
        this.top = element
        return "Elements in the stack - " + this.items
    }
}

const myStack = new Stack()
//Checking if the stack is empty
console.log(myStack.isEmpty())

//Checking if it throws an empty stack error
console.log(myStack.pop())

//Pushing elements into the stack
console.log(myStack.push(1))
console.log(myStack.push(2))
console.log(myStack.push(3))
console.log(myStack.push(4))

//Accessing the top element of the stack
console.log(myStack.peek())

//Deleting the stack from top
console.log(myStack.pop())
console.log(myStack.pop())
console.log(myStack.pop())
console.log(myStack.pop())
console.log(myStack.pop())