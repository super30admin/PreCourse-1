//Time Complexity :O(1)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
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
    	return (root == null ? true : false);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode s = new StackNode(data);
    	if(this.isEmpty()) {
    		root = s;
    	}
    	else {
    		s.next = root;
    		root = s;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	int value;
    	if(this.isEmpty()) {
    		System.out.println("Stack Underflow");
    		value = 0;
    	}
        //Write code to pop the topmost element of stack.
    	else {
    		value = root.data;
    		root = root.next;
    	}
	//Also return the popped element 
    	return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	int value;
    	if(this.isEmpty()) {
    		value = 0;
    	}
    	else {
    		value = root.data;
    	}
    	return value;
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