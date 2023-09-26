// Time Complexity : Constant for push, pop, peek
// Space Complexity : Constant for push, pop, peek
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : No

class Stack
{
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        // returns true if stack is empty else returns false
        return top == -1;
    } 

    Stack() 
    {
        // Initializing the top variable;
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        // Add an element if size is lesser than max
        if (top < MAX-1)
        {
            top++;
            a[top] = x;
        }
        else {
            System.out.println("Stack overflow");
            return false;
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        // if stack is not empty, remove element else return 0;
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = a[top];
        top--;
        return temp;
    } 
  
    int peek() 
    { 
        //Write your code here
        // return top element if stack is not empty else return 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main
{
    public static void main(String args[]) 
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    } 
}
