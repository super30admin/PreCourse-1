class Stack { 
	// Time Complexity : O(1)
	// Space Complexity : O(n) if we consider the input list
	// Did this code successfully run on Leetcode : Didn't find this on leetcode. Maybe provide
	// a link if available.
	// Any problem you faced while coding this : Particularly, pop and push implementations were a
	// little challenging - returning the next element after decrementing top. Nothing difficult as such.
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() { 
        //Initialize your constructor 
    	top = -1;
    } 
    
    boolean isEmpty() { 
        return top == -1;
    } 
  
    boolean push(int x) { 
        //Check for stack Overflow
        //Write your code here
    	if(top + 1 == MAX) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	
    	top += 1;
    	a[top] = x;
    	return true;
    } 
  
    int pop() { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top == -1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	top--;
    	return a[top + 1];
    } 
  
    int peek() { 
        //Write your code here
    	if(top == -1) {
    		System.out.println("Stack Underflow");
    		return -1;
    	}
    	return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
