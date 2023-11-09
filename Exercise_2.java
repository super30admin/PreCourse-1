//push - Time complexity O(1) and Space Complexity O(1)
//pop - Time complexity O(1) and Space Complexity O(1)
//peek - Time complexity O(1) and Space Complexity O(1)
public class Exercise_2 { 
  
    StackNode root; 

  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	this.data=data;
        	next=null;
 
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root==null)
    		
    	{
    		System.out.println("array is empty");
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode temp = new StackNode(data);
    	
    	
    	if(root==null)
    	{
    		root=temp;
    	}
    	
    	else
    	{
          temp.next=root;
          root=temp;
          
          
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
       if(root==null)
       {
    	   System.out.println("Stack Underflow");
    	   return 0;
       }
    	
       else
       {
    	   int a = root.data;
    	   root=root.next;
    	   
    	   return a;
       }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root==null)
    	{
    		System.out.println("array is empty");
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
  
        Exercise_2 sll = new Exercise_2(); 
  
        //sll.push(10); 
       // sll.push(20); 
       // sll.push(30); 
        
        sll.isEmpty();
  
        System.out.println(sll.pop() + " popped from stack"); 
  
       // sll.push(70); 
        
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
