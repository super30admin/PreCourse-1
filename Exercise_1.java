class Stack { 
//Please read sample.java file before starting.

//Kindly include Time and Space complexity at top of each file

// Time Complexity : O(1) since the operations dont rely on the number of elements it is subjected to
// Space Complexity : O(n) where n is num of elements added to stack

// Did this code successfully run on Leetcode : 
// Didn't find an exact problem to run on Leetcode, but ran locally
// Here is the output:
// 30 Popped from stack

// Any problem you faced while coding this : 
// Had to review basic pseudocode with ChatGPT before I could code it by myself

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; // top = 0 would be when there is one element on the stack 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX-1){
            System.err.println("Stack overflow");
            return false;
        }
        //Write your code here
        top = top+1;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.err.println("Stack underflow");
            return 0;
        }
        //Write your code here
        int val = a[top];
        top--;
        return val;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.err.println("Stack underflow");
            return 0;
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
