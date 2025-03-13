// Time Complexity: O(1)
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : N/A
// I don't see leetcode link to this problem 
// Any problem you faced while coding this:

// Your code here along with comments explaining your approach
class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        // if top is -1 that means stack is empty
        return top == -1;
    }

    boolean isFull() {
        // created utility function
        // below condition is to check if the stack is full
        return top == MAX - 1;
    }

    boolean push(int x) {
        // Check if the stack is full and print stack underflow
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        // initially top will be -1 so need to increment it 
        top++;
        // assign the value x to top of stack
        a[top] = x;
        // return true as success
        return true;
    }

    int pop() {
        // Check if array is empty print stack underflow and return -1
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        // store the value of top item of stack into temp
        // decrement the top
        // return the stored value of top from temp

        int temp = a[top];
        top -= 1;
        return temp;
    }

    int peek() {
        // Check if stack is empty print empty stack and return -1
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        // return top item of stack
        return a[top];
    }
;

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
