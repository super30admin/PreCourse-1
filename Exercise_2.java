class StackAsLinkedList { 
  
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
        if (root == null) 
	        return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        if(root != null)
        {
            System.out.println("Pushed "+ data);
            node.next = root;
            root = node;
        }

        else
        {
            System.out.println("Stack Empty, adding first element "+ data);
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	
	   if (root == null)
	   {
          System.out.println("Stack Underflow!");
		  return 0;
	   }
	else
	{
		StackNode node = root;
		root = root.next;
        node.next = null;
		return node.data;
	}
    } 
  
    public int peek() 
    { 	
	   if (root!=null) 
       {
            return root.data;
       }
       
       else return -1;
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
