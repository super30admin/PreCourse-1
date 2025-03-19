class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    constructor() {
        //Initialize your constructor
        // this.MAX = 1000;
        this.top = -1;
        this.a = new Array();
    }

    isEmpty() {
        //Write your code here
        this.a.length === 0;
    }

    push(x) {
        //Check for stack Overflow
        //Write your code here
        this.a.push(x);
    }

    pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        return this.a.splice(this.a.length - 1,1);
    }

    peek() {
       //Write your code here
       return this.a[this.a.length-1];
    }
}
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
