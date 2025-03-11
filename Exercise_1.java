package s30.preCourse1;

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1;
    }

    Stack()
    {
       a = new int[MAX];
       top = -1;
    }

    //If stack is full return new Exception.
    //else add element to stack
    boolean push(int x)
    {
        if(top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }

    //If empty return 0 and print " Stack Underflow"
    //else initialize the element on top as 0
    int pop()
    {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int num = a[top];
            top--;
            return num;
        }
    }

    int peek()
    {
        if(top == -1) {
            System.out.println("Empty stack");
            return -1;
        } else {
            return a[top];
        }
    }
}

// Driver code
class Main1 {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
    }
}
