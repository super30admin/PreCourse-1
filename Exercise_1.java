// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int arr[];
//    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
       if (top == arr.length) {
           return true;
       }
       return false;
    }

    Stack()
    {
        //Initialize your constructor
        this.arr = new int[MAX];
        this.top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if (isFull()) return false;
        //Write your code here
        arr[++top] = x;
        return true;
    }

    String pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) return (0 + " Stack Underflow");
        //Write your code here
        return (arr[top--] +  " Popped from stack");
    }

    int peek()
    {
        //Write your code here
        if (isEmpty()) return 0;
        return arr[top];
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

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek() + " Peeked from stack");
    }
}
 