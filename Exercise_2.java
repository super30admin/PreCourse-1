//public class StackAsLinkedList {

	
	//Time Complexity: O(1) for all operations
	//Space Complexity: O(n)
	//Did this code successfully run on Leetcode : -
	//Any problem you faced while coding this : No


public class Exercise_2 { 
  
    StackNode root; 
    StackNode current = null ;
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
    	if (root==null) {
    		return true;
    	}
    	else
    		return false;
    } 
  
    public void push(int data) 
    { 
    	StackNode temp = new StackNode(data);
    	
    	if (root==null) {
    		root = temp;
    		current = root;    		
    	}
    	else {
    		while(current.next!=null) {
    			current = current.next;
    		}
    		current.next = temp;
    		current = current.next;
    	}
        //Write code to push data to the stack. 
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	StackNode temp = root;
    	
    	if (isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		while(temp.next.next!=current) {
    			temp = temp.next;
    		}
    		//temp.next=current;
    		current = temp.next;
			//current.data = temp.next.data;
			return current.next.data;
    	}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	return current.data;
    	
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
