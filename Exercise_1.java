class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file : O(1) or constant time push and pop operations take O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here
        if(top == -1)
            return true;
        else
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
        if(top+1 >= MAX)
            return false;
        //Write your code here
        a[top+1] = x;
        top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println(" Stack Underflow");
            return 0;
        }
        //Write your code here
        int popElement = a[top];
        a[top] = 0;
        top--;
        return popElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
        {
            System.out.println(" Stack Underflow");
            return 0;
        }
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
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.peek();

    } 
}
