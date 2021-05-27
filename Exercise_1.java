class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top==-1);
    }

    Stack()
    {
        top=-1;
    }
    boolean push(int x)
    {
        if(!isFull())
        {
            a[++top]= x;
            return true;
        }
        else
        {
            System.out.println("Stack overflow");
            return false;
        }
    }

    int pop()
    {
        if(!isEmpty())
        {
            int number = a[top];
            top--;
            return number;
        }
        else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    int peek()
    {
        return a[top];
    }
    boolean isFull()
    {
        return (top > MAX);
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}