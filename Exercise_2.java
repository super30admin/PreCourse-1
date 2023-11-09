// Time Complexity : O(1) for adding and deleting node/top element from front of the list
// Space Complexity : O(n) where n = number of node/size of stack
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Use linkedlist when the size of the stack is unkown
class StackAsLinkedList { 
  
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
        if(root == null) {
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode sNode = new StackNode(data);
        if(root != null) {
            sNode.next = root;
        }
        root = sNode;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else {
            int top = root.data;
            root = root.next;
            return top;
        }
	    //Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) {
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
