// Time Complexity : O(1) for all operations
// Space Complexity : O(N) where N is the number of elements in the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// we will initialize the top to -1 i.e no element present when ever we add an element 
// we will increment the top and add the element at that position. 
// to remove an element we will return the element at top and decrement the top.
// peek will return the element at top without removing it.



class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
            return true;
        else
            return false;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top>=MAX-1)
        {
            System.out.println("Stack Overflow");
            return false; // Stack is full
        }
        a[++top]=x;
        return true;
    } 
  
    int pop() 
    { 
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1; 
        }
        return a[top--]; 
    } 
  
    int peek() 
    { 
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
