/*
 Time Complexity:
 isEmpty: O(1), push: O(1), pop: O(1), peek: O(1)
 Space Complexity:
 Worst case: O(MAX), Best case: O(top)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
 */

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= 0 && top < MAX) {
            a[top++] = x;
            System.out.println("Added " + a[top] + ". New Top=" + top);
            return true;
        } else {
            System.out.println("\nStack Overflow");
            return false;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("\nStack Underflow");
            return -1;
        } else {
            System.out.println("\n" + a[top] + " is removed. New Top:" + top);
            return a[top--];
        }
    }

    int peek() {
        return a[top];
    }
}
  
// Driver code 
class Main {
    public static void main (String args[]) {
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
