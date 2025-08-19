// Time Complexity: O(1) for push, pop, and peek operations
// Space Complexity: O(n) where n is the number of elements in the stack

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top < 0; // If top is less than 0, stack is empty
    } 

    Stack() 
    { 
        top = -1; // Initialize top to -1 indicating stack is empty
    } 
  
    boolean push(int x) 
    { 
        if(top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false; // Stack is full
        }


        top ++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int poppedValue = a[top];
        top--; // Decrease the top index
        return poppedValue; // Return the popped value
    } 
  
    int peek() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top]; // Return the top element without removing it
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
