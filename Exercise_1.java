class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
     return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX - 1){
            return false;
        }
        else{
            a[++top] = x;
            System.out.println("pushed into the stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
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
        System.out.println(s.peek()+ " peeked item");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty() + " stack is not empty");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty() + " stack is not empty");
    } 
}
