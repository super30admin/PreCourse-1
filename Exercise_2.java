// Time Complexity:
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space Complexity:
// The space complexity of the Stack is O(n), where n is the number of elements in the stack.

public class StackAsLinkedList { 

    StackNode root; // Root node of the stack

    // Node class to represent each element in the stack
    static class StackNode { 
        int data;          // Data part of the node
        StackNode next;    // Pointer to the next node

        // Constructor to initialize a node
        StackNode(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 

    // Method to check if the stack is empty
    public boolean isEmpty() { 
        return root == null; // Return true if root is null, indicating the stack is empty
    } 

    // Method to push an element onto the stack
    public void push(int data) { 
        StackNode newNode = new StackNode(data); // Create a new node with the given data
        newNode.next = root; // Make the new node point to the current root
        root = newNode; // Update the root to be the new node
        System.out.println(data + " pushed to stack"); // Print the pushed element
    } 

    // Method to pop an element from the stack
    public int pop() { 
        if (root == null) { // Check if the stack is empty
            System.out.println("Stack Underflow"); // Print "Stack Underflow" if the stack is empty
            return 0; // Return 0 indicating the pop operation failed
        } else { 
            int popped = root.data; // Retrieve the data from the root node
            root = root.next; // Update the root to the next node
            return popped; // Return the popped element
        } 
    } 

    // Method to get the top element of the stack without removing it
    public int peek() { 
        if (root == null) { // Check if the stack is empty
            System.out.println("Stack Underflow"); // Print "Stack Underflow" if the stack is empty
            return 0; // Return 0 indicating there is no top element
        } else { 
            return root.data; // Return the data of the root node
        } 
    } 

    // Driver code to test the stack implementation
    public static void main(String[] args) { 
        StackAsLinkedList sll = new StackAsLinkedList(); // Create a new stack instance

        sll.push(10); // Push 10 onto the stack
        sll.push(20); // Push 20 onto the stack
        sll.push(30); // Push 30 onto the stack

        System.out.println(sll.pop() + " popped from stack"); // Pop an element from the stack and print it

        System.out.println("Top element is " + sll.peek()); // Get the top element and print it
    } 
} 