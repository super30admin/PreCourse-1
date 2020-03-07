class StackAsLinkedList { 
  
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
    
    StackAsLinkedList()
    {
    	root = new StackNode(Integer.MAX_VALUE);
    }
	
    public boolean isEmpty() 
    { 
        if(root.next == null)
        {
        	return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //root here is treated as dummy just pointing to stack top always and has no data field
    	if(root.next == null)
        {
        	root.next = new StackNode(data);
        	return;
        }
        StackNode temp = root.next;
        StackNode nodeToBeInserted = new StackNode(data);
        nodeToBeInserted.next = temp;
        root.next = nodeToBeInserted;
        //return root 
        return;
    } 
  
    public int pop() 
    { 	
    	if(root.next == null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int stackTop = root.next.data;
    	root.next = root.next.next;
    	return stackTop;
    } 
  
    public int peek() 
    { 
    	if(root.next == null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return root.next.data;
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
