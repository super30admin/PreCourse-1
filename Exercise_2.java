class StackAsLinkedList { 
	
	static StackNode root; 
	static StackNode top;
	
	public StackAsLinkedList() 
	{
		root= null;
		top = root;
	}
  
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
    	if (top == null)
    		return true;
    	return false;
    } 
    
  
  
    public void push(int data) 
    { 
    	StackNode temp = new StackNode(data);
    	temp.data = data;
    	temp.next = top;
    	top=temp;
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
    	
    	if (this.isEmpty()) 
    	{
    		System.out.println("Stack Underflow ");
    		return 0;
    	}
    	
    	int val = this.peek();
    	top = top.next;
    	
    	return val;
    	
    } 
  
    public int peek() 
    { 
    	 if (this.isEmpty())
    	 	System.out.println("No elements in stack ");
    	 return top.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println("Stack is empty: " + sll.isEmpty());
        sll.push(10); 
        
  
        
  
        System.out.println("Top element is " + sll.peek());
        
        sll.push(20); 
        System.out.println("Top element is " + sll.peek());
       
        sll.push(30);
        System.out.println("Top element is " + sll.peek());
        System.out.println("Stack is empty: " + sll.isEmpty());
        
        for(int i =0;i<3;i++) {
        	System.out.println(sll.pop() + " popped from stack");
        }
        System.out.println(sll.pop() + " popped from stack");
        
    } 
} 
