class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; 
    // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
        {
            return true;
        }
        return false;
    } 

    Stack() 
    { 
       top=-1;//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top<MAX-1)
        {
            a[++top]=x;
            System.out.println(x + " pushed into stack");
            return true;
        }
        else
        {
            System.out.print("Stack Overflow");
        }
		return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top>0)
        {
            return a[top--];
        
        }
        else
        {
            System.out.print("Stack Underflow");
            return -1;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
         if(top>0)
        {
            return a[top];
        }
        else
        {
            return -1;
        }
        
    } 
  
// Driver code 
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
