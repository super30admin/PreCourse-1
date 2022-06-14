// Time Complexity 
//Push Operation : O(1)
//Pop  Operation : O(1)
//Peek Operation : O(1)
//isEmpty Operation : O(1) 

//Space Complexity : O(n) 



public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null)
    	{
    		return true;
    	}
    	
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	newNode.next = root;
    	root = newNode;
    	
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
    	int val = root.data;
    	root = root.next;
    	return val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null)
    	{
    		return root.data;
    	}else
    	{
    		System.out.println("Stack Underflow");
    	}
    		return 0;
    	}
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        sll.push(40);
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

