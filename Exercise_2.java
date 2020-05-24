 class StackAsLinkedList { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	next = null;
        } 
    } 
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null) {
    		return true;
    	}
    	return false;
    }
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	if(root == null) {
    		root = new StackNode(data);
    	}else {
    		StackNode temp = root;
    		root = new StackNode(data);
    		root.next = temp;
    	}
    } 
  
    public int pop() 
    { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int pElement = root.data;
    	root = root.next;
    	return pElement;
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null) {
    		return 0;
    	}
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

//Time Complexity : push,pop,peek - O(1)
//Space Complexity : push,pop,peek - O(1)
//Did this code successfully run on Leetcode : problem not found in leetcode
//Any problem you faced while coding this : Have done before, so no problem faced