// Time Complexity:
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space Complexity:
// The space complexity of the Stack is O(MAX), where MAX is the maximum size of the stack.

class Stack { 
    static final int MAX = 1000;  // Define the maximum size of the stack
    int top;                      // Variable to keep track of the top element index
    int a[] = new int[MAX];       // Array to store stack elements with a maximum size of MAX

    // Method to check if the stack is empty
    boolean isEmpty() { 
        return (top < 0);         // Returns true if top is less than 0, indicating the stack is empty
    } 

    // Constructor to initialize the stack
    Stack() { 
        top = -1;                 // Initialize top to -1 to indicate that the stack is empty
    } 

    // Method to push an element onto the stack
    boolean push(int x) { 
        if (top >= (MAX - 1)) {   // Check if the stack is full
            System.out.println("Stack Overflow"); // Print "Stack Overflow" if the stack is full
            return false;         // Return false indicating the push operation failed
        } else { 
            a[++top] = x;         // Increment top and add the element to the stack
            System.out.println(x + " pushed into stack"); // Print the pushed element
            return true;          // Return true indicating the push operation succeeded
        } 
    } 

    // Method to pop an element from the stack
    int pop() { 
        if (top < 0) {            // Check if the stack is empty
            System.out.println("Stack Underflow"); // Print "Stack Underflow" if the stack is empty
            return 0;             // Return 0 indicating the pop operation failed
        } else { 
            int x = a[top--];     // Retrieve the top element and decrement top
            return x;             // Return the popped element
        } 
    } 

    // Method to get the top element of the stack without removing it
    int peek() { 
        if (top < 0) {            // Check if the stack is empty
            System.out.println("Stack Underflow"); // Print "Stack Underflow" if the stack is empty
            return 0;             // Return 0 indicating there is no top element
        } else { 
            return a[top];        // Return the top element without removing it
        } 
    } 
} 

// Driver code to test the stack implementation
class Main { 
    public static void main(String args[]) { 
        Stack s = new Stack();    // Create a new stack instance
        s.push(10);               // Push 10 onto the stack
        s.push(20);               // Push 20 onto the stack
        s.push(30);               // Push 30 onto the stack
        System.out.println(s.pop() + " Popped from stack"); // Pop an element from the stack and print it
    } 
}
