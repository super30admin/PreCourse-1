class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       return (top<0); 
    } 

    Stack() 
    { 
        top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=(Max-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+ "pushed into stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;}
        
        
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
