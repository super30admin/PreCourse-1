public class StackAsLinkedList { 
  
	  StackNode root; 
	  
	    static class StackNode { 
	        int data; 
	        StackNode next; 
	  
	        StackNode(int data1)
	        { 
	            data = data1;
	        } 
	    }
    
	
    public boolean isEmpty() 
    { 
    	if(root==null)
    		return true;
    
    	return false;    

    } 
  
    public void push(int data) 
    { 
    	
    	StackNode node = new StackNode(data);
    	
    	if(root==null)
    		root = node;
    	
    	if(root!=null) {
    		node.next =root;
    		root=node;
    	}
    		
    		
    }
        //Write code to push data to the stack. 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	
    	if(root==null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    	int res = root.data;
    	root = root.next;
    	return res;
    		
    		}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
