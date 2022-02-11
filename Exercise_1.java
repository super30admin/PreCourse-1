// Time Complexity:  push - O(1), pop - O(1), peek - O(1), isEmpty - O(1)
// Space Complexity : O(N) where, N is the maximun size of stack. Here it is 1000.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top <= 0)
            return true;
        else
            return false; 
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top <MAX){
            a[top] = x;
            top++;
            return true;
        }
        else
            return false;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top <= 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            top--;
            return a[top];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top-1];
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
