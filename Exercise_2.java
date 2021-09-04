// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null) {
        	System.out.println("Stack is underflow");
            return true; 
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newnode = new StackNode(data);
    	if(root == null) {
    		root = newnode;
    	}
    	else {
    		StackNode temp = root;
    		root = newnode;
    		newnode.next = temp;
    	}
    	
    } 
  
    public int pop() 
    { 	
    	int popres=0;
        if (!isEmpty()) {
        	popres = root.data;
        	root = root.next;
        	return popres;
        }
        return 0;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(!isEmpty()) {
        	return root.data;
        }
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
