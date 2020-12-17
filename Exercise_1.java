
class Stack { 
    static final int MAX = 1000; 
    int top; 
    // Maximum size of Stack 
    int a[] = new int[MAX]; 
  
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
        top++;
        if (top == a.length) {
            return false;
        }
        //Write your code here
         a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!isEmpty())
        {
            return a[top];
        }
        return Integer.MAX_VALUE;
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
