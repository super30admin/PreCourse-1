// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this :    No
class Stack { 
    
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
   
  
    boolean isEmpty() 
    { 
        //if the top is -1 the stack is empty
        if(top==-1){
            return true;
        }
        return false; 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //counter for the stack array with default value as -1
        top=-1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //check if top exceeds maxsize if no then continue if yes its overflow
        if(top<MAX){  
            //increment the top while adding elements 
            a[++top] = x;   
        }
        return false;   
      
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){      
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write your code here
        //return the element present at top position 
        //decrement the top because one element is deleted
        return a[top--];    
    } 
  
    int peek() 
    { 
        //Write your code here
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){      
            System.out.println("Stack Underflow");
            return 0;
        }
        // return the top element of the stack;
        return a[top];    
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
