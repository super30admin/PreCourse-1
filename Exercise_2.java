//TC: O(1) 
//SC: O(1)

class StackAsLinkedList { 
  
    StackNode root; 

   
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	
        	this.data = data;
        	
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	
    		return (root == null);
    	
    	
    } 
  
    public void push(int data) 
    { 
    	StackNode newnode = new StackNode(data);
        //Write code to push data to the stack. 
    	if(root == null) {
    		root = newnode;
        	
    	} else {
    		StackNode temp = root;
    		root = newnode;
    		newnode.next = temp;
        	  	
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	int poppedEl = Integer.MIN_VALUE;
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		
    	} else {
    		poppedEl = root.data;
    		root = root.next;
    		
    	}
    	return poppedEl;
    	
    } 
  
    public int peek() 
    { 
    	
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	} else {
    		return root.data;
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