//time complexity - O(1)
package Default;


public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int d) 
        { 
            //Constructor here 
        	data = d;
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
    	StackNode temp;
		temp = new StackNode(data);
    	if(root == null) {
    		
    		
    		root = temp;
    	}
    	
    	else {
    		
    		temp.next = root;
    		root = temp;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(root == null) {
    		
    		System.out.println("Stack underflow");
    		return 0;
    	}
        //Write code to pop the topmost element of stack.
    	int d1 = root.data;
    	root = root.next;
    	return d1;
    	
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
