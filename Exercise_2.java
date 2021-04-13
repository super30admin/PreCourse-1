
class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
    } 
    
    StackAsLinkedList(){
    	this.root=null;
    }
	
    public boolean isEmpty() 
    { 
        return root==null;//Write your code here for the condition if stack is empty. 
    
    } 
  
    public void push(int data) 
    { 
    	StackNode temp=new StackNode();
    	if(temp==null) {
    		System.out.print("\n stack overflow");
    		return;
    	} 		
    		temp.data=data;
    		temp.next=root;
    		root=temp;
    		

        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    	
    		int x=root.data;
    		root=root.next;
    	return x;
    	}
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
    	if(isEmpty()) {
    	System.out.println("Stack is Empty");
    	return -1;
    }else {
       return root.data; //Write code to just return the topmost element without removing it.
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
