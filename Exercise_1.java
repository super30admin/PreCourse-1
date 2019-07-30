import java.util.*;
import java.io.*;

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    		if (top < 0){
    			return true;
    		}
    		return false;	
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
    		if(top >= MAX -1) {
    			System.out.println("The Stack is FULL.");
    			return false;
    		}else {	
    			a[++top] = x;	
    			return true;
    		}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    		if(top < 0){
    			System.out.println("Stack Underflow");
    			return 0;
    		}else {
    			int x = a[top--];
    			return x;
    		}
    		
    } 
  
    int peek() 
    { 
        //Write your code here
    		if(top < 0) {
    			System.out.println("The Stack is empty");
    			return 0;
    		}else {
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
        System.out.println(s.peek() + " Peek from Stack"); 
    } 
}
