// Time Complexity : isEmpty() -> O(1); push() -> O(1); pop() -> O(1); peek() -> O(1) 
// Space Complexity : O(MAX) -> As MAX is constant -> O(1)
// Did this code successfully run on Leetcode : Not Found
// Any problem you faced while coding this : As I am doing in a vscode editor, I feel like this confused me a bit while i was initially solving as its not an interaface I generally do like leetcode that checks for all and edge testcases. However this is a good start as it stresses my brain to think individually with out any dependency on other helpers.

// Your code here along with comments explaining your approach:
// 1. Initialized a "top" variable to 0 which is for storing the index of the array "a" i.e., next possible index of the array or current length of the stack or number of elements in the stack.
// 2. This top varibale is being incremented when an item is pushed to a stack and decremented when item is popped from the stack.
// 3. Using this variable, I was able to check for errors and excpetions in O(1) whil pushing and popping operations.

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        a[top++] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int poppedValue = a[--top];
        a[top] = 0;
        return poppedValue;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top-1];
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
