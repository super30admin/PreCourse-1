class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Time Complexity :
    // Push (O(1)), Pop(O(1)), Peek(O(1))
    // Space Complexity :
    // O(1), No additional space used, just the array to keep the values
    // Did this code successfully run on Leetcode :
    // Didn't find exact problem on leetcode
    // Any problem you faced while coding this :
    // No
    // Approach :
    // Insert value to/remove value from the end of the array using top as pointer.

    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == 0;
    }

    Stack() {
        //Initialize your constructor
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX) {
            return false;
        }
        a[top++] = x;
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topMost = a[top - 1];
        top--;
        return topMost;
    }

    int peek() {
        //Write your code here
        if (top == 0 || top == MAX) return 0;
        return a[top - 1];
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    }
}
