// O(1)
export class Stack {
    max = 1000;
    top: number = 0;
    elements = [];
    a = [this.max];

    constructor() { }

    push(x: number) {
        // Assign x at index top of array elements
        this.elements[this.top] = x;
        // Increment the top as previous index has a value assigned
        this.top = this.top + 1;
    }

    pop(): number {
        // Check if stack is empty, if yes return 0 or remove the last item
        if (this.elements.length === 0) {
            console.log('Stack Underflow');
            return 0;
        }
        
        return this.elements.pop();
    }

    peek(): number {
        // Return the top most element from the stack
        return this.elements[this.elements.length - 1];
    }

    isEmpty(): boolean {
        // Return if stack is empty
        return this.elements.length === 0;
    }

    count(n: number){
        if(n <= 0){
            return;
        }
        n = n-1;
        this.count(5);
    }
}

class Main {
    private stack: Stack = new Stack();

    constructor() {
        this.stack.push(10);
        this.stack.push(20);
        this.stack.push(30);
        this.stack.pop();
        this.stack.peek();
        this.stack.isEmpty();
        this.stack.count(5);
    }
}