// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top == MAX - 1){     
            return true;
        }

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1; // to get the 0th element when the first element is pushed into the array.

    } 
  
    boolean push(int x) 
    { 
        
        //Write your code here

        if (top == MAX-1){  //Check for stack Overflow
            return false;
        }
        a[++top] = x;     // push element x into the stack
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty() == true){
            System.out.println("Stack Underflow");
        }
        return a[top--];  // returns the item at the top of the stack,pop() modifies the stack and removes the top element.
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty() == true){
            System.out.println("Empty Stack");
        }

        return a[top]; // returns the top element.

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
