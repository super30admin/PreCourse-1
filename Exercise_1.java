// Time Complexity :
/*
PUSH, POP, PEEK Operations : O(1)
*/
// Space Complexity :
/*
PUSH, POP, PEEK Operations : O(1)
*/

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Initialized index top with -1;
For isEmpty() : Chekcing value of top is -1 -> then Stack is Empty else it is non-Empty
Stack Overflow : Checking value of top is greater than equal to MAX (Size of the stack or not

For push(): If no stack overflow, then increment top by 1 and add new element x in the array
For pop(): If no stack underflow(Non-empty stack), then just return element at top and decrement top by 1
For peek(): Return element stored at top

*/


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top == -1);
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
        if(top >= MAX){
            return false;
        }
        top++;
        a[top] = x;
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
        else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
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
