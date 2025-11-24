// Time Complexity : Push - O(1), Pop - O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// 1. Use a linked list where 'top' always points to the most recently pushed node.
// 2. For push: create a new node, point its next to current top, and update top.
// 3. For pop: return the data from top and move top to top.next.

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next;
  
        StackNode(int data) { 
            this.data = data;
            this.next = null; 
        } 
    } 
    
    // Check if stack is empty
    public boolean isEmpty() { 
        return root == null;
    } 
  
    // Push element onto the stack
    public void push(int data) { 
        // Always insert at the beginning
        StackNode new_node = new StackNode(data);

        // New node should now become the root (top of stack)
        new_node.next = root;
        root = new_node;
    } 
  
    // Pop top element
    public int pop() { 
        // If empty
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        // Store current root and move root pointer
        int popped = root.data;
        root = root.next;

        return popped;
    } 
  
    // Peek top element
    public int peek() { 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
    } 
  
    // Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}
