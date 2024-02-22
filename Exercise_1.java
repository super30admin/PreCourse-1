// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)
// Space complexity: O(n)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    //O(1) 
    boolean isEmpty() 
    { 
        //Write your code here

        return (top < 0);
        // Stack is empty when our variable top is empty 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1; 
        // When top is -1 which means initializing empty stack 

    } 
    //O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top >= (MAX - 1)) {
            return false;
        } 
        else {
            // Increment top and insert the element
            a[++top] = x;
            return true; }
        //Write your code here
    } 
    //O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow"); // Display error message
            return 0; // Return 0 indicating failure to pop
        } else {
            int x = a[top--]; // Retrieve the top element and decrement top
            return x; // Return the popped element
        }
        //Write your code here
    } 
    //O(1)
    int peek() 
    { 
        //Write your code here
        if (top < 0) {
            System.out.println("Stack is Empty"); 
            return 0; // Return 0 indicating stack is empty
        } else {
            int x = a[top]; // Retrieve the top element
            return x; // Return the top element
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

