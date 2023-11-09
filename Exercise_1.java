//Gaurav Patil_RN27OCT2021
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not available on Leetcode
// Any problem you faced while coding this : Nothing 

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top == -1);	//Empty when top is less than 0
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;		//Only top needs to be initialized
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top == MAX-1)		//As array Index is from 0:999
    	{
    		System.out.print("Stack Overflow\n");
    		return false;
    	}
    	a[++top] = x;
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
    		System.out.print("Stack Underflow\n");
    		return 0;
    	}
    	return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) {
    		System.out.print("Stack is Empty\n");
    		return 0;
    	}
    	return a[top];
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
