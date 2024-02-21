// Time Complexity: O(1)
//Space Complexity: O(n) where n is the number of elements
// Did the code run successfully on leetcode: Not Applicable
//Any problem faced while coding: No

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
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	    StackNode newNode = new StackNode(data);
	    newNode.next = top;
	    top = newNode;
	    System.out.println(+data +" Pushed to the stack.");
    } 

    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

	    if(root==null){
		     System.out.println("Stack underflow");
		    return -1;
	    }
	    int value = root.data;
	    root = root.next;
	    return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    if(root==null){
		    System.out.println("Stack is empty");
		    return -1;
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
