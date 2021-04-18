class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top >= 0)
        {
            return false;
        } 
        else
        {
            return true;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        a = new int[MAX];
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            top++;
            a[top] = x;
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top >=0 )
        {
            int ans = a[top];
            top--;
            return ans;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top >= 0)
        {
            return a[top];
        }
        else
        {
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
