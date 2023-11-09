class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty()
    {
        return top<=0;
    }

    Stack()
    {
        top=-1;
    }

    boolean push(int x)
    {
        if (top >= MAX - 1)
        {
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop()
    {
        if (top < 0)
        {
            return 0;
        }
        int x = a[top--];
        return x;
    }

    int peek()
    {
        if (top < 0)
        {
            return 0;
        }
        return a[top];

    }
}

public class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
