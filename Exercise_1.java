class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return this.top < 0;
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

        if(this.top < Stack.MAX) {
            a[++top] = x;
            return true;
        } else {

            System.out.println("Stack Overflow");
            return false;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(this.top > -1) {
            return a[top--];
        } else {

            System.out.println("Stack Underflow");
            return 0;
        }
    }

    int peek()
    {
        //Write your code here
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
    }
}
