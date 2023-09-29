public class StackAsLinkedList { 
  
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
        if(!isEmpty()) {
    		StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
    	}else {
    		StackNode temp = new StackNode(data);
    		root = temp;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root ==null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		int temp = root.data;
    		root = root.next;
    		return temp;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) {
    		return root.data;
    	}else {
    		return 0;
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
