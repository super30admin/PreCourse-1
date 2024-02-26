// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top<0)
        {
            return true;
        }
        return false;
        
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=1000)
        {
            System.out.println("stack Overflow");
            return false;
        }
        a[++top]=x;
        return true;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top>-1)
        {
            return a[top];
        }
        return -1;
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
