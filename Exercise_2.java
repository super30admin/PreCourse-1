// Time Complexity : push,pop,peek - o(n), isEmpty - o(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Ran tests in the local
// Any problem you faced while coding this :

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
    { 
	    	if(root == null) {
	    		return true;
	    	} else {
	    		return false;
	    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    		StackNode node = new StackNode(data);
    		
    		if(root == null) {
    			root = node;
    		} else {
    			StackNode itr = root;
    			
    			while(itr.next != null) {
    				itr = itr.next;
    			}
    			
    			itr.next = node;
    		}
    		
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	
    		if(root == null) {
    			System.out.println("Stack Underflow");
    			return 0;
    		}
    		
    		if(root.next == null) {
    			int data = root.data;
    			root = null;
    			return data;
    		}
    		
    		StackNode top = root.next;
    		StackNode prev = root;
    		
    		while(top.next != null) {
    			prev = top;
    			top = top.next;
    		}
    		
    		prev.next = null;
    		return top.data;
    } 
  
    public int peek() 
    { 
	    	//Write code to just return the topmost element without removing it.
	    	if(root == null) {
	    		System.out.println("Stack Underflow");
	    		return 0;
	    	}
	
	    	StackNode top = root;
	
	    	while(top.next != null) {
	    		top = top.next;
	    	}
	
	    	return top.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    		StackAsLinkedList sll = newStackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
