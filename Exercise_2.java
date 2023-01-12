// Time Complexity : TC is specified on top of each method
// Space Complexity : O(N) where N is the number of elements pushed to the stack.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

// Since there were no clear instructions given about handling exceptions, I am printing statements and return MAX integer values.


class StackAsLinkedList { 
  
    StackNode root; 
    StackNode curr;
  
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
     * Pushes the given data to the StackAsLinkedList. Checks if root is empty.
     * If empty, then sets root as given data and assign another variable pointing to root.
     * If root is not empty, then we just add the given data to the next of curr variable.
     * curr variable points to the top of the list every time. After adding the node to the list,
     * we update curr to the latest node.
     * TC: O(1)
     */
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	if(root == null) {
    		root = new StackNode(data);
    		curr = root;
    	} else {
    		StackNode node = new StackNode(data);
    		curr.next = node;
    		curr = curr.next;
    	}
    	
    } 
  
    /**
     * @return
     * Checks if root is empty, then prints Stack underflow and returns 0. Else, we iterate through
     * the list to reach the end of the list. Also, we store the previous element of each iteration
     * so that once we reach the end, we just update previous node's next as null, thus deleting the
     * top element. Then previous element will be updated to the curr variable to make it the top element.
     * TC: O(N) where N is the number of elements in the list.
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
    	StackNode temp = root;
    	StackNode prev = null;
    	while(temp.next != null) {
    		prev = temp;
    		temp = temp.next;
    	}
    	int x = temp.data;
    	prev.next = null;
    	curr = prev;
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
    	return curr.data;
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
    } 

}
