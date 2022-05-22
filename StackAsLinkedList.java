    // Time Complexity : O(1)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.next=null;
            this.data = data;
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
        StackNode temp = new StackNode(data);
 
        // check if stack is full. Then inserting an element would lead to stack overflow
        if (temp != null) {
            // initialize data into temp data field
            temp.data = data;
    
            // put top reference into temp link
            temp.next = root;
    
            // update top reference
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
        int popped = Integer.MIN_VALUE; 
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null) { 
            System.out.println("Stack Underflow"); 
            return 0;
        } 
        else { 
            //Write code to pop the topmost element of stack.
	        //Also return the popped element 
            popped = root.data; 
            root = root.next; 
            return popped;
        } 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
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
