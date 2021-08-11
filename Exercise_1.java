class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if(top < 0) {
            return true;
        }
        else {
            return false;
        }
    } 

    Stack() 
    {
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if((top+1) >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            System.out.println("Pushed "+ x +" into the stack.");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        } else {
            int n = a[top];
            top --;
            return n;
        }
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        } else {
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
