class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top == -1) {
            System.out.println("Stack is empty! :( ");
            return true;
        }
        System.out.println("Stack not empty!");
        return false;
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
        if (top <= MAX-1) {
            a[++top] = x;
            return false;
        }
        System.out.println("Stack Overflow.");
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top <= -1) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top <= -1) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 

        s.push(90);
        s.push(100);
        System.out.println(s.peek() + " -- Peek operation");
        System.out.println("Is stack empty? ----> " + s.isEmpty()); 
        System.out.println(); 
        System.out.println(s.pop() + " -- Pop from stack"); 
        System.out.println("Is stack empty? ----> " + s.isEmpty()); 
        System.out.println(); 
        System.out.println(s.pop() + " -- Pop from stack"); 
        System.out.println("Is stack empty? ----> " + s.isEmpty()); 
        System.out.println(); 
        System.out.println(s.peek() + " -- Tried peeking an empty stack here"); 
    } 
}
