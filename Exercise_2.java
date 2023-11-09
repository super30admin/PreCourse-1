// Excercise - 2

// Time Complexity : 
// isEmpty - O(1) 
// push - O(1)
// peek - O(1)
// poll - O(n) as we need to traverse till the end n nodes
// Space Complexity : O(n) where n is the no of nodes in list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.io.*; 
   class StackAsLinkedList { 
  
    StackNode root; 
    StackNode ptr; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
            return false;
        return true;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if(root==null) {
            root = newNode;
            ptr = newNode;
            return;
        }
        ptr.next = newNode;
        ptr = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	if(root == null) {
	    System.out.println("Stack Underflow");
	    return 0;
	}
        //Write code to pop the topmost element of stack.
    StackNode curr = root;
    while(curr.next.next != null) {
        curr=curr.next;
    }
	//Also return the popped element 
	int n = curr.next.data;
	curr.next = null;
	ptr = curr;
	return n;
	
    } 
  
    public int peek() 
    {    if(root == null) {
        return 0;
    }
        //Write code to just return the topmost element without removing it.
        return ptr.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
