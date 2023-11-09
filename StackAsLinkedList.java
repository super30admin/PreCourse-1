// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A, work with test cases
// Any problem you faced while coding this : N/A

public class StackAsLinkedList { 
  
    StackNode root = null; 
  
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
        if (root == null)
        {
            return true;
        }
        return false;    
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode next_node = new StackNode(data);
        if (isEmpty())
        {
            root = next_node;
        }
        else
        {
            StackNode ptr = root;
            while (ptr.next != null)
            {
                ptr = ptr.next;
            }
            ptr.next = next_node;
        }
    } 
  
    public int pop() 
        { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
            //Write code to pop the topmost element of stack.
        else
        {
            StackNode ptr = root;
            while (ptr.next.next != null)
            {
                ptr = ptr.next;
            }
            StackNode tmp = ptr.next; // store temporarily
            ptr.next = null;
            return tmp.data; // return popped element
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty())
        {
            return 0;
        }
        else
        {
            StackNode ptr = root;
            while (ptr.next.next != null)
            {
                ptr = ptr.next;
            }
            return ptr.next.data;
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
