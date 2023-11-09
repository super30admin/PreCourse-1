// Time Complexity : push operation O(1), pop operation O(1), peek operation O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : no


class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        //top will keep track of the index of the stack.
        //it's initial position is -1, hence when no element in stack
        //When an item will insert it will increment by 1
        return(top == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX-1) {
            System.out.println("Overflow");
            return false;
        }
        else {
            //increment top by 1 & insert the element
            ++top;
            a[top] = x;
            //System.out.println(x + " pushed into stack at place " + top);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1) {
            System.out.println("Underflow");
            return 0;
        }
        else {
            int y = a[top];
            top--;
            return y;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1) {
            System.out.println("Underflow");
            return 0; //followed the instruction of pop()- If empty return 0 and print " Stack Underflow"
        }
        else
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
