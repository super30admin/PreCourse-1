
 class StackAsLinkedList { 
	  
    StackNode root; 
    StackNode head; 
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
        //Write your code here for the condition if stack is empty. 
    	
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode n = new StackNode(data);
    	if(root == null)
    	{ head = n;
    		 root = n;
    		
    	}else
    	{
    		root.next = n;
        	root = n;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
      //delete
    	StackNode n = head;
    	
    	while(n.next.next != null)
    	{
    		n = n.next;
    	}
    	
      n.next = null;
      int x = root.data;
      root = n;
      
    	return x;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null)
    		return root.data;
    	return -1;
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
