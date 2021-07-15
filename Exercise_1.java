class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of stack
   int size;
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(size == 0){
            return true;
        } 
        return false;
    } 
    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
        size = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
         if(size == MAX){
            return false;
        } else {
            top++;
            a[top] = x;
            size++;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0 ){
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int x = a[top];
            top--;
            size--;
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
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
