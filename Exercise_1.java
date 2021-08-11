/**
 * Stack
 */
public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (this.top > 0)
            return true;
        else
            return false;
    }

    Stack() {
        this.top = 0;
    }

    boolean push(int x) {
        if (top > MAX)
            return false;
        else {
            this.a[top++] = x;
            return true;
        }
    }

    int pop() {
        if (top > 0) {
            top--;
            return a[top];
        } else
            return 0;
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
        System.out.println(s.peek() + " is the peak of the stack");
        s.push(20);
        System.out.println(s.peek() + " is the peak of the stack");
        s.push(30);
        System.out.println(s.peek() + " is the peak of the stack");

        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }

}