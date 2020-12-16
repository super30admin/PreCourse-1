// Time Complexity : 0(1)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == 0;
    }

    Stack()
    {
        //Initialize your constructor
        this.top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here

        if(top<=MAX){
            a[top]=x;
            top++;
            return true;
        } else {
            return false;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println(" Stack Underflow");
            return 0;
        } else {
            top--;
            int temp = a[top];
            a[top]=0;
            return temp; //popped value
        }
    }

    int peek()
    {
        //Write your code here
        if(!isEmpty()){
            return a[top-1];
        }
        return 0;
    }
}

public class Exercise_1 {
    // Driver code
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
