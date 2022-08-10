	//Precourse 1: Exercise 2    --  Implementing stack using LinkedList
	// Time Complexity : O(n) as traversal and insertion for n elements takes O(n) elements
	// Space Complexity : O(n), in worst case if there is no pop operation only push operation means we will insert all n elements in stack. Hence, O(n)
	// Any problem you faced while coding this : no


	// Your code here along with comments explaining your approach
/*output Pushed 10 data into the stack
Pushed 20 data into the stack
Pushed 30 data into the stack
30  is popped from stack
Top element is via peek operation is 20*/


public class Stack_LinkedList {
	  
	    StackNode root=null; 
	    public int nodesCount=0;
	    
	    static class StackNode { 
	        int data; 
	        StackNode next; 
	  
	        StackNode(int data) 
	        { 
	            //Constructor here 
	        	this.data=data;
	        } 
	    } 
	   		
	    public boolean isEmpty() 
	    { 
	        //Write your code here for the condition if stack is empty. 
	    	if(root ==null) {
	    		System.out.println("The stack is EMPTY!");
	    		return true;
	    	}
	    	else {
			return false;}
	    } 
	  
	    public void push(int data) 
	    { 
	    	StackNode node = new StackNode(data);
	        //Write code to push data to the stack.
	    	node.data = data;
	    	node.next=root;
	    	root = node;
	    	System.out.println("Pushed "+data+" data into the stack");
	    	nodesCount++;
	    } 
	  
	    public int pop() 
	    { 	
	    	int result=0;
		//If Stack Empty Return 0 and print "Stack Underflow"
	    	if(isEmpty()) {
	    		System.out.println("Can't pop the items. Stack is underflowed!!");
	    		return 0;
	    	}
	        //Write code to pop the topmost element of stack.
	    		result = root.data;
	    		nodesCount--;
	    		root=root.next;
		//Also return the popped element 
			return result;
	    } 
	  
	    public int peek() 
	    { 
	        //Write code to just return the topmost element without removing it.
	    	int result=0;
	    	result = root.data;
	    	return result;
	    } 
	  
		//Driver code
	    public static void main(String[] args) 
	    { 
	  
	    	Stack_LinkedList sll = new Stack_LinkedList(); 
	  
	        sll.push(10); 
	        sll.push(20); 
	        sll.push(30); 
	  
	        System.out.println(sll.pop() + "  is popped from stack"); 
	  
	        System.out.println("Top element is via peek operation is " + sll.peek()); 
	    } 
}
