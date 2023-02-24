// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Didnt found
// Any problem you faced while coding this : -

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top<0){
            return true;
        } 
        return false;
    } 

    Stack() 
    { 
        top = 0;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top<MAX){
            a[++top] = x;
            return true;
        }
        return false;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top>0){
            

            return a[--top];
        }
        System.out.println(" Stack Underflow ");
        return 0;
    } 
  
    int peek() 
    { 
        if(top>=0){
            return a[top];
        }
        return 0;
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
