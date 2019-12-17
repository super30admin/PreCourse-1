public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
	
        } 
    } 
    
    StackAsLinkedList(){
     this.root = null;
    }
    public boolean isEmpty() 
    { 
	    return root= null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
       StackNode temp = new StackNode();
  
        // initialize data into temp data field 
        temp.data = data
  
        // put top reference into temp link 
        temp.next = root;
  
        // update root reference 
        root= temp;     } 
  
    public int pop() 
    { 	
	 if(isEmpty()){
	System.out.println("Stack Underflow");
	return 0;
	 }
	  else {
	  root= root.next;
	  }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
	if (!isEmpty()) { 
            return root.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return 0; 
        } 
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
