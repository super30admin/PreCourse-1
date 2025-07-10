// Time Complexity :
    // isEmpty: o(1)
    // push: o(1)
    // pop: o(1)
    // peek: o(1)
// Space Complexity :
    // isEmpty: o(1)
    // push: o(1)
    // pop: o(1)
    // peek: o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Started with top = 0 and then realized -1 would work better
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        // if the top is still -1 that specifies that array is empty
        return top==-1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX) {
            System.out.println("Stack is full");
            return false;
        }
        //Write your code here
        // increment the top pointer and save the given value
        a[++top]=x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        // Return the top element and decrement the pointer
        return a[top--];
    } 
  
    int peek() 
    {
        if(top==-1) return 0;
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
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
