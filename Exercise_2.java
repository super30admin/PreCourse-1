// Time Complexity : O(1)
// Space Complexity : O(n) where n is the size of the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
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
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        if(isEmpty()) {
        	 StackNode curr = new StackNode(data);
        	 root = curr;
        	 return;
        }
        
        StackNode prev = root;
        while(prev.next != null) {
        	prev = prev.next;
        }
        
        StackNode curr = new StackNode(data);
   	 	prev.next = curr;        
        
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	StackNode curr = root;
        while(curr.next.next != null) {
        	curr = curr.next;
        }
        
        int temp = curr.next.data;
    	curr.next = null;
    	return temp;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	StackNode curr = root;
        while(curr.next != null) {
        	curr = curr.next;
        }
    	return curr.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        sll.push(10); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
