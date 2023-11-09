// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to change name of class as was facing errors


// Your code here along with comments explaining your approach

import java.util.Stack;
class Stack1 { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[];// Maximum size of Stack 
    int q;
  
    boolean isEmpty() 
    { 
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }//Write your code here 
    } 

    Stack1() 
    { 
        this.a = new int[MAX];
        this.top = -1;//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (top<1000) {
            top++;
            a[top] = x;
            System.out.println("Pushed element:" + x);
        } else {
            System.out.println("Stack is full !");//Check for stack Overflow
        }
        //Write your code here
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty())
        {
            return 0;
        }//If empty return 0 and print " Stack Underflow"
        else
        {
            q=a[top];
            System.out.println("Popped:" + a[top]);
            top--;
        }
        return q;//Write your code here
    } 
  
    int peek() 
    { 
        return a[top];//Write your code here
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack1 s = new Stack1(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        s.isEmpty();
    } 
}
