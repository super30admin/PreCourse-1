// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top<0); // checking if top = -1 (start of the stack)
    }

    Stack()
    {
        top = -1; // initializing stack by making top = -1
    }

    boolean push(int x)
    {
        if(top >= MAX-1)
        {
            return false; // check if we are out of bound
        }
        else{
            a[++top] = x; // assigning elemnt to the array after incrementing the top so ++top
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    }

    int pop()
    {
        if(isEmpty()){
            return 0;  // check if array is empty return the top element and decrement the element by -1
        }
        else
        {
            return a[top--];
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

    }

    int peek()
    {
        if(isEmpty()) // check for the array if that's not empty then return the top element
        {
            return 0;
        }
        else{
            return a[top];
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
        System.out.println(s.peek() + " peek from stack");
    }
}
