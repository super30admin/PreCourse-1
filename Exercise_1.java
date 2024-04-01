// Time Complexity : Best case O(1) and Worst case O(N)
// Space Complexity : O(N) where N is the size of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //if top is -1 then no elements
        return (top == -1);
    } 

    Stack() 
    { 
        //initializing top to -1 (means array is empty) as arrays index starts from 0
        top = -1;
    }

    // Time Complexity : Best case O(1) and Worst case O(N)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        // if top reaches array length then Stack is full. Printing error message and returning false
        if(top == MAX -1) {
            System.out.println("Stack Overflow");
            return false;
        }else {
            // Incrementing the array index which is top
            top++;
            // and inserting given element in the top of the stack
            a[top] = x;
        }
        return true;
    }

    // Time Complexity : Best case O(1) and Worst case O(N)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // returning the top element and decrementing the index of the array
        return a[top--];
    }

    // Time Complexity : O(1)
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is Empty");
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
        System.out.println(s.peek());
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
