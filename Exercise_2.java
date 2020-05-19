// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Problem not on Leetcode but working on eclipse
// Any problem you faced while coding this : Figuring out from which end to perform push and pop in LinkedList
// Your code here along with comments explaining your approach

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data; // initialized data field of StackNode to the data being passed while creating 
            this.next = null; // Initialized next pointer to null
           
        } 

       
    } 
  
   		 StackAsLinkedList() // Custom constructor
       {
            this.root = null; // initialized root pointer to null
       }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null; // checking if root pointer is not pointing to any node
        // Time Complexity : O(1)

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data); // creating a new node temp and inserting at start
        temp.next = root; // pointing the next pointer of temp to the root element
        root = temp; // pointing root to the new created temp to denote top of stack
        // Time Complexity : O(1)


    } 
  
    public int pop() 
    { 	
	
        //Write code to pop the topmost element of stack.

    //If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()) // calling isEmpty method to check if stack is empty
    {
        System.out.println("Stack Underflow");
        return 0; // returning 0 and printing Stack Underflow if stack is empty
    }
        //Also return the popped element 

        // otherwise popping the element at root
	StackNode n = root; // pointing a new node n to root element
    root = root.next; // pointing the root to the next element of the root
    return n.data; // returning the element removed i.e n or previous root
    // Time Complexity : O(1)


    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data; // returning root element data
        // Time Complexity : O(1)

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
