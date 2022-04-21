package Stacks;

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int count;

    boolean isEmpty()
    {
        //Write your code here
        return count == 0;
    }

    Stack()     // ---> LIFO
    {
        count = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(count == MAX)
        {
            return false;
        }

        a[count++] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[--count];

    }

    int peek()
    {
        return a[count-1];
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
