/*===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
*/

// Driver code moved here because JVM was expecting main() in Stack class otherwise
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

class Stack { 
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Write your code here

        if (top >= MAX-1){
            System.out.format("Stack Overflow! Cannot push %d into stack.", x);
            return false;
        }
        else{
            a[++top] = x; //Normal execution
            return true;
        }

    } 
  
    int pop() 
    { 
        //Checking empty stack condition
        if (top < 0){
            System.out.println("Stack Underflow! Cannot pop from stack.\n");
            return 0; // If empty return 0 and print " Stack Underflow"

        } 
        else{
            return a[top--]; //Normal execution
        }
    } 
  
    int peek() 
    { 
        //Checking empty stack condition
        if(top < 0)
        {
            System.out.println("Stack is empty. Nothing to see here...\n");
            return 0; //Can return different value or perform exception handling.

        }
        else
        {
            return a[top]; //Normal execution

        }
    } 
} 
