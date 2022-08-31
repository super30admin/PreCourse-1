// Time Complexity : Worst case : O(MAX) 
// Space Complexity :Worst case : O(MAX)
// Did this code successfully run on Leetcode : It runs successfully on Eclipse
// Any problem you faced while coding this : push() method was confusing to implement.
//											But eventually, did it.


// Your code here along with comments explaining your approach

import java.util.*;

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top == 0)
    		return true;
    	else
    		return false;			
    } 

    public Stack() 
    { 
        //Initialize your constructor
    	top = 0;
    	a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
   
    	if(this.top == MAX)
    	{
    		throw new StackOverflowError("Stack is full");
    	}
    	//If no overflow, then push
    	a[top] = x;
    	top++;
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
     
    	if(isEmpty())
    	{
    		throw new EmptyStackException();
    	}
    	// pop operation only when stack is not empty
    	return a[--top];
    } 
  
    int peek() 
    { 
        //returning an element
    	return this.top;
    	
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
