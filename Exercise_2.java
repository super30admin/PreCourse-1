 class StackAsLinkedList { 
  
    StackNode root; 
   // int i=0; 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;
        } 
    } 
    //Approach: I am pushing and popping elements at the head of the Linked list, that way keeping the LIFO approach of stack.
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode node = new StackNode(data);
    	node.next = root;
    	root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null)
		{
		System.out.println("Stack Undeflow");
		return 0;
		}
    	StackNode node = root;
    	root = root.next;
    	return node.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null)
    	{
    		System.out.println("Stack Underflow");
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
 // Time Complexity : Push - O(1), pushing element at the head of the LinkedList 
  //Peek - O(1) - peek the first element in the Linkedlist, Pop - O(1) popping element at the head of the Linked list
 // Space Complexity : O(1)
 // Did this code successfully run on Leetcode : NA
 // Any problem you faced while coding this : NA
    
} 
