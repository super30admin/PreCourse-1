// Time Complexity : O(1)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : no

class StackAsLinkedList {
  
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
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newnode = new StackNode(data);

        //when stack is empty
        if(root == null)
            root = newnode;

        //when stack is not empty
        else {
            StackNode temp = root;
            root = newnode;
            newnode.next = temp;
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Underflow");
            return 0;
        }

        // Write code to pop the topmost element of stack.
	    //Also return the popped element
        else {
            int x = root.data;
            root = root.next;
            return x;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Empty Stack");
            return 0; // we can return Integer.MIN_VALUE too.
                      // followed the instruction of pop()- If empty return 0 and print " Stack Underflow"
        }
        else
            return (root.data);

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
