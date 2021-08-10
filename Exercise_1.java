class Stack
{
    static final int MAX = 1000;
    int a[] = new int[MAX]; // Maximum size of Stack
    int idx;

    boolean isEmpty()
    {
        return a.length == 0;
    }

    Stack()
    {
        idx = 0;
    }

    boolean push(int x)
    {
        if (idx == MAX)
        {
            return false;
        }
        else
        {
            a[idx++] = x;
            return true;
        }
    }

    int pop()
    {
        int ele = 0;
        if (idx == 0)
            return 0;
        else
        {
            ele = a[--idx];
            a[idx] = 0;
        }
        return ele;
    }

    int peek()
    {
        int ele = 0;
        if (idx == 0)
            return 0;
        else
        {
            ele = a[--idx];
            idx++;
        }
        return ele;
    }
}

class Main
{

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(20);
        int a = s.pop();
        int q = s.peek();

    }
}