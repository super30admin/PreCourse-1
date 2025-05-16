// Time Complexity : isEmpty(), push(), pop(), peek() all functions will have O(1) time complexity.
// Space Complexity : O(n) where n is the size of the stack (MAX). But since the size of the stack is fixed one can argue that it is constant O(1).
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int count;

    Stack() 
    { 
        top = -1;
        count = 0;
    } 
  
    boolean isEmpty() 
    { 
        return count == 0;
    } 
  
    boolean push(int x) 
    { 
        // add element to the stack if it is not already full othewise print Stack Overflow
        if (top < MAX -1){
            a[++top] = x;
            count++;
            return true;
        } else {
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        count--;
        
        return a[top--];
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
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
