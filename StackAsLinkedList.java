public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data= data;
            this.next=null;
            //Constructor here 
        } 
    } 
    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
        return true;
        return false;
       
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if(isEmpty())
        {
            root= newNode;
            return;
        }
        newNode.next=root;
        root= newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(isEmpty())
	{
	   System.out.println("Stack Underflow");
	   return 0;
	   
	}
	int top= root.data;
	StackNode node = root.next;
	root=node;
	return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
	{
	   System.out.println("Stack Underflow");
	   return 0;
	   
	}
	int top= root.data;
	return top;
    } 
    
    
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

//tc: O(1)
//sc: O(1)