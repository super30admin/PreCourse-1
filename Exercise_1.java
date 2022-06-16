// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Incorrect structure of java files
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top <0){
            return true;
        } else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1; // initializing with this value as the array index starts from 0.
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top + 1 > MAX){ // if the stack is completely filled than stackoverflow
            System.out.println("Stack Overflow!");
            return false;
        }else{        //else increase the counter and insert the element in the stack
            top++;
            a[top] = x;
            return true;
        }
    }
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){ //if there is no element in the stack then show stack underflow error
            System.out.println("Stack Underflow");
            return 0;
        }
        //else remove the element on the top
        int x = a[top];
        a[top]=0;
        top--;
        return x;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
} 

