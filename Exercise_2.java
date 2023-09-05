
// time complexity: O(1)
// SPACE Complexity: O(1)
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	next= null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //code for the condition if stack is empty. 
    	return (root==null);
    } 
  
    // Adding value to the beginning of the list for demonstrating behavior of stack
    public void push(int data) 
    { 
    	StackNode temp = root;
		root = new StackNode(data);
		root.next= temp; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    		
        // code to pop the topmost element of stack.
    	else {
    		StackNode temp=root;
    		int topele= root.data;
    		root =root.next;
    		// returning the popped element 
    		return topele;
    	}
	
    } 
  
    public int peek() 
    { 
        //code to just return the topmost element without removing it.
    	if(isEmpty())
    		return 0;
    	else
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
