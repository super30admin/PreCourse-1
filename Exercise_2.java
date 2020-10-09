public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            // Constructor here 
        	// Create a new linked list node with data equal to the constructor arg and next pointer to null
        	this.data = data;
        	this.next = null;
        	
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        // Write your code here for the condition if stack is empty.
    	// if root node is null => stack is empty => return true
    	// else return false
    	if (root == null) {
    		return true;
    	} else {
    		return false;
    	}
    	
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	
    	// Strategy: the node to be inserted will be placed at the beginning of the linked list and root pointer moved to the same.
    	
    	// check if the stack is empty before inserting the value passed in the funct param
    	// if yes, then root will point to the new node created for storing the data passed in funct param
    	if (isEmpty()) {
    		root = new StackNode(data);
    		return;
    	} 
    	
    	// executed if the stack is not empty before inserting the value passed in the funct param
    	StackNode st = new StackNode(data);
    	st.next = root;
    	root = st;
    	
    } 
  
    public int pop() 
    { 	
    	//Write code to pop the topmost element of stack.
	
    	// If Stack Empty: Return 0 and print "Stack Underflow"
        if (isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        
      // If stack is not empty: Return the popped element and move root pointer accordingly
    	int popElem = root.data;
    	root = root.next;
    	return popElem;
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	
    	// If Stack Empty: Return 0 and print " Stack Empty"
    	if (isEmpty()) {
    		System.out.println(" Stack Empty");
    		return 0;
    	}
    	// If Stack is not Empty: Return the topmost element of stack
    	// topmost elem is at the root pointer in the linked list
    	return root.data;
    	
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