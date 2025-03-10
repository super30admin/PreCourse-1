//Time complexity = O(1)
//Space complexity = O(1)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
		this.data = data;
            //Constructor here 
		
        } 
    } 
    
	
    public boolean isEmpty() 
    {
	    if(root == null)
            return true;
        else
            return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
	    StackNode newNode = new StackNode(data);
        if(root == null)
            root = newNode;
        else
            newNode.next = root;
            root = newNode;
        System.err.println(data+" pushed to stack");
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    if(isEmpty()){
		    System.err.println("Stack Underflow");
		    return 0;
	    }
	    else{
		    int popped = root.data;
		    root = root.next;
		    return popped;
	    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	    if(isEmpty()){
            System.err.println("Stack is empty");
            return 0;
        }
        else{
            return root.data;
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
