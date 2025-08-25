public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data= data;
        } 
    } 
    
	
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public boolean isEmpty() 
    { 
        if(root== null) {
        	return true;
        	
        }
        return false;
    } 
  
    
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public void push(int data) 
    { 
    	StackNode newNode= new StackNode(data);
    	newNode.next= root;
    	root= newNode;
    	System.out.println("Pushed");
       

       
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int pop() 
    { 	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        int x= root.data;
        root= root.next;
        return x;
        
        
	//Also return the popped element 
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int peek() 
    { 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
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
