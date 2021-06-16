//Time Complexity:O(1)
//Space Complexity:O(n)
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1) return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top!=MAX){
            top++;
            a[top]=x;
            return true;
        }
        System.out.println("Stack Overflow");
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int m= a[top];
        top--;
        return m;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return a[top];
    } 
}
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
         System.out.println(s.pop() + " Popped from stack");
         s.pop();
         s.pop();
         s.pop();
    }
}
  
