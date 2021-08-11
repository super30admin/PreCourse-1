// Time Complexity : In case of arrays we have direct access to top index on which we are pushing popping and peeking
// Push: O(1); Pop: O(1); Peek: O(1); a search operation however will require O(n) as we have to traverse whole array to search specific element.
// Space Complexity : Here a limit of 1000 elements can stay in stack so array of 1000 fields is created, it is O(n).
// Did this code successfully run on Leetcode : NA, this was not a leetcode question.
// Any problem you faced while coding this : No problems faced for this exercise. Tried additional test cases.


// Your code here along with comments explaining your approach

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
// To check if stack is empty we just checked if pointer is still on position -1.
    boolean isEmpty() 
    { 
        // Implicitly checks if top points to -1 and return a true or false value
        return top == -1;
    } 

// Assigned the top pointer a value of -1 which is not existing index on array.
    Stack() 
    { 
        // As max capacity and array is already initialized in class we are only initializing top pointer of Stack
        top=-1;
    } 

// To add elements to stack it can only be done on top pointer, so incremented pointer before assigning the value so that it starts from 0th index. 
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(!isFull()) {
            // Increment the pointer from null position to 0th position to add new value
            a[++top] = x;
            return true;
        } else {
            // Throw an exception in case the stack is full and we can not add new elements
            throw new RuntimeException("The stack is full");
        }
    } 
  
// To remove an element from the stack, it being LIFO we can only remove from the top, returned the value at last index and decreased the index top by 1.
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            return 0;
        } else {
            // return the element at top and change the top pointer position to one below
            return a[top--];
        }
    } 
  
// To peek, no removal is required, returned array element at top pointer.
    int peek() 
    { 
        // Throw an error in case there is nothing to peek else return top element
        if(isEmpty()) {
            throw new RuntimeException("No element found to peek");
        }
        return a[top];
    } 

// Additionally created isFull and toString methods to check if stack is overflowing and get value of stack
    public boolean isFull() {
        // Implicitly checks if top points to Max and return a true or false value
        return top == MAX-1;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append("[ ");
        for(int i: a) {
            sb.append(i + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30);
        System.out.println(s.isEmpty());
        //System.out.println(s.toString());
        System.out.println(s.peek());
        s.push(40);
        s.push(50);
        System.out.println(s.isFull());
        //s.push(60);
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(60);
        System.out.println(s.peek());
        // System.out.println(s.toString());
    } 
}
