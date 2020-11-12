class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top ==0);
    } 

    Stack() 
    { 
       top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	
        if (top >= MAX-1)
        {
            return false;
        }
        top ++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top ==-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        if (top == -1)
        {
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
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}
