// Time Complexity :

  //boolean isEmpty() - O(1)
  //boolean push() - O(1)
  //int pop() - O(1)
  //int peek() - O(1)

// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top < 0;
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
        if(top < MAX){
          top++;
          a[top] = x;
          return true;
        }
        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top > 0){
          int lastElement = a[top];
          top--;
          return lastElement;
        }

        System.out.println("Stack Underflow");
        return 0;
    }

    int peek()
    {
        //Write your code here
        if(top > 0)
          return a[top];

        return Integer.MIN_VALUE;
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
