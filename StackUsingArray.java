// Time Complexity : O(1) since we have not used any loop to traverse the array

// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Stack operating as LIFO(last in first out), so set a pointer top to -1 to know the array index,
//add the elements of the stack by incrementing the variable top while pushing the element to stack
//store the element to pop in a new variable and decrement the top while popping the element from stack
//to check is empty if the top is less than 0 then stack is empty
//for peek the element, return the top most / last element of the array

class StackUsingArray {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top < 0;
    }

    StackUsingArray()
    {
        //Initialize your constructor
        top = -1;

    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX-1)){
            System.out.println(" Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
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
            return a[top--];
        }

    }

    int peek()
    {
        //Write your code here
        if(isEmpty()){
            System.out.println(" Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }
}

// Driver code 
class Main {
    public static void main(String args[])
    {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
