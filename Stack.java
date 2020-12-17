class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top<0)
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
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top < MAX)
        {
            top++;
            a[top] = x;
            System.out.println(x + " pushed to stack");
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
        if(!isEmpty())
        {
            int b = a[top];
            top --;
            return b;
        }
        else{
            System.out.println("Stack empty");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty())
        {
            return a[top];
        }
        else
        {
            System.out.println("Stack empty");
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