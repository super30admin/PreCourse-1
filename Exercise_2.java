/**
 * Class implementing stack using linked list.
 * Time complexity: O(1)
 * Space complexity: O(n) where n is number of items currently in the stack.
 */
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            //Constructor of linked list node
            this.data = data;
            this.next = null;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        //Stack is empty when list is empty.
        return  root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //Pushing to stack is analogous to inserting at the head of the list
        //We delete the head while popping
        if (this.isEmpty()) {
            root = new StackNode(data);
            return;
        }
        StackNode current = root;
        root = new StackNode(data);
        root.next = current;
    } 
  
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (this.isEmpty()) {
            System.out.println("Nothing to pop. Stack is empty.");
            return Integer.MIN_VALUE;
        }

        StackNode current = root;
        root = root.next;
        return current.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (this.isEmpty()) {
            System.out.println("Nothing to peek. Stack is empty.");
            return Integer.MAX_VALUE;
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
