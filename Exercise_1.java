public class Exercise_1{
    static class Stack { 
        static final int MAX = 1000; 
        int top; 
        int a[] = new int[MAX]; // Maximum size of Stack 
    
        boolean isEmpty() 
        { 
            if(top < 0){
                return true;
            }
            return false;
            //Write your code here 
        } 

        Stack() 
        { 
            //Initialize your constructor 
            this.top = -1;
        } 
    
        boolean push(int x) 
        { 
            //Check for stack Overflow
            if(top < MAX-1){
                //Write your code here
                a[++top] = x;
                return true;
            }
            return false;
        } 
    
        int pop() 
        { 
            //If empty return 0 and print " Stack Underflow"
            if(top < 0){
                System.out.println("Stack is underflow");
                return 0;
            }
            //Write your code here
            return a[top];
        } 
    
        int peek() 
        { 
            //Write your code here
            if(isEmpty()){
                return 0;
            }
            else
                return a[top];
        } 
    } 
  

    public static void main(String args[]) 
    { 

        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
