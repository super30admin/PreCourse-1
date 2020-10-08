class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top==-1 ? true : false;
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
        if(top==MAX-1){
            System.out.println("Stack OverFlow" );
            return false;
        } else{
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow" );
            return 0;
        } else {
            int num = a[top];
            top--;
            return num;
        }
    }

    int peek()
    {
        //Write your code here
        //if stack empty then return 0 else return stack top element
        return top==-1 ? 0 : a[top];
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
