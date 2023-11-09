// Time Complexity:  push - O(1), pop - O(1), peek - O(1), isEmpty - O(1)
// Space Complexity : O(N) where, N is the size of stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
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
    // StackAsLinkedList(){
    // root = null;
    // }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
       StackNode new_node = new StackNode(data);
    //    new_node.data = data;
       new_node.next = root;
       root = new_node;
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        return root.data;
        root = root.next;
    } 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
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
