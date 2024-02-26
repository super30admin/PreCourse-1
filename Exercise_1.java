class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int start;
    int end;
    boolean isEmpty() 
    {
        if (end == 0)
            return true;
        else
            return false;
    }

    Stack() 
    {
        //Initialize your constructor
        start = 0;
        end = 0;

    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        if (end == MAX) {
            return false;
        }
        a[end] = x;
        end++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--end];
    } 
  
    int peek() 
    {
        return a[end-1];
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
        s.push(40);
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println(s.pop() + " Popped from stack");
        s.push(60);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
    } 
}
