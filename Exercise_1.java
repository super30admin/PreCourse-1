// Time Complexity :                                    O(n)
// Space Complexity :                                   O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :            NO

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return top + 1 == MAX;
    }

    boolean push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if (!isEmpty()) {
            int val = a[top];
            top--;
            return val;
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }

    int peek() {
        if (!isEmpty()) {
            return a[top];
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
}

// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println(s.pop() + " Popped from stack");
        s.push(10);
        s.push(20);
        System.out.println(s.pop() + " Popped from stack");
        s.push(40);
        s.push(30);
        System.out.println(s.peek() + " Top Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        for (int i = 1; i <= 1000; i++) {
            s.push(i);
        }
        //size 1000 and incoming data will insert at index 1000
        s.push(3230);
    }
}
