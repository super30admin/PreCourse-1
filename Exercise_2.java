class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	/**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    public boolean isEmpty() 
    { 
        return root == null;
    } 
    
    /**
     * push to front of the stack
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    public int pop() 
    { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int poppedElement = root.data;
        root = root.next;
	    //Also return the popped element 
        return poppedElement;
    } 
  
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return -1;
        }
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
