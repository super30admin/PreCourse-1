class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data = data;	
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	return (this.root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode sn = new StackNode(data);
    	if (this.root == null)
    	{
    		this.root = sn;
    		return;
    	}
    	StackNode temp = this.root;
    	while(temp.next != null)
    	{
    		temp = temp.next;
    	}
    	temp.next = sn;
    } 
  
    public int pop() 
    { 	
    	if (this.root == null)
    	{
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	StackNode temp = this.root;
    	StackNode prev = this.root;
    	while(temp.next != null)
    	{
    		prev = temp;
    		temp = temp.next;
    	}
    	int value = temp.data;
    	if (temp == this.root)
    	{
    		this.root = null;
    	}
    	else
    	{
    		prev.next = null;
    	}
    	return value;
    } 
  
    public int peek() 
    { 
    	if (this.root == null)
    	{
    		return 0;
    	}
    	StackNode temp = this.root;
    	while(temp.next != null)
    	{
    		temp = temp.next;
    	}
    	return temp.data;
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
