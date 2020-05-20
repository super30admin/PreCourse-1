class Stack { 
    static final int MAX = 2; 
     // Maximum size of Stack 
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() 
    { 
        //Write your code here 
        if (top < 0){
            return true;
        }else{
            return false;
        }
        // return true if top < 0 else false ;
    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
        // System.out.print("Stack initialized");
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        // System.out.println("top"+top);
        if (top >=(MAX-1)){
            System.out.println("Stack is Full, Pop Some Items to add");
            return false;
        }
        else{
            a[++top]=x;
            // System.out.println(x +" is Pushed in Stack");
            // System.out.println("top After"+top);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Overflow");
            return 0;
        }
        else{
            // int current_top = peek()
            int poped = a[top--];
            System.out.println("Popped Item "+poped );
            return poped;
        }
    } 
  
    int peek() 
    {   
        if (isEmpty()){
            return 0;
        }else{
            return a[top];
        }
        
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
