//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yet to try
//Any problem you faced while coding this : None

public class StackAsLinkedList { 
      
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            // Constructor
            this.data = data; // Initializing current object's data
        } 
    } 
    
    
    public boolean isEmpty() 
    { 
        // Check whether the Stack is empty
        if(root == null)
            return true; // Returning true if the stack is empty
        else
            return false; // Returning false if the stack is not empty
    } 
  
    public void push(int data) 
    { 
        // Push the data to the stack
        StackNode node = new StackNode(data); // Creating a new node
        if(isEmpty() == true)
            root = node; // First created node will be the root node if the Stack is empty
        else
        {
            StackNode tempNode = root;  // Temperory node is pointing to root node
            root = node;                // New node is now a root node
            root.next = tempNode;       // Old root node is linked to the new root node
        }
        
        System.out.println("The data "+ data +" is pushed to the stack.");
    } 
  
    public int pop() 
    {
        // Pop the data from the stack
        int value = Integer.MIN_VALUE; // Initializing the variable with integer min value(-2147483648)
         
        if(isEmpty() == true)
        {
            System.out.println("Nothing is there to pop from stack. Stack Underflow.");
            return 0; // Returning 0 if the Stack is Empty
        }
        else
        {
            value = root.data; // Fetching the data of the current node into the variable 'value'
            root = root.next;  // Updating the root node with next node (deleting the node which means the node is availeble for garbage collection)
            return value;      // Returning the data present in the root node which was recently deleted
        }
        
    } 
  
    public int peek() 
    {
        if (root == null)
        { 
            System.out.println("Stack is empty!"); 
            return Integer.MIN_VALUE; // Returning integer min value(-2147483648) if the Stack is empty
        } 
        else
            return root.data;         // Returning data at the topmost node of the Stack
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
