package com.s30;
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	next.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	if(root == null)
    		return false;
    	else
    		return true;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
    	if(root == null) {
    	 root = new StackNode(data);
        
    	}
    	else {
    		StackNode tail = new StackNode(data);
    		tail.next = root;
    		root = tail;
    	}
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	int data = root.data;
    	root = root.next;
    	return data;
    	
    	
    } 
  
    public int peek() 
    { 
    	return root.data;
        //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
