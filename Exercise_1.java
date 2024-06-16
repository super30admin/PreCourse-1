/*
Time Complexity :
isEmpty : O(1)
push : O(1)
pop : O(1)
peek : O(1)
Space Complexity : O(n)
Did this code successfully run on Leetcode :
Any problem you faced while coding this :
*/ 

// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() { 
        if(top == -1)
            return true;
        return false;
    } 

    Stack() { 
        for(int i = 0; i < MAX ; i++){
            a[i] = -1;
        }
        top = -1;
    } 
  
    boolean push(int x) { 
        if(top > MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() { 
        if(isEmpty() == true) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];

    } 
  
    int peek() { 
        if(isEmpty() == true) {
            return -1;
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
        System.out.println(s.peek()); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}