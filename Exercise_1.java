// Time Complexity : O(1) for push(), pop(), peek()
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Just had to rename Stack class and its references


// Your code here along with comments explaining your approach

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;     //this indicates the number of contents in Stack array
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0? true : false; 
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= (MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Empty Stack");
            return 0;
        }
        else{
            return a[top];
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
