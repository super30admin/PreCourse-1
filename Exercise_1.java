class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        //If top is -1, no items in the stack.
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 

        //Top indicates the upper most element in the stack
        //Initially, top will be at -1. 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 >= MAX){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top = top+1;
            a[top+1] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int topElement = a[top];
            top = top-1;
            return topElement;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return a[top];
        }
        //Write your code here
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
