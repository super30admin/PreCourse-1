/**
 * Exercise_2 : Implement Stack using Linked List.
 * Time Complexity: O(1) - All operations work only at the head of the linked list.
 * Space Complexity: O(n) - For n elements
 * Did this code successfully run on Leetcode: Ran locally
 * 
 * Notes:
 * Main benefit of linked list over array - dynamic memory
 */


public class StackAsLinkedList { 
  
    StackNode root; // Top of the stack
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            //Constructor here 
            this.data = data;  // Assigning the value
            this.next = null;  // Initially, next node is null
        } 
    } 
    
	
    public boolean isEmpty() { 
        //Write your code here for the condition if stack is empty. 
        if (root == null) {
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) { 
        StackNode newNode = new StackNode(data); // Create a new node
        // Initially, stack is empty
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
    } 
  
    public int pop() { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    if (isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    } 
        //Write code to pop the topmost element of stack. Also return the popped element 
        int popped = root.data;
        root = root.next; // move top down
        return popped;
    } 
  
    public int peek() { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack empty");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
