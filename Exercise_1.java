
public class stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Return true if the stack is empty
        if(top==-1)
            return true;
        return false;
    }

    stack()
    {
        //Initialize the top element
        top=-1;
    }

    boolean push(int x)
    {
        //push the new element x
        if(top>=MAX)
            return false;
        else
        {
            a[++top]=x;
            return true;
        }
    }

    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return a[top--];
    }

    int peek()
    {
        if(top>=0)
            return a[top];
        else
            return -1;
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()+" Popped from stack");
    }
}
