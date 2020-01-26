public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //setting the data attribute the argument 
            this.data = data ; 
            //setting next to null 
            this.next = null ;  
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //When root's next points to null
        return (root.next == null) ; 
    } 
  
    public void push(int data) 
    { 
        //creating the stackNode to put data into it 
        StackNode add = new StackNode(data) ;

        //pointing node add to the node referenced by the root  
        add.next = root ; 

        //now pointing the root back to the recently added node (add)
        root = add ; 
         
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow") ; 
            return 0 ; 
        }

        //Write code to pop the topmost element of stack.
        //saving the value for returning 
        int pop = root.data ; 

        //removing the top of the stack by pointing the root to the next node 
        StackNode temp = root.next ; 

        //to avoid memory leakage 
        root.next = null ; 
        root = temp ; 

	   //Also return the popped element 
        return pop ; 
    } 
  
    public int peek() 
    { 
        //vlaue in the node pointer by the root, basically the top node 
        return root.data ; 
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
