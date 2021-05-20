class Stack { 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            top--;
            return a[top];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
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
        System.out.println("Before pop operation,Top value in stack is: " + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Check whether stack is empty: " + s.isEmpty());
        System.out.println("Top value in stack is: " + s.peek());
    }
}
