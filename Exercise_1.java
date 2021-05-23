class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    int len = a.length;
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(len < 0) {
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        len = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(len > MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        a[++len] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(len < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        return a[len--];
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[len];
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}