// Time Complexity :
// push() - O(1), pop() - O(1), peek() - O(1), isEmpty() - O(1)
//
// Space Complexity :
// O(n), where n is the number of nodes in the stack (i.e., elements)
//
// Did this code successfully run on Leetcode :
// No - This specific implementation was written and tested locally.
//
// Any problem you faced while coding this :
// No

// Your code here along with comments explaining your approach:
// This is a stack implementation using a singly linked list.
// - Each stack element is represented by a node (`StackNode`) that holds the data and a pointer to the next node.
// - The top of the stack is represented by `root`.
// - `push()` adds a new node at the beginning (top of stack).
// - `pop()` removes and returns the top node, adjusting the root.
// - `peek()` returns the top value without removing it.
// - `isEmpty()` checks whether the root is null, which means the stack is empty.

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;

    } 
  
    public int pop() 
    { 	
	    if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = root.data;
        root = root.next;
        return popped;
    } 
  
    public int peek() 
    { 
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
