// Time Complexity : O(1) 
// Space Complexity : O(size of the array)  // Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this:  No
// Your code here along with comments explaining your approach: For pushing the data, first we check if the index of the array has space in it to add elements, if it has, then we add the element to the next index of the array. To pop, it checks if the array is not empty, if it is not then it returns the value at the last index.


class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        return (top < 0);
    }

    Stack() {
        // Initialize your constructor
        top = -1;

    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        else {
            a[++top] = x;
            return true;
        }

    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here

        if (top < 0) {
            System.out.println("Stack Undefllow");
            return 0;
        }

        else {

            return a[top--];
        }
    }

    int peek() {
        // Write your code here
        if (top < 0) {
            return 0;
        }

        else {
            return a[top];
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
