package S30;

class Stack {

//    Time and Space Complexities:
//    Push:
//        TC:
//          Worst case: O(n), if stack is full
//          Best Case: O(1), if stack is empty
//        SC: O(n)
//    Pop:
//         TC: O(1)
//         SC: O(n)
//    Peek:
//         TC: O(1)
//         SC: O(n)
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1;
    }

    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if(top == MAX-1) {
            System.out.println("Stack is full");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        return a[top--];
        //Write your code here
    }

    int peek()
    {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
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

