// Time Complexity : O(1) for all operations
// Space Complexity : O(1) since MAX is constant
// Did this code successfully run on Leetcode : Did not find it on Leetcode
// Any problem you faced while coding this : Updated if condition in push() to fix index out of bound / stack overflow issue. Missed it earlier.
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        {
            return top == -1;
        }
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
        if (top + 1 == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++ top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedValue = a[top];
        top --;
        return poppedValue;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
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

