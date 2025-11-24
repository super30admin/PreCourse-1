// Time Complexity: 
//   push: O(1)
//   pop: O(1)
//   peek: O(1)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We implement a stack using a fixed-size array of MAX size.
// 'top' keeps track of the index of the last inserted element.
// When the stack is empty, top = -1.

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // stack array

    // Constructor
    Stack() { 
        top = -1;  // stack is empty
    } 
  
    // Check if stack is empty
    boolean isEmpty() { 
        return (top < 0);
    } 

    // Push element onto stack
    boolean push(int x) { 
        if (top >= MAX - 1) {   // stack overflow check
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;  // increment top and add element
        return true;
    } 
  
    // Pop element from stack
    int pop() { 
        if (top < 0) {  // underflow check
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--]; // return top element and decrease top
    } 
  
    // Return top element without removing
    int peek() { 
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
