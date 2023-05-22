class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == -1;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (a.length - top > 1) {
            top++;
            a[top] = x;
            return true;
        } else {
            System.out.println("Stack Overflow");
            return false;
        }
    }

    int pop() {
        if (top >= 0) {
            int temp = top;
            top--;
            return a[temp];
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    int peek() {
        if (top >= 0)
            return a[top];
        return -1;
    }
}

// Driver code
public class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}