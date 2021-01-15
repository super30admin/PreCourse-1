class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top == 0;
    }

    Stack()
    {
        //Initialize your constructor
        top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[top] = x;
            top++;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top <= 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            top--;
            return a[top];
        }
    }

    int peek()
    {
        //Write your code here
        if(top == 0){
            return 0;
        }
        return(a[top-1]);
    }
}

// Driver code
class main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        //Some additional steps
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println("Is the stack empty? " + s.isEmpty());
        s.push(10);
        System.out.println(s.pop() + " Popped from stack");
    }
}
