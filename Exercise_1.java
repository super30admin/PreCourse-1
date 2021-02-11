package preCourse1;

public class ImplementStackUsingArray {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top <= 0) {
            return true;
        } else {
            return false;
        }

    }

    ImplementStackUsingArray() {
        // Initializing top to -1
        top = -1;
    }

    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            System.out.println("Element successfully pushed on to stack");
            System.out.println(a[top]);
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("stack Underflow");
            return 0;
        } else {
            int temp = a[top];
            top--;
            return temp;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }

    public static void main(String[] args) {
        ImplementStackUsingArray s = new ImplementStackUsingArray();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");

    }
}
