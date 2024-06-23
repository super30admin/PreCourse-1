class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top == -1) {
            return true;
        }

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
        if (top < MAX) {
            top++;
            a[top] = x;
            // System.out.println(a);
            return true;
        } else {
            System.out.println("Stack Overflow.");
            return false;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if (top >= 0) {
            int x = a[top];
            top--;
            // System.out.println(a);
            return x;
        } else {
            System.out.println("Stack Underflow.");
            return -1;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top >= 0) {
            return a[top];
        }
        return -1;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty()); 
        s.push(20); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty()); 
        s.push(30); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek());
        System.out.println(s.isEmpty());  
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek()); 
        System.out.println(s.isEmpty()); 

    } 
}
