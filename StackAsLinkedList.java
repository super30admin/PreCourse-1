package stackusinglinkedlist;
//Time Complexity : O(1)
public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	this.data=data;
        	this.next= null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	return root==null;
        //Write your code here for the condition if stack is empty. 
    	
    } 
  
    public void push(int data) 
    { 
    	StackNode newNode = new StackNode(data);
    	if(root==null) {
    		root=newNode;
    	}
    	else {
    		newNode.next= root;
    		root= newNode;
    	}
    	System.out.println(data + " pushed to stack");
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int poppedElement=root.data;
    		root= root.next;
    		return poppedElement;
    		
    	}
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    	return root.data;
    	}
    	//Write code to just return the topmost element without removing it.
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
