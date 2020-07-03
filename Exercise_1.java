class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top<0)
        return true;

        return false;
        //Write your code here 
    } 

    Stack() 
    { 
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX)
        {
            System.out.println("Stack Overflow...");
            return false;
        }

        a[top]=x;
        top+=1;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0)
            return 0;

        int result=a[top-1];
        top--;
        return result;
    } 
  
    int peek() 
    { 
        if(top<0)
            return 0;
        
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        for(int i=0;i<1100;i++)
            s.push(i); 
        
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
