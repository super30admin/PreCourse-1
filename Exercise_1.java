package Super30;

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top=-1;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
        //Write your code here
    }

    Stack()
    {
        top=-1;
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX)
            return false;
        else{
            top++;
            a[top]=x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0){
            System.out.println(" Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }

    }

    int peek()
    {
        //Write your code here
        if(top < 0){
            System.out.println(" Stack Underflow");
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
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack "+s.pop()+" "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty()+" pushing 10 "+s.push(10)+" after pushing 10 "+s.isEmpty());
    }
}

