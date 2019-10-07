
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
    	if (this.root == null) return true;
    	
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	
    	StackNode newNode = new StackNode(data);
    	
    	if (this.root == null) {
    		root = newNode;
    	} else {
    		newNode.next = root;
    		root = newNode;
    	}
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element
    	if (this.root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int top = root.data;
    	
    	root = root.next;
    	
    	return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if (root == null) {
    		System.out.println("No element to peek");
    		return 0;
    	}
    	return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        System.out.println("peeking " +sll.peek());
        sll.push(10); 
        sll.push(20); 
        System.out.println(" peeking "+sll.peek());
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
