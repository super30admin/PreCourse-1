// Time Complexity :    O(1)
// Space Complexity :	O(1)
// Did this code successfully run on Leetcode : Did not find on leetcode
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
        top=-1; // initalize top to -1 to indicate no elements or empty stack
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top<a.length){
        	a[++top]=x //increment top and push at position of top 
            return true;
        }
        else
            return false; // stack overflow

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1){
        	System.out.println("Stack Underflow");
        	return 0;
        }
        else{
        	int x=a[top--]; // remove element at top and decrement top
        	return x;
        }
    } 
  
    int peek() 
    { 
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
