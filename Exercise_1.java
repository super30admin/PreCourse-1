class Stack { 
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
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
            top=-1;
        } 
      
        boolean push(int x) 
        { 
            //Check for stack Overflow
            //Write your code here
            // For Overflow, checked if it crosses the max size. If no the element is pushed and returns true.
            if(top>=MAX-1)
            {
                System.out.println("Stack overflow");
                return false;
            }
            else{
                top++;
                a[top] = x;
                return true;
            }
        } 
      
        int pop() 
        { 
            //If empty return 0 and print " Stack Underflow"
            //Write your code here
            // Checking if underflow, if not then return the element and decrement top
            if(top<0){
                System.out.println("Stack Underflow");
                return 0;
            }
            else{
                int x = a[top];
                top--;
                return x;
            }
            
        } 
      
        int peek() 
        { 
            //Write your code here
            //checking the top element
            if(top==-1){
                System.out.println("Stack Underflow");
                return 0;
            }
            else{
                int x = a[top];
                return x;
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
    
    