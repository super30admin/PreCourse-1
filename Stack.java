// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : -

//Implementing stack functions using Array
class Stack {
    static final int MAX = 1000; 
    int top = -1;
    int a[];
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    {
        a = new int[MAX]; // Maximum size of Stack
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX) {
            System.out.println("Stack overflow");
            return false;
        }
        top = top + 1;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int val = a[top];
        top--;
        return val;
    } 
  
    int peek() 
    { 
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
