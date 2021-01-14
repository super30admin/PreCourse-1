import java.io.*;

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if ( top < 0) {
            System.out.println("Stack Underflow");
            return  true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if ( top <= MAX ) {
            System.out.println("Stack is not full");
            top ++;
            a[top] = x;
            return true;
        }
        else {
            System.out.println("Stack is full!");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if ( top >=0) {
            int value = a[top];
            top--;
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if ( top >=0 && top<=MAX) {
            return a[top];
        }
        else {
            System.out.println("Stack index out of bounds");
            return -1;
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
