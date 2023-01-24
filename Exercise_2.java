// Time Complexity : O(1) for each operation
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : N/A
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
          next = null;
          
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
      return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
      StackNode newNode = new StackNode(data);
      if (root == null)
      {
        root = newNode;
      }
      else
      {
        StackNode temp = root;
        root = newNode;
        newNode.next = temp;
        
      }
        

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to popd the topmost element of stack.
	//Also return the popped element 
      int poppedEl = Integer.MIN_VALUE;
      if (root == null)
      {
        System.out.println("Stack Underflow");
      }
      else 
      {
        poppedEl = root.data;
        root = root.next;
      }
      return poppedEl;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    if (root == null)
    {
      return Integer.MIN_VALUE;
    }
      else {
        return root.data;
      }
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
