// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        // empty Stack check
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        // initialize top/head/root
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        // check for max and push element
        if(this.top < MAX - 1 ) {
            this.top++;
            this.a[this.top] = x;
            return true;
        }
        // else return false 
        return false;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        // check of stack is empty or return pop top element 
       if(this.isEmpty()) {
           System.out.println(" Stack Underflow");
           return 0;
       }  else {
           return this.a[this.top--];
       }
    } 
  
    int peek() 
    { 
        //Write your code here
        // check of stack is empty or return top element 

        if(this.isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }  else {
            return this.a[this.top];
        }
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
