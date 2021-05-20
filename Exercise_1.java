class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if(top<0){
            return true;
        }
        return false;
    } 

    Stack() 
    {
        top=-1;
    } 
  
    boolean push(int x) 
    {
        if(top>=MAX-1){
            System.out.println("Stack Overflow");
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
            int res=a[top];
            top--;
            return res;
        }
    } 
  
    int peek() 
    { 
       if(top<0){
           System.out.println("Stack Underflow");
           return 0;
       }else {
           int x = a[top];
           return x;
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
