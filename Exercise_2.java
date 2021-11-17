//Push
// Time Complexity : O(1)
// Space Complexity : O(1)

//Pop
// Time Complexity : O(1)
// Space Complexity : O(1)

//Peek
// Time Complexity : O(1)
// Space Complexity : O(1)

//Peek
// Time Complexity : O(1)
// Space Complexity : O(1)
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        	this.next = null;
        } 
        StackNode() 
        { 
            
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null)
    		return true;
    	else
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
    	if(root!= null) {
	    	StackNode temp = new StackNode();
	    	temp = root;
	    	root = root.next;
	    	return temp.data;
	    }
    	else {
    		System.out.println("Stack is already empty");
    		return 0;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root != null)
    			return root.data;
    	else {
    		System.out.println("Empty Stack");
    		return 0;
    	}
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
