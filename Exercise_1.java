class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1) {
          return true;
        } 
        return false;
    } 

    Stack() 
    { 
       top = -1;  
    } 
  
    boolean push(int x) 
    { 
         //Check for stack Overflow
         if( top > MAX ){
           System.out.println("Stack is full. You cannot add more values.");
           return false;
         } 
         else {
         a[++top] = x;
         System.out.println("Pushed element" +x);
         return true; 
         }          
    } 
  
    int pop() 
    { 
         //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
          System.out.println("Stack Underflow. Stack is empty.");
          return 0;
        } 
        else {
          int topElement = a[top];
          top --;
          return topElement;
        }
    } 
  
    int peek() 
    { 
       if(!isEmpty()) {
       return a[top];
       }
       return 0;
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
