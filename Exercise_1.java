// Time Complexity : Push - O(1) Pop - O(1) Peek - O(1)
// Space Complexity : For n push - O(n)
// Did this code successfully run on Leetcode : Couldn't find the question on leetcode
// Any problem you faced while coding this : No.

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top < 0);
        
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX - 1)){
            return false; //Here we check for the stack overflow condition.
        }
        else{
            a[++top] = x; //If overflow condition is not satisfied, we add the element(int x) to the top.
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){ 
            System.out.println("Stack Underflow"); //If the stack is empty, then it's a stack underflow issue.
            return 0;
        }
        else{
            int result = a[top--]; //If the underflow condition is not satisfied, we remove the element in the reverse order as of pushing elements.
            return result;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[top]; //If the stack is not empty we return the top element without removing it. 
        }
        else{
            return 0;
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
