// Time Complexity :  O(n)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top<0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1)
        {System.out.println("Stack Overflow");
            return false;}
        
            if(top<MAX){
                top++;
                a[top]=x;
                return true;
            }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1)
        {
            System.out.println(" Stack Underflow");
        return 0;
    }
        else if(top>0)
        {
            System.out.println("removed element is"+ a[top]);
            top--;
            return a[top+1];
        }
        return -1;
    } 
  
    int peek() 
    { 
        //Write your code here
        return top;
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
