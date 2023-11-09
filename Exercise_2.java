//Time Complexity: O(1)  
//Space Complexity: O(n)

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(){};
        StackNode(int data) 
        { 
        	this.data = data;
			this.next = null; 
        } 
    }
    
    StackAsLinkedList(){
    	this.root = null;
    }
    	
    public boolean isEmpty() 
    { 
 	   if (root == null)
		   return true;
	   else
		   return false;
    } 
  
    public void push(int data) 
    { 
		StackNode s = new StackNode();
		s.data = data;
		s.next = root;
		root = s; 
    } 
  
    public int pop() 
    { 	
    	if(isEmpty())
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
		int p = root.data;
		root = root.next;
		return p; 
    } 
  
    public int peek() 
    { 
    	return root.data;
    } 
}
	//Driver code
    class Driver{
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

