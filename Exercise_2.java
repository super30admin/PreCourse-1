import StackAsLinkedList.StackNode;

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	if(root==null)
    		return true;
    	else
    		return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
    	
    	if(root==null)
    	{
    		root=new StackNode(data);
    	}
    	else
    	{
    		StackNode newnode=new StackNode(data);
    		StackNode temp=root;
    		root=newnode;
    		newnode.next=temp;
    		
    	}
    	System.out.println("data is pushed"+data);
    	
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root==null)
    		return 0;
    	else
    	{
    		int x=root.data;
    		root=root.next;
    		return x;
    	}
    } 
  
    public int peek() 
    { 
    	if(root==null)
    		return 0;
    	else
    		return root.data;
        //Write code to just return the topmost element without removing it.
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
