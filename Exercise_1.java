// Time Complexity :O(1)
// Space Complexity :O(1000)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top<1)  
        return true;
        else
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top=-1;
        ;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>100) 
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            top++;
            a[top] = x;
            return true;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0) {
        System.out.println("Stack Underflow");
        return 0;}
        else
        {
        int popedNumber = a[top];
        top--;
        return popedNumber;
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty())
        return a[top];
        else
        return 0;
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
        System.out.println(s.peek());
    } 
}
