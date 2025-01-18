class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return(top < 0);

    }

    Stack()
    {
        //Initialize your constructor
        top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top == MAX){
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[top] = x;
            top++;
            System.out.println("Pushed into stack " +x);
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            top--;
            int x = a[top];
            return x;
        }
    }

    int peek()
    {
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            int index = a[top];
//            System.out.println("Top element is " +index);
            return index;
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
        System.out.println(s.peek() + "Top element from stack");
    }
}
