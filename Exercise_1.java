// Time Complexity : O(1) as there is no computation being done, no for loops except for constant checks. Insertion, deletion in Arrray is O(1)
// Space Complexity : O(n) where n = 1000
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Use Array when the size of the stack is known
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(this.top == -1) {
            return true;
        } else {
            return false; 
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //stack is initialized witth -1
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= MAX - 1) {
            System.out.println("Stack Overflow!");
            return false;
        }
        //Write your code here
        //We first increment top for eg. top = -1 then it needs to be incremented before assigning x.
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(a[top] == -1) {
            // if stack is empty
            System.out.println("Stack Underflow!");
            return 0;
        }
        //Write your code here
        int popped = a[top];
        top--;
        return popped;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1) {
            //This means stack is empty, return 0
            return 0;
        }
        //else return top element
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
