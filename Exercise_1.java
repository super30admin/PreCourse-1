class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    //stack is empty when stack size is 0.
    boolean isEmpty() 
    { 
        //Write your code here
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        /**
         * -If the pointer is at the top of stack then there is no element after that.
         * - Stack is full in this case
         */
        if (top >= (MAX-1)) {
            System.out.println("stack overflow");
            return false;
        }
        /**
         * if stack is empty then increase the pointer and push an element above that.
         */
        else {
            top++;
            a[top] = x;
            System.out.println("pushed element"+x+" into stack.");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //check if the stack is empty. If stack is empty return 0.
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        //else decrease the pointer and return the element
        else {
            top--;
            int x = a[top];
            return x;
        }
    } 

    //print or check the element stack has its pointer on.
    int peek() 
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
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
