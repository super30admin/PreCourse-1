/**
 Exercise_1 : Implement Stack using Array.
 Time Complexity: O(1) Constant time i.e. takes the same amount of time regardless of how many elements are in the stack
 Space Complexity: O(n) where n = max no. of elements the stack can hold
 Did this code successfully run on Leetcode: Ran locally

 Notes:
 Any problem you faced while coding this: Wrong boundaries used
 Using top > MAX - 1 allows one extra push after the array is already full
 */

// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; // Maximum size of Stack 
    int top; // Pointer to top of the stack
    int a[] = new int[MAX]; 
  
    boolean isEmpty() { 
        //Write your code here 
        return top < 0;
    } 

    Stack() { 
        //Initialize your constructor 
        top = -1; 
    } 
  
    boolean push(int x) { 
        //Prevent stack Overflow
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x; 
            return true;
        }
        
    } 
  
    int pop() { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return a[top--];
        }
    } 
  
    // Returns the top element without removing it so same as pop but don't decrement the counter
    int peek() { 
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
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
