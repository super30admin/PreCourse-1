// Time Complexity :
// push() - O(1)
// pop() - O(1)
// peek() - O(1)
// isEmpty() - O(1)

// Space Complexity : O(n), where n is the number of nodes in the stack

// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this :
// No major issues. Needed to properly manage the head pointer for stack operations.

// Your code here along with comments explaining your approach:
// This is a stack implemented using a singly linked list.
// Each node (StackNode) holds the data and a pointer to the next node.
// The `root` variable always points to the top of the stack.
// Push adds a node at the head. Pop removes the node at the head.
 class StackAsLinkedList {
  
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
            return 0;
        } else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
    } 
  
    public int peek() 
    {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return root.data;
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
