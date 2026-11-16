// Time Complexity: O(1) for push, pop, peek, and isEmpty
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : No - compiled and ran locally
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int[] a; // Maximum size of Stack
  
    boolean isEmpty() {
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        a = new int[MAX];
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX -1){
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int value = a[top];
        top--;

        return value;
    } 
  
    int peek() 
    {
        if(isEmpty()){
            return 0;
        }
        return a[top];
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
