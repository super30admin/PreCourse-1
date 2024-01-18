// Time Complexity: O(1) for all operations
// Space Complexity: O(MAX)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// Used the variable "top" to store imitate top of stack. Manipulating
// it in all the operations

class Stack { 
    // Time Complexity: O(1) for all operations
    // Space Complexity: O(MAX)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==-1;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top==MAX-1)    return false;
        a[++top]=x;
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
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
        System.out.println(s.pop() + " Popped from stack"); 
    }
}
