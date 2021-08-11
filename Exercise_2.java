// Time Complexity : In case of LinkedList we are maintaining and constantly updating the root without requirement of traversal.
// Push: O(1); Pop: O(1); Peek: O(1); a search operation however will require O(n) as we have to traverse whole array to search specific element.
// Space Complexity : space increases as per number of elements added, it is O(n).
// Did this code successfully run on Leetcode : NA, this was not a leetcode question.
// Any problem you faced while coding this : No problems faced for this exercise. Tried additional test cases.

// Your code here along with comments explaining your approach

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        // Assigned the value of data and next on creation of each new Node which should be provided value and reference to null value.
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
    // If the root is null there are no values existing in stack.
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root==null;
    } 
  
    // To push, we take a reference which points to root, assigning root a new value we can link the root and previous root via next reference.
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode trav = root;
        root = new StackNode(data);
        root.next = trav;
    } 
  
    // To push, we can assign value of root to a variable and assign previous root to current root by using next and then returning variable value.
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            return 0;
        } else {
            //Write code to pop the topmost element of stack.
            int result = root.data;
            root = root.next;
            //Also return the popped element 
            return result;
        }
    } 
  
    // Returning value in the root node.
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 
  
    //Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println(sll.isEmpty() + " isEmpty?"); 
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println(sll.peek() + " peeked from stack"); 
        System.out.println(sll.isEmpty() + " isEmpty?"); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
