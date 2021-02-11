class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { this.data = data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    {   
        //Write your code here for the condition if stack is empty. 
        if(root == null)
            {return true;}
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode pushNode = new StackNode(data);

        if(root == null)
        {root = pushNode;}
        else
        {
            StackNode tempNode= root;
            root = pushNode;
            pushNode.next = tempNode;

        } 
        System.out.println(data + " is pushed out");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    if(root == null)
            {System.out.println("Stack Underflow");
            return 0;

            }
            else
            {
                int popped = root.data;
                root = root.next;
                return popped;
            } 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root != null)
        return(root.data);
        else
        {   
            System.out.println("Stack Underflow");
        }
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
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
