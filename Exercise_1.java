class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a [] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        return (top == -1);
		    
    } 

    Stack() 
    { 

        top = -1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top< MAX){
            a[++top] = x;
            return true;
        }
        else{
            System.out.println("Stack Overflow ");
            return false;
        }
        //Write your code here
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println(" Stack Underflow");
            return -1;
        }
        else{
            return a[top--];
        }
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args ) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
