// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
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

        if (top<0){
            return true;
        }
        // If the top is less than 0 then stack is empty.

        return false;
    } 

    Stack() 
    { 
        top = -1;
        //Initialize top = -1 for empty stack

        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here


        if(top<(MAX-1)){
            top++;
            a[top]=x;
            return true;

            // If the stack is not full then we can add values to the stack
        }
        return false;

        // In case the stack is full

        
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top>-1){
            return a[top--];

            // Removing the top most element in the stack if the stack is not empty

        }
        else{
            System.out.println("Stack Underflow");
            return 0;
            //In case the stack is empty
        }
    } 
  
    int peek() 
    { 
        //Write your code here

        if (top>-1){
            return a[top];
            // Returing the top most element if the stack is not empty
        }
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
        s.push(40);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
