/**
 * Time complexity : Push - O(n), Pop - O(1), Peek - O(1)
 * Space complexity : O(1) for all
 */

public class StackAsLinkedList { 
  
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
        if (root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode s = new StackNode(data);
        if (root == null) {
            s.next = null;
        } else {
            s.next = root.next;
        }
        root = s;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode s = root;
        root = root.next;
        return s.data;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!this.isEmpty())
            return root.data;
        else
            return 0;
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
