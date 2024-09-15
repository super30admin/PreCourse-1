public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
		root = null;
		this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
	    return next == null;
	    
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	    StackNode temp = new StackNode();
	  
	    if(isEmpty())
		    return;
	    
	    temp.data = data;
	    temp.link = next;
	    next = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    if(isEmpty()){
		    System.out.println("Stack Underflow");
		    return 0;
	    }
	    
	    StackNode temp = new StackNode();
	    temp = next;
	    next = (next).link;
	    return temp;
	    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	     if(isEmpty()){
		    System.out.println("Stack Underflow");
		    return;
	    }
	    
	    StackNode temp = new StackNode();
	    temp = next;
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
