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
	    if(root == null){
		    return true;}
	    else{
		    return false;}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	// Create a new StackNode with the given data
        StackNode newNode = new StackNode(data);
        if (root == null) {
            // If the stack is empty, assign the new node as the root
            root = newNode;
        } else {
            // Set the next of the new node to the current root
            newNode.next = root;
            // Update the root to the new node
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	     if (isEmpty()) {
            // If the stack is empty, print "Stack Underflow" and return 0
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // Get the data from the root
            int poppedElement = root.data;
            // Move the root to the next node
            root = root.next;
            // Return the popped element
            return poppedElement;
        }
	    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    if (isEmpty()) {
            // If the stack is empty, print "Stack is empty" and return 0
           
            return 0;} 
	    else {
            // Return the data of the root without removing it
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
