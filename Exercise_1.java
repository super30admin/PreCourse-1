// Implementing stack using arrays
// Time Complexity:O(1) - we are only tracking top element
// Space complexity - Always Max value (1000) - constant - O(1)

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; // Maximum size of Stack
    int top;
    int a[] = new int[MAX];

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1){
            return true;
        }
        else{
            return false;
        }

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
        if (top == MAX-1){
            return false;
        }
        top = top + 1;
        a[top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            return 0;
        }
        int poppedElement = a[top];
        a[top] = 0;
        top = top - 1;
        return poppedElement;
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
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Top element from stack");
    }
}
