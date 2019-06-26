class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1)
            return true;
        else
            return false;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;

    }

    boolean push(int x)
    {
        //Write your code here
        if(top == MAX)
            return false;
        else{
            a[top+1] = x;
            top = top+1;
            return true;
        }
    }

    int pop()
    {
        //Write your code here
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int pop = a[top];
            top = top-1;
            return pop;
        }


    }

    int peek()
    {
        //Write your code here
        if(this.isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        }
        else{
            return a[top];
        }
    }
}

// Driver code 
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();

       // System.out.println(s.pop() + " Popped from stack");
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
