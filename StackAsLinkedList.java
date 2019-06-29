public class StackAsLinkedList { 
  
    static StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data  = data;
        	next = null;
        	
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null)
    		return true;
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode temp = new StackNode(data);
    	if(root == null)
    	{
    		root = temp;
    	}
    	else
    	{
    		StackNode temp1 = root;
    		root = temp;
    		root.next = temp1;
    	}
    } 
  
    public int pop() 
    { 	
    	int topElement;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	if(isEmpty())
    	{
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	else
    	{
    		topElement = root.data;
    		root = root.next;
    		return topElement;
    	}
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	int topElement;
    	if(isEmpty())
    	{
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	else
    	{
    		topElement = root.data;
    		return topElement;
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
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
