import java.util.*;

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    // Maximum size of Stack
    int a[] = new int[MAX];
    int count = 0;

    boolean isEmpty()
    {
        //Write your code here
        return top == -1;
    }

    boolean isFull() {
        return (a.length == count);
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(!isFull()) {
            top++;
            count++;
            a[top] = x;
            return true;
        }
        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()) {
            int t = a[top];
            top--;
            count--;
            return t;
        }
        return 0;
    }

    int peek()
    {
        //Write your code here
        return a[top];
    }
}

// Driver code
public class Exercise_1 {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
