/* Time Complexity :
 * 	initializing the stack, push, pop, peek, and isEmpty - O(1)
 * */

/* Space Complexity :
 * 	push, pop, peek, and isEmpty - O(1)
 * 	initializing the stack - O(n) - As we create an array of size 'n'
 * */
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : -

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
    	/*
    	 * If the top value is less than 0, then returns true
    	 * else false*/
		return top<0;          
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
    	//If Array is of size 10 then the max value of top will be 9 i.e.,(10-1)
    	/*If stack is full, then overflow
    	 * else increment top value and insert value of 'x' at this incremented top index  
    	 * */
    	if(top >= MAX-1) {
    		System.out.println("Error - Stack Overflow");
    		return false;
    	}
    	else {
    		a[++top] = x;
    		System.out.println("Pushed " + x + " into stack at index: " + top);
    		return true;
    	}    	
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	/*If stack is empty, then Underflow
    	 * else return value present at top index and then decrement top value
    	 * */
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else{
    		System.out.println("POP : current value of top " + top);
    		return a[top--];
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	/*If stack is empty, then Underflow
    	 * else return value present at top index 
    	 * */
		if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else{
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
        System.out.println("Current value of top-index " + s.top);
        System.out.println("Top element is " + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        
        System.out.println("Current value of top-index " + s.top);
        System.out.println("Top element is " + s.peek());
        
        s.push(25);
        System.out.println("Current value of top-index " + s.top);
        System.out.println("Stack is empty - " + s.isEmpty());
        
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Current value of top-index " + s.top);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Current value of top-index " + s.top);
        
        System.out.println("Top element is " + s.peek());
        System.out.println("Stack is empty - " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        
        System.out.println("Current value of top-index " + s.top);
        System.out.println("Top element is " + s.peek());
        System.out.println("Stack is empty - " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        
        s.push(22);
        System.out.println("Top element is " + s.peek());
        System.out.println("Stack is empty - " + s.isEmpty());
    } 
}
