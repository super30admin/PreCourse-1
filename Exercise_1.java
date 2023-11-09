import java.util.EmptyStackException;

import org.w3c.dom.ls.LSException;

// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A, worked on test cases
// Any problem you faced while coding this : throw EmptyStackException instead of returning 0 - is this correct?


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[];
  
    boolean isEmpty() 
    {
        if (top == -1)
        {
            return true;
        }
        return false;
    }

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
        a = new int[MAX]; // Maximum size of Stack 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == a.length) // stack is full - cannot push any new items
        {
            throw new StackOverflowError();
        }

        // otherwise push into stack
        top++;
        a[top] = x;
        return true;
    } 

    int pop() 
    { 
        //If empty return true and print "Stack Underflow"
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        //Write your code here
        int y = a[top]; // store element at top
        top--;
        return y; // true
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return a[top]; // return element at top of stack
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
        System.out.println(s.peek()); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek()); 
    } 
}
