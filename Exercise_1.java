// Time Complexity : All operations are O(1)
// Space Complexity : As we have defined the array of MAX size, so SC is O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Class name should be kept Exercise_1 or Stack?
// I wanted to keep it as "Stack" for better reference but followed the video provided and didn't change the
// name of the class from "Exercise_1" to "Stack".

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        return top == 0 ? true : false;
    }

    Stack() {
        //Initialize your constructor
        top = 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top == MAX)
            return false;
        a[top++] = x;
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--top];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top - 1];
    }
}

// Driver code 
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        System.out.println(s.pop() + " Popped from stack");
    }
}
