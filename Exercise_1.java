import java.sql.SQLOutput;

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Full");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
            //Check for stack Overflow
            //Write your code here
        }

        int pop ()
        {
            if(top < 0) {
                System.out.println("Stack is Empty");
                return 0;
            }else {
                int x = a[top--];
                return x;
            }
            //If empty return 0 and print " Stack Underflow"
            //Write your code here
        }

        int peek ()
        {
            if(top < 0) {
                System.out.println("Stack is Empty");
                return 0;
            }else {
                int x = a[top];
                return x;
            }
            //Write your code here
        }
    }

class Main{
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
    } 
}
