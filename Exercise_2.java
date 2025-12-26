// StackAsLinkedList
public class Exercise_2 { 
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
class StackAsLinkedList { 
  
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
    	return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode= new StackNode(data);
    	newNode.next=root;
    	root= newNode;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
    	if (isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	StackNode prevNode= root.next;
    	int poppedValue= root.data;
    	root = prevNode;
    	return poppedValue;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	int value = root.data;
    	return value;
    } 
  
} 
