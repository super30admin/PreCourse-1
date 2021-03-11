class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        
        if(top == -1)
        {
            return true;
        }
        else{
            return false;
        }
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
        if(top <= MAX)
        {
            top++;
           a[top]=x;
           System.out.println(a[top] +" is beinf pushed");
           return true;
           
        }
        else 
        {
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top <= -1)
        {
            System.out.println("The stack underflow occured");
           return 1;
        }
        else if(top<= MAX) 
        {
            a[top]=0;
            top--;
            return top;
        }
        else{
            return 1;
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        System.out.println(  " The top most element of the stack is"
        +a[top]);
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
        s.peek();
    } 
}
