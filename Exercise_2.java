class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        	this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode node=new StackNode(data);
    	if(root==null) {
    		root=node;
    	}
    	else {
        	StackNode temp=root;
        	while(temp.next!=null) {
        		temp=temp.next;
        	}
        	temp.next=node;		
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root==null) {
    		System.out.println("Stack Underflow");
    		return 0;
    		}
    	if(root.next==null) {
    		int rootValue=root.data;
    		root=null;
    		return rootValue;
    	}
    	StackNode temp=root;
    	StackNode prev=null;
    	while(temp.next!=null) {
    		prev=temp;
    		temp=temp.next;
    	}
    	int value=prev.next.data;
    	prev.next=null;
    	return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root==null) {
    		System.out.println("No elemnts in the Stack");
    		return -1;
    	}
    	StackNode temp=root;
    	while(temp.next!=null) {
    		temp=temp.next;
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
