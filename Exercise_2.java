	// Time Complexity :   All methods O(1)
	// Space Complexity : Individual Methods does not take up any space, however, 
	// the LinkedList used to maintain the stack has O(n) where n is the number of elements in the stack.
	// Did this code successfully run on LeetCode : No
	// Any problem you faced while coding this : No 
public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	this.data = data;
        } 
    }  
	
    public boolean isEmpty() 
    {   // Null indicates that the Stack is empty, the root variable is used to keep track the head of the stack. 
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        // here the capacity is not checked as it is out of the scope, assuming we can accommodate any number of elements.
    	StackNode newNode = new StackNode(data);
    	newNode.next = root;
    	root = newNode;
    } 
  
    public int pop() 
    { 		//If Stack Empty Return 0 and print "Stack Underflow"
    	if(root == null) {
    		System.out.println("Stack is Empty: Element cannot be poped");
    		return 0;
    	}
    	else {
    		//Code to pop the topmost element of stack - just move the root to next, 
    		// by have a copy of the popped element use to return.
    		int res = root.data;
    		root = root.next;
    		return res;
    	}
    } 
  
    public int peek() 
    { 
        //Code to just return the topmost element without removing it.
    	if(root == null) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
    	else {
    		return root.data;
    	}
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