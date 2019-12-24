/*Exercise_1 : Implement Stack using Array.
*/

// Time Complexity : push takes O(1), peek takes O(1) and pop takes O(1)
// Space Complexity : doesn't have to save pointers so O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Space complexity- better than linkedlist
//Approach: Stack follows LIFO(Last in first out order)
//it contains following operations:
//a. push- adds an item in stack(condition-stack is full-Stack overflow)
//b. pop-removes item from stack(condition-stack is empty-Stack underflow)
//c. peek- returning top element of stack
//d. isEmpty- return true if stack is empty else false

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Checking for stack Overflow
        if(top >= MAX - 1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[top++] = x;
            System.out.printl(x);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
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
