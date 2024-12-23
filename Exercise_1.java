// Time Complexity : O(1)
// Space Complexity : O(n)
// Code runs correctly for the test cases provided. I have included the checks.

class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    // Initializing the top -1 as its empty.
    Stack() {
        top = -1;
    }

    // Method to check for an array if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Method to add a new element to an array if not full
    boolean push(int x) {
        if (top + 1 == MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
        }
        a[top] = x;
        return true;
    }

    // Method to pop an element if not empty
    int pop() {
        if (isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        int elementToBeRemoved = a[top];
        a[top] = 0;
        top--;
        return elementToBeRemoved;
    }

    // Method to retrieve the last element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top];
    }
}

// Driver code
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
