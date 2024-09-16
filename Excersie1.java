// Time Complexity : 0(n)
// Space Complexity :0(n) , Size of array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    int[] arr1 = new int[5];
    int top = -1;

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1) {
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == 5-1) {
            System.out.println("stack Overflow");
            return false;
        }
        top = top+1;
        arr1[top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        int x = arr1[top];
        top--;
        return x;

    }

    int peek()
    {
        return arr1[top];

    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
    }
}
