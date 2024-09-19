// Time Complexity : O(1)
// Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
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
        if(top>= MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            //Write your code here
            a[++top] = x;
        }

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
                //Write your code here
            return (a[top--]);
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
        return a[top];
    } 

  
// Driver code 

public static void main(String args[]) 
{ 
        Stack s = new Stack(); 
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("Top element is: " + s.peek());
        
    
}
}