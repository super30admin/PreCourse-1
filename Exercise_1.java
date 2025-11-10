// Time Complexity : O(1) for push(), pop(), peek(), and isEmpty()
// Space Complexity : O(n) for storing n elements in the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
//        return true if stack is empty
        if(top == -1){
            return true;
        } else {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) 
    {
//        insert an element on top of stack
        //Check for stack Overflow
        //Write your code here
        if (top == MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    {
//        pop the topmost element of stack
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int ele = a[top];
            top--;
            return ele;
        }


    } 
  
    int peek() 
    {
//        return the topmost element of stack
        //Write your code here
        if (top == -1) {
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
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
