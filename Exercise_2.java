
// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : no
public class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
        StackNode newNode;
        newNode.data = data;
        newNode.next = root;
        root = newNode;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        int x = 0;
        if ( ! isEmpty())
        {
            x = root.data;
            root = root.next;
        }
        else 
            System.out.println("Stack underflow")

        return x;
    } 
  
    public int peek() 
    { 
        if ( ! isEmpty())
            return root.data;
        return 0;
        //Write code to just return the topmost element without removing it.
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

