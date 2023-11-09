public class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1; // if stack is empty then top == -1
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x; // Increment top and insert the element
            System.out.println(x + "pushed into the stack");
            return true;
        }
    }

    int pop()
    {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--]; // decrement from the top by obtaining last element
            return x;
        }
    }

    int peek()
    {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
        }
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
