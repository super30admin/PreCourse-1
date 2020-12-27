class Stack {
    static final int MAX = 1000;
    int top;
    int[] stack_array;

    boolean isEmpty()
    {
        //Write your code here
        return (top == -1);
    }

    Stack()
    {
        //Initialize your constructor
        stack_array = new int[MAX]; // Maximum size of Stack
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top == MAX)
            return false;
        stack_array[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        return stack_array[top--];
    }

    int peek()
    {
        //Write your code here
        return stack_array[top];
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
