// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : couldn’t find this question on leetcode

// Your code here along with comments explaining your approach

class Stack {
// Any problem you faced while coding this : No
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        // if top=-1 as initialised in constructor then stack is empty and hence true returned otherwise false
        if(top==-1){
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        // initialising top with -1 so that stack is empty with array’s initial index as -1;
        top=-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        // while adding if top reaches MAX then array is full hence false returned otherwise increment top and add element in array
        // if top ==-1
        if(top==MAX) {
            return false;
        }
        else{
            ++top;
            a[top]=x;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        // if top=-1 then stack empty hence return 0 with message underflow else decrement top and then return value of array with index top.
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    }

    int peek()
    {
        if(either top=-1 or top=MAX we cannot check the top of array otherwise return array with index top
        //Write your code here
        if(top==-1 || top==MAX)
            return 0;
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
