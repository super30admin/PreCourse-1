class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() {
        return this.top < 0
    }

    push(x) {
        if (this.top >= this.MAX - 1) {
            return false
            // stack overflow

        }
        this.top = this.top + 1
        this.a[this.top] = x
        console.log(this.a)
    }

    pop() {
        const empty = this.isEmpty()
        if (empty) {
            console.log("Stack Underflow")
            return 0
        }
        const x = this.a[this.top]
        this.top = this.top - 1
        return x
    }

    peek() {
        const empty = this.isEmpty()
        if (empty) {
            console.log("Stack Underflow")
            return 0
        }
        const x = this.a[this.top]
        return x
    }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
