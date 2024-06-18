// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Not tested on leetcode
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Stack implementation - LIFO: Last In First Out linear data structure using Array in JS
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
      constructor() {
          //Initialize your constructor
          this.MAX = 2;
          this.top = -1;
          this.a = new Array(this.MAX);
      }
      isEmpty() {
          //Write your code here
          var isEmpty = (this.top < 0);
          return isEmpty;
      }
      push(x) {
          //Check for stack Overflow
          //Write your code here
          if(this.top >= this.MAX-1)
              console.log('Stack Overflow');
          else {
              this.top++;
              this.a[this.top] = x;
              console.log(`${x} pushed into stack`);
          }
      }
      pop() {
          //If empty return 0 and print " Stack Underflow"
          //Write your code here
          if(this.top < 0){
              console.log('Stack Underflow');
              return 0;
          }
          else {
              var popVal = this.a[this.top];
              this.top--;
              return popVal;
          }
      }
      peek() {
         //Write your code here
         if(this.top < 0)
              console.log('Stack Underflow');
         else {
              return this.a[this.top];
         }
      }
  }
  var s = new Stack();
  s.push(10);
  s.push(20);
  s.push(30);
  console.log(s.pop() + " Popped from stack");