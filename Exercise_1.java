// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1)
        {
            return true;
        } 
        else
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
        if (top == MAX){

            System.out.println("Stack Overflow");
            return false;
        }

        else {
            top++;
            a[top] = x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
            
        }
        else 
        {
            return a[top--];
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {

        if (isEmpty())   
        {  
            System.out.println("Empty Stack");  
            return 0; 
        }  
        else  
        {  
            return a[top];  
        }  
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