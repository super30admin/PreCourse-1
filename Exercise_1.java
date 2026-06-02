/*
 Time complexity isEmpty => O(1), push => O(1), pop => O(1)
 */


class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int size = 0;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0;
    } 

    Stack() 
    { 
        top = 0 ;
        size = 0;
    } 
  
    boolean push(int x) 
    {
        if (top >= MAX -1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[top++] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0) {
            print(" Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    {
        return a[top];
    } 
} 
  
// Driver code 
public  class Exercise_1 {
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
