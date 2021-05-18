//Time Complexity : push(), pop(), isEmpty(), peek() have time complexity of O(1).
//Space Complexity : push(), pop(), isEmpty(), peek() have space complexity of O(1).

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    {
        //Write your code here
        if(top < MAX-1)//Check for stack Overflow
        {
            top++;
            a[top] = x;
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
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }

    } 
  
    int peek() 
    {
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
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
