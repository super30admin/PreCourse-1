class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

  // Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Couldn't find it on Leetcode 
// Any problem you faced while coding this : 
//1. It was challenging to push array elements upwards after pop
//2. What code is to be written in a constructor?
//3. Dealing with Ambiguity


// Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    boolean isEmpty() 
    { 
        //Write your code here
        return this.top == -1; 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX-1) {
            return false;
        }
        top++;
        a[top] = x;
        return true;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } 
        else {
            //popping last element in stack
            int output = a[top];
            top--;
            return output;
        }
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
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
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    } 
}
