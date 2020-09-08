public class Exercise_2 { 
  
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
        //Write your code here for the condition if stack is empty. 
    	if(root ==  null) {
    		System.out.println("Stack Empty");
    		return true;
    	}
    	return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode temp = new StackNode(data);
    	if(temp == null) 
    		System.out.println("Stack Overflow");
    	
    	temp.data = data;
    	temp.next = root;
    	root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write code to pop the topmost element of stack.
    	root = root.next;
	//Also return the popped element 
		return root.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty()) {
    		System.out.println("Stack Empty");
    		return -1;
    	}
    	else	
    		return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
