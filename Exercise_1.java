// Time Complexity : O(1) (since push,pop and peek take constant time)
// Space Complexity : O(1) [Do we have to consider the array used to store the elements?]
// Did this code successfully run on Leetcode : No. Ran it on my local machine.
// Any problem you faced while coding this : No 

// Your code here along with comments explaining your approach
class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
     static final int MAX = 1000; 
     int top;
    int a[];// Maximum size of Stack

     boolean isEmpty() {
        // Write your code here
         return (top<=0);
    }

    Stack() {
        // Initialize your constructor
        a = new int[MAX]; //consider an array of size 1000
        top = -1;
    }

boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top > a.length - 1) {
            System.out.println("stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if(top==-1){
            System.out.println("stack is empty");
            return 0;
        }
        return a[top--]; 
    }

    int peek() {
        // Write your code here
         if(top == -1){
            System.out.println("stack is empty");
            return 0;
         }
       return a[top];
    }
}

// Driver code
class Exercise1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
