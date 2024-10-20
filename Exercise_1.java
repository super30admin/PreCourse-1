// Time Complexity :isEmpty: O(1)
//                  push: O(1)
//                  pop: O(1)
//                  peek: O(1)
// Space Complexity : O(n), (n is the number of items in the stack)
// Did this code successfully run on Leetcode : couldnt find it in leetcode
// Any problem you faced while coding this : nothing



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
        top=-1;   //Initialize your constructor
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=(MAX-1)){
            System.out.println( " stack is overflow");
            return false;
        }else{
            top++;
            a[top]=x;
            System.out.println( x+ " Pushed to stack");
            return true;
        }
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println( "stack is underflow");
            return 0;
        }else{
            int y=top;
            top--;
            return a[y];
        }
    }
  
    int peek() 
    {
        if(top<0){
            System.out.println( "stack is overflow");
            return 0;
        }else{
            int y=top;
            return a[y];
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
        System.out.println(s.peek() + " is top element of the stack");
    } 
}
