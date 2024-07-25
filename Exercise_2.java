// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No issues.

/**
Implemented stack as linked list.
Just followed the directions.
*/

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root== null) {
            root = new StackNode(data);
        }else {
            StackNode head = root;
            while(head.next != null) {
                head = head.next;
            }
            head.next = new StackNode(data);
        }
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(this.isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    }else {
        StackNode curr = root.next;
        StackNode prev = new StackNode(0);
        prev.next = root;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return curr.data;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            return -1;
        }
        StackNode head = root;
        while(head.next != null) {
            head = head.next;
        }
        return head.data;
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
