// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // if the top value is -1 than returning true indicating that stack is
        // empty else otherwise
        return top == -1;
    }

    Stack() {
        // Setting the top value to -1 when for empty stack
        top = -1;
    }

    boolean push(int x) {
        // Checking if the array is reached to its max capacity, if so then returning
        // false
        if (top == 1000) {
            return false;
        }
        // Else incrementing the top and pushing the data to the array at top position
        else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // Checking if stack is empty, returning 0 else returning the last value pushed
        // keeping LIFO in mind
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek() {
        // peek is just returning - not deleting - unlike pop
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
