// Time Complexity :O(1)
// Space Complexity :O(n)  n - length of the list
// Did this code successfully run on Leetcode : Not available
// Any problem you faced while coding this : create LIFO LinkedList


// Your code here along with comments explaining your approach
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
			this.data=data; 
			//next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
		return root==null; // root is the head of the list, so if root is null then List is empty
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //Everytime Push is performed, a new node with the given data is created		
		StackNode temp =new StackNode(data);
		// Creating a LIFO LinkedList
		temp.next=root;
		root=temp; // root is the head of the list
		
    } 
  
    public int pop() 
    { 	
	
	  if(root==null) // root is the head of the list, so if root is null then List is empty
	  {
		  
		  System.out.println("Stack Underflow");//If Stack Empty print "Stack Underflow"
		  
	  }
	  else{
        //Write code to pop the topmost element of stack.
		//Also return the popped element 
		int poppedElement=root.data; // storing the data of the head
		root=root.next; // popping the head
		return poppedElement; // returning the data of the head
	  }
	
	return 0; //If Stack Empty Return 0
	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
		if(root!=null) 
		return root.data;
	return 0;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
		System.out.println(sll.pop() + " popped from stack"); 
		
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
