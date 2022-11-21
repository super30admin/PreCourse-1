// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            // initialize Node 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        // empty check
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        // check if empty or prepend new node to root/head
        StackNode node = new StackNode(data);
        if(isEmpty()) {
            root = node;
        } else {
            node.next =root;
            root = node;
        }
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    // check if empty or remove top/root/head node
        if(this.isEmpty()) {
           System.out.println("Stack Underflow");
            return 0;
        } 
         StackNode popedNode = root; 
         root = root.next;
        return popedNode.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
         // check if empty or view top/root/head node
        
         if(this.isEmpty()) {
            System.out.println(" Stack Underflow");
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
