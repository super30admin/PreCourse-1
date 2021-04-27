class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
       if(top==-1)
       {return false;}
       return true;

    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1; 

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX-1)
        {System.out.println("stack overflow");
        return false;
        }
        else
        a[++top]=x;
        System.out.println(x + " added to the stack");
        return true;
    }
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0)
        {System.out.println("stack underflow");
        return 0;
        }
        else
        {
            int n=a[top--];
            return n;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        int n=a[top];
        return n;
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
