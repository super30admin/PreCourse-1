// Time Complexity : all the operations on the stack are O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : didn't provide the links
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 10; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1)
            return true;
        return false;
        //Write your code here 
    } 

    Stack() 
    { 
        //Initialize your constructor
        int top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX-1)
        {
            System.out.println("stack overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
            

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
           return a[top--];
    } 
  
    int peek() 
    { 
        if(top == -1)
        {
            System.out.println("No elements");
            return 0;
        }
        //Write your code here
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
        System.out.println(s.pop() +" popped element"); 
    } 
}
