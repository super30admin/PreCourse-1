/**
 * Space complexity - o(n) where n is size of array
 * Time complexity -
 *  isEmpty - o(1)
 *  push - o(1)
 *  pop - o(1)
 *  pop - o(1)
 */

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top == -1 ? true : false;
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
        top++;
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek()
    {
        //Write your code here
        if(top < 0) {
            System.out.println("Stack is empty");
            return 0;   // we can throw exception here as stack does not have any data
        }
        return top < 0 ? 0 : a[top];
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
