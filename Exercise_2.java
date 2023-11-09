// Time Complexity : O(1), there is no need to traverse the list each time, we have access to top
// Space Complexity : O(n), for input list
// Did this code successfully run on Leetcode : ?
// Any problem you faced while coding this : Quite straight forward once you know how to use root
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
        StackNode() { 
            //Constructor here
        } 
    } 
    
    public StackAsLinkedList() {
		// TODO Auto-generated constructor stub
    	this.root = null;
	}
	
    public boolean isEmpty() { 
        //Write your code here for the condition if stack is empty.
    	return root == null;
    } 
  
    public void push(int data) { 
        //Write code to push data to the stack.
    	StackNode node = new StackNode();
    	node.data = data;
    	node.next = root;
    	root = node;
    } 
  
    public int pop() { 	
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return -1;
    	}
    	
    	int popped = root.data;
    	root = root.next;
    	return popped;
    } 
  
    public int peek() { 
        //Write code to just return the topmost element without removing it.
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return -1;
    	}
    	return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
