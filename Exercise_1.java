class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 2;
    int top;
    int defaultEmptyValue = -1;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        //Write your code here
        return (top == defaultEmptyValue);
    }

    Stack() {
        //Initialize your constructor
        top = defaultEmptyValue; // Initializing top with -1
        System.out.println("Stack initialized isEmpty : " + isEmpty() + " with Stack Size " + a.length);
    }

    boolean push(int x) {
        //Check for stack Overflow
        int stackLength = a.length -1;
        if (top < stackLength) {
            top = top + 1;
            a[top] = x;
            System.out.println("Pushed elem :" + x);
            return true;
        } else {
            System.out.println("Stack is Full, could not push : " + x);
            return false;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int popElem = a[top];
        top = top - 1;
        return popElem;
    }

    int peek() {
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
        }
    }
}

// Driver code 
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
    }
}
