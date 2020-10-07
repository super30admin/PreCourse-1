//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yet to try
//Any problem you faced while coding this : None

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1)
            return true; // Returning true if the stack is empty 
        else
            return false; // Returning false if the stack is not empty 
    } 

    Stack() 
    { 
        top = -1; //Initializing constructor by setting top to -1
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX)
        {
            System.out.println("Stack Overflow. Cannot push " + x);
            return false; // Returning false if stack is full and push action is not performed
        }
        else
        {
            a[++top] = x; // Pushing x to the top of the stack
            System.out.println("Pushed " + x + " into the stack.");
            return true; // Returning true if stack is not full after push action is performed
        }
    } 
  
    int pop() 
    { 
        if(isEmpty() == true)
        {
            System.out.println("Stack Underflow");
            return 0; // Returning 0 if stack is empty
        }
        else
        {
            int num = peek();
            a[top--] = 0; // Deleting the top of the stack (assigning 0)
            return num; // Returning top element of the stack if stack is not empty
        }
        
    } 
  
    int peek() 
    { 
        return a[top]; // Returning top element of the stack
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
