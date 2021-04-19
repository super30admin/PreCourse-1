class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top<=0)
        {
            return true;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX-1){
            system.out.println("Stack Overflow";)
        }
        //Write your code here
        else{
            a[top++]=x;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<=0){
            system.out.println("Stack Underflow")
        }
        //Write your code here
        else{
            a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<=0){
            system.out.println("Stack Underflow")
        }
        else{
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
