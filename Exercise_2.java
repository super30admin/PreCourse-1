class StackNode { 
        int data; 
        StackNode next; 
}

class StackAsLinkedList { 
  
    private StackNode root; 

    public StackAsLinkedList(){
        this.root = null;
    }
    
    
    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        StackNode n = new StackNode();
        n.data = data;
        n.next = root;
        
        root = n;
        
        
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode n = root;

        int temp = root.data;
        root = root.next;
        
        return temp;
        //Write code to pop the topmost element of stack.
	    //Also return the popped element
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;


    }
}  

  
	//Driver code
class Main
{
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