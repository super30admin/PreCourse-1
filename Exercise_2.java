class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.next=null;
            this.data=data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        StackNode node= new StackNode(data);
        if(isEmpty())
        {
            node.next= null;
        }
        else{
            node.next= root;
        }
        root=node; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty())
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int temp=root.data;
        root = (root).next;
        return temp;
    }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return root.data;
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
