class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    // Time Complexity : O(1) for push, pop, and peek operations
    // Space Complexity : O(n) for the stack array, where n is the maximum size of the stack
    // Did this code successfully run on Leetcode : Didn't run on Leetcode

    static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack
    int sizeOfArray;
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (sizeOfArray == 0);
    } 

    Stack() 
    { 
        //Initialize your constructor
        sizeOfArray = 0;
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (sizeOfArray == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[sizeOfArray++] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedElement = a[sizeOfArray - 1];
        a[sizeOfArray - 1] = 0;
        sizeOfArray--;
        return poppedElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[sizeOfArray - 1];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        System.out.println(s.peek() + " Peeked from stack");
        s.push(10);
        System.out.println(s.peek() + " Peeked from stack");
        s.push(20);
        System.out.println(s.peek() + " Peeked from stack");
        s.push(30);
        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeked from stack");
    } 
}
