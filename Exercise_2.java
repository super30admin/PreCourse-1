/*
 * Time Complexity: 
 * 	- push() -> O (1)
 * 	- pop() -> O (1)
 * 	- peek() -> O (1)
 * 	- isEmpty() -> O (1)
 * 
 * Space Complexity: O (1) -> Since, no extra space to store the stack elements
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.precourse1;

public class Exercise_2 {
	StackNode root; // Head Node
	  
    static class StackNode { 
        int data;  // element in LL
        StackNode next;  // pointer to next node
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data; // Initialize data to a new node
        	this.next = null; // Initialize next pointer of a node to null
        } 
    } 
    
	
    public boolean isEmpty() 
    {
    	//Write your code here for the condition if stack is empty.
    	/*
    	 * Check if head/root node of a LL is null
    	 * If yes, then stack is empty, return true
    	 * else, false
    	 */
		return root == null;        
    } 
  
    public void push(int data) 
    { 
    	/*
    	 * Push the data to at beginning of a LL/top of a stack
    	 * 1. Initialize a new node
    	 * 2. If root/head is not null, means stack is not empty, set the head node as next node of newNode
    	 * 3. Update the head node to newNode, newNode becomes head now
    	 * 4. Else, if head/root is null, then newNode becomes head node
    	 */
    	
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	if(root != null) {
			newNode.next = root;
			root = newNode;	
		}
		else{
			root = newNode;
		}
    } 
  
    public int pop() 
    {	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	
    	/*
    	 * If Stack is empty -> root/head node is null, print "stack underflow" and return 0
    	 * Else, 
    	 * 	1. Store the head/root node in a Node type variable "popped"
    	 *  3. Update the head/root node to root.next node -> next node becomes head now
    	 *  4. return the previous head/root node data
    	 */
    	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		StackNode popped = root;
    		root = root.next;
    		return popped.data;    		
    	}	
    } 
  
    public int peek() 
    {
    	/*
    	 * If Stack is empty -> root/head node is null, print "stack underflow" and return 0
    	 * Else, return head/root node data without removing it
    	 */
        //Write code to just return the topmost element without removing it.
    	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		return root.data;
    	}	
    } 
  
	//Driver code
    /*
     * Checking all operations
     */
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        System.out.println(sll.isEmpty());
        System.out.println(sll.peek());
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        sll.push(40);
        sll.push(50);
        sll.push(60);
        System.out.println(sll.isEmpty());
        System.out.println(sll.peek());
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

