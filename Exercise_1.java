class Stack {
    // Time Complexity: 
    //   isEmpty: O(1)
    //   push: O(1)
    //   pop: O(1)
    //   peek: O(1)
    // Space Complexity: O(n) - for the stack elements 

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; 

    // Method to check if the stack is empty
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    boolean isEmpty() {
        return top == -1;
    }

    // Constructor
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    Stack() {
        top = -1;
    }

    // Method to push an element onto the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1) - new elements are added into the existing array, no additional space is used
    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Method to pop an element from the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int poppedElement = a[top--];
            return poppedElement;
        }
    }

    // Method to get the top element of the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int topElement = a[top];
            return topElement;
        }
    }
}

// Driver code 
// Time Complexity: O(1) for each push and pop operation
// Space Complexity: O(1) for each push operation
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
