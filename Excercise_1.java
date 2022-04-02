import java.util.Arrays;

import javax.swing.text.rtf.RTFEditorKit;

class Excercise_1 {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    // Maximum size of Stack
    static final int MAX = 10;
    int top;
    int[] a;

    boolean isEmpty() {
        // Write your code here
        return this.top == -1;
    }

    Excercise_1() {
        // Initialize your constructor
        top = -1;
        a = new int[MAX];

    }

    // TC- O(1), SC - O(N)
    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (this.top == MAX - 1) {
            return false;
        }
        this.top = this.top + 1;
        a[this.top] = x;

        // System.out.println(this.top);
        return true;
    }

    // TC- O(1), SC - O(1)
    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (this.isEmpty())
            return 0;
        // System.out.println("hello in pop" + this.top)
        int res = this.top;
        this.top = this.top - 1;
        // System.out.println("hello in pop" + a[this.top--]);
        return a[res];

    }

    // TC- O(1), SC - O(1)
    int peek() {
        // Write your code here
        if (this.isEmpty())
            return 0;
        // System.out.println(Arrays.toString(a));

        return a[this.top];
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Excercise_1 s = new Excercise_1();
        s.push(10);
        s.push(20);
        s.push(90);
        s.push(10);
        s.push(20);
        s.push(90);
        System.out.println(Arrays.toString(s.a) + s.peek() + " Peeked from stack \n");
        s.push(30);
        System.out.println(Arrays.toString(s.a) + s.pop() + " Popped from stack \n ");
        s.push(40);
        System.out.println(Arrays.toString(s.a) + s.pop() + " Popped from stack \n ");
    }
}
