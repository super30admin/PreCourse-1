/*Implementation of Stack using an array.
  Time Complexity: O(1) for push, pop and peek methods.
  Space Complexity: O(n) n - the size of the array created.
 */

import java.util.*;
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    int count = 0;

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return (a.length == count);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if(!isFull()) {
            top++;
            count++;
            a[top] = x;
            return true;
        }
        return false;
    }

    int pop() {
        if(!isEmpty()) {
            int t = a[top];
            top--;
            count--;
            return t;
        }
        return 0;
    }

    int peek() {
        return a[top];
    }
}

public class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
