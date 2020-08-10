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
        if(root==null)
        {
        	return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode=new StackNode(data);
		StackNode cur=root;
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			StackNode prev=root;
			root=newNode;
			newNode.next=prev;
		}
    } 
  
    public int pop() 
    { 	
		if(root==null)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			StackNode prev=root;
			int item=prev.data;
			root=prev.next;
			return item;
		}
    } 
  
    public int peek() 
    { 
        if(root!=null)
		{
			StackNode first=root;
			return first.data;
		}
		else
		{
			System.out.println("Stack is empty");
			return 0;
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
