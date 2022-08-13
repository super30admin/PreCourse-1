class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int temp_data) 
        { 
            //Constructor here 
        	data = temp_data;
        	
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null)
    	{return true;
    	}
    	else
    		return false;
    } 
  
    public void push(int data) 
    { 
        StackNode stacknode = new StackNode(data);
        if(root==null)
        {	root = stacknode;
        }
        
        else if(stacknode!=null)
        {
        	stacknode.next = root;
        	root = stacknode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root==null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else
    	{
    		int popval = root.data;
    		root = root.next;
    		return popval;
    	}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
     if(root==null)
     {return -1;
     }
     
     else
     {
     return root.data;
     }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop());
       
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
