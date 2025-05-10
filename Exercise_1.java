// Time Complexity:
// push()     => O(1)
// pop()      => O(1)
// peek()     => O(1)
// isEmpty()  => O(1)

// Space Complexity:
// O(n), where n is the size of the array (MAX = 1000 in this case)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return (top < 0); // returns true when stack is empty.
    } 

    Stack() 
    {
        top = -1; // Stack is empty when top is -1.
    } 
  
    boolean push(int x) 
    {
        if (top >= (MAX - 1)){
            System.out.println("Stack Overflow"); // if top is greater or equal to max size of stack then return false.
            return false;
        } else {
            a[++top] = x; // else place x as top of the stack.
            return true;
        }
    } 
  
    int pop() 
    {
        if (isEmpty()){
            System.out.println("Stack Underflow"); // return 0 if the stack is empty since there are no elements to pop.
            return 0;
        }    else {
            return a[top--]; // else return the popped top element of the stack.
        }
    } 
  
    int peek() 
    {
        if (isEmpty()){
            System.out.println("Stack is Empty"); // if the stack is empty, then there is no element to peek so return 0.
            return 0;
        } else {
            return a[top]; // else return top element of the stack.
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
