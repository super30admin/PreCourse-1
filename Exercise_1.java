class Stack { 
    //Please read sample.java file before starting.
    // Time Complexity: O(1) for all operations
    // Space Complexity: O(n) where n is the size of the stack
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
          top = -1;
    } 
  
    boolean push(int x) 
    {       
        if (top < MAX - 1) {
            a[++top] = x;
            return true;
        }

        System.out.println("Stack Overflow");
            return false;
    } 
  
    int pop() 
    {
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1 ;
        }

        return a[top--];
    } 
  
    int peek() 
    {
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
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
        System.out.println(s.pop() + " Popped from stack"); 
        s.pop();
        System.out.println(s.peek() + "Peeked");
        s.pop();
        System.out.println(s.peek());
    } 
}
