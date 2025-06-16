// Time Complexity:
// push()    - O(1), Directly insert at the top index
// pop()     - O(1), Access and remove the top element
// peek()    - O(1), Access the top element without removing
// isEmpty() - O(1), Simple comparison check

// Space Complexity:
// O(n), where n = MAX (1000 in this case)

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1; //
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; // Stack is initially empty
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false; // Stack is full
        } else {
            a[++top] = x; // Increment top and add element
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; // Stack is empty
        } else {
            return a[top--]; // Return the top element and decrement top
        }
    }

    int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return a[top];
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
