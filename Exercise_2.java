// Time Complexity : O(1)
// Space Complexity : O(N) where N is the number of elements pushed to the stack.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

// Since there were no clear instructions given about handling exceptions, I am printing statements and return MAX integer values.


class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        /** Initializing the StackNode with the given data and setting next to null since no next node available yet.
         * TC: O(1) */
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
    } 
    
	/** Checks if the list is empty by checking if root is null or not.
	 * TC: O(1) */
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return (root == null);
    } 
  
    
    /**
     * @param data
     * Pushes the given data to the StackAsLinkedList. create a node and make it root.
     * 
     */
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode node = new StackNode(data);
    	node.next = root;
    	root = node;
    	
    } 
  
    /**
     * @return
     * Checks if root is empty, then prints Stack underflow and returns 0. 
     * Else, remove the root and update root as root.next.
     */
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	int x = root.data;
    	root = root.next;
    	return x;
    } 
  
    /**
     * @return
     * if empty list, then returning max value, else returns curr node's data which 
     * is top element of the list.
     * TC: O(1)
     */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    		return Integer.MAX_VALUE;
    	}
    	return root.data;
    }   
} 

class Exercise_2 {
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        sll.peek();
        sll.pop();
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        sll.push(40);
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); // prints underflow and returns 0.
    } 

}
