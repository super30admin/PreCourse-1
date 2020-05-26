//Problem 1: Implement Stack using Array

//Time Complexity : O(1) for each action, Insiertion, Deletion, Peek..
//Space Complexity : O(n) No of input elements to be pushed to stack
// Any problem you faced while coding this : No

class Stack {
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
        if(top == MAX - 1){
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    int peek()
    {
        //Write your code here
        if(isEmpty())
            return -1;
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
    }
}
