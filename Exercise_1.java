class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
     // since we are just checking a condition and returning a boolean value
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
        a = new int[MAX];
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // since we are tracking the top of the stack and pushing the element to the top, array operations are constant time
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    if (top == MAX - 1) {
        System.out.println("Stack Overflow");
        return false;
    }
    a[++top] = x;
    return true;
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // since we are tracking the top of the stack and popping the element from the top, array operations are constant time
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            return 0;
        }
        return a[top--];
    } 
  // Time Complexity: O(1)
  // Space Complexity: O(1)
  // since we are tracking the top of the stack and returning the element from the top, array operations are constant time
    int peek() 
    { 
        //Write your code here
        if (isEmpty()) {
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
