// Time Complexity :
// Time complexity for initialization of stack would be O(n) or in this case O(1000)
// Time complexitity for push  = O(1)
// Time complexitity for pop = O(1)
// Time complexitity for peek  = O(1)

// Space Complexity :
// Space complexity for stack would be O(n) or in this case O(1000)
// Space complexitity for push  = O(1)
// Space complexitity for pop = O(1)
// Space complexitity for peek  = O(1)

// Did this code successfully run on Leetcode : Not sure which leetcode question this is

// Any problem you faced while coding this :
// Had to lookup definitons of initialization and declaration. Also had to lookup static and final.
//Had to lookup time and space complexity of array

// Your code here along with comments explaining your approach

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; // Maximum size of stack
    int top; // Variable to indicate the position of the top element in stack
    int a[]; // Daclaration of the array

    boolean isEmpty() {
        // Write your code here
        if (top == -1) // Checking the position of the top element in stack
            return true; // Returning true if the stack has no element
        else
            return false; // Returning false if the stack has atleast one element
    }

    Stack() {
        // Initialize your constructor
        a = new int[MAX]; // Initializing array to the maximum size of stack
        top = -1; // Indicator of position of the top element in stack
    }

    boolean push(int x) {
        // Check for stack Overflow
        if (top == 1000) { // If the top element in stack is positioned on 1000 then no more elements can
                           // be added
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x; // incrementing top variable and then adding an element on the top position
            return true;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--]; // Getting the element on the top position and then decrementing top variable

    }

    int peek() {
        // Write your code here
        if (!isEmpty()) { // If the stack is not empty
            return a[top]; // Return the top element
        } else { // If the stack is empty
            System.out.println("stack empty");
            return 0;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
    }
}
