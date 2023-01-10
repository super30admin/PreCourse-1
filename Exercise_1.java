class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    /*
     Time Complexity :

     push - O(1)

     isEmpty - O(1)

     pop - Top Element O(1)
         - Any other element - O(n) where n is the position of element w.r.t top element

     peek - O(1)
    */
    static final int MAX = 1000;
    int top;
    int a[]; // Maximum size of Stack

    Stack()
    {
        //Initialize your constructor
        top=-1;
        a= new int[MAX];
    }

    boolean isEmpty()
    {
        //Write your code here
        if(top==-1)
        {
            return true;
        }
        return false;
    }



    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top==MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            top+=1;
            a[top]=x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top];
            top-=1;
            return x;
        }
    }

    int peek()
    {
        //Write your code here
        if(isEmpty())
        {
            return -1;
        }
        return a[top];
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
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
}
