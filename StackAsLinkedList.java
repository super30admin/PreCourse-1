public class StackAsLinkedList { 
  
    StackNode root=null; // First Node 
    int size = 0;
  
    //Define Lindlist node
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data =data;
        	next = null ;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if (root == null )
    	{
    		return true ;
    	}else {
    		return false ;
    	}
  
    		
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode sn = new StackNode(data);
    	if (root==null)
    		root=sn;
    	else
    	{   StackNode temp = root ; 
    		sn.next = temp;
    		root = sn ;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	//Write code to pop the topmost element of stack.
    	//Also return the popped element 
    	if(!isEmpty())
    	{
    		StackNode temp = root ;
        	root =root.next ;
        	return temp.data ;
        	
    	}else {
    	 System.out.println("Stack Underflow");
 		return 0;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty())
    		return -1 ;
    	return root.data ;
    } 
    
    public void printStack(){
        StackNode curr= root;
        while(curr!=null){
            System.out.print("Insert the element into stack " + curr.data + "\n");
            curr = curr.next;
        }
        System.out.println();
    }
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        sll.printStack();
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
