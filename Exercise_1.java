class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);//Write your code here 
    } 

    Stack() 
    { 
       top=-1; //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
     if(top>MAX-1) {
         System.out.println("Stack overflow");
         return false;
     }else{
         a[++top]=x;
         return true;
     }  
    } 
  
    int pop() 
    { 
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return a[top--];
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if(top<0){
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
