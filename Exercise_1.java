// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Not attempted on Leet Code
// Any problem you faced while coding this : None. Need to review time complexity. My TC and SC analysis was based on the number of elements pushed and popped from the stack. I took worst case.


class Stack { 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // Checks if top element is empty
    boolean isEmpty() 
    { 
        return (top < 0);
    } 

    Stack() 
    { 
        //Sentinal value
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Checks if the accessing out of bounds (above max size); overflow
        if (top >= (MAX - 1)) { 
            return false;
        }

        else {
            //adding elements from the top
            a[++top] = x;
            //System.out.println(x + " Pushed");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        else {
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Check for underflow/empty stack
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        else {
            int x = a[top];
            return x;
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
