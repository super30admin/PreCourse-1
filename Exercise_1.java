package com.s30.edu.precourse1;

class Stack {
	
	//static final int MAX = 1000; 
	static final int MAX = 5; 
    int top; 
    int array[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
    	/*
    	 * if top == -1, then stack is empty, return true
    	 * else, return false
    	 */
    	//Write your code here 
    	return top == -1;  
    } 

    public Stack() 
    { 
        //Initialize your constructor
    	array = new int[MAX];
    	top = -1;
    } 
  
    boolean push(int x) 
    {
    	/*
    	 * If condition is true until top < MAX-1, push element until this point
    	 * else, print "stack overflow" and return false, otherwise we will get ArrayIndexOutOfBoundsException
    	 */
        //Write your code here
    	if(top < MAX-1) {
    		top++;
        	array[top] = x;
    		return true; 
    	}
    	else {
    		System.out.println("Stack Overflow");
    		return false;
    	}
        
    } 
  
    int pop() 
    {
    	/*
    	 * If empty return 0 and print " Stack Underflow"
    	 * else, return the top element and decrement top by 1
    	 */
    	//Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		int element = array[top];
        	top--;
    		return element; 
    	}	
        
    } 
  
    int peek() 
    {
    	/*
    	 * If stack is not empty, then return the top element from stack
    	 * else, print "stack underflow" and return 0
    	 */
    	//Write your code here
    	if(!isEmpty()) {
    		return array[top]; 
    		
    	}
    	else{
    		System.out.println("Stack Underflow");
        	return 0;
    	}
    	
    }
    	
} 
   
  
// Driver code 
public class Exercise_1 { 
	
	/*
	 * Checking for all operations
	 */
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.peek();
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
        //s.push(20); 
        //s.push(30); 
        //System.out.println(s.pop() + " Popped from stack"); 
        //System.out.println(s.pop() + " Popped from stack");
    } 

}
