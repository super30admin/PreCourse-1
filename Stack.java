// Time Complexity : isEmpty: O(1), push : O(1), pop: O(1)
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    // Added dummy line.
  
    boolean isEmpty() 
    { 
        //Write your code here 

        return (top == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        a[++top] = x;
        System.out.println("Element pushed " + x);
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()){
            int val = a[top];
            top--;
            return val;
        }else{
            System.out.println(" Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 

 public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    }  
}
// Driver code 