// Time Complexity : O(1)
// Space Complexity : O(n) where n is size of stack
// Did this code successfully run on Leetcode : Did not find it in leetcode
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// top will point to head of stack
// everytime we add something to stack we insert it at top+1 position in array and increase the top
// everytime we remove something from stack we decrease the top

class Stack {
    static final int MAX = 1000;
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    Stack() {
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top < MAX - 1) {
            a[++top] = x;
            return true;
        }
        return false;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top >= 0) {
            return a[top--];
        }
        System.out.println(" Stack Underflow");
        return 0;
    }

    int peek() {
        if (top >= 0) return a[top];
        System.out.println(" Stack Underflow");
        return 0;
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
