class Stack {

    // Time Complexity : O(1)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : 12/18 test cases passed, the test with inputs ["MyStack","empty"] failed
    // Any problem you faced while coding this : No but I did not understand why the Leetcode test case failed
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        // If a is empty, return true
        return a.length == 0;
    } 

    Stack() 
    {
        // Initialize the top of the stack to be -1
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX -1 ){
            System.out.println("Stack overflow");
            return false;
        }
        else {
            top++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            return 0;
        }
        else{
            return a[top];
        }
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
