// Time Complexity : O(1) for both push and pop operations
// Space Complexity :   O(1) space complexity, only variables are used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
            return true;
        return false;
    } 

    stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX)
            System.out.println("stack Overflow");
        else{
            top+=1;
            a[top] = x;
            
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int last;
        if(top <0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            last = a[top];
            top-=1;
        }
            
        return last;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty())
            return a[top];
        return 0;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        stack s = new stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
