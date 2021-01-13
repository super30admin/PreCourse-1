 class StackAsLinkedList { 
  
    StackNode root=null; 
     class StackNode { 
        int data; 
        StackNode next;
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null)
        {
            return true;
        } 
        else
        {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode st = new StackNode(data);
        st.next = root;
        root = st;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element
      if(root == null)
      {
          System.out.println("Stack Underflow");
          return 0;
      } 
      int data = root.data;
      StackNode curr = root;
      root = root.next;
      curr.next = null; // intializing top element to null pointer
      return data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null)
        {
            System.out.println("Stack is Empty");
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
} 
