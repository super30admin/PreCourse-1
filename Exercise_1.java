// Time Complexity : O(1)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode : No, couldn't find leetcode problem
// Any problem you faced while coding this : No

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); //this returns true if value of top is less than 0
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= (MAX-1)) { //if value of top is >= Max-1 because arr indexing starts from 0 to 999 in this case since MAX=1000;
            return false;
        }
        else {
            a[++top] = x; // first increments top value then add x element in array
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0) {   
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top--];   //this returns element present at top and decrements value of top
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top < 0) {       // checks stack is empty or not?
            return 0;
        }
        else {
            return a[top];  //return top most element of stack
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
