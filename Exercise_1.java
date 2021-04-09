class Stack { 
    static final int MAX = 1000; 
    int top=-1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(a.length>=0)
            return false;
        
        return true;
    } 

    Stack() 
    { 
        //Initialize your constructor
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        //Write your code here

        if(top>=MAX)
            return false;
        top++;
        a[top]=x;
        return true;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(a.length<0)
        {
            System.out.println("Stack Underflow");
            return 0;
         
        }
        int temp=a[top];
        top--;
        return temp;
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top>=0 && top<MAX)
            return a[top];
        else
            return -1;
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
