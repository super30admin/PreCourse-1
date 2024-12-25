class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int[] a; // Maximum size of Stack

    boolean isEmpty()
    {
        return a.length ==0;
    }
    Stack()
    {
        top =-1;
        a = new int[MAX];
        //Initialize your constructor
    }

    boolean push(int x)
    {
        if(a.length >= MAX){
            System.out.println(" Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop()
    {
        if(isEmpty()){
            System.out.println(" Stack Underflow");
            return 0;
        }
        int val = a[top--];
        return val;
    }

    int peek()
    {
        if(top != -1){
            return a[top];
        }
        return -1;
        //Write your code here
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
