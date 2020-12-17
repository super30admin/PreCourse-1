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
        //Write your code here for the condition if stack is empty. 
    	if(root==null)
    		return true;
    	else
    		return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode temp = new StackNode(data);
    	if(temp==null){
    	    System.out.println("Stack Overflow");
    	    return;
    	}
    	temp.next = root;
    	root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow");
    		return -1;
    	}
    	int temp_data = root.data;
    	root = root.next;
    	return temp_data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root==null) {
    		System.out.println("Stack is empty!");
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
