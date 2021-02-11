public class StackAsLinkedList { 
  
    StackNode root; 
  
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
    	if(root==null)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
    	StackNode node = new StackNode(data);
    	if(root == null)
    	{
    		root = node;
    	}
    	else
    	{
    		StackNode temp =root;
    		root = node;
    		root.next = temp;
    	}
    	System.out.println("Pushed");
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
    	if(root==null)
    	{
    		System.out.println("Stack Underflow");
    		return -1;    		
    	}
    	else
    	{
    		StackNode temp = root;
    		root = root.next;
    		return temp.data;
    	}
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null)
    	{
    		System.out.println("Stack Underflow");
    		return -1;
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
  
        sll.pop();
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack"); 
        sll.push(40);
        System.out.println("Top element is " + sll.peek()); 
    } 
} 