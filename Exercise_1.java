class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        
        if(top < MAX){
	    top++;
            a[top] = x;
            return true;
        }else{
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"

        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int popElement = a[top];
            top--;
            return popElement;
        }
    } 
  
    int peek() 
    { 
        if(top < 0){
            System.out.println("Stack empty");
            return 0;
        }else{
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
