// Time Complexity :    O(1)
// Space Complexity :	O(1)
// Did this code successfully run on Leetcode : Not a leetcode problem
// Any problem you faced while coding this : No
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
            return true;
        else
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;// This is initializes top as -1 which indicates empty stack or no elements in the stack
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top<a.length){
            a[++top]=x; // After incrementing the top, push the element at the top
            return true;
        }
        else{
            System.out.println("stack overflow");
            return false;//stack overflow
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("stack underflow");
            return 0;
        }
        else{
            int val=a[top--]; //Element at the top is returned and top is decremented
            return val;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        int topElement = a[top];
        return topElement; //Returning the top element of the stack
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
