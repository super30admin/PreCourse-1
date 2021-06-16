class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
            this.next=null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	StackNode temp=root;
    	
    	if(temp.next==null)
    		return true;
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	
    	StackNode nn=new StackNode(data);
    	if(root==null)
    	{
    		this.root=nn;
    	}
    	else
    	{
    		StackNode temp=root;
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		temp.next=nn;
    		nn.next=null;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	
    	if(isEmpty()) 
    	{
    		System.out.println("Stack UnderFlow");
    		return 0;
    	}
    	else
    	{
    		StackNode temp=root;
    		while(temp.next.next!=null)
    		{
    			temp=temp.next;
    		}
    		int removedValue=temp.next.data;
    		temp.next=null;
    		return removedValue;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	StackNode temp=root;
    	while(temp.next!=null)
    		temp=temp.next;
    	
    	return temp.data;
    	
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
