
class Stack {
    static final int MAX = 3;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top < 0;
    }

    Stack()
    {
        top=-1;//Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top >= MAX -1) {
            return false;
        }else{
            //Write your code here
            a[++top] = x;
            return true;
        }

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int data = a[top--];
        return data;

    }

    int peek()
    {
        //Write your code here
        if(!isEmpty()){
            return a[top];
        }else{
            System.out.println("stack is empty!");
            return 0;
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