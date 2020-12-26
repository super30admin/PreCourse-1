public class StackArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top<-1;
    }

    StackArray()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX-1)
        {
            System.out.println("Stack overflow");
            return false;
        }
        a[++top]=x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0)
            return 0;
        else
            return a[top--];
    }

    int peek()
    {
        //Write your code here
        if(top!=-1)
            return a[top];
        else
            return -1;
    }

// Driver code

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " is top from stack");
    }
}
