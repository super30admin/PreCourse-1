// Time complexity 0(1)
// Space complexity 0(MAX)

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 3;
    int top;

    int a[] = new int[MAX]; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1) return true;

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    {
        if(top == MAX - 1) {
            return false;
        }

        top++;
        a[top] = x;

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int val = a[top];
        top--;

        return val;

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
