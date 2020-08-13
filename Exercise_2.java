
 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        StackNode node=new StackNode(data);
        if(root==null)
        {
            root=node;
        }
        else
        {
            StackNode temp=root;
            root=node;
            node.next=temp;
        }
        System.out.println(data+ " is pushed");
    } 
  
    public int pop() 
    { 	
        int pop=0;
        if(root==null)
        {
            System.out.println("Empty Stack");
            return 0;
        }
        else
        {
            pop=root.data;
            root=root.next;
        }
        return pop;


    } 
  
    public int peek() 
    { 
        if(root==null)
        {
            System.out.println("Empty stack");
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
