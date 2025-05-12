// Time Complexity: 
// - push(): O(1)
// - pop(): O(1)
// - peek(): O(1)
// - isEmpty(): O(1)
// Space Complexity: O(n) where n = MAX (1000)
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1; 
    }

    boolean push(int x) {
        if (top == MAX - 1) {
            System.out.println(" Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if (top == -1) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println(" Stack is empty");
            return 0;
        }
        return a[top];
    }
}

class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
