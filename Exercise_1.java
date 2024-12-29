// STACK IMPLEMENTATION WITH ARRAY IN JAVA
// Author: Swabhi Papneja
// Time Complexity: O(1)
// Space Complexity: O(MAX)
// Dis this code run successfully in Leetcode: NA
// Approach Explaination: 
// - I used a top variable pinting to the last added element in the array. 
// - Using this top element I am checking for Stack Overflow and Underflow.
// - For pushing a new element, I am incrementing the value of the index top, and then adding a the element on the new index value of top.
// - For popping the top element, I am decrementing the value of top and returning the value of the deleted element.
// - Using display function to display all the elements in the Stack.


class Stack { 
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    
    static final int MAX = 1000; 
    int top; 
    int stackArray[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        // Write your code here 
        if (top == -1)
            return true;
        return false;
    } 

    Stack() 
    { 
        // Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        // Check for stack Overflow
        if(top == MAX - 1){
            // stack is full
            System.out.println("Stack Overflow");
            return false;
        }
        // Write your code here
        top++;
        stackArray[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        // If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            // stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        // Write your code here
        int removedElement = stackArray[top]; // returning the element being popped
        top--;
        return removedElement;

    } 
  
    int peek() 
    { 
        // Write your code here
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    void display() {
        if(!isEmpty()){
            for(int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
        else
            System.out.println("Stack is Empty");
        
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20);
        s.push(30);
        s.peek(); 
        s.display();
        System.out.println(s.pop() + " Popped from stack");
        s.display();
        
    } 
}
