// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No suitable problem available
// Any problem you faced while coding this : None

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1; 
    } 

    Stack() 
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
         if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
       return a[top];
} 
  
// Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
