// Time Complexity : O(1) all operations
// Space Complexity : O(n) where n is the number of elements of the list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 
    //First approach, I created a another element  tail
    // but I need to iterate to find the previous when I was doing pop()
                
public class StackAsLinkedList { 
	  
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
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode oldNode = root;
    	root = new StackNode(data);
    	root.next = oldNode;
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
    	int res = root.data;
    	root = root.next;
    	return res;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null)
    		return root.data;
    	return 0;
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

