class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top<0)
            return true;
        else

            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top  = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>MAX-1)
        {
            return false;
        }else
        {
            top+=1;
            a[top]=x;
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0)
        {
            System.out.println(" Stack Underflow");
            return 0;
        }
        return a[top--];
        //Write your code here
    } 
  
    int peek() 
    {
        return a[top];
        //Write your code here
    } 
} 
  
// Driver code 
 public class Exercise_1 {
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        if(s.isEmpty())
        System.out.println(" Stack Empty:");
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
// Testing
//        System.out.println(s.peek() + " Peek from stack");
//        System.out.println(s.pop() + " Popped from stack");
//        System.out.println(s.pop() + " Popped from stack");
//        System.out.println(s.pop() + " Popped from stack");
//        System.out.println(s.pop() + " Popped from stack");
    } 
}
