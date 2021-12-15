// Time Complexity : push and pop : O(1)
// Space Complexity : O(N) where N is the capacity of the stack
// Did this code successfully run on Leetcode : Ran it locally on IDE and works
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    /*
      Logic implemented to keep top always greater than 0
      and less than capacity
    */
    boolean isEmpty()
    {
        //Write your code here
        return this.top < 0;
    }

    /*
      array has already been initialized, so initialized the top
      with -1 which represents empty stack in this case.
    */
    Stack()
    {
        //Initialize your constructor
        this.top = -1;
    }

    /*
      if top is less than the capacity
      then number added at the top of the stack by incrementing the top variable
      and assigning the value to the array at that location
    */
    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(this.top < MAX - 1){
          this.a[++this.top] = x;
          return true;
        }

        return false;
    }

    /*
      checking if not empty then decrement the top variable
      else if empty, returing 0 and printing " Stack Underflow"
    */
    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()){
          System.out.println("Stack underflow");
          return 0;
        }
        else{
          return this.a[this.top--];
        }
    }

    /*
      returning the element at top position if not empty else returning -1
    */
    int peek()
    {
        //Write your code here
        if(!this.isEmpty()){
          return this.a[this.top];
        }

        return -1;
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
