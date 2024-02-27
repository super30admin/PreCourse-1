class Stack { 
  
    /*1. Time complexity:
     * isEmpty(), push(), pop(), peek() -> all O(1)
     *2. Space complexity:
     * O(1) because no extra space used besides main array
     */
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
        if(top == MAX) {
            throw new java.lang.RuntimeException("Stack Overflow");
        }
        a[top] = x;
        top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0) {
            throw new java.lang.RuntimeException("Stack Underflow");
        }
        top--;
        return a[top];
    } 
  
    int peek() 
    {   
        //Write your code here
        if(top == 0) {
            throw new java.lang.RuntimeException("Stack is empty!");
        }
        return a[top - 1];
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
