// Time Complexity: O(1) for all operations
// Space Complexity: O(1) since constant space is needed

import java.util.EmptyStackException;

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        // Check if array is initialised and if yes, check if the top pointer is pointing to a valid element.
        if(a == null || top < 0) {
            return true;
        }

        return false;
    } 

    Stack() 
    { 
        // Set top pointer to invalid value unless a value is stored on the stack to determine whether stack is empty or not.
        // Initialise the stack
        top = -1;
        a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        // Check if array has enough space to store new element by checking position of top pointer. Return false if space not available.
        // Store new value if space is available and return true
        if(top != a.length-1 && top != a.length) {
            a[top++] = x;
            return true;
        }

        return false;
    } 
  
    int pop() 
    { 
        // if top pointer is at invalid position, throw an exception. Else fetch the value pointed by top pointer and return it. Decrement the top pointer.
        if(top < 0) {
            throw new EmptyStackException();
        }

        int result = a[top];
        top--;
        return result;
    } 
  
    int peek() 
    { 
        // if top pointer is at invalid position, throw an exception. Else fetch the value pointed by top pointer and return it.
        if(top < 0) {
            throw new EmptyStackException();
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
