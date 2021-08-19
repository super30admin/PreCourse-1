// Time Complexity : O(1)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this :No

public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if (this.root == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	if (this.root == null) {
    		this.root = new StackNode(data);
    	}
    	else {
//    		StackNode temp = root;
    		StackNode newNode = new StackNode(data);
    		newNode.next = root;
    		root = newNode;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if (this.root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} 
    	else {
    		int val = root.data;
    		root = root.next;
    		return val;
    	}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	return root.data;
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

