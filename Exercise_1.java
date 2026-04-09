    // Time Complexity : push, pop and peek operations --> O(1)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode :
    // Any problem you faced while coding this :

class Stack { 


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1; //return true if stack is empty
    } 

    Stack() 
    { 
        top = -1;//Initialize your constructor 
    } 
  
    boolean push(int x) //time: O(1), space: O(1)
    { 
        if(top == MAX-1) //top reached last index indicating stack overflow
            return false; 
        a[++top] = x; //increment the top and then store x
        return true;
    } 
  
    int pop() //time: O(1), space: O(1)
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1)
            {
            System.out.println("Stack Underflow"); //if stack empty, returns 0
            return 0;
            }

        return a[top--]; //returns the top of the stack then decrements top
    } 
  
    int peek() //time: O(1), space: O(1)
    { 
        //Write your code here
        if(top == -1)
            return -1;
        return a[top]; //same as pop but top isn't decremented
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
