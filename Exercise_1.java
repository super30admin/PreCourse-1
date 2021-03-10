class Stack { 
    static final int MAX = 4; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return (top < 0);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top < a.length-1) {
            a[++top] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
            int value = a[top--];
            return value;
    } 
  
    int peek() 
    {
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
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
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}
