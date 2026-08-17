class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (this.top == 0);
    } 

    Stack() 
    { 
        this.top = 0;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (this.top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        this.a[this.top] = x;
        this.top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (this.top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        this.top--;
        return this.a[this.top];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (this.top == 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return this.a[this.top - 1];
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
