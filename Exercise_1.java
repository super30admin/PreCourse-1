// Time Complexity : O(1), pop operation is O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially failed


// Your code here along with comments explaining your approach

public class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty()   
    { 
        //Write your code here 
    	if(top < 0)
    	{
    		System.out.println("Stack Underflow");
    		return true;
    	}
		return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top> MAX -1)
    	{
    		System.out.println("Stack is overflown");
    		return false;
    	}
    	else
    	{
    		a[++top] =x;
    		return true;
    	}
    		
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	int popstack =0;
        //Write your code here
    	if(!isEmpty())
    	{
    		 popstack = a[top--];
    		 return popstack;
    	}
    	else
    	{
    		isEmpty();
    		return 0;
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	int peekNum=0;
    	if(!isEmpty())
    	{
    		peekNum = a[top];
        	return peekNum;
    	}
    	else
    	{
    		isEmpty();
    	}
    	return peekNum;
    	
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
