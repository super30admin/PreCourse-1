/*
Time Complexity
Push Operation: O(1) - Inserting an element at the top of the stack takes constant time.
Pop Operation: O(1) - Removing the top element takes constant time.
Peek Operation: O(1) - Accessing the top element takes constant time.
isEmpty Operation: O(1) - Checking if the stack is empty takes constant time.
Space Complexity
Push Operation: O(1) - Each push operation allocates a fixed amount of space for the new element.
Pop Operation: O(1) - The space complexity is constant as it only involves removing an element.
Peek Operation: O(1) - The space complexity is constant as it does not involve any space allocation.
isEmpty Operation: O(1) - The space complexity is constant as it only involves checking a condition.
*/


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() 
    { 
        top = -1; 
    } 

    boolean isEmpty() 
    { 
        return (top < 0);
    } 
  
    boolean push(int x) 
    { 
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow! Cannot push element " + x);
            return false; 
        }
        top++;
        a[top] = x; 
        System.out.println(x + " pushed to stack");
        return true; 
    } 
  
    int pop() 
    { 
        if (top < 0) {
            System.out.println("Stack Underflow! Cannot pop from empty stack");
            return 0; 
        }
        int poppedElement = a[top];
        top--; 
        return poppedElement;
    } 
  
    int peek() 
    { 
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0; 
        }
        return a[top]; 
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
