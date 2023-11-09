class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return (top == -1);
    }

    Stack()
    {
        this.top = -1;
        this.a = new int[MAX];
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if (!(top==MAX-1)) {
            top++;
            a[top] = x;
            return true;
        } else {
            System.out.println("Stack is full !");
            return false;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (!isEmpty()) {
            int returntopelement = top;
            top--;
            return a[returntopelement];

        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }

    int peek()
    {
        //Write your code here
        if(!this.isEmpty())
            return a[top];
        else
        {
            System.out.println("Stack is Empty");
            return -1;
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
