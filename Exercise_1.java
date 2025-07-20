// Time Complexity :
// push() - O(1)
// pop() - O(1)
// peek() - O(1)
// isEmpty() - O(1)

// Space Complexity : O(n), where n = MAX = 1000 (fixed-size array)

// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this :
// No major issues. Straightforward stack implementation using an array.
// Just needed to handle overflow and underflow conditions properly.


// Your code here along with comments explaining your approach:
// I implemented a basic stack using an integer array of fixed size MAX.
// The `top` variable tracks the index of the last inserted element.
// `push()` adds elements if space is available; otherwise, prints overflow.
// `pop()` removes and returns the top element if stack is not empty;
//         otherwise, prints underflow and returns 0.
// `peek()` returns the top element without removing it.
// `isEmpty()` checks if the stack is currently empty.
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return (top < 0);
    }

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    {
        if (top < 0) {
            System.out.println("Stack is Empty");
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
