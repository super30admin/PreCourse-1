public class StackAsLinkedList { 
  
    StackNode top; 
    
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
    	return top == null;
    } 
  
    @SuppressWarnings("unused")
	public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode new_node = new StackNode(data);
    	new_node.data = data;
    	new_node.next = top;
    	top = new_node;
    	System.out.println(top.data);
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(top == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int first = top.data;
    	top = top.next;
    	return first;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(!isEmpty())
    		return top.data;
    	else {
    		System.out.println("Stack is Empty");
        	return -1;
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
