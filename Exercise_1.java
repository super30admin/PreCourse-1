package precourse1;

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; 
    // Maximum size of Stack 
   
  
    boolean isEmpty() 
    { 
        if(top<0)
        return true;
        else 
        return false;
        //Write your code here 
    } 

    Stack() 
    { top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { if(top>= MAX-1){
        System.out.println("Stack Overflow");
        return false;}
        else
       { a[++top] = x;
        System.out.println("value pushed into stack"); 
        return true;
           
       }
        
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { if(top<0){
        System.out.println("Stack underflow"); 
        return 0;}
        
    else
       { int x = a[top];
        top = top-1;
        return x;}
    
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { if(top<0){
        System.out.println("Stack underflow"); 
        return 0;
    }
    else
        
       { int x= a[top];
        return x;
        //Write your code here
    } 
} 

// Driver code 

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}