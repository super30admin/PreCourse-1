// Time Complexity : 
	/*
	 * push() : O(1)
	 * pop() : O(n)
	 * peek(): O(1);
	 */
	
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Not on leetcode
// Any problem you faced while coding this :
	/*
	 * 
	 */

// Your code here along with comments explaining your approach
/*	
 * for push operation finding top node
 * to insert the next node
 */

public class StackAsLinkedList { 
  
    StackNode root;
    StackNode top;

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null || root.next == null) {
        	return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 	
        //Write code to push data to the stack.
    	if(root == null) {
    		root = new StackNode(0);
    		top = root;
    	}
    	StackNode newTop = new StackNode(data);
    	top.next = newTop;
    	top = newTop;
    	
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
        //Write code to pop the topmost element of stack.
    	int topElement =  top.data;
    	StackNode node = root;
    	while(node.next.next != null) {
    		node = node.next;
    	}
    	top = node;
    	top.next = null;
    	
	    //Also return the popped element 
    	return topElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	return top.data;
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
