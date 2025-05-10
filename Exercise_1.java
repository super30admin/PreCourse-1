class Stack {
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        return top==-1;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= 1000) {
            return false;
        }
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int result = a[top];
        top--;
        return result;
    }

    int peek() {
        return a[top];
    }
}

// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        System.out.println(s.peek());
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
    }
}
