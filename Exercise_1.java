class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here  
        return top < 0;
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
        if(top >= (MAX - 1))
            return false;
        else
            a[++top] = x;

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }

        int data = 0;
        data = a[top];
        a[top--] = 0;

        return data;
    } 
  
    int peek() 
    { 
        //Write your code here
        return isEmpty() ? top : a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.isEmpty()); 
    } 
}
