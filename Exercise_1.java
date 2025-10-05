class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
	// Time Complexity : O(1)
	// Space Complexity : O(1)
	// Did this code successfully run on Leetcode :
	// Any problem you faced while coding this : 
    static final int MAX = 1000; 
    int top; 
    int a[]; 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top = -1;
    	a = new int[MAX]; // Maximum size of Stack 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top == MAX - 1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	a[++top] = x; // pre increment the top and set the value to be inserted
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} 
    	return a[top--]; // decrement the top and return the value 
    } 
  
    int peek() 
    { 
        //Write your code here
    	return a[top]; // return the top most element
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
