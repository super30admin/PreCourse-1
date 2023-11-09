//Gaurav Patil_RN27OCT2021
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not availabe on leetcode
// Any problem you faced while coding this : Nothing 


// Your code here along with comments explaining your approach

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return (root==null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	
    	if(root ==null) {       
    		root = newNode;
    	}
    	else {
    		StackNode top = root;
        	while(top.next!=null) {
        		top = top.next;
        	}
        	top.next = newNode;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(isEmpty()) {                             //Check if stack is empty
    		System.out.print("Stack Underflow\n");  
    		return 0;
    	}
    	StackNode temp = root;
    	if(temp.next == null) {                     //If there is only one node we need to assign root node to null
    		int tdata = temp.data;
    		root = null;
    		return tdata;
    	}
    		
    	while(temp.next.next !=null)                // For more than one nodes we travrse till second last node as we want to remove last node
    		temp = temp.next;                       
    	int tdata = temp.next.data;                 //We save last node data
    	temp.next=null;                             //We remove last node by making second last node point to null 
    	return tdata;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
    	StackNode temp = root;
    	while(temp.next !=null)
    		temp = temp.next;
    	return temp.data;
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
