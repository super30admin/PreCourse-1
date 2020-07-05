class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1);
        //Write your code here 
    } 

    Stack() 
    { 
        this.top = -1;
         //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (MAX-1 != top)
        {
            a[++top] = x;
            System.out.println("Element pushed" + x);
        }
        else
        {
            System.out.println("Stack is full: Overflow\n");
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(!isEmpty())
        {
            int value = a[top];
            top --;
            System.out.println("Element Popped" + value);
            return value;
        }
        else
        {
            System.out.println("Stack underflow\n");
            return -1;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        return a[top];
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
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
