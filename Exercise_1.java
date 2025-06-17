// Time Complexity : O(1)
// Space Complexity : O(1) - Maximum size of Stack 
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0;
    } 

    Stack() 
    {
        a = new int[MAX];
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[top] = x;
        top++;

        return true;

    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } 
        return a[--top];
        
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
            return 0;
        }

        return a[top-1];
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        System.out.println("hello");
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
