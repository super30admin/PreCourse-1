class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1){
            return true;
        }
        return false;
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
        top++;
        if(top == 1000){
            System.out.println("Stack overflow");
            return false;
        }
        a[top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = a[top];
        top--;
        return temp;
    }

    int peek()
    {
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
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
    }
}
