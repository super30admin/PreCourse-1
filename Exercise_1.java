// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.io.*;

public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top == -1) {   //Checking whether the stack is empty. If there is no top or null then return true or else False.
            return true;
        } else {
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1; //Initializing top with -1 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top == MAX-1)    //Checking stack overflow, by asserting top and length of stack index. If true then return False.
        {
            return false;
        }
        
        else  //or else increment top and assign the new value to a[top] and return true.
        {
            top++;
            a[top] = x;
            System.out.println(x + " is pushed into stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
       if (top == -1) {    //checking stack underflow, by asserting top and -1. If true then return 0.
            System.out.println("Stack Underflow");
            return 0;
        } else {    // or else decrement top and return the popped element
            top--;
            return a[top + 1];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top == -1) {    //checking stack underflow and returning -1 if true.
            System.out.println("Stack Underflow");
            return -1;
        } 
        else {  // or else printing/returning the top most element.
            System.out.println(a[top]);
            return a[top];
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
