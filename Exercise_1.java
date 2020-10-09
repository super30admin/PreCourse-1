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
        if(top+1>=MAX){
            System.out.println(" Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
        }
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top>0){
            return a[top--];
        }
        System.out.println(" Stack Underflow");
        return 0;
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
        s.push(1);
        s.push(2);
        s.push(3);
        for(int i=4;i<=1002;i++){
            s.push(i);
        }
        System.out.println(s.pop() + " Popped from stack");
    }
}

