// Time Complexity :
//    push(): O(1)
//    pop(): O(1)
//    peek(): O(1)
//    isEmpty(): O(1)

// Space Complexity : O(MAX)

import java.io.IOException;

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) throws Exception
    { 
        if(top>MAX){
            throw new Exception("Stack Overflow");
        }
        else{
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() throws Exception
    { 
        if(top<0){
            throw new Exception("Stack Underflow");
        }else{
            return a[top--];
        }
    } 
  
    int peek() throws Exception
    { 
        //Write your code here
        if(top<0){
            throw new Exception("Stack is empty");
        }else{
            return a[top];
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) throws Exception
    { 
        try{
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        }catch(Exception e){
            throw e;
        }
    } 
}
