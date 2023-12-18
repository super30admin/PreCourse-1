class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    // Pushing  - O(1) , Pop - O(1) , Peak - O(1) ; Space Complexity is O(n)
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return(top==-1);

    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top + 1 == MAX) {
            System.out.println("Stack is full");
            return false;
        } 
        else {
            top = top + 1;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack overflow");
            return 0;
        } else {
            int popelement = a[top];
            top--;
            return popelement;
        }

    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack empty");
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
    }
}
