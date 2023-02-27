package learning;

public class StackAsLinkedList { 
	  
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
    
	
    public boolean isEmpty() 
    { 
    	if(root== null)	{
    		System.out.println("stack is empty");
    		return true;
    	}
    	return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 	if(root== null)	{
    	StackNode node = new StackNode(data);
    	node.next = null;
    	root = node;
    }
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
    	if(root == null)	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else	{
    		int tmp = root.data;
    		root = root.next;
    		return tmp;
    	
    	} 
    } 
  
    public int peek() 
    { 
    	if(root == null) {
    		return 0;
    	}
    	int val = root.data;
    	System.out.println("top element on peek is --> " + val);
    	return val;
        //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(40); 
        sll.peek();
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 