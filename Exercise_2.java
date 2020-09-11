public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
             this.data = data;
        	 next = null;
            //Constructor here 
        }

		public StackNode() {
			super();
		} 
    } 

    public boolean isEmpty() 
    { 
      //Write your code here for the condition if stack is empty. 
    	if(root == null) {
    		System.out.println("Stack is empty");
    		return true;}
    	else {
    		System.out.println("Stack is not empty");
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode oldHead = root;
		root = new StackNode();
		root.data = data;
		root.next = oldHead;
    } 
  
    public int pop() 
    
    { 		//If Stack Empty Return 0 and print "Stack Underflow"
    	if (root == null) {
    	System.out.println("Stack Underflow");
    	return 0;
	}
    	//Write code to pop the topmost element of stack.
    	//Also return the popped element 
	int data = root.data;
	root = root.next;
	return data;
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	 { 
    	    	if (root == null) {
    	    	System.out.println("Stack is empty");
    	    	return 0;
    		}
    		int data = root.data;
    		//root = root.next;
    		return data;  
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
