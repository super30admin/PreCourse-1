// Time Complexity: O(1) for push,pop and peek operation
// Space Complexity: O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :  n


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
        //Write your code here for the condition if stack is empty. 
		if(root == null)
			return true;
		else
			return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
		StackNode node = new StackNode(data);
		if(node == null)
		{
			System.out.println("overflow");
			return;
		}
		node.data = data;
		node.next = root;
		root=node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
		if(root == null)
		{
			System.out.println("underflow");
			return 0;
		}
		int val = root.data;
		root = root.next;
		return val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
		if(root == null)
		{
			System.out.println("underflow");
			return 0;
		}
		return root.data;
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
