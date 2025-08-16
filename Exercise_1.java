import java.util.Arrays;

class Stack {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode: Yes
    // Any problem you faced while coding this : Just being rusty in general with Java. I did have to look up some syntax

    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    //The challenge in this implementation is using an array instead of an arraylist or other more easily mutable DS
    //Therefore, the array will have to be redefined every time an element is pushed or popped from the 'stack'
    boolean isEmpty() {
        return a == null;
    } 

    Stack() {
        top = 0;
    }

    // Adding an element to the top will require all previous elements to do moved 'up' an index
    boolean push(int x) {
        if (top > a.length -1) {
            System.out.println("Stack Overflow");
            return false;
        }

        for (int i = top; i >= 0; i--) {
            if (i == 0) {
                a[i] = x;
            } else {
                a[i] = a[i-1];
            }
        }
        top++;
        return true;
    } 

    // Removing the top element will require all subsequent elements to do moved 'down' an index
    int pop() {
        int answer = a[0];
        for (int i = 0; i <= top; i++) {
            a[i] = a[i+1];
        }
        return answer;
    } 

    // Returns element on top of stack, does not remove it
    // The top of the last added element in my implementation is always the 0th element of the array
    int peek()  {
        return a[0];
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
