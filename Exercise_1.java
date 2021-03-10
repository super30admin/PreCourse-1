class Stack {
    static final int MAX = 1000;
    int top;
    int a[]; // Maximum size of Stack
//    int size;

    boolean isEmpty()
    {
        if(top == 0){
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        a = new int[MAX];
        top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here

        if(top == MAX){
            System.out.println("Stack Overflow");
            return false;
        }

        a[top++] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top == 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        int topElement = a[top-1];
        a[top-1] = -1;
        top--;
        return topElement;
    }

    int peek()
    {
        //Write your code here
        return a[top-1];
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
        System.out.println(s.peek() + " Peak - stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peak - stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("is stack empty? "+ s.isEmpty());
        s.push(40);
        System.out.println(s.peek() + " Peak - stack");
        System.out.println("is stack empty? "+ s.isEmpty());
    }
}
