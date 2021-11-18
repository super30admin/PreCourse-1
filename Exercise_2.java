// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
 public class StackAsLinkedList { 
  
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if(root == null)
        {
            root = node;
        }
        else
        {
            node.next = root;
            root = node; // since stack adds to the top, root should always be the latest element.
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        else
        {
            int value = root.data;
            root = root.next; // since stack removes from top, we update root to next element.
            return value;
        }
    } 
  
    public int peek() throws Exception
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null)
            throw new Exception("Stack is empty");
        else
            return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
        try
        {
            StackAsLinkedList sll = new StackAsLinkedList(); 
  
            sll.push(10); 
            sll.push(20); 
            sll.push(30); 
    
            System.out.println(sll.pop() + " popped from stack"); 
    
            System.out.println("Top element is " + sll.peek()); 
        } catch(Exception e){}
        
    } 
} 
