class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);
        //Write your code here 
    } 

    Stack() 
    { 
        top=-1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
         //Write your code here
        else{
            a[++top]=x;
            System.out.println(x+" pushed into stack");
        return true; }   
    } 

    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0; 
        }
         //Write your code here
        else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
         //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return a[top];
        }
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
