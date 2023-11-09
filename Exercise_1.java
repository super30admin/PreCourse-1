//Time : O(1); All stack operations(PUSH, POP, PEEK) are of O(1)
//Space : O(n): Since we need to store all the elements , the space is O(n)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (top == -1)
        {
            return true;
        }
        return false;
    } 

    Stack() 
    {
        //Initialize your constructor

        int top=-1;

    } 

    boolean push(int x) {
        if (top >= MAX - 1)
        {
            System.out.println("Stack Overflow");
        }

       else
        {
            top = top+1;
            a[top] = x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
        return false;
    } 
  
    int pop() 
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
       else
        {
            int x = a[top];
            top = top-1;
            return x;
        }

        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {
        if (top <0)
        {
            System.out.println("Stack Underflow");
            return 0;

        }
        else
        {
            return a[top];
        }
        //Write your code here
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
