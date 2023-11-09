public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return root!=null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode nn = new StackNode(data);
    	if(root==null) {
    		root = nn;
    	}else {
    		nn.next = root;
    		root = nn;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		
    	}
    	int rv = this.root.data;
    	
    	if(root.next==null) {
    		this.root = null;
    	}else {
    		this.root = this.root.next;
    	}
    	
    	return rv;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if (this.root == null) {
    		System.out.println("Stack Underflow");
		}
		return this.root.data;
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
