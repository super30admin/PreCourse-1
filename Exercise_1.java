/*
Time Complexity : O(1) since everything is done in constant amount of operation irrespective of size
Space Complexity : O(n) since we create memory when stack in initialized

Did this code successfully run on Leetcode :
Finished in 104 ms
40 Peeked from stack
40 Popped from stack
30 Popped from stack
20 Popped from stack
10 Popped from stack
Stack Underflow
0 Peeked from stack

Any problem you faced while coding this :
Renamed the class due to Leetcode giving compiling issues due to Conflict with java.util.Stack class.

Your code here along with comments explaining your approach :
Straight forward approach.
*/
class StackUsingArray { 
    private static final int MAX = 1000; 
    private int top; 
    private int []a;
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    StackUsingArray() 
    { 
        this.a = new int[MAX]; // Maximum size of Stack 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top+1<MAX){
            a[++top] = x;
            return true;
        }
        System.out.println("Stack Overflow");
        return false;

    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    {
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackUsingArray s = new StackUsingArray(); 
        System.out.println(s.peek() + " Peeked from stack"); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(40); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack"); 
        
    } 
}
