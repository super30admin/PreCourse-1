// Time Complexity : O(1) for all main operations (push, pop, peek, isEmpty)
// Space Complexity : O(n) for n elements in the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

public class StackAsLinkedList {
  
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
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
//        push data to stack from the front
//        newly created node will point to current root
        StackNode node = new StackNode(data);
        if (root == null) {
            root = node;
        } else {
            node.next = root;
            root = node;
        }
        //Write code to push data to the stack.
    }
  
    public int pop() 
    {
//        pop the root node by assigning root to root.next
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int ele = root.data;
            root = root.next;
            return ele;
        }
    } 
  
    public int peek() 
    {
//        return the topmost element
        if (root == null) {
            return 0;
        } else {
            return root.data;
        }
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
