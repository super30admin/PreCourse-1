// Time Complexity : O(1)
// Space Complexity : O(1) since the array is of constant size(1000)
// Did this code successfully run on Leetcode : Successfully ran on an IDE
// Any problem you faced while coding this : No

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1; 
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX -1){
            return false;
        }
        //Write your code here
        a[++top] = x;
        return true;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
           return 0;
        }
        
        //Write your code here
        int itemPopped = a[top];
        a[top--] = 0;
        return itemPopped;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            return 0;
        }
        int itemPopped = a[top];
        return itemPopped;
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
