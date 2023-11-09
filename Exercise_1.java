// Time Complexity : O(n)
// Space Complexity : O(n)
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int[] a; // Maximum size of Stack

    boolean isEmpty() {
        //Write your code here
        return a.length == 0;
    }

    Stack() {
        a = new int[MAX];
        top = -1;
        //Initialize your constructor 
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (top < MAX) {
            top++;
            a[top] = x;
            return true;
        } else {
            System.out.println("Stack is full.");
            return false;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }


    int peek() {
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
