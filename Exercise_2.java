// Time Complexity : Push - O(1) Pop - O(1) Peek - O(1)
// Space Complexity : For n push - O(n)
// Did this code successfully run on Leetcode : Couldn't find the question on leetcode
// Any problem you faced while coding this : No.

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.root = null; //Node pointer root is set to null
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
        //Created a new node 
        Node new_node = new Node();
        if(new_node != null){    //If the stack is not full, initialise data into new_node and point new_node.next to root and update root.
            new_node.data = data;
            new_node.next = root;
            root = new_node;
        }
        else{
            return; // Overflow condition
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    
    if(isEmpty()){
        System.out.println("Stack Underflow"); //if root is equal to null, it's a stack underflow scenario.
        return 0;
    }
    int value = root.data; //store the value of the node to be removed
    root = root.next; //changing root to the next element to remove the top one.
    return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data; // if the stack isn't empty, we return the top element without removing it.
        }
        else{
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
