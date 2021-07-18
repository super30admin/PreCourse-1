public class StackAsLinkedList { 
  
    StackNode root; //head pointer
  
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
        //head/root is the top of the stack
        return (root==null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //create a new node to push
        StackNode stk = new StackNode(data);
        //check if the LL is empty
        if (root != null)
        {
            stk.next=root;
            root = stk;
        }
        else
        {
            root=stk;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	if (root == null)
	{
	    System.out.println("stack underflow");
	    return 0;
	}
    else
    {
        int poppedElement=root.data;
        root=root.next;
        return poppedElement;
    }
	
    } 
  
    public int peek() 
    { 
       if (root!=null)
       {
           return root.data;
       }
       else
       {
           System.out.println("Stack empty");
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

