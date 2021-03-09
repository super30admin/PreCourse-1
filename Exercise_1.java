// Time Complexity : O(1) as push, pull & peek happens instantly as we have top all the time
// Space Complexity : O(N) as we need an array to store / implement the stack
// Did this code successfully run on Leetcode : Could not find it on leetcode. But ran successfully locally
// Any problem you faced while coding this :


class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(a.length == 0) 
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= (MAX-1))
        {
            System.out.println("Stack Overflow Occurred!");
            return false;
        }
        //Write your code here
        a[++top] = x;
        System.out.println("Pushed " + x + " into stack");
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0)
        {
            System.out.println("Stack Underflow Occurred!");
            return -1;
        }
        //Write your code here
        int p = a[top];
        top--;
        return p; 
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top <0){
            System.out.println("Stack Empty");
            return -1;
        }
        return a[top];
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
