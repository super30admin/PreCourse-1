/*
Exercise_1 : Implement Stack using Array.
TC =
    isEmpty: O(1)
    push: O(1)
    pop: O(1)
    peek: O(1)

SC = O(N) - N is the number of elements pushed*/

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array();
    }

    isEmpty() {
        //Write your code here
        return this.top === -1
    }

    push(x) {
        //Check for stack Overflow
        //Write your code here

        if (this.top >= this.MAX) {
            console.log('Stack Overflow')
            return false;
        } else {
            this.top++;
            console.log(this.top)
            this.a[this.top] = x;
            console.log(this.a[this.top])
            return true;
        }
        return false;
    }

    pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (this.isEmpty()) {
            console.log('Stack Underflow')
            return 0;
        }
        const result = this.a.pop();
        this.top--;
        return result;
    }

    peek() {
       //Write your code here
        if(!this.isEmpty()){
            return this.a[this.top]; //checking for isEmpty() stack before peek and showing peek object
        }
        console.log(" Stack Underflow ");
        return 0;
    }
}

let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
