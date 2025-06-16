// Time Complexity:
// push() - O(1), Inserting at the head takes constant time
// pop()  - O(1), Removing the top node (head) is also constant time
// peek() - O(1), Accessing the top node without removing it
// isEmpty() - O(1), Simple null check

// Space Complexity:
// O(n), where n is the number of elements in the stack

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

    public boolean isEmpty() 
    { 
        // condition if stack is empty
        return root == null;
    } 
  
    public void push(int data) 
    { 
        // Push data to the stack
        StackNode newNode = new StackNode(data);
        // Check for stack Overflow
        if (newNode == null) {
            System.out.println("Stack Overflow");
            return; // Stack is full
        } else {
            newNode.next = root; // Link the new node to the previous root
            root = newNode; // Update root to point to the new node
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; // Stack is empty
        }
        // Pop the topmost element of stack
        int poppedData = root.data;
        root = root.next; // Move the root to the next node
        return poppedData;
    } 
  
    public int peek() 
    { 
        // return the topmost element without removing it
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return root.data; // Return the data of the top node
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
