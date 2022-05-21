import java.io.*;
import java.util.*;

//Time Complexity O(1)
// Space Complexity O(Max_Value_Of_Integer)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    Stack()
    {
        this.top=-1;
        this.a=a;
        //Initialize your constructor
    }

    boolean push(int x)
    {
        if(top==MAX){
            return false;

        }
        this.top+=1;
        this.a[this.top]=x;
        return true;
        //Check for stack Overflow
        //Write your code here
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println(" Stack Under Flow");
            return 0;
        }
        else {
            int temp=this.a[this.top];
            this.top-=1;
            return temp;

        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }

    int peek()
    {

        return this.a[this.top];
        //Write your code here
    }
}
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        Stack s1 = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
