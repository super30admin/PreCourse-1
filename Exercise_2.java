//Complexity Analysis:
//
//        Time Complexity: O(1), Only a new node is created and the pointer of the last node is updated. This includes only memory allocation operations. Hence it can be said that insertion is done in constant time.
//        Auxiliary Space: O(1), No extra space is used.
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if (root == null) return false;
    	else return true;
    } 
    
    
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode = new StackNode(data);
    	newNode.data = data;
    	newNode.next = root;
    	root = newNode;
    } 
  
    public int pop() 
    { 	
    	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack underflow");
    		return 0;
    	}else {
    		//remove element from top.
    		System.out.println("popped the top element"+root.data);
    		int topElement = root.data;
    		root = root.next;
    		return topElement;
    	}
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(!isEmpty()) {
    		return root.data;
    	}else {
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
