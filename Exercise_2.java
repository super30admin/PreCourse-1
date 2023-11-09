public class StackAsLinkedList { 
  
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
	    if(root==null)
	    {
		    return true; //return true if stack empty
	    }
	    else{
	         return false;	    //return false if stack not empty
	    }
	    
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
	  StackNode newNode= new StackNode(data);
	  if(root==null)
	  {
		  root= newNode; //if root is null stack is empty hence we assign the newNode as the root node
	  }
	    
	  else{
		  StackNode temp=root; // created a temp node and store root in temp
		  root=newNode; //assign newNode as root
		  newNode.next=temp //create a link between newnode and old root node which was stored in temp
	         
	  }
        //Write code to push data to the stack. 
	 System.out.println("item pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(root==null)
	{
		System.out.println("Stack Underflow");
	return 0;
	}
	else{
	int a=root.data;
	root=root.next;
	System.out.println("Top element popped");
	return a;
	}
    } 
  
    public int peek() 
    { 
	int a=root.data; //storing the data stored in the root node in a variable
	return a; //returning the value in variable a
        //Write code to just return the topmost element without removing it.
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
