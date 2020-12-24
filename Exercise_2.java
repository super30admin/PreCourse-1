public class StackAsLinkedList { 
	//I was
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
    	if(root != null) {
    		return false;
    	}
    	else {
    		return true;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode addNode = new StackNode(data);
    	
    	if(root != null) {
    		StackNode temp = root;
    		root = addNode;
    		addNode.next = temp;
    	}
    	else {
    		root = addNode;
    	}
    } 
  
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    	int popped = 0;
    	if(root != null) {
    		popped = root.data;
    		root = root.next;
    		return popped;
    	}
    	else {
    		return popped;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null) {
    		return root.data;
    	}
    	else {
    		System.out.println("Stack is empty");
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