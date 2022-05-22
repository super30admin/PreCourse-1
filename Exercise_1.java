class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int []a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top==-1;
    }

    Stack()
    {
        //Initialize your constructor
        top=-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        //top =isEmpty()?0:top;
        top+=1;
        if (top==MAX){
            System.out.println("Stack Overflow");
            top-=1;
            return false;
        }
        a[top]=x;

        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int out=0;
        if (isEmpty()){
            System.out.println("Stack Underflow");

        }
        else {
            out=a[top];
            top-=1;

        }
        return out;
    }

    int peek()
    {
        //Write your code here
        int out=0;
        if (isEmpty()){
            System.out.println("Stack Underflow");
        }
        else {
            out=a[top-1];


        }
        return out;
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
