// Time Complexity :
//Push is O(N)
//Pop is O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// No it gave following error: Line -26: error: Stack is already defined in this compilation unit [in Main.java]
//import java.util.Stack;
//It worked fine in IntelliJ
// Any problem you faced while coding this : Only that it didn't run on leetcode
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if (top == -1){
            return true;
        }

        else {
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
        if (top == a.length - 1){
            System.out.println("Can not perform push as stack is full. Stack overflow");
            return false;
        }
        else{
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    }

    int peek()
    {
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else
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
