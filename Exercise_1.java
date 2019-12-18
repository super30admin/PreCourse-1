// Time Complexity :
//      isEmpty() - O(1)
//      push() - O(1)
//      pop() - O(1)
//      peek() - O(1)
//      
// Space Complexity :
//      overall - O(1) - constant max size of the stack/array
//      isEmpty() - N/A
//      push() - N/A
//      pop() - N/A
//      peek() - N/A
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        //check if top is -1
        if(top == -1)
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        //assign -1 to top
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //check if top is equal to MAX
        if(top == MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            ++top;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //check for empty stack
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        --top;
        return a[top+1];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
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
