/*
 * Time Complexity:
 * - isEmpty: O(1)
 * - push: O(1)
 * - pop: O(1)
 * - peek: O(1)
 * 
 * Space Complexity: O(N)
 */

 class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() { 
        // Check if stack is empty
        return top < 0; 
    } 

    Stack() { 
        // Initialize your constructor
        top = -1; 
    } 
  
    boolean push(int x) { 
        // Check for stack Overflow
        if (top >= MAX - 1) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } else { 
            a[++top] = x; 
            return true; 
        } 
    } 
  
    int pop() { 
        // If empty return 0 and print "Stack Underflow"
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            return a[top--]; 
        } 
    } 
  
    int peek() { 
        // Return the top element without removing it
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            return a[top]; 
        } 
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
