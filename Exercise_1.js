class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
​
    constructor() {
        //Initialize your constructor
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }
​
    isEmpty() {
        // this is the first I thought of computing the array length and making the decision
        if(this.a.length === 0){
            return true;
        }else{
            return false;
        }

    }
​
    push(x) {
        this.a.push(x);
    }
​
    pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(this.isEmpty()){
            console.log(" Stack Underflow");
            return 0;
        }else{
            return this.a.pop()
        }
    }
​
     peek() {
       if(!this.isEmpty()){
           return this.a[this.a.length -1];
       }else{
           console.log(" Stack is empty");
           return;
       }
    }
}
​
let s = new Stack();
s.push(10);
s.push(20);
s.push(30);
console.log(s.pop() + " Popped from stack");
