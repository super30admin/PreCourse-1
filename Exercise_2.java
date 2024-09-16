class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;

            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;

        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        
       
            StackNode curr = new StackNode(data);
            if(root==null)
            {
                root=curr;
            }
            else
            {
            //root =curr;
                curr.next=root;
                root=curr;
            }
        
        

        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            /*StackNode curr =root;
            StackNode prevPtr = null;
            while(curr.next!=null)
            {
                curr =curr.next;
                
            }
            int value = curr.data;
            return value;
            */
            int value = root.data;
            root=root.next;
            return value;
        }


    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            return root.data;
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
