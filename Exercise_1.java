/**
 * Time complexity is O(1) for push(), pop(), peek(), and isEmpty()
 * Space complexity is O(n) where n = MAX = 1000
 */

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        System.out.println("Pushed " + x + " to the stack");
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        int poppedElement = a[top--];
        System.out.println("Popped " + poppedElement + " from the stack");
        return poppedElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        
        int topElement = a[top];
        System.out.println("Stack top: " + topElement);
        return topElement;
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
