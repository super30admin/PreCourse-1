class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Time complexity is O(1) for each operation and space complexity is O(N)

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return (top < 0);
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

        if(top >= (MAX -1)) {
            System.out.println("stack full");

            return false;
        }

        a[++top] = x;
        System.out.println("pushed to stack");

        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top < 0) {
            System.out.println("stack empty");

            return 0;
        }

        int element = a[top--];

        return element;
    }

    int peek()
    {
        if(top < 0) {
            System.out.println("stack empty");

            return 0;
        }

        return a[top];
    }
}

// Driver code 
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        System.out.println(s.peek());
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
    }
}
