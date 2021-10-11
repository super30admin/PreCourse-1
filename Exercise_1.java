
// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not on leetcode
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/*
 * Track the top on each push and pop 
 * operation
 * 
 */
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
    
    boolean isEmpty() 
    {
		 
        //Write your code here
    	if(top == 0) {
    		return true;
    	}
    	return false;
        
    } 

    Stack() 
    { 
        //Initialize your constructor
    	this.a = new int[MAX];

    } 
  
    boolean push(int x) 
    {
		
        //Check for stack Overflow
    	//Write your code here
		if(top == MAX) {
			System.out.println("stack overflow");
			return false;
		}else if(isEmpty()) {
			top = 0;
		}
		
		a[top] = x;
		
		top++;
    	return true; 
    } 
  
    int pop() 
    {
		
        //If empty return 0 and print "Stack Underflow"
    	if (isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		top--;
    	}
        //Write your code here
    	return a[top]; 
    } 
  
    int peek() 
    {
        //Write your code here
    	if(!isEmpty()) {
    		return a[top-1];
    	}
    	return 0;
    	
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
