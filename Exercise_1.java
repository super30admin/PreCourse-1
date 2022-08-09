//Time and space complexities
//Time Complexity : isEmpty(): O(1) , Push() : O(1) , Pop() : O(1), Peek() : O(1)
//Space Complexity : O(N) (as we are creating a new stack )

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        //the stack is empty if top is empty
        if (top == -1)
            return true;
        else
            return false;

    }

    Stack() {
        //Initializing the constructor
        top = -1;
    }

    boolean push(int x) {

        //checking for overflow
        //checking if the stack is full
        if (top == 999) {
            System.out.println("Stack is Overflow");
            return false;
        } else {
            //if there is no overflow
            //top is increased
            //x is pushed to the top of stack
            top++;
            a[top] = x;

            return true;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int topOfStack = a[top];
            top--;
            return topOfStack;

        }

    }

    int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return 0;
        } else
            return a[top];
    }

    // Driver code
        public static void main(String args[]) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
        }

}
