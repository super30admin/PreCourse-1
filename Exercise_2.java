//Time Complexity : O(1) constant time for all operations
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this : no


//Your code here along with comments explaining your approach


class StackAsLinkedList { 
	  
    StackNode root; // root will always point to the current top element
  
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
    	
    	return root == null; // if root not pointing to anything, then stack is empty
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);  //making a new node with the supplied data
    	newNode.next = root; // pointing the new node's next to where the root is pointing
    	root = newNode; // pointing the root to the new node , as it is the top element
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) { // if root is null, then its a stack underflow
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	StackNode topElement = root; // getting the top element from root
    	root = root.next; // pointing root to element next to it, to change the root's position
    	return topElement.data; // returning the top element data
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) { 
    		return 0;
    	}
    	
    	return root.data; // since root will be pointing to the top element, returning its data 
    	
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
