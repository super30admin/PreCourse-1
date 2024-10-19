// Time Complexity: O(1)
// Space Complexity: O(n)
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
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
	newNode.next = root;
	root = newNode; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if (isEmpty()) {
	    System.out.println("Stack Underflow");
	    return Integer.MIN_VALUE;
    	}
	
	int popped = root.data;
	root = root.next;
	return popped;
    }
	 

  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	if (isEmpty()) {
	   System.out.println("No elements to peek");
	   return Integer.MIN_VALUE;
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
