class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top < 0){
            return true;
        }
        return false;
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
        if(top == MAX - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top];
            top--;
            return x;
        }
        //Write your code here
    } 
  
    int peek() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
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

// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Not attempted
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Increment and decrement "top" during successful push and pop respectively. If top goes below 0 stack is empty, or if it goes above MAX stack is full.
