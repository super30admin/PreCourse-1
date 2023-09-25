// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
public class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file

    /**
     * Stack Capacity
     */
    private static final int MAX = 1000;
    /**
     * Stack Size = # of elements in the stack
     */
    private int top;
    private int a[] = new int[MAX]; // Maximum size of Stack

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return true == empty, else false
     */
    public boolean isEmpty() {
        // Write your code here
        /**
         * If stack size = 0 => stack is empty
         */
        return top == 0;
    }

    public Stack() {
        // Initialize your constructor
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @param x
     * @return
     */
    public boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        /**
         * if size == capacity => no more elements can be added => return false
         */
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[top] = x;
        /**
         * Increase the size by 1
         */
        top++;
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return
     */
    public int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        /**
         * If stack is empty => nothing can be popped => return 0
         */
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        /**
         * top-1 = index of the top element
         */
        int pop = a[top - 1];
        /**
         * Decrease the size by 1
         */
        top--;
        return pop;
    }

    /**
     * TC: O(1) <br>
     * SC: O(1)
     * 
     * @return
     */
    public int peek() {
        // Write your code here
        if (isEmpty()) {
            return 0;
        }
        return a[top];
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
