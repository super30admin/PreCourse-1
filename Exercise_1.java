// Time Complexity : O(1)
// Space Complexity : O(N)

// Your code here along with comments explaining your approach

public class MyStack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1) 
            return true;
        return false; 
    } 

    MyStack() 
    { 
        //Initialize your constructor
        a = new int[MAX];
        top = -1; // Index out of bound (lower)
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == MAX) {
            System.out.println("Stack Overflow! Cannot push element as the stack is full.");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop element as the stack is empty.");
            return 0;
        } else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        return a[top];
    } 
    
  // Driver code 
   public static void main(String args[]) 
    { 
        MyStack s = new MyStack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
