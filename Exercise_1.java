// Time Complexity : 
/*
Pop() - O(1)
Push() - O(1)
IsEmpty() - O(1)
Peek() - O(1) 
*/
// Space Complexity : O(1) Space
// Did this code successfully run on Leetcode : Yes, ran it using LeetCode Playground
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Check for top value
        if(top == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;

    } 

    Stack() 
    { 
        //Initializing constructor : Making Top value -1 in the beginning
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Checking for stack Overflow

        if(top == a.length -1){
            System.out.println("Stack overflow");
            return false;
        }
        a[++top]=x;
        return true;
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
        // Return the top of the element
        if(top == -1)
            System.out.println("Stack is Empty");
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.isEmpty();
        s.push(10); 
        s.push(20); 
        System.out.println( s.peek()+ "Top of stack");
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
/* Output
 * 
 * Stack is Empty
 * 20Top of stack
 * 30 Popped from stack
 */