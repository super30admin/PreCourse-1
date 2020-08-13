public class Exercise_2 { 
  
	
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
    	if(root==null)
    	{
    		System.out.println("Empty stack");
    		return true;
    	}
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode newNode= new StackNode(data);
    	if(root==null) {
    		root=newNode;
    		
    		return;
    	}
    	newNode.next=root;
    	root=newNode;
       	
    } 
  
    public int pop()
    {
		
	//If Stack Empty Return 0 and print "Stack Underflow"
		if(root==null) {
			System.out.println("Stack Underflow");
			return 0;
		}
        //Write code to pop the topmost element of stack.
		StackNode temp=root;
		root=temp.next;
	//Also return the popped element 
		return temp.data;
    } 
  
    public int peek() 
    {
		if(root==null) {
			System.out.println("Stack is Empty");
			return 0;
		}
        //Write code to just return the topmost element without removing it.
    	return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(20); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(30); 
        System.out.println("Stack isempty : " + sll.isEmpty()); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        
        System.out.println("Top element is " + sll.peek()); 
        System.out.println("Stack isempty :" + sll.isEmpty()); 
    } 
    
} 
