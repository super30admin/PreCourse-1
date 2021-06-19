class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==0)
        {
            return true;
        }
        return false;
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
        if(top<MAX)
        {
            top++;
            a[top] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            int y = a[top];
            top--;
            return y;
        }


    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1)
        {
            System.out.println("No elements to peek");
            return 0;
        }
        else{
            return a[top];
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
