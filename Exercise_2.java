public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return root == null? true : false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode node = new StackNode(data);
    	
    	if (root != null)
    	    node.next = root;
    	
    	root = node;
    	
    		
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if (root == null) {
    	System.out.println("Stack Underflow");
    	return 0;
    	}
  //Write code to pop the topmost element of stack.
    else {
    	int popElement = root.data;
    	root = root.next;
    	//Also return the popped element 
    	return popElement;
    	}      
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if (root == null)
    		return 0;
    	else
    		return root.data;
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
