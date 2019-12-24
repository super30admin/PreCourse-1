class Stack { 

    static final int MAX = 1000;

    int top;
    int a[]; // Maximum size of Stack
  
    boolean isEmpty() 
    { 

        if(top==-1)
            return true;

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        a = new int[MAX];

        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 >= MAX)
            return false;

        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    {
        if(top > -1){
            return a[top];
        }
        else{
            System.out.println("Stack is Empty.Nothing to peek");
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
        s.push(40);

        System.out.println("Is stack empty ?"+s.isEmpty());

        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");

        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");

        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");

        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");

        System.out.println("Is stack empty ?"+s.isEmpty());
    } 
}
