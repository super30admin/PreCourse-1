class Stack { 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
// Time Complexity : O(1)
// Space Complexity :O(N)
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
// Time Complexity :O(1)
// Space Complexity :O(N)
    boolean push(int x) 
    {
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top]=x;
            return true;
        }
    } 

// Time Complexity : O(1)
// Space Complexity :o(N)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
       
    } 
// Time Complexity : O(1)
// Space Complexity :O(N)  
    int peek() 
    {  //Write your code here
        if(this.isEmpty)
        System.out.println("Stack is empty");
        else
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
