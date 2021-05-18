class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top == 0) {
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        top=0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        boolean stat = false;
        if(top < MAX) {
            a[top] = x;
            top++;
            stat=true;
        }
        return stat;

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int retVal = -1;
        if(top != 0) {
            top--;
            retVal = a[top];
        }
        return retVal;
    }

    int peek()
    {
        //Write your code here
        int retVal = -1;
        if(top != 0) {
            retVal = a[top-1];
        }
        return retVal;
    }
}

class Exercise_1 {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}