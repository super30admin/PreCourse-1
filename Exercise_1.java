class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

        if(a.length > top){
            a[top] = x;
            top++;
        } else {
            System.out.println("Stack has reached it's maximum capacity");
            return false;
        }

        return true;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top != 0){
            int x= a[top-1];
            a[top-1] = 0;
            top--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    {
        //Write your code here
        return top == 0 ? 0 : a[top-1];
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