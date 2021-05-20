class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top < 0) {
            System.out.println("Stack is Empty");
            return true;
        } else {
            return false;
        }
    }

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top > (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            top ++;
            a[top] = x;
            System.out.println(x + " is pushed into the stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            top--;
            int x = a[top];
            System.out.println(x + " is poped out of the stack");
            return x;
        }
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            System.out.println("Top element of the stack is " + x);
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
