// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x)
    { 
        //Check for stack Overflow
        if(top == a.length-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
               a[++top] = x; 

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1)
         {
             System.out.println("Stack Underflow");
             return 0;
         }
         else
            return a[top--];
    } 
  
    int peek() throws Exception
    { 
        if(top == -1)
            throw new Exception("Stack is empty");
        else
            return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        try
        {
            Stack s = new Stack(); 
            s.push(10); 
            s.push(20); 
            s.push(30); 
            System.out.println(s.pop() + " Popped from stack"); 
        }
        catch (Exception e){}  
    } 
}
