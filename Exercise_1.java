/**
     * Time Complexity: O(1) for push, pop and peek
     * Space Complexity: O(n) as the stack grows
     * Author: Shubhangi Srivastava
**/
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
      top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX){
            System.out.println("Stack Overflow!!");
            return true;
        }
        top++;
        a[top] = x;
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top <= -1){
            System.out.println("Stack Underflow!!");
            return 0;
        }
        top--;
        return a[top+1];
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
    } 
}
