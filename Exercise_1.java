// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        //If the value of top is -1, that means the stack is empty. Return true, else false
        if(top == -1)
            return true;

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        //Initializing the top variable to -1
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //If the size of top is MAX, then stack is full
        if(top == MAX)
            return false;

        //Increment top by 1
        top = top + 1;
        //add the value to the top element
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }

        //Store the top element in the temperory variable
        int temp = a[top];
        //Decrement the top
        top --;
        //Return the temp variable
        return temp;
    } 
  
    int peek() 
    { 
        //Write your code here
        //Return the top element
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
