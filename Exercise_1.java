class Stack {
static final int MAX = 1000; 
int top; 
int a[] = new int[MAX]; // Maximum size of Stack 

//constructor for stack class
public Stack()
{
    top = -1;
}

boolean isEmpty() 
{
    
    return top<0;
    
} 



boolean push(int x) 
{
    
    //Check for stack Overflow
    //Write your code here
    if(top>=(MAX-1)) {
        return false;
    } 
    
        a[++top] = x;
        return true;
    
} 

int pop() 
{
     if (top < 0) {
         return 0;
     }
   
         int x = a[top--];
         return x;
     
    //If empty return 0 and print " Stack Underflow"
    //Write your code here
} 

int peek() 
{
    if (top < 0) {
        System.out.println("Stack Underflow");
        return 0;
    }
    
        int x = a[top];
        return x;
    

    //Write your code here
} 
}

public class Main {
    public static void main(String[] args) {
          Stack s = new Stack(); 
            s.push(10); 
            s.push(20); 
            s.push(30); 
            System.out.println(s.pop() + " Popped from stack"); 
    }

}
