class Stack { 
    //Please read sample.java file before starting.
	//Kindly include Time and Space complexity at top of each file
		
	// Time Complexity : O(1) for all operations (Except display)
	// Space Complexity : O(n)
	// Did this code successfully run on Leetcode : -
	// Any problem you faced while coding this : No
	
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	boolean var = false ;
    	if (top==-1){ 
    		var = false ;
    	}
    	else
    		var = true;
    	
    	return var;
    } 

    Stack() 
    {     	
        //Initialize your constructor     
    	top =-1; 
    } 
  
    boolean push(int x) 
    { 
    	//Check for stack Overflow
    	if (top== MAX-1) {
    		return false;
    	}
    	else {
	        //Write your code here
    		top++;			
	    	a[top] = x;
	    	return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (isEmpty() == false) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int prev_top_value = a[top];
    		top--;
    		return prev_top_value;
    		
    	}
        
    } 
  
    int peek() 
    { 
        //Write your code here
    	return a[top];
    } 
    
//    void display() {
//    	for (int i=top;i>=0;i--) {
//        	System.out.println(a[i]);
//        }
//    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    {
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
//        s.display();    
        System.out.println(s.pop() + " Popped from stack"); 

    } 
}
