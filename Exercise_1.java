package com.s30;
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	 return top == -1;
    } 

    Stack() 
    { 
    	a = new int[MAX];

    	top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
    	a[++top] = x;
    	if(isFull())
    		return false;
    	else
    		return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
    	return a[top--];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    public Boolean isFull() {
        return top == MAX - 1;
      }
    int peek() 
    { 
    	return a[top-- + 1];
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
