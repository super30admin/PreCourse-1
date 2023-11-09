// Time Complexity : O(1) for all operations
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top ; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 

        this.top = -1 ;
    
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

        if(top+1 == MAX )
        {
            System.out.println("Stack underflow");
            return false;
        }
        
        else 
        {
            top ++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top == -1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int data;
            data = a[top];
            a[top]=0;
            top--;
            
            return data  ;
             
            
        }

        
    } 
  
    int peek() 
    { 
        //Write your code here

        if(top == -1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int data;
            data = a[top];
            return data  ;
             
            
        }
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
       System.out.println(s.pop() + " Popped from stack"); 
    } 
}
