 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	data = data;
        	next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null)
        	return true;
        else
        	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	newNode.next = null;
    	
    	if(root == null)
    	{
    		root = newNode;
    	}
    	else
    	{
    		StackNode last = root;
    		last = last.next;
    		last.next = newNode;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	StackNode last = root;
    	
		StackNode prev = null;
    	if(isEmpty())
    	{
    		System.out.println("Stack Underflow!");
			return 0;
    	}
    	while(last.next != null)
		{
    		prev = last;
			last = last.next;
		}
		
    	prev.next = null;
    	return prev.data;
    } 
  
    public int peek() 
    { 
    	StackNode last = root;
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		while(last.next != null)
		{
			last = last.next;
		}
		return last.data;//Write code to just return the topmost element without removing it.
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
