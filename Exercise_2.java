public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null){
            return 0;
        }
         
    } 
  
    public void push(int data) 
    { 
        StackNode n = new StackNode(data);
		n.data = data;
		n.next = root;
		root = n;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root == null){
        return 0;
        System.out.println("Stack Underflow");
    }
    else {

        int ret = root.data;
        return ret;
        
    
    }


    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null)
		{	
			return 0;
		}
		else
		{
			int ret = root.data;
			return ret;
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
