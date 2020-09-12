public class StackAsLinkedList { 
  
    StackNode root; // constant take time and sapce complexcity of O(1)
  
    static class StackNode { 
        int data; //O(1)
        StackNode next; //O(1)
  
        StackNode(int data) //O(1)
        { 
             this.data = data;
        	 next = null;
            //Constructor here 
        }

		public StackNode() {
			super();
		} 
    } 

    public boolean isEmpty() 
    { 
      //Write your code here for the condition if stack is empty. 
    	if(root == null) {
    		System.out.println("Stack is empty");
    		return true;}
    	else {
    		System.out.println("Stack is not empty");
    		return false;
    	}
    } 
  
    public void push(int data) // time Commplexcity to push n elements O(n) and space O(1)
    { 
        //Write code to push data to the stack. 
    	StackNode oldHead = root;
		root = new StackNode();
		root.data = data;
		root.next = oldHead;
    } 
  
    public int pop() 
    
    { 		//If Stack Empty Return 0 and print "Stack Underflow"
    	if (root == null) {
    	System.out.println("Stack Underflow");
    	return 0;
	}
    	//Write code to pop the topmost element of stack.
    	//Also return the popped element 
	int data = root.data;
	root = root.next;
	return data;
        
    } 
  
    public int peek() //time O(1) Space O(1)
    { 
        //Write code to just return the topmost element without removing it.
    	 { 
    	    	if (root == null) {
    	    	System.out.println("Stack is empty");
    	    	return 0;
    		}
    		int data = root.data;
    		//root = root.next;
    		return data;  
    	    } 
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); // time O(1) Space O(1)
        sll.push(20); // same 
        sll.push(30); //same
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
