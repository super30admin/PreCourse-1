// Time Complexity : O(1) for all operations
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Did not find it on Leetcode.
// Any problem you faced while coding this : Yes, I intially got confused and used pre pointer. Fixed the code now.
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        {
            return root == null;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data); // New top element
        newNode.next = root; // Point next to the previous top element
        root = newNode; // Update root
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode topNode = root; // root will always point to the top node of the Stack
        root = root.next; // Update top to the next node
        int topElement = root.data;
        // Help Garbage Collector reclaim the memory sooner.
        // This is not always needed since Garbagae Collector eventually reclaims the memory when there is no reference to the node.
        topNode.next = null;
    	//Also return the popped element 
        return topElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            // No elements in the stack
            System.out.println("Stack is empty");
            return 0;
        }
        // Return the top element without removing it
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 