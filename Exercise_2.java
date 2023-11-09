// Time Complexity Pop, Push, Peek ,isEmpty: O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: 
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null) {
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode tmp = new StackNode(data);
        tmp.next = null;
        if (root == null) {
            root = tmp;
        }
        tmp.next = root;
        root = tmp;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    {
        StackNode tmp = root;
        if (root == null) {
            System.out.print("Stack Underflow");
            return 0;
        }
        int topElement = tmp.data;
        root = tmp.next;
        return topElement;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        return root.data;
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
