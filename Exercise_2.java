// Time Complexity : O(1)
// Space Complexity : O(1)

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;        	        			
        }

		public StackNode() {
			// TODO Auto-generated constructor stub
			System.out.println("Constructor called!!!");
		}
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
    	if(root == null)
    		return true;
    	return false;
    	
    				
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode node = new StackNode();
    	if(node == null)
    		return;
    	
    	
    	node.data = data;
    	node.next = root;
    	root = node;
    
    	
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(isEmpty())
    	{
    			return -1;
    	}
    	
    	int top = peek();
    	root = root.next;
    	return top;
    	
    	
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(isEmpty())
    		return -1;
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
