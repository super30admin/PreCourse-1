import java.util.*;

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x) 
    {
        //check for stack overflow
        if (top < MAX)
        {
            top++;
            a[top]=x;
            return true;
        }
        else
        {
            System.out.println("Stack Overflow");
            return false;
        }
    }
  
    int pop() 
    { 
        //check for stack underflow
        if (top > -1)
        {
            int num=a[top];
            top--;
            return num;
            
        }
        else
        {
            System.out.println("Stack underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        if (top > 0)
        {
            int element=a[top];
            return element;
        }
        else
        {
            System.out.println("stack underflow");
            return 0;
        }
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

