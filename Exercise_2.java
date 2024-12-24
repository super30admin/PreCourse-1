// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


public class StackAsLinkedList { 

    
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {   
            //Initialize the data and next of node
            this.data=data;
        	next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        // condition if stack is empty. 
        if(root==null)
    		return true;
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Create a new node with data and put the next address as root 
        StackNode stackNode=new StackNode(data);
    	stackNode.next=root;
        //new node will now be the top of the stack
    	root=stackNode; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(this.isEmpty()==true) {
    		System.out.print("Stack Underflow");
    		return 0;
    	}
        //get the topmost element of stack move the root pointer to the next element
         int x=root.data;
    	 root=root.next;
	//return the popped element 
     return x;
    } 
  
    public int peek() 
    { 
        //return the topmost element without removing it.
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
