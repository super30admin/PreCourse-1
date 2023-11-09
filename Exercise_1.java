// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Code along with comments explaining my approach:

class Stack { 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    Stack() 
    { 
        //Initializing your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    {   
        //Checking for Stack overflow
        if (top == MAX-1)
        {
            System.out.println("Stack overflow Alert!!");
            return false;
        }
        else
        {
            //Pushing new item to the top
            top++;
            a[top] = x;
            System.out.println("Item pushed successfully!!");
            return true;
        }
    } 
  
    int pop() 
    {
        //Checking for Stack overflow 
        if(top < 0)
        {
        System.out.println("Stack overflow Alert!!");
        return 0; 
    }
        else
        {
            //Popping the top item and returning it
            int x = a[top];
            top--;
            System.out.println("Item popped successfully!!");
            return x;
        }
    } 
  
    int peek() 
    { 
        //Checking for Stack overflow 
        if(top < 0)
        {
            System.out.println("Stack overflow Alert!!");
            return 0; 
        }    
        else
        {
            //Returning the top item 
            return a[top];
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
