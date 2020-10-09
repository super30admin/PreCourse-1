class Stack { 
    static final int MAX = 2; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    
  
    boolean isEmpty() 
    { 
    	// Check last inserted element of stack using top variable
    	if (top == -1) {
    		return true;
    	} else {
    		return false;
    	}
        		
    } 

    Stack() 
    { 
        // Initialize your constructor 
    	// Resetting top to -1 so that index of last inserted element of stack gets resetted to -1
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        // Check for stack Overflow
        // Increment top pointer by 1 for adding the new element to stack
    	// Before adding, check if top doesn't exceed the MAX number of elements limit for the stack
    	top++;
    	
    	// if top exceeds MAX number of elements limit for the stack:
    	//      show Stack overflow msg
    	//      return false
    	if (top >= MAX) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	
    	// if top doesn't exceed MAX number of elements limit for the stack:
    	//     add element to array 
    	//     return true
    	a[top] = x;
    	return true;
    	
    } 
  
    int pop() 
    { 
    	// If stack is empty, print " Stack Underflow" and return 0
    	if (this.isEmpty()) {
    		System.out.println(" Stack Underflow");
    		return 0;
    	}
    	// If stack is not empty:
    	//      return the element at top index in array
    	//      decrement top by 1.
    	else {
    		int popElem = a[top];
    		top--;
    		return popElem;
    	}
    	
    } 
  
    int peek() 
    { 
    	// If stack is empty, print " Stack Underflow" and return 0
    	if (this.isEmpty()) {
    		System.out.println(" Stack Empty");
    		return 0;
    	}
    	// If stack is not empty,return element at the top index.
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
