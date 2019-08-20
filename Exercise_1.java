class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0;
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top < MAX - 1) {
            a[++top] = x;
            return true;
        } else {
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print "Stack Underflow"
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int element = a[top--];
            return element;
        }
    } 
  
    int peek() 
    { 
        if (top >= 0) 
            return a[top];
        return 0; // Using the Same as pop
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
