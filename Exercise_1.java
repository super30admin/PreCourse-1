// Implement Stack using Array.

/* Time Complexity : 

O(1) -> For each method push, pop, peek. Since it is happeing on the top of the stack

*/

/* Space Complexity : 

O(N) where N is constant and equal to 1000. So can we call it O(1) ?

*/ 

// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[];
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (this.top == 0)
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.a = new int[MAX]; // Maximum size of Stack 
        this.top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(this.top == MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        a[this.top] = x;
        this.top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int val = a[this.top-1];
        a[this.top-1] = 0;
        this.top--;
        return val;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[this.top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.pop();
        s.push(10); 
        s.push(20); 
        System.out.println("Peeked : " + s.peek());
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
