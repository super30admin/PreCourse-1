class StackAsLinkedList { 
  
	StackNode root; 
 
	
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null; 
    } 
    						      
    public void push(int data) 
    { 
    	StackNode newNode = new StackNode(data);
		
		if(root != null) {    		
    		newNode.next = root;
		} 
		root = newNode;
		
    } 
  
    public int pop() 
    { 	
		if(root == null){
			System.out.println("Stack Underflow");
			return -1;
		}else{
			int popped = root.data;
			root = root.next;
			return popped;
		}
		 
    } 
  
    public int peek() 
    { 
		if(root != null) {   
			return root.data;
		}else{
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
