class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack()
    {
        // Top initialization before
        top = -1;
    }

    boolean isEmpty()
    {
        return (top < 0);
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        // If top is pointing to last element in array or beyond it
        if(top >= (MAX -1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println("Element "+ x + " pushed into Stack");
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print "Stack Underflow"
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
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
