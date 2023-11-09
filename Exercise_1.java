// Time = O(1)
// Space = O(1)
class Stack {
    static final int MAX = 1000;
    private int top;
    private int a[];

    boolean isEmpty() {
        return top != -1;
    }

    Stack() {
        a = new int[MAX];
        top = -1;
    }

    boolean push(int x) {
        if(top == MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
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
