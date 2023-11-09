class Stack { 

    // Time Complexity : push : O(1) pop: O(1)
    // Space Complexity : O(N)
    // Did this code successfully run on Leetcode : No
    // Any problem you faced while coding this : no
    // Your code here along with comments explaining your approach : use top variable to track the top of the stack

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == MAX) return false;
        //Write your code here
        a[++top] = x;
        return  true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top ==0) return 0;
        //Write your code here
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}
