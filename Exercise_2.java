// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :no

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
       if (root == null) {
            return true;
        } else {
            return false;
        } 
    } 
  
    public void push(int data) 
    { 
         StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

     if(isEmpty() == true)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int res = root.data;
            root = root.next;
            return res;
        }
    } 
  
    public int peek() 
    { 
        if(isEmpty() == true)
        {
            System.out.println("Nothing to Peek: Stack Underflow");
            return 0;
        }
        else
        {
            int res = root.data;
            return res;
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
