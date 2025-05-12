// Time Complexity :
// push = O(1)
// pop = O(1)
// peek  = O(1)
//
// Space Complexity :O(N), where N = length of array
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        if( top == -1 ){
            return true;
        }
        return false;
        //Write your code here
    }

    Stack()
    {
        top = -1;
        //Initialize your constructor
    }

    boolean push(int x)
    {
        if(top == a.length -1){
            return false;
        }
        a[top+1]=x;
        top++;
        return true;
        //Check for stack Overflow
        //Write your code here
    }

    int pop()
    {
        if(top == -1){
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }

    int peek()
    {
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return a[top];
        //Write your code here
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
