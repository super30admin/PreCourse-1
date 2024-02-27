class Stack { 
	// Time Complexity : 
	// Space Complexity :
	// Did this code successfully run on Leetcode :
	// Any problem you faced while coding this :


	// Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	return top == null;
    } 

    Stack() 
    { 
        //Initialize your constructor
    	top = null;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top == MAX) {
    		System.out.println("Size Exceeded: Element cannot be pushed");
    		return false;
    	}
    	else {
        	if(top == null) top = -1;
        	top++;
    		a[top] = x;
    		return true;
    	}
    } 
  
    int pop() 
    {
    	if(top == null) {
    		System.out.println("Stack is Empty: Element cannot be poped");
    		return 0;
    	}
    	else {
    		int res = a[top];
    		if(top == 0) top = null;
    		else top--;
    		return res;
    		
    	}
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
    	if(top == null) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
    	else {
    		return a[top];
    	}
        //Write your code here
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
