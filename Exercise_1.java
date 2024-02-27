class Stack { 
	// Time Complexity :   All methods O(1)
	// Space Complexity : Individual Methods does not take up any space, however, array used to maintain the stack has O(1000)
	//                    At any given time there exists the array of size 1000.   
	// Did this code successfully run on LeetCode : No
	// Any problem you faced while coding this :
		// using index -1 to determine if the stack is empty or not seemed a little "Hack-y".
		// wanted to use null instead, since I'm new to Java, not sure how to use integer type with null. 

	// Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	return top == -1; // Use -1 to indicate that the stack is empty since 
    } 

    Stack() 
    { 
        //Initialize your constructor
    	top = -1; // Initialize -1 to indicate that the stack is empty. 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top == MAX) {
    		System.out.println("Size Exceeded: Element cannot be pushed");
    		return false;
    	}
    	else {
        	// Top Maintains the current top, we will need to push to the next index
            // works even for empty stacks since the empty stacks are denoted by -1.
    		a[++top] = x;
    		return true;
    	}
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
    	if(top == -1) {
    		System.out.println("Stack is Empty: Element cannot be poped");
    		return 0;
    	}
    	else {
    		return a[top--];
    	}
    } 
  
    int peek() 
    { 
    	if(top == -1) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
    	else {
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