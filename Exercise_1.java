class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    // Time Complexity : O(1) for all methods
    // Space Complexity : O(n) where n is the size of array/stack
    // Any problem you faced while coding this : None
    static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack
  
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
        if(top+1 == MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            top += 1;
            a[top] = x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;

        }
        else{
            int popped_element = a[top];
            top -= 1;
            return popped_element;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {
        if(top == 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return a[top];
        }
        //Write your code here
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args)
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
