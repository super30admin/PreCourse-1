// Time Complexity:
// push()     => O(1)
// pop()      => O(1)
// peek()     => O(1)
// isEmpty()  => O(1)

// Space Complexity:
// O(n), where n is the number of nodes pushed onto the stack
// Did this code successfully run on Leetcode : Yes
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
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null; //return true if stack is empty
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root; // pointing newNode to root node which is at top
        root = newNode; // update root node to newNode
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow"); // if empty then return 0
            return 0;
        } else {
            int popped = root.data; // assign top element to popped.
            root = root.next; // else move top to next element
            return popped; // return popped element
        }
    } 
  
    public int peek() 
    {
        if (isEmpty()){
            System.out.println("Stack is empty"); // if stack is empty return 0
            return 0;
        } else {
            return root.data; //else return top element.
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
