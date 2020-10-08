class Stack {
    static final int MAX = 1000;
    int top;
    int size;
    int a[];

    boolean isEmpty() {

        return (top == -1);
    }

    boolean isFull() {
        return (top == size - 1);
    }

    Stack(int size) {

        this.size = size;
        this.a = new int[size];
        this.top = -1;
    }

    boolean push(int x) {

        if (!isFull()) {
            a[++top] = x;
            System.out.print("Pushed " + x);
            return true;
        } else {
            System.out.print("Stack Overflow: could not push " + x);
            return false;
        }
    }

    int pop() {

        if (!isEmpty()) {
            int val = a[top];
            top--;
            return val;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    int peek() {
        return a[top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack(5);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(" " + s.push(10));
        System.out.println(" " + s.push(20));
        System.out.println(" " + s.push(30));
        System.out.println(" " + s.push(40));
        System.out.println(" " + s.push(50));
        System.out.println(" " + s.push(60));
        System.out.println(" " + s.pop() + " Popped from stack");
    }
}
