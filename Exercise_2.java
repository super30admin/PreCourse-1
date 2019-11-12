class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null) {
    		return true;
    	}
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode tmp = new StackNode(data);
    	if(isEmpty()) {
    		root = tmp;
    	}else {
    		StackNode node = root;
    		root           = tmp;
    		root.next      = node;
    	}
    	
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	int popElement = root.data; 	
    	root = root.next;
    	//Also return the popped element 
    	return popElement;	
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(!isEmpty()) {
    		return root.data;
    	}
    	System.out.println("Stack Empty");
    	return 0;
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
