// Time Complexity :    O(1) //push, pop, peek
// Space Complexity :   O(n)
//  Yes, It's run successfully
// No I don't face any problem.


class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1) //if top ==-1 means stack is empty
        {
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;   // at first stack is empty, tht's why top is assigned as -1
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX - 1)  //array index start from zero, that's why we have to check whethere top is reaching to maximum size of the array
        {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top]=x; // if there's space available then first increment the top then push element into slack
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) //before trying to do pop operation, make sure that stack is not empty
        {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        return a[top--]; // if stack is not empty then return the a[top] and decrement the top value
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) //make sure that stack is not empty
        {
            System.out.println("Stack is Empty");
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeped from stack");
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peeped from stack");
    } 
}
