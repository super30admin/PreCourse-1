// Time Complexity : O(1)
// Space Complexity : O(1)
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Check if there is no element in array, then stack is empty
        return top == -1;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Check if array size is full, then return false
        if(top == a.length-1)
            return false;

        //push s in array at index=top and increment top by 1
        a[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Check if stack is empty, the return 0
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //pop element from the end of the array
        return a[top--];
    }

    int peek()
    {
        //Check if array is empty, then return 0
        if(isEmpty())
            return 0;

        //return element at index top-1
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
