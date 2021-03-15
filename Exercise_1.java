import java.lang.*;
import java.util.*;
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(this.top==0) return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top=0;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(this.top==MAX-1) return false;
        a[this.top]=x;
        ++this.top;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } 
        --top;
        return a[top];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(this.isEmpty()) return 0;
        return a[top-1];
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

/*
 *  Time Complexity: O(1) to push pop and peek for the stack as we keep the pointer to the top element. Here N is the number of elements.
 *  Space Complexity: O(N) to store all the element in the array.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  Hold the pointer to the top element in the array with a variable and using that variable perform the basic operations like push pop and peek.
 */
