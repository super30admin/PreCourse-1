// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // If top is less than 0 then the stack is empty.
    boolean isEmpty() 
    { 
        //Write your code here
        return top < 0; 
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; 
    } 

    // Increamenting the top variable and inserting the value in the array.
    // if the top variable is greater than or equal to max then stack is full.
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    } 

    // Removing the elament from the stack by decrementing the top variable.
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    } 

    // Firstly checking if the stack is empty else returing the top element from the stack.
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top];
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
