/*
Time Complexity - O(N)
Space Complexity- O(N)
*/

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
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
        //Write your code here
        if(top == MAX)
            return false;
        else {
            if (top == -1)
                top++;
            a[top] = x;
            top++;
            return true;
        }

    }
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
           int x =  a[top-1];
           top--;
           return x;
        }
    } 
  
    int peek() 
    {
        //Write your code here
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        int x = a[top];
        top--;
        return x;
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
