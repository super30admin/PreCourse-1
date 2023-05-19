// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : N/a
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       //Write your code here 
         //  if the top is -1 the stack is empty
        if (top==-1){
            return true;}
        else{
            return false;}
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //initialize by setting top = -1
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
         
        // checking for overflow
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false; } 
            else {
            // Increment top and add the element to the stack
            a[++top] = x;
            return true; }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;}
    else{
       // pop method will return the last emement and also remove it
        int removedElement = a[top];
        top=top-1;
        return removedElement;}
    
    } 
  
    int peek() 
    { 
        //Write your code here
        // return 0 if the stack is empty
        if (isEmpty()){
             return 0;}
    else{
       // peek method will return the last emement and NOT remove it
        int removedElement = a[top];
       
        return removedElement;
    
    } 
} }
  
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
