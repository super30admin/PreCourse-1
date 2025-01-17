// Time Complexity : Push, Pop, Peek : O(1) - constant time.
// Space Complexity : O(n) - To store n stack elements.
// Did this code successfully run on Leetcode : Did not find the problem on leetcode.
// Any problem you faced while coding this : No.

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() //If top is -1 then stack is empty.
    { 
        //Write your code here
        if(top == -1)
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
    } 
  
    boolean push(int x) //If top reaches the last index of the stack, that means stack is full. Else increment top and add element at top.
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == a.length-1){
            System.out.println("Stack overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() //If stack is empty return no element (-1), else return the element present at top and decrement top.
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int ret = a[top];
        top--;
        return ret;
    } 
  
    int peek() //If stack is empty return no element (-1), else return the element present at top.
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
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
