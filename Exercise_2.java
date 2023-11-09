import s30precourse1exercises.StackAsLinkedList;
import s30precourse1exercises.StackAsLinkedList.StackNode;

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
        if (root == null) {
        	return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode oldRoot = root;
        root = new StackNode(data);
        root.next = oldRoot; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	int poppedVal = root.data;
    	root=root.next;
    	return poppedVal;
	
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
  
        System.out.println(sll.pop() + ":1 popped from stack"); 
        System.out.println(sll.pop() + ":2 popped from stack"); 
        System.out.println(sll.pop() + ":3 popped from stack"); 
  
        if (!sll.isEmpty())
        	System.out.println("Top element is " + sll.peek()); 
    } 
} 
