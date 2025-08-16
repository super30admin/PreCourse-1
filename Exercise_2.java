// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : More Java syntax

public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode current = root;
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int answer = root.data;
        StackNode current = root;
        StackNode prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        answer = current.data;
        prev.next = null;
        return answer;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int answer = root.data;
        StackNode current = root;

        while (current.next != null) {
            current = current.next;
        }

        answer = current.data;
        return answer;
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
