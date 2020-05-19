// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor 
            // Initialize class attributes
            this.data = data;
            next = null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        
        // To check if stack is empty, check if root is null 
        // if root is null, then stack is empty
         if (root == null) {
           return true;
       } 
       else {
           return false;
       }
    } 
  
    public void push(int data) 
    { 
        // To push element to stack (insert at root)
        // the new data will be the root element 
        // and the new data will point next to the root element
        StackNode new_node = new StackNode(data);
        new_node.next = root;
        root = new_node;
        System.out.println("Pushed to stack : " +data);
    } 
  
    public int pop() 
    { 	
        // To pop element from the list (pop the root)
        // check if stack is empty, if empty return min.value
        // if not, remove the root data and new root = root.next
        if (root == null) 
	    {
	        System.out.println("Stack is empty ! No elements to pop!");
	        return Integer.MIN_VALUE;
	    } 
	    else 
	    {
	        int popElement = Integer.MIN_VALUE;
	        popElement = root.data;
	        root = root.next;
	        return popElement;
	    }
    } 
  
    public int peek() 
    { 
        // To peek element from the list 
        // check if stack is empty, if empty return min.value
        // if not, return root 
        if (root == null) {
            System.out.println("Stack is empty ! No element on top!");
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
