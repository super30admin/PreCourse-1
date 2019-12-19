// Time Complexity :
//      isEmpty() - O(1)
//      push() - O(1)
//      pop() - O(1)
//      peek() - O(1)
//      
// Space Complexity :
//      overall - O(n) - space requirement keeps increasing everytime a new node is added
//      isEmpty() - N/A
//      push() - O(1)
//      pop() - N/A
//      peek() - N/A
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            //initialise node
            this.data = data;
            next = null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        //check if root is null
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode head = new StackNode(data);
        head.next = root;
        root = head;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element
        //check if root is null
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int val = root.data;
            root = root.next;
            return val;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //check if root is null
        if(root == null)
        {
            System.out.println("Stack Underflow");
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
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
