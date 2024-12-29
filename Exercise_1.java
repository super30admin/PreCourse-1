// Time Complexity : Need to refresh all the understanding for this.
// Space Complexity : Need to refresh all the understanding for this.
// Did this code successfully run on Leetcode : Didn't find the question over leetcode.
// Any problem you faced while coding this : No problem but trouble in understanding time and space complexity.
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here
        // Why "<0" because we've initialised the top variable = -1 with constructor.
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        //increment the top value first and so that we can move to the next index of the array and store the value inside it.
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) return 0;
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
