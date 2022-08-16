// Time Complexity : push-O(1) , pop-)(1) ,isEmpty-O(1)
// Space Complexity :push-O(1) , pop-)(1) ,isEmpty-O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null ;//Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null ? true : false ;//Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode N1 = new StackNode(data);

    	if (root == null)
    	{
    		root = N1;
    	}

    	else
    	{
    		N1.next = root;
    		root = N1;
    	}
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if (root == null)
    	{

    		System.out.println("Stack Underflow");
    		return 0;
    	}

    	else
    	{
    		int n = root.data; 
    		root = root.next;
    		return n;
    	}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null)
    	{
    		return 0; 
    	}
    	else
    	{
    		return (root.data);
    	}
    	
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        System.out.println(sll.peek() + " peek of stack"); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
