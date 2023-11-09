class Stack {
    // The stack follow LIFO principal
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file >> O(1) for both
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1; // This method checks if the stack is empty and return true. The top variable at -1 tell the same
    }

    Stack()
    {
        this.top = -1; // initializing the top to -1 (means empty stack) variable whe creating the class object
    }

    boolean push(int x)
    {
// This is the push method which checks the stack is not at MAX capacity and then if not inserts the data at the top of the stack
// and return true

        if(top == MAX - 1){

            return false;
        }else
            a[++top] = x;
        return true;
    }

    int pop()
    {
        //This is the pop method which check if the stack is empty and if not returns the topmost item and removes it.
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");

        }

        return a[top--];
    }

    int peek()
    {
        //This is the peek method and this returns the last element from the stack.
        if (isEmpty()) {
            System.out.println("Stack is empty");
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
    }
}
