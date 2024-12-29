// STACK IMPLEMENTATION WITH LINKED LIST IN JAVA
// Author: Swabhi Papneja
// Time Complexity: O(1)
// Space Complexity: O(1)
// Did this code run successfully in Leetcode: NA


class StackAsLinkedList { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //this.top = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        // Write your code here for the condition if stack is empty.
        if(root == null)
            return true;
        else
            return false; 
    } 
  
    public void push(int data) 
    { 
        // Write code to push data to the stack. 
        // creating a new node
        StackNode newNode = new StackNode(data);
        newNode.next = root; // previous top
        root = newNode; // updating the top to the latest added element 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()) {
        System.out.println("Stack Underflow!");
        return 0;
    }
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int removed = root.data;
    root = root.next;
    return removed;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return root.data;
    } 
  
	
}

public class Exercise_2 {
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
