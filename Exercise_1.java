class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
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
        top = -1;
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == a.length - 1){
            return false;
        }

        //Write your code here
        top++;
        a[top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        //Write your code here
        int element = a[top];
        top--;
        return element;

    }

    int peek()
    {
        //Write your code here
        if(isEmpty()){
            return 0;
        }
        return a[top];
    }
}

// Driver code
public class Exercise1 {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
    }
}
