class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1)
            return true;
        else
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;

    } 
  
    boolean push(int x) 
    {
        boolean result = false;
        if(top +1 < MAX){
            a[++top]= x;
            result = true;
        }else{
            System.out.println("Stack Overflow.");
        }
        //Check for stack Overflow
        //Write your code here
        return result;
    } 
  
    int pop() 
    {
        int result = 0;
        //If empty return 0 and print " Stack Underflow"
        if(!isEmpty()){
            result = a[top--];
        }else{
            System.out.println("Stack Underflow.");
        }

        return result;
        //Write your code here
    } 
  
    int peek() 
    {
        if(!isEmpty()){
            return a[top];
        }else{
            System.out.println("Stack emptry");
            return 0;
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
