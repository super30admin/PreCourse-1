// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :  N

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == 0)
        return true;

        return false;
       
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX)
        return false;
        a[top++] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
       
        int element = a[--top];
        return element;

    } 
  
    int peek() 
    { 
        if(isEmpty())
        {

            return -1;
        }
        int element = a[top];
        return element;
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
