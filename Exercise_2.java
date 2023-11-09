/* Exercise_2 : Implement Stack using Linked List.
*/

// Time Complexity :push takes O(1), peek takes O(1) and pop takes O(1)
// Space Complexity :requires extra space for pointers O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Space complexity- requires extra space for pointers
// Approach: Stack follows LIFO(Last in first out order)
// it contains following operations:
// a. push- adds an item in stack(condition-stack is full-Stack overflow)
// b. pop-removes item from stack(condition-stack is empty-Stack underflow)
// c. peek- returning top element of stack
// d. isEmpty- return true if stack is empty else false

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
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }
        else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //initialising a new node
        StackNode node1 = new StackNode(data);
        //if root is null, assign root to new node
        //else initialise temp node and assign it to root
        if(root == null){
            root = node1;
        }
        else {
            StackNode temp = root;
            root = node1;
            node1.next = temp;
        }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        int popped = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("Stack Underflow");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else {
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
