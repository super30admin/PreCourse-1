// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : This is not a Leetcode problem
// Any problem you faced while coding this : No
public class StackAsLinkedList { 
// Root node of the linked list (this is an object reference instantiated when a linked list object is initialized)  
    StackNode root; 
// Constructor to initialize any node in the linked list
// class node has the data in the data variable and the pointer to next node in the next variable
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            this.next=null;
        } 
    } 
    // Function to check if the stack is empty
    public boolean isEmpty() 
    { 
        //If root is null then return true else return false to indicate that the stack is empty
        return root == null;
    } 
  
    // Pushes a new element onto the stack
    // Creates a new node with the instance variable data populated as the value passed to the push method
    // The new node's next pointer is set to the current root, and then the root is updated to this new node
    // Each new node becomes the head of the linked list
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode; 
    } 

    // Pops the top element from the stack
    //If the stack is empty, it prints "Stack Underflow" and returns 0 by checking if root node/head is null
    //Each time an element is popped, the root is updated to the next node in the linked list
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element
    if (root == null) {
            System.out.println("Stack Underflow");
            return 0; // Return 0 if stack is empty
        }
        int poppedValue = root.data;
        root = root.next;
        return poppedValue;
    } 
   /* root is continuously updated to the next node hence the root will always be the last pushed element
     and this method returns the data of the root node without removing it from the stack */
  // If there are no elements in the stack then it returns 0 and prints "Stack Underflow" 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
          int topValue = 0;
        if (root != null) {
            topValue = root.data;
        }
        return topValue;
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
