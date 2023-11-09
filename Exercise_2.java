// Time Complexity : push,pop,peek all have o(1) since we are not interating over whole linkedlist for any operations
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// approach : making the new Stacknode as root so that push,pop and peek operations can be one whithout any iterations on List.
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
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
    	StackNode temp = new StackNode(data);
    	temp.next = root;
    	root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	StackNode temp = root;
    	root = root.next;
		return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack Empty");
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
