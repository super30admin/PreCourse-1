
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {

        //Write your code here
        if( top < 0)
            return true;
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        int top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if( top == MAX)
        {
            System.out.println("Stack overflow: can't push element");
            return false;
        }
        top++;
        a[top] = x;
        return true;

    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow: can't pop element");
        }
        return a[top--];

    }

    int peek()
    {
        if(isEmpty()){
            System.out.println("Stack underflow: can't peek element");
            return -1;
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
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

        System.out.println(s.peek() + " Peek from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
