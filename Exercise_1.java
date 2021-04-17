class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top < 0){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top > 100) {
            System.out.println("Stack Overflow!");
            return false;
        }
        else{
            top++;
            a[top] = x;
            System.out.println("Element" + x + "is pushed into the stack");
            return true;

        }
    } 
  
    int pop() 
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            System.out.println("Element" + x + "is popped from the stack");
            return x;
        }
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
            System.out.println("Stack is Empty");
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
    } 
}
