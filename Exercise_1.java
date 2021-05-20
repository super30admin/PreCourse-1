// Time Complexity : O(1) for push and pop
// Space Complexity : O(n) where n is the capacity of stack.

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==-1;
    } 

    Stack() 
    {
        top=-1;
        a=new int[MAX];

    } 
  
    boolean push(int x) 
    {
        if(top < MAX-1)
        {
            a[++top]=x;
            return true;
        }
        else
        {
            System.out.println("Stack overflow");
            return false;
        }
    } 
  
    int pop() 
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int element=a[top];
            a[top--]=0;

            return element;
        }

    } 
  
    int peek() 
    {
        if(top!=-1)
            return a[top];
        else
        {
            System.out.println("Stack Underflow");
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
