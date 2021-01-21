class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    { 
        if (top == -1) {
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
        if (top == MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        top = top + 1;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int poppedElement = a[top];
            top = top - 1;
            return poppedElement;
        }
    } 
  
    int peek() 
    { 
        if(top > -1 && top < MAX) {
            return a[top];
        } else {
            return -1;
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
