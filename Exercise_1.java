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
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top < 1000){
            a[top++] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int val = a[--top];
            a[top+1] = 0;
            return val;
        }

    } 
  
    int peek() 
    {
        if(top == 0){
            System.out.println("Stack Underflow");
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
        s.push(99);
        s.push(101);
        System.out.println(s.pop() + " Popped from stack");
    } 
}
