/**
 * Time complexity = O(1)
 * Space complexity = O(n)
 */
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        return a.length == 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top < MAX) {
            top += 1;
            a[top] = x;
            return true;
        }
        System.out.println("Stack Overflow");
        return false;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top >= 0) {
            int topValue = a[top];
            top -= 1;
            return topValue;
        }
        System.out.println("Stack Underflow");
        return 0;
    }

    int peek() {
        if (a.length > 0) {
            int topValue = a[top];
            return topValue;
        }
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
