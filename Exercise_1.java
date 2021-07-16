// Time Complexity : O(1) - Push, Pop, Peek , O(N) - Search
// Space Complexity : O(N) - N: Number of items/elements in the stack.
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

class Stack { 

    static final int MAX = 2; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //if the stack is empty then the top will have value = -1
        if(top == -1){
            return true; 
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        else{
            top++;
            a[top] = x;
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
        //Write your code here
        else{
            int element = peek();
            top--;
            return element;
        }
    } 
  
    int peek() 
    {   
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return a[top];
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
