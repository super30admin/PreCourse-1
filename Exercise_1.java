class Stack {

    // Time Complexity : O(1), insertion and retrieval is constant time
    // Space Complexity : O(n), where "n" is size of an array
    // Did this code successfully run on Leetcode : Yes (225. Implement Stack using Queues)
    // Any problem you faced while coding this : No

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; // empty array
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top > 1000){
            System.out.println("Throwing StackOverflowException");
            return false;
        }
        //Write your code here
        top++; // increment top so we have to nextToInsert in pointer ready
        a[top] = x; // push integer x at top

        return true; // return true as insertion to array is successful
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow, cannot pop as stack is empty");
            return -1; // Assuming we will be inserting all +ve numbers, returning -1 means stack underflow
        }
        //Write your code here
        int lastElement = a[top]; // save last element to temp variable
        top--; // top = top-1
        return lastElement; // return temp variable
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top]; // return last element
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
        // Adding more testcase scenarios
        s.push(100);
        s.push(200);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack"); // should print "Stack Underflow"
    }
}
