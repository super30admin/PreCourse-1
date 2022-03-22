
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = 0;
    int a[] = new int[MAX]; // Maximum size of Stack
  
    boolean isEmpty() 
    {
        if (top == 0) {
            return true;
        }
        return false;
        //Write your code here 
    } 

    Stack() 
    {

        //Initialize your constructor 
    } 
  
    boolean push(int x)
    {
        if (top < MAX - 1 ) {
            a[top + 1] = x;
            top = top + 1;
            return true;
            //Check for stack Overflow
            //Write your code here
        }
        else {
            System.out.println("stack overflow");
            return false;
        }
    } 
  
    int pop() 
    {
        if ( top == 0 ) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            a[top] = 00;
            return 1;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {

        return 0;
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
