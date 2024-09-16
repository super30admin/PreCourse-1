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
	    return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	    StackNode sn =  new StackNode(data);
	    if(this.root == null) {
		    this.root = sn;
	    } else {
		    sn.next = root;
		    root = sn;
	    }
	    System.out.println (sn.data + " is pushed to Stack");
	    
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    if(!isEmpty()) {
		    int poppedItem = root.data;
		    root = root.next;
		    return poppedItem;
	    } else {
		    System.out.println ("Stack Underflow");
		    return 0;
	    }
	    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    return isEmpty() ? 0 : this.root.data;
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
