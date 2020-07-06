class Stack {
    static final int MAX = 3;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() {
        top = 0;
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }

        a[top++] = x;
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (top-1 < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int val = a[top - 1];
        a[top - 1] = 0;
        top--;
        return val;
    }

    int peek() {
        return a[top - 1];
    }
}

// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        System.out.println(s.pop() + " Popped from stack");
        s.pop();
        s.pop();
    }
}
