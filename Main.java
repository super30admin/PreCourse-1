// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : This is not a Leetcode problem
// Any problem you faced while coding this : No

class Stack { 
  
    static final int MAX = 1000; // Maximum size of Stack i.e., in this case the length of the array
    int top; 
    int a[] = new int[MAX]; // Initializing an array of size 1000 
  
    boolean isEmpty() 
    { 
        //If top is -1 then return true else return false to indicate that the stack is empty
        return top == -1;
    } 
    
    // Default Constructor to initialize the stack
    /* Here we are initializing the top variable to -1 and creating an array of size MAX 
       every time an object of stack class is instantiated*/

    Stack() 
    { 
        top=-1;
        a = new int[MAX]; //Initialize your constructor 
    } 
    
    // Function to add an item to stack using array
    /* Every time a new element is added to the stack/array by calling the push method 
       the top variable is incremented by 1 and the element is added to the array at that index*/
    /* If the stack is full i.e., if the value of top variable exceeds maximum array index then it returns
        false and prints out the message called "stack overflow" */
    // If the stack is not full then it adds the element to the stack and returns true
    boolean push(int x) 
    { 
        //If stack is full return false and print "Stack Overflow"
        //Write your code here
        //Otherwise add x to the stack and return true
        if(top>=MAX-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
    a[++top]=x;
    return true;
    } 
    // Function to pop an item from stack using array (LIFO)
    // Every time an element is popped from the stack  the top variable is decremented by 1
    // The decrement operation occurs only after the stack is empty
    /* If the stack gets empty i.e., if the value of top variable is -1 then it returns 0
     and prints "Stack Underflow" */
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if(top<0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
    // Function to return the top element of stack without removing it
    // If the stack is empty i.e., if the value of top variable is -1 then it returns 0
  
    int peek() 
    { 
        //Write your code here
         if (top < 0) { 
            System.out.println("Stack is Empty"); 
            return 0; 
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
