class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] ; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        if(top<0)
            return true;
        else
            return false;
    }

    Stack() 
    { 
        a= new int[MAX]; //Initialize your constructor
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX)
            return false;
        else
        {   top++;
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;

        }
        else
        {
            top--;
            return a[top];

        }
    } 
  
    int peek() 
    { 

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
    } 
}
